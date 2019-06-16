package _3_ChuckNorrisJokes;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class JokesJSON {
    private String[] categories;
    private String created_at;
    private String icon_url;
    private String id;
    private String updated_at;
    private String url;
    private String value;

    // konstruktor pozostał domyślny

    public void getJokes() throws IOException {
        //wyślij zapytanie
        URL link = new URL("https://api.chucknorris.io/jokes/random");
        URLConnection urlConnection = link.openConnection();
        urlConnection.connect();  // nawiązanie połaczenia
        urlConnection.addRequestProperty("UserAgent","Chrome");
        InputStream inputStreamJSON = urlConnection.getInputStream();
        Scanner czytajJson = new Scanner(inputStreamJSON);
        String textJSON = czytajJson.nextLine();
        inputStreamJSON.close();

        // patrz:  http://tutorials.jenkov.com/java-json/gson.html

        Gson gson = new Gson();

        JokesJSON jokesJSON = gson.fromJson(textJSON, JokesJSON.class);

    }

    public String getValue() {
        return value;
    }
}
