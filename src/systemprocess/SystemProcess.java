package systemprocess;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Crunchify.com
 *
 */
public class SystemProcess {

    String[] processList = new String[]{"oracle", "netbeans64", "chrome", "firefox", "operamini", "codeblocks", "KMPplayer", "skype", "VLCmediaplayer", "MATLAB", "idman", "Dropbox", "googledrive"};

    ArrayList<ProcessList> list = new ArrayList<>();
    static ArrayList<ProcessList> mainlist = new ArrayList<>();
    static SystemProcess sp1 = null;

    public void process() {
        try {
            String process;
            String command = "powershell.exe Get-Process | Select-Object id, starttime, name |Sort-Object name";
			// getRuntime: Returns the runtime object associated with the current Java application.
            // exec: Executes the specified string command in a separate process.
            Process p = Runtime.getRuntime().exec(command);

      //     prop(p);
            SystemProcess sp = new SystemProcess();

            sp.jple(p);

            update(sp);

            Timer t = new Timer();
            t.scheduleAtFixedRate(new TimerTask() {

                @Override
                public void run() {
                    sp1 = new SystemProcess();

                    try {
                        String process;
                        String command = "powershell.exe Get-Process | Select-Object id, starttime, name |Sort-Object name";
			// getRuntime: Returns the runtime object associated with the current Java application.
                        // exec: Executes the specified string command in a separate process.
                        Process p = Runtime.getRuntime().exec(command);

                        SystemProcess sp2 = new SystemProcess();

                        sp2.jple(p);

                        outer:
                        for (ProcessList mp : mainlist) {
                            boolean flag = true;
                            for (ProcessList prr : sp2.list) {
                                if (mp.name.equalsIgnoreCase(prr.name)) {
                                    calculatetime(mp);
                                    flag = false;
                                    continue outer;
                                }
                            }
                            if (flag) {
                                calculatetime(mp);
                            }
                        }

                        update(sp2);

                    } catch (Exception e) {
                        e.printStackTrace();

                    }

                }

                private void calculatetime(ProcessList mp) {
                    SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                    try {
                        Date datemp = df.parse(mp.date + " " + mp.time);
                        Date sys = new Date();

                        long diff = sys.getTime() - datemp.getTime();

                        long diffSeconds = diff / 1000 % 60;
                        long diffMinutes = diff / (60 * 1000) % 60;
                        long diffHours = diff / (60 * 60 * 1000) % 24;
                        long diffDays = diff / (24 * 60 * 60 * 1000);

                        mp.pt = new Processtime(diffSeconds, diffMinutes, diffHours, diffDays);

//                                    System.out.println(mp.name + "==" +diffSeconds+"         " + diffMinutes +"         " + diffHours +"         " + diffDays);
                    } catch (ParseException ex) {
                        Logger.getLogger(SystemProcess.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }, 0, 10000);

        } catch (Exception err) {
            err.printStackTrace();
        }

    }

    public void setproceesses(String[] list) {
        this.processList = list;
        for (String item : processList) {
            System.out.println(item);
        }
    }

    private void update(SystemProcess sp) {
        for (int i = 0; i < sp.list.size(); i++) {
            for (int j = 0; j < sp.processList.length; j++) {
                if (sp.list.get(i).name.equalsIgnoreCase(sp.processList[j])) {
                    ProcessList p = sp.list.get(i);
                    if (p.date.isEmpty()) {
                        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
                        p.date = df.format(new Date());
                        df = new SimpleDateFormat("HH:mm:ss");
                        p.time = df.format(new Date());
                    }
                    mainlist.add(p);
                }
            }

        }
//        for(int i=0; i<mainlist.size();i++)
//            System.out.println(sp.mainlist.get(i).name + "  "+mainlist.get(i).date+" "+mainlist.get(i).time);
//        System.out.println("##################################");
    }

    private void prop(Process p) {
        Scanner sc = new Scanner(p.getInputStream());
        while (sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println(s);
        }
    }

    private void jple(Process p) {

        String id, s, s1, s2, name;

        Scanner sc = new Scanner(p.getInputStream());
        int i = 0;
        while (sc.hasNext()) {
            if (i < 2) {
                id = sc.next();
                s = sc.next();
                name = sc.next();
//               System.out.println(id+ "#####"+ s+"======"+name);
                i++;
                continue;
            }

            id = sc.next();
            s = sc.next();
            s1 = "";
            s2 = "";
            name = "";
            if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
                s1 = sc.next();
                s2 = sc.next();
                name = sc.next();

            } else {

                //           System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                name = s;
                s = "";
            }

            list.add(new ProcessList(name, s1, s));

//            System.out.println(id+ "#####"+ s+"//////////////"+s1+"  "+s2+"======"+name);
        }

    }

//    class ProcessList {
//    
//    String name;
//    String time;
//    String date;
//    
//    public ProcessList(String name, String time, String date)
//    {
//        this.date = date;
//        this.name = name;
//        this.time = time;
//    }
//    }
}
