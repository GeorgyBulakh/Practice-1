fun main() {
    println("Enter your three integers");
    val num1 = readln().toInt();
    val num2 = readln().toInt();
    val num3 = readln().toInt();

    val min = minOf(num1, num2, num3);

    println("Minimum number: $min");
}