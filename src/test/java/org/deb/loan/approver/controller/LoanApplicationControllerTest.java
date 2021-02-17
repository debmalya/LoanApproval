package org.deb.loan.approver.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.deb.loan.approver.service.LoanApplicationService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(value = LoanApplicationController.class)
@ActiveProfiles("test")
class LoanApplicationControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private LoanApplicationService loanApplicationService;


  @Test
  void process() {}
}