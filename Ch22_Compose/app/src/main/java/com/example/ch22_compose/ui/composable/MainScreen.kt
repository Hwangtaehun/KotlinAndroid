package com.example.ch22_compose.ui.composable

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.ch22_compose.MyApplication
import com.example.ch22_compose.model.ItemModel
import com.example.ch22_compose.model.PageListModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@SuppressLint("UnrememberedMutableState")
@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val datas = mutableStateOf(listOf<ItemModel>())

    LaunchedEffect(true) {
        val call: Call<PageListModel> = MyApplication.networkService.getList(
            MyApplication.QUERY,
            MyApplication.API_KEY,
            1,
            10
        )
        call?.enqueue(object : Callback<PageListModel>{
            override fun onResponse(call: Call<PageListModel>, response: Response<PageListModel>) {
                if(response.isSuccessful){
                    datas.value = response.body()?.articles ?: listOf()
                }
            }

            override fun onFailure(call: Call<PageListModel>, t: Throwable) {
                Log.d("kkang", "error.....")
            }
        })
    }

    LazyColumn(modifier = modifier) {
        itemsIndexed(datas.value) { index, item ->
            Item(item)
            if(index < datas.value.lastIndex) {
                HorizontalDivider(thickness = 1.dp, color = Color.Black)
            }
        }
    }
}