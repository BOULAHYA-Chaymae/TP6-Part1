package ma.enset.tp6partie1.web;

import ma.enset.tp6partie1.dto.BankAccountRequestDTO;
import ma.enset.tp6partie1.dto.BankAccountResponseDTO;
import ma.enset.tp6partie1.entities.BankAccount;
import ma.enset.tp6partie1.entities.Customer;
import ma.enset.tp6partie1.repositories.BankAccountRepository;
import ma.enset.tp6partie1.repositories.CustomerRepository;
import ma.enset.tp6partie1.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BankAccountGraphQLController {

    @Autowired
    private BankAccountRepository bankAccountRepository;
    @Autowired
    private AccountService accountService;
    @Autowired
    private CustomerRepository customerRepository;

    @QueryMapping
    public List<BankAccount> accountsList() {
        return bankAccountRepository.findAll();
    }

    @QueryMapping
    public BankAccount bankAccountById(@Argument String id) {
        return bankAccountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Bank account with id '%s' not found", id)));
    }

    @MutationMapping
    public BankAccountResponseDTO addAccount(@Argument BankAccountRequestDTO bankAccount) {
        return accountService.addAccount(bankAccount);
    }

    @MutationMapping
    public BankAccountResponseDTO updateAccount(@Argument String id,@Argument BankAccountRequestDTO bankAccount) {
        return accountService.updateAccount(id,bankAccount);
    }

    @MutationMapping
    public void deleteAccount(@Argument String id) {
         bankAccountRepository.deleteById(id);
    }

    @QueryMapping
    public List<Customer> customers() {
        return customerRepository.findAll();
    }
}

