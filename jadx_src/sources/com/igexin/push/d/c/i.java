package com.igexin.push.d.c;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f63857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f63858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f63859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f63860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<j> f63861e;

    public i() {
        this.f63827i = 4;
        this.f63828j = com.google.common.base.a.f56671x;
    }

    private String a(byte[] bArr, int i10, int i11) {
        try {
            return new String(bArr, i10, i11, "UTF-8");
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.igexin.push.d.c.c
    public void a(byte[] bArr) {
        this.f63857a = com.igexin.a.a.b.e.e(bArr, 0);
        this.f63858b = bArr[8];
        this.f63859c = com.igexin.a.a.b.e.d(bArr, 9) & (-1);
        int i10 = 13;
        if (bArr.length > 13) {
            int i11 = 14;
            int i12 = bArr[13] & 255;
            if (i12 > 0) {
                this.f63861e = new ArrayList();
                int i13 = i12 + 14;
                while (i11 < i13) {
                    j jVar = new j();
                    this.f63861e.add(jVar);
                    int i14 = i11 + 1;
                    int iA = com.igexin.a.a.b.e.a(bArr, i11) & 255;
                    int i15 = i14 + 1;
                    int iA2 = com.igexin.a.a.b.e.a(bArr, i14) & 255;
                    jVar.f63862a = (byte) iA;
                    if ((iA == 1 || iA == 4) && iA2 > 0) {
                        try {
                            jVar.f63863b = new String(bArr, i15, iA2, "UTF-8");
                        } catch (Exception unused) {
                        }
                    }
                    i11 = i15 + iA2;
                }
            }
            i10 = i11;
        }
        if (bArr.length > i10) {
            this.f63860d = a(bArr, i10 + 1, bArr[i10] & 255);
        }
    }

    @Override // com.igexin.push.d.c.c
    public byte[] c() {
        int length;
        int i10;
        List<j> list = this.f63861e;
        byte[] byteArray = null;
        if (list != null && list.size() > 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterator<j> it = this.f63861e.iterator();
            while (it.hasNext()) {
                try {
                    byteArrayOutputStream.write(it.next().c());
                    byteArray = byteArrayOutputStream.toByteArray();
                } catch (IOException unused) {
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused2) {
            }
        }
        if (byteArray != null) {
            length = byteArray.length;
            i10 = length + 1;
        } else {
            length = 0;
            i10 = 1;
        }
        byte[] bArr = new byte[i10 + 12 + this.f63860d.getBytes().length + 1];
        int iA = com.igexin.a.a.b.e.a(this.f63857a, bArr, 0);
        int iA2 = iA + com.igexin.a.a.b.e.a(((this.f63858b & 255) << 24) | this.f63859c, bArr, iA);
        int iC = iA2 + com.igexin.a.a.b.e.c(length, bArr, iA2);
        if (length > 0) {
            iC += com.igexin.a.a.b.e.a(byteArray, 0, bArr, iC, length);
        }
        byte[] bytes = this.f63860d.getBytes();
        com.igexin.a.a.b.e.c(bytes.length, bArr, iC);
        System.arraycopy(bytes, 0, bArr, iC + 1, bytes.length);
        return bArr;
    }
}
