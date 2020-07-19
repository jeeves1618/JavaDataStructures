class battingRecord{
    private String playerName;
    private int runsScored;

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public String getFeed(){
        return "Runs scored by " + this.getPlayerName() + " is " + this.getRunsScored();
    }
}

class setBattingRecords{
    int recordCapacity;
    battingRecord[] battingRecords;

    public setBattingRecords(int recordCapacity) throws Exception {
        this.recordCapacity=recordCapacity;
        battingRecords = new battingRecord[recordCapacity];

        for(int counter=0;counter<recordCapacity; counter++){
            battingRecords[counter] = new battingRecord();
            switch(counter){
                case 0:
                battingRecords[counter].setPlayerName("SR Tendulkar (INDIA)");
                battingRecords[counter].setRunsScored(18426);
                break;
                case 1:
                battingRecords[counter].setPlayerName("KC Sangakkara (Asia/ICC/SL)");
                battingRecords[counter].setRunsScored(14234);
                break;
                case 2:
                battingRecords[counter].setPlayerName("RT Ponting (AUS/ICC)");
                battingRecords[counter].setRunsScored(13704);
                break;
                case 3:
                battingRecords[counter].setPlayerName("ST Jayasuriya (Asia/SL)");
                battingRecords[counter].setRunsScored(13430);
                break;
                case 4:
                battingRecords[counter].setPlayerName("DPMD Jayawardene (Asia/SL)");
                battingRecords[counter].setRunsScored(12650);
                break;
                default:
                    throw new java.lang.IllegalStateException("Unexpected value: " + counter);
            }
        }
    }
    public battingRecord[] getRecords(){
        return battingRecords;
        }
    }
public class ArrayTest{
    public static void main(String args[]) throws Exception{
        int recordCapacity = 5;
        String messageFeed;
        setBattingRecords oneDay = new setBattingRecords(recordCapacity);
        battingRecord[] battingRecords = oneDay.getRecords();

        for(int counter=0; counter < recordCapacity; counter++){
            messageFeed = battingRecords[counter].getFeed();
            System.out.println(messageFeed);
        }
    }
}