package main;

import file.MyFile;
import general.*;
import service.*;
import java.util.*;
import java.text.*;


public class Main {

    public static void main(String[] args) {

        MyFile file = new MyFile();
        file.openFiles();

        Service sv = new Service();


        Neversea neversea = sv.creeazaNeversea(50000);
        Untold untold = sv.creeazaUntold(150000);
        Client client1 = file.readNextClient();
        Client client2 = file.readNextClient();
        Client client3 = file.readNextClient();
        Client client4 = file.readNextClient();

        client1.setBuget(600);
        client2.setBuget(400);
        client3.setBuget(1200);
        client4.setBuget(900);


        Artist artist1 = file.readNextArtist();
        Artist artist2 = file.readNextArtist();
        Artist artist3 = file.readNextArtist();
        Artist artist4 = file.readNextArtist();
        Artist artist5 = file.readNextArtist();

        sv.vindeBiletVIP(client1, untold);
        sv.vindeBiletVIP(client1, untold);
        sv.vindeBiletVIP(client2, neversea);
        sv.vindeBiletVIP(client2, untold);
        sv.vindeBiletVIP(client4, untold);
        sv.vindeBiletVIP(client3, neversea);
        sv.vindeBiletVIP(client3, neversea);
        sv.vindeBiletVIP(client1, neversea);

        sv.vindeBiletStandard(client4, untold);
        sv.vindeBiletStandard(client4, neversea);
        sv.vindeBiletStandard(client4, untold);
        sv.vindeBiletStandard(client4, untold);
        sv.vindeBiletStandard(client4, untold);

        sv.angajeazaArtist(artist1, neversea);
        sv.angajeazaArtist(artist2, neversea);
        sv.angajeazaArtist(artist3, untold);
        sv.angajeazaArtist(artist4, untold);
        sv.angajeazaArtist(artist5, neversea);
        sv.angajeazaArtist(artist5, untold);
        sv.angajeazaArtist(artist5, neversea);



         sv.artistiEveniment(neversea);
         sv.clientiEveniment(neversea);

         sv.artistiEveniment(untold);
         sv.clientiEveniment(untold);



    }
}