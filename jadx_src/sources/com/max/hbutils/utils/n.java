package com.max.hbutils.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: NumberUtils.java */
/* JADX INFO: loaded from: classes13.dex */
public class n {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static double a(double d10, double d11) {
        Object[] objArr = {new Double(d10), new Double(d11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Double.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Dp, new Class[]{cls, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Double) patchProxyResultProxy.result).doubleValue() : new BigDecimal(d10).add(new BigDecimal(d11)).doubleValue();
    }

    public static long b(long j10, long j11) {
        Object[] objArr = {new Long(j10), new Long(j11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Cp, new Class[]{cls, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : new BigDecimal(j10).add(new BigDecimal(j11)).longValue();
    }

    public static double c(double d10, double d11) {
        Object[] objArr = {new Double(d10), new Double(d11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Double.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Jp, new Class[]{cls, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Double) patchProxyResultProxy.result).doubleValue() : new BigDecimal(d10).divide(new BigDecimal(d11), 0).doubleValue();
    }

    public static long d(long j10, long j11) {
        Object[] objArr = {new Long(j10), new Long(j11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Ip, new Class[]{cls, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : new BigDecimal(j10).divide(new BigDecimal(j11), 0).longValue();
    }

    public static String e(String str, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Bp, new Class[]{String.class, Integer.TYPE}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : new BigDecimal(str).setScale(i10, RoundingMode.HALF_UP).stripTrailingZeros().toString();
    }

    public static DecimalFormat f(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.Sp, new Class[]{String.class}, DecimalFormat.class);
        if (patchProxyResultProxy.isSupported) {
            return (DecimalFormat) patchProxyResultProxy.result;
        }
        DecimalFormat decimalFormat = new DecimalFormat(str);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator(lg.a.f131414g);
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        return decimalFormat;
    }

    public static String g(float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.Np, new Class[]{Float.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (f10 < 10000.0f) {
            NumberFormat numberFormat = NumberFormat.getInstance(Locale.getDefault());
            numberFormat.setMinimumFractionDigits(0);
            numberFormat.setMaximumFractionDigits(1);
            numberFormat.setGroupingUsed(false);
            return numberFormat.format(f10);
        }
        String str = new DecimalFormat("###E00").format(f10);
        int numericValue = Character.getNumericValue(str.charAt(str.length() - 1));
        String strReplaceAll = str.replaceAll("E[0-9][0-9]", new String[]{"", "k", "m", "b", "t"}[Integer.valueOf(Character.getNumericValue(str.charAt(str.length() - 2)) + "" + numericValue).intValue() / 3]);
        while (true) {
            if (strReplaceAll.length() <= 5 && !strReplaceAll.matches("[0-9]+\\.[a-z]")) {
                return strReplaceAll;
            }
            strReplaceAll = strReplaceAll.substring(0, strReplaceAll.length() - 2) + strReplaceAll.substring(strReplaceAll.length() - 1);
        }
    }

    public static int h(List list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, null, changeQuickRedirect, true, bb.c.k.Kp, new Class[]{List.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public static String i(float f10, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Mp, new Class[]{Float.TYPE, Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMaximumFractionDigits(i10);
        return percentInstance.format(f10);
    }

    public static String j(String str, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Lp, new Class[]{String.class, Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            return String.format(Locale.US, "%s%%", new BigDecimal(str).multiply(new BigDecimal("100")).setScale(i10, 0).toString());
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static double k(double d10, double d11) {
        Object[] objArr = {new Double(d10), new Double(d11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Double.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Hp, new Class[]{cls, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Double) patchProxyResultProxy.result).doubleValue() : new BigDecimal(d10).multiply(new BigDecimal(d11)).doubleValue();
    }

    public static long l(long j10, long j11) {
        Object[] objArr = {new Long(j10), new Long(j11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Gp, new Class[]{cls, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : new BigDecimal(j10).multiply(new BigDecimal(j11)).longValue();
    }

    public static String m(Number number) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{number}, null, changeQuickRedirect, true, bb.c.k.Qp, new Class[]{Number.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f("##0.0").format(number);
    }

    public static String n(Number number) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{number}, null, changeQuickRedirect, true, bb.c.k.Rp, new Class[]{Number.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f("##0.00").format(number);
    }

    public static double o(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.xp, new Class[]{String.class}, Double.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Double) patchProxyResultProxy.result).doubleValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return 0.0d;
            }
            return Double.parseDouble(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0.0d;
        }
    }

    public static float p(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.yp, new Class[]{String.class}, Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return 0.0f;
            }
            return Float.parseFloat(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0.0f;
        }
    }

    public static int q(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.Ap, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            if (str.indexOf(".") > 0) {
                str = str.substring(0, str.indexOf("."));
            }
            return Integer.parseInt(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static long r(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.zp, new Class[]{String.class}, Long.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return 0L;
            }
            if (str.indexOf(".") > 0) {
                str = str.substring(0, str.indexOf("."));
            }
            return Long.parseLong(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    public static float s(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.Op, new Class[]{String.class}, Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : Float.parseFloat(f("##0.0").format(Float.parseFloat(str.trim())));
    }

    public static float t(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.Pp, new Class[]{String.class}, Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : Float.parseFloat(f("##0.00").format(Float.parseFloat(str.trim())));
    }

    public static double u(double d10, double d11) {
        Object[] objArr = {new Double(d10), new Double(d11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Double.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Fp, new Class[]{cls, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Double) patchProxyResultProxy.result).doubleValue() : new BigDecimal(String.valueOf(d10)).subtract(new BigDecimal(String.valueOf(d11))).doubleValue();
    }

    public static long v(long j10, long j11) {
        Object[] objArr = {new Long(j10), new Long(j11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Ep, new Class[]{cls, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : new BigDecimal(j10).subtract(new BigDecimal(j11)).longValue();
    }
}
