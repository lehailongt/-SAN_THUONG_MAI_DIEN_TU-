
package adminstrator.controller;

import adminstrator.model.Employee;
import java.util.ArrayList;
import registerbook.model.RegisterBook;

public interface DataAdminFunction {
    
    void readListAdmin(ArrayList<Employee> listE);
    int updateAdmin(Employee emp);
    boolean checkExistAccountAdminSQL(String tk);
    int writeRegisterBookSQL(RegisterBook rb);
    void writeRegisterAdminSQL(Employee newEmployee);
    
}
