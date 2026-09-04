package com.max.hbapkinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: XapkInstallUtils.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f65810a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private static LoadingDialog f65811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f65812c;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private static f f65813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private static com.max.hbapkinstaller.a f65814e;

    /* JADX INFO: compiled from: XapkInstallUtils.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public static /* synthetic */ void g(a aVar, XApkFile xApkFile, boolean z10, Context context, String str, int i10, Object obj) {
            if (PatchProxy.proxy(new Object[]{aVar, xApkFile, new Byte(z10 ? (byte) 1 : (byte) 0), context, str, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.b.Un, new Class[]{a.class, XApkFile.class, Boolean.TYPE, Context.class, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            aVar.f(xApkFile, (i10 & 2) == 0 ? z10 ? 1 : 0 : false, context, str);
        }

        private final void m(XApkFile xApkFile, Context context, String str) {
            if (PatchProxy.proxy(new Object[]{xApkFile, context, str}, this, changeQuickRedirect, false, bb.c.b.Wn, new Class[]{XApkFile.class, Context.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            if (xApkFile.h() == XApkFile.Companion.TYPE.XAPK) {
                l(new f(xApkFile, context, str));
                f fVarD = d();
                if (fVarD != null) {
                    fVarD.execute(new String[0]);
                    return;
                }
                return;
            }
            if (xApkFile.h() == XApkFile.Companion.TYPE.APK) {
                g gVar = g.f65809a;
                String string = xApkFile.b().toString();
                f0.o(string, "toString(...)");
                gVar.c(string, true, context, str);
                return;
            }
            LoadingDialog loadingDialog = d.f65795a;
            if (loadingDialog != null && loadingDialog.i()) {
                d.f65795a.c();
            }
            com.max.hbutils.utils.c.f(context.getString(R.string.hbapkinstaller_unknown_xapk_file));
        }

        @dl.e
        public final com.max.hbapkinstaller.a a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Qn, new Class[0], com.max.hbapkinstaller.a.class);
            return patchProxyResultProxy.isSupported ? (com.max.hbapkinstaller.a) patchProxyResultProxy.result : h.f65814e;
        }

        @dl.e
        public final LoadingDialog b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Kn, new Class[0], LoadingDialog.class);
            return patchProxyResultProxy.isSupported ? (LoadingDialog) patchProxyResultProxy.result : h.f65811b;
        }

        @dl.e
        public final String c(@dl.e String str) {
            int iF3;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.Vn, new Class[]{String.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            if (str == null || str.length() <= 0 || (iF3 = StringsKt__StringsKt.F3(str, lg.a.f131414g, 0, false, 6, null)) <= -1 || iF3 >= str.length()) {
                return str;
            }
            String strSubstring = str.substring(0, iF3);
            f0.o(strSubstring, "substring(...)");
            return strSubstring;
        }

        @dl.e
        public final f d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.On, new Class[0], f.class);
            return patchProxyResultProxy.isSupported ? (f) patchProxyResultProxy.result : h.f65813d;
        }

        public final boolean e() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Mn, new Class[0], Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : h.f65812c;
        }

        public final void f(@dl.d XApkFile xApkFile, boolean z10, @dl.d Context context, @dl.d String baseDirStr) {
            if (PatchProxy.proxy(new Object[]{xApkFile, new Byte(z10 ? (byte) 1 : (byte) 0), context, baseDirStr}, this, changeQuickRedirect, false, bb.c.b.Tn, new Class[]{XApkFile.class, Boolean.TYPE, Context.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(xApkFile, "xApkFile");
            f0.p(context, "context");
            f0.p(baseDirStr, "baseDirStr");
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < xApkFile.e() && !z10) {
                f(xApkFile, true, context, baseDirStr);
                return;
            }
            if (i10 >= 30) {
                m(xApkFile, context, baseDirStr);
                return;
            }
            if (Environment.getExternalStorageDirectory().getFreeSpace() > xApkFile.b().length()) {
                m(xApkFile, context, baseDirStr);
                return;
            }
            LoadingDialog loadingDialog = d.f65795a;
            if (loadingDialog != null && loadingDialog.i()) {
                d.f65795a.c();
            }
            com.max.hbutils.utils.c.f("设备剩余空间不足请先清理！");
        }

        public final void h(@dl.d File file, @dl.d Context context, @dl.d String baseDirStr) {
            if (PatchProxy.proxy(new Object[]{file, context, baseDirStr}, this, changeQuickRedirect, false, bb.c.b.Sn, new Class[]{File.class, Context.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(file, "file");
            f0.p(context, "context");
            f0.p(baseDirStr, "baseDirStr");
            i(new com.max.hbapkinstaller.a(file, context, baseDirStr));
            com.max.hbapkinstaller.a aVarA = a();
            if (aVarA != null) {
                aVarA.execute(new String[0]);
            }
        }

        public final void i(@dl.e com.max.hbapkinstaller.a aVar) {
            if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.b.Rn, new Class[]{com.max.hbapkinstaller.a.class}, Void.TYPE).isSupported) {
                return;
            }
            h.f65814e = aVar;
        }

        public final void j(@dl.e LoadingDialog loadingDialog) {
            if (PatchProxy.proxy(new Object[]{loadingDialog}, this, changeQuickRedirect, false, bb.c.b.Ln, new Class[]{LoadingDialog.class}, Void.TYPE).isSupported) {
                return;
            }
            h.f65811b = loadingDialog;
        }

        public final void k(boolean z10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.b.Nn, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            h.f65812c = z10;
        }

        public final void l(@dl.e f fVar) {
            if (PatchProxy.proxy(new Object[]{fVar}, this, changeQuickRedirect, false, bb.c.b.Pn, new Class[]{f.class}, Void.TYPE).isSupported) {
                return;
            }
            h.f65813d = fVar;
        }
    }
}
