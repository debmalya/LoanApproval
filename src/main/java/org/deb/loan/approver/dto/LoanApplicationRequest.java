package org.deb.loan.approver.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class LoanApplicationRequest {
  @NotNull(message = "Please provide 'ssnNumber'")
  @Pattern(regexp = "^[0-9]{3}-[0-9]{2}-[0-9]{4}$", message = "Please provide proper SSN")
  private String ssnNumber;

  @NotNull(message = "Please provide 'loanAmount''")
  private Double loanAmount;

  @NotNull(message = "Please provide 'currentAnnualIncome'")
  private Double currentAnnualIncome;
}
