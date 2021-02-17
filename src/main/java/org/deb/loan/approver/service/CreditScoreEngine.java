package org.deb.loan.approver.service;

import java.util.concurrent.ThreadLocalRandom;
import org.deb.loan.approver.dto.CreditRatingRequest;
import org.springframework.stereotype.Service;

@Service
public class CreditScoreEngine {

    public int getCreditScore(final CreditRatingRequest creditRatingRequest){
        return ThreadLocalRandom.current().nextInt(300,850);
    }

}
