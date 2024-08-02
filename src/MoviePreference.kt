data class MoviePreference(val audience: Audience, val genre: Genre, val emotion: Emotion)

fun howMuchLikes(spectators: List<Audience>, preferences: List<MoviePreference>): List<TotalScore> {
    var total = 0
    val scores: MutableList<TotalScore> = mutableListOf()
    for(genre in Genre.entries) {
        for(preference in preferences) {
            for(spectator in spectators) {
                if(preference.genre == genre && spectator == preference.audience) {
                    total += preference.emotion.value
                }
            }
        }
        scores.add(TotalScore(genre, total))
        total = 0
    }
    return scores.sortedBy { it.score }.reversed().take(3)
}

fun addSubGenres(movies: List<TotalScore>, subSpecialities: List<SubSpeciality>, audience: Audience) {
    val newScores: MutableList<TotalScore> = mutableListOf()
    for(movie in movies) {
        for(subspeciality in subSpecialities) {
            var score = movie.score
            if(subspeciality.loves.contains(audience)) score += 100
            if(subspeciality.likes.contains(audience)) score += 50
            if(subspeciality.dislikes.contains(audience)) score -= 60
            if(subspeciality.hates.contains(audience)) score -= 100
            newScores.add(TotalScore(genre = movie.genre, score = score, subspeciality.subGenre))
        }
    }
    newScores.sortedBy { it.score }.reversed().take(3).forEach { println("${it.genre}-${it.subGenre}: ${it.score}") }
}