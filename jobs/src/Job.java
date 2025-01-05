public class Job {

    private String name;
    private int number;
    private boolean word;
    private boolean spreadSheets;
    private boolean dataBase;
    private boolean graphics;

    public Job (String name, int number, boolean word, boolean spreadSheets, boolean dataBase, boolean graphics){
        this.name = name;
        this.number = number;
        this.word = word;
        this.spreadSheets = spreadSheets;
        this.dataBase = dataBase;
        this.graphics = graphics;
    }

    public String getName(){
        return name;
    }
    public int getNumber(){
        return number;
    }
    public boolean getWord(){
        return word;
    }
    public boolean getSpreadSheets(){
        return spreadSheets;
    }
    public boolean getDataBase(){
        return dataBase;
    }
    public boolean getGraphics(){
        return graphics;
    }
}
