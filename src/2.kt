fun main() {
    println("Enter your three integers");
    val num1 = readln().toInt();
    val num2 = readln().toInt();
    val num3 = readln().toInt();

    var min = 0;

    if (num1 <= num2 && num1 <= num3) {
        min = num1;
    } else if (num2 <= num1 && num2 <= num3) {
        min = num2;
    } else {
        min = num3;
    }

    println("Minimum number: $min");
}