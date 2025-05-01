package br.com.marcosprado.springdictapi.domain.model.ownerAccount;

import java.util.UUID;

public class OwnerAccount {
    private UUID id;
    private String name;
    private OwnerAccountType type;
    private String taxIdNumber;

    public OwnerAccount(
            String id,
            String name,
            OwnerAccountType type,
            String taxIdNumber
    ) {
        this.setId(UUID.fromString(id));
        this.setName(name);
        this.setType(type);
        this.setTaxIdNumber(taxIdNumber);
    }

    public OwnerAccount(
            String name,
            OwnerAccountType type,
            String taxIdNumber
    ) {
        this.setId(UUID.randomUUID());
        this.setName(name);
        this.setType(type);
        this.setTaxIdNumber(taxIdNumber);
    }

    public UUID getId() {
        return id;
    }

    private void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OwnerAccountType getType() {
        return type;
    }

    public void setType(OwnerAccountType type) {
        this.type = type;
    }

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public void setTaxIdNumber(String taxIdNumber) {
        this.taxIdNumber = taxIdNumber;
    }
}
