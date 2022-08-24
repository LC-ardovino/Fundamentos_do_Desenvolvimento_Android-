package TP01

fun main(){
    var alfabeto = listOf("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z")
    println(convertePalavra("LUCAS",alfabeto))
    print("\n")
    println(convertePalavra("EDUARDO",alfabeto))

}



fun geraAssociacao(letras: List<String>): MutableMap<String, Int>{
    var i = 1
    var dicionario = mutableMapOf("0" to 0)
    while (i<=letras.size){
        dicionario.put(letras[i-1], i)
        i++
    }

    return dicionario
}


fun convertePalavra(palavra: String, letras: List<String>): String{
    var palavraOriginal = palavra
    var palavra = palavra.toLowerCase()
    palavra = retiraAcentos(palavra)

    var S = 0
    var r=0
    var mensagemFinal = "O valor de ${palavraOriginal} = "
    var dicionario = geraAssociacao(letras)
    while(r<=palavra.length-1){
        var dicionarioLetra = dicionario[palavra[r].toString()]
        var posicaoLetra = r+1
        var valorLetra = dicionarioLetra!!*posicaoLetra

        println("O valor da letra ${palavra[r]} eh ${valorLetra}")
        S+=valorLetra
        mensagemFinal+= valorLetra.toString() + " + "
        r=r+1
    }
    mensagemFinal = mensagemFinal.dropLast(2)
    mensagemFinal+= " = " +S.toString()

    return (mensagemFinal)
}


fun retiraAcentos(s: String):String{



    val chars: CharArray = s.toCharArray()

    var sb = StringBuilder(s)
    var cont: Int = 0

    while (chars.size > cont) {
        var c: kotlin.Char
        c = chars[cont]
        var c2:String = c.toString()

        c2 = c2.replace("á", "a")
        c2 = c2.replace("ã", "a")
        c2 = c2.replace("â", "a")
        c2 = c2.replace("é", "e")
        c2 = c2.replace("ê", "e")
        c2 = c2.replace("í", "i")
        c2 = c2.replace("î", "i")
        c2 = c2.replace("ó", "o")
        c2 = c2.replace("õ", "o")
        c2 = c2.replace("ô", "o")
        c2 = c2.replace("ç", "c")
        c2 = c2.replace("ú", "u")
        c2 = c2.replace("û", "u")


        c = c2.single()
        sb.setCharAt(cont, c)
        cont++

    }

    return sb.toString()

}


