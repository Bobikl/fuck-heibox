package com.google.android.exoplayer2.util;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseLongArray;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.y1;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.xiaomi.mipush.sdk.Constants;
import io.flutter.embedding.android.KeyboardMap;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes7.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f51536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f51537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f51538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f51539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f51540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f51541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f51542g = "Util";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f51543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f51544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f51545j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f51546k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f51547l = "format=m3u8-aapl";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f51548m = "format=mpd-time-csf";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    private static HashMap<String, String> f51549n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String[] f51550o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String[] f51551p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f51552q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f51553r;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f51536a = i10;
        String str = Build.DEVICE;
        f51537b = str;
        String str2 = Build.MANUFACTURER;
        f51538c = str2;
        String str3 = Build.MODEL;
        f51539d = str3;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 17 + String.valueOf(str3).length() + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(i10);
        f51540e = sb2.toString();
        f51541f = new byte[0];
        f51543h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f51544i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f51545j = Pattern.compile("%([A-Fa-f0-9]{2})");
        f51546k = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        f51550o = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", SocializeProtocolConstants.PROTOCOL_KEY_DE, "gre", "el", "fre", SocializeProtocolConstants.PROTOCOL_KEY_FR, "geo", "ka", "ice", ak.f104422ae, "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f51551p = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f51552q = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f51553r = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, bb.c.b.f31029x1, bb.c.b.E1, bb.c.b.f31073z1, 252, 251, bb.c.b.I1, bb.c.b.L1, 216, bb.c.b.f30852p1, bb.c.b.f30645g1, 209, bb.c.b.O0, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, bb.c.b.f30782m0, bb.c.b.f30940t0, 166, 161, 180, bb.c.b.f31028x0, bb.c.b.E0, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, bb.c.b.O1, bb.c.b.H1, bb.c.b.M1, bb.c.b.f30941t1, bb.c.b.f30963u1, bb.c.b.D1, bb.c.b.A1, 183, 176, 185, bb.c.b.I0, bb.c.b.f30851p0, 172, 165, 162, 143, 136, 129, 134, 147, 148, bb.c.b.f30528b0, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, bb.c.b.J0, 184, bb.c.b.f30896r0, bb.c.b.f30828o0, 163, bb.c.b.f30690i0, bb.c.b.P1, 254, 247, 240, bb.c.b.f30985v1, bb.c.b.f30919s1, bb.c.b.B1, bb.c.b.C1, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, bb.c.b.f30918s0, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, bb.c.b.f30829o1, 217, 208, 215, 194, bb.c.b.P0, 204, 203, bb.c.b.f31007w1, bb.c.b.f30897r1, bb.c.b.f31051y1, bb.c.b.F1, 250, 253, 244, bb.c.b.J1};
    }

    private u0() {
    }

    public static Handler A() {
        return B(null);
    }

    public static int A0(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null && com.google.common.base.a.a("rtsp", scheme)) {
            return 3;
        }
        String path = uri.getPath();
        if (path == null) {
            return 4;
        }
        return C0(path);
    }

    @androidx.annotation.p0
    public static String A1(String str) {
        int length = str.length();
        int iEnd = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) == '%') {
                i10++;
            }
        }
        if (i10 == 0) {
            return str;
        }
        int i12 = length - (i10 * 2);
        StringBuilder sb2 = new StringBuilder(i12);
        Matcher matcher = f51545j.matcher(str);
        while (i10 > 0 && matcher.find()) {
            char c10 = (char) Integer.parseInt((String) a.g(matcher.group(1)), 16);
            sb2.append((CharSequence) str, iEnd, matcher.start());
            sb2.append(c10);
            iEnd = matcher.end();
            i10--;
        }
        if (iEnd < length) {
            sb2.append((CharSequence) str, iEnd, length);
        }
        if (sb2.length() != i12) {
            return null;
        }
        return sb2.toString();
    }

    public static Handler B(@androidx.annotation.p0 Handler.Callback callback) {
        return x(X(), callback);
    }

    public static int B0(Uri uri, @androidx.annotation.p0 String str) {
        if (TextUtils.isEmpty(str)) {
            return A0(uri);
        }
        String strValueOf = String.valueOf(str);
        return C0(strValueOf.length() != 0 ? ".".concat(strValueOf) : new String("."));
    }

    public static long B1(long j10) {
        return (j10 == com.google.android.exoplayer2.j.f46377b || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    private static HashMap<String, String> C() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> map = new HashMap<>(iSOLanguages.length + f51550o.length);
        int i10 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f51550o;
            if (i10 >= strArr.length) {
                return map;
            }
            map.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    public static int C0(String str) {
        String strG = com.google.common.base.a.g(str);
        if (strG.endsWith(".mpd")) {
            return 0;
        }
        if (strG.endsWith(".m3u8")) {
            return 2;
        }
        Matcher matcher = f51546k.matcher(strG);
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup == null) {
            return 1;
        }
        if (strGroup.contains(f51548m)) {
            return 0;
        }
        return strGroup.contains(f51547l) ? 2 : 1;
    }

    public static void C1(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static File D(Context context, String str) throws IOException {
        File fileE = E(context, str);
        fileE.delete();
        fileE.mkdir();
        return fileE;
    }

    public static int D0(Uri uri, @androidx.annotation.p0 String str) {
        if (str == null) {
            return A0(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    public static File E(Context context, String str) throws IOException {
        return File.createTempFile(str, null, (File) a.g(context.getCacheDir()));
    }

    public static boolean E0(e0 e0Var, e0 e0Var2, @androidx.annotation.p0 Inflater inflater) {
        if (e0Var.a() <= 0) {
            return false;
        }
        if (e0Var2.b() < e0Var.a()) {
            e0Var2.c(e0Var.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(e0Var.d(), e0Var.e(), e0Var.a());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(e0Var2.d(), iInflate, e0Var2.b() - iInflate);
                if (inflater.finished()) {
                    e0Var2.R(iInflate);
                    inflater.reset();
                    return true;
                }
                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                    if (iInflate == e0Var2.b()) {
                        e0Var2.c(e0Var2.b() * 2);
                    }
                }
                inflater.reset();
                return false;
            } catch (DataFormatException unused) {
                inflater.reset();
                return false;
            } catch (Throwable th2) {
                inflater.reset();
                throw th2;
            }
        }
    }

    public static String F(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (m1(str.charAt(i12))) {
                i11++;
            }
        }
        if (i11 == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder((i11 * 2) + length);
        while (i11 > 0) {
            int i13 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (m1(cCharAt)) {
                sb2.append('%');
                sb2.append(Integer.toHexString(cCharAt));
                i11--;
            } else {
                sb2.append(cCharAt);
            }
            i10 = i13;
        }
        if (i10 < length) {
            sb2.append((CharSequence) str, i10, length);
        }
        return sb2.toString();
    }

    public static boolean F0(Context context) {
        return f51536a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static Uri G(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = f51546k.matcher(com.google.common.base.a.g(path));
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    public static boolean G0(int i10) {
        return i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static String H(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static boolean H0(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static String I(byte[] bArr) {
        return new String(bArr, com.google.common.base.c.f56721c);
    }

    public static boolean I0(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static String J(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, com.google.common.base.c.f56721c);
    }

    public static boolean J0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    @androidx.annotation.w0(21)
    public static int K(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    @androidx.annotation.w0(api = 24)
    private static boolean K0(Uri uri) {
        return "http".equals(uri.getScheme()) && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted((String) a.g(uri.getHost()));
    }

    @androidx.annotation.p0
    public static String L(int i10) {
        if (i10 == 0) {
            return y.f51585m0;
        }
        if (i10 == 1) {
            return y.f51589o0;
        }
        if (i10 != 2) {
            return null;
        }
        return y.f51587n0;
    }

    public static boolean L0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static int M(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 5 || i10 == 8) ? 4 : 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread M0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static int N(int i10) {
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return bb.c.b.Cl;
            case 8:
                int i11 = f51536a;
                if (i11 < 23 && i11 < 21) {
                    return 0;
                }
                return bb.c.f.CB;
            default:
                return 0;
        }
    }

    public static int N0(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public static int O(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == 1) {
            return 13;
        }
        if (i10 == 2) {
            return 6;
        }
        int i11 = 4;
        if (i10 != 4) {
            i11 = 5;
            if (i10 != 5) {
                return i10 != 8 ? 1 : 3;
            }
        }
        return i11;
    }

    public static int O0(long[] jArr, long j10) {
        for (int i10 = 0; i10 < jArr.length; i10++) {
            if (jArr[i10] == j10) {
                return i10;
            }
        }
        return -1;
    }

    public static int P(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    private static String P0(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = f51551p;
            if (i10 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i10])) {
                String strValueOf = String.valueOf(strArr[i10 + 1]);
                String strValueOf2 = String.valueOf(str.substring(strArr[i10].length()));
                return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
            }
            i10 += 2;
        }
    }

    public static byte[] Q(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) ((Character.digit(str.charAt(i11), 16) << 4) + Character.digit(str.charAt(i11 + 1), 16));
        }
        return bArr;
    }

    public static boolean Q0(Activity activity, Uri... uriArr) {
        if (f51536a < 23) {
            return false;
        }
        for (Uri uri : uriArr) {
            if (J0(uri)) {
                return i1(activity);
            }
        }
        return false;
    }

    public static int R(@androidx.annotation.p0 String str, int i10) {
        int i11 = 0;
        for (String str2 : r1(str)) {
            if (i10 == y.n(str2)) {
                i11++;
            }
        }
        return i11;
    }

    public static boolean R0(Activity activity, i2... i2VarArr) {
        if (f51536a < 23) {
            return false;
        }
        for (i2 i2Var : i2VarArr) {
            i2.h hVar = i2Var.f46269c;
            if (hVar != null) {
                if (J0(hVar.f46345a)) {
                    return i1(activity);
                }
                for (int i10 = 0; i10 < i2Var.f46269c.f46351g.size(); i10++) {
                    if (J0(i2Var.f46269c.f46351g.get(i10).f46354a)) {
                        return i1(activity);
                    }
                }
            }
        }
        return false;
    }

    @androidx.annotation.p0
    public static String S(@androidx.annotation.p0 String str, int i10) {
        String[] strArrR1 = r1(str);
        if (strArrR1.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrR1) {
            if (i10 == y.n(str2)) {
                if (sb2.length() > 0) {
                    sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    @androidx.annotation.w0(18)
    public static long S0(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            throw new NoSuchElementException();
        }
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < sparseLongArray.size(); i10++) {
            jMin = Math.min(jMin, sparseLongArray.valueAt(i10));
        }
        return jMin;
    }

    public static String T(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < objArr.length; i10++) {
            sb2.append(objArr[i10].getClass().getSimpleName());
            if (i10 < objArr.length - 1) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    public static <T> void T0(List<T> list, int i10, int i11, int i12) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i13 = (i11 - i10) - 1; i13 >= 0; i13--) {
            arrayDeque.addFirst(list.remove(i10 + i13));
        }
        list.addAll(Math.min(i12, list.size()), arrayDeque);
    }

    public static String U(@androidx.annotation.p0 Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e)) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return com.google.common.base.a.j(networkCountryIso);
            }
        }
        return com.google.common.base.a.j(Locale.getDefault().getCountry());
    }

    public static long U0(long j10) {
        return (j10 == com.google.android.exoplayer2.j.f46377b || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static Point V(Context context) {
        DisplayManager displayManager;
        Display display = (f51536a < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            display = ((WindowManager) a.g((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return W(context, display);
    }

    public static ExecutorService V0(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.exoplayer2.util.t0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return u0.M0(str, runnable);
            }
        });
    }

    public static Point W(Context context, Display display) {
        if (display.getDisplayId() == 0 && L0(context)) {
            String strV0 = f51536a < 28 ? v0("sys.display-size") : v0("vendor.display-size");
            if (!TextUtils.isEmpty(strV0)) {
                try {
                    String[] strArrP1 = p1(strV0.trim(), "x");
                    if (strArrP1.length == 2) {
                        int i10 = Integer.parseInt(strArrP1[0]);
                        int i11 = Integer.parseInt(strArrP1[1]);
                        if (i10 > 0 && i11 > 0) {
                            return new Point(i10, i11);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                String strValueOf = String.valueOf(strV0);
                u.d(f51542g, strValueOf.length() != 0 ? "Invalid display size: ".concat(strValueOf) : new String("Invalid display size: "));
            }
            if ("Sony".equals(f51538c) && f51539d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(bb.c.e.f31800g5, bb.c.d.B1);
            }
        }
        Point point = new Point();
        int i12 = f51536a;
        if (i12 >= 23) {
            c0(display, point);
        } else if (i12 >= 17) {
            b0(display, point);
        } else {
            a0(display, point);
        }
        return point;
    }

    public static String W0(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals(com.google.android.exoplayer2.j.f46383c1)) {
            str = strReplace;
        }
        String strG = com.google.common.base.a.g(str);
        String str2 = q1(strG, Constants.ACCEPT_TIME_SEPARATOR_SERVER)[0];
        if (f51549n == null) {
            f51549n = C();
        }
        String str3 = f51549n.get(str2);
        if (str3 != null) {
            String strValueOf = String.valueOf(strG.substring(str2.length()));
            strG = strValueOf.length() != 0 ? str3.concat(strValueOf) : new String(str3);
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? P0(strG) : strG;
    }

    public static Looper X() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static <T> T[] X0(T[] tArr, T t10) {
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length + 1);
        objArrCopyOf[tArr.length] = t10;
        return (T[]) l(objArrCopyOf);
    }

    public static Uri Y(String str, String str2) {
        String strEncodeToString = Base64.encodeToString(str2.getBytes(), 2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(strEncodeToString).length());
        sb2.append("data:");
        sb2.append(str);
        sb2.append(";base64,");
        sb2.append(strEncodeToString);
        return Uri.parse(sb2.toString());
    }

    public static <T> T[] Y0(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static Locale Z() {
        return f51536a >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
    }

    public static <T> T[] Z0(T[] tArr, int i10) {
        a.a(i10 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    private static void a0(Display display, Point point) {
        display.getSize(point);
    }

    public static <T> T[] a1(T[] tArr, int i10, int i11) {
        a.a(i10 >= 0);
        a.a(i11 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i10, i11);
    }

    public static long b(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        return ((j10 ^ j13) & (j11 ^ j13)) < 0 ? j12 : j13;
    }

    @androidx.annotation.w0(17)
    private static void b0(Display display, Point point) {
        display.getRealSize(point);
    }

    public static <T> void b1(List<T> list, T[] tArr) {
        a.i(list.size() == tArr.length);
        list.toArray(tArr);
    }

    public static boolean c(@androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @androidx.annotation.w0(23)
    private static void c0(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static long c1(String str) throws ParserException {
        Matcher matcher = f51543h.matcher(str);
        if (!matcher.matches()) {
            String strValueOf = String.valueOf(str);
            throw ParserException.a(strValueOf.length() != 0 ? "Invalid date/time format: ".concat(strValueOf) : new String("Invalid date/time format: "), null);
        }
        int i10 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i10 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if (Constants.ACCEPT_TIME_SEPARATOR_SERVER.equals(matcher.group(11))) {
                i10 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            String strValueOf2 = String.valueOf(matcher.group(8));
            gregorianCalendar.set(14, new BigDecimal(strValueOf2.length() != 0 ? "0.".concat(strValueOf2) : new String("0.")).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i10 != 0 ? timeInMillis - ((long) (i10 * 60000)) : timeInMillis;
    }

    public static <T extends Comparable<? super T>> int d(List<? extends Comparable<? super T>> list, T t10, boolean z10, boolean z11) {
        int i10;
        int iBinarySearch = Collections.binarySearch(list, t10);
        if (iBinarySearch < 0) {
            i10 = ~iBinarySearch;
        } else {
            int size = list.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= size) {
                    break;
                }
            } while (list.get(iBinarySearch).compareTo(t10) == 0);
            i10 = z10 ? iBinarySearch - 1 : iBinarySearch;
        }
        return z11 ? Math.min(list.size() - 1, i10) : i10;
    }

    @androidx.annotation.p0
    public static UUID d0(String str) {
        String strG = com.google.common.base.a.g(str);
        strG.hashCode();
        switch (strG) {
            case "playready":
                return com.google.android.exoplayer2.j.Y1;
            case "widevine":
                return com.google.android.exoplayer2.j.X1;
            case "clearkey":
                return com.google.android.exoplayer2.j.W1;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    public static long d1(String str) {
        Matcher matcher = f51544i.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d10 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d11 = d10 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d12 = d11 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d13 = d12 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d14 = d13 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j10 = (long) ((d14 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return zIsEmpty ? -j10 : j10;
    }

    public static int e(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int iBinarySearch = Arrays.binarySearch(iArr, i10);
        if (iBinarySearch < 0) {
            i11 = ~iBinarySearch;
        } else {
            do {
                iBinarySearch++;
                if (iBinarySearch >= iArr.length) {
                    break;
                }
            } while (iArr[iBinarySearch] == i10);
            i11 = z10 ? iBinarySearch - 1 : iBinarySearch;
        }
        return z11 ? Math.min(iArr.length - 1, i11) : i11;
    }

    public static int e0(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return 6003;
        }
        switch (i10) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i10) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static boolean e1(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static int f(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            i10 = ~iBinarySearch;
        } else {
            do {
                iBinarySearch++;
                if (iBinarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[iBinarySearch] == j10);
            i10 = z10 ? iBinarySearch - 1 : iBinarySearch;
        }
        return z11 ? Math.min(jArr.length - 1, i10) : i10;
    }

    public static int f0(@androidx.annotation.p0 String str) {
        String[] strArrP1;
        int length;
        if (str == null || (length = (strArrP1 = p1(str, lg.a.f131412e)).length) < 2) {
            return 0;
        }
        String str2 = strArrP1[length - 1];
        boolean z10 = length >= 3 && "neg".equals(strArrP1[length - 2]);
        try {
            int i10 = Integer.parseInt((String) a.g(str2));
            return z10 ? -i10 : i10;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static boolean f1(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static int g(v vVar, long j10, boolean z10, boolean z11) {
        int i10;
        int iC = vVar.c() - 1;
        int i11 = 0;
        while (i11 <= iC) {
            int i12 = (i11 + iC) >>> 1;
            if (vVar.b(i12) < j10) {
                i11 = i12 + 1;
            } else {
                iC = i12 - 1;
            }
        }
        if (z10 && (i10 = iC + 1) < vVar.c() && vVar.b(i10) == j10) {
            return i10;
        }
        if (z11 && iC == -1) {
            return 0;
        }
        return iC;
    }

    public static String g0(int i10) {
        if (i10 == 0) {
            return "NO";
        }
        if (i10 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i10 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i10 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i10 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static void g1(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                g1(file2);
            }
        }
        file.delete();
    }

    public static <T extends Comparable<? super T>> int h(List<? extends Comparable<? super T>> list, T t10, boolean z10, boolean z11) {
        int i10;
        int iBinarySearch = Collections.binarySearch(list, t10);
        if (iBinarySearch < 0) {
            i10 = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (list.get(iBinarySearch).compareTo(t10) == 0);
            i10 = z10 ? iBinarySearch + 1 : iBinarySearch;
        }
        return z11 ? Math.max(0, i10) : i10;
    }

    public static int h0(String str) {
        int length = str.length();
        a.a(length <= 4);
        int iCharAt = 0;
        for (int i10 = 0; i10 < length; i10++) {
            iCharAt = (iCharAt << 8) | str.charAt(i10);
        }
        return iCharAt;
    }

    public static <T> void h1(List<T> list, int i10, int i11) {
        if (i10 < 0 || i11 > list.size() || i10 > i11) {
            throw new IllegalArgumentException();
        }
        if (i10 != i11) {
            list.subList(i10, i11).clear();
        }
    }

    public static int i(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int iBinarySearch = Arrays.binarySearch(iArr, i10);
        if (iBinarySearch < 0) {
            i11 = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (iArr[iBinarySearch] == i10);
            i11 = z10 ? iBinarySearch + 1 : iBinarySearch;
        }
        return z11 ? Math.max(0, i11) : i11;
    }

    public static String i0(Locale locale) {
        return f51536a >= 21 ? j0(locale) : locale.toString();
    }

    @androidx.annotation.w0(api = 23)
    private static boolean i1(Activity activity) {
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return false;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
        return true;
    }

    public static int j(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            i10 = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (jArr[iBinarySearch] == j10);
            i10 = z10 ? iBinarySearch + 1 : iBinarySearch;
        }
        return z11 ? Math.max(0, i10) : i10;
    }

    @androidx.annotation.w0(21)
    private static String j0(Locale locale) {
        return locale.toLanguageTag();
    }

    public static long j1(long j10, long j11, long j12) {
        if (j12 >= j11 && j12 % j11 == 0) {
            return j10 / (j12 / j11);
        }
        if (j12 < j11 && j11 % j12 == 0) {
            return j10 * (j11 / j12);
        }
        return (long) (j10 * (j11 / j12));
    }

    @mk.d({"#1"})
    public static <T> T k(@androidx.annotation.p0 T t10) {
        return t10;
    }

    public static long k0(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * ((double) f10));
    }

    public static long[] k1(List<Long> list, long j10, long j11) {
        int size = list.size();
        long[] jArr = new long[size];
        int i10 = 0;
        if (j11 >= j10 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i10 < size) {
                jArr[i10] = list.get(i10).longValue() / j12;
                i10++;
            }
        } else if (j11 >= j10 || j10 % j11 != 0) {
            double d10 = j10 / j11;
            while (i10 < size) {
                jArr[i10] = (long) (list.get(i10).longValue() * d10);
                i10++;
            }
        } else {
            long j13 = j10 / j11;
            while (i10 < size) {
                jArr[i10] = list.get(i10).longValue() * j13;
                i10++;
            }
        }
        return jArr;
    }

    @mk.d({"#1"})
    public static <T> T[] l(T[] tArr) {
        return tArr;
    }

    public static long l0(long j10) {
        return j10 == com.google.android.exoplayer2.j.f46377b ? System.currentTimeMillis() : j10 + SystemClock.elapsedRealtime();
    }

    public static void l1(long[] jArr, long j10, long j11) {
        int i10 = 0;
        if (j11 >= j10 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] / j12;
                i10++;
            }
            return;
        }
        if (j11 >= j10 || j10 % j11 != 0) {
            double d10 = j10 / j11;
            while (i10 < jArr.length) {
                jArr[i10] = (long) (jArr[i10] * d10);
                i10++;
            }
            return;
        }
        long j13 = j10 / j11;
        while (i10 < jArr.length) {
            jArr[i10] = jArr[i10] * j13;
            i10++;
        }
    }

    public static int m(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static int m0(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 == 24) {
            return 536870912;
        }
        if (i10 != 32) {
            return 0;
        }
        return com.google.android.exoplayer2.j.G;
    }

    private static boolean m1(char c10) {
        return c10 == '\"' || c10 == '%' || c10 == '*' || c10 == '/' || c10 == ':' || c10 == '<' || c10 == '\\' || c10 == '|' || c10 == '>' || c10 == '?';
    }

    public static long n(long j10, long j11) {
        return ((j10 + j11) - 1) / j11;
    }

    public static a2 n0(int i10, int i11, int i12) {
        return new a2.b().e0(y.I).H(i11).f0(i12).Y(i10).E();
    }

    public static void n1(Throwable th2) throws Throwable {
        o1(th2);
    }

    public static boolean o(i2... i2VarArr) {
        if (f51536a < 24) {
            return true;
        }
        for (i2 i2Var : i2VarArr) {
            i2.h hVar = i2Var.f46269c;
            if (hVar != null) {
                if (K0(hVar.f46345a)) {
                    return false;
                }
                for (int i10 = 0; i10 < i2Var.f46269c.f46351g.size(); i10++) {
                    if (K0(i2Var.f46269c.f46351g.get(i10).f46354a)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static int o0(int i10, int i11) {
        if (i10 != 2) {
            if (i10 == 3) {
                return i11;
            }
            if (i10 != 4) {
                if (i10 != 268435456) {
                    if (i10 == 536870912) {
                        return i11 * 3;
                    }
                    if (i10 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i11 * 4;
        }
        return i11 * 2;
    }

    private static <T extends Throwable> void o1(Throwable th2) throws Throwable {
        throw th2;
    }

    public static void p(@androidx.annotation.p0 Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long p0(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / ((double) f10));
    }

    public static String[] p1(String str, String str2) {
        return str.split(str2, -1);
    }

    public static int q(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public static int q0(int i10) {
        if (i10 == 13) {
            return 1;
        }
        switch (i10) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static String[] q1(String str, String str2) {
        return str.split(str2, 2);
    }

    public static float r(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static String r0(StringBuilder sb2, Formatter formatter, long j10) {
        if (j10 == com.google.android.exoplayer2.j.f46377b) {
            j10 = 0;
        }
        String str = j10 < 0 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "";
        long jAbs = (Math.abs(j10) + 500) / 1000;
        long j11 = jAbs % 60;
        long j12 = (jAbs / 60) % 60;
        long j13 = jAbs / 3600;
        sb2.setLength(0);
        return j13 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j12), Long.valueOf(j11)).toString();
    }

    public static String[] r1(@androidx.annotation.p0 String str) {
        return TextUtils.isEmpty(str) ? new String[0] : p1(str.trim(), "(\\s*,\\s*)");
    }

    public static int s(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static String[] s0() {
        String[] strArrT0 = t0();
        for (int i10 = 0; i10 < strArrT0.length; i10++) {
            strArrT0[i10] = W0(strArrT0[i10]);
        }
        return strArrT0;
    }

    @androidx.annotation.p0
    public static ComponentName s1(Context context, Intent intent) {
        return f51536a >= 26 ? context.startForegroundService(intent) : context.startService(intent);
    }

    public static long t(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    private static String[] t0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f51536a >= 24 ? u0(configuration) : new String[]{i0(configuration.locale)};
    }

    public static long t1(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        return ((j10 ^ j13) & (j11 ^ j10)) < 0 ? j12 : j13;
    }

    public static boolean u(Object[] objArr, @androidx.annotation.p0 Object obj) {
        for (Object obj2 : objArr) {
            if (c(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    @androidx.annotation.w0(24)
    private static String[] u0(Configuration configuration) {
        return p1(configuration.getLocales().toLanguageTags(), Constants.ACCEPT_TIME_SEPARATOR_SP);
    }

    public static boolean u1(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    public static int v(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f51552q[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    @androidx.annotation.p0
    private static String v0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            String strValueOf = String.valueOf(str);
            u.e(f51542g, strValueOf.length() != 0 ? "Failed to read system property ".concat(strValueOf) : new String("Failed to read system property "), e10);
            return null;
        }
    }

    public static byte[] v1(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public static int w(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f51553r[i12 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i12;
    }

    public static String w0(int i10) {
        switch (i10) {
            case -2:
                return "none";
            case -1:
            default:
                if (i10 < 10000) {
                    return "?";
                }
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("custom (");
                sb2.append(i10);
                sb2.append(")");
                return sb2.toString();
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return com.google.android.exoplayer2.text.ttml.d.f49817y;
            case 6:
                return "camera motion";
        }
    }

    public static String w1(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(Character.forDigit((bArr[i10] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i10] & 15, 16));
        }
        return sb2.toString();
    }

    public static Handler x(Looper looper, @androidx.annotation.p0 Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static String x0(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        String str3 = Build.VERSION.RELEASE;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append("/");
        sb2.append(str2);
        sb2.append(" (Linux;Android ");
        sb2.append(str3);
        sb2.append(") ");
        sb2.append(y1.f52054c);
        return sb2.toString();
    }

    public static long x1(int i10, int i11) {
        return y1(i11) | (y1(i10) << 32);
    }

    public static Handler y() {
        return z(null);
    }

    public static byte[] y0(String str) {
        return str.getBytes(com.google.common.base.c.f56721c);
    }

    public static long y1(int i10) {
        return ((long) i10) & KeyboardMap.kValueMask;
    }

    public static Handler z(@androidx.annotation.p0 Handler.Callback callback) {
        return x((Looper) a.k(Looper.myLooper()), callback);
    }

    public static byte[] z0(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th2) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static CharSequence z1(CharSequence charSequence, int i10) {
        return charSequence.length() <= i10 ? charSequence : charSequence.subSequence(0, i10);
    }
}
