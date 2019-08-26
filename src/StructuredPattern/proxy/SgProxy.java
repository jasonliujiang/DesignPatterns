package StructuredPattern.proxy;




/*
* 代理：韶关代理
* */
public class SgProxy implements Specialty{
    private WySpecialty realSubject = new WySpecialty();


    @Override
    public void display() {
        preRequest();
        realSubject.display();
        postRequest();

    }

    private void postRequest() {
        System.out.println("代理结束");
    }

    private void preRequest() {
        System.out.println("韶关代理特产开始");
    }
}
