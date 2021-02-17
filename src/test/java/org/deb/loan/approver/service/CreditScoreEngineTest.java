package org.deb.loan.approver.service;

import org.deb.loan.approver.dto.CreditRatingRequest;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class CreditScoreEngineTest {

  @Autowired CreditScoreEngine creditRatingService;

  @Test
  void getCreditScore() {
    CreditRatingRequest creditRatingRequest = new CreditRatingRequest("198-50-0012");
    int creditRating = creditRatingService.getCreditScore(creditRatingRequest);
    assertTrue(creditRating >= 300 && creditRating <= 850);
  }
}
