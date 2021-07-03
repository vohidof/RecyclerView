package Models

class User {
    var name: String? = null
    var imageAddress: Int? = null

    constructor(name: String?, imageAddress: Int?) {
        this.name = name
        this.imageAddress = imageAddress
    }

    constructor()
}