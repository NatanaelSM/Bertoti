package org.example;

public class Assinante implements IObserver{

    private int id;
    private String nome;

    public Assinante(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Video video) {
        System.out.println("O assinante " + this.nome + " recebeu a notificação do vídeo " + video.getTitulo());
    }
}
