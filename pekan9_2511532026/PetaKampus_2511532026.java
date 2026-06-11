package pekan9_2511532026;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

public class PetaKampus_2511532026 extends JFrame {

    private Map<String, List<String>> graph_2026;
    private Map<String, int[]> nodePos_2026;
    private List<String> visitedNodes_2026 = new ArrayList<>();
    private List<String> pathResult_2026 = new ArrayList<>();
    private Set<String> highlightVisited_2026 = new HashSet<>();
    private List<String> highlightPath_2026 = new ArrayList<>();

    private GraphPanel_2026 graphPanel_2026;
    private JTextArea resultArea_2026;
    private JComboBox<String> startCombo_2026;
    private JComboBox<String> goalCombo_2026;

    private String[] nodes_2026 = {
        "Gerbang Utama", "Rektorat", "Perpustakaan", "Fakultas Teknik",
        "Fakultas MIPA", "Fakultas Ekonomi", "Lab Komputer", "Lab Fisika",
        "Masjid Kampus", "Kantin Pusat", "Gedung Serbaguna", "Lapangan"
    };

    public PetaKampus_2511532026() {
        initGraph_2026();
        initGUI_2026();
    }

    private void initGraph_2026() {
        graph_2026 = new LinkedHashMap<>();
        nodePos_2026 = new LinkedHashMap<>();

        // Posisi node di canvas 760x420
        nodePos_2026.put("Gerbang Utama",   new int[]{60,  210});
        nodePos_2026.put("Rektorat",         new int[]{200, 130});
        nodePos_2026.put("Perpustakaan",     new int[]{200, 300});
        nodePos_2026.put("Fakultas Teknik",  new int[]{360, 70});
        nodePos_2026.put("Fakultas MIPA",    new int[]{360, 210});
        nodePos_2026.put("Fakultas Ekonomi", new int[]{360, 350});
        nodePos_2026.put("Lab Komputer",     new int[]{510, 120});
        nodePos_2026.put("Lab Fisika",       new int[]{510, 270});
        nodePos_2026.put("Masjid Kampus",    new int[]{200, 420});
        nodePos_2026.put("Kantin Pusat",     new int[]{510, 390});
        nodePos_2026.put("Gedung Serbaguna", new int[]{650, 200});
        nodePos_2026.put("Lapangan",         new int[]{650, 350});

        for (String n : nodes_2026) graph_2026.put(n, new ArrayList<>());

        // 17 edges
        addEdge_2026("Gerbang Utama",   "Rektorat");
        addEdge_2026("Gerbang Utama",   "Perpustakaan");
        addEdge_2026("Gerbang Utama",   "Masjid Kampus");
        addEdge_2026("Rektorat",        "Fakultas Teknik");
        addEdge_2026("Rektorat",        "Fakultas MIPA");
        addEdge_2026("Perpustakaan",    "Fakultas MIPA");
        addEdge_2026("Perpustakaan",    "Fakultas Ekonomi");
        addEdge_2026("Fakultas Teknik", "Lab Komputer");
        addEdge_2026("Fakultas Teknik", "Fakultas MIPA");
        addEdge_2026("Fakultas MIPA",   "Lab Fisika");
        addEdge_2026("Fakultas MIPA",   "Fakultas Ekonomi");
        addEdge_2026("Fakultas Ekonomi","Kantin Pusat");
        addEdge_2026("Fakultas Ekonomi","Masjid Kampus");
        addEdge_2026("Lab Komputer",    "Gedung Serbaguna");
        addEdge_2026("Lab Fisika",      "Kantin Pusat");
        addEdge_2026("Lab Fisika",      "Gedung Serbaguna");
        addEdge_2026("Gedung Serbaguna","Lapangan");
        addEdge_2026("Kantin Pusat",    "Lapangan");
    }

    private void addEdge_2026(String a, String b) {
        graph_2026.get(a).add(b);
        graph_2026.get(b).add(a);
    }

    // =================== BFS ===================
    public List<String> BFS(String start_2026, String goal_2026) {
        Map<String, String> parent_2026 = new LinkedHashMap<>();
        Queue<String> queue_2026 = new LinkedList<>();
        Set<String> visited_2026 = new LinkedHashSet<>();
        visitedNodes_2026 = new ArrayList<>();

        queue_2026.add(start_2026);
        visited_2026.add(start_2026);
        parent_2026.put(start_2026, null);

        while (!queue_2026.isEmpty()) {
            String current_2026 = queue_2026.poll();
            visitedNodes_2026.add(current_2026);
            if (current_2026.equals(goal_2026)) return buildPath_2026(parent_2026, goal_2026);
            for (String neighbor_2026 : graph_2026.get(current_2026)) {
                if (!visited_2026.contains(neighbor_2026)) {
                    visited_2026.add(neighbor_2026);
                    parent_2026.put(neighbor_2026, current_2026);
                    queue_2026.add(neighbor_2026);
                }
            }
        }
        return new ArrayList<>();
    }

    // =================== DFS ===================
    public List<String> DFS(String start_2026, String goal_2026) {
        Map<String, String> parent_2026 = new LinkedHashMap<>();
        Stack<String> stack_2026 = new Stack<>();
        Set<String> visited_2026 = new LinkedHashSet<>();
        visitedNodes_2026 = new ArrayList<>();

        stack_2026.push(start_2026);
        parent_2026.put(start_2026, null);

        while (!stack_2026.isEmpty()) {
            String current_2026 = stack_2026.pop();
            if (visited_2026.contains(current_2026)) continue;
            visited_2026.add(current_2026);
            visitedNodes_2026.add(current_2026);
            if (current_2026.equals(goal_2026)) return buildPath_2026(parent_2026, goal_2026);
            List<String> neighbors_2026 = new ArrayList<>(graph_2026.get(current_2026));
            Collections.reverse(neighbors_2026);
            for (String neighbor_2026 : neighbors_2026) {
                if (!visited_2026.contains(neighbor_2026)) {
                    parent_2026.put(neighbor_2026, current_2026);
                    stack_2026.push(neighbor_2026);
                }
            }
        }
        return new ArrayList<>();
    }

    private List<String> buildPath_2026(Map<String, String> parent_2026, String goal_2026) {
        List<String> path_2026 = new ArrayList<>();
        String cur_2026 = goal_2026;
        while (cur_2026 != null) { path_2026.add(0, cur_2026); cur_2026 = parent_2026.get(cur_2026); }
        return path_2026;
    }

    // =================== displayGraph ===================
    public void displayGraph() { graphPanel_2026.repaint(); }

    // =================== displayPath ===================
    public void displayPath(String algo_2026, List<String> path_2026) {
        StringBuilder sb_2026 = new StringBuilder();
        sb_2026.append("=== Hasil Pencarian : ").append(algo_2026).append(" ===\n");
        sb_2026.append("Jalur           : ");
        sb_2026.append(path_2026.isEmpty() ? "Tidak ditemukan!" : String.join(" → ", path_2026));
        sb_2026.append("\nNode Dikunjungi : ").append(String.join(", ", visitedNodes_2026));
        sb_2026.append("\nJumlah Node Dikunjungi : ").append(visitedNodes_2026.size());
        resultArea_2026.setText(sb_2026.toString());
    }

    // =================== resetGraph ===================
    public void resetGraph() {
        highlightVisited_2026.clear();
        highlightPath_2026.clear();
        visitedNodes_2026.clear();
        pathResult_2026.clear();
        resultArea_2026.setText("Hasil Pencarian :\nJalur :\nNode Dikunjungi :\nJumlah Node Dikunjungi : 0");
        graphPanel_2026.repaint();
    }

    // =================== GUI ===================
    private void initGUI_2026() {
        setTitle("Peta Kampus - BFS & DFS | NIM: 2511532026");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(6, 6));
        getContentPane().setBackground(new Color(240, 244, 255));

        // Header
        JLabel header_2026 = new JLabel("PENCARIAN JALUR KAMPUS MENGGUNAKAN BFS DAN DFS", SwingConstants.CENTER);
        header_2026.setFont(new Font("Segoe UI", Font.BOLD, 15));
        header_2026.setOpaque(true);
        header_2026.setBackground(new Color(25, 70, 150));
        header_2026.setForeground(Color.WHITE);
        header_2026.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Controls
        JPanel ctrl_2026 = new JPanel(new FlowLayout(FlowLayout.LEFT, 12, 6));
        ctrl_2026.setBackground(new Color(225, 235, 255));
        ctrl_2026.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(170, 195, 230)));

        ctrl_2026.add(boldLabel_2026("Lokasi Awal :"));
        startCombo_2026 = new JComboBox<>(nodes_2026);
        startCombo_2026.setPreferredSize(new Dimension(155, 28));
        ctrl_2026.add(startCombo_2026);

        ctrl_2026.add(boldLabel_2026("Lokasi Tujuan :"));
        goalCombo_2026 = new JComboBox<>(nodes_2026);
        goalCombo_2026.setSelectedIndex(nodes_2026.length - 1);
        goalCombo_2026.setPreferredSize(new Dimension(155, 28));
        ctrl_2026.add(goalCombo_2026);

        JButton btnBFS_2026   = makeBtn_2026("[ BFS ]",   new Color(30, 150, 60));
        JButton btnDFS_2026   = makeBtn_2026("[ DFS ]",   new Color(200, 110, 10));
        JButton btnReset_2026 = makeBtn_2026("[ RESET ]", new Color(185, 30, 30));
        ctrl_2026.add(btnBFS_2026);
        ctrl_2026.add(btnDFS_2026);
        ctrl_2026.add(btnReset_2026);

        JPanel north_2026 = new JPanel(new BorderLayout());
        north_2026.add(header_2026, BorderLayout.NORTH);
        north_2026.add(ctrl_2026,   BorderLayout.SOUTH);
        add(north_2026, BorderLayout.NORTH);

        // Graph
        graphPanel_2026 = new GraphPanel_2026();
        graphPanel_2026.setPreferredSize(new Dimension(760, 450));
        graphPanel_2026.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(new Color(100, 140, 210), 2),
            "Visualisasi Graph - Peta Kampus",
            TitledBorder.LEFT, TitledBorder.TOP,
            new Font("Segoe UI", Font.BOLD, 12), new Color(25, 70, 150)));

        // Result
        resultArea_2026 = new JTextArea(6, 60);
        resultArea_2026.setFont(new Font("Monospaced", Font.PLAIN, 13));
        resultArea_2026.setEditable(false);
        resultArea_2026.setBackground(new Color(20, 26, 46));
        resultArea_2026.setForeground(new Color(160, 220, 110));
        resultArea_2026.setBorder(BorderFactory.createEmptyBorder(8, 12, 8, 12));
        resultArea_2026.setText("Hasil Pencarian :\nJalur :\nNode Dikunjungi :\nJumlah Node Dikunjungi : 0");

        JScrollPane scroll_2026 = new JScrollPane(resultArea_2026);
        scroll_2026.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(new Color(80, 120, 190), 2),
            "Hasil Pencarian",
            TitledBorder.LEFT, TitledBorder.TOP,
            new Font("Segoe UI", Font.BOLD, 12), new Color(25, 70, 150)));

        JSplitPane split_2026 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, graphPanel_2026, scroll_2026);
        split_2026.setDividerLocation(460);
        split_2026.setResizeWeight(0.72);
        add(split_2026, BorderLayout.CENTER);

        // Legend
        JPanel legend_2026 = new JPanel(new FlowLayout(FlowLayout.LEFT, 16, 4));
        legend_2026.setBackground(new Color(240, 244, 255));
        legend_2026.add(legendDot_2026("Node Biasa",     new Color(60, 120, 210)));
        legend_2026.add(legendDot_2026("Dikunjungi",     new Color(240, 170, 20)));
        legend_2026.add(legendDot_2026("Jalur Terpilih", new Color(40, 200, 90)));
        legend_2026.add(legendDot_2026("Start / Goal",   new Color(210, 50, 50)));
        add(legend_2026, BorderLayout.SOUTH);

        // Actions
        btnBFS_2026.addActionListener(e -> runSearch_2026("BFS"));
        btnDFS_2026.addActionListener(e -> runSearch_2026("DFS"));
        btnReset_2026.addActionListener(e -> resetGraph());

        pack();
        setMinimumSize(new Dimension(820, 720));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void runSearch_2026(String algo_2026) {
        String start = (String) startCombo_2026.getSelectedItem();
        String goal  = (String) goalCombo_2026.getSelectedItem();
        if (start.equals(goal)) { JOptionPane.showMessageDialog(this, "Lokasi awal dan tujuan harus berbeda!"); return; }
        pathResult_2026  = algo_2026.equals("BFS") ? BFS(start, goal) : DFS(start, goal);
        highlightVisited_2026 = new HashSet<>(visitedNodes_2026);
        highlightPath_2026    = new ArrayList<>(pathResult_2026);
        displayPath(algo_2026, pathResult_2026);
        displayGraph();
    }

    private JButton makeBtn_2026(String text, Color bg) {
        JButton b = new JButton(text);
        b.setBackground(bg); b.setForeground(Color.WHITE);
        b.setFont(new Font("Segoe UI", Font.BOLD, 13));
        b.setFocusPainted(false);
        b.setBorder(BorderFactory.createEmptyBorder(6, 16, 6, 16));
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        return b;
    }

    private JLabel boldLabel_2026(String t) {
        JLabel l = new JLabel(t); l.setFont(new Font("Segoe UI", Font.BOLD, 13)); return l;
    }

    private JPanel legendDot_2026(String label, Color color) {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT, 4, 0));
        p.setBackground(new Color(240, 244, 255));
        JLabel dot = new JLabel("●"); dot.setForeground(color); dot.setFont(new Font("Dialog", Font.PLAIN, 18));
        p.add(dot); p.add(new JLabel(label)); return p;
    }

    // =================== Graph Panel ===================
    class GraphPanel_2026 extends JPanel {
        private static final int R = 27;

        public GraphPanel_2026() { setBackground(new Color(15, 22, 40)); }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            String start = (String) startCombo_2026.getSelectedItem();
            String goal  = (String) goalCombo_2026.getSelectedItem();

            // Draw edges
            for (String node : graph_2026.keySet()) {
                int[] p1 = nodePos_2026.get(node);
                for (String nb : graph_2026.get(node)) {
                    if (node.compareTo(nb) > 0) continue; // draw once
                    int[] p2 = nodePos_2026.get(nb);
                    boolean onPath = false;
                    for (int i = 0; i < highlightPath_2026.size() - 1; i++) {
                        String a = highlightPath_2026.get(i), b = highlightPath_2026.get(i + 1);
                        if ((a.equals(node)&&b.equals(nb))||(b.equals(node)&&a.equals(nb))) { onPath=true; break; }
                    }
                    if (onPath) { g2.setColor(new Color(40, 210, 90));  g2.setStroke(new BasicStroke(3.5f)); }
                    else        { g2.setColor(new Color(70, 95, 145));  g2.setStroke(new BasicStroke(1.8f)); }
                    g2.drawLine(p1[0], p1[1], p2[0], p2[1]);
                }
            }

            // Draw nodes
            for (String node : nodes_2026) {
                int[] pos = nodePos_2026.get(node);
                Color c;
                if (node.equals(start) || node.equals(goal)) c = new Color(210, 50, 50);
                else if (highlightPath_2026.contains(node))  c = new Color(40, 200, 90);
                else if (highlightVisited_2026.contains(node)) c = new Color(240, 170, 20);
                else c = new Color(60, 120, 210);

                g2.setColor(new Color(0,0,0,70));
                g2.fillOval(pos[0]-R+3, pos[1]-R+3, R*2, R*2);
                g2.setColor(c);
                g2.fillOval(pos[0]-R, pos[1]-R, R*2, R*2);
                g2.setColor(Color.WHITE); g2.setStroke(new BasicStroke(2f));
                g2.drawOval(pos[0]-R, pos[1]-R, R*2, R*2);

                // Label
                g2.setColor(Color.WHITE);
                g2.setFont(new Font("Segoe UI", Font.BOLD, 10));
                FontMetrics fm = g2.getFontMetrics();
                String[] words = node.split(" ");
                if (words.length == 1) {
                    g2.drawString(node, pos[0] - fm.stringWidth(node)/2, pos[1]+4);
                } else if (words.length == 2) {
                    g2.drawString(words[0], pos[0]-fm.stringWidth(words[0])/2, pos[1]-3);
                    g2.drawString(words[1], pos[0]-fm.stringWidth(words[1])/2, pos[1]+10);
                } else {
                    String l1 = words[0]+" "+words[1], l2 = words[2];
                    g2.setFont(new Font("Segoe UI", Font.BOLD, 9));
                    fm = g2.getFontMetrics();
                    g2.drawString(l1, pos[0]-fm.stringWidth(l1)/2, pos[1]-3);
                    g2.drawString(l2, pos[0]-fm.stringWidth(l2)/2, pos[1]+9);
                }

                // Badge
                g2.setFont(new Font("Segoe UI", Font.BOLD, 9));
                if (node.equals(start)) { g2.setColor(new Color(50,220,100)); g2.drawString("START", pos[0]-16, pos[1]-R-5); }
                if (node.equals(goal))  { g2.setColor(new Color(255,100,100)); g2.drawString("GOAL",  pos[0]-12, pos[1]-R-5); }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); } catch (Exception ignored) {}
            new PetaKampus_2511532026();
        });
    }
}