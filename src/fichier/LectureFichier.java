package fichier;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws IOException {
        ArrayList<Ville> listVille = new ArrayList<>();
        Path path = Paths.get("C:/Users/user/Downloads/TP/TP/recensement.csv");
        if (Files.exists(path)) {
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            int i = 0;
            Path newPath =  Paths.get("C:/Users/user/Downloads/TP/TP/test.csv");
            List<String> newLines =  new ArrayList<>();
            newLines.add("Nom;Code département;Nom de la région;Population totale");
            for (String line : lines) {
                if (i != 0) {
                    String[] data = line.split(";");
                    Ville ville = new Ville(data[6], data[2], data[1], Integer.parseInt(data[9].replace(" ", "")));
                    listVille.add(ville);
                    if (Integer.parseInt(data[9].replace(" ", "")) > 25000) {
                        String newline = data[6] + ";" + data[2] + ";" + data[1] + ";" + data[9];
                        newLines.add(newline);
                    }
                }
                i++;
            }


            Files.write(newPath, newLines);

        }

    }
}
