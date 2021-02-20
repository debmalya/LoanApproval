package org.deb.loan.approver;

import static org.springframework.test.util.AssertionErrors.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class LoanApproverApplicationTestsIT {
  @Autowired private ApplicationContext applicationContext;

  @Test
  void contextLoads() {
    assertNotNull("The application context should have loaded.", this.applicationContext);
  }
}
