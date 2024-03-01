package org.example;

public class Video {

    private int id;
    private String titulo;
    private String thumbnail;
    private String link;

    public Video(int id, String titulo, String thumbnail, String link) {
        this.id = id;
        this.titulo = titulo;
        this.thumbnail = thumbnail;
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
