package com.example.filmescoroutines.ui.main

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

//    suspend fun getFilmesCoroutines(): List<Filme>{
//        
//    }
}