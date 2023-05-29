package ru.movie;

public class Moviemanager {
    private String[] movies = new String[0];
    private final int limit;

    public Moviemanager() {
        this.limit = 5;
    }

    public Moviemanager(int limit) {
        this.limit = limit;
    }


    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultleight;
        if (movies.length < limit) {
            resultleight = movies.length;
        } else {
            resultleight = limit;
        }
        String[] tmp = new String[resultleight];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
