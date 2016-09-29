package jp.techacademy.yuichi.otsuka.jumpactiongame;

/**
 * Created by OtsukaYuichi on 2016/09/22.
 */

import com.badlogic.gdx.graphics.Texture;

public class Ufo extends GameObject {
    // UFOの横幅、高さ
    public static final float UFO_WIDTH = 2.0f;
    public static final float UFO_HEIGHT = 1.3f;

    public Ufo(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight) {
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(UFO_WIDTH, UFO_HEIGHT);
    }
}