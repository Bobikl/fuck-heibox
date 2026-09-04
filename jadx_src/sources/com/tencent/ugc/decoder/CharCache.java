package com.tencent.ugc.decoder;

/* JADX INFO: loaded from: classes4.dex */
public class CharCache {
    private final char[] cache;
    private int pos;

    public CharCache(int i10) {
        this.cache = new char[i10];
    }

    public void append(char c10) {
        int i10 = this.pos;
        char[] cArr = this.cache;
        if (i10 < cArr.length - 1) {
            cArr[i10] = c10;
            this.pos = i10 + 1;
        }
    }

    public void append(String str) {
        char[] charArray = str.toCharArray();
        int iMin = Math.min(charArray.length, this.cache.length - this.pos);
        System.arraycopy(charArray, 0, this.cache, this.pos, iMin);
        this.pos += iMin;
    }

    public void clear() {
        this.pos = 0;
    }

    public int length() {
        return this.pos;
    }

    public String toString() {
        return new String(this.cache, 0, this.pos);
    }
}
