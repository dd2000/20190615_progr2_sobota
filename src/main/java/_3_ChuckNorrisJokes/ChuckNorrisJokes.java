package _3_ChuckNorrisJokes;

import java.io.IOException;

public class ChuckNorrisJokes {
    public static void main(String[] args) throws IOException {
        JokesJSON zart1 = new JokesJSON();
        zart1.getJokes();
        System.out.println(zart1.getValue());
    }// main
}
