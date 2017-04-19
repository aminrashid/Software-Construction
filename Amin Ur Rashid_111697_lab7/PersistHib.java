package lab7;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "PERSISTHIB")

public class PersistHib {
    @Id
    @Column (name="userid")       
    String userid;
    @Column (name="Scheme")
    String Scheme;
    @Column(name="Time Taken")
    double time_taken;
    @Column (name="State")
    boolean State;
    @Column (name="T-C1")
    double TC1;
    @Column (name="State")
    boolean State1;
    @Column (name ="T-C2")
    double TC2;
    @Column (name ="State")
    boolean State2;
    @Column (name="T-C3")
    double TC3;
    @Column (name="State")
    boolean State3;
    @Column (name="T-C4")
    double TC4;
    @Column (name="State")
    boolean State4;
    @Column (name="T-C5")
    double TC5;
    @Column (name="State")
    boolean State5;
    @Column (name="T-C6")
    double TC6;
    @Column (name="State")
    boolean State6;
    @Column (name="T-C7")
    double TC7;
    @Column (name="State")
    boolean State7;  

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getScheme() {
        return Scheme;
    }

    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    public double getTime_taken() {
        return time_taken;
    }

    public void setTime_taken(double time_taken) {
        this.time_taken = time_taken;
    }

    public boolean isState() {
        return State;
    }

    public void setState(boolean State) {
        this.State = State;
    }

    public double getTC1() {
        return TC1;
    }

    public void setTC1(double TC1) {
        this.TC1 = TC1;
    }

    public boolean isState1() {
        return State1;
    }

    public void setState1(boolean State1) {
        this.State1 = State1;
    }

    public double getTC2() {
        return TC2;
    }

    public void setTC2(double TC2) {
        this.TC2 = TC2;
    }

    public boolean isState2() {
        return State2;
    }

    public void setState2(boolean State2) {
        this.State2 = State2;
    }

    public double getTC3() {
        return TC3;
    }

    public void setTC3(double TC3) {
        this.TC3 = TC3;
    }

    public boolean isState3() {
        return State3;
    }

    public void setState3(boolean State3) {
        this.State3 = State3;
    }

    public double getTC4() {
        return TC4;
    }

    public void setTC4(double TC4) {
        this.TC4 = TC4;
    }

    public boolean isState4() {
        return State4;
    }

    public void setState4(boolean State4) {
        this.State4 = State4;
    }

    public double getTC5() {
        return TC5;
    }

    public void setTC5(double TC5) {
        this.TC5 = TC5;
    }

    public boolean isState5() {
        return State5;
    }

    public void setState5(boolean State5) {
        this.State5 = State5;
    }

    public double getTC6() {
        return TC6;
    }

    public void setTC6(double TC6) {
        this.TC6 = TC6;
    }

    public boolean isState6() {
        return State6;
    }

    public void setState6(boolean State6) {
        this.State6 = State6;
    }

    public double getTC7() {
        return TC7;
    }

    public void setTC7(double TC7) {
        this.TC7 = TC7;
    }

    public boolean isState7() {
        return State7;
    }

    public void setState7(boolean State7) {
        this.State7 = State7;
    }
    
}
