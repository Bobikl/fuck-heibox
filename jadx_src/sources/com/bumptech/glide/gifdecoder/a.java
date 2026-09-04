package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: GifDecoder.java */
/* JADX INFO: loaded from: classes6.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f40673a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40674b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f40675c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f40676d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f40677e = 0;

    /* JADX INFO: renamed from: com.bumptech.glide.gifdecoder.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GifDecoder.java */
    public interface InterfaceC0323a {
        @n0
        byte[] a(int i10);

        @n0
        Bitmap b(int i10, int i11, @n0 Bitmap.Config config);

        void c(@n0 Bitmap bitmap);

        @n0
        int[] d(int i10);

        void e(@n0 byte[] bArr);

        void f(@n0 int[] iArr);
    }

    /* JADX INFO: compiled from: GifDecoder.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    int a();

    void b(@n0 Bitmap.Config config);

    @Deprecated
    int c();

    void clear();

    void d(@n0 c cVar, @n0 byte[] bArr);

    void e();

    int f();

    int g(@p0 InputStream inputStream, int i10);

    @n0
    ByteBuffer getData();

    int getHeight();

    int getWidth();

    int h();

    @p0
    Bitmap i();

    void j();

    int k();

    int l(int i10);

    int m();

    int n();

    void o(@n0 c cVar, @n0 ByteBuffer byteBuffer);

    void p(@n0 c cVar, @n0 ByteBuffer byteBuffer, int i10);

    int q();

    int read(@p0 byte[] bArr);
}
