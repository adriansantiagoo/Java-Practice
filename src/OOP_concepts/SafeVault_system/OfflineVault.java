package OOP_concepts.SafeVault_system;

public class OfflineVault extends Vault {

    public OfflineVault(String vaultCode, int securityTier) {
        super(vaultCode, securityTier);
    }

    @Override
    public boolean validateAccess() {
        if (this.isLockedDown()) {
            System.out.println("Access Denied: Vault is under lockdown.");
            return false;
        }
        System.out.println("Access Granted!");
        return true;
    }
}
