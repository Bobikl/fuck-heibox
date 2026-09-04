package com.xiaomi.push;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes4.dex */
public class gu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f107233a = {80, 85, org.apache.tools.tar.c.P, 72};

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private byte f505a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int f506a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private short f507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f107234b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f107235a = new c();

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public static final d f508a = new d();

        public static byte[] a(byte[] bArr) {
            return a(bArr, f508a);
        }

        public static byte[] a(byte[] bArr, b bVar) {
            if (!gu.m429a(bArr)) {
                return bArr;
            }
            gu guVarA = gu.a(bArr);
            return (guVarA.f505a == 0 || guVarA.f505a != bVar.a()) ? guVarA.f107234b : bVar.a(guVarA.f107234b, guVarA.f506a);
        }
    }

    public interface b {
        byte a();

        byte[] a(byte[] bArr, int i10);
    }

    public static final class c {
    }

    public static final class d implements b {
        @Override // com.xiaomi.push.gu.b
        public byte a() {
            return (byte) 2;
        }

        @Override // com.xiaomi.push.gu.b
        public byte[] a(byte[] bArr, int i10) throws Throwable {
            GZIPInputStream gZIPInputStream = null;
            try {
                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(new ByteArrayInputStream(bArr), i10);
                try {
                    byte[] bArr2 = new byte[i10];
                    gZIPInputStream2.read(bArr2);
                    try {
                        gZIPInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return bArr2;
                } catch (IOException unused2) {
                    gZIPInputStream = gZIPInputStream2;
                    if (gZIPInputStream != null) {
                        try {
                            gZIPInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return bArr;
                } catch (Throwable th2) {
                    th = th2;
                    gZIPInputStream = gZIPInputStream2;
                    if (gZIPInputStream != null) {
                        try {
                            gZIPInputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused5) {
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    protected gu(byte b10, int i10, byte[] bArr) {
        this((short) 1, b10, i10, bArr);
    }

    protected gu(short s10, byte b10, int i10, byte[] bArr) {
        this.f507a = s10;
        this.f505a = b10;
        this.f506a = i10;
        this.f107234b = bArr;
    }

    public static gu a(byte b10, int i10, byte[] bArr) {
        return new gu(b10, i10, bArr);
    }

    public static gu a(short s10, byte b10, int i10, byte[] bArr) {
        return new gu(s10, b10, i10, bArr);
    }

    public static gu a(byte[] bArr) {
        if (!m429a(bArr)) {
            return a((byte) 0, bArr.length, bArr);
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.getInt();
        short s10 = byteBufferOrder.getShort();
        byte b10 = byteBufferOrder.get();
        int i10 = byteBufferOrder.getInt();
        byte[] bArr2 = new byte[byteBufferOrder.getInt()];
        byteBufferOrder.get(bArr2);
        return a(s10, b10, i10, bArr2);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m429a(byte[] bArr) {
        byte[] bArr2 = f107233a;
        return a(bArr2, bArr, bArr2.length);
    }

    public static boolean a(byte[] bArr, byte[] bArr2, int i10) {
        if (bArr.length < i10 || bArr2.length < i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }
}
