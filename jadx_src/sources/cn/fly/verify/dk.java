package cn.fly.verify;

import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class dk implements dm<dk> {
    public static void a(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    private byte[] a(byte[] bArr, int i10) throws Throwable {
        if (bArr.length > i10 - 1) {
            throw new Throwable("Message too large");
        }
        byte[] bArr2 = new byte[i10];
        bArr2[0] = 1;
        int length = bArr.length;
        bArr2[1] = (byte) (length >> 24);
        bArr2[2] = (byte) (length >> 16);
        bArr2[3] = (byte) (length >> 8);
        bArr2[4] = (byte) length;
        System.arraycopy(bArr, 0, bArr2, i10 - length, length);
        return bArr2;
    }

    private byte[] a(byte[] bArr, int i10, int i11, BigInteger bigInteger, BigInteger bigInteger2, int i12) throws Throwable {
        if (bArr.length != i11 || i10 != 0) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            bArr = bArr2;
        }
        BigInteger bigInteger3 = new BigInteger(a(bArr, i12));
        if (bigInteger3.compareTo(bigInteger2) <= 0) {
            return bigInteger3.modPow(bigInteger, bigInteger2).toByteArray();
        }
        throw new Throwable("the message must be smaller than the modulue");
    }

    public String a(InputStream inputStream) {
        byte[] bArrDigest = null;
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[1024];
            MessageDigest messageDigest = MessageDigest.getInstance(ei.a("003=hcflhi"));
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i10);
            }
            bArrDigest = messageDigest.digest();
        } catch (Throwable unused) {
        }
        return b(bArrDigest);
    }

    public String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 0, bArr.length);
            String strA = a(byteArrayInputStream);
            byteArrayInputStream.close();
            return strA;
        } catch (Throwable unused) {
            return null;
        }
    }

    public ArrayList<HashMap<String, String>> a(ArrayList<HashMap<String, String>> arrayList, ArrayList<HashMap<String, String>> arrayList2, String str) {
        ArrayList<HashMap<String, String>> arrayList3 = new ArrayList<>();
        for (HashMap<String, String> map : arrayList) {
            String str2 = map.get(str);
            if (!TextUtils.isEmpty(str2)) {
                boolean z10 = false;
                Iterator<HashMap<String, String>> it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (str2.equals(it.next().get(str))) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    arrayList3.add(map);
                }
            }
        }
        return arrayList3;
    }

    @Override // cn.fly.verify.dm
    public boolean a(dk dkVar, Class<dk> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        if ("bm5".equals(str) && objArr.length == 1) {
            objArr2[0] = dkVar.a((byte[]) objArr[0]);
            return true;
        }
        if ("sm5".equals(str)) {
            objArr2[0] = dkVar.a((InputStream) objArr[0]);
            return true;
        }
        if ("thx".equals(str)) {
            objArr2[0] = dkVar.b((byte[]) objArr[0]);
            return true;
        }
        if ("fnil".equals(str) && objArr.length == 3) {
            objArr2[0] = dkVar.a((ArrayList) objArr[0], (ArrayList) objArr[1], (String) objArr[2]);
            return true;
        }
        if ("aesen".equals(str) && objArr.length == 4) {
            try {
                objArr2[0] = a((String) objArr[0], (String) objArr[1], (byte[]) objArr[2], (byte[]) objArr[3]);
            } catch (Throwable th2) {
                objArr2[0] = null;
                thArr[0] = th2;
            }
            return true;
        }
        if (ei.a("005df)fidcAf").equals(str) && objArr.length == 4) {
            try {
                objArr2[0] = b((String) objArr[0], (String) objArr[1], (byte[]) objArr[2], (byte[]) objArr[3]);
            } catch (Throwable th3) {
                objArr2[0] = null;
                thArr[0] = th3;
            }
            return true;
        }
        if (ei.a("006df8fidcfgPj").equals(str) && objArr.length == 4) {
            try {
                objArr2[0] = c((String) objArr[0], (String) objArr[1], (byte[]) objArr[2], (byte[]) objArr[3]);
            } catch (Throwable th4) {
                objArr2[0] = null;
                thArr[0] = th4;
            }
            return true;
        }
        if ("enc".equals(str) && objArr.length == 4) {
            try {
                objArr2[0] = a(((Integer) objArr[0]).intValue(), (byte[]) objArr[1], (BigInteger) objArr[2], (BigInteger) objArr[3]);
            } catch (Throwable th5) {
                objArr2[0] = null;
                thArr[0] = th5;
            }
            return true;
        }
        if (!"d".equals(str)) {
            return false;
        }
        if (objArr.length == 1 && (objArr[0] instanceof String)) {
            es.a().a("%s", "[sasa] " + objArr[0]);
        } else if (objArr.length == 1 && (objArr[0] instanceof Throwable)) {
            es.a().a((Throwable) objArr[0], "%s", "[sasa]");
        }
        return true;
    }

    public byte[] a(int i10, byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) throws Throwable {
        int i11 = i10 / 8;
        int i12 = i11 - 11;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);
            int i13 = 0;
            while (bArr.length > i13) {
                try {
                    int iMin = Math.min(bArr.length - i13, i12);
                    byte[] bArrA = a(bArr, i13, iMin, bigInteger, bigInteger2, i11);
                    dataOutputStream2.writeInt(bArrA.length);
                    dataOutputStream2.write(bArrA);
                    i13 += iMin;
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    a(dataOutputStream);
                    throw th;
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            a(dataOutputStream2);
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public byte[] a(String str, String str2, byte[] bArr, byte[] bArr2) throws Throwable {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr, 0, bArr3, 0, Math.min(bArr.length, 16));
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, ei.a("003:fdgiel"));
        Cipher cipherB = ga.b(str, str2);
        cipherB.init(1, secretKeySpec);
        byte[] bArr4 = new byte[cipherB.getOutputSize(bArr2.length)];
        cipherB.doFinal(bArr4, cipherB.update(bArr2, 0, bArr2.length, bArr4, 0));
        return bArr4;
    }

    public String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b10 : bArr) {
            stringBuffer.append(String.format("%02x", Byte.valueOf(b10)));
        }
        return stringBuffer.toString();
    }

    public byte[] b(String str, String str2, byte[] bArr, byte[] bArr2) throws Throwable {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr, 0, bArr3, 0, Math.min(bArr.length, 16));
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, ei.a("003+fdgiel"));
        Cipher cipherB = ga.b(str, str2);
        cipherB.init(2, secretKeySpec);
        byte[] bArr4 = new byte[cipherB.getOutputSize(bArr2.length)];
        cipherB.doFinal(bArr4, cipherB.update(bArr2, 0, bArr2.length, bArr4, 0));
        return bArr4;
    }

    public byte[] c(String str, String str2, byte[] bArr, byte[] bArr2) throws Throwable {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr, 0, bArr3, 0, Math.min(bArr.length, 16));
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, ei.a("0033fdgiel"));
        Cipher cipherB = ga.b(str, str2);
        cipherB.init(2, secretKeySpec);
        return cipherB.doFinal(bArr2);
    }
}
