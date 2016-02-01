package services;

import repository.CitationRepository;

import javax.inject.Inject;

/**
 * @author dens on 18.01.16.
 */
public class CitationService implements Service{

    @Inject
    private CitationRepository citationRepository;

    public String getRandomCitation(){
        return citationRepository.getRandomCitation();
    }
}
