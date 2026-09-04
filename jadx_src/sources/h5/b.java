package h5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONObject;
import z5.c;
import z5.e;
import z5.l;

/* JADX INFO: loaded from: classes6.dex */
public class b {
    public static final String A = "SSLDenied";
    public static final String A0 = "out_trade_no";
    public static final String B = "H5PayDataAnalysisError";
    public static final String B0 = "trade_no";
    public static final String C = "H5AuthDataAnalysisError";
    public static final String C0 = "biz_content";
    public static final String D = "PublicKeyUnmatch";
    public static final String D0 = "app_id";
    public static final String E = "ClientBindFailed";
    public static final String F = "TriDesEncryptError";
    public static final String G = "TriDesDecryptError";
    public static final String H = "ClientBindException";
    public static final String I = "SaveTradeTokenError";
    public static final String J = "ClientBindServiceFailed";
    public static final String K = "TryStartServiceEx";
    public static final String L = "BindWaitTimeoutEx";
    public static final String M = "CheckClientExistEx";
    public static final String N = "CheckClientSignEx";
    public static final String O = "GetInstalledAppEx";
    public static final String P = "ParserTidClientKeyEx";
    public static final String Q = "PgApiInvoke";
    public static final String R = "PgBindStarting";
    public static final String S = "PgBinded";
    public static final String T = "PgBindEnd";
    public static final String U = "PgBindPay";
    public static final String V = "PgReturn";
    public static final String W = "PgReturnV";
    public static final String X = "PgWltVer";
    public static final String Y = "PgOpenStarting";
    public static final String Z = "ErrIntentEx";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f119101a0 = "ErrActNull";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f119102b0 = "ErrActEx";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f119103c0 = "ErrActNull2";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f119104d0 = "ErrActEx2";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f119105e0 = "ErrActNotCreated";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f119106f0 = "GetInstalledAppEx";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f119107g0 = "StartLaunchAppTransEx";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f119108h0 = "CheckLaunchAppExistEx";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f119109i0 = "LogBindCalledH5";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f119110j0 = "LogCalledH5";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f119111k = "net";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f119112k0 = "LogHkLoginByIntent";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f119113l = "biz";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f119114l0 = "SchemePayWrongHashEx";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f119115m = "cp";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final String f119116m0 = "LogAppFetchConfigTimeout";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f119117n = "auth";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final String f119118n0 = "H5CbUrlEmpty";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f119119o = "third";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String f119120o0 = "H5CbEx";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f119121p = "wlt";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f119122p0 = "StartActivityEx";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f119123q = "FormatResultEx";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f119124q0 = "JSONEx";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f119125r = "GetApdidEx";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f119126r0 = "ParseBundleSerializableError";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f119127s = "GetApdidNull";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f119128s0 = "ParseSchemeQueryError";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f119129t = "GetApdidTimeout";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f119130t0 = "TbChk";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f119131u = "GetUtdidEx";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String f119132u0 = "TbStart";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f119133v = "GetPackageInfoEx";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final String f119134v0 = "TbCancel";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f119135w = "NotIncludeSignatures";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final String f119136w0 = "TbUnknown";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f119137x = "GetPublicKeyFromSignEx";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final String f119138x0 = "TbOk";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f119139y = "webError";

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final String f119140y0 = "TbActFail";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f119141z = "SSLError";

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final String f119142z0 = "partner";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f119143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f119144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f119145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f119146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f119147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f119148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f119149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f119150h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f119151i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f119152j;

    public b(Context context, boolean z10) {
        context = context != null ? context.getApplicationContext() : context;
        this.f119143a = k();
        this.f119145c = c(context);
        this.f119146d = b(z10 ? 0L : a.e.a(context));
        this.f119147e = a();
        this.f119148f = l(context);
        this.f119149g = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        this.f119152j = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    }

    public static String a() {
        return String.format("%s,%s,-,-,-", p(y5.a.a(x5.b.e().c()).i()), p(x5.b.e().d()));
    }

    public static String b(long j10) {
        return String.format("android,3,%s,%s,com.alipay.mcpay,5.0,-,%s,-", p("15.8.11"), p("h.a.3.8.11"), Constants.WAVE_SEPARATOR + j10);
    }

    public static String c(Context context) {
        String packageName;
        String str = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                packageName = applicationContext.getPackageName();
                try {
                    PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 64);
                    str = packageInfo.versionName + "|" + d(packageInfo);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                packageName = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
            }
        } else {
            packageName = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
        return String.format("%s,%s,-,-,-", p(packageName), p(str));
    }

    public static String d(PackageInfo packageInfo) {
        Signature[] signatureArr;
        String strSubstring;
        if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length == 0) {
            return "0";
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(packageInfo.signatures.length);
            for (Signature signature : packageInfo.signatures) {
                try {
                    String strN = l.n(null, signature.toByteArray());
                    strSubstring = TextUtils.isEmpty(strN) ? "?" : l.b0(strN).substring(0, 8);
                } catch (Throwable unused) {
                }
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                sb2.append(strSubstring);
            }
            return sb2.toString();
        } catch (Throwable unused2) {
            return "?";
        }
    }

    public static String f(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append(th2.getClass().getName());
            stringBuffer.append(":");
            stringBuffer.append(th2.getMessage());
            stringBuffer.append(" 》 ");
            StackTraceElement[] stackTrace = th2.getStackTrace();
            if (stackTrace != null) {
                int i10 = 0;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stringBuffer.append(stackTraceElement.toString());
                    stringBuffer.append(" 》 ");
                    i10++;
                    if (i10 > 5) {
                        break;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }

    @SuppressLint({"SimpleDateFormat"})
    public static String k() {
        return String.format("%s,%s", u(), new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date()));
    }

    public static String l(Context context) {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,-", p(c.f(context)), "android", p(Build.VERSION.RELEASE), p(Build.MODEL), Constants.ACCEPT_TIME_SEPARATOR_SERVER, "0", p(c.g(context).b()), "gw", p(b6.b.c(null, context)));
    }

    public static String m(String str) {
        String string;
        String strReplace;
        if (str == null) {
            str = "";
        }
        String[] strArrSplit = str.split("&");
        String strReplace2 = null;
        if (strArrSplit != null) {
            string = null;
            strReplace = null;
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
                if (strArrSplit2 != null && strArrSplit2.length == 2) {
                    if (strArrSplit2[0].equalsIgnoreCase(f119142z0)) {
                        strReplace2 = strArrSplit2[1].replace("\"", "");
                    } else if (strArrSplit2[0].equalsIgnoreCase(A0)) {
                        string = strArrSplit2[1].replace("\"", "");
                    } else if (strArrSplit2[0].equalsIgnoreCase(B0)) {
                        strReplace = strArrSplit2[1].replace("\"", "");
                    } else if (strArrSplit2[0].equalsIgnoreCase(C0)) {
                        try {
                            JSONObject jSONObject = new JSONObject(l.V(x5.a.w(), strArrSplit2[1]));
                            if (TextUtils.isEmpty(string)) {
                                string = jSONObject.getString(A0);
                            }
                        } catch (Throwable unused) {
                        }
                    } else if (strArrSplit2[0].equalsIgnoreCase("app_id") && TextUtils.isEmpty(strReplace2)) {
                        strReplace2 = strArrSplit2[1];
                    }
                }
            }
        } else {
            string = null;
            strReplace = null;
        }
        return String.format("%s,%s,-,%s,-,-,-", p(strReplace), p(string), p(strReplace2));
    }

    public static String o() {
        return new SimpleDateFormat("HH:mm:ss:SSS", Locale.getDefault()).format(new Date());
    }

    public static String p(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replace(com.meituan.robust.Constants.ARRAY_TYPE, "【").replace("]", "】").replace("(", "（").replace(")", "）").replace(Constants.ACCEPT_TIME_SEPARATOR_SP, "，").replace("^", Constants.WAVE_SEPARATOR).replace("#", "＃");
    }

    private synchronized void q(String str, String str2, String str3) {
        e.i(j5.a.f124275z, String.format("event %s %s %s", str, str2, str3));
        String str4 = "";
        if (!TextUtils.isEmpty(this.f119150h)) {
            str4 = "^";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str4);
        Object[] objArr = new Object[4];
        objArr[0] = TextUtils.isEmpty(str) ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : p(str);
        objArr[1] = p(str2);
        objArr[2] = p(str3);
        objArr[3] = p(o());
        sb2.append(String.format("%s,%s,%s,-,-,-,-,-,-,-,-,-,-,%s", objArr));
        this.f119150h += sb2.toString();
    }

    public static String r(String str) {
        return TextUtils.isEmpty(str) ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : str;
    }

    private synchronized void s(String str, String str2, String str3) {
        e.h(j5.a.f124275z, String.format("err %s %s %s", str, str2, str3));
        String str4 = "";
        if (!TextUtils.isEmpty(this.f119151i)) {
            str4 = "^";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str4);
        Object[] objArr = new Object[4];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = TextUtils.isEmpty(str3) ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : p(str3);
        objArr[3] = p(o());
        sb2.append(String.format("%s,%s,%s,%s", objArr));
        this.f119151i += sb2.toString();
    }

    private boolean t() {
        return TextUtils.isEmpty(this.f119151i);
    }

    public static String u() {
        try {
            return UUID.randomUUID().toString();
        } catch (Throwable unused) {
            return "12345678uuid";
        }
    }

    public String e(String str) {
        String strM = m(str);
        this.f119144b = strM;
        return String.format("[(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s)]", this.f119143a, strM, this.f119145c, this.f119146d, this.f119147e, this.f119148f, this.f119149g, r(this.f119150h), r(this.f119151i), this.f119152j);
    }

    public void g(String str, String str2) {
        q("", str, str2);
    }

    public void h(String str, String str2, String str3) {
        q("", str, str2 + "|" + str3);
    }

    public void i(String str, String str2, Throwable th2) {
        s(str, str2, f(th2));
    }

    public void j(String str, String str2, Throwable th2, String str3) {
        s(str, str2, str3 + ": " + f(th2));
    }

    public void n(String str, String str2, String str3) {
        s(str, str2, str3);
    }
}
