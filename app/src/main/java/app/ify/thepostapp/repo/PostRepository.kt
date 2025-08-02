package app.ify.thepostapp.repo

import app.ify.thepostapp.retrofit.ApiService
import app.ify.thepostapp.retrofit.Post
import javax.inject.Inject

// Repo is part of the MVVM Architecture used in handling data
//operations like fetching data from an Api, database or any other source

class PostRepository @Inject constructor(
    private val apiService: ApiService
) {
    suspend fun getPosts(): List<Post>
    {return apiService.getPosts()}
}