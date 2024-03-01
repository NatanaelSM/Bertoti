package org.example;

public class Main {
    public static void main(String[] args) {
        //Instânciando o vídeo que será notificado
        Video video = new Video(1,"Observer Pattern", "Como utilizar o Observer pattern!",
                "youtube.com/link-video-observer");

        //Instanciando os assinantes e feeds que receberão as notificações
        Assinante assinante1 = new Assinante(1,"João");
        Assinante assinante2 = new Assinante(2,"Maria");
        Feed feed1 = new Feed(1, "OFIASFDOIAjkfbauifdakO");

        //Instânciando e utilizando os métodos da classe de notificação de vídeo
        NotificacaoVideo notificacaoVideo = new NotificacaoVideo(video);

        notificacaoVideo.subscriber(assinante1);
        notificacaoVideo.subscriber(assinante2);
        notificacaoVideo.subscriber(feed1);

        notificacaoVideo.notifyAllObservers();

        notificacaoVideo.unSubscriber(assinante2);

        notificacaoVideo.notifyAllObservers();

        notificacaoVideo.notifyObserver(feed1);
    }
}