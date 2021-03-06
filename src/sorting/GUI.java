package sorting;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics2D;
import java.awt.Graphics;


public class GUI extends JFrame {

    private static final Color PILLAR_COLOR = new Color(255,0,0,50);
    Container pane;
    String[] algorithms;
    int[] arrToSort;


    public GUI(String[] algorithms, int[] arr) {
        this.pane = this.getContentPane();
        this.algorithms = algorithms;
        this.arrToSort = arr;
        this.initGui();
    }

    private void initGui() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addButtons();
        this.setSize(800,800);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void changeArr(int[] arr) {
        this.arrToSort = arr;
    }

    @Override
    public void paint(Graphics g) {
        update(g);
    }

    public void update(Graphics g) {
        g.clearRect(0,0,800,700);
        Graphics2D g2d = (Graphics2D)g;
        for (int i = 0; i < arrToSort.length; i++) {
            g2d.setColor(PILLAR_COLOR);
            g2d.fillRect(i*8, 700 - arrToSort[i]*5, 7, arrToSort[i]*5);
        }
    }

    private void addButtons() {
        JPanel panel = new JPanel();
        JComboBox<String> algos = new JComboBox<>(this.algorithms);
        JButton solveButton = new JButton("Solve");

        panel.add(algos);
        panel.add(solveButton);

        this.pane.add(panel, BorderLayout.PAGE_END);
        this.getRootPane().setDefaultButton(solveButton);

        solveButton.addActionListener(e -> {
            String selectedAlgo = "You selected " + algos.getItemAt(algos.getSelectedIndex());
            JOptionPane.showMessageDialog(null, "You selected " + selectedAlgo);
        });
    }
}
