package pekan7_2511532026;

public class Mahasiswa_2511532026 {

    private String nama_2026;
    private String nim_2026;
    private String prodi_2026;

    public Mahasiswa_2511532026(String nama_2026, String nim_2026, String prodi_2026) {
        this.nama_2026 = nama_2026;
        this.nim_2026 = nim_2026;
        this.prodi_2026 = prodi_2026;
    }

    public String getNama_2026() {
        return nama_2026;
    }

    public void setNama_2026(String nama_2026) {
        this.nama_2026 = nama_2026;
    }

    public String getNim_2026() {
        return nim_2026;
    }

    public void setNim_2026(String nim_2026) {
        this.nim_2026 = nim_2026;
    }

    public String getProdi_2026() {
        return prodi_2026;
    }

    public void setProdi_2026(String prodi_2026) {
        this.prodi_2026 = prodi_2026;
    }

    @Override
    public String toString() {
        return nama_2026 + " - " + nim_2026 + " - " + prodi_2026;
    }
}