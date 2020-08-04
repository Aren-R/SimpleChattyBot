package bot

import java.util.*
val scanner = Scanner(System.`in`)

fun main() {
    greeting()
    guess()
    count()
    question()
    test()
}

fun greeting() {
    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")
    println("What a great name you have, ${scanner.next()}")
}

fun guess() {
    println("Let me guess your age.")
    println("Tell me remainders of dividing your age by 3, 5 and 7.")
    val age = (scanner.nextInt() * 70 + scanner.nextInt() * 21 + scanner.nextInt() * 15) % 105
    println("Your age is $age; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    for (i in 0..scanner.nextInt()) { println("$i!") }
}

fun question() {
    println("Let's test your programming knowledge.")
    println("Why do we use methods?")
    println("1. To repeat a statement multiple times.")
    println("2. To decompose a program into several small subroutines.")
    println("3. To determine the execution time of a program.")
    println("4. To interrupt the execution of a program.")
}

fun test() {
    val ans = scanner.nextInt()
    if (ans != 2) {
        println("Please, try again.")
        test()
    } else end()
}

fun end() {
    println("Congratulations, have a nice day!") // Do not change this text
}