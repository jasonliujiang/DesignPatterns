package BehavioralPattern.Observer;

import java.util.ArrayList;
import java.util.List;


abstract class Rate {

    protected List<Company> companyList = new ArrayList<Company>();

    /**
     * 增加观察者方法
     *
     * @param company
     */
    public void addCompany(Company company) {
        companyList.add(company);
    }

    /**
     * 删除观察者方法
     *
     * @param company
     */
    public void removeCompany(Company company) {
        companyList.remove(company);
    }


    /**
     * 通知观察者方法
     *
     * @param number
     */
    abstract void change(int number);
}
