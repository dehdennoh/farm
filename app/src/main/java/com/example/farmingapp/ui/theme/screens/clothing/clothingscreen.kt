package com.example.firebasestorage.ui.theme.screens.clothing

import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.InsertActivity
import com.example.firebasestorage.R
import com.example.firebasestorage.ui.theme.Bblue

@Composable
fun clothingscreen(navController: NavHostController) {

   val mContext = LocalContext.current


   Column (modifier = Modifier.fillMaxSize()){
   TopAppBar(title = { Text(text = "Clothing")},
      backgroundColor = Bblue)

   Box (modifier = Modifier
      .fillMaxWidth()
      .height(300.dp),
      contentAlignment = Alignment.BottomStart){

      Image(painter = painterResource(id =R.drawable.coat),
         contentDescription = "china",
         modifier = Modifier
            .clickable {
               Toast.makeText(
                  mContext,"Winter Collection", Toast.LENGTH_SHORT).show()

            }
            .fillMaxWidth(),
         contentScale = ContentScale.Crop
      )

     Column {
        Text(text = "WINTER COLLECTION",
           fontSize = 35.sp,
           fontWeight = FontWeight.ExtraBold,
           color = Color.Red
        )
        Text(text = "Purchase your products", fontSize = 20.sp, color = Color.White)
     }
   }
   //End of Box
   Spacer(modifier = Modifier.height(20.dp))

  Column(modifier = Modifier
     .verticalScroll(rememberScrollState())
     .padding(start = 20.dp)) {
     //Row 1
     Row {

        //Column
        Column {
           Image(painter = painterResource(id = R.drawable.shirtty), contentDescription = "shirt",
              modifier = Modifier.size(width = 180.dp, height = 200.dp),
              contentScale = ContentScale.Crop)

           Text(text = "Shirt", fontSize = 15.sp,)
           Text(text = "Ksh.1300", fontSize = 15.sp,)
         OutlinedButton(onClick = {
            val simToolKitLaunchIntent =
               mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }

         }) {
            Text(text = "Pay", color = Color.Black)

         }

        }

        Spacer(modifier = Modifier.width(10.dp))


        //Column
        Column {
           Image(painter = painterResource(id = R.drawable.shirtty), contentDescription = "shirt",
              modifier = Modifier.size(width = 180.dp, height = 200.dp),
              contentScale = ContentScale.Crop)

           Text(text = "Shirt", fontSize = 15.sp,)
           Text(text = "Ksh.5000", fontSize = 15.sp,)
           OutlinedButton(onClick = {
              val simToolKitLaunchIntent =
                 mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
              simToolKitLaunchIntent?.let { mContext.startActivity(it) }

           }) {
              Text(text = "Pay", color = Color.Black)

           }
           Button(onClick = {   mContext.startActivity(Intent(mContext, InsertActivity::class.java))
           }, ) {
              Text(text = "Next")
           }

        }
     }

     //Row 1
     Row {

        //Column
        Column {
           Image(painter = painterResource(id = R.drawable.shirtty), contentDescription = "shirt",
              modifier = Modifier.size(width = 180.dp, height = 200.dp),
              contentScale = ContentScale.Crop)

           Text(text = "Shirt", fontSize = 15.sp,)
           Text(text = "Ksh.1300", fontSize = 15.sp,)
           OutlinedButton(onClick = {
              val simToolKitLaunchIntent =
                 mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
              simToolKitLaunchIntent?.let { mContext.startActivity(it) }

           }) {
              Text(text = "Pay", color = Color.Black)

           }

        }

        Spacer(modifier = Modifier.width(10.dp))


        //Column
        Column {
           Image(painter = painterResource(id = R.drawable.shirtty), contentDescription = "shirt",
              modifier = Modifier.size(width = 180.dp, height = 200.dp),
              contentScale = ContentScale.Crop)

           Text(text = "Shirt", fontSize = 15.sp,)
           Text(text = "Ksh.5000", fontSize = 15.sp,)
           OutlinedButton(onClick = {
              val simToolKitLaunchIntent =
                 mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
              simToolKitLaunchIntent?.let { mContext.startActivity(it) }

           }) {
              Text(text = "Pay", color = Color.Black)

           }

        }
     }

     //Row 1
     Row {

        //Column
        Column {
           Image(painter = painterResource(id = R.drawable.shirtty), contentDescription = "shirt",
              modifier = Modifier.size(width = 180.dp, height = 200.dp),
              contentScale = ContentScale.Crop)

           Text(text = "Shirt", fontSize = 15.sp,)
           Text(text = "Ksh.1300", fontSize = 15.sp,)
           OutlinedButton(onClick = {  val simToolKitLaunchIntent =
              mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
              simToolKitLaunchIntent?.let { mContext.startActivity(it) }
           }) {
              Text(text = "Pay", color = Color.Black)

           }

        }

        Spacer(modifier = Modifier.width(10.dp))


        //Column
        Column {
           Image(painter = painterResource(id = R.drawable.shirtty), contentDescription = "shirt",
              modifier = Modifier.size(width = 180.dp, height = 200.dp),
              contentScale = ContentScale.Crop)

           Text(text = "Shirt", fontSize = 15.sp,)
           Text(text = "Ksh.5000", fontSize = 15.sp,)
           OutlinedButton(onClick = {  val simToolKitLaunchIntent =
              mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
              simToolKitLaunchIntent?.let { mContext.startActivity(it) }
           }) {
              Text(text = "Pay", color = Color.Black)

           }

        }
     }




  }




}
}

@Preview(showBackground = true)
@Composable
fun clothingscreenPreview() {
   clothingscreen(rememberNavController())
}