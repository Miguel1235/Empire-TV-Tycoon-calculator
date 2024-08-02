fun main() {
    val movies = howMuchLikes(listOf(Audience.MEN, Audience.WOMEN), preferences)

    movies.forEach { println("${it.genre}-${it.subGenre}: ${it.score}") }
//    addSubGenres(movies, subGenres, Audience.WOMEN)
}