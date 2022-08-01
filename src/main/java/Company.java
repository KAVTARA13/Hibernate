
import javax.persistence.*;

@Entity
@Table(name = "Company")
public class Company {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    private int status;

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getStatus(){
        return status;
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
    @Override
    public String toString() {
        return name +" - "+status;
    }
}
