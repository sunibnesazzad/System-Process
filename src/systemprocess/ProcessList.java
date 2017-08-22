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
public class ProcessList {
    
    String name;
    String time;
    String date;
    Processtime pt;
    
    public ProcessList(String name, String time, String date)
    {
        this.date = date;
        this.name = name;
        this.time = time;
    }
    
    public String getProcesstime()
    {
        return pt.getDay()+" : "+pt.getHr()+ " : " + pt.getMin() + " : " + pt.getSec();
    }
}
