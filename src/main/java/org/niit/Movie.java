package org.niit;

public class Movie {
    private int movieId;
    private String movieName;
    private int releaseYear;
    private double duration;
    private String actorName;
    private String actressName;
    private String genre;

    public Movie(int movieId, String movieName, int releaseYear, double duration, String actorName, String actressName, String genre) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.actorName = actorName;
        this.actressName = actressName;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", releaseYear=" + releaseYear +
                ", duration=" + duration +
                ", actorName='" + actorName + '\'' +
                ", actressName='" + actressName + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
