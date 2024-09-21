fun main() {
    println("Enter your string");
    val input = readln() ?: return;
    var reversed = "";

    for (i in input.length - 1 downTo 0) {
        reversed += input[i]
    }

    println("String reversed: $reversed")
}