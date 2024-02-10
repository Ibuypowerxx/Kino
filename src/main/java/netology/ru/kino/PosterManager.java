package netology.ru.kino;

public class PosterManager {
    private String[] films = new String[0];
    private int countFilm;

    public PosterManager(int countFilm) {
        this.countFilm = countFilm;
    }

    public PosterManager() {
        this.countFilm = 7;
    }

    public void add(String movie) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = movie;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length < countFilm) {
            resultLength = films.length;
        } else {
            resultLength = countFilm;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}