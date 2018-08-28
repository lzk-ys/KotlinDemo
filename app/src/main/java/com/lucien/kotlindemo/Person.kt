package com.lucien.kotlindemo

/**
 * Created by lucien on 22/08/2018.
 */
class Person(var name: String, var age: Int){
    // secondary constructor
    constructor(name: String, age: Int = 0, birthday: String = ""):this(name, age){
        println(" --- Person secondary constructor --- ")
    }
}