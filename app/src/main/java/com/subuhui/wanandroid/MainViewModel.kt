package com.subuhui.wanandroid

import android.view.View
import androidx.databinding.ObservableInt
import androidx.lifecycle.ViewModel
import com.subuhui.wanandroid.databinding.ActivityMainBinding

/**
 * <li>Package: com.subuhui.wanandroid</li>
 * <li>Author: subuhui  </li>
 * <li>Date: 2019/3/4</li>
 * <li>Description:  </li>
 */
class MainViewModel : ViewModel() {
    private lateinit var binding: ActivityMainBinding
    var selectedPosition = ObservableInt()

    fun onClick(v: View) {
        when (v) {
            binding.navigationHome -> {
                selectedPosition.set(0)
                return
            }
            binding.navigationBlog -> {
                selectedPosition.set(4)
                return
            }
            binding.navigationSetup -> {
                selectedPosition.set(3)
                return
            }
            binding.navigationTerm -> {
                selectedPosition.set(1)
                return
            }
            binding.navigationTodo -> {
                selectedPosition.set(2)
                return
            }
        }
    }

    fun setBinding(binding: ActivityMainBinding) {
        this.binding = binding
        selectedPosition.set(2)
    }
}