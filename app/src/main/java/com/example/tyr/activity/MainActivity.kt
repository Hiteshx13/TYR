package com.example.tyr.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.tyr.R
import com.example.tyr.databinding.ActivityMainBinding
import com.example.tyr.fragment.ContactsFragment
import com.example.tyr.fragment.DashboardFragment
import com.example.tyr.fragment.UsersFragment

class MainActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, MainActivity::class.java)
            return intent
        }
    }

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        initialization()
        binding.llTabHome.callOnClick()
    }

    fun initialization() {
        binding.llTabHome.setOnClickListener(this)
        binding.llTabContact.setOnClickListener(this)
        binding.llTabUser.setOnClickListener(this)

    }

    fun replaceFragment(fragment: Fragment, isBackStack: Boolean) {
        val fm = supportFragmentManager
        val fragmentTransaction = fm.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        if (isBackStack) {
            fragmentTransaction.addToBackStack(fragment.javaClass.name)
        }
        fragmentTransaction.commit() // save the changes

    }

    override fun onClick(view: View?) {
        when (view?.id) {

            R.id.llTabHome -> {
                resetView()
                binding.llTabHome.isSelected=true
                replaceFragment(DashboardFragment.newInstance(), false)
            }
            R.id.llTabContact -> {
                resetView()
                binding.llTabContact.isSelected=true
                replaceFragment(ContactsFragment.newInstance(), false)
            }
            R.id.llTabUser -> {
                resetView()
                binding.llTabUser.isSelected=true
                replaceFragment(UsersFragment.newInstance(), false)
            }
        }
    }

    fun resetView(){
        binding.llTabHome.isSelected=false
        binding.llTabUser.isSelected=false
        binding.llTabContact.isSelected=false
    }
}