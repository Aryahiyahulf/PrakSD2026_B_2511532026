package pekan7_2511532026;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class InsertionGUI_2511532026 extends JFrame {

    private static final long serialVersionUID = 1L;
    private int[] array_2026;
    private JLabel[] labelArray_2026;

    private JButton stepButton_2026, resetButton_2026, setButton_2026;
    private JTextField inputField_2026;

    private JPanel panelArray_2026;
    private JTextArea stepArea_2026;

    private int i_2026 = 1, j_2026;
    private boolean sorting_2026 = false;
    private int stepCount_2026 = 1;

    private JPanel contentPane;

    public InsertionGUI_2511532026() {

        setTitle("Insertion Sort Langkah per Langkah");
        setSize(750, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel inputPanel_2026 = new JPanel(new FlowLayout());

        inputField_2026 = new JTextField(30);
        setButton_2026 = new JButton("Set Array");

        inputPanel_2026.add(new JLabel("Masukkan angka (pisahkan dengan koma) : "));
        inputPanel_2026.add(inputField_2026);
        inputPanel_2026.add(setButton_2026);

        panelArray_2026 = new JPanel();
        panelArray_2026.setLayout(new FlowLayout());

        JPanel controlPanel_2026 = new JPanel();

        stepButton_2026 = new JButton("Langkah Selanjutnya");
        resetButton_2026 = new JButton("Reset");

        stepButton_2026.setEnabled(false);

        controlPanel_2026.add(stepButton_2026);
        controlPanel_2026.add(resetButton_2026);

        stepArea_2026 = new JTextArea(8, 60);
        stepArea_2026.setEditable(false);
        stepArea_2026.setFont(new Font("Monospaced", Font.PLAIN, 14));

        JScrollPane ScrollPane_2026 = new JScrollPane(stepArea_2026);

        add(inputPanel_2026, BorderLayout.NORTH);
        add(panelArray_2026, BorderLayout.CENTER);
        add(controlPanel_2026, BorderLayout.SOUTH);
        add(ScrollPane_2026, BorderLayout.EAST);

        setButton_2026.addActionListener(e -> setArrayFromInput_2026());
        stepButton_2026.addActionListener(e -> performStep_2026());
        resetButton_2026.addActionListener(e -> reset_2026());
    }

    private void setArrayFromInput_2026() {

        String text = inputField_2026.getText().trim();

        if (text.isEmpty())
            return;

        String[] parts = text.split(",");
        array_2026 = new int[parts.length];

        try {
            for (int k = 0; k < parts.length; k++) {
                array_2026[k] = Integer.parseInt(parts[k].trim());
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Masukkan hanya angka yang dipisahkan dengan koma",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);

            return;
        }

        stepCount_2026 = 1;
        sorting_2026 = true;
        i_2026 = 1; // reset index

        stepButton_2026.setEnabled(true);

        stepArea_2026.setText("");
        panelArray_2026.removeAll();

        labelArray_2026 = new JLabel[array_2026.length];

        for (int k = 0; k < array_2026.length; k++) {

            labelArray_2026[k] = new JLabel(String.valueOf(array_2026[k]));

            labelArray_2026[k].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray_2026[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_2026[k].setPreferredSize(new Dimension(50, 50));
            labelArray_2026[k].setHorizontalAlignment(SwingConstants.CENTER);

            panelArray_2026.add(labelArray_2026[k]);
        }

        panelArray_2026.revalidate();
        panelArray_2026.repaint();
    }

    private void performStep_2026() {
        if (i_2026 < array_2026.length && sorting_2026) {
            int key_2026 = array_2026[i_2026];
            j_2026 = i_2026 - 1;

            StringBuilder stepLog_2026 = new StringBuilder();
            stepLog_2026.append("Langkah ").append(stepCount_2026)
                    .append(": Memasukkan ").append(key_2026).append("\n");

            while (j_2026 >= 0 && array_2026[j_2026] > key_2026) {
                array_2026[j_2026 + 1] = array_2026[j_2026];
                j_2026--;
            }

            array_2026[j_2026 + 1] = key_2026;

            updateLabels_2026();
            stepLog_2026.append("Hasil: ")
                    .append(arrayToString_2026(array_2026))
                    .append("\n\n");
            stepArea_2026.append(stepLog_2026.toString());

            i_2026++;
            stepCount_2026++;

            if (i_2026 == array_2026.length) {
                sorting_2026 = false;
                stepButton_2026.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Sorting selesai!");
            }
        }
    }

    private void updateLabels_2026() {
        for (int k_2026 = 0; k_2026 < array_2026.length; k_2026++) {
            labelArray_2026[k_2026].setText(String.valueOf(array_2026[k_2026]));
        }
    }

    private void reset_2026() {
        inputField_2026.setText("");
        panelArray_2026.removeAll();
        panelArray_2026.revalidate();
        panelArray_2026.repaint();
        stepArea_2026.setText("");
        stepButton_2026.setEnabled(false);
        sorting_2026 = false;
        i_2026 = 1;
        stepCount_2026 = 1;
    }

    private String arrayToString_2026(int[] arr_2026) {
        StringBuilder sb_2026 = new StringBuilder();
        for (int k_2026 = 0; k_2026 < arr_2026.length; k_2026++) {
            sb_2026.append(arr_2026[k_2026]);
            if (k_2026 < arr_2026.length - 1)
                sb_2026.append(", ");
        }
        return sb_2026.toString();
    }

    public static void main(String[] args_2026) {
        SwingUtilities.invokeLater(() -> {
            InsertionGUI_2511532026 gui_2026 = new InsertionGUI_2511532026();
            gui_2026.setVisible(true);
        });
    }
}