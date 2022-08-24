package TP01

fun main(){
    val triangulo = listOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 0)
    val fibonacci = listOf(1, 1, 2, 3, 5, 8, 13, 21, 34)
    var vazio = listOf<Int>()
    println(SomaEProduto(triangulo))
    println(SomaEProduto(fibonacci))


}

fun Produto(L: List<Int>): Int{
    var r = 0
    var P=1
    while(r<L.size){
        P*=L[r]
        r++
    }

    return P
}

fun Soma(L: List<Int>):Int{
    var r = 0
    var S=0
    while(r<L.size){
        S+=L[r]
        r++
    }

    return S
}

fun SomaEProduto(L:List<Int>): String{
    var Pares = mutableListOf<Int>()
    var Impares = mutableListOf<Int>()
    var r = 0
    do{
        if (L[r]%2 == 0){
            Pares.add(L[r])
        }else{
            Impares.add(L[r])
        }

        r++
    }while(r < L.size )
    var soma_pares =  Soma(Pares).toString()
    var Produto = Produto(Impares).toString()
    return("Soma dos numeros pares:$soma_pares.Produto dos numeros impares:$Produto")


}