package com.xiaomi.push;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class kb extends ByteArrayOutputStream {
    public kb() {
    }

    public kb(int i10) {
        super(i10);
    }

    public int a() {
        return ((ByteArrayOutputStream) this).count;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public byte[] m637a() {
        return ((ByteArrayOutputStream) this).buf;
    }
}
