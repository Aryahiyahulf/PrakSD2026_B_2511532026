package pekan5_2511532026;
public class Pasien_2511532026 {
    private String namaPasien_2026;
    private String keluhan_2026;
    private int nomorAntrian_2026;
    private Pasien_2511532026 next_2026;

    public Pasien_2511532026(String namaPasien_2026, String keluhan_2026, int nomorAntrian_2026) {
        this.namaPasien_2026 = namaPasien_2026;
        this.keluhan_2026 = keluhan_2026;
        this.nomorAntrian_2026 = nomorAntrian_2026;
        this.next_2026 = null;
    }

    public String getNamaPasien_2026() {
        return namaPasien_2026;
    }

    public String getKeluhan_2026() {
        return keluhan_2026;
    }

    public int getNomorAntrian_2026() {
        return nomorAntrian_2026;
    }

    public Pasien_2511532026 getNext_2026() {
        return next_2026;
    }

    public void setNamaPasien_2026(String namaPasien_2026) {
        this.namaPasien_2026 = namaPasien_2026;
    }

    public void setKeluhan_2026(String keluhan_2026) {
        this.keluhan_2026 = keluhan_2026;
    }

    public void setNomorAntrian_2026(int nomorAntrian_2026) {
        this.nomorAntrian_2026 = nomorAntrian_2026;
    }

    public void setNext_2026(Pasien_2511532026 next_2026) {
        this.next_2026 = next_2026;
    }
}