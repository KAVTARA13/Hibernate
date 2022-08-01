import org.hibernate.Session;
import org.testng.annotations.Test;

import java.util.List;

public class Main {
    @Test
    void companyTest(){
        List<Company> companies = null;
        Session session = HibernateUtil.getSessionFactory().openSession();

        companies = session.createQuery("from Company", Company.class).list();
        System.out.println(companies.size());
        companies.forEach(o -> System.out.println(o.toString()));
    }
    @Test
    void merchantTest(){
        List<Merchant> merchants = null;
        Session session = HibernateUtil.getSessionFactory().openSession();

        merchants = session.createQuery("from Merchant", Merchant.class).list();
        System.out.println(merchants.size());
        merchants.forEach(o -> System.out.println(o.toString()));
    }
}
