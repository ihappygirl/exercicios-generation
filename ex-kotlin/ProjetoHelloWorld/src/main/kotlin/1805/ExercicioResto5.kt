fun main(){

    /*
    * 1- Informar todos os números de 1000 a 1999 que quando divididos por 11
    * obtemos resto = 5. (FOR)
    * */

    for (i in 1000..1999){

        if(i % 11 == 5) {
            println("$i")
        }
    }

}

