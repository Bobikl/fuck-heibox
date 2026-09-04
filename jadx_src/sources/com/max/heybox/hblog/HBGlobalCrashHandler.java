package com.max.heybox.hblog;

import android.content.Context;
import android.os.Process;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.z;
import xh.m;

/* JADX INFO: compiled from: HBGlobalCrashHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class HBGlobalCrashHandler implements Thread.UncaughtExceptionHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f74470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private Thread.UncaughtExceptionHandler f74471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final a f74468c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final z<HBGlobalCrashHandler> f74469d = b0.b(LazyThreadSafetyMode.SYNCHRONIZED, new yh.a<HBGlobalCrashHandler>() { // from class: com.max.heybox.hblog.HBGlobalCrashHandler$Companion$instance$2
        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.d
        public final HBGlobalCrashHandler a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34201i7, new Class[0], HBGlobalCrashHandler.class);
            return patchProxyResultProxy.isSupported ? (HBGlobalCrashHandler) patchProxyResultProxy.result : new HBGlobalCrashHandler(null);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.max.heybox.hblog.HBGlobalCrashHandler, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ HBGlobalCrashHandler invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34223j7, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: compiled from: HBGlobalCrashHandler.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @m
        public static /* synthetic */ void b() {
        }

        @dl.d
        public final HBGlobalCrashHandler a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34178h7, new Class[0], HBGlobalCrashHandler.class);
            return patchProxyResultProxy.isSupported ? (HBGlobalCrashHandler) patchProxyResultProxy.result : (HBGlobalCrashHandler) HBGlobalCrashHandler.f74469d.getValue();
        }
    }

    private HBGlobalCrashHandler() {
    }

    public /* synthetic */ HBGlobalCrashHandler(u uVar) {
        this();
    }

    @dl.d
    public static final HBGlobalCrashHandler b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.l.f34155g7, new Class[0], HBGlobalCrashHandler.class);
        return patchProxyResultProxy.isSupported ? (HBGlobalCrashHandler) patchProxyResultProxy.result : f74468c.a();
    }

    private final boolean c(Throwable th2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.l.f34109e7, new Class[]{Throwable.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (th2 == null) {
            return false;
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        for (Throwable cause = th2.getCause(); cause != null; cause = cause.getCause()) {
            cause.printStackTrace(printWriter);
        }
        printWriter.close();
        String string = stringWriter.toString();
        g gVarZ = g.f74531b.z();
        if (gVarZ != null) {
            gVarZ.L("UncaughtException: " + string);
        }
        return true;
    }

    public final void d(@dl.d Context ctx) {
        if (PatchProxy.proxy(new Object[]{ctx}, this, changeQuickRedirect, false, bb.c.l.f34086d7, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(ctx, "ctx");
        this.f74470a = ctx;
        this.f74471b = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@dl.d Thread t10, @dl.d Throwable e10) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        if (PatchProxy.proxy(new Object[]{t10, e10}, this, changeQuickRedirect, false, bb.c.l.f34132f7, new Class[]{Thread.class, Throwable.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(t10, "t");
        f0.p(e10, "e");
        if (c(e10) || (uncaughtExceptionHandler = this.f74471b) == null) {
            Process.killProcess(Process.myPid());
            System.exit(10);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
        f0.m(uncaughtExceptionHandler);
        uncaughtExceptionHandler.uncaughtException(t10, e10);
    }
}
