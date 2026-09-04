package com.max.xiaoheihe.accelworld;

import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: AccelWorldJsBridge.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class j {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: AccelWorldJsBridge.kt */
    public static final class a implements com.max.xiaoheihe.module.webview.t.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f76759a = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.xiaoheihe.module.webview.t.b
        public final void a(@dl.d JsonObject it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, bb.c.m.ew, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
        }
    }

    /* JADX INFO: compiled from: AccelWorldJsBridge.kt */
    public static final class b implements com.max.xiaoheihe.module.webview.t.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f76760a = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.xiaoheihe.module.webview.t.b
        public final void a(@dl.d JsonObject it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, bb.c.m.fw, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
        }
    }

    /* JADX INFO: compiled from: AccelWorldJsBridge.kt */
    public static final class c implements com.max.xiaoheihe.module.webview.t.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f76761a;

        c(String str) {
            this.f76761a = str;
        }

        @Override // com.max.xiaoheihe.module.webview.t.b
        public final void a(@dl.d JsonObject it) {
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, bb.c.m.gw, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            String str = this.f76761a;
            if (str != null && !kotlin.text.u.V1(str)) {
                z10 = false;
            }
            if (z10) {
                return;
            }
            it.addProperty("data", this.f76761a);
        }
    }

    /* JADX INFO: compiled from: AccelWorldJsBridge.kt */
    public static final class d implements com.max.xiaoheihe.module.webview.t.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f76762a;

        d(String str) {
            this.f76762a = str;
        }

        @Override // com.max.xiaoheihe.module.webview.t.b
        public final void a(@dl.d JsonObject it) {
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, bb.c.m.hw, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            String str = this.f76762a;
            if (str != null && !kotlin.text.u.V1(str)) {
                z10 = false;
            }
            if (z10) {
                return;
            }
            it.addProperty("data", this.f76762a);
        }
    }

    @dl.e
    public static final String a(@dl.e String str, @dl.e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.m.bw, new Class[]{String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null || kotlin.text.u.V1(str)) {
            return null;
        }
        String strH = h(str);
        if (strH == null || kotlin.text.u.V1(strH)) {
            return null;
        }
        String strG = g(str);
        if (!(strG == null || kotlin.text.u.V1(strG))) {
            str2 = strG;
        } else if (str2 == null) {
            str2 = "";
        }
        return strH + '(' + str2 + ')';
    }

    public static final void b(@dl.e String str, @dl.e com.max.xiaoheihe.module.webview.t tVar, @dl.e com.max.xiaoheihe.module.webview.t.b bVar, @dl.e com.max.xiaoheihe.module.webview.t.a aVar, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, tVar, bVar, aVar, str2}, null, changeQuickRedirect, true, bb.c.m.aw, new Class[]{String.class, com.max.xiaoheihe.module.webview.t.class, com.max.xiaoheihe.module.webview.t.b.class, com.max.xiaoheihe.module.webview.t.a.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (bVar == null) {
            bVar = b.f76760a;
        }
        if (d(str, tVar, bVar, str2) || aVar == null) {
            return;
        }
        aVar.a();
    }

    public static final void c(@dl.e String str, @dl.e com.max.xiaoheihe.module.webview.t tVar, @dl.e String str2, @dl.e com.max.xiaoheihe.module.webview.t.a aVar, @dl.e String str3) {
        if (PatchProxy.proxy(new Object[]{str, tVar, str2, aVar, str3}, null, changeQuickRedirect, true, bb.c.m.Zv, new Class[]{String.class, com.max.xiaoheihe.module.webview.t.class, String.class, com.max.xiaoheihe.module.webview.t.a.class, String.class}, Void.TYPE).isSupported || d(str, tVar, new c(str2), str3) || aVar == null) {
            return;
        }
        aVar.a();
    }

    public static final boolean d(@dl.e String str, @dl.e com.max.xiaoheihe.module.webview.t tVar, @dl.e com.max.xiaoheihe.module.webview.t.b bVar, @dl.e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, tVar, bVar, str2}, null, changeQuickRedirect, true, bb.c.m.Yv, new Class[]{String.class, com.max.xiaoheihe.module.webview.t.class, com.max.xiaoheihe.module.webview.t.b.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        String strH = h(str);
        if (strH == null) {
            return false;
        }
        if (bVar == null) {
            bVar = a.f76759a;
        }
        if (tVar != null) {
            return tVar.t0(strH, str2, bVar);
        }
        return false;
    }

    public static final void e(@dl.e String str, @dl.e com.max.xiaoheihe.module.webview.t tVar, @dl.e com.max.xiaoheihe.module.webview.t.b bVar, @dl.e com.max.xiaoheihe.module.webview.t.a aVar, @dl.e String str2) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{str, tVar, bVar, aVar, str2}, null, changeQuickRedirect, true, bb.c.m.Xv, new Class[]{String.class, com.max.xiaoheihe.module.webview.t.class, com.max.xiaoheihe.module.webview.t.b.class, com.max.xiaoheihe.module.webview.t.a.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (str != null && !kotlin.text.u.V1(str)) {
            z10 = false;
        }
        if (z10) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        boolean zT0 = tVar != null ? tVar.t0(str, str2, bVar) : false;
        com.max.heybox.hblog.g.f74531b.M("fastDoJsFunc  " + str + "  hasDone: " + zT0 + ' ');
        if (zT0 || aVar == null) {
            return;
        }
        aVar.a();
    }

    public static final void f(@dl.e String str, @dl.e com.max.xiaoheihe.module.webview.t tVar, @dl.e String str2, @dl.e com.max.xiaoheihe.module.webview.t.a aVar, @dl.e String str3) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{str, tVar, str2, aVar, str3}, null, changeQuickRedirect, true, bb.c.m.Wv, new Class[]{String.class, com.max.xiaoheihe.module.webview.t.class, String.class, com.max.xiaoheihe.module.webview.t.a.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (str != null && !kotlin.text.u.V1(str)) {
            z10 = false;
        }
        if (z10) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        boolean zT0 = tVar != null ? tVar.t0(str, str3, new d(str2)) : false;
        com.max.heybox.hblog.g.f74531b.M("fastDoJsFunc  " + str + "  hasDone: " + zT0 + ' ');
        if (zT0 || aVar == null) {
            return;
        }
        aVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    @dl.e
    public static final String g(@dl.e String str) {
        boolean z10;
        int iR3;
        int i10;
        int iR4;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.dw, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null) {
            if (z10) {
                return null;
            }
            String strSubstring = str.substring(i10, iR4);
            f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }
        try {
            z10 = kotlin.text.u.V1(str);
            if (z10 && (iR3 = StringsKt__StringsKt.r3(str, '(', 0, false, 6, null)) != -1 && (i10 = iR3 + 1) < str.length() && (iR4 = StringsKt__StringsKt.r3(str, ')', i10, false, 4, null)) != -1) {
                String strSubstring2 = str.substring(i10, iR4);
                f0.o(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring2;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @dl.e
    public static final String h(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.cw, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null) {
            return null;
        }
        return !StringsKt__StringsKt.W2(str, "(", false, 2, null) ? str : StringsKt__StringsKt.y5(str, "(", null, 2, null);
    }
}
