package TP01

fun main(){

    println("DropLast:\n")
    var lista = listOf(1,2,3)
    var lista2 = listOf("Maria","Joao","Cremilda","Jocelito")
    lista = lista.dropLast(1)
    lista2 = lista2.dropLast(2)
    println(lista)
    println(lista2)


    println("\nFilter:\n")
    var mapaOriginal = mapOf("a" to 1, "b" to 2, "c" to 3, "d" to 4)
    var mapaOriginal2 = mapOf("nome1" to "Joao", "nome2" to "Luiz", "nome3" to "Maria", "nome4" to "Jocelito")
    var novoMapa = mapaOriginal.filter{it.value%2==0}
    var novoMapa2 = mapaOriginal2.filter{it.value[0]=='J'}
    println(novoMapa)
    println(novoMapa2)


    println("\n Map: \n")
    var numeros = listOf(1, 2, 3,4,5)

    println(numeros.map{ 2*it - 1 })
    var nomes = listOf("JOAO","MARIA","JOSE")
    println(nomes.map{it + " é uma pessoa"})

}