import java.util.ArrayList;
public class dbAccessor {
    private db dbObj;
    private ArrayList<String> colA;
    private ArrayList<String> colB;
    private ArrayList<String> colC;
    private ArrayList<String> colD;
    private ArrayList<String> colE;
    private ArrayList<String> colF;
    private ArrayList<String> colG;
    private ArrayList<String> colH;

    private ArrayList<String> database;

    public dbAccessor(){
        dbObj = new db();
        database = dbObj.getDatabase();
        colA = new ArrayList<String>();
        colB = new ArrayList<String>();
        colC = new ArrayList<String>();
        colD = new ArrayList<String>();
        colE = new ArrayList<String>();
        colF = new ArrayList<String>();
        colG = new ArrayList<String>();
        colH = new ArrayList<String>();
        processor();
    }

    private void processor(){
        String[] columns;
        for(int i=0; i<database.size(); i++){
            columns=database.get(i).split(",");
            colA.add(columns[0]);
            colB.add(columns[1]);
            colC.add(columns[2]);
            colD.add(columns[3]);
            colE.add(columns[4]);
            colF.add(columns[5]);
            colG.add(columns[6]);
            colH.add(columns[7]);
        }
    }

    //colum 1
    //type ArrayList;string
    public ArrayList<String> getColA(){
        return colA;
    }
    //colum 2
    //type ArrayList;string
    public ArrayList<String> getColB(){
        return colB;
    }

    //colum 3
    //type ArrayList;string
    public ArrayList<String> getColC(){
        return colC;
    }

    //colum 4
    //type ArrayList;string
    public ArrayList<String> getColD(){
        return colD;
    }

    //colum 5
    //type ArrayList;string
    public ArrayList<String> getColE(){
        return colE;
    }

    //colum 6
    //type ArrayList;string
    public ArrayList<String> getColF(){
        return colF;
    }

    //colum 7
    //type ArrayList;string
    public ArrayList<String> getColG(){
        return colG;
    }

    //colum 8
    //type ArrayList;string
    public ArrayList<String> getColH(){
        return colH;
    }

    //get row as array of string
    //[0:colA][1:colB][2:colC]...[7:colH]
    //range from 1 upto n
    public String[] getRow(int n){
        String[] data = database.get(n).split(",");
        return data;
    }
}
