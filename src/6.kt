fun main() {
    println("Enter your integer");
    val number = readln().toInt();

    if (number < 2) {
        return;
    }

    var isPrime = true;

    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) {
            isPrime = false;
            break;
        }
    }

    if (isPrime) {
        println("$number is prime number");
    } else {
        println("$number is not prime number");
    }
}