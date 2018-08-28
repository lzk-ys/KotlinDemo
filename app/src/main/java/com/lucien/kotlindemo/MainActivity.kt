package com.lucien.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // is or !is  --  instanceof
    //Kotlin 没有基本数据类型
    //在 Kotlin 中，三个等号 === 表示比较对象地址，两个 == 表示比较两个值大小。

    var a = "Hello, Lucien"
    private lateinit var mTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mTextView = findViewById<TextView>(R.id.main_tv_text)
        mTextView.setText(a)

        val items = listOf<String>("Tom","Jack","Lucien")
        for(item in items){

        }

        for (x in 1..10 step 2) {
            print(x)
        }
        println()
        for (x in 9 downTo 0 step 3) {
            print(x)
        }

        foo(strings = *arrayOf("a", "b", "c"))
        foo("a", "b", "c")

        val onClick: (A: Int,B: Int) -> Unit

        // 匿名函数
        val dd = fun(s: String): Int { return s.toIntOrNull() ?: 0 }

    }

    fun max(a: Int, b: Int) = if (a > b) a else b

    fun sum(a: Int, b: Int): Int{
        return a + b
    }

    fun sum2(a: Int, b: Int) = a + b

    val sum3 = { x: Int, y: Int -> x + y }

    val sum4: (Int, Int) -> Int = { x, y -> x + y }

    // Unit 返回类型可以省略
    fun printSum(a: Int, b: Int){
        println("sum of $a and $b is ${a+b}")
    }

    // Return null if str does not hold a number
    fun parseInt(str: String): Int? {
        try {
            return str.toInt()
        } catch (e: NumberFormatException) {
            println("One of the arguments isn't Int")
        }
        return null
    }

    /**
     * is-checked and smart cases
     * If we is-checked an immutable local variable or property, there's no need
     * to cast it explicitly to the is-checked type.
     */
    fun getStringLength(obj: Any): Int? {
        if (obj is String)
            return obj.length // no cast to String is needed
        return null
    }

    // 可变参数
    fun foo(vararg strings: String) {
        for( str in strings){
            println(str)
        }
    }

    fun cases(obj: Any) {
        when (obj) {
            1 -> println("One")
            "Hello" -> println("Greeting")
            is Long -> println("Long")
            !is String -> println("Not a string")
            else -> println("Unknown")
        }
    }
}
