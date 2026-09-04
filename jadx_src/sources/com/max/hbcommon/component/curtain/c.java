package com.max.hbcommon.component.curtain;

import android.util.SparseArray;
import android.view.View;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: CurtainFlow.java */
/* JADX INFO: loaded from: classes9.dex */
public class c implements gb.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f67536b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC0544c f67538d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f67537c = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SparseArray<com.max.hbcommon.component.curtain.b> f67535a = new SparseArray<>();

    /* JADX INFO: compiled from: CurtainFlow.java */
    public class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0544c f67539b;

        a(InterfaceC0544c interfaceC0544c) {
            this.f67539b = interfaceC0544c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Go, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            c.this.i(this.f67539b);
        }
    }

    /* JADX INFO: compiled from: CurtainFlow.java */
    public static class b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SparseArray<com.max.hbcommon.component.curtain.b> f67541a = new SparseArray<>();

        public c a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Io, new Class[0], c.class);
            if (patchProxyResultProxy.isSupported) {
                return (c) patchProxyResultProxy.result;
            }
            c cVar = new c();
            cVar.f67535a = this.f67541a;
            return cVar;
        }

        public b b(int i10, com.max.hbcommon.component.curtain.b bVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), bVar}, this, changeQuickRedirect, false, bb.c.d.Ho, new Class[]{Integer.TYPE, com.max.hbcommon.component.curtain.b.class}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (b) patchProxyResultProxy.result;
            }
            this.f67541a.append(i10, bVar);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.max.hbcommon.component.curtain.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CurtainFlow.java */
    public interface InterfaceC0544c {
        void a(int i10, gb.a aVar);

        void onFinish();
    }

    private void f(com.max.hbcommon.component.curtain.b bVar, int i10) {
        if (PatchProxy.proxy(new Object[]{bVar, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Eo, new Class[]{com.max.hbcommon.component.curtain.b.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        j(bVar);
        this.f67536b.S3();
        int iKeyAt = this.f67535a.keyAt(i10);
        this.f67537c = iKeyAt;
        InterfaceC0544c interfaceC0544c = this.f67538d;
        if (interfaceC0544c != null) {
            interfaceC0544c.a(iKeyAt, this);
        }
    }

    @p0
    private com.max.hbcommon.component.curtain.b g(SparseArray<com.max.hbcommon.component.curtain.b> sparseArray, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sparseArray, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Fo, new Class[]{SparseArray.class, Integer.TYPE}, com.max.hbcommon.component.curtain.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbcommon.component.curtain.b) patchProxyResultProxy.result;
        }
        try {
            return sparseArray.valueAt(i10);
        } catch (Exception unused) {
            return null;
        }
    }

    private void j(com.max.hbcommon.component.curtain.b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.d.Do, new Class[]{com.max.hbcommon.component.curtain.b.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.component.curtain.b.c cVar = bVar.f67522a;
        GuideView guideView = new GuideView(cVar.f67524a);
        guideView.setCurtainColor(cVar.f67532i);
        guideView.setHollowInfo(cVar.f67526c);
        this.f67536b.O3(guideView);
        this.f67536b.setCancelable(cVar.f67529f);
        this.f67536b.Q3(cVar.f67527d);
        this.f67536b.P3(cVar);
    }

    @Override // gb.a
    public void a(int i10) {
        int iIndexOfKey;
        com.max.hbcommon.component.curtain.b bVarValueAt;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Ao, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (bVarValueAt = this.f67535a.valueAt((iIndexOfKey = this.f67535a.indexOfKey(i10)))) == null) {
            return;
        }
        f(bVarValueAt, iIndexOfKey);
    }

    @Override // gb.a
    public <T extends View> T b(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Bo, new Class[]{Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        d dVar = this.f67536b;
        if (dVar != null) {
            return (T) dVar.S0(i10);
        }
        return null;
    }

    @Override // gb.a
    public void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.yo, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int iIndexOfKey = this.f67535a.indexOfKey(this.f67537c) + 1;
        com.max.hbcommon.component.curtain.b bVarG = g(this.f67535a, iIndexOfKey);
        if (bVarG != null) {
            f(bVarG, iIndexOfKey);
        } else {
            finish();
        }
    }

    public void e(int i10, com.max.hbcommon.component.curtain.b bVar) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), bVar}, this, changeQuickRedirect, false, bb.c.d.vo, new Class[]{Integer.TYPE, com.max.hbcommon.component.curtain.b.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f67535a.append(i10, bVar);
    }

    @Override // gb.a
    public void finish() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Co, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        d dVar = this.f67536b;
        if (dVar != null) {
            dVar.F();
        }
        InterfaceC0544c interfaceC0544c = this.f67538d;
        if (interfaceC0544c != null) {
            interfaceC0544c.onFinish();
        }
    }

    public void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.wo, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        i(null);
    }

    public void i(InterfaceC0544c interfaceC0544c) {
        if (PatchProxy.proxy(new Object[]{interfaceC0544c}, this, changeQuickRedirect, false, bb.c.d.xo, new Class[]{InterfaceC0544c.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f67538d = interfaceC0544c;
        if (this.f67535a.size() == 0) {
            return;
        }
        com.max.hbcommon.component.curtain.b bVarValueAt = this.f67535a.valueAt(0);
        this.f67537c = this.f67535a.keyAt(0);
        if (bVarValueAt.f67522a.f67526c.size() == 0) {
            return;
        }
        View view = bVarValueAt.f67522a.f67526c.valueAt(0).f67559c;
        if (view.getWidth() == 0) {
            view.post(new a(interfaceC0544c));
            return;
        }
        this.f67536b = new d();
        j(bVarValueAt);
        this.f67536b.R3();
        if (interfaceC0544c != null) {
            interfaceC0544c.a(this.f67537c, this);
        }
    }

    @Override // gb.a
    public void pop() {
        int iIndexOfKey;
        com.max.hbcommon.component.curtain.b bVarG;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.zo, new Class[0], Void.TYPE).isSupported || (iIndexOfKey = this.f67535a.indexOfKey(this.f67537c) - 1) < 0 || (bVarG = g(this.f67535a, iIndexOfKey)) == null) {
            return;
        }
        f(bVarG, iIndexOfKey);
    }
}
