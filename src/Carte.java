class Carte {
    private String titlu;

    public Carte(String titlu) {
        this.titlu = titlu;
    }

    @Override
    public String toString() {
        return "Carte: " + titlu;
    }
}