package elmalah.com.mvp_employee.view.impl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import elmalah.com.mvp_employee.R;
import elmalah.com.mvp_employee.presenter.Interface.EmployeeParentPresenterInterface;
import elmalah.com.mvp_employee.presenter.impl.EmployeePresenter;
import elmalah.com.mvp_employee.view.Interface.EmployeeViewInterface;

public class MainActivity extends AppCompatActivity implements EmployeeViewInterface{

    @BindView(R.id.name_tv)
    TextView nameText;

    EmployeeParentPresenterInterface employeeParentPresenterInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        employeeParentPresenterInterface=new EmployeePresenter(this);
employeeParentPresenterInterface.onCreate();

    }

    @Override
    public void changeNameText(String newName) {
        nameText.setText(newName);
    }
}
