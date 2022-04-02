// String array ke bare ma 
import java.util.*;//to import all the libraries java has................................................................
public fun main()
{
    var strArray = arrayOf("Jatin","is","the","owner","of","<Code_Karle>")
    // get() function
    println(strArray.get(0))
    //size functions
    print("The size of this string array is:")
    println(strArray.size)
    // Arrays.toString() functions
    println(Arrays.toString(strArray))
    var str = Arrays.toString(strArray)
    println(str);
}