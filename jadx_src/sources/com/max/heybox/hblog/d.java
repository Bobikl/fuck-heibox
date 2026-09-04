package com.max.heybox.hblog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;
import xh.m;

/* JADX INFO: compiled from: HBLogInfoProcesser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f74506a = new a(null);
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: HBLogInfoProcesser.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public static /* synthetic */ void c(a aVar, Throwable th2, String str, int i10, Object obj) {
            if (PatchProxy.proxy(new Object[]{aVar, th2, str, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.l.f34361p7, new Class[]{a.class, Throwable.class, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if ((i10 & 2) != 0) {
                str = "";
            }
            aVar.b(th2, str);
        }

        @i
        @m
        public final void a(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.l.f34384q7, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            c(this, e10, null, 2, null);
        }

        @i
        @m
        public final void b(@dl.d Throwable e10, @dl.e String str) {
            if (PatchProxy.proxy(new Object[]{e10, str}, this, changeQuickRedirect, false, bb.c.l.f34338o7, new Class[]{Throwable.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            e10.printStackTrace(printWriter);
            for (Throwable cause = e10.getCause(); cause != null; cause = cause.getCause()) {
                cause.printStackTrace(printWriter);
            }
            printWriter.close();
            String string = stringWriter.toString();
            g gVarZ = g.f74531b.z();
            if (gVarZ != null) {
                gVarZ.L(str + ", " + string);
            }
        }
    }

    @i
    @m
    public static final void a(@dl.d Throwable th2) {
        if (PatchProxy.proxy(new Object[]{th2}, null, changeQuickRedirect, true, bb.c.l.f34315n7, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
            return;
        }
        f74506a.a(th2);
    }

    @i
    @m
    public static final void b(@dl.d Throwable th2, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{th2, str}, null, changeQuickRedirect, true, bb.c.l.f34292m7, new Class[]{Throwable.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f74506a.b(th2, str);
    }
}
