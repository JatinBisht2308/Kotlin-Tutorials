public fun main() {
    val str = "Jatin Bisht" 
    // str.length function
    var length = str.length
    println(length)
    // str.get(index) fucntion
    println(str.get(4))
    // String template
    // instead of seperately calling the pre defined function what we can do is to
    println("The character at index 4 is ${str.get(4)}")
    println("The length of the string is ${str.length}")
    // .subSequence function 
    print(str.subSequence(0,5))
}