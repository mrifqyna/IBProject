package com.example.ibproject

import android.app.ProgressDialog
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONObjectRequestListener
import kotlinx.android.synthetic.main.activity_request.*
import org.json.JSONObject


class request : AppCompatActivity() {

    var arrayList = ArrayList<req>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_request)

        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(this)


    }

    override fun onResume() {
        super.onResume()
        loadAllRequest()
    }

    private fun loadAllRequest(){

        val loading = ProgressDialog(this)
        loading.setMessage("Memuat data...")
        loading.show()

        AndroidNetworking.get("https://doa-doa.000webhostapp.com/crudDoa/read.php")
                .setPriority(Priority.MEDIUM)
                .build()
                .getAsJSONObject(object : JSONObjectRequestListener {

                    override fun onResponse(response: JSONObject?) {
                        arrayList.clear()

                        val jsonArray = response?.optJSONArray("result")

                        if(jsonArray?.length() == 0){
                            loading.dismiss()
                            Toast.makeText(applicationContext,"Data barang kosong, tambahkan data terlebih dahulu",Toast.LENGTH_SHORT).show()
                        }

                        for(i in 0 until jsonArray?.length()!!){
                            val jsonObject = jsonArray?.optJSONObject(i)
                            arrayList.add(
                                    req(
                                            jsonObject.getString("id"),
                                            jsonObject.getString("nama"),
                                            jsonObject.getString("request")
                                    )
                            )

                            if(jsonArray?.length() - 1 == i){

                                loading.dismiss()
                                val adapter = adapterReq(applicationContext,arrayList)
                                adapter.notifyDataSetChanged()
                                mRecyclerView.adapter = adapter

                            }

                        }

                    }

                    override fun onError(anError: ANError?) {
                        loading.dismiss()
                        anError?.errorDetail?.toString()?.let { Log.d("ONERROR", it) }
                        Toast.makeText(applicationContext,"Connection Failure",Toast.LENGTH_SHORT).show()
                    }

                })


    }

}

