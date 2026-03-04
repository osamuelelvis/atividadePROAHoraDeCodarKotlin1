// Escreva um programa em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".
fun main() {
    print("Digite seu nome: ")
    var nomeUsuario = readln()
    print("Digite usa idade: ")
    var idadeUsuario = readln().toInt()
    println("Olá $nomeUsuario, sua idade é $idadeUsuario anos.")
}
