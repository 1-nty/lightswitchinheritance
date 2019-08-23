val mainController:MutableList<Light> = mutableListOf()
var index = 0
open class Light(val id:Int, val location:String?=null){
    var isOn:Boolean
    open fun turnOn(){
        isOn = true
    }
    open fun turnOff(){
        isOn = false
    }
    init{
        isOn = true
        println("Light $index is created")
        mainController.add(this) 
        index++
    }
}
class smallLight(index:Int):Light(index){
 	//  
}
var light1 = smallLight(index)
var light2 = smallLight(index)
var light3 = smallLight(index)

fun main(args:Array<String>){
    for (i in 0..index-1){
        println(mainController[i].isOn)
    }
}
