package com.digitaleg.loglibrary.Logs

import android.util.Log
import com.example.constants.Constants

class LogDebug {
    companion object{
        fun d(txt : String){
            Log.d(Constants.LOG_D , txt)
        }

        fun e(txt : String){
            Log.e(Constants.LOG_E , txt)
        }

        fun v(txt : String){
            Log.v(Constants.LOG_V , txt)
        }
    }
}