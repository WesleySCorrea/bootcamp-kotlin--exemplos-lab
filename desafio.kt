enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("${usuario.nome} foi matriculado com sucesso")
    }
}

fun main() {
    val conteudo1 = ConteudoEducacional("Sintaxe Kotlin", 60)
    val formacao = Formacao("Kotlin", listOf(conteudo1))
    val usuario1 = Usuario("Wesley Silvestre Corrêa")
    formacao.matricular(usuario1)
}