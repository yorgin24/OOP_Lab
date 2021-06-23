import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author HP
 */
public class Bahan {
    private String namaBahan;
    private Integer hargaProdusen;
    private Integer hargaJual;
    private Integer weight;
    private Integer capacity;
    private Integer profit;
    private Integer ratio;
    private Integer total = 1;


    public void deterRatio(){
        this.ratio = profit;
    }

    public Integer getRatio(){
        return ratio;
    }

    public Integer countValue(int capacity){
        if (capacity >= weight){
            capacity -= weight;
            this.total = this.total + (ratio * weight);
            weight -= weight;
        }
        else if (capacity < weight){
            weight -= capacity;
            this.total = this.total + (ratio * capacity);
            capacity = capacity - capacity;
        }
        return capacity;
    }

    public Integer getValue(){
        return total - 1;
    }

    public static Comparator<Bahan> bahRat = new Comparator<Bahan>() {

        public int compare(Bahan b1, Bahan b2) {

            int rat1 = b1.getRatio();
            int rat2 = b2.getRatio();

            /*For descending order*/
            return rat2-rat1;
        }};

    Bahan(){

    }

    Bahan(String namaBahan, Integer hargaProdusen){
        this.namaBahan = namaBahan;
        this.hargaProdusen = hargaProdusen;
    }

    public void setHargaJual(Integer hargaJual){
        this.hargaJual = hargaJual;
        setProfit();
    }

    public void setWeight(Integer weight){
        this.weight = weight;
    }

    public void setProfit(){
        profit = Math.abs(this.hargaJual-hargaProdusen);
    }

    public Integer getProfit(){
        return profit;
    }

    public String getNamaBahan(){
        return this.namaBahan;
    }

    public Integer getHargaProdusen(){
        return this.hargaProdusen;
    }

    public Integer getWeight(){
        return this.weight;
    }

    public Integer getHargaJual(){
        return this.hargaJual;
    }

    public void setCapVal(int cap){
        this.capacity = cap;
    }

    public int getCap(){
        return capacity;
    }

    //Modified Parts

}