package com.example.bilettfinal;

public class Billett {
    private String film;
    private int antall;
    private String fnavn;
    private String enavn;
    private String telefon;
    private String email;
    public Billett( String film, int antall, String fnavn, String enavn, String telefon, String email){
        this.film = film;
        this.antall = antall;
        this.fnavn = fnavn;
        this.enavn = enavn;
        this.telefon = telefon;
        this.email = email;
    }
    // Had to create a standard conductor in order for the code/database to work
public Billett(){

}
    // Getters and setters
    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }

    public String getFnavn() {
        return fnavn;
    }

    public void setFnavn(String fnavn) {
        this.fnavn = fnavn;
    }

    public String getEnavn() {
        return enavn;
    }

    public void setEnavn(String enavn) {
        this.enavn = enavn;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
