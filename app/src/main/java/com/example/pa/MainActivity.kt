package com.example.pa
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtChuoi = findViewById<EditText>(R.id.edtChuoi)
        val btSapXep = findViewById<Button>(R.id.btSapXep)
        val txtKetQua = findViewById<TextView>(R.id.txtKetQua)

        btSapXep.setOnClickListener {
            val chuoi: String = edtChuoi.text.toString()
            if (chuoi.isEmpty()) {
                txtKetQua.text = "Input không hợp lệ"
            } else {
                val danhSach = chuoi.split(" ")
                val soNguyen = danhSach.mapNotNull { it.toIntOrNull() }.toMutableList()
                if (soNguyen.isEmpty()) {
                    txtKetQua.text = "Input không hợp lệ"
                } else {
                    soNguyen.sort()
                    val ketQua = soNguyen.joinToString(" ")
                    txtKetQua.text = "Chuỗi sau khi sắp xếp: $ketQua"
                }
            }
        }
        }
    }
