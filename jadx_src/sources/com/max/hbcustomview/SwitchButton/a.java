package com.max.hbcustomview.SwitchButton;

import android.os.Handler;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: AnimationController.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f68936h = 256;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f68937i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f68938j = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f68940b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f68942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f68943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f68944f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f68941c = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f68945g = f68937i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f68939a = new b();

    /* JADX INFO: compiled from: AnimationController.java */
    public static class b extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        private b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object obj;
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, bb.c.f.Ec, new Class[]{Message.class}, Void.TYPE).isSupported || message.what != a.f68936h || (obj = message.obj) == null) {
                return;
            }
            ((Runnable) obj).run();
        }
    }

    /* JADX INFO: compiled from: AnimationController.java */
    public interface c {
        void a(int i10);

        void b();

        void c();

        boolean d();
    }

    /* JADX INFO: compiled from: AnimationController.java */
    public class d implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        private void a() {
        }

        private void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Gc, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Message messageObtainMessage = a.this.f68939a.obtainMessage();
            messageObtainMessage.what = a.f68936h;
            messageObtainMessage.obj = this;
            a.this.f68939a.sendMessageDelayed(messageObtainMessage, a.f68938j);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Fc, new Class[0], Void.TYPE).isSupported && a.this.f68941c) {
                a();
                a.this.f68940b.a(a.this.f68942d);
                if (a.this.f68940b.d()) {
                    b();
                } else {
                    a.this.k();
                    a.this.f68940b.c();
                }
            }
        }
    }

    private a() {
    }

    static a g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.f.Bc, new Class[0], a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : new a();
    }

    a h(c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.f.Cc, new Class[]{c.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        if (cVar == null) {
            throw new IllegalArgumentException("onAnimateListener can not be null");
        }
        this.f68940b = cVar;
        return this;
    }

    public void i(int i10) {
        if (i10 <= 0) {
            this.f68945g = f68937i;
        } else {
            this.f68945g = i10;
        }
    }

    void j(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Dc, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f68941c = true;
        this.f68943e = i10;
        this.f68944f = i11;
        int i12 = this.f68945g;
        this.f68942d = i12;
        if (i11 > i10) {
            this.f68942d = Math.abs(i12);
        } else {
            if (i11 >= i10) {
                this.f68941c = false;
                this.f68940b.c();
                return;
            }
            this.f68942d = -Math.abs(i12);
        }
        this.f68940b.b();
        new d().run();
    }

    void k() {
        this.f68941c = false;
    }
}
