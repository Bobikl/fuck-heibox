package z5;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f141854b = "00:00:00:00:00:00";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c f141855c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f141856a;

    public c(Context context) {
        try {
            try {
                String macAddress = b6.b.e(null, context).getMacAddress();
                this.f141856a = macAddress;
                if (!TextUtils.isEmpty(macAddress)) {
                    return;
                }
            } catch (Exception e10) {
                e.d(e10);
                if (!TextUtils.isEmpty(this.f141856a)) {
                    return;
                }
            }
            this.f141856a = f141854b;
        } catch (Throwable th2) {
            if (TextUtils.isEmpty(this.f141856a)) {
                this.f141856a = f141854b;
            }
            throw th2;
        }
    }

    public static String b(Context context) {
        return d(context).a().substring(0, 8);
    }

    public static c d(Context context) {
        if (f141855c == null) {
            f141855c = new c(context);
        }
        return f141855c;
    }

    public static String f(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getResources().getConfiguration().locale.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static com.alipay.sdk.m.u.g g(Context context) {
        try {
            NetworkInfo networkInfoA = b6.b.a(null, context);
            if (networkInfoA == null || networkInfoA.getType() != 0) {
                return (networkInfoA == null || networkInfoA.getType() != 1) ? com.alipay.sdk.m.u.g.NONE : com.alipay.sdk.m.u.g.WIFI;
            }
            return com.alipay.sdk.m.u.g.a(networkInfoA.getSubtype());
        } catch (Exception unused) {
            return com.alipay.sdk.m.u.g.NONE;
        }
    }

    public String a() {
        String str = c() + "|";
        String strE = e();
        if (TextUtils.isEmpty(strE)) {
            return str + "000000000000000";
        }
        return str + strE;
    }

    public String c() {
        return "000000000000000";
    }

    public String e() {
        return "000000000000000";
    }

    public String h() {
        return this.f141856a;
    }
}
