package com.ziterz.quizcodepolitan;

/**
 * Created by ziter on 5/21/2017.
 */

public class soal {
    int soal;
    boolean kunci;

    public soal(int soal, boolean kunci) {
        this.soal = soal;
        this.kunci = kunci;
    }

    public void setSoal(int soal) {
        this.soal = soal;
    }

    public void setKunci(boolean kunci) {
        this.kunci = kunci;
    }

    public int getSoal() {

        return soal;
    }

    public boolean isKunci() {
        return kunci;
    }
}
