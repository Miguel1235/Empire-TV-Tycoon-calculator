data class SubSpeciality(
    val subGenre: SubGenre,
    val loves: List<Audience> = listOf(),
    val likes: List<Audience> = listOf(),
    val neutral: List<Audience> = listOf(),
    val dislikes: List<Audience> = listOf(),
    val hates: List<Audience> = listOf(),
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