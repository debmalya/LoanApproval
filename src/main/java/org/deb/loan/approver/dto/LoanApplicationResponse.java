package org.deb.loan.approver.dto;

import lombok.Data;
import org.deb.loan.approver.enumeratoin.LoanApprovalStatus;

import java.util.UUID;

@Data
public class LoanApplicationResponse {
  private UUID requestId;
  private LoanApprovalStatus loanApprovalStatus;
  private Double approvalAmount = 0.00;
  private String message;
}
