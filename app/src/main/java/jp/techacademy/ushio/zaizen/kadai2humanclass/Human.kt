package jp.techacademy.ushio.zaizen.kadai2humanclass

import android.util.Log

open class Human: Animal,Thinkable{
    constructor(name:String, age:Int, hobby:String) :super(name,age, hobby){
        this.name=name
        this.age=age
        this.hobby=hobby
    }
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。" + "年は" + this.age + "歳です。")
    }
    override fun think(){
        Log.d("kotlintest","私は"+this.hobby+"について考える。")
    }
}