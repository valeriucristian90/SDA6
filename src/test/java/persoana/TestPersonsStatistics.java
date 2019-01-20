package persoana;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestPersonsStatistics {

    @Test
    public void TestPersonsStatistics() {
        Persoana a = new Persoana(20, "Adi", "masculin", "casatorit", "Ioana");
        Persoana b = new Persoana(19, "Oana", "feminin", "casatorit", "Marius");
        Persoana c = new Persoana(7, "Andrei", "masculin", "necasatorit");
        Persoana d = new Persoana(38, "Monica", "feminin", "necasatorit");
        Persoana e = new Persoana(23, "Vlad", "masculin", "casatorit", "Maria");
        Persoana f = new Persoana(29, "Marian", "masculin", "necasatorit");
        Persoana g = new Persoana(21, "Alesia", "feminin", "necasatorit");


        Persoana[] persons = {a, b, c, d, e, f, g};

        PersonsStatistics personsStatistics = new PersonsStatistics(persons);

        System.out.println(personsStatistics.oldestWoman().getNume());
        System.out.println(personsStatistics.oldestMan().getNume());
        Assert.assertEquals("Monica", personsStatistics.oldestWoman().getNume());
        Assert.assertEquals("Marian", personsStatistics.oldestMan().getNume());
        System.out.println(personsStatistics.womanCount());
        System.out.println(personsStatistics.manCount());
        Assert.assertEquals(3, personsStatistics.womanCount());
        Assert.assertEquals(4, personsStatistics.manCount());
        System.out.println(personsStatistics.averegeManAge());
        System.out.println(personsStatistics.averegeWomanAge());
        Assert.assertEquals(19,personsStatistics.averegeManAge());
        Assert.assertEquals(26,personsStatistics.averegeWomanAge());
        System.out.println(personsStatistics.numberOfMarrierPeople());
        Assert.assertEquals(3,personsStatistics.numberOfMarrierPeople());
        List<Persoana> persoanas = personsStatistics.marriedPeople();
        System.out.println(persoanas.get(1).getNume() + " married with " +persoanas.get(1).getNumePartener());
        System.out.println(personsStatistics.marriedPeople());


    }
}
