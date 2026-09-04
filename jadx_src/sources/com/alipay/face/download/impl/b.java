package com.alipay.face.download.impl;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.face.download.e;
import com.alipay.face.download.g;
import com.alipay.face.download.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/* JADX INFO: compiled from: BioResCheckerImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f38762d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f38763e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f38764f = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f38765c = null;

    private int d(Context context, com.alipay.face.download.c cVar) throws IOException {
        if (g.m().l().a(context)) {
            if ("armeabi".equalsIgnoreCase(cVar.d()) || "armeabi-v7a".equalsIgnoreCase(cVar.d())) {
                return 0;
            }
        } else if (com.max.xiaoheihe.dynamic_so.a.f77018b.equalsIgnoreCase(cVar.d())) {
            return 0;
        }
        File fileG = g(context, cVar);
        if (!fileG.exists() || !fileG.isFile()) {
            return 1;
        }
        if (TextUtils.isEmpty(cVar.a())) {
            return 0;
        }
        return cVar.a().equalsIgnoreCase(f(fileG)) ? 2 : 1;
    }

    private int e(Context context, com.alipay.face.download.d dVar) throws IOException {
        File fileG = g(context, dVar);
        if (!fileG.exists() || !fileG.isFile()) {
            return 1;
        }
        if (TextUtils.isEmpty(dVar.a())) {
            return 0;
        }
        return dVar.a().equalsIgnoreCase(f(fileG)) ? 2 : 1;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0063: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:32:0x0063 */
    private static String f(File file) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i10 = fileInputStream.read(bArr, 0, 8192);
                        if (i10 == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, i10);
                    }
                    byte[] bArrDigest = messageDigest.digest();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < 16; i11++) {
                        sb2.append(String.format("%02x", Byte.valueOf(bArrDigest[i11])));
                    }
                    String string = sb2.toString();
                    try {
                        fileInputStream.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                    return string;
                } catch (NoSuchAlgorithmException e11) {
                    e = e11;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream3 = fileInputStream2;
                if (fileInputStream3 != null) {
                    try {
                        fileInputStream3.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (NoSuchAlgorithmException e14) {
            e = e14;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStream3 != null) {
                fileInputStream3.close();
            }
            throw th;
        }
    }

    private File g(Context context, com.alipay.face.download.b bVar) {
        if (!TextUtils.isEmpty(bVar.b())) {
            return new File(bVar.b(), bVar.getFileName());
        }
        bVar.c(this.f38765c);
        return new File(this.f38765c, bVar.getFileName());
    }

    @Override // com.alipay.face.download.e
    public void a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            this.f38765c = str;
        } else {
            this.f38765c = new File(context.getFilesDir(), "bio").getAbsolutePath();
        }
    }

    @Override // com.alipay.face.download.e
    public int b(Context context, i iVar, List<com.alipay.face.download.b> list, List<com.alipay.face.download.b> list2) {
        return 0;
    }

    @Override // com.alipay.face.download.e
    public boolean c() {
        return true;
    }
}
