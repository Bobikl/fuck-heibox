package com.xiaomi.push;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class kq extends kt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected InputStream f107807a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected OutputStream f929a;

    protected kq() {
        this.f107807a = null;
        this.f929a = null;
    }

    public kq(OutputStream outputStream) {
        this.f107807a = null;
        this.f929a = outputStream;
    }

    @Override // com.xiaomi.push.kt
    public int a(byte[] bArr, int i10, int i11) throws ku {
        InputStream inputStream = this.f107807a;
        if (inputStream == null) {
            throw new ku(1, "Cannot read from null inputStream");
        }
        try {
            int i12 = inputStream.read(bArr, i10, i11);
            if (i12 >= 0) {
                return i12;
            }
            throw new ku(4);
        } catch (IOException e10) {
            throw new ku(0, e10);
        }
    }

    @Override // com.xiaomi.push.kt
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void mo652a(byte[] bArr, int i10, int i11) throws ku {
        OutputStream outputStream = this.f929a;
        if (outputStream == null) {
            throw new ku(1, "Cannot write to null outputStream");
        }
        try {
            outputStream.write(bArr, i10, i11);
        } catch (IOException e10) {
            throw new ku(0, e10);
        }
    }
}
