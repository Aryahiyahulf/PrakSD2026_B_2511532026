package pekan7_2511532026;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;

public class SortingGUI_2511532026 extends JFrame {

    private JTextField txtNama_2026;
    private JTextField txtNim_2026;
    private JTextField txtProdi_2026;

    private JTextArea areaData_2026;

    private JComboBox<String> comboSorting_2026;

    private ArrayList<Mahasiswa_2511532026> listMahasiswa_2026 =
            new ArrayList<>();

    public SortingGUI_2511532026() {

        setTitle("Sorting Mahasiswa 2511532026");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelInput_2026 = new JPanel(new GridLayout(4, 2));

        panelInput_2026.add(new JLabel("Nama"));
        txtNama_2026 = new JTextField();
        panelInput_2026.add(txtNama_2026);

        panelInput_2026.add(new JLabel("NIM"));
        txtNim_2026 = new JTextField();
        panelInput_2026.add(txtNim_2026);

        panelInput_2026.add(new JLabel("Prodi"));
        txtProdi_2026 = new JTextField();
        panelInput_2026.add(txtProdi_2026);

        comboSorting_2026 = new JComboBox<>();
        comboSorting_2026.addItem("Insertion Sort");
        comboSorting_2026.addItem("Selection Sort");
        comboSorting_2026.addItem("Bubble Sort");

        panelInput_2026.add(comboSorting_2026);

        JButton btnTambah_2026 = new JButton("Tambah");
        panelInput_2026.add(btnTambah_2026);

        add(panelInput_2026, BorderLayout.NORTH);

        areaData_2026 = new JTextArea();
        JScrollPane scroll_2026 = new JScrollPane(areaData_2026);

        add(scroll_2026, BorderLayout.CENTER);

        JButton btnSorting_2026 = new JButton("Mulai Sorting");

        add(btnSorting_2026, BorderLayout.SOUTH);

        btnTambah_2026.addActionListener(e -> tambahData_2026());

        btnSorting_2026.addActionListener(e -> prosesSorting_2026());
    }

    private void tambahData_2026() {

        String nama_2026 = txtNama_2026.getText();
        String nim_2026 = txtNim_2026.getText();
        String prodi_2026 = txtProdi_2026.getText();

        Mahasiswa_2511532026 mhs_2026 =
                new Mahasiswa_2511532026(
                        nama_2026,
                        nim_2026,
                        prodi_2026);

        listMahasiswa_2026.add(mhs_2026);

        tampilkanData_2026();

        txtNama_2026.setText("");
        txtNim_2026.setText("");
        txtProdi_2026.setText("");
    }

    private void tampilkanData_2026() {

        areaData_2026.setText("");

        for (Mahasiswa_2511532026 mhs_2026 : listMahasiswa_2026) {
            areaData_2026.append(mhs_2026.toString() + "\n");
        }
    }

    private void prosesSorting_2026() {

        String pilihan_2026 =
                comboSorting_2026.getSelectedItem().toString();

        areaData_2026.setText("");

        if (pilihan_2026.equals("Insertion Sort")) {

            insertionSort_2026();

        } else if (pilihan_2026.equals("Selection Sort")) {

            selectionSort_2026();

        } else {

            bubbleSort_2026();
        }
    }

    private void insertionSort_2026() {

        areaData_2026.append("=== INSERTION SORT ===\n");

        for (int i_2026 = 1;
             i_2026 < listMahasiswa_2026.size();
             i_2026++) {

            Mahasiswa_2511532026 key_2026 =
                    listMahasiswa_2026.get(i_2026);

            int j_2026 = i_2026 - 1;

            while (j_2026 >= 0 &&
                    listMahasiswa_2026.get(j_2026)
                    .getNama_2026()
                    .compareToIgnoreCase(
                            key_2026.getNama_2026()) > 0) {

                listMahasiswa_2026.set(
                        j_2026 + 1,
                        listMahasiswa_2026.get(j_2026));

                j_2026--;
            }

            listMahasiswa_2026.set(j_2026 + 1, key_2026);

            tampilLangkah_2026(i_2026);
        }
    }

    private void selectionSort_2026() {

        areaData_2026.append("=== SELECTION SORT ===\n");

        for (int i_2026 = 0;
             i_2026 < listMahasiswa_2026.size() - 1;
             i_2026++) {

            int min_2026 = i_2026;

            for (int j_2026 = i_2026 + 1;
                 j_2026 < listMahasiswa_2026.size();
                 j_2026++) {

                if (listMahasiswa_2026.get(j_2026)
                        .getNama_2026()
                        .compareToIgnoreCase(
                                listMahasiswa_2026.get(min_2026)
                                        .getNama_2026()) < 0) {

                    min_2026 = j_2026;
                }
            }

            Mahasiswa_2511532026 temp_2026 =
                    listMahasiswa_2026.get(i_2026);

            listMahasiswa_2026.set(
                    i_2026,
                    listMahasiswa_2026.get(min_2026));

            listMahasiswa_2026.set(min_2026, temp_2026);

            tampilLangkah_2026(i_2026 + 1);
        }
    }

    private void bubbleSort_2026() {

        areaData_2026.append("=== BUBBLE SORT ===\n");

        for (int i_2026 = 0;
             i_2026 < listMahasiswa_2026.size() - 1;
             i_2026++) {

            for (int j_2026 = 0;
                 j_2026 < listMahasiswa_2026.size() - i_2026 - 1;
                 j_2026++) {

                if (listMahasiswa_2026.get(j_2026)
                        .getNama_2026()
                        .compareToIgnoreCase(
                                listMahasiswa_2026.get(j_2026 + 1)
                                        .getNama_2026()) > 0) {

                    Mahasiswa_2511532026 temp_2026 =
                            listMahasiswa_2026.get(j_2026);

                    listMahasiswa_2026.set(
                            j_2026,
                            listMahasiswa_2026.get(j_2026 + 1));

                    listMahasiswa_2026.set(
                            j_2026 + 1,
                            temp_2026);
                }
            }

            tampilLangkah_2026(i_2026 + 1);
        }
    }

    private void tampilLangkah_2026(int langkah_2026) {

        areaData_2026.append(
                "Langkah " + langkah_2026 + " : ");

        for (Mahasiswa_2511532026 mhs_2026 : listMahasiswa_2026) {

            areaData_2026.append(
                    mhs_2026.getNama_2026() + " ");
        }

        areaData_2026.append("\n");
    }

    public static void main(String[] args) {

        new SortingGUI_2511532026().setVisible(true);
    }
}