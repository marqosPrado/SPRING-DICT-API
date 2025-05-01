package br.com.marcosprado.springdictapi.domain.model.accountPayment;

import br.com.marcosprado.springdictapi.domain.model.ownerAccount.OwnerAccount;

import java.time.LocalDateTime;
import java.util.UUID;

public class AccountPayment {
    private UUID id;
    private String participant;
    private String branch;
    private String number;
    private AccountType type;
    private LocalDateTime openingDate;
    private OwnerAccount owner;

    public AccountPayment(
            String participant,
            String branch,
            String number,
            AccountType type,
            OwnerAccount owner
    ) {
        this.id = UUID.randomUUID();
        this.setParticipant(participant);
        this.setBranch(branch);
        this.setNumber(number);
        this.setType(type);
        this.setOpeningDate(LocalDateTime.now());
        this.setOwner(owner);
    }

    public AccountPayment(
            String id,
            String participant,
            String branch,
            String number,
            AccountType type,
            OwnerAccount owner
    ) {
        this.setId(UUID.fromString(id));
        this.setParticipant(participant);
        this.setBranch(branch);
        this.setNumber(number);
        this.setType(type);
        this.setOpeningDate(LocalDateTime.now());
        this.setOwner(owner);
    }

    public UUID getId() {
        return id;
    }

    private void setId(UUID id) {
        this.id = id;
    }

    public String getParticipant() {
        return participant;
    }

    public void setParticipant(String participant) {
        this.participant = participant;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public LocalDateTime getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(LocalDateTime openingDate) {
        this.openingDate = openingDate;
    }

    public OwnerAccount getOwner() {
        return owner;
    }

    public void setOwner(OwnerAccount owner) {
        this.owner = owner;
    }
}
