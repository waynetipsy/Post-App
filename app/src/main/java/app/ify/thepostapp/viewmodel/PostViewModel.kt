package app.ify.thepostapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.ify.thepostapp.repo.PostRepository
import app.ify.thepostapp.retrofit.Post
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

//Viewmodel updates when UI changes

@HiltViewModel
class PostViewModel @Inject constructor(
    private val postRepository: PostRepository
): ViewModel(){

    private val _posts = MutableStateFlow<List<Post>>(emptyList())
    val posts: StateFlow<List<Post>> get() = _posts

    init {
        fetchPosts()
    }

    private fun fetchPosts() {
        viewModelScope.launch {
                val posts = postRepository.getPosts()
                _posts.value = posts

        }
    }
}