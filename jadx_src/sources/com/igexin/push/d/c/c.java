package com.igexin.push.d.c;

import okio.Utf8;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends com.igexin.a.a.d.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f63827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f63828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte f63829k = 11;

    protected int a(String str) {
        if (str.equals("UTF-8")) {
            return 1;
        }
        if (str.equals("UTF-16")) {
            return 2;
        }
        if (str.equals(mj.c.f131911d)) {
            return 16;
        }
        if (str.equals("UTF-16LE")) {
            return 17;
        }
        if (str.equals("GBK")) {
            return 25;
        }
        if (str.equals("GB2312")) {
            return 26;
        }
        if (str.equals("GB18030")) {
            return 27;
        }
        return str.equals("ISO-8859-1") ? 33 : 1;
    }

    protected String a(byte b10) {
        int i10 = b10 & Utf8.REPLACEMENT_BYTE;
        if (i10 == 1) {
            return "UTF-8";
        }
        if (i10 == 2) {
            return "UTF-16";
        }
        if (i10 == 16) {
            return mj.c.f131911d;
        }
        if (i10 == 17) {
            return "UTF-16LE";
        }
        if (i10 == 33) {
            return "ISO-8859-1";
        }
        switch (i10) {
            case 25:
                return "GBK";
            case 26:
                return "GB2312";
            case 27:
                return "GB18030";
            default:
                return "UTF-8";
        }
    }

    public abstract void a(byte[] bArr);

    @Override // com.igexin.a.a.d.a.e
    public int b_() {
        return this.f63827i;
    }

    public abstract byte[] c();
}
