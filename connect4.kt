import java.util.Scanner

fun main(args: Array<String>){
    val reader = Scanner(System.`in`)

    println("enter first numeber to add:")

    var input1:Int = reader.nextInt()

    println("You entered: $input1")

    println("enter second number to add:")

    var input2:Int = reader.nextInt()

    println("You ebtered: $input2")
    
    var output:Int = input1 + input2

    println("The sum is: $output")

}