import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.Column
import androidx.compose.material.Button

@Composable
fun Pet(){
    Column {
        Image("")
        Text("PET NAME")
        Text("Border")
        Text("Location")
    }

    Column {
        Text("Gender")
        Text("Age")
    }

    Column {
        Text("Describe")
        Button(onClick = { /* Do something! */ }, colors = ButtonDefaults.textButtonColors(
            backgroundColor = Color.Red
        )) {
            Text("Adopt")
        }
    }


}