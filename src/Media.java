class Media<T> {
    private T content;

    public Media(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}