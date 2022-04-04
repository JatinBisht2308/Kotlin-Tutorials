// Initialise a variable x = null and print the value as 0.0 while printing x using the Elvis
// operator.
fun main() {
    val list = mutableListOf(1, null, 2, 4, null, 6, 8, 10, null)
    list.add(7, 12)
    println(list.filterNotNull())
}
