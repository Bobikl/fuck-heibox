package cn.fly.verify;

import com.xiaomi.mipush.sdk.Constants;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f35667a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a() {
        return UUID.randomUUID().toString().replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = f35667a;
            cArr[i10] = cArr2[(b10 >>> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static String b() {
        return UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
    }
}
