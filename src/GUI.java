import java.awt.*;
import javax.swing.*;

public class GUI {
    private JFrame frmPrincipale;
    private JButton startBtn, stopBtn;
    private JLabel secondsLbl;
    private boolean stop = false;
    private boolean thread = false;

    public GUI() {
        frmPrincipale = new JFrame("Timer");
        frmPrincipale.setLayout(new GridLayout(3, 1));

        secondsLbl = new JLabel("" + 0);

        startBtn = new JButton("Start");
        startBtn.addActionListener(e ->{
            if(this.isThread() == false) {
                SecondsCounter sc = new SecondsCounter(this);
                sc.start();
            }
        });


        stopBtn = new JButton("Stop");
        stopBtn.addActionListener(e ->{
            try {
                stop = true;
            }catch(Exception ex) {
                ex.printStackTrace();
            }
        });

        frmPrincipale.add(startBtn);
        frmPrincipale.add(secondsLbl);
        frmPrincipale.add(stopBtn);

        Dimension dimension = new Dimension(400, 400);
        frmPrincipale.setSize(dimension);
        frmPrincipale.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

    public JFrame getFrmPrincipale() {
        return frmPrincipale;
    }

    public void setFrmPrincipale(JFrame frmPrincipale) {
        this.frmPrincipale = frmPrincipale;
    }

    public JButton getStartBtn() {
        return startBtn;
    }

    public void setStartBtn(JButton startBtn) {
        this.startBtn = startBtn;
    }

    public JButton getStopBtn() {
        return stopBtn;
    }

    public void setStopBtn(JButton stopBtn) {
        this.stopBtn = stopBtn;
    }

    public JLabel getSecondsLbl() {
        return secondsLbl;
    }

    public void setSecondsLbl(JLabel secondsLbl) {
        this.secondsLbl = secondsLbl;
    }

    public boolean isStop() {
        return stop;
    }

    public boolean isThread() {
        return thread;
    }

    public void setThread(boolean thread) {
        this.thread = thread;
    }




}