package BehavioralPattern.Observer;

/**
 *
 * @author liujiang
 */
class RMBRate extends Rate {

    @Override
    void change(int number) {
        for (Company obs : companyList) {
            obs.response(number);
        }
    }
}
