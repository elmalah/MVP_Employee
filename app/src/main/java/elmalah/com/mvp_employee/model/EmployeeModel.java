package elmalah.com.mvp_employee.model;

/**
 * Created by elmalah on 3/28/2018.
 */

public class EmployeeModel {

    private  final String[] names={"Amr","Morsy","ElMalah"};
    public String getName(){
        return  names[0]+ names[1]+" / "+getRandomAge();
    }
    int getRandomAge(){
        return ((int)Math.random()*30);
    }
}
