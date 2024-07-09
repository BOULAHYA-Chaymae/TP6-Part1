package ma.enset.tp6partie1.service;

import ma.enset.tp6partie1.dto.BankAccountRequestDTO;
import ma.enset.tp6partie1.dto.BankAccountResponseDTO;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);

    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
