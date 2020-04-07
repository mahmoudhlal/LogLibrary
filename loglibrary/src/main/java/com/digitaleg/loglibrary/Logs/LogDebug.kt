package com.digitaleg.loglibrary.Logs

import android.util.Log

class LogDebug {

    companion object{
        const val LOG_TAG = "log-tag"
        fun d(txt : String){
            Log.d(LOG_TAG , txt)
        }

        fun e(txt : String){
            Log.e(LOG_TAG , txt)
        }
    }
}