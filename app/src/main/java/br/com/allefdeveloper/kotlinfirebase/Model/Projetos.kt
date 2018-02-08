package br.com.allefdeveloper.kotlinfirebase.Model

/**
 * Created by allef on 07/02/2018.
 */
class Projetos {
    var titulo:String? = null
    var descricao:String? = null
    var repositorioUri:String? = null
    var tecnologias:String? = null


    constructor(titulo:String?,descricao:String?,repositorioUri:String?,tecnologias:String?){
        this.titulo = titulo;
        this.descricao = descricao;
        this.repositorioUri = repositorioUri;
        this.tecnologias = tecnologias;
    }

    constructor()
}