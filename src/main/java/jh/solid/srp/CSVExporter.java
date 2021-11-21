package jh.solid.srp;

import java.util.List;
import java.util.stream.Collectors;

public class CSVExporter {

    public String export (List<Movie> recomendations){
        return recomendations.stream()
                .map(p -> (p.getTitle() + "," + p.getGenre() + "," + p.getDirector()))
                .collect(Collectors.joining("\n"));
    }
}
