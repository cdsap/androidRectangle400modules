package com.awesomeapp.pushprofile

sealed class State344_35 {
    data object Loading : State344_35()
    data class Success(val data: String) : State344_35()
    data class Error(val message: String) : State344_35()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}