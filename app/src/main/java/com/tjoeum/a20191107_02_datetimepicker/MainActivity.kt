package com.tjoeum.a20191107_02_datetimepicker

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

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


                var selectDate = Calendar.getInstance()
                selectDate.set(year,month,dayOfMonth)

                var sdf = SimpleDateFormat("yyyy년M월d일")
                var resultStr = sdf.format(selectDate.time)


                dateTxt.text = resultStr
            },2019,11,11)


            datePickerDialog.show()
        }

        selectTimeBtn.setOnClickListener {
            var timePickerDialog = TimePickerDialog(this,TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->

                var seleteTime = Calendar.getInstance()
                seleteTime.set(Calendar.HOUR_OF_DAY,hourOfDay)
                seleteTime.set(Calendar.MINUTE, minute)

                var sdf = SimpleDateFormat("a h:m")
                timeTxt.text = sdf.format(seleteTime.time)


            },10,20,true)

            timePickerDialog.show()

        }

    }

    override fun setValues() {
    }

}
