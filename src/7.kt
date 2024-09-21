fun main() {
    println("Enter your integer");
    val n = readln().toInt();

    var number = n;

    for (i in 1 .. n) {
        println(number);
        number -= 1;
    }
}