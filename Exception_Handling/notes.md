<!-- Errors -->
An error is a serious problem that does not let a program run.

<!-- Exceptions -->
An exception indicates condition that may or may not let the program run, basesd on the execution of the program.

<!-- How to handel exceptions in Kotlin -->
We can handle the exceptions in kotlin using the try-catch block.
You can see the fourth.kt

⚛⚛⚛⚛⚛Syntax of try-catch ⚛⚛⚛⚛⚛
try{
    <!-- block of code to monitor for errors -->
    <!-- the code you think can raise an exception -->
}
catch (e1: ExceptionType1)
{
    <!-- exception handler for ExceptionType1 -->
}
catch (e2: ExceptionType2)
{
    <!-- Exception handler for ExceptionType2 -->
}
<!-- optional -->
finally{
    <!-- block of code to be executed after try block ends -->
}
 
⚛⚛⚛⚛⚛ Null Pointer Exception ⚛⚛⚛⚛⚛
🔺 It is the most common and most occuring exception in an application.
🔺 A null pointer exception occurs when a compiler expects a value for a variable  but gets NUll or no value.

⚛⚛⚛⚛⚛ Null Safety Operator ⚛⚛⚛⚛⚛
🔺 A null safety operator is used to declare a variable whose value may be null.
🔺 We use it to avoid a Null Pointer Exception.


⚛⚛⚛⚛⚛ Elvis Operator (?:) ⚛⚛⚛⚛⚛
🔺 Elvis operator helps us in giving some message or default value to the user rather than printing the null value of a variable.