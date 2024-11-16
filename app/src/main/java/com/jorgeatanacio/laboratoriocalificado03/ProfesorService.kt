package com.jorgeatanacio.laboratoriocalificado03



import retrofit2.http.GET

interface ProfesorService {
    @GET("teachers")
    suspend fun getTeachers(): List<Profesor>
}
