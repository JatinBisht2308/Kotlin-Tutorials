fun main()
{ 
    //📓📓📓📓📓 ? is null safety operator because compiler doesnt allow us to pass null to a variable so we use ?
    var nullValue:String? = null;
    println(nullValue);
    //  📓📓📓📓📓printing the length of the string (length print karane ke liya bhi ? use krne padega)
    println(nullValue?.length);

    // How we can print some message to the user rather than null when the value of a variable is null

}