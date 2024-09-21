fun main() {
    println("Enter two integers");
    val num1 = readln().toInt();
    val num2 = readln().toInt();

    var sum = 0;
    for (i in num1 .. num2) {
        if (i % 2 == 0) {
            sum += i;
        }
    }

    println("Sum: $sum");
}