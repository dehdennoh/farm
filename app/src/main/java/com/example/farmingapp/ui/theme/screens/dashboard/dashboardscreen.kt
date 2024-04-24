package com.example.firebasestorage.ui.theme.screens.dashboard

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
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.R
import com.example.firebasestorage.navigation.ROUT_CLOTHING
import com.example.firebasestorage.ui.theme.Bblue

@Composable
fun dashboardscreen(navController: NavHostController){

    Column(modifier = Modifier.fillMaxSize()) {

        TopAppBar(
            title = { Text(text = "Amazon Shop") },
            backgroundColor = Bblue
        )
        //End of Top App Bar
        Spacer(modifier = Modifier.height(30.dp))
        
        Row(modifier = Modifier.padding(20.dp)) {
            Column {
                Text(text = "Amazon", fontSize = 30.sp, color = Bblue)
                Text(text = "Shop from A to Z")
            }
            Spacer(modifier = Modifier.width(80.dp))


            Image(painter = painterResource(id = R.drawable.amazon),
                contentDescription ="Amazon",
                modifier = Modifier.size(100.dp))
            
        }
        //End of Row
        Spacer(modifier = Modifier.height(25.dp))
 
        Column(modifier = Modifier.padding(start = 20.dp),) {
            //Row1
            val mContext = LocalContext.current
            Row {
                Card (modifier = Modifier.clickable {
                    navController.navigate(ROUT_CLOTHING)
                    Toast.makeText(
                        mContext,"Opening Clothscreen",Toast.LENGTH_SHORT).show()

                }
                    .size(width = 160.dp, height = 120.dp), elevation = 15.dp) {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){

                            Image(painter = painterResource(id = R.drawable.img),
                                contentDescription ="Amazon",
                                modifier = Modifier.size(50.dp))

                        }
                        Text(text = "Clothing", fontSize = 30.sp,
                            color = Bblue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }
                }
                Spacer(modifier = Modifier.width(25.dp))


                Card (modifier = Modifier.size(width = 160.dp, height = 120.dp),elevation = 15.dp) {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){

                            Image(painter = painterResource(id = R.drawable.img_1),
                                contentDescription ="Amazon",
                                modifier = Modifier.size(50.dp))

                        }
                        Text(text = "Electronics", fontSize = 30.sp,
                            color = Bblue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }
                }
            }

            //End of Row1

            Spacer(modifier = Modifier.height(20.dp))


            //Row2
            Row {
                Card (modifier = Modifier.size(width = 160.dp, height = 120.dp), elevation = 15.dp) {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){

                            Image(painter = painterResource(id = R.drawable.home),
                                contentDescription ="Amazon",
                                modifier = Modifier.size(50.dp))

                        }
                        Text(text = "Home", fontSize = 30.sp,
                            color = Bblue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }
                }
                Spacer(modifier = Modifier.width(25.dp))


                Card (modifier = Modifier.size(width = 160.dp, height = 120.dp),elevation = 15.dp) {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){

                            Image(painter = painterResource(id = R.drawable.img_2),
                                contentDescription ="Amazon",
                                modifier = Modifier.size(50.dp))

                        }
                        Text(text = "Beauty", fontSize = 30.sp,
                            color = Bblue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }
                }
            }

            //End of Row2


            Spacer(modifier = Modifier.height(25.dp))


            //Row3
            Row {
                Card (modifier = Modifier.size(width = 160.dp, height = 120.dp), elevation = 15.dp) {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){

                            Image(painter = painterResource(id = R.drawable.img_3),
                                contentDescription ="Amazon",
                                modifier = Modifier.size(50.dp))

                        }
                        Text(text = "Pharmacy", fontSize = 30.sp,
                            color = Bblue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }
                }
                Spacer(modifier = Modifier.width(25.dp))


                Card (modifier = Modifier.size(width = 160.dp, height = 120.dp),elevation = 15.dp) {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){

                            Image(painter = painterResource(id = R.drawable.img_4),
                                contentDescription ="Amazon",
                                modifier = Modifier.size(50.dp))

                        }
                        Text(text = "Groceries", fontSize = 30.sp,
                            color = Bblue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }
                }
            }

            //End of Row3


        }





























    }

}

@Preview(showBackground = true,)
@Composable
fun dashboardscreenpreview(){
    dashboardscreen(rememberNavController())


}