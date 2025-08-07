package app.ify.thepostapp.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import app.ify.thepostapp.viewmodel.PostViewModel


@Composable
fun PostScreen(viewModel: PostViewModel = hiltViewModel()) {

    // Observing Stateflow or Flow data from ViewModel
    // it makes your compose UI react to flow changes
    val posts = viewModel.posts.collectAsState().value

    Column (modifier = Modifier.fillMaxSize()){
        Text(text = "Posts App \n Hilt + Retrofit + MVVM",
            modifier = Modifier.padding(top = 16.dp,
                start = 24.dp), fontSize = 32.sp)

        LazyColumn (modifier = Modifier.padding(16.dp)){
          items(posts){ post ->
              PostCard(post = post)
          }
        }
    }
}