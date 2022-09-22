package TP01

fun main(){
    triangulo()
    fibonacci()
    vazio()
}

fun triangulo(){
    val triangulo = listOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 0)
    val firstTriangulo = triangulo.get(0)
    val lastTriangulo = triangulo.last()

    if(firstTriangulo<lastTriangulo){
        println("Infnet, o primeiro elemento da lista triangulo é maior.")
    }else{
        println("Tenfni")
    }
}

fun fibonacci(){
    val fibonacci = listOf(1, 1, 2, 3, 5, 8, 13, 21, 34)
    val firstFibonacci = fibonacci.get(0)
    val lastFibonacci = fibonacci.last()

    if(firstFibonacci<lastFibonacci){
        println("Infnet, o primeiro elemento da lista triangulo é menor que o ultimo.")
    }else{
        println("Tenfni")
    }
}

fun isEmpty(list: List<*>?): Boolean {
    return list == null || list.isEmpty()
}

fun vazio(){
    val list = listOf<Int>()

    val isEmpty = isEmpty(list)
    if (isEmpty) {
        println("A lista esta vazia")
    } else {
        println("A lista nao esta vazia")
    }
}
