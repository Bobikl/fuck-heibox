package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.binary.l;

/* JADX INFO: compiled from: RFC1522Codec.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final char f133020a = '?';

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final String f133021b = "?=";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final String f133022c = "=?";

    d() {
    }

    protected String b(String str) throws DecoderException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        if (!str.startsWith(f133022c) || !str.endsWith(f133021b)) {
            throw new DecoderException("RFC 1522 violation: malformed encoded content");
        }
        int length = str.length() - 2;
        int iIndexOf = str.indexOf(63, 2);
        if (iIndexOf == length) {
            throw new DecoderException("RFC 1522 violation: charset token not found");
        }
        String strSubstring = str.substring(2, iIndexOf);
        if (strSubstring.equals("")) {
            throw new DecoderException("RFC 1522 violation: charset not specified");
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(63, i10);
        if (iIndexOf2 == length) {
            throw new DecoderException("RFC 1522 violation: encoding token not found");
        }
        String strSubstring2 = str.substring(i10, iIndexOf2);
        if (f().equalsIgnoreCase(strSubstring2)) {
            int i11 = iIndexOf2 + 1;
            return new String(c(l.c(str.substring(i11, str.indexOf(63, i11)))), strSubstring);
        }
        throw new DecoderException("This codec cannot decode " + strSubstring2 + " encoded content");
    }

    protected abstract byte[] c(byte[] bArr) throws DecoderException;

    protected abstract byte[] d(byte[] bArr) throws EncoderException;

    protected String e(String str, String str2) throws EncoderException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(f133022c);
        stringBuffer.append(str2);
        stringBuffer.append(f133020a);
        stringBuffer.append(f());
        stringBuffer.append(f133020a);
        stringBuffer.append(l.k(d(str.getBytes(str2))));
        stringBuffer.append(f133021b);
        return stringBuffer.toString();
    }

    protected abstract String f();
}
