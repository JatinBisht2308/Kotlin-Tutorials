// syntax of a function declaration
// fun functionName(variableIdentifier:datatype,variableIdentifier:datatype):returnType
// {
//     body of the function declaration
//     return statement
// }
// Here we are studying about the functions declerations in Kotlin lang......
public fun main(){
    println("Functions Declerations")
    val a = 10;
    val b = 20;
    // Calling a function with args as a and b
      println("Block Body calling-> " + sumBlock(a, b))
      println("Expression body calling-> "+ sumExpression(a, b))
    // Calling a function with no args
    noReturnBlock();
    // Calling a function with no args
    noReturnExpression();
}

// Function having Block Body and return type
fun sumBlock(a:Int,b:Int):Int {
    return a+b;
}

// Function having Expression Body and return type
fun sumExpression(a:Int,b:Int): Int = a+b;

// Function not having return type
fun noReturnBlock():Unit{
    println("No return function")
    println("Using Block Body")
}
// Functions having no return type using Expression body
fun noReturnExpression() = println("No return function with expression body")