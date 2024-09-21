fun main() {
    println("Enter your integer");
    val number = readln().toInt();

    if (number % 2 == 0) {
        println("$number - even number");
    } else {
        println("$number - odd number");
    }
}