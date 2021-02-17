package org.deb.loan.approver.enumeratoin;

public enum LoanApprovalStatus {
  APPROVED("APPROVED"),
  REJECTED("REJECTED");

  private final String status;

  private LoanApprovalStatus(String status) {
    this.status = status;
  }
}
