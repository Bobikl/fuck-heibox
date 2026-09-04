package com.huawei.hms.utils;

import com.huawei.hms.support.log.HMSLog;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class SHA256 {
    public static byte[] digest(File file) throws Throwable {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    byte[] bArr = new byte[4096];
                    int i10 = 0;
                    while (true) {
                        int i11 = bufferedInputStream.read(bArr);
                        if (i11 == -1) {
                            break;
                        }
                        i10 += i11;
                        messageDigest.update(bArr, 0, i11);
                    }
                    if (i10 > 0) {
                        byte[] bArrDigest = messageDigest.digest();
                        IOUtils.closeQuietly((InputStream) bufferedInputStream);
                        return bArrDigest;
                    }
                    IOUtils.closeQuietly((InputStream) bufferedInputStream);
                } catch (IOException | NoSuchAlgorithmException unused) {
                    bufferedInputStream2 = bufferedInputStream;
                    HMSLog.e("SHA256", "An exception occurred while computing file 'SHA-256'.");
                    IOUtils.closeQuietly((InputStream) bufferedInputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    IOUtils.closeQuietly((InputStream) bufferedInputStream);
                    throw th;
                }
            } catch (IOException | NoSuchAlgorithmException unused2) {
            }
            return new byte[0];
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = bufferedInputStream2;
        }
    }

    public static byte[] digest(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException e10) {
            HMSLog.e("SHA256", "NoSuchAlgorithmException" + e10.getMessage());
            return new byte[0];
        }
    }
}
