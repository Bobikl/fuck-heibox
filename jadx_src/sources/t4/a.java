package t4;

import android.util.Log;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f140667a = "OpenId";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f140668b = false;

    public static String a(Object obj, Object obj2) {
        Object[] objArr = new Object[2];
        if (obj == null) {
            obj = "";
        }
        objArr[0] = obj;
        if (obj2 == null) {
            obj2 = "";
        }
        objArr[1] = obj2;
        return String.format("%s:%s", objArr);
    }

    public static String b(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr2 = new Object[1];
        if (str == null) {
            str = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
        int i10 = 0;
        objArr2[0] = str;
        sb2.append(String.format("[%s] ", objArr2));
        if (objArr != null) {
            int length = objArr.length;
            while (true) {
                int i11 = i10 + 1;
                if (i11 >= objArr.length) {
                    break;
                }
                sb2.append(a(objArr[i10], objArr[i11]));
                if (i11 < length - 1) {
                    sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                i10 = i11 + 1;
            }
            if (i10 == objArr.length - 1) {
                sb2.append(objArr[i10]);
            }
        }
        return sb2.toString();
    }

    public static void c(boolean z10) {
        Log.d(f140667a, "setDebug:" + z10);
        f140668b = z10;
    }

    public static void d(String str, Object... objArr) {
        if (f140668b) {
            Log.d(f140667a, b(str, objArr));
        }
    }

    public static void e(String str, Object... objArr) {
        if (f140668b) {
            Log.e(f140667a, b(str, objArr));
        }
    }

    public static void f(String str, Object... objArr) {
        if (f140668b) {
            Log.i(f140667a, b(str, objArr));
        }
    }

    public static void g(String str, Object... objArr) {
        if (f140668b) {
            Log.w(f140667a, b(str, objArr));
        }
    }
}
