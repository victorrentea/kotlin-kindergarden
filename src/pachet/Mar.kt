package pachet

class Mar {
    // by default valurile sunt publice. ca daca tot e nemodificabil, she mai conteaza ?
    val soi = "Ionatan"

    var greutate = 4

    var viermishor: Viermishor? = Viermishor("Alexandra")

    // nu ai cum sa accesezi "direct" adevaratul camp privat.
    // ori de cate ori citesti/scrii campul, se cheama get() sau set() daca l-ai 'suprascris'
    var culoare = "verde"
//    get() = field.toUpperCase()
    set(value) {
        if (value.equals("rosu") && field.equals("verde")) {
            throw IllegalArgumentException("Nu sprayia marul")
        }
        field = value
    }

    fun matureaza() {
        culoare = when (culoare) {
            "verde" -> "galben"
            "galben" -> "rosu"
            else -> "transparent"
        }
    }

    operator fun inc(): Mar {
        matureaza()
        return this
    }

    operator fun plus(altul: Mar): Piure {
        return Piure()
    }
}

class Piure {

}

class Viermishor(val name: String?)