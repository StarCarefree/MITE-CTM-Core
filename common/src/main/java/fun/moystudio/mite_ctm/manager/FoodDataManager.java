package fun.moystudio.mite_ctm.manager;

public class FoodDataManager{
    private int ptt;
    private int ptn;
    private int isl;
    private int lastisl=192000;

    public int getIsl() {
        return isl;
    }

    public int getPtn() {
        return ptn;
    }

    public int getPtt() {
        return ptt;
    }

    public int getLastisl() {
        return lastisl;
    }

    public void setPtt(int ptt) {
        this.ptt = Math.max(0,Math.min(160000,ptt));
    }

    public void setPtn(int ptn) {
        this.ptn = Math.max(0,Math.min(160000,ptn));
    }

    public void setIsl(int isl) {
        this.lastisl=this.isl;
        this.isl = Math.max(0,Math.min(192000,isl));
    }

    public FoodDataManager(){
        this.ptt=0;
        this.ptn=0;
        this.isl=0;
    }

    public FoodDataManager(int ptn,int ptt,int isl){
        this.setPtn(ptn);
        this.setPtt(ptt);
        this.setIsl(isl);
    }

    public static FoodDataManager create(int ptn,int ptt,int isl){
        return new FoodDataManager(ptn,ptt,isl);
    }
}
