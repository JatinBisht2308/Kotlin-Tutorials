// How to declare and print the values of array in Kotlin
public fun main() {
    var arr = arrayOf(1,2,3,4,5)
    println(arr[0])
    val arr_2 = arrayOf(10,11,12,13)
    arr = arr_2
     println(arr[0])
     var arr3 = arrayOf("jatin","bisht")
     println(arr3[0])
     var arr4 = arrayOf("Jatin",20,true,"H")
     println(arr4[0])
     println(arr4[1])
     println(arr4[2])
     println(arr4[3])
     var arr5:Array<String> = arrayOf("Jatin","hi","bhai")//we can also declare like this

}