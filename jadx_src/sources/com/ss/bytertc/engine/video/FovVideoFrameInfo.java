package com.ss.bytertc.engine.video;

import com.bytedance.realx.base.CalledByNative;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class FovVideoFrameInfo {
    private int destColumn;
    private int destRow;
    private int hdColumn;
    private int hdHeight;
    private int hdRow;
    private int hdWidth;
    private int ldColumn;
    private int ldHeight;
    private int ldRow;
    private int ldWidth;
    private int tileHeight;
    private HashMap<Short, Short> tileMap = new HashMap<>();
    private int tileWidth;

    @CalledByNative
    public static FovVideoFrameInfo genFovVideoFrameInfo() {
        return new FovVideoFrameInfo();
    }

    @CalledByNative
    private void putTileMapValue(short s10, short s11) {
        this.tileMap.put(Short.valueOf(s10), Short.valueOf(s11));
    }

    @CalledByNative
    private void setDestColumn(int i10) {
        this.destColumn = i10;
    }

    @CalledByNative
    private void setDestRow(int i10) {
        this.destRow = i10;
    }

    @CalledByNative
    private void setHdColumn(int i10) {
        this.hdColumn = i10;
    }

    @CalledByNative
    private void setHdHeight(int i10) {
        this.hdHeight = i10;
    }

    @CalledByNative
    private void setHdRow(int i10) {
        this.hdRow = i10;
    }

    @CalledByNative
    private void setHdWidth(int i10) {
        this.hdWidth = i10;
    }

    @CalledByNative
    private void setLdColumn(int i10) {
        this.ldColumn = i10;
    }

    @CalledByNative
    private void setLdHeight(int i10) {
        this.ldHeight = i10;
    }

    @CalledByNative
    private void setLdRow(int i10) {
        this.ldRow = i10;
    }

    @CalledByNative
    private void setLdWidth(int i10) {
        this.ldWidth = i10;
    }

    @CalledByNative
    private void setTileHeight(int i10) {
        this.tileHeight = i10;
    }

    @CalledByNative
    private void setTileWidth(int i10) {
        this.tileWidth = i10;
    }

    public int getDestColumn() {
        return this.destColumn;
    }

    public int getDestRow() {
        return this.destRow;
    }

    public int getHdColumn() {
        return this.hdColumn;
    }

    public int getHdHeight() {
        return this.hdHeight;
    }

    public int getHdRow() {
        return this.hdRow;
    }

    public int getHdWidth() {
        return this.hdWidth;
    }

    public int getLdColumn() {
        return this.ldColumn;
    }

    public int getLdHeight() {
        return this.ldHeight;
    }

    public int getLdRow() {
        return this.ldRow;
    }

    public int getLdWidth() {
        return this.ldWidth;
    }

    public int getTileHeight() {
        return this.tileHeight;
    }

    public HashMap<Short, Short> getTileMap() {
        return this.tileMap;
    }

    public int getTileWidth() {
        return this.tileWidth;
    }
}
