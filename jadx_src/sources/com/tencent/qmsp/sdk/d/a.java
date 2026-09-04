package com.tencent.qmsp.sdk.d;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    /* JADX WARN: Code duplicated, block: B:57:0x0074 A[ExcSplitCross -> B:47:0x0074, PHI: r2
  0x0074: PHI (r2v8 java.io.FileInputStream) = 
  (r2v5 java.io.FileInputStream)
  (r2v6 java.io.FileInputStream)
  (r2v7 java.io.FileInputStream)
  (r2v9 java.io.FileInputStream)
  (r2v10 java.io.FileInputStream)
 binds: [B:30:0x0057, B:45:0x006f, B:35:0x005f, B:46:0x0071, B:40:0x0067] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static String a(String str) {
        FileInputStream fileInputStream;
        int i10;
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                fileInputStream = new FileInputStream(str);
                try {
                    long length = new File(str).length();
                    if (length > 10002432) {
                        length = 10002432;
                    }
                    byte[] bArr = new byte[4096];
                    while (length > 0 && (i10 = fileInputStream.read(bArr)) != -1) {
                        if (i10 > length) {
                            i10 = (int) length;
                        }
                        length -= (long) i10;
                        messageDigest.update(bArr, 0, i10);
                    }
                    fileInputStream.close();
                    String strA = com.tencent.qmsp.sdk.f.e.a(messageDigest.digest());
                    try {
                        fileInputStream.close();
                    } catch (Exception unused) {
                    }
                    return strA;
                } catch (FileNotFoundException e10) {
                    e = e10;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception unused2) {
                            return null;
                        }
                    }
                    return null;
                } catch (IOException e11) {
                    e = e11;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return null;
                } catch (NoSuchAlgorithmException e12) {
                    e = e12;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    th.printStackTrace();
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return null;
                }
            } catch (Throwable th3) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th3;
            }
        } catch (FileNotFoundException e13) {
            e = e13;
            fileInputStream = null;
        } catch (IOException e14) {
            e = e14;
            fileInputStream = null;
        } catch (NoSuchAlgorithmException e15) {
            e = e15;
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
    }
}
