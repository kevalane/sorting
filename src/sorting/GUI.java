package sorting;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;


public class GUI {

    private static final Color PILLAR_COLOR = new Color(255,0,0,50);
    JFrame frame;
    Container pane;
    String[] algorithms;


    public GUI(String[] algorithms) {
        this.frame = new JFrame("Sorting Visualizer");
        this.pane = frame.getContentPane();
        this.algorithms = algorithms;
        this.initGui();
    }

    private void initGui() {
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addButtons();
        // this.addBoard();
        this.frame.pack();
        this.frame.setResizable(false);
        this.frame.setVisible(true);
    }

    private void addButtons() {
        JPanel panel = new JPanel();
        JComboBox<String> algos = new JComboBox<>(this.algorithms);
        JButton solveButton = new JButton("Solve");

        panel.add(algos);
        panel.add(solveButton);

        this.pane.add(panel, BorderLayout.PAGE_END);
        this.frame.getRootPane().setDefaultButton(solveButton);

        solveButton.addActionListener(e -> {
            String selectedAlgo = "You selected " + algos.getItemAt(algos.getSelectedIndex());
            JOptionPane.showMessageDialog(null, "You selected " + selectedAlgo);
        });
    }
}
