import java.util.stream.Collectors
import java.util.stream.IntStream
import java.util.stream.Stream



fun main(args : Array<String>) {
    var i:Int = 1
    i = 2
    println("Hello, World! ${i}")

//    i = "a";
    var s:String
    s = "bb"
    println(s)

    val arr = listOf(1,2,3)
    println(arr)
    val numere = arr.stream()
            .filter { n -> n % 2 == 0 }
            .map { n -> n * n }
            .collect(Collectors.toList())
    println(numere);

    val list = listOf("a", "b", "c")
    println(list)

    if (i == 2) {
        println("Halo");
    }
    for (j in numere) println(j)

    when {
        3 in numere -> println("gata cu switchul")
        else -> println("nada")
    }

    val ss = when (i) {
        1 -> "unu"
        2 -> "doi"
        4 -> "patru"
        else -> ":)"
    }
    println(ss)

    val k = if (i == 2) { "doi"} else { ":p" }


    println("is prime(2) = ${isPrime(2)}" )
    println("is prime(4) = ${isPrime(4)}" )

    IntStream.range(1,10).forEach{n->println(fib(n))}

    println(findPalindrome(listOf("13","23","131"))?.toUpperCase())
    println(findPalindrome(listOf("13","23"))?.toUpperCase())

    findPalindrome(listOf("13","23"))
    var eva = makeEva()

    eva?.oMetoda();
    val adam = Adam("CopiluMinune");
    adam.name = "Altu";
}

private fun makeEva():Eva? = if (Math.random()<.5) Eva() else null;

class Eva {
    fun oMetoda() = println("Eden")
}


class Adam {
    var name: String set(s:String) {
        field =s;
        println("Ma cheama mama")
    }

    constructor(name:String) {
        this.name = name
        println("Validari")
    }


}

fun printeazaNumar(s:String) = println(s)

fun isPrime(n:Int):Boolean {
    for (i in 2 .. n/2) {
        if (n % i == 0) {
            return false;
        }
    }
   return true
}

fun fib(n:Int):Int =
    if (n==1 || n == 2)
        {1}
    else
        {fib(n-1) + fib(n-2)}


fun findPalindrome(list:List<String>):String? {
    for (s in list) {
        if (s.equals(s.reversed())) {
            return s;
        }
    }
    return null;
}

