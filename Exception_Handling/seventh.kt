// How to handle:Null values in array and list
fun main()
{
    val nullList = listOf(1 ,2 , 3 ,null , 4 , null ,5);
    val nullArrayList = arrayListOf(null,6,null,7,null,8,9,10);
    // How to print the arraylist and immutable list without printing the null value by using the function filterNotNull()
    println("The element of the immutable list without the null values are: ${nullList.filterNotNull()}");
    println("The element of the array list without the null values are: ${nullArrayList.filterNotNull()}");
}