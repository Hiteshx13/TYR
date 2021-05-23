package com.example.tyr.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.tyr.R
import com.example.tyr.databinding.ActivityEndTripRepotyCardsBinding

class EndTripReportCardsActivity : BaseActivity(), View.OnClickListener {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, EndTripReportCardsActivity::class.java)
            return intent
        }
    }

    lateinit var binding: ActivityEndTripRepotyCardsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_end_trip_repoty_cards)
        initialization()

    }

    fun initialization() {
        binding.btnSubmit.setOnClickListener(this)
        binding.ivBack.setOnClickListener(this)

    }


    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.ivBack -> {
                finish()
            }
            R.id.btnSubmit -> {
                launchActivity(EndTripMessageActivity.getIntent(mContext))
                finish()
            }

        }
    }


}