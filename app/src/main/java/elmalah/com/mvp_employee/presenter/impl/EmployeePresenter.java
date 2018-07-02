package elmalah.com.mvp_employee.presenter.impl;

import elmalah.com.mvp_employee.model.EmployeeModel;
import elmalah.com.mvp_employee.presenter.Interface.EmployeeParentPresenterInterface;
import elmalah.com.mvp_employee.view.Interface.EmployeeViewInterface;

/**
 * Created by elmalah on 3/28/2018.
 */

public class EmployeePresenter implements EmployeeParentPresenterInterface {

    EmployeeModel employeeModel=new EmployeeModel();
    EmployeeViewInterface employeeViewInterface;

    public EmployeePresenter(EmployeeViewInterface empViewInterface){
this.employeeViewInterface=empViewInterface;
    }


    @Override
    public void onCreate() {
employeeViewInterface.changeNameText(employeeModel.getName());
    }
}
