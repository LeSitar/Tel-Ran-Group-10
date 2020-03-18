package telran.dao;

import telran.data.Film;

public class Schedule {
    private Film[] films;
    private int size;

    public Schedule(int capacity){
        films = new Film[capacity];
        size = 0;
    }

    public boolean addFilm(Film film){
        if(size<films.length){
            films[size] = film;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteFilm(Film film){
        for (int i = 0; i <size ; i++) {
            if(films[i].equals(film)){
                films[i]=films[size-1];
                size--;
                return true;
            }
        }
        return false;
    }

    public void displayFilms(){
        for (int i = 0; i <size ; i++) {
            System.out.println(films[i]);
        }
    }


}

