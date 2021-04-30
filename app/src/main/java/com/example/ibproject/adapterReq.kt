package com.example.ibproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.req_list.view.*

class adapterReq (private val context: Context, private val arrayList: ArrayList<req.req>) : RecyclerView.Adapter<adapterReq.Holder>(){


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
            return Holder(LayoutInflater.from(parent.context).inflate(R.layout.req_list,parent,false))
        }

        override fun getItemCount(): Int = arrayList!!.size

        override fun onBindViewHolder(holder: Holder, position: Int) {

            holder.view.lbIdList.text = arrayList?.get(position)?.id
            holder.view.lbNameList.text = "Nama : "+arrayList?.get(position)?.nama
            holder.view.lbReqList.text = "Alamat : "+arrayList?.get(position)?.request

        }

        class Holder(val view: View) : RecyclerView.ViewHolder(view)

}