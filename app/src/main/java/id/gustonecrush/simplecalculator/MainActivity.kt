package id.gustonecrush.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clear(view: View) {
        val input1 = edt_angka1
        val input2 = edt_angka2
        val hasil = txt_result

        input1.text = null
        input2.text = null
        hasil.text  = "0"
    }

    fun tambah(view: View) {
        val input1 = edt_angka1.text.toString()
        val input2 = edt_angka2.text.toString()
        val hasil  = txt_result

        if(input1.isEmpty()) {
            edt_angka1.setError("Masukkan angka pertama")
        } else if(input2.isEmpty()) {
            edt_angka2.setError("Masukkan angka kedua")
        } else {
            val jumlah = input1.toDouble() + input2.toDouble()
            hasil.text = jumlah.toString()
        }
    }

    fun kurang(view: View) {
        val input1 = edt_angka1.text.toString()
        val input2 = edt_angka2.text.toString()
        val hasil  = txt_result

        if(input1.isEmpty()) {
            edt_angka1.setError("Masukkan angka pertama")
        } else if(input2.isEmpty()) {
            edt_angka2.setError("Masukkan angka kedua")
        } else {
            val jumlah = input1.toDouble() - input2.toDouble()
            hasil.text = jumlah.toString()
        }
    }

    fun kali(view: View) {
        val input1 = edt_angka1.text.toString()
        val input2 = edt_angka2.text.toString()
        val hasil  = txt_result

        if(input1.isEmpty()) {
            edt_angka1.setError("Masukkan angka pertama")
        } else if(input2.isEmpty()) {
            edt_angka2.setError("Masukkan angka kedua")
        } else {
            val jumlah = input1.toDouble() * input2.toDouble()
            hasil.text = jumlah.toString()
        }
    }

    fun bagi(view: View) {
        val input1 = edt_angka1.text.toString()
        val input2 = edt_angka2.text.toString()
        val hasil  = txt_result

        if(input1.isEmpty()) {
            edt_angka1.setError("Masukkan angka pertama")
        } else if(input2.isEmpty()) {
            edt_angka2.setError("Masukkan angka kedua")
        } else {
            val jumlah = input1.toDouble() / input2.toDouble()
            hasil.text = jumlah.toString()
        }
    }

    fun modulus(view: View) {
        val input1 = edt_angka1.text.toString()
        val input2 = edt_angka2.text.toString()
        val hasil  = txt_result

        if(input1.isEmpty()) {
            edt_angka1.setError("Masukkan angka pertama")
        } else if(input2.isEmpty()) {
            edt_angka2.setError("Masukkan angka kedua")
        } else {
            val jumlah = input1.toDouble() % input2.toDouble()
            hasil.text = jumlah.toString()
        }
    }

}