package com.tencent.liteav.videoconsumer.a;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videoconsumer.decoder.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f100538a = false;

    /* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC0966a {
        boolean a(int i10, int i11, int i12, int i13);
    }

    private static void a(b bVar) throws IOException {
        int iC = bVar.c();
        bVar.a(4);
        bVar.a(4);
        for (int i10 = 0; i10 <= iC; i10++) {
            bVar.d();
            bVar.d();
            bVar.a(1);
        }
        bVar.a(5);
        bVar.a(5);
        bVar.a(5);
        bVar.a(5);
    }

    public static byte[] a(byte[] bArr) {
        byte b10;
        byte[] bArr2 = new byte[(bArr.length * 3) / 2];
        int i10 = 0;
        int i11 = 0;
        while (i10 < bArr.length) {
            if (i10 < bArr.length - 2 && (b10 = bArr[i10]) == 0) {
                int i12 = i10 + 1;
                if (bArr[i12] == 0) {
                    int i13 = i10 + 2;
                    if (bArr[i13] <= 3) {
                        int i14 = i11 + 1;
                        bArr2[i11] = b10;
                        int i15 = i14 + 1;
                        bArr2[i14] = bArr[i12];
                        bArr2[i15] = 3;
                        i11 = i15 + 1;
                        i10 = i13;
                    }
                }
            }
            bArr2[i11] = bArr[i10];
            i10++;
            i11++;
        }
        if (i11 == bArr.length) {
            return bArr;
        }
        byte[] bArr3 = new byte[i11];
        System.arraycopy(bArr2, 0, bArr3, 0, i11);
        return bArr3;
    }

    public final byte[] a(InputStream inputStream, InterfaceC0966a interfaceC0966a) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b bVar = new b(inputStream, byteArrayOutputStream);
        bVar.b(8);
        int iA = (int) bVar.a();
        bVar.b(8);
        bVar.a();
        bVar.d();
        boolean z10 = false;
        if (iA == 100 || iA == 110 || iA == 122 || iA == 144) {
            if (bVar.c() == 3) {
                bVar.b(1);
            }
            bVar.d();
            bVar.d();
            bVar.b(1);
            if (bVar.a(true)) {
                for (int i10 = 0; i10 < 8; i10++) {
                    if (bVar.a(true)) {
                        if (i10 < 6) {
                            bVar.c(16);
                        } else {
                            bVar.c(64);
                        }
                    }
                }
            }
        }
        bVar.d();
        int iC = bVar.c();
        if (iC == 0) {
            bVar.d();
        } else if (iC == 1) {
            bVar.b(1);
            bVar.d();
            bVar.d();
            int iC2 = bVar.c();
            for (int i11 = 0; i11 < iC2; i11++) {
                bVar.d();
            }
        }
        bVar.c();
        bVar.b(1);
        bVar.d();
        bVar.d();
        if (!bVar.a(true)) {
            bVar.b(1);
        }
        bVar.b(1);
        if (bVar.a(true) && !interfaceC0966a.a(bVar.c(), bVar.c(), bVar.c(), bVar.c())) {
            return null;
        }
        if (bVar.a(false)) {
            bVar.b(true);
            if (bVar.a(true) && ((int) bVar.a()) == 255) {
                bVar.b(16);
                bVar.b(16);
            }
            if (bVar.a(true)) {
                bVar.b(1);
            }
            if (bVar.a(true)) {
                bVar.b(3);
                bVar.b(1);
                if (bVar.a(true)) {
                    bVar.b(8);
                    bVar.b(8);
                    bVar.b(8);
                }
            }
            if (bVar.a(true)) {
                bVar.d();
                bVar.d();
            }
            if (bVar.a(true)) {
                bVar.b(32);
                bVar.b(32);
                bVar.b(1);
            }
            boolean zA = bVar.a(true);
            if (zA) {
                a(bVar);
            }
            boolean zA2 = bVar.a(true);
            if (zA2) {
                a(bVar);
            }
            if (zA || zA2) {
                bVar.b(1);
            }
            bVar.b(1);
            if (bVar.a(false)) {
                bVar.b(true);
                bVar.a(true);
                bVar.d();
                bVar.d();
                bVar.d();
                bVar.d();
                bVar.d();
                if (!this.f100538a) {
                    LiteavLog.w("H264SPSModifier", "decode: do not add max_dec_frame_buffering when it is ".concat(String.valueOf(bVar.b())));
                    this.f100538a = true;
                }
            } else {
                bVar.b(true);
                bVar.b(true);
                bVar.d(0);
                bVar.d(0);
                bVar.d(10);
                bVar.d(10);
                bVar.d(0);
                bVar.d(1);
                if (!this.f100538a) {
                    LiteavLog.w("H264SPSModifier", "decode: add max_dec_frame_buffering 1 when it is no exist");
                    this.f100538a = true;
                }
                z10 = true;
            }
            if (!z10) {
                return null;
            }
        } else {
            bVar.b(true);
            bVar.b(false);
            bVar.b(false);
            bVar.b(false);
            bVar.b(false);
            bVar.b(false);
            bVar.b(false);
            bVar.b(false);
            bVar.b(false);
            bVar.b(true);
            bVar.b(true);
            bVar.d(0);
            bVar.d(0);
            bVar.d(10);
            bVar.d(10);
            bVar.d(0);
            bVar.d(1);
            if (!this.f100538a) {
                LiteavLog.w("H264SPSModifier", "decode: add max_dec_frame_buffering 1 when vui is no exist");
                this.f100538a = true;
            }
        }
        bVar.e();
        return byteArrayOutputStream.toByteArray();
    }
}
