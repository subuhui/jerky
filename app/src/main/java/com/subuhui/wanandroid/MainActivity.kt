package com.subuhui.wanandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.subuhui.wanandroid.databinding.ActivityMainBinding
import com.subuhui.wanandroid.utils.ViewPagerOnPageSelected

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)

        viewModel = ViewModelProviders.of(this@MainActivity).get(MainViewModel::class.java)
        viewModel.setBinding(binding)
        binding.viewModel = viewModel
        binding.vp.addOnPageChangeListener(ViewPagerOnPageSelected(this@MainActivity::onPageSelected))
    }

    private fun onPageSelected(position: Int) {
        viewModel.selectedPosition.set(position)
    }

}


