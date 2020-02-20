package com.example.week02

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        btn_Surin.setOnClickListener(View.OnClickListener {

            getDrawable(R.drawable.phrae)?.let { it1 ->
                setProvice(
                    it1,
                    getString(R.string.btn_phrae),
                    getString(R.string.content_ph)
                )
            }

        })
        btn_leoi.setOnClickListener(View.OnClickListener {

            getDrawable(R.drawable.leoi)?.let { it1 ->
                setProvice(
                    it1,
                    getString(R.string.btn_leoi),
                    getString(R.string.content_L)
                )
            }
        })
        btn_chaingrai.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.chaingrai)?.let { it1 ->
                setProvice(
                    it1,
                    getString(R.string.btn_chaingrai),
                    getString(R.string.content_cr)
                )
            }
        })
        btn_nan.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.nan)?.let { it1 ->
                setProvice(
                    it1,
                    getString(R.string.btn_nan),
                    getString(R.string.content_nn)
                )
            }
        })
    }
    fun setProvice(drawable: Drawable, header: String, content: String) {

        img_province.setImageDrawable(drawable)
        tv_header.setText("ข้อมูลจังหวัด " + header)
        tv_history.setText(content)

    }
    }

