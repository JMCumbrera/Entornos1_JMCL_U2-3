fun main() {
    val C1: Int = 5
    val C2: Int = 4

    println("======Primer vector======")
    println("Introduzca el tamaño del vector v1: ")
    val n1: Int = readLine()!!.toInt()
    val a1: Array<Int?> = arrayOfNulls(n1)
    print("\n")

    for (i in 0..a1.size - 1) {
        a1[i] = (2*i) + C1
    }

    print("\n")
    println("======Segundo vector======")
    println("Introduzca el tamaño del vector v2: ")
    val n2: Int = readLine()!!.toInt()
    val a2: Array<Int?> = arrayOfNulls(n2)
    print("\n")

    for (i in 0..a2.size - 1) {
        a2[i] = (2*i) + C2
    }

    val matriz2d = listOf<Array<Int?>>(
        a1,
        a2
    )
    
    print("\n")
    println("Aquí tiene su matriz 2d: ")
    print("\n")

    for (i in 0..a1.size - 1) {
        print("${matriz2d[0][i]} ")
    }
    print("\n")
    for (j in 0..a2.size - 1) {
        print("${matriz2d[1][j]} ")
    }
}