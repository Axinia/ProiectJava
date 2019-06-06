package file;

import java.io.*;
import java.util.*;
import general.Artist;
import general.Client;
import general.CodJudet;
import general.Gen;

public class MyFile {
    private BufferedReader clienti;
    private BufferedReader artisti;



    public void openFiles(){
        try{
            File file1 = new File("InfoDataClienti.txt");
            clienti = new BufferedReader(new FileReader(file1));
        }
        catch(Exception e){
            System.out.println("Could not open file 1.");
        }

        try {
            File file2 = new File("InfoDataArtisti.txt");
            artisti = new BufferedReader(new FileReader(file2));
        }
        catch(Exception e){
            System.out.println("Could not open file 2.");
        }
    }

    public Client readNextClient(){
        String line = "";

        try {
            if ((line = clienti.readLine()) != null) {

                String[] data = line.split(",");

                String value =  data[0];
                value = value.substring(1, value.length() - 1);
                Gen gen = Gen.valueOf(value);

                value =  data[1];
                value = value.substring(1, value.length() - 1);
                String nume = value;

                value =  data[2];
                value = value.substring(1, value.length() - 1);
                String prenume = value;

                value =  data[3];
                value = value.substring(1, value.length() - 1);
                int ziua=  Integer.parseInt(value);

                value =  data[4];
                value = value.substring(1, value.length() - 1);
                int luna = Integer.parseInt(value);

                value =  data[5];
                value = value.substring(1, value.length() - 1);
                int anul = Integer.parseInt(value);

                value =  data[6];
                value = value.substring(1, value.length() - 1);
                CodJudet oras = CodJudet.valueOf(value);

                value =  data[7];
                value = value.substring(1, value.length() - 1);
                int buget = Integer.parseInt(value);

                Client aux = new Client(gen, nume, prenume, ziua, luna, anul, oras);
                aux.setBuget(buget);
                return aux;
            }
        }
        catch(Exception e){
            System.out.println("Could not read the file.");
        }
            return null;
    }

    public Artist readNextArtist(){
        String line = "";

        try {
            if ((line = artisti.readLine()) != null) {

                String[] data = line.split(",");

                String value =  data[0];
                value = value.substring(1, value.length() - 1);
                Gen gen = Gen.valueOf(value);

                value =  data[1];
                value = value.substring(1, value.length() - 1);
                String nume = value;

                value =  data[2];
                value = value.substring(1, value.length() - 1);
                String prenume = value;

                value =  data[3];
                value = value.substring(1, value.length() - 1);
                int ziua = Integer.parseInt(value);

                value =  data[4];
                value = value.substring(1, value.length() - 1);
                int luna = Integer.parseInt(value);

                value =  data[5];
                value = value.substring(1, value.length() - 1);
                int anul = Integer.parseInt(value);

                value =  data[6];
                value = value.substring(1, value.length() - 1);
                CodJudet oras = CodJudet.valueOf(value);

                value =  data[7];
                value = value.substring(1, value.length() - 1);
                int cost = Integer.parseInt(value);

                value =  data[8];
                value = value.substring(1, value.length() - 1);
                int timp = Integer.parseInt(value);

                Artist aux = new Artist(gen, nume, prenume, ziua, luna, anul, oras, cost, timp);

                return aux;
            }
        }
        catch(Exception e){
            System.out.println("Could not read the file.");
        }
        return null;
    }
    public void closeFiles() {
        try {
            clienti.close();
        } catch (Exception e) {
            System.out.println("Could not close file 1.");
        }
        try {
            artisti.close();
        } catch (Exception e) {
            System.out.println("Could not close file 2.");
        }
    }
}
