package com.example.filmescoroutines.ui.main

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import javax.security.auth.callback.Callback

class MainRepository {

    fun getFilmes(callback: (filmes: List<Filme>) -> Unit){
        Thread(Runnable {
            Thread.sleep(3000)
            callback.invoke(
                listOf(
                    Filme(1, "titulo 01"),
                    Filme(2, "Titulo 02")
                )
            )
        }).start()
    }

    suspend fun getFilmesCoroutines(): List<Filme>{
        return withContext(Dispatchers.Default){
            delay(3000)
            listOf(
                    Filme(1, "titulo 01"),
                    Filme(2, "Titulo 02")
            )
        }
    }
}