package app.ify.thepostapp.viewmodel

import androidx.lifecycle.ViewModel
import app.ify.thepostapp.repo.PostRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class PostViewModel @Inject constructor(
    private val postRepository: PostRepository
): ViewModel(){
}