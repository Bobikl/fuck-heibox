package com.huawei.secure.android.common.encrypt.hash;

import android.text.TextUtils;
import androidx.emoji2.text.flatbuffer.i;
import com.huawei.secure.android.common.encrypt.utils.HexUtil;
import com.huawei.secure.android.common.encrypt.utils.a;
import com.huawei.secure.android.common.encrypt.utils.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class FileSHA256 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f62844a = 8192;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f62846c = "FileSHA256";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f62847d = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f62845b = "SHA-256";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f62848e = {f62845b, "SHA-384", "SHA-512"};

    private static boolean a(File file) {
        return file != null && file.exists() && file.length() > 0;
    }

    private static boolean a(String str) {
        for (String str2 : f62848e) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static String fileSHA256Encrypt(File file) {
        return fileSHAEncrypt(file, f62845b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String fileSHAEncrypt(File file, String str) throws Throwable {
        FileInputStream fileInputStream;
        if (TextUtils.isEmpty(str) || !a(str)) {
            b.b(f62846c, "algorithm is empty or not safe");
            return "";
        }
        if (!a(file)) {
            b.b(f62846c, "file is not valid");
            return "";
        }
        i.a aVar = 0;
        String strByteArray2HexStr = null;
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[8192];
                    boolean z10 = false;
                    while (true) {
                        int i10 = fileInputStream.read(bArr);
                        if (i10 <= 0) {
                            break;
                        }
                        messageDigest.update(bArr, 0, i10);
                        z10 = true;
                    }
                    strByteArray2HexStr = z10 ? HexUtil.byteArray2HexStr(messageDigest.digest()) : null;
                    a.a((InputStream) fileInputStream);
                } catch (IOException e10) {
                    e = e10;
                    b.b(f62846c, "IOException" + e.getMessage());
                    a.a((InputStream) fileInputStream);
                } catch (NoSuchAlgorithmException e11) {
                    e = e11;
                    b.b(f62846c, "NoSuchAlgorithmException" + e.getMessage());
                    a.a((InputStream) fileInputStream);
                }
            } catch (Throwable th2) {
                th = th2;
                aVar = "";
                a.a((InputStream) aVar);
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            fileInputStream = null;
        } catch (NoSuchAlgorithmException e13) {
            e = e13;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            a.a((InputStream) aVar);
            throw th;
        }
        return strByteArray2HexStr;
    }

    public static String inputStreamSHA256Encrypt(InputStream inputStream) {
        return inputStream == null ? "" : inputStreamSHAEncrypt(inputStream, f62845b);
    }

    public static String inputStreamSHAEncrypt(InputStream inputStream, String str) {
        if (inputStream == null) {
            return "";
        }
        byte[] bArr = new byte[8192];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 < 0) {
                    return HexUtil.byteArray2HexStr(messageDigest.digest());
                }
                if (i10 > 0) {
                    messageDigest.update(bArr, 0, i10);
                }
                a.a(inputStream);
            }
        } catch (IOException | NoSuchAlgorithmException unused) {
            b.b(f62846c, "inputstraem exception");
            return "";
        } finally {
            a.a(inputStream);
        }
    }

    public static boolean validateFileSHA(File file, String str, String str2) {
        if (!TextUtils.isEmpty(str) && a(str2)) {
            return str.equals(fileSHAEncrypt(file, str2));
        }
        b.b(f62846c, "hash value is null || algorithm is illegal");
        return false;
    }

    public static boolean validateFileSHA256(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equalsIgnoreCase(fileSHA256Encrypt(file));
    }

    public static boolean validateInputStreamSHA(InputStream inputStream, String str, String str2) {
        if (!TextUtils.isEmpty(str) && a(str2)) {
            return str.equals(inputStreamSHAEncrypt(inputStream, str2));
        }
        b.b(f62846c, "hash value is null || algorithm is illegal");
        return false;
    }

    public static boolean validateInputStreamSHA256(InputStream inputStream, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals(inputStreamSHA256Encrypt(inputStream));
    }
}
