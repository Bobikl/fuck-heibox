package l5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.Random;
import org.apache.tools.tar.c;
import z5.l;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f130892d = "virtualImeiAndImsi";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f130893e = "virtual_imei";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f130894f = "virtual_imsi";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile b f130895g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f130896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f130897b = "sdk-and-lite";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f130898c;

    public b() {
        String strA = f5.a.a();
        if (f5.a.c()) {
            return;
        }
        this.f130897b += '_' + strA;
    }

    public static String b(Context context) {
        return Float.toString(new TextView(context).getTextSize());
    }

    public static String c(x5.a aVar, Context context, boolean z10) {
        if (z10) {
            return c.V;
        }
        try {
            WifiInfo wifiInfoE = b6.b.e(aVar, context);
            return wifiInfoE != null ? wifiInfoE.getBSSID() : c.V;
        } catch (Throwable th2) {
            h5.a.e(aVar, h5.b.f119113l, "lacking_per_2", th2);
            return c.V;
        }
    }

    public static synchronized void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        PreferenceManager.getDefaultSharedPreferences(x5.b.e().c()).edit().putString(j5.b.f124284i, str).apply();
        j5.a.f124254e = str;
    }

    public static String f(Context context) {
        if (context == null) {
            return "";
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            String packageName = context.getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            sb2.append("(");
            sb2.append(packageName);
            sb2.append(";");
            sb2.append(packageInfo.versionCode);
            sb2.append(")");
            return sb2.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String g(x5.a aVar, Context context, boolean z10) {
        if (z10) {
            return "-1";
        }
        try {
            WifiInfo wifiInfoE = b6.b.e(aVar, context);
            return wifiInfoE != null ? wifiInfoE.getSSID() : "-1";
        } catch (Throwable th2) {
            h5.a.e(aVar, h5.b.f119113l, "lacking_per_1", th2);
            return "-1";
        }
    }

    public static synchronized b h() {
        if (f130895g == null) {
            f130895g = new b();
        }
        return f130895g;
    }

    public static String i() {
        return Long.toHexString(System.currentTimeMillis()) + (new Random().nextInt(9000) + 1000);
    }

    public static String j() {
        return "-1;-1";
    }

    public static String k() {
        return "1";
    }

    public static String l() {
        Context contextC = x5.b.e().c();
        SharedPreferences sharedPreferences = contextC.getSharedPreferences(f130892d, 0);
        String string = sharedPreferences.getString(f130893e, null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strI = TextUtils.isEmpty(y5.a.a(contextC).i()) ? i() : z5.c.d(contextC).c();
        sharedPreferences.edit().putString(f130893e, strI).apply();
        return strI;
    }

    public static String m() {
        String strE;
        Context contextC = x5.b.e().c();
        SharedPreferences sharedPreferences = contextC.getSharedPreferences(f130892d, 0);
        String string = sharedPreferences.getString(f130894f, null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        if (TextUtils.isEmpty(y5.a.a(contextC).i())) {
            String strD = x5.b.e().d();
            strE = (TextUtils.isEmpty(strD) || strD.length() < 18) ? i() : strD.substring(3, 18);
        } else {
            strE = z5.c.d(contextC).e();
        }
        String str = strE;
        sharedPreferences.edit().putString(f130894f, str).apply();
        return str;
    }

    public String a() {
        return this.f130898c;
    }

    public String d(x5.a aVar, y5.a aVar2, boolean z10) {
        Context contextC = x5.b.e().c();
        z5.c cVarD = z5.c.d(contextC);
        if (TextUtils.isEmpty(this.f130896a)) {
            this.f130896a = "Msp/15.8.11 (" + l.W() + ";" + l.T() + ";" + l.L(contextC) + ";" + l.U(contextC) + ";" + l.X(contextC) + ";" + b(contextC);
        }
        String strB = z5.c.g(contextC).b();
        String strE = l.E(contextC);
        String strK = k();
        String strE2 = cVarD.e();
        String strC = cVarD.c();
        String strM = m();
        String strL = l();
        if (aVar2 != null) {
            this.f130898c = aVar2.h();
        }
        String strReplace = Build.MANUFACTURER.replace(";", " ");
        String strReplace2 = Build.MODEL.replace(";", " ");
        boolean zF = x5.b.f();
        String strH = cVarD.h();
        String strG = g(aVar, contextC, z10);
        String strC2 = c(aVar, contextC, z10);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f130896a);
        sb2.append(";");
        sb2.append(strB);
        sb2.append(";");
        sb2.append(strE);
        sb2.append(";");
        sb2.append(strK);
        sb2.append(";");
        sb2.append(strE2);
        sb2.append(";");
        sb2.append(strC);
        sb2.append(";");
        sb2.append(this.f130898c);
        sb2.append(";");
        sb2.append(strReplace);
        sb2.append(";");
        sb2.append(strReplace2);
        sb2.append(";");
        sb2.append(zF);
        sb2.append(";");
        sb2.append(strH);
        sb2.append(";");
        sb2.append(j());
        sb2.append(";");
        sb2.append(this.f130897b);
        sb2.append(";");
        sb2.append(strM);
        sb2.append(";");
        sb2.append(strL);
        sb2.append(";");
        sb2.append(strG);
        sb2.append(";");
        sb2.append(strC2);
        if (aVar2 != null) {
            String strB2 = b6.b.b(aVar, contextC, y5.a.a(contextC).i(), b6.b.d(aVar, contextC));
            if (!TextUtils.isEmpty(strB2)) {
                sb2.append(";;;");
                sb2.append(strB2);
            }
        }
        sb2.append(")");
        return sb2.toString();
    }
}
