package com.example.tyr.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.tyr.R
import com.example.tyr.databinding.ActivityEndTripMessageBinding

class EndTripMessageActivity : BaseActivity(), View.OnClickListener {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, EndTripMessageActivity::class.java)
            return intent
        }
    }

    lateinit var binding: ActivityEndTripMessageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_end_trip_message)
        initialization()

    }

    fun initialization() {
        binding.ivClose.setOnClickListener(this)

    }


    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.ivClose -> {
                finish()
            }

        }
    }


}