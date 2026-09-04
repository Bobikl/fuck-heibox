package com.max.hbutils.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.util.Log;
import androidx.annotation.w0;
import com.max.hbutils.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.tools.ant.util.d0;

/* JADX INFO: compiled from: TimeUtils.java */
/* JADX INFO: loaded from: classes13.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f73594a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f73595b = 60000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f73596c = 3600000;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f73597d = 86400000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f73598e = 604800000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f73599f = 2592000000L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f73600g = 31449600000L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f73601h = "yyyy-MM-dd";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f73602i = "HH:mm:ss.SSS";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f73603j = "MM-dd";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f73604k = "yyyy-MM-dd HH:mm:ss";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f73605l = "yyyy-MM-dd HH:mm";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final SimpleDateFormat[] f73606m;

    static {
        Locale locale = Locale.US;
        f73606m = new SimpleDateFormat[]{new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z", locale), new SimpleDateFormat("EEE MMM dd HH:mm:ss yyyy", locale), new SimpleDateFormat(f73604k, locale), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z", locale), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", locale), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", locale), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", locale), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss Z", locale)};
    }

    public static String A(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, null, changeQuickRedirect, true, bb.c.k.st, new Class[]{Long.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (j10 <= 0) {
            return "00:00:00";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(d0.f136746g);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+0"));
        return simpleDateFormat.format(new Date(j10));
    }

    public static String[] B(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.xt, new Class[]{String.class}, String[].class);
        if (patchProxyResultProxy.isSupported) {
            return (String[]) patchProxyResultProxy.result;
        }
        long jR = n.r(str) * 1000;
        DecimalFormat decimalFormat = new DecimalFormat(org.apache.tools.tar.c.V);
        long j10 = jR % 86400000;
        long j11 = j10 % 3600000;
        return new String[]{String.valueOf(jR / 86400000), decimalFormat.format(j10 / 3600000), decimalFormat.format(j11 / 60000), decimalFormat.format((j11 % 60000) / 1000)};
    }

    public static long C() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.k.ot, new Class[0], Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : System.currentTimeMillis() / 1000;
    }

    @SuppressLint({"NewApi"})
    public static String D() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.k.At, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return Build.VERSION.SDK_INT >= 26 ? ZoneId.systemDefault().getId() : TimeZone.getDefault().getID();
    }

    public static String E(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, null, changeQuickRedirect, true, bb.c.k.vt, new Class[]{Long.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Calendar calendar = Calendar.getInstance();
        long j11 = j10 * 1000;
        calendar.setTimeInMillis(j11);
        Calendar calendar2 = Calendar.getInstance();
        Calendar calendar3 = Calendar.getInstance();
        calendar3.add(5, 1);
        if (K(calendar, calendar2)) {
            return "今天";
        }
        return K(calendar, calendar3) ? "明天" : new SimpleDateFormat("yyyy.M.d", Locale.getDefault()).format(new Date(j11));
    }

    public static long F() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.k.Ts, new Class[0], Long.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.time.ZonedDateTime] */
    @w0(api = 26)
    public static long G() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.k.Ss, new Class[0], Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : LocalDateTime.of(LocalDateTime.now().toLocalDate(), LocalDateTime.MIN.toLocalTime()).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public static int H(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, null, changeQuickRedirect, true, bb.c.k.mt, new Class[]{Long.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return LocalDateTime.ofInstant(Instant.ofEpochMilli(j10), ZoneId.systemDefault()).getYear();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j10));
        return calendar.get(1);
    }

    public static boolean I() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.k.jt, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        return calendar.get(11) == 0 && calendar.get(12) == 0;
    }

    public static boolean J(long j10, long j11) {
        Object[] objArr = {new Long(j10), new Long(j11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.kt, new Class[]{cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j10);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j11);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    private static boolean K(Calendar calendar, Calendar calendar2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{calendar, calendar2}, null, changeQuickRedirect, true, bb.c.k.wt, new Class[]{Calendar.class, Calendar.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    public static boolean L(long j10, long j11) {
        Object[] objArr = {new Long(j10), new Long(j11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.ft, new Class[]{cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j10);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j11);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2);
    }

    public static boolean M(long j10, long j11) {
        Object[] objArr = {new Long(j10), new Long(j11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.lt, new Class[]{cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return H(j11) == H(j10);
    }

    public static boolean N(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, null, changeQuickRedirect, true, bb.c.k.ht, new Class[]{Long.TYPE}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : DateUtils.isToday(j10);
    }

    public static boolean O(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, null, changeQuickRedirect, true, bb.c.k.gt, new Class[]{Long.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
        int i10 = calendar.get(1);
        int i11 = calendar.get(2);
        int i12 = calendar.get(5);
        calendar.setTimeInMillis(j10);
        return i10 == calendar.get(1) && i11 == calendar.get(2) && i12 == calendar.get(5);
    }

    public static long P(long j10) {
        return j10 / 1000;
    }

    public static Date Q(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.Gs, new Class[]{String.class}, Date.class);
        if (patchProxyResultProxy.isSupported) {
            return (Date) patchProxyResultProxy.result;
        }
        for (SimpleDateFormat simpleDateFormat : f73606m) {
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            try {
                return simpleDateFormat.parse(str);
            } catch (ParseException unused) {
            }
        }
        return null;
    }

    public static Date R(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.k.ut, new Class[]{String.class, String.class}, Date.class);
        if (patchProxyResultProxy.isSupported) {
            return (Date) patchProxyResultProxy.result;
        }
        if (str2 == null || str2.isEmpty()) {
            str2 = f73604k;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.CHINESE);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
        try {
            return simpleDateFormat.parse(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String S(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.k.tt, new Class[]{String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            return String.valueOf(new SimpleDateFormat(str2, Locale.CHINESE).parse(str).getTime() / 1000);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static long T(String str, long j10) {
        Date dateQ;
        Object[] objArr = {str, new Long(j10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Hs, new Class[]{String.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        return (TextUtils.isEmpty(str) || (dateQ = Q(str)) == null) ? j10 : dateQ.getTime();
    }

    public static long U(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.nt, new Class[]{String.class}, Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : n.r(str) * 1000;
    }

    public static long a(long j10) {
        Object[] objArr = {new Long(j10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.zt, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : Math.round(j10 / 1000.0d);
    }

    public static String b(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.yt, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        long jR = n.r(str);
        return String.format(Locale.getDefault(), "%02d:%02d", Integer.valueOf((int) (jR / 60)), Integer.valueOf((int) (jR % 60)));
    }

    public static long c(long j10, long j11) {
        Object[] objArr = {new Long(j10), new Long(j11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Rs, new Class[]{cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        if (j11 == 0) {
            return 0L;
        }
        return Math.round(j10 / j11);
    }

    public static String d(Context context, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, bb.c.k.et, new Class[]{Context.class, String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Date date = new Date(n.r(str) * 1000);
        Locale locale = context.getResources().getConfiguration().locale;
        return new SimpleDateFormat(DateFormat.getBestDateTimePattern(locale, str2), locale).format(Long.valueOf(date.getTime()));
    }

    public static String e(Context context, long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Long(j10)}, null, changeQuickRedirect, true, bb.c.k.Vs, new Class[]{Context.class, Long.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return j10 == 0 ? "" : new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(Long.valueOf(j10 * 1000).longValue()));
    }

    public static String f(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.k.Us, new Class[]{Context.class, String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : e(context, n.r(str));
    }

    public static String g(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.k.Ws, new Class[]{String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        long jR = n.r(str);
        return jR == 0 ? "" : new SimpleDateFormat(String.format("yyyy%sMM%sdd", str2, str2), Locale.getDefault()).format(new Date(jR * 1000));
    }

    public static String h(long j10, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10), str}, null, changeQuickRedirect, true, bb.c.k.dt, new Class[]{Long.TYPE, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            return new SimpleDateFormat(str, Locale.getDefault()).format(new Date(j10));
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String i(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.k.ct, new Class[]{String.class, String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : h(U(str), str2);
    }

    public static String[] j(Context context, long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Long(j10)}, null, changeQuickRedirect, true, bb.c.k.Qs, new Class[]{Context.class, Long.TYPE}, String[].class);
        if (patchProxyResultProxy.isSupported) {
            return (String[]) patchProxyResultProxy.result;
        }
        String[] strArr = {"", ""};
        if (j10 == 0) {
            return strArr;
        }
        Resources resources = context.getResources();
        if (j10 > 0) {
            if (j10 > 86400000) {
                strArr[0] = String.valueOf(c(j10, 86400000L));
                strArr[1] = resources.getString(R.string.day);
            } else if (j10 > 3600000) {
                strArr[0] = String.valueOf(c(j10, 3600000L));
                strArr[1] = resources.getString(R.string.hour);
            } else if (j10 > 60000) {
                strArr[0] = String.valueOf(c(j10, 60000L));
                strArr[1] = resources.getString(R.string.minute);
            } else if (j10 > 1000) {
                strArr[0] = String.valueOf(c(j10, 1000L));
                strArr[1] = resources.getString(R.string.second);
            }
        }
        return strArr;
    }

    public static String k(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, null, changeQuickRedirect, true, bb.c.k.pt, new Class[]{Long.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return l((j10 / 1000) + "");
    }

    public static String l(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.qt, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return !TextUtils.isEmpty(str) ? DateUtils.formatElapsedTime((long) n.p(str)) : "--:--";
    }

    public static String m(Context context, long j10, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Long(j10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.rt, new Class[]{Context.class, Long.TYPE, Boolean.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (j10 == 0) {
            return "";
        }
        Resources resources = context.getResources();
        long jCurrentTimeMillis = j10 - System.currentTimeMillis();
        Log.d("formatExpireTimeString", "span:" + jCurrentTimeMillis);
        if (jCurrentTimeMillis > 0) {
            if (jCurrentTimeMillis <= 86400000) {
                SimpleDateFormat simpleDateFormat = z10 ? new SimpleDateFormat("HH : mm : ss") : new SimpleDateFormat(d0.f136746g);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+0"));
                return simpleDateFormat.format(new Date(jCurrentTimeMillis));
            }
            String str = c(jCurrentTimeMillis, 86400000L) + resources.getString(R.string.day);
            if (str != null) {
                return str;
            }
        }
        return "已到期";
    }

    public static String n(Context context, long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Long(j10)}, null, changeQuickRedirect, true, bb.c.k.bt, new Class[]{Context.class, Long.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        TimeZone timeZone = TimeZone.getDefault();
        long j11 = j10 * 1000;
        long offset = (((long) timeZone.getOffset(j11)) + j11) / 86400000;
        long offset2 = (jCurrentTimeMillis + ((long) timeZone.getOffset(jCurrentTimeMillis))) / 86400000;
        if (offset == offset2) {
            return context.getString(R.string.today);
        }
        if (offset == offset2 - 1) {
            return context.getString(R.string.yesterday);
        }
        return offset == offset2 + 1 ? context.getString(R.string.tomorrow) : z(context, new Date(j11));
    }

    public static String o(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.k.at, new Class[]{Context.class, String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : n(context, n.r(str));
    }

    public static String p(Context context, long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Long(j10)}, null, changeQuickRedirect, true, bb.c.k.Ms, new Class[]{Context.class, Long.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (j10 == 0) {
            return "";
        }
        Resources resources = context.getResources();
        String string = resources.getString(R.string.just_now);
        long j11 = j10 * 1000;
        long jCurrentTimeMillis = System.currentTimeMillis() - j11;
        Long lValueOf = Long.valueOf(j11);
        if (jCurrentTimeMillis <= 0) {
            return string;
        }
        String str = null;
        if (jCurrentTimeMillis > 604800000) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(lValueOf.longValue()));
        }
        if (jCurrentTimeMillis > 86400000) {
            str = c(jCurrentTimeMillis, 86400000L) + resources.getString(R.string.day);
        } else if (jCurrentTimeMillis > 3600000) {
            str = c(jCurrentTimeMillis, 3600000L) + resources.getString(R.string.hour);
        } else if (jCurrentTimeMillis > 60000) {
            str = c(jCurrentTimeMillis, 60000L) + resources.getString(R.string.minute);
        } else if (jCurrentTimeMillis > 1000) {
            str = c(jCurrentTimeMillis, 1000L) + resources.getString(R.string.second);
        }
        return str != null ? String.format(resources.getString(R.string.relative_time_span), str) : string;
    }

    public static String q(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.k.Ls, new Class[]{Context.class, String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : p(context, n.r(str));
    }

    public static String[] r(Context context, long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Long(j10)}, null, changeQuickRedirect, true, bb.c.k.Ps, new Class[]{Context.class, Long.TYPE}, String[].class);
        if (patchProxyResultProxy.isSupported) {
            return (String[]) patchProxyResultProxy.result;
        }
        String[] strArr = {"", ""};
        if (j10 == 0) {
            return strArr;
        }
        Resources resources = context.getResources();
        long jCurrentTimeMillis = (j10 * 1000) - System.currentTimeMillis();
        if (jCurrentTimeMillis > 0) {
            if (jCurrentTimeMillis > 86400000) {
                strArr[0] = String.valueOf(c(jCurrentTimeMillis, 86400000L));
                strArr[1] = resources.getString(R.string.day);
            } else if (jCurrentTimeMillis > 3600000) {
                strArr[0] = String.valueOf(c(jCurrentTimeMillis, 3600000L));
                strArr[1] = resources.getString(R.string.hour);
            } else if (jCurrentTimeMillis > 60000) {
                strArr[0] = String.valueOf(c(jCurrentTimeMillis, 60000L));
                strArr[1] = resources.getString(R.string.minute);
            } else if (jCurrentTimeMillis > 1000) {
                strArr[0] = String.valueOf(c(jCurrentTimeMillis, 1000L));
                strArr[1] = resources.getString(R.string.second);
            }
        }
        return strArr;
    }

    public static String s(Context context, long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Long(j10)}, null, changeQuickRedirect, true, bb.c.k.Os, new Class[]{Context.class, Long.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (j10 == 0) {
            return "";
        }
        Resources resources = context.getResources();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = j10 * 1000;
        long j12 = jCurrentTimeMillis - j11;
        if (j12 < 0) {
            com.max.heybox.hblog.g.G("[formatRelativeTimeAndDateSpanString] error timestamp\ntimestamp: " + j11 + "\nnow: " + jCurrentTimeMillis + "\nspan: " + j12);
            return "";
        }
        long jG = Build.VERSION.SDK_INT >= 26 ? G() : F();
        if (j11 > jG || j12 <= 7200000) {
            if (j12 <= 60000) {
                return resources.getString(R.string.just_now);
            }
            if (j12 <= 3600000) {
                return c(j12, 60000L) + resources.getString(R.string.minute_before);
            }
            return c(j12, 3600000L) + resources.getString(R.string.hour_before);
        }
        if (j11 <= jG - 86400000) {
            if (j11 > jG - 172800000) {
                return resources.getString(R.string.two_days_before);
            }
            if (j11 > jG - 259200000) {
                return resources.getString(R.string.three_days_before);
            }
            return M(j11, jCurrentTimeMillis) ? h(j11, f73603j) : h(j11, "yyyy-MM-dd");
        }
        Date date = new Date(j11);
        return resources.getString(R.string.yesterday) + new SimpleDateFormat("HH:mm", Locale.getDefault()).format(date);
    }

    public static String t(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.k.Ns, new Class[]{Context.class, String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : s(context, n.r(str));
    }

    public static String u(Context context, long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Long(j10)}, null, changeQuickRedirect, true, bb.c.k.Js, new Class[]{Context.class, Long.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (j10 == 0) {
            return "";
        }
        Resources resources = context.getResources();
        String string = resources.getString(R.string.just_now);
        long jCurrentTimeMillis = System.currentTimeMillis() - (j10 * 1000);
        if (jCurrentTimeMillis <= 0) {
            return string;
        }
        String str = null;
        if (jCurrentTimeMillis > 31449600000L) {
            str = c(jCurrentTimeMillis, 31449600000L) + resources.getString(R.string.year);
        } else if (jCurrentTimeMillis > 2592000000L) {
            str = c(jCurrentTimeMillis, 2592000000L) + resources.getString(R.string.month_count);
        } else if (jCurrentTimeMillis > 86400000) {
            str = c(jCurrentTimeMillis, 86400000L) + resources.getString(R.string.day);
        } else if (jCurrentTimeMillis > 3600000) {
            str = c(jCurrentTimeMillis, 3600000L) + resources.getString(R.string.hour);
        } else if (jCurrentTimeMillis > 60000) {
            str = c(jCurrentTimeMillis, 60000L) + resources.getString(R.string.minute);
        } else if (jCurrentTimeMillis > 1000) {
            str = c(jCurrentTimeMillis, 1000L) + resources.getString(R.string.second);
        }
        return str != null ? String.format(resources.getString(R.string.relative_time_span), str) : string;
    }

    public static String v(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.k.Is, new Class[]{Context.class, String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : u(context, n.r(str));
    }

    public static String w(Context context, long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Long(j10)}, null, changeQuickRedirect, true, bb.c.k.Ks, new Class[]{Context.class, Long.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (j10 <= 0) {
            return "";
        }
        Resources resources = context.getResources();
        String string = resources.getString(R.string.just_now);
        long j11 = j10 * 1000;
        long jCurrentTimeMillis = System.currentTimeMillis() - j11;
        if (jCurrentTimeMillis <= 0) {
            return string;
        }
        String str = null;
        if (jCurrentTimeMillis > 604800000) {
            return h(j11, "yyyy-MM-dd");
        }
        if (jCurrentTimeMillis > 86400000) {
            str = c(jCurrentTimeMillis, 86400000L) + resources.getString(R.string.day);
        } else if (jCurrentTimeMillis > 3600000) {
            str = c(jCurrentTimeMillis, 3600000L) + resources.getString(R.string.hour);
        } else if (jCurrentTimeMillis > 60000) {
            str = c(jCurrentTimeMillis, 60000L) + resources.getString(R.string.minute);
        } else if (jCurrentTimeMillis > 1000) {
            str = c(jCurrentTimeMillis, 1000L) + resources.getString(R.string.second);
        }
        return str != null ? String.format(resources.getString(R.string.relative_time_span), str) : string;
    }

    public static String x(Context context, long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Long(j10)}, null, changeQuickRedirect, true, bb.c.k.Ys, new Class[]{Context.class, Long.TYPE}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : z(context, new Date(j10 * 1000));
    }

    public static String y(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.k.Xs, new Class[]{Context.class, String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : x(context, n.r(str));
    }

    public static String z(Context context, Date date) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, date}, null, changeQuickRedirect, true, bb.c.k.Zs, new Class[]{Context.class, Date.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : DateUtils.formatDateRange(context, new Formatter(new StringBuilder()), date.getTime(), date.getTime(), 524296, TimeZone.getDefault().getID()).toString();
    }
}
