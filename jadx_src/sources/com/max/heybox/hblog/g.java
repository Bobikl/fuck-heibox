package com.max.heybox.hblog;

import android.content.Context;
import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.IOException;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: HBLogger.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f74531b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f74532c;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private static g f74533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private static g f74534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private static g f74535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private static g f74536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private static g f74537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private static g f74538i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final com.elvishew.xlog.f f74539a;

    /* JADX INFO: compiled from: HBLogger.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @m
        public static /* synthetic */ void A() {
        }

        @m
        public static /* synthetic */ void C() {
        }

        @m
        public static /* synthetic */ void E() {
        }

        @m
        public static /* synthetic */ void G() {
        }

        @m
        public static /* synthetic */ void I() {
        }

        @m
        public static /* synthetic */ void K() {
        }

        @m
        private final String Q(Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.l.P8, new Class[]{Context.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getCacheDir().getAbsolutePath());
            f fVar = f.f74508a;
            sb2.append(fVar.e());
            File file = new File(sb2.toString());
            try {
                if (file.exists() && file.isDirectory()) {
                    FilesKt__UtilsKt.V(file);
                }
                file.mkdir();
                File file2 = new File(context.getCacheDir().getAbsolutePath() + fVar.e() + File.separator + System.currentTimeMillis() + DynamicSoManager.f77249d);
                file2.createNewFile();
                return file2.getPath();
            } catch (IOException e10) {
                e10.printStackTrace();
                return null;
            }
        }

        public static final /* synthetic */ void a(a aVar, Context context, boolean z10) {
            if (PatchProxy.proxy(new Object[]{aVar, context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.f34408r9, new Class[]{a.class, Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            aVar.j(context, z10);
        }

        public static final /* synthetic */ void b(a aVar, Context context, boolean z10) {
            if (PatchProxy.proxy(new Object[]{aVar, context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.f34340o9, new Class[]{a.class, Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            aVar.k(context, z10);
        }

        public static final /* synthetic */ void c(a aVar, Context context, boolean z10) {
            if (PatchProxy.proxy(new Object[]{aVar, context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.f34452t9, new Class[]{a.class, Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            aVar.l(context, z10);
        }

        public static final /* synthetic */ void d(a aVar, Context context, boolean z10) {
            if (PatchProxy.proxy(new Object[]{aVar, context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.f34363p9, new Class[]{a.class, Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            aVar.m(context, z10);
        }

        public static final /* synthetic */ void e(a aVar, Context context, boolean z10) {
            if (PatchProxy.proxy(new Object[]{aVar, context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.f34430s9, new Class[]{a.class, Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            aVar.n(context, z10);
        }

        public static final /* synthetic */ void f(a aVar, Context context, boolean z10) {
            if (PatchProxy.proxy(new Object[]{aVar, context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.f34386q9, new Class[]{a.class, Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            aVar.o(context, z10);
        }

        public static final /* synthetic */ String g(a aVar, Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, context}, null, changeQuickRedirect, true, bb.c.l.f34474u9, new Class[]{a.class, Context.class}, String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : aVar.Q(context);
        }

        @m
        private final void j(Context context, boolean z10) {
            g gVar;
            if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.M8, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.elvishew.xlog.printer.a aVar = new com.elvishew.xlog.printer.a(true);
            com.elvishew.xlog.printer.file.a aVarB = new com.elvishew.xlog.printer.file.a.b(context.getCacheDir().getAbsolutePath() + f.f74508a.c()).a(new b8.d(5242880L, 6)).c(new c8.b(f.f74520m)).f(new com.elvishew.xlog.flattener.a()).b();
            f0.o(aVarB, "build(...)");
            u uVar = null;
            if (z10) {
                com.elvishew.xlog.f fVarX = com.elvishew.xlog.h.Z(f.f74513f).f0(aVar, aVarB).O().x();
                f0.o(fVarX, "build(...)");
                gVar = new g(fVarX, uVar);
            } else {
                com.elvishew.xlog.f fVarX2 = com.elvishew.xlog.h.Z(f.f74513f).f0(aVarB).O().x();
                f0.o(fVarX2, "build(...)");
                gVar = new g(fVarX2, uVar);
            }
            g.f74536g = gVar;
        }

        @m
        private final void k(Context context, boolean z10) {
            g gVar;
            if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.J8, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.elvishew.xlog.printer.a aVar = new com.elvishew.xlog.printer.a(false);
            com.elvishew.xlog.printer.file.a aVarB = new com.elvishew.xlog.printer.file.a.b(context.getCacheDir().getAbsolutePath() + f.f74508a.d()).d(new com.elvishew.xlog.printer.file.naming.a("log")).a(new b8.d(f.f74517j, 3)).c(new c8.b(f.f74520m)).f(new com.elvishew.xlog.flattener.a()).b();
            f0.o(aVarB, "build(...)");
            u uVar = null;
            if (z10) {
                com.elvishew.xlog.f fVarX = com.elvishew.xlog.h.Z(f.f74511d).f0(aVar, aVarB).E().x();
                f0.o(fVarX, "build(...)");
                gVar = new g(fVarX, uVar);
            } else {
                com.elvishew.xlog.f fVarX2 = com.elvishew.xlog.h.Z(f.f74511d).f0(aVarB).E().D().x();
                f0.o(fVarX2, "build(...)");
                gVar = new g(fVarX2, uVar);
            }
            g.f74533d = gVar;
        }

        @m
        private final void l(Context context, boolean z10) {
            g gVar;
            if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.O8, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.elvishew.xlog.printer.a aVar = new com.elvishew.xlog.printer.a(true);
            com.elvishew.xlog.printer.file.a aVarB = new com.elvishew.xlog.printer.file.a.b(context.getCacheDir().getAbsolutePath() + f.f74508a.i()).a(new b8.d(5242880L, 6)).c(new c8.b(f.f74520m)).f(new com.elvishew.xlog.flattener.a()).b();
            f0.o(aVarB, "build(...)");
            u uVar = null;
            if (z10) {
                com.elvishew.xlog.f fVarX = com.elvishew.xlog.h.Z(f.f74515h).f0(aVar, aVarB).E().D().x();
                f0.o(fVarX, "build(...)");
                gVar = new g(fVarX, uVar);
            } else {
                com.elvishew.xlog.f fVarX2 = com.elvishew.xlog.h.Z(f.f74515h).f0(aVarB).M(5).D().x();
                f0.o(fVarX2, "build(...)");
                gVar = new g(fVarX2, uVar);
            }
            g.f74538i = gVar;
        }

        @m
        private final void m(Context context, boolean z10) {
            g gVar;
            if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.K8, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.elvishew.xlog.printer.a aVar = new com.elvishew.xlog.printer.a(true);
            com.elvishew.xlog.printer.file.a aVarB = new com.elvishew.xlog.printer.file.a.b(context.getCacheDir().getAbsolutePath() + f.f74508a.f()).a(new b8.d(5242880L, 6)).c(new c8.b(f.f74520m)).f(new com.elvishew.xlog.flattener.a()).b();
            f0.o(aVarB, "build(...)");
            u uVar = null;
            if (z10) {
                com.elvishew.xlog.f fVarX = com.elvishew.xlog.h.Z(f.f74510c).f0(aVar, aVarB).E().x();
                f0.o(fVarX, "build(...)");
                gVar = new g(fVarX, uVar);
            } else {
                com.elvishew.xlog.f fVarX2 = com.elvishew.xlog.h.Z(f.f74510c).f0(aVarB).E().x();
                f0.o(fVarX2, "build(...)");
                gVar = new g(fVarX2, uVar);
            }
            g.f74534e = gVar;
        }

        @m
        private final void n(Context context, boolean z10) {
            g gVar;
            if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.N8, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.elvishew.xlog.printer.a aVar = new com.elvishew.xlog.printer.a(true);
            com.elvishew.xlog.printer.file.a aVarB = new com.elvishew.xlog.printer.file.a.b(context.getCacheDir().getAbsolutePath() + f.f74508a.g()).a(new b8.d(5242880L, 6)).c(new c8.b(f.f74520m)).f(new com.elvishew.xlog.flattener.a()).b();
            f0.o(aVarB, "build(...)");
            u uVar = null;
            if (z10) {
                com.elvishew.xlog.f fVarX = com.elvishew.xlog.h.Z(f.f74514g).f0(aVar, aVarB).E().D().x();
                f0.o(fVarX, "build(...)");
                gVar = new g(fVarX, uVar);
            } else {
                com.elvishew.xlog.f fVarX2 = com.elvishew.xlog.h.Z(f.f74514g).f0(aVarB).E().D().x();
                f0.o(fVarX2, "build(...)");
                gVar = new g(fVarX2, uVar);
            }
            g.f74537h = gVar;
        }

        @m
        private final void o(Context context, boolean z10) {
            g gVar;
            if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.L8, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.elvishew.xlog.printer.a aVar = new com.elvishew.xlog.printer.a(true);
            com.elvishew.xlog.printer.file.a aVarB = new com.elvishew.xlog.printer.file.a.b(context.getCacheDir().getAbsolutePath() + f.f74508a.h()).a(new b8.d(5242880L, 6)).c(new c8.b(f.f74520m)).f(new com.elvishew.xlog.flattener.a()).b();
            f0.o(aVarB, "build(...)");
            u uVar = null;
            if (z10) {
                com.elvishew.xlog.f fVarX = com.elvishew.xlog.h.Z(f.f74512e).f0(aVar, aVarB).E().x();
                f0.o(fVarX, "build(...)");
                gVar = new g(fVarX, uVar);
            } else {
                com.elvishew.xlog.f fVarX2 = com.elvishew.xlog.h.Z(f.f74512e).f0(aVarB).E().x();
                f0.o(fVarX2, "build(...)");
                gVar = new g(fVarX2, uVar);
            }
            g.f74535f = gVar;
        }

        @dl.e
        public final g B() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.C8, new Class[0], g.class);
            return patchProxyResultProxy.isSupported ? (g) patchProxyResultProxy.result : g.f74533d;
        }

        @dl.e
        public final g D() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.H8, new Class[0], g.class);
            return patchProxyResultProxy.isSupported ? (g) patchProxyResultProxy.result : g.f74538i;
        }

        @dl.e
        public final g F() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.D8, new Class[0], g.class);
            return patchProxyResultProxy.isSupported ? (g) patchProxyResultProxy.result : g.f74534e;
        }

        @dl.e
        public final g H() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.G8, new Class[0], g.class);
            return patchProxyResultProxy.isSupported ? (g) patchProxyResultProxy.result : g.f74537h;
        }

        @dl.e
        public final g J() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.E8, new Class[0], g.class);
            return patchProxyResultProxy.isSupported ? (g) patchProxyResultProxy.result : g.f74535f;
        }

        @m
        public final void L(@dl.d Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.l.f34111e9, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(obj, "obj");
            if (g.f74532c) {
                com.elvishew.xlog.h.w(obj);
            }
        }

        @m
        public final void M(@dl.d String msg) {
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, bb.c.l.f34042b9, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(msg, "msg");
            if (g.f74532c) {
                com.elvishew.xlog.h.x(msg);
            }
        }

        @m
        public final void N(@dl.d String fmt, @dl.d String... values) {
            if (PatchProxy.proxy(new Object[]{fmt, values}, this, changeQuickRedirect, false, bb.c.l.f34065c9, new Class[]{String.class, String[].class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(fmt, "fmt");
            f0.p(values, "values");
            if (g.f74532c) {
                com.elvishew.xlog.h.z(fmt, values);
            }
        }

        @m
        public final void O(@dl.d Object[] list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.l.f34088d9, new Class[]{Object[].class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(list, "list");
            if (g.f74532c) {
                com.elvishew.xlog.h.A(list);
            }
        }

        @m
        public final void P(@dl.d Context context, boolean z10) {
            if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.I8, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            if (g.f74532c) {
                return;
            }
            com.elvishew.xlog.b bVarT = new com.elvishew.xlog.b.a().E(z10 ? Integer.MIN_VALUE : 4).N(f.f74509b).x().D(new t7.a()).Q(new w7.a()).P(new v7.a()).O(new y7.a()).L(new x7.a()).s(new s7.b()).t();
            com.elvishew.xlog.printer.a aVar = new com.elvishew.xlog.printer.a(true);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getCacheDir().getAbsolutePath());
            f fVar = f.f74508a;
            sb2.append(fVar.a());
            com.elvishew.xlog.printer.file.a aVarB = new com.elvishew.xlog.printer.file.a.b(sb2.toString()).a(new b8.d(5242880L, 6)).c(new c8.b(f.f74520m)).f(new com.elvishew.xlog.flattener.a()).b();
            f0.o(aVarB, "build(...)");
            if (z10) {
                com.elvishew.xlog.h.H(bVarT, aVar, aVarB);
            } else {
                com.elvishew.xlog.h.H(bVarT, aVarB);
            }
            k(context, z10);
            m(context, z10);
            o(context, z10);
            j(context, z10);
            n(context, z10);
            l(context, z10);
            File file = new File(context.getCacheDir().getAbsolutePath() + fVar.a());
            File file2 = new File(context.getCacheDir().getAbsolutePath() + fVar.d());
            File file3 = new File(context.getCacheDir().getAbsolutePath() + fVar.f());
            File file4 = new File(context.getCacheDir().getAbsolutePath() + fVar.h());
            File file5 = new File(context.getCacheDir().getAbsolutePath() + fVar.c());
            try {
                if (!file.exists()) {
                    file.mkdirs();
                }
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                if (!file3.exists()) {
                    file3.mkdirs();
                }
                if (!file4.exists()) {
                    file4.mkdirs();
                }
                if (!file5.exists()) {
                    file5.mkdirs();
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            g.f74532c = true;
        }

        @m
        public final void R(@dl.d Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.l.V8, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(obj, "obj");
            if (g.f74532c) {
                com.elvishew.xlog.h.c0(obj);
            }
        }

        @m
        public final void S(@dl.d String msg) {
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, bb.c.l.S8, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(msg, "msg");
            if (g.f74532c) {
                com.elvishew.xlog.h.d0(msg);
            }
        }

        @m
        public final void T(@dl.d String fmt, @dl.d String... values) {
            if (PatchProxy.proxy(new Object[]{fmt, values}, this, changeQuickRedirect, false, bb.c.l.T8, new Class[]{String.class, String[].class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(fmt, "fmt");
            f0.p(values, "values");
            if (g.f74532c) {
                com.elvishew.xlog.h.f0(fmt, values);
            }
        }

        @m
        public final void U(@dl.d Object[] list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.l.U8, new Class[]{Object[].class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(list, "list");
            if (g.f74532c) {
                com.elvishew.xlog.h.g0(list);
            }
        }

        @m
        public final void V(@dl.d Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.l.f34203i9, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(obj, "obj");
            if (g.f74532c) {
                com.elvishew.xlog.h.h0(obj);
            }
        }

        @m
        public final void W(@dl.d String msg) {
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, bb.c.l.f34134f9, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(msg, "msg");
            if (g.f74532c) {
                com.elvishew.xlog.h.i0(msg);
            }
        }

        @m
        public final void X(@dl.d String fmt, @dl.d String... values) {
            if (PatchProxy.proxy(new Object[]{fmt, values}, this, changeQuickRedirect, false, bb.c.l.f34157g9, new Class[]{String.class, String[].class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(fmt, "fmt");
            f0.p(values, "values");
            if (g.f74532c) {
                com.elvishew.xlog.h.k0(fmt, values);
            }
        }

        @m
        public final void Y(@dl.d Object[] list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.l.f34180h9, new Class[]{Object[].class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(list, "list");
            if (g.f74532c) {
                com.elvishew.xlog.h.l0(list);
            }
        }

        @dl.e
        @m
        public final String h(@dl.d Context context) throws IOException {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.l.Q8, new Class[]{Context.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            String strQ = Q(context);
            if (strQ == null) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getCacheDir().getAbsolutePath());
            f fVar = f.f74508a;
            sb2.append(fVar.b());
            if (new File(sb2.toString()).exists()) {
                e.f74507a.a(context.getCacheDir().getAbsolutePath() + fVar.b(), strQ);
            }
            return strQ;
        }

        @dl.e
        @m
        public final String i(@dl.d Context context, @dl.d String directory) throws IOException {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, directory}, this, changeQuickRedirect, false, bb.c.l.R8, new Class[]{Context.class, String.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            f0.p(directory, "directory");
            String strQ = Q(context);
            if (strQ == null) {
                return null;
            }
            if (new File(context.getCacheDir().getAbsolutePath() + directory).exists()) {
                e.f74507a.a(context.getCacheDir().getAbsolutePath() + directory, strQ);
            }
            return strQ;
        }

        @m
        public final void p(@dl.d Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.l.f34019a9, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(obj, "obj");
            if (g.f74532c) {
                com.elvishew.xlog.h.f(obj);
            }
        }

        @m
        public final void q(@dl.d String msg) {
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, bb.c.l.W8, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(msg, "msg");
            if (g.f74532c) {
                com.elvishew.xlog.h.g(msg);
            }
        }

        @m
        public final void r(@dl.d String msg, @dl.d Throwable throwable) {
            if (PatchProxy.proxy(new Object[]{msg, throwable}, this, changeQuickRedirect, false, bb.c.l.X8, new Class[]{String.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(msg, "msg");
            f0.p(throwable, "throwable");
            if (g.f74532c) {
                com.elvishew.xlog.h.h(msg, throwable);
            }
        }

        @m
        public final void s(@dl.d String fmt, @dl.d String... values) {
            if (PatchProxy.proxy(new Object[]{fmt, values}, this, changeQuickRedirect, false, bb.c.l.Y8, new Class[]{String.class, String[].class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(fmt, "fmt");
            f0.p(values, "values");
            if (g.f74532c) {
                com.elvishew.xlog.h.i(fmt, values);
            }
        }

        @m
        public final void t(@dl.d Object[] list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.l.Z8, new Class[]{Object[].class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(list, "list");
            if (g.f74532c) {
                com.elvishew.xlog.h.j(list);
            }
        }

        @m
        public final void u(@dl.d Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.l.f34317n9, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(obj, "obj");
            if (g.f74532c) {
                com.elvishew.xlog.h.n(obj);
            }
        }

        @m
        public final void v(@dl.d String msg) {
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, bb.c.l.f34225j9, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(msg, "msg");
            if (g.f74532c) {
                com.elvishew.xlog.h.o(msg);
            }
        }

        @m
        public final void w(@dl.d String msg, @dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{msg, e10}, this, changeQuickRedirect, false, bb.c.l.f34248k9, new Class[]{String.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(msg, "msg");
            f0.p(e10, "e");
            if (g.f74532c) {
                com.elvishew.xlog.h.p(msg, e10);
            }
        }

        @m
        public final void x(@dl.d String fmt, @dl.d String... values) {
            if (PatchProxy.proxy(new Object[]{fmt, values}, this, changeQuickRedirect, false, bb.c.l.f34271l9, new Class[]{String.class, String[].class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(fmt, "fmt");
            f0.p(values, "values");
            if (g.f74532c) {
                com.elvishew.xlog.h.q(fmt, values);
            }
        }

        @m
        public final void y(@dl.d Object[] list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.l.f34294m9, new Class[]{Object[].class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(list, "list");
            if (g.f74532c) {
                com.elvishew.xlog.h.r(list);
            }
        }

        @dl.e
        public final g z() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.F8, new Class[0], g.class);
            return patchProxyResultProxy.isSupported ? (g) patchProxyResultProxy.result : g.f74536g;
        }
    }

    private g(com.elvishew.xlog.f fVar) {
        this.f74539a = fVar;
    }

    public /* synthetic */ g(com.elvishew.xlog.f fVar, u uVar) {
        this(fVar);
    }

    @m
    public static final void A(@dl.d Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, null, changeQuickRedirect, true, bb.c.l.f34316n8, new Class[]{Object[].class}, Void.TYPE).isSupported) {
            return;
        }
        f74531b.t(objArr);
    }

    @m
    public static final void F(@dl.d Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, null, changeQuickRedirect, true, bb.c.l.B8, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f74531b.u(obj);
    }

    @m
    public static final void G(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.f34539x8, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f74531b.v(str);
    }

    @m
    public static final void H(@dl.d String str, @dl.d Throwable th2) {
        if (PatchProxy.proxy(new Object[]{str, th2}, null, changeQuickRedirect, true, bb.c.l.f34561y8, new Class[]{String.class, Throwable.class}, Void.TYPE).isSupported) {
            return;
        }
        f74531b.w(str, th2);
    }

    @m
    public static final void I(@dl.d String str, @dl.d String... strArr) {
        if (PatchProxy.proxy(new Object[]{str, strArr}, null, changeQuickRedirect, true, bb.c.l.f34583z8, new Class[]{String.class, String[].class}, Void.TYPE).isSupported) {
            return;
        }
        f74531b.x(str, strArr);
    }

    @m
    public static final void J(@dl.d Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, null, changeQuickRedirect, true, bb.c.l.A8, new Class[]{Object[].class}, Void.TYPE).isSupported) {
            return;
        }
        f74531b.y(objArr);
    }

    @dl.e
    public static final g O() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.l.T7, new Class[0], g.class);
        return patchProxyResultProxy.isSupported ? (g) patchProxyResultProxy.result : f74531b.z();
    }

    @dl.e
    public static final g Q() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.l.Q7, new Class[0], g.class);
        return patchProxyResultProxy.isSupported ? (g) patchProxyResultProxy.result : f74531b.B();
    }

    @dl.e
    public static final g R() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.l.V7, new Class[0], g.class);
        return patchProxyResultProxy.isSupported ? (g) patchProxyResultProxy.result : f74531b.D();
    }

    @dl.e
    public static final g S() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.l.R7, new Class[0], g.class);
        return patchProxyResultProxy.isSupported ? (g) patchProxyResultProxy.result : f74531b.F();
    }

    @dl.e
    public static final g T() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.l.U7, new Class[0], g.class);
        return patchProxyResultProxy.isSupported ? (g) patchProxyResultProxy.result : f74531b.H();
    }

    @dl.e
    public static final g U() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.l.S7, new Class[0], g.class);
        return patchProxyResultProxy.isSupported ? (g) patchProxyResultProxy.result : f74531b.J();
    }

    @m
    public static final void V(@dl.d Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, null, changeQuickRedirect, true, bb.c.l.f34429s8, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f74531b.L(obj);
    }

    @m
    public static final void W(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.f34362p8, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f74531b.M(str);
    }

    @m
    public static final void X(@dl.d String str, @dl.d String... strArr) {
        if (PatchProxy.proxy(new Object[]{str, strArr}, null, changeQuickRedirect, true, bb.c.l.f34385q8, new Class[]{String.class, String[].class}, Void.TYPE).isSupported) {
            return;
        }
        f74531b.N(str, strArr);
    }

    @m
    public static final void Y(@dl.d Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, null, changeQuickRedirect, true, bb.c.l.f34407r8, new Class[]{Object[].class}, Void.TYPE).isSupported) {
            return;
        }
        f74531b.O(objArr);
    }

    @m
    public static final void d0(@dl.d Context context, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.W7, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f74531b.P(context, z10);
    }

    @m
    private static final String e0(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.l.f34087d8, new Class[]{Context.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : a.g(f74531b, context);
    }

    @m
    public static final void f0(@dl.d Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, null, changeQuickRedirect, true, bb.c.l.f34224j8, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f74531b.R(obj);
    }

    @m
    public static final void g0(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.f34156g8, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f74531b.S(str);
    }

    @m
    public static final void h0(@dl.d String str, @dl.d String... strArr) {
        if (PatchProxy.proxy(new Object[]{str, strArr}, null, changeQuickRedirect, true, bb.c.l.f34179h8, new Class[]{String.class, String[].class}, Void.TYPE).isSupported) {
            return;
        }
        f74531b.T(str, strArr);
    }

    @m
    public static final void i0(@dl.d Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, null, changeQuickRedirect, true, bb.c.l.f34202i8, new Class[]{Object[].class}, Void.TYPE).isSupported) {
            return;
        }
        f74531b.U(objArr);
    }

    @m
    public static final void n0(@dl.d Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, null, changeQuickRedirect, true, bb.c.l.f34517w8, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f74531b.V(obj);
    }

    @dl.e
    @m
    public static final String o(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.l.f34110e8, new Class[]{Context.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f74531b.h(context);
    }

    @m
    public static final void o0(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.f34451t8, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f74531b.W(str);
    }

    @dl.e
    @m
    public static final String p(@dl.d Context context, @dl.d String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.l.f34133f8, new Class[]{Context.class, String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f74531b.i(context, str);
    }

    @m
    public static final void p0(@dl.d String str, @dl.d String... strArr) {
        if (PatchProxy.proxy(new Object[]{str, strArr}, null, changeQuickRedirect, true, bb.c.l.f34473u8, new Class[]{String.class, String[].class}, Void.TYPE).isSupported) {
            return;
        }
        f74531b.X(str, strArr);
    }

    @m
    private static final void q(Context context, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.f34018a8, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        a.a(f74531b, context, z10);
    }

    @m
    public static final void q0(@dl.d Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, null, changeQuickRedirect, true, bb.c.l.f34495v8, new Class[]{Object[].class}, Void.TYPE).isSupported) {
            return;
        }
        f74531b.Y(objArr);
    }

    @m
    private static final void r(Context context, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.X7, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        a.b(f74531b, context, z10);
    }

    @m
    private static final void s(Context context, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.f34064c8, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        a.c(f74531b, context, z10);
    }

    @m
    private static final void t(Context context, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.Y7, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        a.d(f74531b, context, z10);
    }

    @m
    private static final void u(Context context, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.f34041b8, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        a.e(f74531b, context, z10);
    }

    @m
    private static final void v(Context context, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.Z7, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        a.f(f74531b, context, z10);
    }

    @m
    public static final void w(@dl.d Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, null, changeQuickRedirect, true, bb.c.l.f34339o8, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f74531b.p(obj);
    }

    @m
    public static final void x(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.f34247k8, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f74531b.q(str);
    }

    @m
    public static final void y(@dl.d String str, @dl.d Throwable th2) {
        if (PatchProxy.proxy(new Object[]{str, th2}, null, changeQuickRedirect, true, bb.c.l.f34270l8, new Class[]{String.class, Throwable.class}, Void.TYPE).isSupported) {
            return;
        }
        f74531b.r(str, th2);
    }

    @m
    public static final void z(@dl.d String str, @dl.d String... strArr) {
        if (PatchProxy.proxy(new Object[]{str, strArr}, null, changeQuickRedirect, true, bb.c.l.f34293m8, new Class[]{String.class, String[].class}, Void.TYPE).isSupported) {
            return;
        }
        f74531b.s(str, strArr);
    }

    public final void B(@dl.d Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.l.D7, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(obj, "obj");
        this.f74539a.a(obj);
    }

    public final void C(@dl.d String msg) {
        if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, bb.c.l.A7, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(msg, "msg");
        this.f74539a.b(msg);
    }

    public final void D(@dl.d String fmt, @dl.d String... values) {
        if (PatchProxy.proxy(new Object[]{fmt, values}, this, changeQuickRedirect, false, bb.c.l.B7, new Class[]{String.class, String[].class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fmt, "fmt");
        f0.p(values, "values");
        this.f74539a.d(fmt, values);
    }

    public final void E(@dl.d Object[] list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.l.C7, new Class[]{Object[].class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "list");
        this.f74539a.e(list);
    }

    public final void K(@dl.d Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.l.P7, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(obj, "obj");
        this.f74539a.f(obj);
    }

    public final void L(@dl.d String msg) {
        if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, bb.c.l.M7, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(msg, "msg");
        this.f74539a.g(msg);
    }

    public final void M(@dl.d String fmt, @dl.d String... values) {
        if (PatchProxy.proxy(new Object[]{fmt, values}, this, changeQuickRedirect, false, bb.c.l.N7, new Class[]{String.class, String[].class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fmt, "fmt");
        f0.p(values, "values");
        this.f74539a.i(fmt, values);
    }

    public final void N(@dl.d Object[] list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.l.O7, new Class[]{Object[].class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "list");
        this.f74539a.j(list);
    }

    @dl.d
    public final com.elvishew.xlog.f P() {
        return this.f74539a;
    }

    public final void Z(@dl.d Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.l.H7, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(obj, "obj");
        this.f74539a.l(obj);
    }

    public final void a0(@dl.d String msg) {
        if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, bb.c.l.E7, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(msg, "msg");
        this.f74539a.m(msg);
    }

    public final void b0(@dl.d String fmt, @dl.d String... values) {
        if (PatchProxy.proxy(new Object[]{fmt, values}, this, changeQuickRedirect, false, bb.c.l.F7, new Class[]{String.class, String[].class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fmt, "fmt");
        f0.p(values, "values");
        this.f74539a.o(fmt, values);
    }

    public final void c0(@dl.d Object[] list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.l.G7, new Class[]{Object[].class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "list");
        this.f74539a.p(list);
    }

    public final void j0(@dl.d Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.l.f34582z7, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(obj, "obj");
        this.f74539a.C(obj);
    }

    public final void k0(@dl.d String msg) {
        if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, bb.c.l.f34516w7, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(msg, "msg");
        this.f74539a.D(msg);
    }

    public final void l0(@dl.d String fmt, @dl.d String... values) {
        if (PatchProxy.proxy(new Object[]{fmt, values}, this, changeQuickRedirect, false, bb.c.l.f34538x7, new Class[]{String.class, String[].class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fmt, "fmt");
        f0.p(values, "values");
        this.f74539a.F(fmt, values);
    }

    public final void m0(@dl.d Object[] list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.l.f34560y7, new Class[]{Object[].class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "list");
        this.f74539a.G(list);
    }

    public final void r0(@dl.d Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.l.L7, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(obj, "obj");
        this.f74539a.H(obj);
    }

    public final void s0(@dl.d String msg) {
        if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, bb.c.l.I7, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(msg, "msg");
        this.f74539a.I(msg);
    }

    public final void t0(@dl.d String fmt, @dl.d String... values) {
        if (PatchProxy.proxy(new Object[]{fmt, values}, this, changeQuickRedirect, false, bb.c.l.J7, new Class[]{String.class, String[].class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fmt, "fmt");
        f0.p(values, "values");
        this.f74539a.K(fmt, values);
    }

    public final void u0(@dl.d Object[] list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.l.K7, new Class[]{Object[].class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "list");
        this.f74539a.L(list);
    }
}
