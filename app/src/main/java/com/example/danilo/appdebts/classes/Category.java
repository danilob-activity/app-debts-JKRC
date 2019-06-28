package com.example.danilo.appdebts.classes;

/**
 * Created by aluno on 28/06/19.
 */

public class Category {
    private long mid;
    private String mtipo;

    public Category(String mtipo) {
        this.mtipo = mtipo;
    }

    public Category(){

    }

    public long getMid() {
        return mid;
    }

    public String getMtipo() {
        return mtipo;
    }

    public void setMid(long mid) {
        this.mid = mid;
    }

    public void setMtipo(String mtipo) {
        this.mtipo = mtipo;
    }


}
