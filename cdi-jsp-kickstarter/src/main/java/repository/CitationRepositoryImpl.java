package repository;

import fakedb.Citations;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Random;

/**
 * @author dens on 31.01.16.
 */
public class CitationRepositoryImpl implements CitationRepository{



    @Override
    public String getRandomCitation() {
        Random random = new Random();
        int index = random.nextInt(Citations.citations.size());
        return Citations.citations.get(index );
    }
}
