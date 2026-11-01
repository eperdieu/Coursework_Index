package tests;



import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.util.Date;


public class TalkingClock {
    
    private int interval;
    private boolean beep;
    
    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }
    
    public void start() {
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval, listener);
        t.start();
    }
    
    class TimePrinter implements ActionListener { //modifiers? INNERCLASS
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("At the tone, the time is " + new Date());
            if(TalkingClock.this.beep) { //disambiguation
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
    
    public static void main(String[] args){
        
        TalkingClock clock = new TalkingClock(2000, true);
        TalkingClock.TimePrinter printer = clock.new TimePrinter();
        printer.actionPerformed(null);
        clock.start();
        
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
