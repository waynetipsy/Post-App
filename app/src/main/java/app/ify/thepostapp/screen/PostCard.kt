package app.ify.thepostapp.screen
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import app.ify.thepostapp.retrofit.Post

@Composable
fun PostCard(post: Post){
    Card (modifier = Modifier.padding(vertical = 8.dp).fillMaxSize(),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(contentColor = Color.White  )

        ){
        Column (modifier = Modifier.padding(16.dp)){
          // Post Title

            Text(
                text = post.title,
                style = MaterialTheme.typography.titleMedium
                    .copy(fontWeight = FontWeight.Bold),
                color = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.height(8.dp))

            // Post Body
            Text(text = post.body,
                 style = MaterialTheme.typography.bodyMedium,
                 color = MaterialTheme.colorScheme.onSurface

                )
        }
    }
}