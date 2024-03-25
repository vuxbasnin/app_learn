package com.ninvb.applearn.learn.kotlin

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 *Delegate pattern
 *  - la mau design pattern cho phep mot doi tuong co the tai su dung lai code cua thanh phan khac
 *  - tuong tu ke thua nhung thuc hien thu cong qua cac doi tuong
 */
class DelegatePattern(context: Context) {
    companion object {
        private const val LAUNCH_COUNT = "LAUNCH_COUNT"
        private const val SCREEN_COUNT = "SCREEN_COUNT"
    }

    private val preferences = context.getSharedPreferences("NINVB", Context.MODE_PRIVATE)
    var launchCount by IntPreference(preferences, LAUNCH_COUNT, 0)
    var screenCount by IntPreference(preferences, SCREEN_COUNT, 0)
}

class IntPreference(
    private val preferences: SharedPreferences,
    private val name: String,
    private val defaultValue: Int
) : ReadWriteProperty<Any, Int> {
    override fun getValue(thisRef: Any, property: KProperty<*>): Int {
        Log.d("NINVB99", "IntPreference => getValue")
        return preferences.getInt(name, defaultValue)
    }

    @SuppressLint("CommitPrefEdits")
    override fun setValue(thisRef: Any, property: KProperty<*>, value: Int) {
        Log.d("NINVB99", "IntPreference => setValue")
        preferences.edit().putInt(name, value)
    }
}