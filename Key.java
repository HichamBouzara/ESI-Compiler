public class Key {

    private int x;
    private int y;

    public Key() {
    }

    public Key(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void debut(int x) {
        this.x = x;
    }

    public void fin(int y) {
        this.y = y;
    }

    public int getDebut() {
        return this.x;
    }

    public int getFin() {
        return this.y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Key))
            return false;
        Key key = (Key) o;
        return x == key.x && y == key.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

}