package com.max.mediaselector.lib.basic;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import oe.t;
import oe.u;

/* JADX INFO: compiled from: PictureSelectionModel.java */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f74958c = -1;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PictureSelectionConfig f74959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f74960b;

    public m(q qVar, int i10) {
        this.f74960b = qVar;
        PictureSelectionConfig pictureSelectionConfigB = PictureSelectionConfig.b();
        this.f74959a = pictureSelectionConfigB;
        pictureSelectionConfigB.f75029b = i10;
        Y(pictureSelectionConfigB.f75043n);
    }

    public m A(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.f34397qk, new Class[]{Boolean.TYPE}, m.class);
        if (patchProxyResultProxy.isSupported) {
            return (m) patchProxyResultProxy.result;
        }
        if (this.f74959a.f75029b == com.max.mediaselector.lib.config.h.b()) {
            this.f74959a.L = false;
        } else {
            this.f74959a.L = z10;
        }
        return this;
    }

    public m A0(com.max.mediaselector.lib.style.a aVar) {
        if (aVar != null) {
            PictureSelectionConfig.f75017b4 = aVar;
        }
        return this;
    }

    public m B(boolean z10) {
        this.f74959a.f75061y2 = z10;
        return this;
    }

    public m B0(String... strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{strArr}, this, changeQuickRedirect, false, bb.c.l.f34351ok, new Class[]{String[].class}, m.class);
        if (patchProxyResultProxy.isSupported) {
            return (m) patchProxyResultProxy.result;
        }
        if (strArr != null && strArr.length > 0) {
            this.f74959a.R.addAll(Arrays.asList(strArr));
        }
        return this;
    }

    public m C(boolean z10) {
        this.f74959a.V3 = z10;
        return this;
    }

    @Deprecated
    public m C0(int i10) {
        this.f74959a.f75049q = i10;
        return this;
    }

    public m D(boolean z10) {
        this.f74959a.G3 = z10;
        return this;
    }

    public m E(boolean z10) {
        this.f74959a.F = z10;
        return this;
    }

    public m F(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.f34282lk, new Class[]{Boolean.TYPE}, m.class);
        if (patchProxyResultProxy.isSupported) {
            return (m) patchProxyResultProxy.result;
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74959a;
        pictureSelectionConfig.P = pictureSelectionConfig.f75029b == com.max.mediaselector.lib.config.h.a() && z10;
        return this;
    }

    public m G(String str) {
        this.f74959a.f75034e = str;
        return this;
    }

    public m H(String str) {
        this.f74959a.f75036g = str;
        return this;
    }

    public m I(oe.d dVar) {
        PictureSelectionConfig.f75018c4 = dVar;
        return this;
    }

    public m J(String str) {
        this.f74959a.f75035f = str;
        return this;
    }

    public m K(String str) {
        this.f74959a.f75037h = str;
        return this;
    }

    public m L(me.a aVar) {
        if (PictureSelectionConfig.X3 != aVar) {
            PictureSelectionConfig.X3 = aVar;
            this.f74959a.P3 = true;
        } else {
            this.f74959a.P3 = false;
        }
        return this;
    }

    public m M(me.b bVar) {
        if (PictureSelectionConfig.Y3 != bVar) {
            PictureSelectionConfig.Y3 = bVar;
        }
        return this;
    }

    public m N(oe.i iVar) {
        PictureSelectionConfig.f75022g4 = iVar;
        return this;
    }

    public m O(me.c cVar) {
        if (PictureSelectionConfig.f75016a4 != cVar) {
            PictureSelectionConfig.f75016a4 = cVar;
            this.f74959a.Q3 = true;
        } else {
            this.f74959a.Q3 = false;
        }
        return this;
    }

    public m P(long j10) {
        if (j10 >= 1048576) {
            this.f74959a.f75059y = j10;
        } else {
            this.f74959a.f75059y = j10 * 1024;
        }
        return this;
    }

    public m Q(long j10) {
        if (j10 >= 1048576) {
            this.f74959a.f75062z = j10;
        } else {
            this.f74959a.f75062z = j10 * 1024;
        }
        return this;
    }

    public m R(int i10) {
        this.f74959a.f75050r = i10 * 1000;
        return this;
    }

    public m S(int i10) {
        this.f74959a.f75051s = i10 * 1000;
        return this;
    }

    public m T(me.d dVar) {
        if (PictureSelectionConfig.W3 != dVar) {
            PictureSelectionConfig.W3 = dVar;
        }
        return this;
    }

    public m U(int i10) {
        this.f74959a.f75056x = i10;
        return this;
    }

    public m V(oe.g gVar) {
        this.f74959a.N3 = gVar != null;
        PictureSelectionConfig.f75024i4 = gVar;
        return this;
    }

    public m W(int i10) {
        this.f74959a.C = i10;
        return this;
    }

    public m X(int i10) {
        PictureSelectionConfig pictureSelectionConfig = this.f74959a;
        if (pictureSelectionConfig.f75040k == 1) {
            i10 = 1;
        }
        pictureSelectionConfig.f75041l = i10;
        return this;
    }

    public m Y(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34305mk, new Class[]{Integer.TYPE}, m.class);
        if (patchProxyResultProxy.isSupported) {
            return (m) patchProxyResultProxy.result;
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74959a;
        if (pictureSelectionConfig.f75029b == com.max.mediaselector.lib.config.h.d()) {
            i10 = 0;
        }
        pictureSelectionConfig.f75043n = i10;
        return this;
    }

    public m Z(int i10) {
        this.f74959a.f75045p = i10;
        return this;
    }

    public void a(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34463tk, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.i.a()) {
            return;
        }
        Activity activityE = this.f74960b.e();
        if (activityE == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74959a;
        pictureSelectionConfig.M3 = false;
        pictureSelectionConfig.O3 = true;
        if (PictureSelectionConfig.W3 == null) {
            throw new NullPointerException("imageEngine is null,Please implement ImageEngine");
        }
        Intent intent = new Intent(activityE, (Class<?>) PictureSelectorSupporterActivity.class);
        Fragment fragmentF = this.f74960b.f();
        if (fragmentF != null) {
            fragmentF.startActivityForResult(intent, i10);
        } else {
            activityE.startActivityForResult(intent, i10);
        }
        activityE.overridePendingTransition(PictureSelectionConfig.f75017b4.e().f75418b, R.anim.ps_anim_fade_in);
    }

    public m a0(int i10) {
        this.f74959a.f75042m = i10;
        return this;
    }

    public void b(androidx.activity.result.g<Intent> gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, bb.c.l.f34485uk, new Class[]{androidx.activity.result.g.class}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.i.a()) {
            return;
        }
        Activity activityE = this.f74960b.e();
        if (activityE == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        if (gVar == null) {
            throw new NullPointerException("ActivityResultLauncher cannot be null");
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74959a;
        pictureSelectionConfig.M3 = false;
        pictureSelectionConfig.O3 = true;
        if (PictureSelectionConfig.W3 == null) {
            throw new NullPointerException("imageEngine is null,Please implement ImageEngine");
        }
        gVar.b(new Intent(activityE, (Class<?>) PictureSelectorSupporterActivity.class));
        activityE.overridePendingTransition(PictureSelectionConfig.f75017b4.e().f75418b, R.anim.ps_anim_fade_in);
    }

    public m b0(int i10) {
        this.f74959a.f75044o = i10;
        return this;
    }

    public void c(t<LocalMedia> tVar) {
        if (PatchProxy.proxy(new Object[]{tVar}, this, changeQuickRedirect, false, bb.c.l.f34441sk, new Class[]{t.class}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.i.a()) {
            return;
        }
        Activity activityE = this.f74960b.e();
        if (activityE == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        if (tVar == null) {
            throw new NullPointerException("OnResultCallbackListener cannot be null");
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74959a;
        pictureSelectionConfig.M3 = true;
        pictureSelectionConfig.O3 = false;
        PictureSelectionConfig.f75020e4 = tVar;
        if (PictureSelectionConfig.W3 == null) {
            throw new NullPointerException("imageEngine is null,Please implement ImageEngine");
        }
        activityE.startActivity(new Intent(activityE, (Class<?>) PictureSelectorSupporterActivity.class));
        activityE.overridePendingTransition(PictureSelectionConfig.f75017b4.e().f75418b, R.anim.ps_anim_fade_in);
    }

    public m c0(int i10) {
        this.f74959a.J3 = i10;
        return this;
    }

    public m d(boolean z10) {
        this.f74959a.f75058x2 = z10;
        return this;
    }

    public m d0(oe.f fVar) {
        PictureSelectionConfig.f75026k4 = fVar;
        return this;
    }

    public m e(boolean z10) {
        this.f74959a.G = z10;
        return this;
    }

    public m e0(String str) {
        this.f74959a.X = str;
        return this;
    }

    public m f(boolean z10) {
        this.f74959a.f75039j = z10;
        return this;
    }

    public m f0(String str) {
        this.f74959a.V = str;
        return this;
    }

    public m g(boolean z10) {
        this.f74959a.L3 = z10;
        return this;
    }

    public m g0(String str) {
        this.f74959a.W = str;
        return this;
    }

    public m h(boolean z10) {
        this.f74959a.G2 = z10;
        return this;
    }

    public m h0(String str) {
        this.f74959a.T = str;
        return this;
    }

    public m i(boolean z10) {
        boolean z11 = false;
        if (z10) {
            this.f74959a.U3 = false;
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74959a;
        if (pictureSelectionConfig.f75040k == 1 && z10) {
            z11 = true;
        }
        pictureSelectionConfig.f75033d = z11;
        return this;
    }

    public m i0(String str) {
        this.f74959a.U = str;
        return this;
    }

    public m j(boolean z10) {
        this.f74959a.D = z10;
        return this;
    }

    public m j0(oe.j jVar) {
        PictureSelectionConfig.f75023h4 = jVar;
        return this;
    }

    public m k(boolean z10) {
        this.f74959a.T3 = z10;
        return this;
    }

    public m k0(oe.k kVar) {
        PictureSelectionConfig.f75025j4 = kVar;
        return this;
    }

    public m l(boolean z10) {
        this.f74959a.N = z10;
        return this;
    }

    public m l0(String... strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{strArr}, this, changeQuickRedirect, false, bb.c.l.f34328nk, new Class[]{String[].class}, m.class);
        if (patchProxyResultProxy.isSupported) {
            return (m) patchProxyResultProxy.result;
        }
        if (strArr != null && strArr.length > 0) {
            this.f74959a.Q.addAll(Arrays.asList(strArr));
        }
        return this;
    }

    public m m(boolean z10) {
        PictureSelectionConfig pictureSelectionConfig = this.f74959a;
        if (pictureSelectionConfig.f75033d) {
            pictureSelectionConfig.U3 = false;
        } else {
            pictureSelectionConfig.U3 = z10;
        }
        return this;
    }

    public m m0(String str) {
        this.f74959a.Y = str;
        return this;
    }

    public m n(boolean z10) {
        this.f74959a.E = z10;
        return this;
    }

    public m n0(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.l.f34374pk, new Class[]{String.class}, m.class);
        if (patchProxyResultProxy.isSupported) {
            return (m) patchProxyResultProxy.result;
        }
        if (!TextUtils.isEmpty(str)) {
            this.f74959a.f75030b0 = str;
        }
        return this;
    }

    public m o(boolean z10) {
        this.f74959a.f75060y1 = z10;
        return this;
    }

    public m o0(int i10) {
        this.f74959a.f75054v = i10;
        return this;
    }

    public m p(boolean z10) {
        this.f74959a.K3 = z10;
        return this;
    }

    public m p0(int i10) {
        this.f74959a.f75055w = i10;
        return this;
    }

    public m q(boolean z10) {
        this.f74959a.M = z10;
        return this;
    }

    public m q0(int i10) {
        this.f74959a.f75047p2 = i10;
        return this;
    }

    public m r(boolean z10) {
        this.f74959a.S3 = z10;
        return this;
    }

    public m r0(int i10) {
        this.f74959a.f75038i = i10;
        return this;
    }

    public m s(boolean z10) {
        this.f74959a.f75046p1 = z10;
        return this;
    }

    public m s0(me.f fVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar}, this, changeQuickRedirect, false, bb.c.l.f34259kk, new Class[]{me.f.class}, m.class);
        if (patchProxyResultProxy.isSupported) {
            return (m) patchProxyResultProxy.result;
        }
        if (!com.max.mediaselector.lib.utils.o.e() || PictureSelectionConfig.Z3 == fVar) {
            this.f74959a.R3 = false;
        } else {
            PictureSelectionConfig.Z3 = fVar;
            this.f74959a.R3 = true;
        }
        return this;
    }

    public m t(boolean z10, int i10) {
        PictureSelectionConfig pictureSelectionConfig = this.f74959a;
        pictureSelectionConfig.f75046p1 = z10;
        if (i10 < 10) {
            i10 = 60;
        }
        pictureSelectionConfig.f75032c0 = i10;
        return this;
    }

    public m t0(u uVar) {
        PictureSelectionConfig.f75019d4 = uVar;
        return this;
    }

    public m u(boolean z10, int i10, boolean z11) {
        PictureSelectionConfig pictureSelectionConfig = this.f74959a;
        pictureSelectionConfig.f75046p1 = z10;
        if (i10 < 10) {
            i10 = 60;
        }
        pictureSelectionConfig.f75032c0 = i10;
        pictureSelectionConfig.f75057x1 = z11;
        return this;
    }

    public m u0(int i10) {
        this.f74959a.f75052t = i10 * 1000;
        return this;
    }

    public m v(boolean z10, boolean z11) {
        PictureSelectionConfig pictureSelectionConfig = this.f74959a;
        pictureSelectionConfig.f75046p1 = z10;
        pictureSelectionConfig.f75057x1 = z11;
        return this;
    }

    public m v0(long j10) {
        if (j10 >= 1048576) {
            this.f74959a.A = j10;
        } else {
            this.f74959a.A = j10 * 1024;
        }
        return this;
    }

    public m w(boolean z10) {
        this.f74959a.J = z10;
        return this;
    }

    public m w0(int i10) {
        this.f74959a.f75053u = i10 * 1000;
        return this;
    }

    public m x(boolean z10) {
        this.f74959a.K = z10;
        return this;
    }

    public m x0(long j10) {
        if (j10 >= 1048576) {
            this.f74959a.B = j10;
        } else {
            this.f74959a.B = j10 * 1024;
        }
        return this;
    }

    public m y(boolean z10) {
        this.f74959a.H = z10;
        return this;
    }

    public m y0(List<LocalMedia> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.l.f34419rk, new Class[]{List.class}, m.class);
        if (patchProxyResultProxy.isSupported) {
            return (m) patchProxyResultProxy.result;
        }
        if (list == null) {
            return this;
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74959a;
        if (pictureSelectionConfig.f75040k == 1 && pictureSelectionConfig.f75033d) {
            qe.a.e();
        } else {
            qe.a.a(new ArrayList(list));
        }
        return this;
    }

    public m z(boolean z10) {
        this.f74959a.I = z10;
        return this;
    }

    public m z0(int i10) {
        PictureSelectionConfig pictureSelectionConfig = this.f74959a;
        pictureSelectionConfig.f75040k = i10;
        pictureSelectionConfig.f75041l = i10 != 1 ? pictureSelectionConfig.f75041l : 1;
        return this;
    }
}
