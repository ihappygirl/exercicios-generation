package com.mayabispo.todolist

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

// dizer que a classe engloba o app inteiro e usará o Hilt
@HiltAndroidApp
class TodoApplication : Application() {

}