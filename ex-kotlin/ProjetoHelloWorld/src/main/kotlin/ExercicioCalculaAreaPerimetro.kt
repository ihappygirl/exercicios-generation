import kotlin.math.PI
import kotlin.math.pow

fun main() {

    // Programa que solicita ao usurário um diâmetro e calcula
    // a área e o perímetro de um círculo.

    print("Digite o diâmetro do círculo: ")
    var diametro = readln().toDouble()

    // Cálculo do raio:
    var raio = diametro / 2
    var raioFormatado = "%.2f".format(raio)

    // Cálculo da Área: π * r^2
    var area = PI * (raio.pow(2))
    var areaFormatado = "%.2f".format(area)

    // Cálculo do perímetro: P = 2 π . r
    var perimetro = 2 * PI * raio
    var perimetroFormatado = "%.2f".format(perimetro)

    // Output
    println("Diâmetro: $diametro")
    println("Raio: $raioFormatado")
    println("Área: $areaFormatado")
    println("Perímetro: $perimetroFormatado")



}
