class Video {
    private String titlu;

    public Video(String titlu) {
        this.titlu = titlu;
    }

    @Override
    public String toString() {
        return "Video: " + titlu;
    }
}