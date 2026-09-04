package cn.fly.verify;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.math.BigInteger;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public class an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Random f35759a = new Random();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static gg f35760b = new gg(1024);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static BigInteger f35761c = new BigInteger("d008219b14c84872559aaf9e69d1348175289c186912da64b2393bab376bb0d6b471220cb29cbc9875b148b593eb9d7c4c359549a1aff22f6de9d18d22f0b6cb", 16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static BigInteger f35762d = new BigInteger("1f228b2b8fbb7317674db20bab1d4b0f0ddb3e1f3a93177f1821c026ffd7c6b782be720a308ab69bf6c631c3c0c4d68bf9d92ddaaf712a032d591ba1c296df13332a23e37b281e5fd9b93ab016dd3efc5de45e264ed692ac63ac40013f507cd272b7aeeb85be9fe2f31f11b8c55d904b5331932c70c7cf3f2b05cb802f6b89a7", 16);

    public static String a(String str) throws Throwable {
        return c(a(), str);
    }

    public static byte[] a() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        f35759a.setSeed(System.currentTimeMillis());
        dataOutputStream.writeLong(f35759a.nextLong());
        dataOutputStream.writeLong(f35759a.nextLong());
        dataOutputStream.flush();
        dataOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static String[] a(byte[] bArr, String str) throws Throwable {
        return new String[]{as.a(bArr), c(bArr, str)};
    }

    public static String b(byte[] bArr, String str) {
        String str2 = "";
        try {
            new DataOutputStream(new ByteArrayOutputStream());
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(Base64.decode(str, 2)));
            while (dataInputStream.available() > 0) {
                int i10 = dataInputStream.readInt();
                dataInputStream.readFully(new byte[i10], 0, i10);
                int i11 = dataInputStream.readInt();
                byte[] bArr2 = new byte[i11];
                dataInputStream.readFully(bArr2, 0, i11);
                str2 = new String(ga.b(bArr, bArr2));
            }
        } catch (Throwable unused) {
        }
        return str2;
    }

    private static String c(byte[] bArr, String str) throws Throwable {
        byte[] bytes = str.getBytes("utf-8");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        byte[] bArrA = f35760b.a(bArr, f35761c, f35762d);
        dataOutputStream.writeInt(bArrA.length);
        dataOutputStream.write(bArrA);
        byte[] bArrA2 = ga.a(bArr, bytes);
        dataOutputStream.writeInt(bArrA2.length);
        dataOutputStream.write(bArrA2);
        dataOutputStream.flush();
        dataOutputStream.close();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }
}
