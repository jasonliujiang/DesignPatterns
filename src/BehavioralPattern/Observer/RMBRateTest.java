package BehavioralPattern.Observer;

/**
 * @author liujiang
 */
public class RMBRateTest {

    public static void main(String[] args) {
        Rate rate = new RMBRate();
        Company iCompany = new ImportCompany();
        Company eCompany = new ExportCompany();

        rate.addCompany(iCompany);
        rate.addCompany(eCompany);

        rate.change(10);
    }
}
