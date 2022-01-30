package engine;

import utilities.RenderingUtility;

public class Space {

    // region | Member Variables ---------------------------------------------------------------------------------------

    private final int maxColumns, maxRows;

    public Sprite[][] space;

    // endregion

    // region | Components ---------------------------------------------------------------------------------------------

    RenderingUtility render = new RenderingUtility();

    // region | Constructor --------------------------------------------------------------------------------------------

    public Space(int desiredColumns, int desiredRows) {
        maxColumns = desiredColumns;
        maxRows = desiredRows;
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

    public Space modify(int column, int row, Sprite sprite) {
        space[column][row] = sprite;
        return this;
    }

    // endregion

    // region | Rendering Methods --------------------------------------------------------------------------------------

    public void renderSpace() {
        RenderingUtility.render2DArray(space);
    }

    // endregion
}