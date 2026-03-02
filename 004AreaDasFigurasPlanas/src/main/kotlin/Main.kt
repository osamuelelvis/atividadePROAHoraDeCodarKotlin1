fun main() {
    val opcao: Int
    println("Seja bem vindo a calculadora de áreas de figuras planas!")
    println("Digite um número para escolher a figura que quer calcular: ")
    println("1 - Retângulo")
    println("2 - Quadrado")
    println("3 - Losango")
    println("4 - Trapézio")
    println("5 - Paralelogramo")
    println("6 - Triângulo")
    println("7 - Círculo")
    opcao = readln().toInt()
    when (opcao) {
        1 -> areaRetangulo()
        2 -> areaQuadrado()
        3 -> areaLosango()
        4 -> areaTrapezio()
        5 -> areaParalelogramo()
        6 -> areaTriangulo()
        7 -> areaCirculo()
        else -> println("Opção inválida!")
    }
}

fun areaRetangulo() {
    print("Digite a base do retângulo: ")
    val base = readln().toDouble()
    print("Digite a altura do retângulo: ")
    val altura = readln().toDouble()
    val area = base * altura
    println("A área do retângulo é: $area")
}

fun areaQuadrado() {
    print("Digite o lado do quadrado: ")
    val lado = readln().toDouble()
    val area = lado * lado
    println("A área do quadrado é: $area")
}

fun areaLosango(){
    print("Digite a diagonal maior do losango: ")
    val diagonalMaior = readln().toDouble()
    print("Digite a diagonal menor do losango: ")
    val diagonalMenor = readln().toDouble()
    val area = (diagonalMaior * diagonalMenor) / 2
    println("A área do losango é $area")
}

fun areaTrapezio() {
    print("Digite a base maior do trapézio: ")
    val baseMaior = readln().toDouble()
    print("Digite a base menor do trapézio: ")
    val baseMenor = readln().toDouble()
    print("Digite a altura do trapézio: ")
    val altura = readln().toDouble()
    val area = ((baseMaior + baseMenor) * altura) / 2
    println("A área do trapézio é: $area")
}

fun areaParalelogramo() {
    print("Digite a base do paralelogramo: ")
    val base = readln().toDouble()
    print("Digite a altura do paralelogramo: ")
    val altura = readln().toDouble()
    val area = base * altura
    println("A área do paralelogramo é: $area")
}

fun areaTriangulo(){
    print("Digite a base do triângulo: ")
    val base = readln().toDouble()
    print("Digite a altura do triângulo: ")
    val altura = readln().toDouble()
    val area = (base * altura) / 2
    println("A área do triângulo é: $area")
}

fun areaCirculo(){
    val pi = 3.14
    print("Digite o raio do círculo: ")
    val raio = readln().toDouble()
    val area = pi * raio * raio
    println("A área do círculo é: $area")
}
