package com.example.tyr.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.tyr.R
import com.example.tyr.databinding.ActivityLoginBinding
import com.example.tyr.databinding.ActivityUploadDocumentsBinding

class UploadDocumentsActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, UploadDocumentsActivity::class.java)
            return intent
        }
    }

    lateinit var binding: ActivityUploadDocumentsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_upload_documents)
        initialization()

    }

    fun initialization() {
        binding.ivBack.setOnClickListener(this)
        binding.btnSubmit.setOnClickListener(this)

    }


    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.ivBack -> {
                finish()
            }
            R.id.btnSubmit -> {
                startActivity(SignUpActivity.getIntent(this))
                finish()
            }

        }
    }


}