package com.max.mediaselector.lib;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.config.h;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.utils.o;
import com.max.mediaselector.lib.utils.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import oe.j;
import oe.s;

/* JADX INFO: compiled from: PictureSelectorSystemFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class g extends com.max.mediaselector.lib.basic.g {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f75232r = g.class.getSimpleName();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private androidx.activity.result.g<String[]> f75233n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private androidx.activity.result.g<String[]> f75234o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private androidx.activity.result.g<String> f75235p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private androidx.activity.result.g<String> f75236q;

    /* JADX INFO: compiled from: PictureSelectorSystemFragment.java */
    public class a implements s {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // oe.s
        public void a(String[] strArr, boolean z10) {
            if (PatchProxy.proxy(new Object[]{strArr, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.f34140ff, new Class[]{String[].class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (z10) {
                g.M4(g.this);
            } else {
                g.this.p2(strArr);
            }
        }
    }

    /* JADX INFO: compiled from: PictureSelectorSystemFragment.java */
    public class b implements re.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // re.c
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34163gf, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            g.M4(g.this);
        }

        @Override // re.c
        public void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34186hf, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            g.this.p2(re.b.f138889b);
        }
    }

    /* JADX INFO: compiled from: PictureSelectorSystemFragment.java */
    public class c implements androidx.activity.result.a<List<Uri>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // androidx.activity.result.a
        public /* bridge */ /* synthetic */ void a(List<Uri> list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.l.f34231jf, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(list);
        }

        public void b(List<Uri> list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.l.f10if, new Class[]{List.class}, Void.TYPE).isSupported) {
                return;
            }
            if (list == null || list.size() == 0) {
                g.this.x1();
                return;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                LocalMedia localMediaN4 = g.N4(g.this, list.get(i10).toString());
                localMediaN4.M0(o.e() ? localMediaN4.E() : localMediaN4.G());
                qe.a.b(localMediaN4);
            }
            g.O4(g.this);
        }
    }

    /* JADX INFO: compiled from: PictureSelectorSystemFragment.java */
    public class d implements androidx.activity.result.a<Uri> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // androidx.activity.result.a
        public /* bridge */ /* synthetic */ void a(Uri uri) {
            if (PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, bb.c.l.f34277lf, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(uri);
        }

        public void b(Uri uri) {
            if (PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, bb.c.l.f34254kf, new Class[]{Uri.class}, Void.TYPE).isSupported) {
                return;
            }
            if (uri == null) {
                g.this.x1();
                return;
            }
            LocalMedia localMediaP4 = g.P4(g.this, uri.toString());
            localMediaP4.M0(o.e() ? localMediaP4.E() : localMediaP4.G());
            if (g.this.O0(localMediaP4, false) == 0) {
                g.Q4(g.this);
            } else {
                g.this.x1();
            }
        }
    }

    /* JADX INFO: compiled from: PictureSelectorSystemFragment.java */
    public class e implements androidx.activity.result.a<List<Uri>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // androidx.activity.result.a
        public /* bridge */ /* synthetic */ void a(List<Uri> list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.l.f34323nf, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(list);
        }

        public void b(List<Uri> list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.l.f34300mf, new Class[]{List.class}, Void.TYPE).isSupported) {
                return;
            }
            if (list == null || list.size() == 0) {
                g.this.x1();
                return;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                LocalMedia localMediaR4 = g.R4(g.this, list.get(i10).toString());
                localMediaR4.M0(o.e() ? localMediaR4.E() : localMediaR4.G());
                qe.a.b(localMediaR4);
            }
            g.S4(g.this);
        }
    }

    /* JADX INFO: compiled from: PictureSelectorSystemFragment.java */
    public class f implements androidx.activity.result.a<Uri> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // androidx.activity.result.a
        public /* bridge */ /* synthetic */ void a(Uri uri) {
            if (PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, bb.c.l.f34369pf, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(uri);
        }

        public void b(Uri uri) {
            if (PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, bb.c.l.f34346of, new Class[]{Uri.class}, Void.TYPE).isSupported) {
                return;
            }
            if (uri == null) {
                g.this.x1();
                return;
            }
            LocalMedia localMediaT4 = g.T4(g.this, uri.toString());
            localMediaT4.M0(o.e() ? localMediaT4.E() : localMediaT4.G());
            if (g.this.O0(localMediaT4, false) == 0) {
                g.U4(g.this);
            } else {
                g.this.x1();
            }
        }
    }

    static /* synthetic */ void M4(g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, bb.c.l.We, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.c5();
    }

    static /* synthetic */ LocalMedia N4(g gVar, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gVar, str}, null, changeQuickRedirect, true, bb.c.l.Xe, new Class[]{g.class, String.class}, LocalMedia.class);
        return patchProxyResultProxy.isSupported ? (LocalMedia) patchProxyResultProxy.result : gVar.V3(str);
    }

    static /* synthetic */ void O4(g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, bb.c.l.Ye, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.i4();
    }

    static /* synthetic */ LocalMedia P4(g gVar, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gVar, str}, null, changeQuickRedirect, true, bb.c.l.Ze, new Class[]{g.class, String.class}, LocalMedia.class);
        return patchProxyResultProxy.isSupported ? (LocalMedia) patchProxyResultProxy.result : gVar.V3(str);
    }

    static /* synthetic */ void Q4(g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, bb.c.l.f34025af, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.i4();
    }

    static /* synthetic */ LocalMedia R4(g gVar, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gVar, str}, null, changeQuickRedirect, true, bb.c.l.f34048bf, new Class[]{g.class, String.class}, LocalMedia.class);
        return patchProxyResultProxy.isSupported ? (LocalMedia) patchProxyResultProxy.result : gVar.V3(str);
    }

    static /* synthetic */ void S4(g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, bb.c.l.f34071cf, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.i4();
    }

    static /* synthetic */ LocalMedia T4(g gVar, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gVar, str}, null, changeQuickRedirect, true, bb.c.l.f34094df, new Class[]{g.class, String.class}, LocalMedia.class);
        return patchProxyResultProxy.isSupported ? (LocalMedia) patchProxyResultProxy.result : gVar.V3(str);
    }

    static /* synthetic */ void U4(g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, bb.c.l.f34117ef, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.i4();
    }

    private void V4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Re, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f75236q = registerForActivityResult(new z.b.c(), new f());
    }

    private void W4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Qe, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f75235p = registerForActivityResult(new z.b.d(), new e());
    }

    private void X4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Oe, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f75233n = registerForActivityResult(new z.b.g(), new c());
    }

    private void Y4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Pe, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f75234o = registerForActivityResult(new z.b.e(), new d());
    }

    private void Z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Ne, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74929f;
        if (pictureSelectionConfig.f75040k == 1) {
            if (pictureSelectionConfig.f75029b == h.a()) {
                Y4();
                return;
            } else {
                V4();
                return;
            }
        }
        if (pictureSelectionConfig.f75029b == h.a()) {
            X4();
        } else {
            W4();
        }
    }

    private String a5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Se, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.f74929f.f75029b == h.d()) {
            return h.f75166g;
        }
        return this.f74929f.f75029b == h.b() ? h.f75167h : h.f75165f;
    }

    public static g b5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.l.Ke, new Class[0], g.class);
        return patchProxyResultProxy.isSupported ? (g) patchProxyResultProxy.result : new g();
    }

    private void c5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Me, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74929f;
        if (pictureSelectionConfig.f75040k == 1) {
            if (pictureSelectionConfig.f75029b == h.a()) {
                this.f75234o.b(h.f75164e);
                return;
            } else {
                this.f75236q.b(a5());
                return;
            }
        }
        if (pictureSelectionConfig.f75029b == h.a()) {
            this.f75233n.b(h.f75164e);
        } else {
            this.f75235p.b(a5());
        }
    }

    @Override // com.max.mediaselector.lib.basic.g, com.max.mediaselector.lib.basic.c
    public void H1(String[] strArr) {
        if (PatchProxy.proxy(new Object[]{strArr}, this, changeQuickRedirect, false, bb.c.l.Te, new Class[]{String[].class}, Void.TYPE).isSupported) {
            return;
        }
        j jVar = PictureSelectionConfig.f75023h4;
        if (jVar != null ? jVar.b(this, strArr) : re.a.d(getContext())) {
            c5();
        } else {
            t.c(getContext(), getString(R.string.ps_jurisdiction));
            x1();
        }
    }

    @Override // com.max.mediaselector.lib.basic.g, com.max.mediaselector.lib.basic.c
    public int I() {
        return R.layout.ps_empty;
    }

    @Override // com.max.mediaselector.lib.basic.g
    public String k4() {
        return f75232r;
    }

    @Override // com.max.mediaselector.lib.basic.g, androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.Ue, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i11 == 0) {
            x1();
        }
    }

    @Override // com.max.mediaselector.lib.basic.g, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Ve, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        androidx.activity.result.g<String[]> gVar = this.f75233n;
        if (gVar != null) {
            gVar.d();
        }
        androidx.activity.result.g<String[]> gVar2 = this.f75234o;
        if (gVar2 != null) {
            gVar2.d();
        }
        androidx.activity.result.g<String> gVar3 = this.f75235p;
        if (gVar3 != null) {
            gVar3.d();
        }
        androidx.activity.result.g<String> gVar4 = this.f75236q;
        if (gVar4 != null) {
            gVar4.d();
        }
    }

    @Override // com.max.mediaselector.lib.basic.g, androidx.fragment.app.Fragment
    public void onViewCreated(@n0 View view, @p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, bb.c.l.Le, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        Z4();
        if (re.a.d(getContext())) {
            c5();
            return;
        }
        j jVar = PictureSelectionConfig.f75023h4;
        if (jVar != null) {
            jVar.a(this, re.b.f138889b, new a());
        } else {
            re.a.b().i(this, re.b.f138889b, new b());
        }
    }
}
