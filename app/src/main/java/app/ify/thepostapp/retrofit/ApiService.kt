package app.ify.thepostapp.retrofit

import retrofit2.http.GET

// define the structure of HTTP Api calls
interface ApiService {

    @GET("posts")
     suspend fun getPosts(): List<Post>
}