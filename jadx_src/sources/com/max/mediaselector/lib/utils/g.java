package com.max.mediaselector.lib.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import com.max.hbutils.utils.w;
import com.max.mediaselector.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: DateUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"SimpleDateFormat"})
    private static final SimpleDateFormat f75540a = new SimpleDateFormat("yyyyMMddHHmmssSSS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"SimpleDateFormat"})
    private static final SimpleDateFormat f75541b = new SimpleDateFormat("yyyy-MM");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SuppressLint({"SimpleDateFormat"})
    private static final SimpleDateFormat f75542c = new SimpleDateFormat(w.f73604k);
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String a(long j10, long j11) {
        Object[] objArr = {new Long(j10), new Long(j11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f34859l8, new Class[]{cls, cls}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        long j12 = j11 - j10;
        if (j12 > 1000) {
            return (j12 / 1000) + "秒";
        }
        return j12 + "毫秒";
    }

    public static int b(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, null, changeQuickRedirect, true, bb.c.m.f34767h8, new Class[]{Long.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        try {
            return (int) Math.abs(f() - j10);
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    public static String c(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, null, changeQuickRedirect, true, bb.c.m.f34790i8, new Class[]{Long.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (j10 == com.google.android.exoplayer2.j.f46377b) {
            j10 = 0;
        }
        String str = j10 < 0 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "";
        long jAbs = (Math.abs(j10) + 500) / 1000;
        long j11 = jAbs % 60;
        long j12 = (jAbs / 60) % 60;
        long j13 = jAbs / 3600;
        return j13 > 0 ? String.format(Locale.getDefault(), "%s%d:%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)) : String.format(Locale.getDefault(), "%s%02d:%02d", str, Long.valueOf(j12), Long.valueOf(j11));
    }

    public static String d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.f34836k8, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return f75540a.format(Long.valueOf(System.currentTimeMillis()));
    }

    public static String e(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.f34813j8, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return str + f75540a.format(Long.valueOf(System.currentTimeMillis()));
    }

    public static long f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.f34628b8, new Class[0], Long.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        String strL = u.l(Long.valueOf(System.currentTimeMillis()));
        if (strL.length() > 10) {
            strL = strL.substring(0, 10);
        }
        return u.j(strL);
    }

    public static String g(Context context, long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Long(j10)}, null, changeQuickRedirect, true, bb.c.m.f34651c8, new Class[]{Context.class, Long.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (String.valueOf(j10).length() <= 10) {
            j10 *= 1000;
        }
        if (j(j10)) {
            return context.getString(R.string.ps_current_week);
        }
        return i(j10) ? context.getString(R.string.ps_current_month) : f75541b.format(Long.valueOf(j10));
    }

    public static String h(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, null, changeQuickRedirect, true, bb.c.m.f34675d8, new Class[]{Long.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (String.valueOf(j10).length() <= 10) {
            j10 *= 1000;
        }
        return f75542c.format(Long.valueOf(j10));
    }

    public static boolean i(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, null, changeQuickRedirect, true, bb.c.m.f34721f8, new Class[]{Long.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Date date = new Date(j10);
        SimpleDateFormat simpleDateFormat = f75541b;
        return simpleDateFormat.format(date).equals(simpleDateFormat.format(new Date()));
    }

    private static boolean j(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, null, changeQuickRedirect, true, bb.c.m.f34698e8, new Class[]{Long.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Calendar calendar = Calendar.getInstance();
        int i10 = calendar.get(3);
        calendar.setTime(new Date(j10));
        return calendar.get(3) == i10;
    }

    public static long k(long j10) {
        Object[] objArr = {new Long(j10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f34744g8, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : ((Math.abs(j10) + 500) / 1000) * 1000;
    }
}
