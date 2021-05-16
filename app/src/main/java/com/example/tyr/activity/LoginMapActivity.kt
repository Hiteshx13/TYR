package com.example.tyr.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.tyr.R
import com.example.tyr.databinding.ActivityLoginBinding
import com.example.tyr.databinding.ActivityLoginMapBinding

class LoginMapActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, LoginMapActivity::class.java)
            return intent
        }
    }

    lateinit var binding: ActivityLoginMapBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login_map)
        initialization()

    }

    fun initialization() {
        binding.btnNext.setOnClickListener(this)


    }


    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btnNext -> {
                startActivity(MainActivity.getIntent(this))
                finish()
            }

        }
    }


}