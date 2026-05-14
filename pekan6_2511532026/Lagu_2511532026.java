package pekan6_2511532026;
public class Lagu_2511532026 {

    String judul_2026;
    String penyanyi_2026;

    Lagu_2511532026 next_2026;
    Lagu_2511532026 prev_2026;

    // Constructor
    public Lagu_2511532026(String judul_2026, String penyanyi_2026) {

        this.judul_2026 = judul_2026;
        this.penyanyi_2026 = penyanyi_2026;

        this.next_2026 = null;
        this.prev_2026 = null;
    }

    // Getter
    public String getJudul_2026() {
        return judul_2026;
    }

    public String getPenyanyi_2026() {
        return penyanyi_2026;
    }

    // Setter
    public void setJudul_2026(String judul_2026) {
        this.judul_2026 = judul_2026;
    }

    public void setPenyanyi_2026(String penyanyi_2026) {
        this.penyanyi_2026 = penyanyi_2026;
    }
}
