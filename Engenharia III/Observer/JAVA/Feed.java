package org.example;

public class Feed implements IObserver{

    private int id;
    private String url;

    public Feed(int id, String url) {
        this.id = id;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public void update(Video video) {
        System.out.println("Novo vídeo '" + video.getTitulo() +"' publicado no feed!");
        System.out.println("Acesse em " +  this.url);
    }
}
