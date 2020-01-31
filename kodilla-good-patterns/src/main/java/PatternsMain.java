import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PatternsMain {
    public static void main(String[] args) {
        String result = MovieStore.getMovies().entrySet().stream()
                .flatMap(s -> s.getValue().stream())
                .collect(Collectors.joining("!", "", ""));

        System.out.println(result);

    }
}
