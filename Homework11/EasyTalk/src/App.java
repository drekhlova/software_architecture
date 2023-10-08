import javax.swing.SwingUtilities;

import View.Authentication;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Authentication();
            }
        });
    }
}