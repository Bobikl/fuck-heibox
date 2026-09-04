package com.max.mediaselector.lib.config;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import org.apache.tools.ant.taskdefs.v7;

/* JADX INFO: compiled from: PictureMimeType.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static final String A = ".mp4";
    public static final String B = ".avi";
    public static final String C = "image/jpeg";
    public static final String D = "image/png";
    public static final String E = "video/mp4";
    public static final String F = "video/avi";
    public static final String G = "audio/amr";
    public static final String H = "audio/x-wav";
    public static final String I = "audio/mpeg";
    public static final String J = "DCIM/Camera";
    public static final String K = "Camera";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f75122a = "image/jpeg";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f75123b = "video/mp4";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f75124c = "audio/mpeg";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f75125d = "audio/amr";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f75126e = "image";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f75127f = "video";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f75128g = "audio";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f75129h = "image/png";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f75130i = "image/jpeg";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f75131j = "image/jpg";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f75132k = "image/bmp";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f75133l = "image/gif";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f75134m = "image/webp";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f75135n = "video/3gp";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f75136o = "video/mp4";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f75137p = "video/mpeg";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f75138q = "video/avi";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f75139r = ".jpeg";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f75140s = ".jpg";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f75141t = ".png";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f75142u = ".webp";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f75143v = ".gif";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f75144w = ".bmp";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f75145x = ".amr";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f75146y = ".wav";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f75147z = ".mp3";

    public static String A() {
        return "image/png";
    }

    public static String B() {
        return f75134m;
    }

    public static String a(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.Gl, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            return str.substring(str.lastIndexOf("/")).replace("/", ".");
        } catch (Exception e10) {
            e10.printStackTrace();
            return ".jpg";
        }
    }

    public static int b(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.Fl, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        if (str.startsWith("video")) {
            return 2;
        }
        return str.startsWith("audio") ? 3 : 1;
    }

    public static boolean c(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.Hl, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("content://");
    }

    public static boolean d(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.Il, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(v7.f135919a);
    }

    public static boolean e(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.yl, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return str != null && str.startsWith("audio");
    }

    public static boolean f(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.rl, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return str != null && (str.equals(f75133l) || str.equals("image/GIF"));
    }

    public static boolean g(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.Dl, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http") || str.startsWith("https");
    }

    public static boolean h(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.Al, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return str != null && str.startsWith("image");
    }

    public static boolean i(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.wl, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return str != null && str.startsWith("video");
    }

    public static boolean j(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.ul, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return str != null && str.equalsIgnoreCase(f75134m);
    }

    public static boolean k(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.Bl, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("image/jpeg") || str.startsWith(f75131j);
    }

    public static boolean l(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.Cl, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(f75131j);
    }

    public static boolean m(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.l.El, new Class[]{String.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return TextUtils.isEmpty(str) || b(str) == b(str2);
    }

    public static boolean n(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.zl, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return str.toLowerCase().endsWith(".amr") || str.toLowerCase().endsWith(f75147z);
    }

    public static boolean o(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.sl, new Class[]{String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : str.toLowerCase().endsWith(f75143v);
    }

    public static boolean p(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.tl, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return str.toLowerCase().endsWith(".jpg") || str.toLowerCase().endsWith(f75139r) || str.toLowerCase().endsWith(f75141t);
    }

    public static boolean q(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.xl, new Class[]{String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : str.toLowerCase().endsWith(".mp4");
    }

    public static boolean r(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.vl, new Class[]{String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : str.toLowerCase().endsWith(f75142u);
    }

    public static boolean s(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.Jl, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return d(str) || c(str) || g(str);
    }

    public static String t() {
        return f75135n;
    }

    public static String u() {
        return "video/avi";
    }

    public static String v() {
        return f75132k;
    }

    public static String w() {
        return f75133l;
    }

    public static String x() {
        return "image/jpeg";
    }

    public static String y() {
        return "video/mp4";
    }

    public static String z() {
        return "video/mpeg";
    }
}
