package formeGeometrie;

public class MagazinDeVopsea {

    public double cantitateaTotalaDeVopsea (FormaGeometrica [] a){

       double sum=0;
        for (FormaGeometrica x : a){
            sum += x.getArie();
        }
        return sum;
    }




}
