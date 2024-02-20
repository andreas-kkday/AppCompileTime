package com.example.appmodule

import com.example.mylibrary.Large
import com.example.mylibrary_impl.LargeImpl

object LargeInstance  {
    fun getInstance(): Large {
        return LargeImpl()
    }
}