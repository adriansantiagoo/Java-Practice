package OOP_concepts.CityTransit_system;

public class StationConsole {
    private String terminalId;

    public StationConsole(String terminalId){
        this.terminalId = terminalId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void systemCheck(){
        System.out.printf("Console %s is online.", this.terminalId);
    }
}
