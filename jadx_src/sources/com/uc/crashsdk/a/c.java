package com.uc.crashsdk.a;

import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f104159a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f104160b = "";

    public static void a(byte[] bArr, int i10, byte[] bArr2) {
        if (!f104159a && bArr2.length != 4) {
            throw new AssertionError();
        }
        for (int i11 = 0; i11 < 4; i11++) {
            bArr[i11 + i10] = bArr2[i11];
        }
    }

    public static boolean a(File file, String str, String str2) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (b(file, str, str2)) {
                return true;
            }
            a.a("crashsdk", "upload try again: " + str);
        }
        return false;
    }

    private static boolean a(byte[] bArr, String str, String str2) {
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        ByteArrayOutputStream byteArrayOutputStream;
        a.a("Uploading to " + str2);
        OutputStream outputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
            try {
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setReadTimeout(60000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setUseCaches(false);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("------------izQ290kHh6g3Yn2IeyJCoc\r\n");
                sb2.append("Content-Disposition: form-data; name=\"file\";");
                sb2.append(" filename=\"");
                sb2.append(str);
                sb2.append("\"\r\n");
                sb2.append("Content-Type: application/octet-stream\r\n");
                sb2.append("\r\n");
                int length = sb2.length() + 40 + bArr.length;
                httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=----------izQ290kHh6g3Yn2IeyJCoc");
                httpURLConnection.setRequestProperty("Content-Disposition", "form-data; name=\"file\"; filename=" + str);
                httpURLConnection.setRequestProperty("Content-Length", String.valueOf(length));
                OutputStream outputStream2 = httpURLConnection.getOutputStream();
                try {
                    outputStream2.write(sb2.toString().getBytes());
                    outputStream2.write(bArr);
                    outputStream2.write("\r\n------------izQ290kHh6g3Yn2IeyJCoc--\r\n".getBytes());
                    int responseCode = httpURLConnection.getResponseCode();
                    a.a("crashsdk", "Response code: " + responseCode);
                    if (responseCode != 200) {
                        g.a(outputStream2);
                        g.a((Closeable) null);
                        g.a((Closeable) null);
                        try {
                            httpURLConnection.disconnect();
                        } catch (Throwable unused) {
                        }
                        return false;
                    }
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        byte[] bArr2 = new byte[1024];
                        byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
                        while (true) {
                            try {
                                int i10 = inputStream.read(bArr2);
                                if (i10 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr2, 0, i10);
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        if (byteArray == null) {
                            g.a(outputStream2);
                            g.a(inputStream);
                            g.a(byteArrayOutputStream);
                            try {
                                httpURLConnection.disconnect();
                            } catch (Throwable unused2) {
                            }
                            return false;
                        }
                        a.a("crashsdk", "Log upload response: " + new String(byteArray));
                        g.a(outputStream2);
                        g.a(inputStream);
                        g.a(byteArrayOutputStream);
                        try {
                            httpURLConnection.disconnect();
                        } catch (Throwable unused3) {
                        }
                        return true;
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayOutputStream = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = null;
                    byteArrayOutputStream = null;
                }
                outputStream = outputStream2;
            } catch (Throwable th5) {
                th = th5;
                inputStream = null;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th6) {
            th = th6;
            inputStream = null;
            httpURLConnection = null;
            byteArrayOutputStream = null;
        }
        try {
            g.b(th);
            return false;
        } finally {
            g.a(outputStream);
            g.a(inputStream);
            g.a(byteArrayOutputStream);
            if (httpURLConnection != null) {
                try {
                    httpURLConnection.disconnect();
                } catch (Throwable unused4) {
                }
            }
        }
    }

    public static byte[] a() {
        return new byte[]{org.apache.tools.tar.c.F, com.google.common.base.a.C, 6, org.apache.tools.tar.c.M};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v6 */
    private static byte[] a(File file) throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArr;
        ?? r10 = 0;
        byte[] bArr2 = null;
        bufferedInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        r10 = 0;
        try {
            if (!file.isFile()) {
                return null;
            }
            try {
                int length = (int) file.length();
                fileInputStream = new FileInputStream(file);
                try {
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(fileInputStream);
                    try {
                        bArr2 = new byte[length];
                        int i10 = 0;
                        while (i10 < length) {
                            int i11 = bufferedInputStream2.read(bArr2, i10, length - i10);
                            if (-1 == i11) {
                                break;
                            }
                            i10 += i11;
                        }
                        g.a(bufferedInputStream2);
                        g.a(fileInputStream);
                        r10 = bArr2;
                    } catch (Exception e10) {
                        e = e10;
                        byte[] bArr3 = bArr2;
                        bufferedInputStream = bufferedInputStream2;
                        bArr = bArr3;
                        g.b(e);
                        g.a(bufferedInputStream);
                        g.a(fileInputStream);
                        r10 = bArr;
                    } catch (Throwable th2) {
                        th = th2;
                        r10 = bufferedInputStream2;
                    }
                } catch (Exception e11) {
                    e = e11;
                    bArr = null;
                }
            } catch (Exception e12) {
                e = e12;
                bArr = null;
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
            return r10;
        } catch (Throwable th4) {
            th = th4;
        }
        g.a((Closeable) r10);
        g.a(fileInputStream);
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.ByteArrayOutputStream, java.io.Closeable] */
    public static byte[] a(String str, byte[] bArr) {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        ?? outputStream;
        ?? byteArrayOutputStream;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bArr.length));
                outputStream = httpURLConnection.getOutputStream();
                try {
                    outputStream.write(bArr);
                    if (httpURLConnection.getResponseCode() != 200) {
                        g.a((Closeable) outputStream);
                        g.a((Closeable) null);
                        g.a((Closeable) null);
                        try {
                            httpURLConnection.disconnect();
                        } catch (Throwable unused) {
                        }
                        return null;
                    }
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        byte[] bArr2 = new byte[1024];
                        byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
                        while (true) {
                            try {
                                int i10 = inputStream.read(bArr2);
                                if (i10 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr2, 0, i10);
                            } catch (Throwable unused2) {
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        g.a((Closeable) outputStream);
                        g.a(inputStream);
                        g.a((Closeable) byteArrayOutputStream);
                        try {
                            httpURLConnection.disconnect();
                        } catch (Throwable unused3) {
                        }
                        return byteArray;
                    } catch (Throwable unused4) {
                        byteArrayOutputStream = 0;
                    }
                } catch (Throwable unused5) {
                    inputStream = null;
                    byteArrayOutputStream = 0;
                }
            } catch (Throwable unused6) {
                inputStream = null;
                outputStream = inputStream;
                byteArrayOutputStream = outputStream;
            }
        } catch (Throwable unused7) {
            httpURLConnection = null;
            inputStream = null;
        }
        g.a((Closeable) outputStream);
        g.a(inputStream);
        g.a((Closeable) byteArrayOutputStream);
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Throwable unused8) {
            }
        }
        return null;
    }

    private static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 16];
        int length = bArr.length;
        bArr2[0] = (byte) ((length >> 0) & 255);
        bArr2[1] = (byte) ((length >> 8) & 255);
        bArr2[2] = (byte) ((length >> 16) & 255);
        bArr2[3] = (byte) ((length >> 24) & 255);
        for (int i10 = 4; i10 < 16; i10++) {
            bArr2[i10] = 0;
        }
        System.arraycopy(bArr, 0, bArr2, 16, bArr.length);
        return bArr2;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        return a(bArr, bArr2, true, false);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, boolean z10) {
        return a(bArr, bArr2, z10, true);
    }

    private static byte[] a(byte[] bArr, byte[] bArr2, boolean z10, boolean z11) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        Cipher cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
        cipher.init(z10 ? 1 : 2, secretKeySpec, ivParameterSpec);
        if (!z10) {
            return cipher.doFinal(bArr);
        }
        if (!z11) {
            bArr = a(bArr);
        }
        return cipher.doFinal(bArr);
    }

    private static boolean b(File file, String str, String str2) throws Throwable {
        try {
            byte[] bArrA = a(file);
            if (bArrA != null && bArrA.length != 0) {
                return a(bArrA, str, str2);
            }
            return false;
        } catch (Exception e10) {
            g.a(e10);
            return false;
        }
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        return a(bArr, bArr2, true, true);
    }
}
