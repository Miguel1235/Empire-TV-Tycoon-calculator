val preferences: List<MoviePreference> = listOf(
    // action
    MoviePreference(Audience.MEN, Genre.ACTION, Emotion.LOVES),
    MoviePreference(Audience.WOMEN, Genre.ACTION, Emotion.DISLIKES),
    MoviePreference(Audience.CHILDREN, Genre.ACTION, Emotion.NEUTRAL),
    MoviePreference(Audience.ELDERS, Genre.ACTION, Emotion.NEUTRAL),
    MoviePreference(Audience.LOVERS, Genre.ACTION, Emotion.HATES),
    MoviePreference(Audience.ROCKERS, Genre.ACTION, Emotion.LIKES),
    MoviePreference(Audience.ATHLETES, Genre.ACTION, Emotion.LIKES),
    MoviePreference(Audience.GEEKS, Genre.ACTION, Emotion.NEUTRAL),

    // comedy
    MoviePreference(Audience.MEN, Genre.COMEDY, Emotion.NEUTRAL),
    MoviePreference(Audience.WOMEN, Genre.COMEDY, Emotion.LOVES),
    MoviePreference(Audience.CHILDREN, Genre.ACTION, Emotion.LIKES),
    MoviePreference(Audience.ELDERS, Genre.COMEDY, Emotion.HATES),
    MoviePreference(Audience.LOVERS, Genre.COMEDY, Emotion.NEUTRAL),
    MoviePreference(Audience.ROCKERS, Genre.COMEDY, Emotion.DISLIKES),
    MoviePreference(Audience.ATHLETES, Genre.COMEDY, Emotion.NEUTRAL),
    MoviePreference(Audience.GEEKS, Genre.COMEDY, Emotion.DISLIKES),


    // documentary
    MoviePreference(Audience.MEN, Genre.DOCUMENTARY, Emotion.NEUTRAL),
    MoviePreference(Audience.WOMEN, Genre.DOCUMENTARY, Emotion.DISLIKES),
    MoviePreference(Audience.CHILDREN, Genre.DOCUMENTARY, Emotion.DISLIKES),
    MoviePreference(Audience.ELDERS, Genre.DOCUMENTARY, Emotion.LOVES),
    MoviePreference(Audience.LOVERS, Genre.DOCUMENTARY, Emotion.HATES),
    MoviePreference(Audience.ROCKERS, Genre.DOCUMENTARY, Emotion.NEUTRAL),
    MoviePreference(Audience.ATHLETES, Genre.DOCUMENTARY, Emotion.LIKES),
    MoviePreference(Audience.GEEKS, Genre.DOCUMENTARY, Emotion.LIKES),



    // drama
    MoviePreference(Audience.MEN, Genre.DRAMA, Emotion.HATES),
    MoviePreference(Audience.WOMEN, Genre.DRAMA, Emotion.LOVES),
    MoviePreference(Audience.CHILDREN, Genre.DRAMA, Emotion.DISLIKES),
    MoviePreference(Audience.ELDERS, Genre.DRAMA, Emotion.LIKES),
    MoviePreference(Audience.LOVERS, Genre.DRAMA, Emotion.LIKES),
    MoviePreference(Audience.ROCKERS, Genre.DRAMA, Emotion.DISLIKES),
    MoviePreference(Audience.ATHLETES, Genre.DRAMA, Emotion.LIKES),
    MoviePreference(Audience.GEEKS, Genre.DRAMA, Emotion.DISLIKES),


    // fantasy
    MoviePreference(Audience.MEN, Genre.FANTASY, Emotion.NEUTRAL),
    MoviePreference(Audience.WOMEN, Genre.FANTASY, Emotion.DISLIKES),
    MoviePreference(Audience.CHILDREN, Genre.FANTASY, Emotion.LOVES),
    MoviePreference(Audience.ELDERS, Genre.FANTASY, Emotion.HATES),
    MoviePreference(Audience.LOVERS, Genre.FANTASY, Emotion.NEUTRAL),
    MoviePreference(Audience.ROCKERS, Genre.FANTASY, Emotion.LIKES),
    MoviePreference(Audience.ATHLETES, Genre.FANTASY, Emotion.HATES),
    MoviePreference(Audience.GEEKS, Genre.FANTASY, Emotion.LOVES),


    // game show
    MoviePreference(Audience.MEN, Genre.GAME_SHOW, Emotion.DISLIKES),
    MoviePreference(Audience.WOMEN, Genre.GAME_SHOW, Emotion.LIKES),
    MoviePreference(Audience.CHILDREN, Genre.GAME_SHOW, Emotion.NEUTRAL),
    MoviePreference(Audience.ELDERS, Genre.GAME_SHOW, Emotion.LIKES),
    MoviePreference(Audience.LOVERS, Genre.GAME_SHOW, Emotion.LIKES),
    MoviePreference(Audience.ROCKERS, Genre.GAME_SHOW, Emotion.NEUTRAL),
    MoviePreference(Audience.ATHLETES, Genre.GAME_SHOW, Emotion.NEUTRAL),
    MoviePreference(Audience.GEEKS, Genre.GAME_SHOW, Emotion.NEUTRAL),


    // horror
    MoviePreference(Audience.MEN, Genre.HORROR, Emotion.LIKES),
    MoviePreference(Audience.WOMEN, Genre.HORROR, Emotion.NEUTRAL),
    MoviePreference(Audience.CHILDREN, Genre.HORROR, Emotion.HATES),
    MoviePreference(Audience.ELDERS, Genre.HORROR, Emotion.DISLIKES),
    MoviePreference(Audience.LOVERS, Genre.HORROR, Emotion.LIKES),
    MoviePreference(Audience.ROCKERS, Genre.HORROR, Emotion.LOVES),
    MoviePreference(Audience.ATHLETES, Genre.HORROR, Emotion.DISLIKES),
    MoviePreference(Audience.GEEKS, Genre.HORROR, Emotion.NEUTRAL),


    // musical
    MoviePreference(Audience.MEN, Genre.MUSICAL, Emotion.HATES),
    MoviePreference(Audience.WOMEN, Genre.MUSICAL, Emotion.LIKES),
    MoviePreference(Audience.CHILDREN, Genre.MUSICAL, Emotion.NEUTRAL),
    MoviePreference(Audience.ELDERS, Genre.MUSICAL, Emotion.NEUTRAL),
    MoviePreference(Audience.LOVERS, Genre.MUSICAL, Emotion.LIKES),
    MoviePreference(Audience.ROCKERS, Genre.MUSICAL, Emotion.LOVES),
    MoviePreference(Audience.ATHLETES, Genre.MUSICAL, Emotion.DISLIKES),
    MoviePreference(Audience.GEEKS, Genre.MUSICAL, Emotion.HATES),

    // romance
    MoviePreference(Audience.MEN, Genre.ROMANCE, Emotion.DISLIKES),
    MoviePreference(Audience.WOMEN, Genre.ROMANCE, Emotion.LIKES),
    MoviePreference(Audience.CHILDREN, Genre.ROMANCE, Emotion.DISLIKES),
    MoviePreference(Audience.ELDERS, Genre.ROMANCE, Emotion.LIKES),
    MoviePreference(Audience.LOVERS, Genre.ROMANCE, Emotion.LOVES),
    MoviePreference(Audience.ROCKERS, Genre.ROMANCE, Emotion.DISLIKES),
    MoviePreference(Audience.ATHLETES, Genre.ROMANCE, Emotion.NEUTRAL),
    MoviePreference(Audience.GEEKS, Genre.ROMANCE, Emotion.HATES),


    // sci-fi
    MoviePreference(Audience.MEN, Genre.SCIENCE_FICTION, Emotion.LIKES),
    MoviePreference(Audience.WOMEN, Genre.SCIENCE_FICTION, Emotion.HATES),
    MoviePreference(Audience.CHILDREN, Genre.SCIENCE_FICTION, Emotion.LIKES),
    MoviePreference(Audience.ELDERS, Genre.SCIENCE_FICTION, Emotion.DISLIKES),
    MoviePreference(Audience.LOVERS, Genre.SCIENCE_FICTION, Emotion.NEUTRAL),
    MoviePreference(Audience.ROCKERS, Genre.SCIENCE_FICTION, Emotion.NEUTRAL),
    MoviePreference(Audience.ATHLETES, Genre.SCIENCE_FICTION, Emotion.DISLIKES),
    MoviePreference(Audience.GEEKS, Genre.SCIENCE_FICTION, Emotion.LOVES),


    // sport
    MoviePreference(Audience.MEN, Genre.SPORT, Emotion.LOVES),
    MoviePreference(Audience.WOMEN, Genre.SPORT, Emotion.NEUTRAL),
    MoviePreference(Audience.CHILDREN, Genre.SPORT, Emotion.NEUTRAL),
    MoviePreference(Audience.ELDERS, Genre.SPORT, Emotion.NEUTRAL),
    MoviePreference(Audience.LOVERS, Genre.SPORT, Emotion.NEUTRAL),
    MoviePreference(Audience.ROCKERS, Genre.SPORT, Emotion.DISLIKES),
    MoviePreference(Audience.ATHLETES, Genre.SPORT, Emotion.LOVES),
    MoviePreference(Audience.GEEKS, Genre.SPORT, Emotion.DISLIKES),

    // western
    MoviePreference(Audience.MEN, Genre.WESTERN, Emotion.LIKES),
    MoviePreference(Audience.WOMEN, Genre.WESTERN, Emotion.HATES),
    MoviePreference(Audience.CHILDREN, Genre.WESTERN, Emotion.NEUTRAL),
    MoviePreference(Audience.ELDERS, Genre.WESTERN, Emotion.LOVES),
    MoviePreference(Audience.LOVERS, Genre.WESTERN, Emotion.DISLIKES),
    MoviePreference(Audience.ROCKERS, Genre.WESTERN, Emotion.NEUTRAL),
    MoviePreference(Audience.ATHLETES, Genre.WESTERN, Emotion.DISLIKES),
    MoviePreference(Audience.GEEKS, Genre.WESTERN, Emotion.LIKES),

    )