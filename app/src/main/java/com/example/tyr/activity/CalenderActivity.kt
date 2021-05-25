package com.example.tyr.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.tyr.R
import com.example.tyr.databinding.ActivityCalenderBinding

class CalenderActivity : BaseActivity(), View.OnClickListener {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, CalenderActivity::class.java)
            return intent
        }
    }

    lateinit var binding: ActivityCalenderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_calender)
        initialization()

    }

    fun initialization() {
        binding.ivBack.setOnClickListener {
            finish()
        }

        binding.btnBusy.setOnClickListener {
            finish()
        }
        binding.btnAvailable.setOnClickListener {
            finish()
        }
    }


    override fun onClick(view: View?) {
        when (view?.id) {


        }
    }


}