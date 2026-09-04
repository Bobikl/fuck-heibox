package com.max.mediaselector;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import oe.v;

/* JADX INFO: compiled from: SelectorHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final f f74753a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private static v f74754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f74755c;
    public static ChangeQuickRedirect changeQuickRedirect;

    private f() {
    }

    public final void a() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34295ma, new Class[0], Void.TYPE).isSupported && f74755c) {
            v vVar = f74754b;
            if (vVar != null) {
                vVar.a();
            }
            b();
        }
    }

    public final void b() {
        f74755c = false;
        f74754b = null;
    }

    public final void c(@dl.d v action) {
        if (PatchProxy.proxy(new Object[]{action}, this, changeQuickRedirect, false, 10485, new Class[]{v.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(action, "action");
        if (f74755c) {
            f74754b = action;
        }
    }

    public final void d() {
        f74755c = true;
    }
}
