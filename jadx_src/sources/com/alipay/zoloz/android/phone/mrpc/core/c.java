package com.alipay.zoloz.android.phone.mrpc.core;

import org.apache.http.protocol.HTTP;
import org.apache.http.util.CharArrayBuffer;

/* JADX INFO: compiled from: CharArrayBuffers.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final char f39636a = ' ';

    c() {
    }

    static boolean a(CharArrayBuffer charArrayBuffer, int i10, String str) {
        int length = charArrayBuffer.length();
        char[] cArrBuffer = charArrayBuffer.buffer();
        while (i10 < length && HTTP.isWhitespace(cArrBuffer[i10])) {
            i10++;
        }
        int length2 = str.length();
        boolean z10 = length >= i10 + length2;
        for (int i11 = 0; z10 && i11 < length2; i11++) {
            char c10 = cArrBuffer[i10 + i11];
            char cCharAt = str.charAt(i11);
            if (c10 != cCharAt) {
                z10 = c(c10) == c(cCharAt);
            }
        }
        return z10;
    }

    static int b(CharArrayBuffer charArrayBuffer, int i10) {
        int length = charArrayBuffer.length();
        char[] cArrBuffer = charArrayBuffer.buffer();
        for (int i11 = 0; i11 < length; i11++) {
            char c10 = cArrBuffer[i11];
            if (c10 == i10) {
                return i11;
            }
            if (c10 >= 'A' && c10 <= 'Z') {
                cArrBuffer[i11] = (char) (c10 + f39636a);
            }
        }
        return -1;
    }

    private static char c(char c10) {
        return (c10 < 'A' || c10 > 'Z') ? c10 : (char) (c10 + f39636a);
    }
}
