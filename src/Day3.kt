import pachet.Mar
import pachet.Viermishor

fun main(args: Array<String>) {

    var mar = Mar()
    println(mar.soi)
//    mar.soi="zombie"; final field

    println(mar.greutate)
    mar.greutate++
    println(mar.greutate)

    try {
        mar.culoare = "rosu" // arunca exceptie
    } catch (e: Exception) {
        //shaorma se inghite
    }

//    mar.matureaza()
    mar++
    println(mar.culoare)

//    mar.matureaza()
    mar++
    println(mar.culoare)

    val unu = Integer.toString(1123123213) + ""
    val unuPrim = Integer.toString(1123123213) + ""

    // Note that the `==` operator in Kotlin code is translated into a call to [equals] when objects on both sides of the
    //     * operator are not null.
    println(unu == unuPrim)


    // operator overloading
    println(Mar() + Mar())

    neJucamCuNullu()
}


fun neJucamCuNullu() {
    val mar = Mar()
    mar.matureaza()
    mar.viermishor = Viermishor("Victor")

//    mar.viermishor = null // pesticide

    scoateViermisor(Viermishor("Bianca"))
    scoateViermisor(mar.viermishor) // Optional

//    Optional<Ceva> optCeva;
//    optCeva.map
    mar.viermishor?.let { admiraViermishor(it) }

    mar.viermishor = Viermishor(null)
    mar.viermishor?.let { admiraViermishor(it) }
}

fun scoateViermisor(viermisor: Viermishor?) {
    // imi asum! pot sa primesc sau nu un VIERMISHOR
    println(viermisor?.name?.toUpperCase())
}

fun admiraViermishor(viermishorPrezent: Viermishor) {
    println(viermishorPrezent.name!!.toUpperCase())
}
