package com.tjoeum.a20191107_02_datetimepicker

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setValues()
        setupEvents()
    }

    override fun setupEvents() {

        selectDateBtn.setOnClickListener {
            var datePickerDialog = DatePickerDialog(this,DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                Toast.makeText(this, "${year}년 ${month+1}월 ${dayOfMonth}일",Toast.LENGTH_LONG).show()

                dateTxt.text = "${year}년 ${month+1}월 ${dayOfMonth}일"
            },2019,11,11)


            datePickerDialog.show()
        }


    }

    override fun setValues() {
    }

}
