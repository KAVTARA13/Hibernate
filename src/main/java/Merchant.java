

import javax.persistence.*;

@Entity
@Table(name = "Merchant")
public class Merchant {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    private int status;
    @ManyToOne(fetch= FetchType.LAZY)
//@ManyToOne(fetch= FetchType.EAGER)
    @JoinColumns({ @JoinColumn(name="companyId", referencedColumnName="id") })
    private Company company;

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getStatus(){
        return status;
    }
    public Company getCompany(){
        return company;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setStatus(int status){
        this.status = status;
    }
    public void setCompany(Company company){
        this.company = company;
    }
    @Override
    public String toString() {
        return name +" - "+status+" - "+company.toString();
    }

}
