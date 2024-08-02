enum class Emotion(val value: Int) {
    LOVES(50),
    LIKES(30),
    NEUTRAL(0),
    DISLIKES(-40),
    HATES(-60)
}

enum class Genre {
    WESTERN,
    SPORT,
    ACTION,
    FANTASY,
    SCIENCE_FICTION,
    DRAMA,
    DOCUMENTARY,
    GAME_SHOW,
    MUSICAL,
    ROMANCE,
    HORROR,
    COMEDY
}

enum class Audience {
    WOMEN,
    ELDERS,
    MEN,
    CHILDREN,
    GEEKS,
    ROCKERS,
    LOVERS,
    ATHLETES,
}


enum class SubGenre {
    MATURE_AUDIENCE,
    ADULT,
    GLAMOUR,
    CARTOON,
    ANIME,
    DEFAULT
}

data class SubSpeciality(
    val subGenre: SubGenre,
    val loves: List<Audience> = listOf(),
    val likes: List<Audience> = listOf(),
    val neutral: List<Audience> = listOf(),
    val dislikes: List<Audience> = listOf(),
    val hates: List<Audience> = listOf(),
)


data class MoviePreference(val audience: Audience, val genre: Genre, val emotion: Emotion)

data class TotalScore(val genre: Genre, val score: Int, val subGenre: SubGenre = SubGenre.DEFAULT)

private fun howMuchLikes(spectators: List<Audience>, preferences: List<MoviePreference>): List<TotalScore> {
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

fun main() {
    val preferences: List<MoviePreference> = listOf(

        MoviePreference(Audience.MEN, Genre.ACTION, Emotion.LOVES),
        MoviePreference(Audience.LOVERS, Genre.ACTION, Emotion.HATES),
        MoviePreference(Audience.ROCKERS, Genre.ACTION, Emotion.LIKES),
        MoviePreference(Audience.CHILDREN, Genre.ACTION, Emotion.NEUTRAL),
        MoviePreference(Audience.ATHLETES, Genre.ACTION, Emotion.LOVES),
        MoviePreference(Audience.GEEKS, Genre.ACTION, Emotion.NEUTRAL),
        MoviePreference(Audience.ELDERS, Genre.ACTION, Emotion.NEUTRAL),
        MoviePreference(Audience.WOMEN, Genre.ACTION, Emotion.DISLIKES),


        MoviePreference(Audience.ROCKERS, Genre.COMEDY, Emotion.DISLIKES),
        MoviePreference(Audience.MEN, Genre.COMEDY, Emotion.NEUTRAL),
        MoviePreference(Audience.ATHLETES, Genre.COMEDY, Emotion.NEUTRAL),
        MoviePreference(Audience.GEEKS, Genre.COMEDY, Emotion.HATES),
        MoviePreference(Audience.ELDERS, Genre.COMEDY, Emotion.HATES),
        MoviePreference(Audience.LOVERS, Genre.COMEDY, Emotion.LIKES),
        MoviePreference(Audience.WOMEN, Genre.COMEDY, Emotion.LOVES),


        MoviePreference(Audience.LOVERS, Genre.DOCUMENTARY, Emotion.HATES),
        MoviePreference(Audience.WOMEN, Genre.DOCUMENTARY, Emotion.DISLIKES),
        MoviePreference(Audience.ATHLETES, Genre.DOCUMENTARY, Emotion.LIKES),
        MoviePreference(Audience.GEEKS, Genre.DOCUMENTARY, Emotion.LIKES),
        MoviePreference(Audience.ELDERS, Genre.DOCUMENTARY, Emotion.LOVES),




        MoviePreference(Audience.ELDERS, Genre.DRAMA, Emotion.LOVES),
        MoviePreference(Audience.WOMEN, Genre.DRAMA, Emotion.LOVES),
//        MoviePreference(Audience.ATHLETES, Genre.DRAMA, Emotion.LOVES),
        MoviePreference(Audience.ATHLETES, Genre.DRAMA, Emotion.LIKES),
        MoviePreference(Audience.LOVERS, Genre.DRAMA, Emotion.LOVES),
        MoviePreference(Audience.GEEKS, Genre.DRAMA, Emotion.DISLIKES),
        MoviePreference(Audience.CHILDREN, Genre.DRAMA, Emotion.DISLIKES),




        MoviePreference(Audience.LOVERS, Genre.FANTASY, Emotion.NEUTRAL),
        MoviePreference(Audience.ROCKERS, Genre.FANTASY, Emotion.LIKES),
        MoviePreference(Audience.CHILDREN, Genre.FANTASY, Emotion.LOVES),
        MoviePreference(Audience.GEEKS, Genre.FANTASY, Emotion.LOVES),
        MoviePreference(Audience.ATHLETES, Genre.FANTASY, Emotion.HATES),
        MoviePreference(Audience.MEN, Genre.FANTASY, Emotion.NEUTRAL),
        MoviePreference(Audience.WOMEN, Genre.FANTASY, Emotion.DISLIKES),
        MoviePreference(Audience.ELDERS, Genre.FANTASY, Emotion.HATES),



        MoviePreference(Audience.LOVERS, Genre.GAME_SHOW, Emotion.LIKES),
        MoviePreference(Audience.GEEKS, Genre.GAME_SHOW, Emotion.NEUTRAL),
        MoviePreference(Audience.WOMEN, Genre.GAME_SHOW, Emotion.LIKES),
        MoviePreference(Audience.CHILDREN, Genre.GAME_SHOW, Emotion.NEUTRAL),
        MoviePreference(Audience.ELDERS, Genre.GAME_SHOW, Emotion.LIKES),
        MoviePreference(Audience.MEN, Genre.GAME_SHOW, Emotion.DISLIKES),
        MoviePreference(Audience.ROCKERS, Genre.GAME_SHOW, Emotion.NEUTRAL),
        MoviePreference(Audience.ATHLETES, Genre.GAME_SHOW, Emotion.NEUTRAL),



        MoviePreference(Audience.GEEKS, Genre.HORROR, Emotion.LIKES),
        MoviePreference(Audience.ATHLETES, Genre.HORROR, Emotion.DISLIKES),
        MoviePreference(Audience.ELDERS, Genre.HORROR, Emotion.DISLIKES),
        MoviePreference(Audience.ROCKERS, Genre.HORROR, Emotion.LOVES),
        MoviePreference(Audience.MEN, Genre.HORROR, Emotion.LIKES),
        MoviePreference(Audience.LOVERS, Genre.HORROR, Emotion.LIKES),
        MoviePreference(Audience.WOMEN, Genre.HORROR, Emotion.LIKES),



        MoviePreference(Audience.WOMEN, Genre.MUSICAL, Emotion.LIKES),
        MoviePreference(Audience.CHILDREN, Genre.MUSICAL, Emotion.NEUTRAL),
        MoviePreference(Audience.ELDERS, Genre.MUSICAL, Emotion.NEUTRAL),
        MoviePreference(Audience.ROCKERS, Genre.MUSICAL, Emotion.LOVES),
        MoviePreference(Audience.ATHLETES, Genre.MUSICAL, Emotion.DISLIKES),
        MoviePreference(Audience.LOVERS, Genre.MUSICAL, Emotion.LIKES),



        MoviePreference(Audience.ATHLETES, Genre.ROMANCE, Emotion.NEUTRAL),
        MoviePreference(Audience.WOMEN, Genre.ROMANCE, Emotion.LIKES),
        MoviePreference(Audience.GEEKS, Genre.ROMANCE, Emotion.HATES),
        MoviePreference(Audience.ELDERS, Genre.ROMANCE, Emotion.LIKES),
        MoviePreference(Audience.ROCKERS, Genre.ROMANCE, Emotion.DISLIKES),
        MoviePreference(Audience.MEN, Genre.ROMANCE, Emotion.DISLIKES),
        MoviePreference(Audience.LOVERS, Genre.ROMANCE, Emotion.LOVES),
        MoviePreference(Audience.CHILDREN, Genre.ROMANCE, Emotion.DISLIKES),


        MoviePreference(Audience.LOVERS, Genre.SCIENCE_FICTION, Emotion.NEUTRAL),
        MoviePreference(Audience.ROCKERS, Genre.SCIENCE_FICTION, Emotion.NEUTRAL),
        MoviePreference(Audience.CHILDREN, Genre.SCIENCE_FICTION, Emotion.LIKES),
        MoviePreference(Audience.GEEKS, Genre.SCIENCE_FICTION, Emotion.LOVES),
        MoviePreference(Audience.ELDERS, Genre.SCIENCE_FICTION, Emotion.DISLIKES),
        MoviePreference(Audience.ATHLETES, Genre.SCIENCE_FICTION, Emotion.DISLIKES),


        MoviePreference(Audience.CHILDREN, Genre.SPORT, Emotion.NEUTRAL),
        MoviePreference(Audience.GEEKS, Genre.SPORT, Emotion.DISLIKES),
        MoviePreference(Audience.ATHLETES, Genre.SPORT, Emotion.LOVES),
        MoviePreference(Audience.ROCKERS, Genre.SPORT, Emotion.DISLIKES),
        MoviePreference(Audience.MEN, Genre.SPORT, Emotion.LOVES),
        MoviePreference(Audience.WOMEN, Genre.SPORT, Emotion.DISLIKES),
        MoviePreference(Audience.ELDERS, Genre.SPORT, Emotion.NEUTRAL),
        MoviePreference(Audience.LOVERS, Genre.SPORT, Emotion.NEUTRAL),


        MoviePreference(Audience.GEEKS, Genre.WESTERN, Emotion.LIKES),
        MoviePreference(Audience.ELDERS, Genre.WESTERN, Emotion.LOVES),
        MoviePreference(Audience.MEN, Genre.WESTERN, Emotion.LIKES),
        MoviePreference(Audience.WOMEN, Genre.WESTERN, Emotion.HATES),
        MoviePreference(Audience.ROCKERS, Genre.WESTERN, Emotion.NEUTRAL),
        MoviePreference(Audience.ATHLETES, Genre.WESTERN, Emotion.DISLIKES),

        )


    val subGenres: List<SubSpeciality> = listOf(
        SubSpeciality(SubGenre.DEFAULT),
        SubSpeciality(SubGenre.MATURE_AUDIENCE,
            likes = listOf(Audience.ELDERS, Audience.MEN, Audience.ROCKERS, Audience.GEEKS, Audience.LOVERS, Audience.WOMEN, Audience.ATHLETES),
            hates = listOf(Audience.CHILDREN)
        ),

        SubSpeciality(
            SubGenre.ADULT,
            loves = listOf(Audience.ELDERS),
            likes = listOf(Audience.MEN, Audience.ROCKERS, Audience.GEEKS),
            dislikes = listOf(Audience.LOVERS, Audience.WOMEN, Audience.ATHLETES),
            hates = listOf(Audience.CHILDREN)
        ),

        SubSpeciality(
            SubGenre.GLAMOUR,
            likes = listOf(Audience.LOVERS, Audience.WOMEN, Audience.ATHLETES, Audience.CHILDREN),
            dislikes = listOf(Audience.ELDERS, Audience.MEN, Audience.ROCKERS, Audience.GEEKS)
        ),

        SubSpeciality(
            SubGenre.CARTOON,
            loves = listOf(Audience.CHILDREN),
            likes = listOf(Audience.MEN, Audience.WOMEN, Audience.GEEKS),
            neutral = listOf(Audience.LOVERS, Audience.ROCKERS, Audience.ATHLETES),
            dislikes = listOf(Audience.ELDERS)
        ),
        SubSpeciality(
            SubGenre.ANIME,
            loves = listOf(Audience.GEEKS),
            likes = listOf(Audience.CHILDREN),
            neutral = listOf(Audience.MEN, Audience.LOVERS, Audience.ROCKERS, Audience.ATHLETES, Audience.WOMEN),
            dislikes = listOf(Audience.ELDERS)
        )
    )

    val movies = howMuchLikes(listOf(Audience.WOMEN, Audience.ATHLETES), preferences)

    movies.forEach { println("${it.genre}-${it.subGenre}: ${it.score}") }
//    addSubGenres(movies, subGenres, Audience.WOMEN)
}