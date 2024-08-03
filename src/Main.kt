fun main() {
    val empire = EmpireTv()

    val spectator = listOf(Audience.MEN, Audience.WOMEN,Audience.CHILDREN)

    val scores = empire.howMuchLikes(spectator, preferences)
    val scoresSubGenres = empire.addSubGenres(scores, subGenres, Audience.WOMEN)

    empire.printScores(scores)
    empire.printScores(scoresSubGenres)
}