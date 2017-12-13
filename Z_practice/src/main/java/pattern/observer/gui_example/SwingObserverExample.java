package pattern.observer.gui_example;

import javax.swing.*;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/22
 */
public class SwingObserverExample {

    private JFrame frame;

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");
        button.addActionListener(e -> System.out.println("Don't do it, you might regret it!"));
        button.addActionListener(e -> System.out.println("Come on, do it!"));
        frame.add(button);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingObserverExample ex = new SwingObserverExample();
        ex.go();
    }
}
