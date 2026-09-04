package com.umeng.analytics.pro;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: TIOStreamTransport.java */
/* JADX INFO: loaded from: classes4.dex */
public class ce extends cg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected InputStream f104670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected OutputStream f104671b;

    protected ce() {
        this.f104670a = null;
        this.f104671b = null;
    }

    public ce(InputStream inputStream) {
        this.f104671b = null;
        this.f104670a = inputStream;
    }

    public ce(InputStream inputStream, OutputStream outputStream) {
        this.f104670a = inputStream;
        this.f104671b = outputStream;
    }

    public ce(OutputStream outputStream) {
        this.f104670a = null;
        this.f104671b = outputStream;
    }

    @Override // com.umeng.analytics.pro.cg
    public int a(byte[] bArr, int i10, int i11) throws ch {
        InputStream inputStream = this.f104670a;
        if (inputStream == null) {
            throw new ch(1, "Cannot read from null inputStream");
        }
        try {
            int i12 = inputStream.read(bArr, i10, i11);
            if (i12 >= 0) {
                return i12;
            }
            throw new ch(4);
        } catch (IOException e10) {
            throw new ch(0, e10);
        }
    }

    @Override // com.umeng.analytics.pro.cg
    public boolean a() {
        return true;
    }

    @Override // com.umeng.analytics.pro.cg
    public void b() throws ch {
    }

    @Override // com.umeng.analytics.pro.cg
    public void b(byte[] bArr, int i10, int i11) throws ch {
        OutputStream outputStream = this.f104671b;
        if (outputStream == null) {
            throw new ch(1, "Cannot write to null outputStream");
        }
        try {
            outputStream.write(bArr, i10, i11);
        } catch (IOException e10) {
            throw new ch(0, e10);
        }
    }

    @Override // com.umeng.analytics.pro.cg
    public void c() {
        InputStream inputStream = this.f104670a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            this.f104670a = null;
        }
        OutputStream outputStream = this.f104671b;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e11) {
                e11.printStackTrace();
            }
            this.f104671b = null;
        }
    }

    @Override // com.umeng.analytics.pro.cg
    public void d() throws ch {
        OutputStream outputStream = this.f104671b;
        if (outputStream == null) {
            throw new ch(1, "Cannot flush null outputStream");
        }
        try {
            outputStream.flush();
        } catch (IOException e10) {
            throw new ch(0, e10);
        }
    }
}
