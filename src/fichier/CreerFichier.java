package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/Users/user/Downloads/TP/TP/recensement.csv");
        if (Files.exists(path)) {
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            int i=0;
            List<String> line100 = new ArrayList<>();
            for (String line : lines) {

                if (i<=100) {
                    line100.add(line);
                    i++;
                }
            }
            Path newPath = Paths.get("C:/Users/user/Downloads/TP/TP/recensement-100lines.csv");
            Files.write(newPath, line100);
        }
    }
}
