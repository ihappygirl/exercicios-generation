fun main (){

    val contas = mutableListOf(
        ContaBanco(
            "Henrique",
            "0000",
            "000-00",
            2000.00
        ),
        ContaBanco(
            "Henriqueeeee",
            "0000",
            "000-00",
            20000.00
        ),
        ContaBanco(
            "henrique",
            "0000",
            "000-00",
            1500.00
        )
    )

    contas.forEach {
        if(it.titular == "Henrique"){
            println(it)
        }
    }

}