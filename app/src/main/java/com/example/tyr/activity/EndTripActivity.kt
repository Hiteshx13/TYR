package com.example.tyr.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.tyr.R
import com.example.tyr.databinding.ActivityEndTripBinding
import com.example.tyr.databinding.ActivityFaqBinding
import com.example.tyr.databinding.ActivityLoginBinding

class EndTripActivity : BaseActivity(), View.OnClickListener {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, EndTripActivity::class.java)
            return intent
        }
    }

    lateinit var binding: ActivityEndTripBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_end_trip)
        initialization()

    }

    fun initialization() {
        binding.btnEndTrip.setOnClickListener(this)

    }


    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btnEndTrip->{
                launchActivity(EndTripReportCardsActivity.getIntent(mContext))
                finish()
            }

        }
    }


}