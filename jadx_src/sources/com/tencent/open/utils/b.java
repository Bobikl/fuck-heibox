package com.tencent.open.utils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Properties;
import java.util.zip.ZipException;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final n f101155a = new n(101010256);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o f101156b = new o(38651);

    /* JADX INFO: compiled from: ProGuard */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Properties f101157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        byte[] f101158b;

        private a() {
            this.f101157a = new Properties();
        }

        void a(byte[] bArr) throws IOException {
            if (bArr == null) {
                return;
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int length = b.f101156b.a().length;
            byte[] bArr2 = new byte[length];
            byteBufferWrap.get(bArr2);
            if (!b.f101156b.equals(new o(bArr2))) {
                throw new ProtocolException("unknow protocl [" + Arrays.toString(bArr) + "]");
            }
            if (bArr.length - length <= 2) {
                return;
            }
            byte[] bArr3 = new byte[2];
            byteBufferWrap.get(bArr3);
            int iB = new o(bArr3).b();
            if ((bArr.length - length) - 2 < iB) {
                return;
            }
            byte[] bArr4 = new byte[iB];
            byteBufferWrap.get(bArr4);
            this.f101157a.load(new ByteArrayInputStream(bArr4));
            int length2 = ((bArr.length - length) - iB) - 2;
            if (length2 > 0) {
                byte[] bArr5 = new byte[length2];
                this.f101158b = bArr5;
                byteBufferWrap.get(bArr5);
            }
        }

        public String toString() {
            return "ApkExternalInfo [p=" + this.f101157a + ", otherData=" + Arrays.toString(this.f101158b) + "]";
        }
    }

    public static String a(File file) throws IOException {
        return a(file, "channelNo");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(File file, String str) throws Throwable {
        RandomAccessFile randomAccessFile = null;
        Object[] objArr = 0;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                byte[] bArrA = a(randomAccessFile2);
                if (bArrA == null) {
                    randomAccessFile2.close();
                    return null;
                }
                a aVar = new a();
                aVar.a(bArrA);
                String property = aVar.f101157a.getProperty(str);
                randomAccessFile2.close();
                return property;
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static byte[] a(RandomAccessFile randomAccessFile) throws IOException {
        boolean z10;
        long length = randomAccessFile.length() - 22;
        randomAccessFile.seek(length);
        byte[] bArrA = f101155a.a();
        int i10 = randomAccessFile.read();
        while (true) {
            z10 = true;
            if (i10 == -1) {
                z10 = false;
                break;
            }
            if (i10 == bArrA[0] && randomAccessFile.read() == bArrA[1] && randomAccessFile.read() == bArrA[2] && randomAccessFile.read() == bArrA[3]) {
                break;
            }
            length--;
            randomAccessFile.seek(length);
            i10 = randomAccessFile.read();
        }
        if (!z10) {
            throw new ZipException("archive is not a ZIP archive");
        }
        randomAccessFile.seek(length + 16 + 4);
        byte[] bArr = new byte[2];
        randomAccessFile.readFully(bArr);
        int iB = new o(bArr).b();
        if (iB == 0) {
            return null;
        }
        byte[] bArr2 = new byte[iB];
        randomAccessFile.read(bArr2);
        return bArr2;
    }
}
