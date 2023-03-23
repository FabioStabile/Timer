
public class SecondsCounter extends Thread{
    private GUI gui;
    private int sn = 0;

    public SecondsCounter(GUI gui) {
        this.gui = gui;
    }


    @Override
    public void run() {
        gui.setThread(true);
        // TODO Auto-generated method stub
        while(gui.isStop() == false) {
            sn = Integer.parseInt(gui.getSecondsLbl().getText());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            sn++;

            gui.getSecondsLbl().setText("" + sn);
        }
        gui.setThread(false);

    }


}
