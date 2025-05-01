package br.com.marcosprado.springdictapi.domain.model.pixkey;

import br.com.marcosprado.springdictapi.domain.model.accountPayment.AccountPayment;

import java.time.LocalDateTime;
import java.util.UUID;

public class PixKey {
    private UUID requestId;
    private String key;
    private KeyType keyType;
    private AccountPayment account;
    private ReasonType reason;
    private LocalDateTime creationDate;

    public PixKey(
            String requestId,
            String key,
            KeyType keyType,
            AccountPayment accountPayment,
            ReasonType reason
    ) {
        setRequestId(UUID.fromString(requestId));
        setKey(key);
        setKeyType(keyType);
        setAccount(accountPayment);
        setReason(reason);
        setCreationDate(LocalDateTime.now());
    }

    public UUID getRequestId() {
        return requestId;
    }

    private void setRequestId(UUID requestId) {
        this.requestId = requestId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public KeyType getKeyType() {
        return keyType;
    }

    public void setKeyType(KeyType keyType) {
        this.keyType = keyType;
    }

    public AccountPayment getAccount() {
        return account;
    }

    public void setAccount(AccountPayment account) {
        this.account = account;
    }

    public ReasonType getReason() {
        return reason;
    }

    public void setReason(ReasonType reason) {
        this.reason = reason;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
