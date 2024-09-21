fun main() {
    println("Enter your integer");
    val number = readln().toInt();

    var sum = 0;
    for (i in 1..number) {
        sum += i;
    }

    println("Sum of numbers from 1 to $number: $sum");
}