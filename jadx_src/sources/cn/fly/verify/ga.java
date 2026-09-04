package cn.fly.verify;

import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.zip.CRC32;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class ga {
    public static String a(File file) {
        FileInputStream fileInputStream;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArrA = a(fileInputStream);
                el.a(fileInputStream);
                if (bArrA == null) {
                    return null;
                }
                return c(bArrA);
            } catch (Throwable th2) {
                th = th2;
                try {
                    es.a().b(th);
                    el.a(fileInputStream);
                    return null;
                } catch (Throwable th3) {
                    el.a(fileInputStream);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
    }

    public static String a(String str, byte[] bArr) throws Throwable {
        if (str == null || bArr == null) {
            return null;
        }
        return new String(b(str.getBytes("UTF-8"), bArr), "UTF-8").trim();
    }

    public static String a(byte[] bArr, int i10, int i11) {
        StringBuffer stringBuffer = new StringBuffer();
        if (bArr == null) {
            return stringBuffer.toString();
        }
        while (i10 < i11) {
            stringBuffer.append(String.format("%02x", Byte.valueOf(bArr[i10])));
            i10++;
        }
        return stringBuffer.toString();
    }

    public static void a(String str, InputStream inputStream, OutputStream outputStream) throws Throwable {
        if (str == null) {
            return;
        }
        a(str.getBytes("UTF-8"), inputStream, outputStream);
    }

    public static void a(byte[] bArr, InputStream inputStream, OutputStream outputStream) throws Throwable {
        CipherInputStream cipherInputStream;
        Throwable th2;
        if (bArr == null || inputStream == null || outputStream == null) {
            return;
        }
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, 16));
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, ba.a("0032hfikgn"));
        Cipher cipherB = b(ba.a("0037hfikgn") + ba.a("003n3ikgf") + ba.a("008]hlOn_inkegfgnkmin") + ba.a("006f3fefefk[gGgl"), ba.a("002Whlgf"));
        cipherB.init(2, secretKeySpec);
        try {
            cipherInputStream = new CipherInputStream(inputStream, cipherB);
            try {
                byte[] bArr3 = new byte[1024];
                while (true) {
                    int i10 = cipherInputStream.read(bArr3);
                    if (i10 == -1) {
                        outputStream.flush();
                        el.a(cipherInputStream);
                        return;
                    }
                    outputStream.write(bArr3, 0, i10);
                }
            } catch (Throwable th3) {
                th2 = th3;
                el.a(cipherInputStream);
                throw th2;
            }
        } catch (Throwable th4) {
            cipherInputStream = null;
            th2 = th4;
        }
    }

    public static byte[] a(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[1024];
            MessageDigest messageDigest = MessageDigest.getInstance(ba.a("003Hjehnjk"));
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    return messageDigest.digest();
                }
                messageDigest.update(bArr, 0, i10);
            }
        } catch (Throwable th2) {
            es.a().b(th2);
            return null;
        }
    }

    public static byte[] a(String str) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(str.getBytes("utf-8"));
    }

    public static byte[] a(String str, String str2) throws Throwable {
        if (str == null || str2 == null) {
            return null;
        }
        byte[] bytes = str.getBytes("UTF-8");
        byte[] bArr = new byte[16];
        System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 16));
        return a(bArr, str2);
    }

    public static byte[] a(byte[] bArr) throws Throwable {
        MessageDigest messageDigest = MessageDigest.getInstance(ba.a("005Rgnhmhfjmjh"));
        messageDigest.update(bArr);
        return messageDigest.digest();
    }

    public static byte[] a(byte[] bArr, String str) throws Throwable {
        if (bArr == null || str == null) {
            return null;
        }
        return a(bArr, str.getBytes("UTF-8"));
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) throws Throwable {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, ba.a("0030hfikgn"));
        Cipher cipherB = b(ba.a("003 hfikgn") + ba.a("003n(ikgf") + ba.a("008+hl;n!inkegfgnkmin") + ba.a("006f[fefefk.gYgl"), ba.a("0028hlgf"));
        cipherB.init(1, secretKeySpec);
        byte[] bArr3 = new byte[cipherB.getOutputSize(bArr2.length)];
        cipherB.doFinal(bArr3, cipherB.update(bArr2, 0, bArr2.length, bArr3, 0));
        return bArr3;
    }

    public static String b(String str) {
        byte[] bArrC;
        if (str == null || (bArrC = c(str)) == null) {
            return null;
        }
        return c(bArrC);
    }

    public static String b(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static String b(byte[] bArr, int i10, int i11) {
        byte[] bArrC;
        if (bArr == null || (bArrC = c(bArr, i10, i11)) == null) {
            return null;
        }
        return c(bArrC);
    }

    public static Cipher b(String str, String str2) throws Throwable {
        Cipher cipher = null;
        if (!TextUtils.isEmpty(str2)) {
            try {
                Provider provider = Security.getProvider(str2);
                if (provider != null) {
                    cipher = Cipher.getInstance(str, provider);
                }
            } catch (Throwable unused) {
            }
        }
        return cipher == null ? Cipher.getInstance(str, str2) : cipher;
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) throws Throwable {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr, 0, bArr3, 0, Math.min(bArr.length, 16));
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, ba.a("0035hfikgn"));
        Cipher cipherB = b(ba.a("003Qhfikgn") + ba.a("003nUikgf") + ba.a("005PhlNnGgifmin") + ba.a("006fGfefefkRgOgl"), ba.a("002Whlgf"));
        cipherB.init(2, secretKeySpec);
        byte[] bArr4 = new byte[cipherB.getOutputSize(bArr2.length)];
        cipherB.doFinal(bArr4, cipherB.update(bArr2, 0, bArr2.length, bArr4, 0));
        return bArr4;
    }

    public static String c(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            cArr2[i10] = cArr[(b10 >>> 4) & 15];
            int i11 = i10 + 1;
            cArr2[i11] = cArr[b10 & 15];
            i10 = i11 + 1;
        }
        return new String(cArr2);
    }

    public static String c(byte[] bArr, byte[] bArr2) throws Throwable {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr, 0, bArr3, 0, Math.min(bArr.length, 16));
        return new String(d(bArr3, bArr2), "UTF-8").trim();
    }

    public static byte[] c(String str) {
        if (str == null) {
            return null;
        }
        try {
            return e(str.getBytes("utf-8"));
        } catch (Throwable th2) {
            es.a().b(th2);
            return null;
        }
    }

    public static byte[] c(String str, String str2) throws Throwable {
        if (str == null || str2 == null) {
            return null;
        }
        byte[] bytes = str.getBytes("UTF-8");
        byte[] bArr = new byte[16];
        System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 16));
        int length = 16 - (str2.length() % 16);
        StringBuilder sb2 = new StringBuilder(str2);
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(" ");
        }
        byte[] bytes2 = sb2.toString().getBytes("UTF-8");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, ba.a("003Mhfikgn"));
        Cipher cipherB = b(ba.a("003Hhfikgn") + ba.a("003nUikgf") + ba.a("005OhlIn[gifmin") + ba.a("006fUfefefk9g7gl"), ba.a("002Chlgf"));
        cipherB.init(1, secretKeySpec);
        return cipherB.doFinal(bytes2);
    }

    public static byte[] c(byte[] bArr, int i10, int i11) {
        ByteArrayInputStream byteArrayInputStream;
        byte[] bArrA = null;
        if (bArr == null) {
            return null;
        }
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr, i10, i11);
            try {
                bArrA = a(byteArrayInputStream);
                el.a(byteArrayInputStream);
            } catch (Throwable th2) {
                th = th2;
                try {
                    es.a().b(th);
                    el.a(byteArrayInputStream);
                } catch (Throwable th3) {
                    el.a(byteArrayInputStream);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayInputStream = null;
        }
        return bArrA;
    }

    public static String d(String str, String str2) throws Throwable {
        String strEncode = TextUtils.isEmpty(str) ? "" : URLEncoder.encode(str, str2);
        return TextUtils.isEmpty(strEncode) ? strEncode : strEncode.replace("+", "%20");
    }

    public static String d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return b(bArr, 0, bArr.length);
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) throws Throwable {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, ba.a("003*hfikgn"));
        Cipher cipherB = b(ba.a("003Ehfikgn") + ba.a("003n@ikgf") + ba.a("008'hl=n3inkegfgnkmin") + ba.a("006f8fefefkSgRgl"), ba.a("002Nhlgf"));
        cipherB.init(2, secretKeySpec);
        return cipherB.doFinal(bArr2);
    }

    public static String e(String str, String str2) {
        try {
            String strEncodeToString = Base64.encodeToString(a(str2, str), 0);
            return strEncodeToString.contains("\n") ? strEncodeToString.replace("\n", "") : strEncodeToString;
        } catch (Throwable th2) {
            es.a().b(th2);
            return null;
        }
    }

    public static byte[] e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return c(bArr, 0, bArr.length);
    }

    public static String f(byte[] bArr) throws Throwable {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        long value = crc32.getValue();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 56)) & 255)));
        sb2.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 48)) & 255)));
        sb2.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 40)) & 255)));
        sb2.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 32)) & 255)));
        sb2.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 24)) & 255)));
        sb2.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 16)) & 255)));
        sb2.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 8)) & 255)));
        sb2.append(String.format("%02x", Integer.valueOf(((byte) value) & 255)));
        while (sb2.charAt(0) == '0') {
            sb2 = sb2.deleteCharAt(0);
        }
        return sb2.toString().toLowerCase();
    }
}
