package com.example.tyr.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.tyr.R
import com.example.tyr.databinding.ActivityLoginBinding
import com.example.tyr.databinding.ActivityNotificationsBinding

class NotificationsActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, NotificationsActivity::class.java)
            return intent
        }
    }

    lateinit var binding: ActivityNotificationsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_notifications)
        initialization()

    }

    fun initialization() {


    }


    override fun onClick(view: View?) {
        when (view?.id) {


        }
    }


}