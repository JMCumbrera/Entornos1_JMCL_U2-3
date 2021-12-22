fun main() {
    var v1: MutableList<Int> = mutableListOf()
    var v2: MutableList<Int> = mutableListOf()

    println("======Primer vector======")
    println("Introduzca los números que desee añadir: ")
    print("\n")

    for (i in 0..4) {
        println("Número $i: ")
        var n1: Int = readLine()!!.toInt()
        v1.add(n1)
    }

    print("\n")
    println("======Segundo vector======")
    println("Introduzca los números que desee añadir: ")
    print("\n")

    for (i in 0..3) {
        println("Número $i: ")
        var n2: Int = readLine()!!.toInt()
        v2.add(n2)
    }

    var matriz2d = listOf<MutableList<Int>>(
        v1,
        v2
    )
    
    print("\n")
    println("Aquí tiene su matriz 2d: ")
    print("\n")

    for (i in 0..4) {
        print("${matriz2d[0][i]} ")
    }
    print("\n")
    for (j in 0..3) {
        print("${matriz2d[1][j]} ")
    }
}