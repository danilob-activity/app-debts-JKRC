package com.example.danilo.appdebts.classes;

/**
 * Created by aluno on 28/06/19.
 */

public class Debts {
    private long mid;
    private long mcod_cat;
    private float mvalor;
    private String mdescricao;
    private String mpaymentDate;
    private String mexpirationDate;

    public Debts(long mid, long mcod_cat, float mvalor, String mdescricao, String mpaymentDate, String mexpirationDate) {
        this.mid = mid;
        this.mcod_cat = mcod_cat;
        this.mvalor = mvalor;
        this.mdescricao = mdescricao;
        this.mpaymentDate = mpaymentDate;
        this.mexpirationDate = mexpirationDate;
    }

    public Debts(){

    }

    public long getMid() {
        return mid;
    }

    public long getMcod_cat() {
        return mcod_cat;
    }

    public float getMvalor() {
        return mvalor;
    }

    public String getMdescricao() {
        return mdescricao;
    }

    public String getMpaymentDate() {
        return mpaymentDate;
    }

    public String getMexpirationDate() {
        return mexpirationDate;
    }

    public void setMid(long mid) {
        this.mid = mid;
    }

    public void setMcod_cat(long mcod_cat) {
        this.mcod_cat = mcod_cat;
    }

    public void setMvalor(float mvalor) {
        this.mvalor = mvalor;
    }

    public void setMdescricao(String mdescricao) {
        this.mdescricao = mdescricao;
    }

    public void setMpaymentDate(String mpaymentDate) {
        this.mpaymentDate = mpaymentDate;
    }

    public void setMexpirationDate(String mexpirationDate) {
        this.mexpirationDate = mexpirationDate;
    }


}
