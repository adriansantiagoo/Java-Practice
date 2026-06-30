package OOP_concepts.SafeVault_system;

public abstract class Vault {
    private final String vaultCode;
    private final int securityTier;
    private boolean isLockedDown;

    public Vault(String vaultCode, int securityTier){
        if (securityTier > 5 || securityTier < 1){
            throw new IllegalArgumentException("The security tier needs to be between one and five");
        }
        this.vaultCode = vaultCode;
        this.securityTier = securityTier;
        this.isLockedDown = false;
    }

    public String getVaultCode() {
        return vaultCode;
    }

    public int getSecurityTier() {
        return securityTier;
    }

    public boolean isLockedDown() {
        return isLockedDown;
    }

    public boolean toggleLockdown(){
        this.isLockedDown = !this.isLockedDown;
        return this.isLockedDown;
    }

    public abstract boolean validateAccess();

    @Override
    public String toString(){
        return "Vault [Code: " + this.vaultCode + ", Tier: " + this.securityTier + ", Locked Down: " + this.isLockedDown + "]";
    }
}
