package engine;

import utilities.Position;
import utilities.RenderingUtility;

public class Space {

    // region | Member Variables ---------------------------------------------------------------------------------------

    private final int maxColumns, maxRows;

    public final int maxEntityAmount;

    public Sprite[][] space;

    // endregion

    // region | Constructor --------------------------------------------------------------------------------------------

    public Space(int columns, int rows) {
        maxColumns = columns;
        maxRows = rows;
        maxEntityAmount =  maxColumns * maxRows;
        space = new Sprite[maxColumns][maxRows];

        initializeSpace();
    }

    // endregion

    // region | Utility Methods ----------------------------------------------------------------------------------------

    private void initializeSpace() {
        for (int column = 0; column < maxColumns; column++) {
            for (int row = 0; row < maxRows; row++) {
                space[column][row] = new Sprite(',');
            }
        }
    }

    public Space modify(Position position, Sprite sprite) {
        space[position.y][position.x] = sprite;
        return this;
    }

    // endregion

    // region | Rendering Methods --------------------------------------------------------------------------------------

    public void renderSpace() {
        RenderingUtility.render2DSpriteArray(space);
    }

    // endregion
}
