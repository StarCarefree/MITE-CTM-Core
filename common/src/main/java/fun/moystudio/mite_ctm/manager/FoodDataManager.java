package fun.moystudio.mite_ctm.manager;

public class FoodDataManager{
    private int ptt=160000;
    private int ptn=160000;
    private int isl=0;

    public int getIsl() {
        return isl;
    }

    public int getPtn() {
        return ptn;
    }

    public int getPtt() {
        return ptt;
    }

    public void setPtt(int ptt) {
        this.ptt = Math.max(0,Math.min(160000,ptt));
    }

    public void setPtn(int ptn) {
        this.ptn = Math.max(0,Math.min(160000,ptn));
    }

    public void setIsl(int isl) {
        this.isl = Math.max(0,Math.min(192000,isl));
    }

    public FoodDataManager(){
        this.ptt=0;
        this.ptn=0;
        this.isl=0;
    }

    public FoodDataManager(int ptt,int ptn,int isl){
        this.setPtt(ptt);
        this.setPtn(ptn);
        this.setIsl(isl);
    }
}
