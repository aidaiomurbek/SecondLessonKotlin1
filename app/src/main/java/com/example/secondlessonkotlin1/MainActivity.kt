package com.example.secondlessonkotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val images = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSelectedUrl()
        setRandomImages()
        addImages()
    }

    private fun setSelectedUrl() {
        btn_submit.setOnClickListener {
            if (!edit_text.text.isNullOrEmpty()){
                val photo = edit_text.text.toString()
                images.add(photo)
                avatar.loadImage(photo)

            }

        }

    }

    private fun setRandomImages(){
        btn_random.setOnClickListener {
            avatar.loadImage(images.random())
        }
    }

    private fun addImages() {
        images.add("https://static4.depositphotos.com/1000423/454/i/950/depositphotos_4548401-stock-photo-symbol-of-yin-and-yang.jpg")
        images.add("https://upload.wikimedia.org/wikipedia/ru/thumb/7/78/Trollface.svg/1024px-Trollface.svg.png")
        images.add("https://jrnlst.ru/sites/default/files/covers/cover_6.jpg")
        images.add("https://icdn.lenta.ru/images/2019/03/26/16/20190326162206884/pic_bd71f6bf9ba8b1171285a305fa0f80cf.jpg")
        images.add("https://www.spletnik.ru/img/2020/03/yana/20200318-mem-2.jpg")
    }

}