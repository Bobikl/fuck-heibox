package org.apache.commons.codec.net;

import org.apache.commons.codec.DecoderException;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes5.dex */
public class f {
    f() {
    }

    static int a(byte b10) throws DecoderException {
        int iDigit = Character.digit((char) b10, 16);
        if (iDigit != -1) {
            return iDigit;
        }
        throw new DecoderException("Invalid URL encoding: not a valid digit (radix 16): " + ((int) b10));
    }
}
