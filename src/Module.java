public class Module {
    private int id;
            private String libelle;
            private String VH;
            private String frequence;
            public Module() {
    }

    public Module(int id, String libelle, String VH, String frequence) {
        this.id = id;
        this.libelle = libelle;
        this.VH = VH;
        this.frequence = frequence;
    }

    public int getId() {


        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getVH() {
        return VH;
    }

    public void setVH(String VH) {
        this.VH = VH;
    }

    public String getFrequence() {
        return frequence;
    }

    public void setFrequence(String frequence) {
        this.frequence = frequence;
    }
}

