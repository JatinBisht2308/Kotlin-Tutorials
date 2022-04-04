fun main() {
    var num1 = 100
    var num2 = 200
    var result:Int
    result = num1+num2
    println(result);

    result = num1%num2
    println(result);

    result = num1-num2
    println(result);

    result = num1*num2
    println(result);

    result = num1/num2
    println(result);
   
    var result2:Boolean

    result2 = num1>num2
    println(result2)

    result2 = num2>num1
     println(result2)

     var result3:Int
     num2-= num1
    println(num2)
     
    println(num1++)
    println(++num2)
}