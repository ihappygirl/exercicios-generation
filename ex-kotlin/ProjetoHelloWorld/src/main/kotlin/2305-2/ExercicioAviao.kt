fun main(){

    var aviao = Aviao(
        turbina = 2,
        asas = 2,
        cor = "Amarelo",
        tremPouso = true,
        modelo = "Gol"
    )

    aviao.ligarLuzes()

    aviao.voar()

    aviao.pousar()

    aviao.ligarLuzes()

}