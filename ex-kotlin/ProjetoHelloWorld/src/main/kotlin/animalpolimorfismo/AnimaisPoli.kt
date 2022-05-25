package animalpolimorfismo

fun main(){

    /*
    * 1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos
    * (observe a tabela), utilize os seus conhecimentos e distribua as características de forma que
    * tudo o que for comum a todos os animais fique na classe Animal.
    *
    * Animal - pai
    * Cachorro, Cavalo, Preguiça - filhos
    *
    * Atributos - nome, idade
    * Métodos, emitir som, correr e subir em árvores
    *
    * 2- Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior e invoque
    * o método que emite o som de cada um de forma polimórfica, isto é, independente do tipo de animal.
    *
    * link: https://docs.google.com/document/d/1dA7bYOjbK-bs41UL098wXxezcGvK4oMK/edit
    *
    * */

    // Instanciar os 3 tipos de animais
    var cachorro = Cachorro(
        "Billy",
        3
    )

    var cavalo = Cavalo(
        "Fumaça",
        10
    )

    var preguica = Preguica(
        "Vagarinho",
        5
    )

    // Invocar o método que emite o som dos 3
    cachorro.emitirSom()
    cavalo.emitirSom()
    preguica.emitirSom()




}