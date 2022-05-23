class Aviao(
    var turbina: Int,
    var asas: Int,
    var cor: String,
    var tremPouso: Boolean,
    var modelo: String,
) {
    var voando = false
    var luzes = false

    // Métodos - voar, pousar, ligar as luzes
    fun voar(){
        if(voando){
            println("O avião já está no ar!")
        } else {
            voando = true
            println("O avião está começando a voar!")
        }
    }

    fun pousar(){
        if(voando){
            voando = false
            println("O avião acabou de pousar!")
        } else {
            println("O avião já está no chão!")
        }
    }

    fun ligarLuzes(){
        if(luzes){
            luzes = false
            println("Luzes estão desligadas!")
        } else {
            luzes = true
            println("Luzes estão ligadas!")
        }
    }







}