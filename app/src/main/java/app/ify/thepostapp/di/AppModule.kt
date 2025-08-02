package app.ify.thepostapp.di

import app.ify.thepostapp.retrofit.ApiService
import app.ify.thepostapp.retrofit.RetrofitInstance
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


//We use this when dealing with 3th party libraries


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    // Provide Retrofit Instance
    @Provides
    @Singleton
    fun provideRetrofitInstance(): RetrofitInstance {
        return RetrofitInstance()
    }

    // Provide ApiService
    @Provides
    @Singleton
    fun provideApiService(retrofitInstance: RetrofitInstance): ApiService{
        return retrofitInstance.api
    }
}