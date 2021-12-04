package com.example.bandingkanebp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.fragment_multiguna.*
import kotlinx.android.synthetic.main.fragment_multiguna.view.*


class MultigunaFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_multiguna, container, false)

        val jangkaWaktu = resources.getStringArray(R.array.jangkaWaktu)
        val spinner = root.findViewById<Spinner>(R.id.sp_jangkaWaktu)

        spinner?.adapter = activity?.applicationContext?.let { ArrayAdapter(it, R.layout.support_simple_spinner_dropdown_item, jangkaWaktu) } as SpinnerAdapter
        spinner?.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
        override fun onNothingSelected(parent: AdapterView<*>?) {
        println("error")
        }

        override fun onItemSelected(
        parent: AdapterView<*>?,
        view: View?,
        position: Int,
        id: Long
        ) {
        val type = parent?.getItemAtPosition(position).toString()
        Toast.makeText(activity,type, Toast.LENGTH_LONG).show()
        println(type)
        }
        }
        val tenor:Int = Integer.parseInt(spinner.selectedItem.toString())


        return root
    }


}