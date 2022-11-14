package webService;

import jakarta.xml.bind.annotation.*;

import java.util.Date;


@XmlRootElement(name = "compte")
//mettre les annotations sur les champs et non sur les getters et setters
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private  int code;
    private double solde;

    //@XmlTransient: dire a jawB qd tu mappe les attribut vers xml, ignore cet attribut
    @XmlTransient
    private Date dateCreation;

    public Compte() {
    }

    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
