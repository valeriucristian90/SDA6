package persoana;

import java.util.ArrayList;
import java.util.List;

public class PersonsStatistics {


    Persoana[] persons;

    public PersonsStatistics(Persoana[] persons) {
        this.persons = persons;
    }

    public Persoana oldestWoman() {
        int maxVarsta = 0;
        Persoana a = new Persoana(0, "a", "m");

        for (int i = 0; i < persons.length; i++) {

            if (persons[i].getSex().equals("feminin")) {

                if (persons[i].getVarsta() > maxVarsta) {
                    maxVarsta = persons[i].getVarsta();
                    a = persons[i];
                }
            }
        }
        return a;
    }

    public Persoana oldestMan() {
        int maxVarsta = 0;
        Persoana a = new Persoana(0, "a", "m");

        for (int i = 0; i < persons.length; i++) {

            if (persons[i].getSex().equals("masculin")) {

                if (persons[i].getVarsta() > maxVarsta) {
                    maxVarsta = persons[i].getVarsta();
                    a = persons[i];
                }
            }
        }
        return a;
    }

    public int womanCount() {
        int count = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].sex.equals("feminin")) {
                count++;
            }
        }
        return count;
    }

    public int manCount() {
        int count = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].sex.equals("masculin")) {
                count++;
            }
        }
        return count;
    }

    public int averegeManAge() {
        int averegeAge = 0;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].sex.equals("masculin")) {
                sum = sum + persons[i].getVarsta();
                count++;
                averegeAge = sum / count;
            }
        }
        return averegeAge;
    }

    public int averegeWomanAge() {
        int averegeAge = 0;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].sex.equals("feminin")) {
                sum = sum + persons[i].getVarsta();
                count++;
                averegeAge = sum / count;
            }
        }
        return averegeAge;
    }

    public int numberOfMarrierPeople (){
        int count = 0;
        for (int i = 0; i < persons.length; i++){
            if (persons[i].stareCivila.equals("casatorit")){
                count++;
            }
        }
        return count;
    }

    public List<Persoana> marriedPeople (){
        List<Persoana> cupluri = new ArrayList<>();
        Persoana a = new Persoana(0, "a", "m","a","b");
       for (int i = 0; i < persons.length; i++){
           if (persons[i].stareCivila.equals("casatorit")){
               a = persons[i];
               cupluri.add(a);
           }
       }
        return cupluri;
    }
}

