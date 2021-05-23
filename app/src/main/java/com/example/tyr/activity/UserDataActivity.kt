package com.example.tyr.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.tyr.R
import com.example.tyr.databinding.ActivityUserDataBinding

class UserDataActivity : BaseActivity(), View.OnClickListener {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, UserDataActivity::class.java)
            return intent
        }
    }

    lateinit var binding: ActivityUserDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_user_data)
        initialization()

    }

    fun initialization() {
        binding.llChat.setOnClickListener(this)
        binding.ivBack.setOnClickListener(this)


    }


    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.llChat -> {
                launchActivity(ConversationsActivity.getIntent(mContext))
            }

            R.id.ivBack -> {
                finish()
            }
        }
    }
}