package org.academiadecodigo.bootcamp.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "bootcamp")
public class Bootcamp {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY) //- test id
    private Integer id;

    @Version
    private Integer version;

    private String location;
    private Date start;
    private Date end;

    @OneToMany(
            cascade = {CascadeType.MERGE,CascadeType.PERSIST},

            mappedBy = "bootcamp",
            fetch = FetchType.EAGER

    )
    private Set<CodeCadet> codeCadets = new HashSet<>();

    public Bootcamp(int id, String location, Date start, Date end){
        this.id = id;
        this.location = location;
        this.start = start;
        this.end = end;
    }

    public Bootcamp() {

    }

    public void addCodeCadet(CodeCadet codeCadet){
        codeCadet.setBootcamp(this);
        codeCadets.add(codeCadet);

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public void setCodeCadets(Set<CodeCadet> codeCadets) {
        this.codeCadets = codeCadets;
    }

    public int getId() {
        return id;
    }

    public void addCadet(CodeCadet codeCadet){
        codeCadets.add(codeCadet);
    }

    public String getLocation() {
        return location;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public Set<CodeCadet> getCodeCadets() {
        return codeCadets;
    }

    public ArrayList<CodeCadet> getCadets(){
        return new ArrayList<>(codeCadets);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bootcamp bootcamp = (Bootcamp) o;

        return id == bootcamp.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", start=" + start +
                ", end=" + end +
                //", codeCadets=" + codeCadets +
                '}';
    }
}
