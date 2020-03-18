package telran.data;

import java.util.Arrays;
import java.util.Objects;

public class Film {
    private String title;
    private String date;
    private Genre genre;
    private Cinema[] cinemas;

    public Film(String title, String date, Genre genre, Cinema[] cinemas) {
        this.title = title;
        this.date = date;
        this.genre = genre;
        this.cinemas = cinemas;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Cinema[] getCinemas() {
        return cinemas;
    }

    public void setCinemas(Cinema[] cinemas) {
        this.cinemas = cinemas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Film)) return false;
        Film film = (Film) o;
        return Objects.equals(title, film.title) &&
                Objects.equals(date, film.date) &&
                genre == film.genre &&
                Arrays.equals(cinemas, film.cinemas);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(title, date, genre);
        result = 31 * result + Arrays.hashCode(cinemas);
        return result;
    }

    @Override
    public String toString() {
        return "Film: " + title +
                ", date: " + date +
                ", genre: " + genre +
                ", cinemas=" + Arrays.toString(cinemas);
    }

    public void displayCinema(){
        for (int i = 0; i < cinemas.length; i++) {
            System.out.println(cinemas[i]);
        }
    }
}
