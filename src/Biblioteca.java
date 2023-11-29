class Biblioteca<T> {
    private T[] mediaList;
    private int index;

    public Biblioteca(int size) {
        this.mediaList = (T[]) new Object[size];
        this.index = 0;
    }

    public void adaugaMedia(T media) {
        if (index < mediaList.length) {
            mediaList[index++] = media;
        } else {
            System.out.println("Biblioteca este plina");
        }
    }

    public void afiseazaContinut() {
        System.out.println("Continutul bibliotecii:");

        for (T media : mediaList) {
            if (media != null) {
                System.out.println(media);
            }
        }
    }
}