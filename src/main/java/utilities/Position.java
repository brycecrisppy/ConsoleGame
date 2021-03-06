package utilities;

public class Position {

    // region | Member Variables ---------------------------------------------------------------------------------------

    public int x, y;

    // endregion

    // region | Constructor --------------------------------------------------------------------------------------------

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // endregion

    // region | Utility Methods ----------------------------------------------------------------------------------------

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // endregion
}
