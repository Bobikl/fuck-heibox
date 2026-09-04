package z5;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import anet.channel.util.HttpConstant;
import com.alipay.sdk.app.EnvUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.meituan.robust.Constants;
import com.tencent.qcloud.core.util.IOUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f141896a = "com.alipay.android.app";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f141897b = "com.eg.android.AlipayGphone";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f141898c = "com.eg.android.AlipayGphoneRC";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f141899d = 99;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f141901f = 125;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f141902g = 460;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f141900e = {"10.1.5.1013151", "10.1.5.1013148"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final char[] f141903h = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Constants.OBJECT_TYPE, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '+', IOUtils.DIR_SEPARATOR_UNIX};

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f141904b;

        public a(Activity activity) {
            this.f141904b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f141904b.finish();
        }
    }

    public static final class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f141905b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ConditionVariable f141906c;

        public b(Runnable runnable, ConditionVariable conditionVariable) {
            this.f141905b = runnable;
            this.f141906c = conditionVariable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f141905b.run();
            } finally {
                this.f141906c.open();
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PackageInfo f141907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f141908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f141909c;

        public c(PackageInfo packageInfo, int i10, String str) {
            this.f141907a = packageInfo;
            this.f141908b = i10;
            this.f141909c = str;
        }

        public boolean a() {
            return this.f141907a.versionCode < this.f141908b;
        }

        public boolean b(x5.a aVar) {
            Signature[] signatureArr = this.f141907a.signatures;
            if (signatureArr == null || signatureArr.length == 0) {
                return false;
            }
            for (Signature signature : signatureArr) {
                String strN = l.n(aVar, signature.toByteArray());
                if (strN != null && !TextUtils.equals(strN, this.f141909c)) {
                    h5.a.i(aVar, h5.b.f119113l, h5.b.D, String.format("Got %s, expected %s", strN, this.f141909c));
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean A(x5.a aVar, String str) {
        try {
            String host = new URL(str).getHost();
            return host.endsWith(j5.a.A) || host.endsWith(j5.a.B);
        } catch (Throwable th2) {
            h5.a.e(aVar, h5.b.f119113l, "ckUrlErr", th2);
            return false;
        }
    }

    public static boolean B(x5.a aVar, String str, Activity activity) {
        String strSubstring;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (activity == null) {
            return false;
        }
        if (str.toLowerCase().startsWith(j5.a.f124262m.toLowerCase()) || str.toLowerCase().startsWith(j5.a.f124263n.toLowerCase())) {
            try {
                c cVarT = t(aVar, activity, f5.a.f118751d);
                if (cVarT != null && !cVarT.a() && !cVarT.b(aVar)) {
                    if (str.startsWith("intent://platformapi/startapp")) {
                        str = str.replaceFirst("intent://platformapi/startapp\\?", j5.a.f124262m);
                    }
                    activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                }
            } catch (Throwable unused) {
            }
            return true;
        }
        if (TextUtils.equals(str, j5.a.f124265p) || TextUtils.equals(str, h("http", j5.a.f124267r))) {
            f5.b.c(f5.b.a());
            activity.finish();
            return true;
        }
        if (!str.startsWith(j5.a.f124264o)) {
            return false;
        }
        try {
            String strSubstring2 = str.substring(str.indexOf(j5.a.f124264o) + 24);
            int i10 = Integer.parseInt(strSubstring2.substring(strSubstring2.lastIndexOf(j5.a.f124268s) + 10));
            if (i10 == com.alipay.sdk.m.j.c.SUCCEEDED.b() || i10 == com.alipay.sdk.m.j.c.PAY_WAITTING.b()) {
                if (j5.a.f124272w) {
                    StringBuilder sb2 = new StringBuilder();
                    String strDecode = URLDecoder.decode(str);
                    String strDecode2 = URLDecoder.decode(strDecode);
                    String str2 = strDecode2.substring(strDecode2.indexOf(j5.a.f124264o) + 24, strDecode2.lastIndexOf(j5.a.f124268s)).split(j5.a.f124270u)[0];
                    int iIndexOf = strDecode.indexOf(j5.a.f124270u) + 12;
                    sb2.append(str2);
                    sb2.append(j5.a.f124270u);
                    sb2.append(strDecode.substring(iIndexOf, strDecode.indexOf("&", iIndexOf)));
                    sb2.append(strDecode.substring(strDecode.indexOf("&", iIndexOf)));
                    strSubstring = sb2.toString();
                } else {
                    String strDecode3 = URLDecoder.decode(str);
                    strSubstring = strDecode3.substring(strDecode3.indexOf(j5.a.f124264o) + 24, strDecode3.lastIndexOf(j5.a.f124268s));
                }
                com.alipay.sdk.m.j.c cVarB = com.alipay.sdk.m.j.c.b(i10);
                f5.b.c(f5.b.b(cVarB.b(), cVarB.a(), strSubstring));
            } else {
                com.alipay.sdk.m.j.c cVarB2 = com.alipay.sdk.m.j.c.b(com.alipay.sdk.m.j.c.FAILED.b());
                f5.b.c(f5.b.b(cVarB2.b(), cVarB2.a(), ""));
            }
        } catch (Exception unused2) {
            f5.b.c(f5.b.h());
        }
        activity.runOnUiThread(new a(activity));
        return true;
    }

    public static int C(int i10) {
        return i10 / 100000;
    }

    public static String D() {
        if (EnvUtils.b()) {
            return "com.eg.android.AlipayGphoneRC";
        }
        try {
            return f5.a.f118751d.get(0).f130889a;
        } catch (Throwable unused) {
            return f141897b;
        }
    }

    public static String E(Context context) {
        return "-1;-1";
    }

    public static String F(String str, String str2) {
        String string = Settings.Secure.getString(((Application) x5.b.e().c()).getContentResolver(), str);
        return string != null ? string : str2;
    }

    public static String G(x5.a aVar, Context context) {
        return m(aVar, context, context.getPackageName());
    }

    public static Map<String, String> H(String str) {
        HashMap map = new HashMap();
        for (String str2 : str.split("&")) {
            int iIndexOf = str2.indexOf(ContainerUtils.KEY_VALUE_DELIMITER, 1);
            if (-1 != iIndexOf) {
                map.put(str2.substring(0, iIndexOf), URLDecoder.decode(str2.substring(iIndexOf + 1)));
            }
        }
        return map;
    }

    public static Map<String, String> I(x5.a aVar, String str) {
        HashMap map = new HashMap(4);
        int iIndexOf = str.indexOf(63);
        if (iIndexOf != -1 && iIndexOf < str.length() - 1) {
            for (String str2 : str.substring(iIndexOf + 1).split("&")) {
                int iIndexOf2 = str2.indexOf(61, 1);
                if (iIndexOf2 != -1 && iIndexOf2 < str2.length() - 1) {
                    map.put(str2.substring(0, iIndexOf2), V(aVar, str2.substring(iIndexOf2 + 1)));
                }
            }
        }
        return map;
    }

    public static boolean J(x5.a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.f141088g)) {
            return false;
        }
        return aVar.f141088g.toLowerCase().contains("auth");
    }

    public static int K() {
        try {
            String lowerCase = Build.BRAND.toLowerCase();
            String lowerCase2 = Build.MANUFACTURER.toLowerCase();
            if (x("huawei", lowerCase, lowerCase2)) {
                return 1;
            }
            if (x("oppo", lowerCase, lowerCase2)) {
                return 2;
            }
            if (x("vivo", lowerCase, lowerCase2)) {
                return 4;
            }
            if (x("lenovo", lowerCase, lowerCase2)) {
                return 8;
            }
            if (x("xiaomi", lowerCase, lowerCase2)) {
                return 16;
            }
            return x("oneplus", lowerCase, lowerCase2) ? 32 : 0;
        } catch (Exception unused) {
            return 61440;
        }
    }

    public static String L(Context context) {
        return context.getResources().getConfiguration().locale.toString();
    }

    public static String M(String str) {
        return (EnvUtils.b() && TextUtils.equals(str, "com.eg.android.AlipayGphoneRC")) ? "com.eg.android.AlipayGphoneRC.IAlixPay" : "com.eg.android.AlipayGphone.IAlixPay";
    }

    public static String N(x5.a aVar, String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e10) {
            h5.a.i(aVar, h5.b.f119113l, "rflex", e10.getClass().getSimpleName());
            return null;
        }
    }

    public static int O(String str) {
        for (int i10 = 0; i10 < 64; i10++) {
            if (str.equals(String.valueOf(f141903h[i10]))) {
                return i10;
            }
        }
        return 0;
    }

    public static DisplayMetrics P(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static String Q() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/version"), 256);
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                Matcher matcher = Pattern.compile("\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\((?:[^(]*\\([^)]*\\))?[^)]*\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)").matcher(line);
                if (!matcher.matches() || matcher.groupCount() < 4) {
                    return "Unavailable";
                }
                return matcher.group(1) + "\n" + matcher.group(2) + " " + matcher.group(3) + "\n" + matcher.group(4);
            } catch (Throwable th2) {
                bufferedReader.close();
                throw th2;
            }
        } catch (IOException unused) {
            return "Unavailable";
        }
    }

    public static boolean R(x5.a aVar, String str) {
        try {
            int iS = S(str);
            h5.a.d(aVar, h5.b.f119113l, "bindExt", "" + iS);
            return l5.a.d().C() && (iS & 2) == 2;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int S(String str) {
        try {
            String strX = l5.a.d().x();
            if (TextUtils.isEmpty(strX)) {
                return 0;
            }
            return (F(strX, "").contains(str) ? 2 : 0) | 1;
        } catch (Throwable unused) {
            return 61440;
        }
    }

    public static String T() {
        String strQ = Q();
        int iIndexOf = strQ.indexOf(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (iIndexOf != -1) {
            strQ = strQ.substring(0, iIndexOf);
        }
        int iIndexOf2 = strQ.indexOf("\n");
        if (iIndexOf2 != -1) {
            strQ = strQ.substring(0, iIndexOf2);
        }
        return "Linux " + strQ;
    }

    public static String U(Context context) {
        String strB = k.b(context);
        return strB.substring(0, strB.indexOf(HttpConstant.SCHEME_SPLIT));
    }

    public static String V(x5.a aVar, String str) {
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e10) {
            h5.a.e(aVar, h5.b.f119113l, h5.b.B, e10);
            return "";
        }
    }

    public static String W() {
        return "Android " + Build.VERSION.RELEASE;
    }

    public static String X(Context context) {
        DisplayMetrics displayMetricsP = P(context);
        return displayMetricsP.widthPixels + androidx.webkit.b.f28327e + displayMetricsP.heightPixels;
    }

    public static boolean Y(String str) {
        return Pattern.compile("^http(s)?://([a-z0-9_\\-]+\\.)*(alipaydev|alipay|taobao)\\.(com|net)(:\\d+)?(/.*)?$").matcher(str).matches();
    }

    public static int Z() {
        try {
            return Process.myUid();
        } catch (Throwable th2) {
            e.d(th2);
            return -200;
        }
    }

    public static int a() {
        String strD = x5.b.e().d();
        if (TextUtils.isEmpty(strD)) {
            return -1;
        }
        String strReplaceAll = strD.replaceAll(ContainerUtils.KEY_VALUE_DELIMITER, "");
        if (strReplaceAll.length() >= 5) {
            strReplaceAll = strReplaceAll.substring(0, 5);
        }
        int iB = (int) (b(strReplaceAll) % 10000);
        return iB < 0 ? iB * (-1) : iB;
    }

    public static String a0(Context context) {
        return " (" + W() + ";" + T() + ";" + L(context) + ";;" + X(context) + ")(sdk android)";
    }

    public static long b(String str) {
        return c(str, 6);
    }

    public static String b0(String str) {
        return j(str, true);
    }

    public static long c(String str, int i10) {
        int iPow = (int) Math.pow(2.0d, i10);
        int length = str.length();
        long j10 = 0;
        int i11 = 0;
        int i12 = length;
        while (i11 < length) {
            int i13 = i11 + 1;
            j10 += ((long) Integer.parseInt(String.valueOf(O(str.substring(i11, i13))))) * ((long) Math.pow(iPow, i12 - 1));
            i12--;
            i11 = i13;
        }
        return j10;
    }

    public static JSONObject c0(String str) {
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static ActivityInfo d(Context context) {
        try {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                for (ActivityInfo activityInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities) {
                    if (TextUtils.equals(activityInfo.name, activity.getClass().getName())) {
                        return activityInfo;
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            e.d(th2);
            return null;
        }
    }

    public static boolean d0() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static PackageInfo e(Context context, String str) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(str, 192);
    }

    public static boolean e0(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(f141896a, 128) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static <T> T f(WeakReference<T> weakReference) {
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static String f0(String str) {
        try {
            Uri uri = Uri.parse(str);
            return String.format("%s%s", uri.getAuthority(), uri.getPath());
        } catch (Throwable th2) {
            e.d(th2);
            return com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
    }

    public static String g(int i10) {
        Random random = new Random();
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            int iNextInt = random.nextInt(3);
            if (iNextInt == 0) {
                sb2.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 65.0d)));
            } else if (iNextInt == 1) {
                sb2.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 97.0d)));
            } else if (iNextInt == 2) {
                sb2.append(String.valueOf(new Random().nextInt(10)));
            }
        }
        return sb2.toString();
    }

    public static boolean g0() {
        try {
            String[] strArrSplit = l5.a.d().u().split("\\|");
            String str = Build.MODEL;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            for (String str2 : strArrSplit) {
                if (TextUtils.equals(str, str2) || TextUtils.equals(str2, "all")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            e.d(th2);
            return false;
        }
    }

    public static String h(String str, String str2) {
        return str + str2;
    }

    public static String i(String str, String str2, String str3) {
        try {
            int iIndexOf = str3.indexOf(str) + str.length();
            if (iIndexOf <= str.length()) {
                return "";
            }
            int iIndexOf2 = TextUtils.isEmpty(str2) ? 0 : str3.indexOf(str2, iIndexOf);
            return iIndexOf2 < 1 ? str3.substring(iIndexOf) : str3.substring(iIndexOf, iIndexOf2);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String j(String str, boolean z10) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            if (!z10 || bArrDigest.length <= 16) {
                return o(bArrDigest);
            }
            byte[] bArr = new byte[16];
            System.arraycopy(bArrDigest, 0, bArr, 0, 16);
            return o(bArr);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static String k(x5.a aVar) {
        return N(aVar, "ro.build.fingerprint");
    }

    public static String l(x5.a aVar, Context context) {
        try {
            String strB = h.b(aVar, context, "alipay_cashier_ap_fi", "");
            if (!TextUtils.isEmpty(strB)) {
                return strB;
            }
            try {
                h.e(aVar, context, "alipay_cashier_ap_fi", b5.a.c("FU", System.currentTimeMillis(), new b5.d(), (short) 0, new b5.f()).a());
                String strB2 = h.b(aVar, context, "alipay_cashier_ap_fi", "");
                if (!TextUtils.isEmpty(strB2)) {
                    return strB2;
                }
                h5.a.i(aVar, h5.b.f119113l, "e_regen_empty", "");
                return "";
            } catch (Exception e10) {
                h5.a.i(aVar, h5.b.f119113l, "e_gen", e10.getClass().getSimpleName());
                return "";
            }
        } catch (Exception e11) {
            h5.a.e(aVar, h5.b.f119113l, "e_gen_err", e11);
            return "";
        }
    }

    public static String m(x5.a aVar, Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 128).versionName;
        } catch (Throwable th2) {
            h5.a.e(aVar, h5.b.f119113l, h5.b.f119133v, th2);
            return "";
        }
    }

    public static String n(x5.a aVar, byte[] bArr) {
        BigInteger modulus;
        try {
            PublicKey publicKey = ((X509Certificate) CertificateFactory.getInstance(com.huawei.hms.feature.dynamic.f.e.f60731b).generateCertificate(new ByteArrayInputStream(bArr))).getPublicKey();
            if (!(publicKey instanceof RSAPublicKey) || (modulus = ((RSAPublicKey) publicKey).getModulus()) == null) {
                return null;
            }
            return modulus.toString(16);
        } catch (Exception e10) {
            h5.a.e(aVar, "auth", h5.b.f119137x, e10);
            return null;
        }
    }

    public static String o(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb2.append(Character.forDigit((b10 & 240) >> 4, 16));
            sb2.append(Character.forDigit(b10 & 15, 16));
        }
        return sb2.toString();
    }

    public static Map<String, String> p(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (jSONObject == null) {
            return map;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                map.put(next, jSONObject.optString(next));
            } catch (Throwable th2) {
                e.d(th2);
            }
        }
        return map;
    }

    public static JSONObject q(Intent intent) {
        Bundle extras;
        JSONObject jSONObject = new JSONObject();
        if (intent != null && (extras = intent.getExtras()) != null) {
            for (String str : extras.keySet()) {
                try {
                    jSONObject.put(str, String.valueOf(extras.get(str)));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONObject;
    }

    public static c r(PackageInfo packageInfo, int i10, String str) {
        if (packageInfo == null) {
            return null;
        }
        return new c(packageInfo, i10, str);
    }

    public static c s(x5.a aVar, Context context, String str, int i10, String str2) {
        PackageInfo packageInfoE;
        if (EnvUtils.b() && f141897b.equals(str)) {
            str = "com.eg.android.AlipayGphoneRC";
        }
        try {
            packageInfoE = e(context, str);
        } catch (Throwable th2) {
            h5.a.i(aVar, "auth", h5.b.f119133v, th2.getMessage());
            packageInfoE = null;
        }
        if (z(aVar, packageInfoE)) {
            return r(packageInfoE, i10, str2);
        }
        return null;
    }

    public static c t(x5.a aVar, Context context, List<l5.a.b> list) {
        c cVarS;
        if (list == null) {
            return null;
        }
        for (l5.a.b bVar : list) {
            if (bVar != null && (cVarS = s(aVar, context, bVar.f130889a, bVar.f130890b, bVar.f130891c)) != null && !cVarS.b(aVar) && !cVarS.a()) {
                return cVarS;
            }
        }
        return null;
    }

    public static void u(String str, String str2, Context context, x5.a aVar) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || J(aVar) || !l5.a.d().J()) {
            return;
        }
        try {
            Intent intent = new Intent(j5.b.f124287l);
            intent.putExtra("bizType", str);
            intent.putExtra("exName", str2);
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent);
            h5.a.d(aVar, h5.b.f119113l, "AppNotify", str + "|" + str2);
        } catch (Exception unused) {
        }
    }

    public static boolean v(long j10, Runnable runnable, String str) {
        if (runnable == null) {
            return false;
        }
        ConditionVariable conditionVariable = new ConditionVariable();
        Thread thread = new Thread(new b(runnable, conditionVariable));
        if (!TextUtils.isEmpty(str)) {
            thread.setName(str);
        }
        thread.start();
        boolean zBlock = true;
        try {
            if (j10 <= 0) {
                conditionVariable.block();
            } else {
                zBlock = conditionVariable.block(j10);
            }
        } catch (Throwable unused) {
        }
        return zBlock;
    }

    public static boolean w(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        try {
            String str = packageInfo.versionName;
            String[] strArr = f141900e;
            return TextUtils.equals(str, strArr[0]) || TextUtils.equals(str, strArr[1]);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean x(Object obj, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return obj == null;
        }
        for (Object obj2 : objArr) {
            if ((obj == null && obj2 == null) || (obj != null && obj.equals(obj2))) {
                return true;
            }
        }
        return false;
    }

    public static boolean y(x5.a aVar, Context context, List<l5.a.b> list, boolean z10) {
        try {
            for (l5.a.b bVar : list) {
                if (bVar != null) {
                    String str = bVar.f130889a;
                    if (EnvUtils.b() && f141897b.equals(str)) {
                        str = "com.eg.android.AlipayGphoneRC";
                    }
                    try {
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 128);
                        if (packageInfo != null) {
                            if (!z10) {
                                return true;
                            }
                            h5.a.d(aVar, h5.b.f119113l, h5.b.X, packageInfo.packageName + "|" + packageInfo.versionName);
                            return true;
                        }
                        continue;
                    } catch (PackageManager.NameNotFoundException unused) {
                        continue;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            h5.a.e(aVar, h5.b.f119113l, h5.b.f119108h0, th2);
            return false;
        }
    }

    public static boolean z(x5.a aVar, PackageInfo packageInfo) {
        String str = "";
        boolean z10 = false;
        if (packageInfo == null) {
            str = "info == null";
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                str = "info.signatures == null";
            } else if (signatureArr.length <= 0) {
                str = "info.signatures.length <= 0";
            } else {
                z10 = true;
            }
        }
        if (!z10) {
            h5.a.i(aVar, "auth", h5.b.f119135w, str);
        }
        return z10;
    }
}
