package TP01

fun main() {
    var triangulo = listOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 0)
    var fibonacci = listOf(1, 1, 2, 3, 5, 8, 13, 21, 34)
    var vazio = listOf<Int>()
    var pessoal = listOf(1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 4, 15, 21, 121, 169)
    println(zeroUms(triangulo))
    println(zeroUms(fibonacci))
    println(zeroUms(vazio))
    println(zeroUms(pessoal))

}

fun ehPrimo(n: Int): Boolean{
    var i=2
    var k = 0
    if (n==1){
        return false
    }

    if(n%2==0){
        k = n/2
    }
    else{
        k = (n+1)/2
    }

    while(i<=k || k==0){
        if (n%i==0){
            return false
        }
        i++
    }

    return true

}


fun zeroUms(L: List<Int>): String{

    if (L.size == 0){
        return ("não faz sentido")
    }

    var r = 0
    var listaZerosUms = mutableListOf<Int>()
    while(r<=L.size-1){
        if (ehPrimo(L[r])==true){
            listaZerosUms.add(1)
        }
        else{
            listaZerosUms.add(0)
        }
        r++
    }
    return listaZerosUms.toString()

}
