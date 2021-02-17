package org.deb.loan.approver.repository;

import org.deb.loan.approver.enumeratoin.LoanApprovalStatus;
import org.deb.loan.approver.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Integer> {
    Optional<List<LoanApplication>> findBySsnNumberOrderByApplicationDateTimeDesc(String ssnNumber);
    void deleteBySsnNumber(String ssnNumber);
}
