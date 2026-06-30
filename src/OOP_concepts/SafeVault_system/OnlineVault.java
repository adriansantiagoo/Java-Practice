package OOP_concepts.SafeVault_system;

import java.util.Scanner;

public class OnlineVault extends Vault implements NetworkedSecurity {

    public OnlineVault(String vaultCode, int securityTier) {
        super(vaultCode, securityTier);
    }

    @Override
    public boolean verifyMFA() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the password: ");
        int input = sc.nextInt();

        return input == 1234;
    }

    @Override
    public void triggerEncryption() {
        System.out.println("🚨 WARNING: Network anomaly detected for Vault " + this.getVaultCode() + "!");
        System.out.println("🔒 Initiating AES-256 bit encryption cascade... Data secured.");
    }

    @Override
    public boolean validateAccess() {
        if (this.isLockedDown()) {
            System.out.println("Access Denied: Vault is under lockdown.");
            return false;
        }
        if (verifyMFA()){
            System.out.println("Access Granted!");
            return true;
        }
        triggerEncryption();
        return false;
    }
}
