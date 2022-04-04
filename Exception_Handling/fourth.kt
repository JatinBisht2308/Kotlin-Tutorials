// Lets see how to handle exceptions in kotlin
fun main() {
    val d = arrayOf(3, 4, 5, 6)

    try {
        d[4] = 7;
        println("I am try block code");
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("I am catch code");
    } finally {
        println("Element at index 2:" + d[2]);
    }
    // finally is optional we can also remove it and write the normal code
    println("Element at index 3:" + d[3]);
}
