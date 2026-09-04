package com.max.hbcommon.component.curtain;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.d0;
import androidx.annotation.e1;
import androidx.annotation.i0;
import androidx.annotation.k0;
import androidx.annotation.n;
import androidx.annotation.n0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: Curtain.java */
/* JADX INFO: loaded from: classes9.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    c f67522a;

    /* JADX INFO: compiled from: Curtain.java */
    public class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.uo, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            b.this.l();
        }
    }

    /* JADX INFO: renamed from: com.max.hbcommon.component.curtain.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Curtain.java */
    public interface InterfaceC0543b {
        void a(g gVar);

        void b(g gVar);
    }

    /* JADX INFO: compiled from: Curtain.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Context f67524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        FragmentManager f67525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        SparseArray<f> f67526c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f67527d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        InterfaceC0543b f67528e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f67529f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f67530g = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f67531h = true;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f67532i = -1442840576;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f67533j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        SparseArray<h> f67534k = new SparseArray<>();
    }

    public b(@n0 Fragment fragment) {
        this(fragment.requireActivity());
        this.f67522a.f67525b = fragment.getChildFragmentManager();
    }

    public b(@n0 FragmentActivity fragmentActivity) {
        c cVar = new c();
        this.f67522a = cVar;
        cVar.f67524a = fragmentActivity;
        cVar.f67526c = new SparseArray<>();
        this.f67522a.f67525b = fragmentActivity.getSupportFragmentManager();
    }

    private f b(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.d.to, new Class[]{View.class}, f.class);
        if (patchProxyResultProxy.isSupported) {
            return (f) patchProxyResultProxy.result;
        }
        SparseArray<f> sparseArray = this.f67522a.f67526c;
        f fVar = sparseArray.get(view.hashCode());
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(view);
        fVar2.f67559c = view;
        sparseArray.append(view.hashCode(), fVar2);
        return fVar2;
    }

    public b a(@d0 int i10, h<g> hVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), hVar}, this, changeQuickRedirect, false, bb.c.d.qo, new Class[]{Integer.TYPE, h.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        this.f67522a.f67534k.append(i10, hVar);
        return this;
    }

    public b c(@e1 int i10) {
        this.f67522a.f67533j = i10;
        return this;
    }

    public b d(InterfaceC0543b interfaceC0543b) {
        this.f67522a.f67528e = interfaceC0543b;
        return this;
    }

    public b e(boolean z10) {
        this.f67522a.f67529f = z10;
        return this;
    }

    public b f(int i10) {
        this.f67522a.f67532i = i10;
        return this;
    }

    public b g(@n int i10) {
        this.f67522a.f67532i = i10;
        return this;
    }

    public b h(boolean z10) {
        this.f67522a.f67531h = z10;
        return this;
    }

    public b i(boolean z10) {
        this.f67522a.f67530g = z10;
        return this;
    }

    public b j(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.ro, new Class[]{Boolean.TYPE}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        if (z10) {
            c(0);
        }
        return this;
    }

    public b k(@i0 int i10) {
        this.f67522a.f67527d = i10;
        return this;
    }

    @k0
    public void l() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.so, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SparseArray<f> sparseArray = this.f67522a.f67526c;
        if (sparseArray.size() == 0) {
            Log.w(com.max.hbcommon.component.curtain.a.f67518a, "with out any views");
            return;
        }
        View view = sparseArray.valueAt(0).f67559c;
        if (view.getWidth() == 0) {
            view.post(new a());
        } else {
            d.M3(this.f67522a).R3();
        }
    }

    public b m(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.d.jo, new Class[]{View.class}, b.class);
        return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : n(view, true);
    }

    public b n(@n0 View view, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.ko, new Class[]{View.class, Boolean.TYPE}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        b(view).c(z10);
        return this;
    }

    public b o(@n0 View view, int i10, int i11) {
        Object[] objArr = {view, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.oo, new Class[]{View.class, cls, cls}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        b(view).d(i10, i11);
        return this;
    }

    public b p(@n0 View view, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.lo, new Class[]{View.class, Integer.TYPE}, b.class);
        return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : q(view, i.a(i10));
    }

    public b q(@n0 View view, i iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, iVar}, this, changeQuickRedirect, false, bb.c.d.mo, new Class[]{View.class, i.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        b(view).f67561e = iVar;
        return this;
    }

    public b r(@n0 View view, hb.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, cVar}, this, changeQuickRedirect, false, bb.c.d.po, new Class[]{View.class, hb.c.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        b(view).e(cVar);
        return this;
    }

    public b s(@n0 View view, int i10, int i11) {
        Object[] objArr = {view, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.no, new Class[]{View.class, cls, cls}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        b(view).f67560d = new Rect(0, 0, i10, i11);
        return this;
    }
}
