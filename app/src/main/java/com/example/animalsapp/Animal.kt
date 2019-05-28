package com.example.animalsapp

import java.io.FileDescriptor

class Animal{

    var name:String?=null
    var descprtion:String?=null
    var image:Int?=null
    var isKiller:Boolean? = false

    constructor(name:String,descption:String,image:Int,isKiller:Boolean){
        this.name=name
        this.descprtion=descprtion
        this.image=image
        this.isKiller=isKiller

    }
}