import java.util.ArrayList;
public class analysis {
    private metric dbMetric;
    private String[]customerSummary;
    public analysis(){
        dbMetric = new metric();
        customerSummary=new String[4];
        summaryProcessor();
    }

    public void analyzeByCustomer(String id) {
        ArrayList<String[]> localData = dbMetric.searchByCustomer(id);
        //summary

        //comparison

        //whole info return & change void

    }


    //Get summary of a customer
    //format for each customer:
    private String[] getSummary(String id){
        String[]data={"NA","NA","NA","NA","NA"};

        return data;
    }

    //Process summary of customers
    //First store all ids
    //Format: [id],[location],[total quantity fall,winter,spring,summer],[money spent fall,winter,spring,summer]
    void summaryProcessor(){
        ArrayList<String>id = new ArrayList<String>();
        dbAccessor dbObj = new dbAccessor();
        ArrayList<String> colA = dbObj.getColA();

        boolean condition = true;
        //Make a list of all unique ids
        //1 because first row is not valid data
        for(int i=1;i<colA.size(); i++){
            for(int j=0; j<id.size();j++){
                if(colA.get(i).compareTo(id.get(j))==0){
                    condition=false;
                }
                if(condition){
                    id.add(colA.get(i));
                    condition=true;
                }
            }
        }

        //start processing for each customer
        for(int i=0; i<id.size();i++){
            //get all info
            ArrayList<String[]>cusInfo = dbMetric.searchByCustomer(id.get(i));

        }
    }

    //parsh
    //use getUcustomer from dbAcessor class to get all customers
    //generate summery for each customer and populate the followings (customerSummary)
    //[id][products name-quantity (each product seperated by comma)][total purchase - location(each product seperated by comma)][country(s)]
    //example[1234][ab bottle-2,brush-1][200-france,100-united kingdom][france,united kingdom]
    //note each row is summery of a specific customer
    void genCustomerSum(){
        //customerSummary
    }

    //zihan
    //returns all rows associated with the id
    ArrayList<String[]> genCustomerHistory(String id){
        ArrayList<String[]>data = new ArrayList<String[]>();
        return data;
    }

    //jashan
    //format [num of purchased products][num of country]....tbd
    //will discuss the info on chat later but format will be same
    int[] genCustomerNumericSummery(){
        int[] data = new int[2];
        return data;

    }


        }
