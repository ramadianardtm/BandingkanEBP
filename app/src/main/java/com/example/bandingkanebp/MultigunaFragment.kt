package com.example.bandingkanebp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.fragment_multiguna.*
import kotlinx.android.synthetic.main.fragment_multiguna.view.*
import org.w3c.dom.Text
import java.util.*
import kotlin.math.*
import kotlin.math.log


class MultigunaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        // Inflate the layout for this fragment
        val root =  inflater.inflate(R.layout.fragment_multiguna, container, false)

        //val jangkaWaktu = resources.getStringArray(R.array.jangkaWaktu)
        //val spinner = root.findViewById<Spinner>(R.id.sp_jangkaWaktu)

        //Deklarasi bank lain
        val hb = root.findViewById<EditText>(R.id.et_hargaBarang)
        val dp = root.findViewById<EditText>(R.id.et_uangMuka)
        val bl = root.findViewById<EditText>(R.id.et_biayaLain)
        val angL = root.findViewById<EditText>(R.id.et_angsuran)
        val tL = root.findViewById<EditText>(R.id.et_jangkaWaktu)
        val tbl = root.findViewById<TextView>(R.id.tv_totalBayarLain)
        val btn_banding = root.findViewById<Button>(R.id.btn_banding)

        //deklarasi muamalat
        val angS2 = root.findViewById<TextView>(R.id.tv_angsuranM)
        val tMS = root.findViewById<TextView>(R.id.tv_jangkaWaktuM)
        val TangS = root.findViewById<TextView>(R.id.tv_totalBayarM)
        val stb = root.findViewById<TextView>(R.id.tv_selisihbayar)

        //Spinner
        val option = root.findViewById<Spinner>(R.id.sp_option)
        val options = arrayOf("Payroll Financing","Partnership Payroll","Payroll Funding","Partnership Non Payroll","Reguler")
        option?.adapter = ArrayAdapter<String>(activity?.applicationContext!!,android.R.layout.simple_list_item_1,options)

        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Log.d("Position:", position.toString())

                if(position==0){
                    //Function calculation
                    btn_banding.setOnClickListener { root ->
                        val dp = dp.text.toString().toInt()
                        val bl = bl.text.toString().toInt()
                        val angL = angL.text.toString().toInt()
                        var tL = tL.text.toString().toInt()
                        val hb = hb.text.toString().toInt()
                        fun payrollFinancing12(){
                            val multiply = (dp+bl) + (angL*tL)
                            val value = multiply.toString()
                            val iM: Double = 0.145
                            val i:Int = 0
                            //Fungsi Pangkat
                            if(tL == 11||tL == 23 || tL ==35){
                                tL = tL+1
                            }
                            val Number:Double = (1+(iM/12))
                            val tLs = tL.toDouble()

                            val sum = Math.pow(Number,-tLs)
                            val tesS = sum.toString()
                            Log.d("TEs",tesS)

                            val angM1 = (hb * (iM/12) / (1-(sum)))
                            val angM1T = angM1.toInt()
                            val tBM = bl + (angM1*tL)
                            val tbMT = tBM.toInt()
                            val selisih = (multiply) - (tbMT)

                            val angM_Tv = angM1T.toString()
                            val tBM_Tv = tbMT.toString()
                            val tL2 = tL.toString()
                            val selisihEBP = selisih.toString()
                            angS2.setText("Rp. "+angM_Tv)
                            TangS.setText("Rp. "+tBM_Tv)
                            tbl.setText("Rp. "+value)
                            tMS.setText(tL2)
                            stb.setText("Rp. "+selisihEBP)
                        }
                        fun payrollFinancing24(){
                            val multiply = (dp+bl) + (angL*tL)
                            val value = multiply.toString()
                            val iM: Double = 0.16
                            val i:Int = 0
                            //Fungsi Pangkat
                            if(tL == 11||tL == 23 || tL ==35){
                                tL = tL+1
                            }
                            val Number:Double = (1+(iM/12))
                            val tLs = tL.toDouble()

                            val sum = Math.pow(Number,-tLs)
                            val tesS = sum.toString()
                            Log.d("TEs",tesS)

                            val angM1 = (hb * (iM/12) / (1-(sum)))
                            val angM1T = angM1.toInt()
                            val tBM = bl + (angM1*tL)
                            val tbMT = tBM.toInt()
                            val selisih = (multiply) - (tbMT)

                            val angM_Tv = angM1T.toString()
                            val tBM_Tv = tbMT.toString()
                            val tL2 = tL.toString()

                            val selisihEBP = selisih.toString()
                            angS2.setText("Rp. "+angM_Tv)
                            TangS.setText("Rp. "+tBM_Tv)
                            tbl.setText("Rp. "+value)
                            tMS.setText(tL2)
                            stb.setText("Rp. "+selisihEBP)
                        }
                        fun payrollFinancing36(){
                            val multiply = (dp+bl) + (angL*tL)
                            val value = multiply.toString()
                            val iM: Double = 0.16
                            val i:Int = 0
                            //Fungsi Pangkat
                            if(tL == 11||tL == 23 || tL ==35){
                                tL = tL+1
                            }
                            val Number:Double = (1+(iM/12))
                            val tLs = tL.toDouble()

                            val sum = Math.pow(Number,-tLs)
                            val tesS = sum.toString()
                            Log.d("TEs",tesS)

                            val angM1 = (hb * (iM/12) / (1-(sum)))
                            val angM1T = angM1.toInt()
                            val tBM = bl + (angM1*tL)
                            val tbMT = tBM.toInt()
                            val selisih = (multiply) - (tbMT)

                            val angM_Tv = angM1T.toString()
                            val tBM_Tv = tbMT.toString()
                            val tL2 = tL.toString()

                            val selisihEBP = selisih.toString()
                            angS2.setText("Rp. "+angM_Tv)
                            TangS.setText("Rp. "+tBM_Tv)
                            tbl.setText("Rp. "+value)
                            tMS.setText(tL2)
                            stb.setText("Rp. "+selisihEBP)
                        }

                        if(tL == 12 || tL == 24 || tL == 36 || tL == 11|| tL == 23 || tL == 35){
                            if(tL == 12 || tL == 11){
                                payrollFinancing12()
                            }else if (tL == 24 || tL == 23){
                                payrollFinancing24()
                            }else if (tL== 36 || tL == 35){
                                payrollFinancing36()
                            }
                        }else if (dp == null || bl == null || angL == null || tL == null || hb == null){
                            Toast.makeText(activity,"Harap, Masukan Biaya!!Apabila tidak ada, ketik 0",Toast.LENGTH_LONG).show()
                        }else {
                            Toast.makeText(activity,"Tenor Invalid!!",Toast.LENGTH_LONG).show()
                        }
                    }
                }else if (position==1){
                    //Function calculation
                    btn_banding.setOnClickListener { root ->
                        val dp = dp.text.toString().toInt()
                        val bl = bl.text.toString().toInt()
                        val angL = angL.text.toString().toInt()
                        var tL = tL.text.toString().toInt()
                        val hb = hb.text.toString().toInt()
                        fun payrollFinancing12(){
                            val multiply = (dp+bl) + (angL*tL)
                            val value = multiply.toString()
                            val iM: Double = 0.155
                            val i:Int = 0
                            //Fungsi Pangkat
                            if(tL == 11||tL == 23 || tL ==35){
                                tL = tL+1
                            }
                            val Number:Double = (1+(iM/12))
                            val tLs = tL.toDouble()

                            val sum = Math.pow(Number,-tLs)
                            val tesS = sum.toString()
                            Log.d("TEs",tesS)

                            val angM1 = (hb * (iM/12) / (1-(sum)))
                            val angM1T = angM1.toInt()
                            val tBM = bl + (angM1*tL)
                            val tbMT = tBM.toInt()
                            val selisih = (multiply) - (tbMT)

                            val angM_Tv = angM1T.toString()
                            val tBM_Tv = tbMT.toString()
                            val tL2 = tL.toString()

                            val selisihEBP = selisih.toString()
                            angS2.setText("Rp. "+angM_Tv)
                            TangS.setText("Rp. "+tBM_Tv)
                            tbl.setText("Rp. "+value)
                            tMS.setText(tL2)
                            stb.setText("Rp. "+selisihEBP)
                        }
                        fun payrollFinancing24(){
                            val multiply = (dp+bl) + (angL*tL)
                            val value = multiply.toString()
                            val iM: Double = 0.17
                            val i:Int = 0
                            //Fungsi Pangkat
                            if(tL == 11||tL == 23 || tL ==35){
                                tL = tL+1
                            }
                            val Number:Double = (1+(iM/12))
                            val tLs = tL.toDouble()

                            val sum = Math.pow(Number,-tLs)
                            val tesS = sum.toString()
                            Log.d("TEs",tesS)

                            val angM1 = (hb * (iM/12) / (1-(sum)))
                            val angM1T = angM1.toInt()
                            val tBM = bl + (angM1*tL)
                            val tbMT = tBM.toInt()
                            val selisih = (multiply) - (tbMT)

                            val angM_Tv = angM1T.toString()
                            val tBM_Tv = tbMT.toString()
                            val tL2 = tL.toString()

                            val selisihEBP = selisih.toString()
                            angS2.setText("Rp. "+angM_Tv)
                            TangS.setText("Rp. "+tBM_Tv)
                            tbl.setText("Rp. "+value)
                            tMS.setText(tL2)
                            stb.setText("Rp. "+selisihEBP)
                        }
                        fun payrollFinancing36(){
                            val multiply = (dp+bl) + (angL*tL)
                            val value = multiply.toString()
                            val iM: Double = 0.17
                            val i:Int = 0
                            //Fungsi Pangkat
                            if(tL == 11||tL == 23 || tL ==35){
                                tL = tL+1
                            }
                            val Number:Double = (1+(iM/12))
                            val tLs = tL.toDouble()

                            val sum = Math.pow(Number,-tLs)
                            val tesS = sum.toString()
                            Log.d("TEs",tesS)

                            val angM1 = (hb * (iM/12) / (1-(sum)))
                            val angM1T = angM1.toInt()
                            val tBM = bl + (angM1*tL)
                            val tbMT = tBM.toInt()
                            val selisih = (multiply) - (tbMT)

                            val angM_Tv = angM1T.toString()
                            val tBM_Tv = tbMT.toString()
                            val tL2 = tL.toString()

                            val selisihEBP = selisih.toString()
                            angS2.setText("Rp. "+angM_Tv)
                            TangS.setText("Rp. "+tBM_Tv)
                            tbl.setText("Rp. "+value)
                            tMS.setText(tL2)
                            stb.setText("Rp. "+selisihEBP)
                        }
                        if(tL == 12 || tL == 24 || tL == 36 || tL == 11|| tL == 23 || tL == 35){
                            if(tL == 12 || tL == 11){
                                payrollFinancing12()
                            }else if (tL == 24 || tL == 23){
                                payrollFinancing24()
                            }else if (tL== 36 || tL == 35){
                                payrollFinancing36()
                            }
                        }else if (dp == null || bl == null || angL == null || tL == null || hb == null){
                            Toast.makeText(activity,"Harap, Masukan Biaya!!Apabila tidak ada, ketik 0",Toast.LENGTH_LONG).show()
                        }else {
                            Toast.makeText(activity,"Tenor Invalid!!",Toast.LENGTH_LONG).show()
                        }
                    }
                }else if (position==2){
                    btn_banding.setOnClickListener { root ->
                        val dp = dp.text.toString().toInt()
                        val bl = bl.text.toString().toInt()
                        val angL = angL.text.toString().toInt()
                        var tL = tL.text.toString().toInt()
                        val hb = hb.text.toString().toInt()

                        fun payrollFinancing12(){
                            val multiply = (dp+bl) + (angL*tL)
                            val value = multiply.toString()
                            val iM: Double = 0.16
                            val i:Int = 0
                            //Fungsi Pangkat
                            if(tL == 11||tL == 23 || tL ==35){
                                tL = tL+1
                            }
                            val Number:Double = (1+(iM/12))
                            val tLs = tL.toDouble()

                            val sum = Math.pow(Number,-tLs)
                            val tesS = sum.toString()
                            Log.d("TEs",tesS)

                            val angM1 = (hb * (iM/12) / (1-(sum)))
                            val angM1T = angM1.toInt()
                            val tBM = bl + (angM1*tL)
                            val tbMT = tBM.toInt()
                            val selisih = (multiply) - (tbMT)

                            val angM_Tv = angM1T.toString()
                            val tBM_Tv = tbMT.toString()
                            val tL2 = tL.toString()

                            val selisihEBP = selisih.toString()
                            angS2.setText("Rp. "+angM_Tv)
                            TangS.setText("Rp. "+tBM_Tv)
                            tbl.setText("Rp. "+value)
                            tMS.setText(tL2)
                            stb.setText("Rp. "+selisihEBP)
                        }
                        fun payrollFinancing24(){
                            val multiply = (dp+bl) + (angL*tL)
                            val value = multiply.toString()
                            val iM: Double = 0.175
                            val i:Int = 0
                            //Fungsi Pangkat
                            if(tL == 11||tL == 23 || tL ==35){
                                tL = tL+1
                            }
                            val Number:Double = (1+(iM/12))
                            val tLs = tL.toDouble()

                            val sum = Math.pow(Number,-tLs)
                            val tesS = sum.toString()
                            Log.d("TEs",tesS)

                            val angM1 = (hb * (iM/12) / (1-(sum)))
                            val angM1T = angM1.toInt()
                            val tBM = bl + (angM1*tL)
                            val tbMT = tBM.toInt()
                            val selisih = (multiply) - (tbMT)

                            val angM_Tv = angM1T.toString()
                            val tBM_Tv = tbMT.toString()
                            val tL2 = tL.toString()

                            val selisihEBP = selisih.toString()
                            angS2.setText("Rp. "+angM_Tv)
                            TangS.setText("Rp. "+tBM_Tv)
                            tbl.setText("Rp. "+value)
                            tMS.setText(tL2)
                            stb.setText("Rp. "+selisihEBP)
                        }
                        fun payrollFinancing36(){
                            val multiply = (dp+bl) + (angL*tL)
                            val value = multiply.toString()
                            val iM: Double = 0.19
                            val i:Int = 0
                            //Fungsi Pangkat
                            if(tL == 11||tL == 23 || tL ==35){
                                tL = tL+1
                            }
                            val Number:Double = (1+(iM/12))
                            val tLs = tL.toDouble()

                            val sum = Math.pow(Number,-tLs)
                            val tesS = sum.toString()
                            Log.d("TEs",tesS)

                            val angM1 = (hb * (iM/12) / (1-(sum)))
                            val angM1T = angM1.toInt()
                            val tBM = bl + (angM1*tL)
                            val tbMT = tBM.toInt()
                            val selisih = (multiply) - (tbMT)

                            val angM_Tv = angM1T.toString()
                            val tBM_Tv = tbMT.toString()
                            val tL2 = tL.toString()

                            val selisihEBP = selisih.toString()
                            angS2.setText("Rp. "+angM_Tv)
                            TangS.setText("Rp. "+tBM_Tv)
                            tbl.setText("Rp. "+value)
                            tMS.setText(tL2)
                            stb.setText("Rp. "+selisihEBP)
                        }
                        if(tL == 12 || tL == 24 || tL == 36 || tL == 11|| tL == 23 || tL == 35){
                            if(tL == 12 || tL == 11){
                                payrollFinancing12()
                            }else if (tL == 24 || tL == 23){
                                payrollFinancing24()
                            }else if (tL== 36 || tL == 35){
                                payrollFinancing36()
                            }
                        }else if (dp == null || bl == null || angL == null || tL == null || hb == null){
                            Toast.makeText(activity,"Harap, Masukan Biaya!!Apabila tidak ada, ketik 0",Toast.LENGTH_LONG).show()
                        }else {
                            Toast.makeText(activity,"Tenor Invalid!!",Toast.LENGTH_LONG).show()
                        }
                    }
                }else if (position==3){
                    btn_banding.setOnClickListener { root ->
                        val dp = dp.text.toString().toInt()
                        val bl = bl.text.toString().toInt()
                        val angL = angL.text.toString().toInt()
                        var tL = tL.text.toString().toInt()
                        val hb = hb.text.toString().toInt()

                        fun payrollFinancing12(){
                            val multiply = (dp+bl) + (angL*tL)
                            val value = multiply.toString()
                            val iM: Double = 0.19
                            val i:Int = 0
                            //Fungsi Pangkat
                            if(tL == 11||tL == 23 || tL ==35){
                                tL = tL+1
                            }
                            val Number:Double = (1+(iM/12))
                            val tLs = tL.toDouble()

                            val sum = Math.pow(Number,-tLs)
                            val tesS = sum.toString()
                            Log.d("TEs",tesS)

                            val angM1 = (hb * (iM/12) / (1-(sum)))
                            val angM1T = angM1.toInt()
                            val tBM = bl + (angM1*tL)
                            val tbMT = tBM.toInt()
                            val selisih = (multiply) - (tbMT)

                            val angM_Tv = angM1T.toString()
                            val tBM_Tv = tbMT.toString()
                            val tL2 = tL.toString()

                            val selisihEBP = selisih.toString()
                            angS2.setText("Rp. "+angM_Tv)
                            TangS.setText("Rp. "+tBM_Tv)
                            tbl.setText("Rp. "+value)
                            tMS.setText(tL2)
                            stb.setText("Rp. "+selisihEBP)
                        }
                        fun payrollFinancing24(){
                            val multiply = (dp+bl) + (angL*tL)
                            val value = multiply.toString()
                            val iM: Double = 0.231
                            val i:Int = 0
                            //Fungsi Pangkat
                            if(tL == 11||tL == 23 || tL ==35){
                                tL = tL+1
                            }
                            val Number:Double = (1+(iM/12))
                            val tLs = tL.toDouble()

                            val sum = Math.pow(Number,-tLs)
                            val tesS = sum.toString()
                            Log.d("TEs",tesS)

                            val angM1 = (hb * (iM/12) / (1-(sum)))
                            val angM1T = angM1.toInt()
                            val tBM = bl + (angM1*tL)
                            val tbMT = tBM.toInt()
                            val selisih = (multiply) - (tbMT)

                            val angM_Tv = angM1T.toString()
                            val tBM_Tv = tbMT.toString()
                            val tL2 = tL.toString()

                            val selisihEBP = selisih.toString()
                            angS2.setText("Rp. "+angM_Tv)
                            TangS.setText("Rp. "+tBM_Tv)
                            tbl.setText("Rp. "+value)
                            tMS.setText(tL2)
                            stb.setText("Rp. "+selisihEBP)
                        }
                        fun payrollFinancing36(){
                            val multiply = (dp+bl) + (angL*tL)
                            val value = multiply.toString()
                            val iM: Double = 0.231
                            val i:Int = 0
                            //Fungsi Pangkat
                            if(tL == 11||tL == 23 || tL ==35){
                                tL = tL+1
                            }
                            val Number:Double = (1+(iM/12))
                            val tLs = tL.toDouble()

                            val sum = Math.pow(Number,-tLs)
                            val tesS = sum.toString()
                            Log.d("TEs",tesS)

                            val angM1 = (hb * (iM/12) / (1-(sum)))
                            val angM1T = angM1.toInt()
                            val tBM = bl + (angM1*tL)
                            val tbMT = tBM.toInt()
                            val selisih = (multiply) - (tbMT)

                            val angM_Tv = angM1T.toString()
                            val tBM_Tv = tbMT.toString()
                            val tL2 = tL.toString()

                            val selisihEBP = selisih.toString()
                            angS2.setText("Rp. "+angM_Tv)
                            TangS.setText("Rp. "+tBM_Tv)
                            tbl.setText("Rp. "+value)
                            tMS.setText(tL2)
                            stb.setText("Rp. "+selisihEBP)
                        }
                        if(tL == 12 || tL == 24 || tL == 36 || tL == 11|| tL == 23 || tL == 35){
                            if(tL == 12 || tL == 11){
                                payrollFinancing12()
                            }else if (tL == 24 || tL == 23){
                                payrollFinancing24()
                            }else if (tL== 36 || tL == 35){
                                payrollFinancing36()
                            }
                        }else if (dp == null || bl == null || angL == null || tL == null || hb == null){
                            Toast.makeText(activity,"Harap, Masukan Biaya!!Apabila tidak ada, ketik 0",Toast.LENGTH_LONG).show()
                        }else {
                            Toast.makeText(activity,"Tenor Invalid!!",Toast.LENGTH_LONG).show()
                        }
                    }
                }else if (position==4){
                    btn_banding.setOnClickListener { root ->
                        val dp = dp.text.toString().toInt()
                        val bl = bl.text.toString().toInt()
                        val angL = angL.text.toString().toInt()
                        var tL = tL.text.toString().toInt()
                        val hb = hb.text.toString().toInt()

                        fun payrollFinancing12(){
                            val multiply = (dp+bl) + (angL*tL)
                            val value = multiply.toString()
                            val iM: Double = 0.2138
                            val i:Int = 0
                            //Fungsi Pangkat
                            if(tL == 11||tL == 23 || tL ==35){
                                tL = tL+1
                            }
                            val Number:Double = (1+(iM/12))
                            val tLs = tL.toDouble()

                            val sum = Math.pow(Number,-tLs)
                            val tesS = sum.toString()
                            Log.d("TEs",tesS)

                            val angM1 = (hb * (iM/12) / (1-(sum)))
                            val angM1T = angM1.toInt()
                            val tBM = bl + (angM1*tL)
                            val tbMT = tBM.toInt()
                            val selisih = (multiply) - (tbMT)

                            val angM_Tv = angM1T.toString()
                            val tBM_Tv = tbMT.toString()
                            val tL2 = tL.toString()

                            val selisihEBP = selisih.toString()
                            angS2.setText("Rp. "+angM_Tv)
                            TangS.setText("Rp. "+tBM_Tv)
                            tbl.setText("Rp. "+value)
                            tMS.setText(tL2)
                            stb.setText("Rp. "+selisihEBP)
                        }
                        fun payrollFinancing24(){
                            val multiply = (dp+bl) + (angL*tL)
                            val value = multiply.toString()
                            val iM: Double = 0.27
                            val i:Int = 0
                            //Fungsi Pangkat
                            if(tL == 11||tL == 23 || tL ==35){
                                tL = tL+1
                            }
                            val Number:Double = (1+(iM/12))
                            val tLs = tL.toDouble()

                            val sum = Math.pow(Number,-tLs)
                            val tesS = sum.toString()
                            Log.d("TEs",tesS)

                            val angM1 = (hb * (iM/12) / (1-(sum)))
                            val angM1T = angM1.toInt()
                            val tBM = bl + (angM1*tL)
                            val tbMT = tBM.toInt()
                            val selisih = (multiply) - (tbMT)

                            val angM_Tv = angM1T.toString()
                            val tBM_Tv = tbMT.toString()
                            val tL2 = tL.toString()

                            val selisihEBP = selisih.toString()
                            angS2.setText("Rp. "+angM_Tv)
                            TangS.setText("Rp. "+tBM_Tv)
                            tbl.setText("Rp. "+value)
                            tMS.setText(tL2)
                            stb.setText("Rp. "+selisihEBP)
                        }
                        fun payrollFinancing36(){
                            val multiply = (dp+bl) + (angL*tL)
                            val value = multiply.toString()
                            val iM: Double = 0.27
                            val i:Int = 0
                            //Fungsi Pangkat
                            if(tL == 11||tL == 23 || tL ==35){
                                tL = tL+1
                            }
                            val Number:Double = (1+(iM/12))
                            val tLs = tL.toDouble()

                            val sum = Math.pow(Number,-tLs)
                            val tesS = sum.toString()
                            Log.d("TEs",tesS)

                            val angM1 = (hb * (iM/12) / (1-(sum)))
                            val angM1T = angM1.toInt()
                            val tBM = bl + (angM1*tL)
                            val tbMT = tBM.toInt()
                            val selisih = (multiply) - (tbMT)

                            val angM_Tv = angM1T.toString()
                            val tBM_Tv = tbMT.toString()
                            val tL2 = tL.toString()

                            val selisihEBP = selisih.toString()
                            angS2.setText("Rp. "+angM_Tv)
                            TangS.setText("Rp. "+tBM_Tv)
                            tbl.setText("Rp. "+value)
                            tMS.setText(tL2)
                            stb.setText("Rp. "+selisihEBP)
                        }
                        if(tL == 12 || tL == 24 || tL == 36 || tL == 11|| tL == 23 || tL == 35){
                            if(tL == 12 || tL == 11){
                                payrollFinancing12()
                            }else if (tL == 24 || tL == 23){
                                payrollFinancing24()
                            }else if (tL== 36 || tL == 35){
                                payrollFinancing36()
                            }
                        }else if (dp == null || bl == null || angL == null || tL == null || hb == null){
                            Toast.makeText(activity,"Harap, Masukan Biaya!!Apabila tidak ada, ketik 0",Toast.LENGTH_LONG).show()
                        }else {
                            Toast.makeText(activity,"Tenor Invalid!!",Toast.LENGTH_LONG).show()
                        }
                    }
                }
            }
        }


/*
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
*/

        return root
    }

}