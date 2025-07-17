package com.voting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testVotingService() {
        VotingService service = new VotingService();
        service.castVote(); // manual test - prompt user input
        assertNotNull(service.getResults());
    }
}
