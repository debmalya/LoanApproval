package org.deb.loan.approver.enumeratoin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanApprovalStatusTest {

  @Test
  void testStatus() {
    assertSame(LoanApprovalStatus.APPROVED, LoanApprovalStatus.valueOf("APPROVED"));
    assertSame(LoanApprovalStatus.REJECTED, LoanApprovalStatus.valueOf("REJECTED"));
  }
}
