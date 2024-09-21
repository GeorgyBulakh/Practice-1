//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Enter you integer");
    val number = readln().toInt();

    if (number % 2 == 0) {
        println("$number - even number");
    } else {
        println("$number - odd number");
    }
}