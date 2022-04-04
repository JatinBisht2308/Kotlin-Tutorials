// 📓📓📓 How to use elvis operator?
fun main()
{
    var nullValue:String? = null
    println(nullValue?.length ?: "This is the length of the nullValue");
    // if nullValue have some length then print its length other wise print the statement
    nullValue = "Jatin";
    println(nullValue?.length ?: "This is the length of the null value");
}