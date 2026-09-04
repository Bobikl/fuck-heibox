package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import mj.g;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* JADX INFO: compiled from: BCodec.java */
/* JADX INFO: loaded from: classes5.dex */
public class a extends d implements g, mj.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f133009d;

    public a() {
        this("UTF-8");
    }

    public a(String str) {
        this.f133009d = str;
    }

    @Override // mj.g
    public String a(String str) throws EncoderException {
        if (str == null) {
            return null;
        }
        return g(str, h());
    }

    @Override // org.apache.commons.codec.net.d
    protected byte[] c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return org.apache.commons.codec.binary.d.u(bArr);
    }

    @Override // org.apache.commons.codec.net.d
    protected byte[] d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return org.apache.commons.codec.binary.d.w(bArr);
    }

    @Override // mj.d
    public Object decode(Object obj) throws DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be decoded using BCodec");
    }

    @Override // mj.f
    public String decode(String str) throws DecoderException {
        if (str == null) {
            return null;
        }
        try {
            return b(str);
        } catch (UnsupportedEncodingException e10) {
            throw new DecoderException(e10.getMessage(), e10);
        }
    }

    @Override // mj.e
    public Object encode(Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return a((String) obj);
        }
        throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be encoded using BCodec");
    }

    @Override // org.apache.commons.codec.net.d
    protected String f() {
        return "B";
    }

    public String g(String str, String str2) throws EncoderException {
        if (str == null) {
            return null;
        }
        try {
            return e(str, str2);
        } catch (UnsupportedEncodingException e10) {
            throw new EncoderException(e10.getMessage(), e10);
        }
    }

    public String h() {
        return this.f133009d;
    }
}
