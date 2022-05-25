package classesabstratas

class Cachorro(orgaos: Boolean, tipoPele: String, carnivoro: Boolean, var raiva: Boolean, var adestravel: Boolean
) : Animal(orgaos, tipoPele, carnivoro) {

    fun latir(){
        println("Latindo")
    }

    fun afiarUnhas(){
        println("Afiando as unhas")
    }

    override fun correr(){
        super.correr()
        println("Latindo que nem louco pro motoqueiro")
    }

    fun proteger(){
        println("Protegendo como um cão leal.")
    }

    // Método abstrato sobrecrito da classe Animal,
    // pois cada especie de animal pula de forma diferente.
    override fun pular() {
        println("Pulando igual a um cachorro.")
    }



}