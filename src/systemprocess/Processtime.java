/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemprocess;

/**
 *
 * @author Sazzad
 */
public class Processtime {
    
    private long sec;
    private long min;
    private long hr;
    private long day;

    public Processtime(long sec, long min, long hr, long day) {
        this.sec = sec;
        this.min = min;
        this.hr = hr;
        this.day = day;
    }

    public Processtime() {
    }

    public long getSec() {
        return sec;
    }

    public void setSec(long sec) {
        this.sec = sec;
    }

    public long getMin() {
        return min;
    }

    public void setMin(long min) {
        this.min = min;
    }

    public long getHr() {
        return hr;
    }

    public void setHr(long hr) {
        this.hr = hr;
    }

    public long getDay() {
        return day;
    }

    public void setDay(long day) {
        this.day = day;
    }
    
}
