
import java.awt.*;

public class Tile {
    int value;

    public Tile() {
        this.value = 0;
    }

    public Tile(int value) {
        this.value = value;
    }

    public boolean isEmpty() {
        if (value == 0) {
            return true;
        } else {
            return false;
        }
    }


    public Color getFontColor() { // возвращающий новый цвет(объект типа Color) (0x776e65)
        //    в случае, если вес плитки меньше 16, иначе - 0xf9f6f2.
        if (value < 16) {
            return new Color( 0x776e65 );
        } else {
            return new Color( 0xf9f6f2 );
        }
    }

    public Color getTileColor() {
        switch (value) {
            case 0:return new Color( 0xcdc1b4 );
            case 2 :return new Color( 0xeee4da );
            case 4:return new Color( 0xede0c8 );
            case 8:return new Color( 0xf2b179 );
            case 16:return new Color( 0xf59563 );
            case 32:return new Color( 0xf67c5f );
            case 64:return new Color( 0xf65e3b );
            case 128:return new Color( 0xedcf72 );
            case 256:return new Color( 0xedcc61 );
            case 512:return new Color( 0xedc850 );
            case 1024:return new Color( 0xedc53f );
            case 2048:return new Color( 0xedc22e );
            default:return new Color(0xff0000);
        }
    }
    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
