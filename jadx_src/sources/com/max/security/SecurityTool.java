package com.max.security;

import android.content.Context;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.ZipFile;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: SecurityTool.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SecurityTool {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final a f75742a = new a(null);
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: SecurityTool.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @d
        @m
        public final String a(@d Context appContext) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{appContext}, this, changeQuickRedirect, false, c.m.Sg, new Class[]{Context.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            f0.p(appContext, "appContext");
            try {
                return o(String.valueOf(new ZipFile(appContext.getPackageCodePath()).getEntry(Constants.CLASSES_DEX_NAME).getCrc()));
            } catch (Exception e10) {
                e10.printStackTrace();
                return "";
            }
        }

        @d
        @m
        public final String b(@e Context context, @d String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, c.m.f34660ch, new Class[]{Context.class, String.class}, String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : SecurityTool.getVA(context, str);
        }

        @m
        public final int c(int i10) {
            Object[] objArr = {new Integer(i10)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.m.f34684dh, new Class[]{cls}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : SecurityTool.getVB(i10);
        }

        @d
        @m
        public final String d(@e Context context, @d String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, c.m.f34707eh, new Class[]{Context.class, String.class}, String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : SecurityTool.getVC(context, str);
        }

        @d
        @m
        public final String e(@e Context context, @d String str, @d String str2, @d String str3) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3}, this, changeQuickRedirect, false, c.m.f34730fh, new Class[]{Context.class, String.class, String.class, String.class}, String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : SecurityTool.getVD(context, str, str2, str3);
        }

        @d
        @m
        public final String f(@e Context context, @d String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, c.m.f34637bh, new Class[]{Context.class, String.class}, String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : SecurityTool.getVX(context, str);
        }

        @m
        public final void g() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34753gh, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            SecurityTool.resetVA();
        }

        @m
        public final void h(@d String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.m.Ug, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            SecurityTool.setKA(str);
        }

        @m
        public final void i(@d String str, @d String str2) {
            if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, c.m.Vg, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            SecurityTool.setKB(str, str2);
        }

        @m
        public final void j(@d String str, @d String str2) {
            if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, c.m.f34614ah, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            SecurityTool.setKC(str, str2);
        }

        @m
        public final void k(@d String str, @d String str2) {
            if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, c.m.Zg, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            SecurityTool.setKD(str, str2);
        }

        @m
        public final void l(@d String str, @d String str2) {
            if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, c.m.Wg, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            SecurityTool.setKM(str, str2);
        }

        @m
        public final void m(@d String str, @d String str2) {
            if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, c.m.Yg, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            SecurityTool.setKN(str, str2);
        }

        @m
        public final void n(@d String str, @d String str2) {
            if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, c.m.Xg, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            SecurityTool.setKT(str, str2);
        }

        @d
        @m
        public final String o(@d String input) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{input}, this, changeQuickRedirect, false, c.m.Tg, new Class[]{String.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            f0.p(input, "input");
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] bytes = input.getBytes(kotlin.text.d.f128566b);
                f0.o(bytes, "getBytes(...)");
                byte[] bArrDigest = messageDigest.digest(bytes);
                StringBuilder sb2 = new StringBuilder(bArrDigest.length * 2);
                f0.m(bArrDigest);
                for (byte b10 : bArrDigest) {
                    int i10 = b10 & 255;
                    if (i10 < 16) {
                        sb2.append("0");
                    }
                    sb2.append(Integer.toHexString(i10));
                }
                String string = sb2.toString();
                f0.o(string, "toString(...)");
                return string;
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
                return "";
            } catch (NoSuchAlgorithmException e11) {
                e11.printStackTrace();
                return "";
            }
        }
    }

    static {
        System.loadLibrary("hbsecurity");
    }

    @d
    @m
    public static final String a(@d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, c.m.Qg, new Class[]{Context.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f75742a.a(context);
    }

    @d
    @m
    public static final String b(@d String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.m.Rg, new Class[]{String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f75742a.o(str);
    }

    @d
    @m
    public static final native String getVA(@e Context context, @d String str);

    @m
    public static final native int getVB(int i10);

    @d
    @m
    public static final native String getVC(@e Context context, @d String str);

    @d
    @m
    public static final native String getVD(@e Context context, @d String str, @d String str2, @d String str3);

    @d
    @m
    public static final native String getVX(@e Context context, @d String str);

    @m
    public static final native void resetVA();

    @m
    public static final native void setKA(@d String str);

    @m
    public static final native void setKB(@d String str, @d String str2);

    @m
    public static final native void setKC(@d String str, @d String str2);

    @m
    public static final native void setKD(@d String str, @d String str2);

    @m
    public static final native void setKM(@d String str, @d String str2);

    @m
    public static final native void setKN(@d String str, @d String str2);

    @m
    public static final native void setKT(@d String str, @d String str2);
}
