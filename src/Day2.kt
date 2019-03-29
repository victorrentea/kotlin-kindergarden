import java.util.*

fun main(args : Array<String>) {

    var i = 1
    i =2

    println("Cat o fi i " + i)

    val j = 2

    val list2 = Arrays.asList(1,2,3)
    list2.stream()
//            .filter{ n -> n % 2 == 0 }
            .filter{ it % 2 == 0 }
            .forEach(System.out::println);

    // final int n =2
    val n = 2
    val x = when (n) {
        1 -> "1"
        2 -> "2"
        else -> "nustiu"
    }
    println("x = ${x + 1}")

    val culoare = if (n==2) "alba" else "neagra"

    println(culoare)

    for (ni in list2) println(ni)

    println(altaFunctie("123"))
    iartamaDoamne();
}

fun altaFunctie(s:String):Int = Integer.parseInt(s)

// se da o lista de numere. Sa se construiasca arborele binar care are acele frunze
//  4 5 6 1 2 3

class Node(nDeConstructor: Int) {
    var n:Int= nDeConstructor
        set(altCamp) {
            println("Validari tata")
        field = altCamp //field inseamna n
    }
    var left:Node? = null
    var right:Node? = null

    init {
        println("Hello world " + nDeConstructor)
    }
}

fun parseTree(numbers:List<Int>):Node {
    val root = Node(numbers[0])
    for (i in 1 until numbers.size) {
        println(numbers[i])
        // recursiv insera
        insert(root, numbers[i])
    }

    return root
}

fun insert(ancestor:Node, toInsert:Int) {
//    if (ancestor == null) - nu merge
//    if (toInsert < ancestor.n) {
//        if (ancestor.left == null)
//            ancestor.left = Node(toInsert)
//        else
//            insert(ancestor.left, toInsert)
//    }
}

fun iartamaDoamne() {
    val node = Node(2)
//    println(node.n)
    node.n=3
//    println("astept 1 " + node.campVizibil)
////    node.camp = 7
//    println("astept 7 " + node.camp)

    println(ClasaDoarCuGetterPeUnCamp().campVizibil)
//     ClasaDoarCuSetter().campVizibil = 1
//     ClasaDoarCuSetter().campVizibil
    parseTree(Arrays.asList(4,5,6,1,2,3))
    ClasaDoarCuGetterPeUnCamp().campPeBuneFinal
    ClasaDoarCuGetterPeUnCamp().campVizibil

}

class ClasaDoarCuGetterPeUnCamp {
    private var camp:Int = 1


    val campPeBuneFinal = 7

    // asta NU e acelasi lucru cu final int campVizibil!
    val campVizibil
    get() = camp
}

// NU MERGE
//class ClasaDoarCuSetter {
//    var campVizibil = 1
//    get() = throw NotImplementedError() // motiv de concediere
//    set
//
//}
