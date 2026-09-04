package k5;

import android.content.Context;
import android.text.TextUtils;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public class d {
    public static String a() {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int iNanoTime = (int) System.nanoTime();
        int iNextInt = new Random().nextInt();
        int iNextInt2 = new Random().nextInt();
        byte[] bArrA = c.a(iCurrentTimeMillis);
        byte[] bArrA2 = c.a(iNanoTime);
        byte[] bArrA3 = c.a(iNextInt);
        byte[] bArrA4 = c.a(iNextInt2);
        byte[] bArr = new byte[16];
        System.arraycopy(bArrA, 0, bArr, 0, 4);
        System.arraycopy(bArrA2, 0, bArr, 4, 4);
        System.arraycopy(bArrA3, 0, bArr, 8, 4);
        System.arraycopy(bArrA4, 0, bArr, 12, 4);
        return b.e(bArr, 2);
    }

    public static String b(Context context) {
        String strC = f.b(null) ? c() : null;
        return f.b(strC) ? a() : strC;
    }

    public static String c() {
        String strA = g.a("ro.aliyun.clouduuid", "");
        if (TextUtils.isEmpty(strA)) {
            strA = g.a("ro.sys.aliyun.clouduuid", "");
        }
        return TextUtils.isEmpty(strA) ? e() : strA;
    }

    public static String d(Context context) {
        return "";
    }

    public static String e() {
        try {
            return (String) Class.forName("com.yunos.baseservice.clouduuid.CloudUUID").getMethod("getCloudUUID", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return "";
        }
    }
}
