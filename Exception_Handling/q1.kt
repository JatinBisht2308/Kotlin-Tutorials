fun main()
{
    // write your code here
    var arr = arrayOf(0, 100, 200, 300, 400, 500);
    try {
        println(arr[6]);
    } catch(e: ArrayIndexOutOfBoundsException){
        println("6 index doesnt exist!!!!!1");
    }
}
