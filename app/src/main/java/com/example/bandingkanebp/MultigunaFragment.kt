package com.example.bandingkanebp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.text.set
import kotlinx.android.synthetic.main.fragment_multiguna.*
import kotlinx.android.synthetic.main.fragment_multiguna.view.*
import org.w3c.dom.Text
import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*
import kotlin.math.*
import kotlin.math.log


class MultigunaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_multiguna, container, false)

        //val jangkaWaktu = resources.getStringArray(R.array.jangkaWaktu)
        //val spinner = root.findViewById<Spinner>(R.id.sp_jangkaWaktu)

        //Deklarasi bank lain
        val hb = root.findViewById<EditText>(R.id.et_hargaJual)
        val dp = root.findViewById<EditText>(R.id.et_feeAgent)
        val bl = root.findViewById<EditText>(R.id.et_njop)
        val npoptkp = root.findViewById<EditText>(R.id.et_npoptkp)
        val btn_banding = root.findViewById<Button>(R.id.btn_banding)

        val formatter = NumberFormat.getCurrencyInstance(Locale("in", "ID"))

        //deklarasi
        val TTLFeeAgent = root.findViewById<TextView>(R.id.tv_ttlfeeAgent)
        val tMS = root.findViewById<TextView>(R.id.tv_TTLPajakPenjual)
        val TTLPajakPembeli = root.findViewById<TextView>(R.id.tv_TTLPajakPembeli)
        val TtlNJOP = root.findViewById<TextView>(R.id.tv_ttlNjop)
        val totalexpense = root.findViewById<TextView>(R.id.tv_ttlexpense)
        val TTLValidSertif = root.findViewById<TextView>(R.id.tv_TTLvalidsertif)
        val TTLCekSertif = root.findViewById<TextView>(R.id.tv_TTLceksertif)
        val TTLValidPajak = root.findViewById<TextView>(R.id.tv_TTLvalidpjk)
        val TTLaktajualbeli = root.findViewById<TextView>(R.id.tv_TTLaktajualbeli)


        val clr = root.findViewById<Button>(R.id.btn_clear)

        btn_banding.setOnClickListener { root ->
            val dp = dp.text.toString().toDouble()
            val bl = bl.text.toString().toInt()
            val hb = hb.text.toString().toInt()
            val npoptkp = npoptkp.text.toString().toInt()

                val pjkPenjual = (2.5/100)*hb
                val pjkPembeli = 0.05*(hb-npoptkp)
                Log.d("Debug", "Harga Jual => "+hb)
                Log.d("Debug", "Npoptkp => "+npoptkp)
                Log.d("Debug", "Pajak Pembeli => "+pjkPembeli)
                val validsertif = 100000
                val ceksertif = 500000
                val validpajak = 500000
                val ttlaktajualbeli = ((0.5/100)*hb)
                val angM1 = ((dp/100)*hb)
                val totalbayar = pjkPenjual+pjkPembeli+validsertif+ceksertif+validpajak+ttlaktajualbeli+angM1


                val ttlvalidsertif = formatter.format(validsertif.toDouble())
                val ttlceksertif = formatter.format(ceksertif.toDouble())
                val ttlvalidpajak = formatter.format(validpajak.toDouble())
                val aktajualbeli = formatter.format(ttlaktajualbeli)
                val ttlpajakpembeli = formatter.format(pjkPembeli)


                val angM1T = angM1.toInt()
                val angM_Tv = formatter.format(angM1T.toDouble())
                val tL2 = formatter.format(pjkPenjual)
                val ttlnjop = formatter.format(bl)
                val biayaexpense = formatter.format(totalbayar)

                TTLFeeAgent.setText(angM_Tv)
                TTLPajakPembeli.setText(ttlpajakpembeli)
                tMS.setText(tL2)
                TtlNJOP.setText(ttlnjop)
                TTLValidSertif.setText(ttlvalidsertif)
                TTLCekSertif.setText(ttlceksertif)
                TTLValidPajak.setText(ttlvalidpajak)
                TTLaktajualbeli.setText(aktajualbeli)
                totalexpense.setText(biayaexpense)
            }

            clr.setOnClickListener { root ->
                hb.text.clear()
                dp.setText("")
                bl.setText("")
                npoptkp.text.clear()
                tMS.setText("")
                TTLPajakPembeli.setText("")
                TTLaktajualbeli.setText("")
                TTLValidPajak.setText("")
                TtlNJOP.setText("")
                TTLValidSertif.setText("")
                TTLCekSertif.setText("")
                TTLFeeAgent.setText("")
                totalexpense.setText("")
            }


        return root
        }

    }
