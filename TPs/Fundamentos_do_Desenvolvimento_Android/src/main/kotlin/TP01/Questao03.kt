package TP01

fun main(){
    val triangulo = listOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 0)
    val fibonacci = listOf(1, 1, 2, 3, 5, 8, 13, 21, 34)
    var vazio = listOf<Int>()
    println(maiorElemento(triangulo))
    println(maiorElemento(fibonacci))
    println(maiorElemento(vazio))
}

fun maiorElemento(L: List<Int>): String {
    if (L.size == 0){return "Não faz sentido"}

    var r = 0
    var Elemento = L[0]
    do{
        if (Elemento<L[r+1]){
            Elemento = L[r+1]
        }

        r+=1
    }
    while(r < L.size - 1 )

    var elementoString = Elemento.toString()

    return elementoString
}




