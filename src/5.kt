fun main() {
    println("Enter your integer");
    val n = readln().toInt();

    if (n <= 0) {
        println("Your integer should to be positive");
        return;
    }

    var a = 0;
    var b = 1;

    for (i in 1 .. n) {
        print("$a ");
        val temp = a;
        a = b;
        b = temp + b;
    }
}