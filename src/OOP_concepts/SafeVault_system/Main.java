package OOP_concepts.SafeVault_system;

public class Main {
    public static void main(String[] args){
        Vault offlineVault = new OfflineVault("VLT-A9", 1);
        Vault onlineVault = new OnlineVault("VLR-B7", 4);

        System.out.println(offlineVault);
        System.out.println(onlineVault);
        System.out.println();

        offlineVault.toggleLockdown();

        offlineVault.validateAccess();
        onlineVault.validateAccess();
    }
}
