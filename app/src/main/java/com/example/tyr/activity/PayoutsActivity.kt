package com.example.tyr.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.tyr.R
import com.example.tyr.databinding.ActivityPayoutsBinding

class PayoutsActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, PayoutsActivity::class.java)
            return intent
        }
    }

    lateinit var binding: ActivityPayoutsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_payouts)
        initialization()

    }

    fun initialization() {
        binding.llPayout.setOnClickListener(this)
        binding.llRemainingPayout.setOnClickListener(this)
        binding.llPayout.callOnClick()

    }


    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.llPayout -> {
                binding.tvPayout.isSelected=true
                binding.viewPayout.isSelected=true

                binding.tvRemainingPayout.isSelected=false
                binding.viewRemainingPayout.isSelected=false
            }
            R.id.llRemainingPayout -> {
                binding.tvPayout.isSelected=false
                binding.viewPayout.isSelected=false

                binding.tvRemainingPayout.isSelected=true
                binding.viewRemainingPayout.isSelected=true
            }

        }
    }


}