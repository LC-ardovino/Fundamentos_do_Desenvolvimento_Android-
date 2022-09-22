package TP01

fun main(){
    print(fatorial(5))
}

fun fatorial(n:Int): Int{
    var fatorial = 1
    var i = 1
    do{
        fatorial = fatorial * i
        i++
    }while(i<=n)
    return fatorial
}

