package com.example.instaclone.Model

class User() {
    private var username : String = ""
    private var fullName : String = ""
    private var bio : String = ""
    private var image : String = ""
    private var uid : String = ""

//    constructor() : this()

    constructor(username : String, fullName : String,bio : String, image : String, uid : String) : this() {
        this.username = username
        this.fullName = fullName
        this.bio = bio
        this.uid = uid
        this.image = image
    }

    fun getUserName() : String{
        return username
    }
    fun setUserName(username: String){
        this.username = username
    }

    fun getFullName() : String{
        return fullName
    }
    fun setFullName(fullName: String){
        this.fullName = fullName
    }

    fun getBio() : String{
        return bio
    }
    fun setBio(bio: String){
        this.bio = bio
    }

    fun getUID() : String{
        return uid
    }
    fun setUID(uid: String){
        this.uid = uid
    }

    fun getImage() : String{
        return image
    }
    fun setImage(image: String){
        this.image = image
    }




}