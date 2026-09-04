package com.max.mediaselector.lib.basic;

import android.app.Activity;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import oe.t;
import oe.u;

/* JADX INFO: compiled from: PictureSelectionCameraModel.java */
/* JADX INFO: loaded from: classes2.dex */
public final class l {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PictureSelectionConfig f74956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f74957b;

    public l(q qVar, int i10) {
        this.f74957b = qVar;
        PictureSelectionConfig pictureSelectionConfigB = PictureSelectionConfig.b();
        this.f74956a = pictureSelectionConfigB;
        pictureSelectionConfigB.f75029b = i10;
        pictureSelectionConfigB.f75031c = true;
        pictureSelectionConfigB.T3 = false;
        pictureSelectionConfigB.K = false;
        pictureSelectionConfigB.L = false;
        pictureSelectionConfigB.M = false;
    }

    public l A(int i10) {
        this.f74956a.f75054v = i10;
        return this;
    }

    public l B(int i10) {
        this.f74956a.f75055w = i10;
        return this;
    }

    public l C(me.f fVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar}, this, changeQuickRedirect, false, bb.c.l.f34053bk, new Class[]{me.f.class}, l.class);
        if (patchProxyResultProxy.isSupported) {
            return (l) patchProxyResultProxy.result;
        }
        if (!com.max.mediaselector.lib.utils.o.e() || PictureSelectionConfig.Z3 == fVar) {
            this.f74956a.R3 = false;
        } else {
            PictureSelectionConfig.Z3 = fVar;
            this.f74956a.R3 = true;
        }
        return this;
    }

    public l D(u uVar) {
        PictureSelectionConfig.f75019d4 = uVar;
        return this;
    }

    public l E(int i10) {
        this.f74956a.f75052t = i10 * 1000;
        return this;
    }

    public l F(long j10) {
        if (j10 >= 1048576) {
            this.f74956a.A = j10;
        } else {
            this.f74956a.A = j10 * 1024;
        }
        return this;
    }

    public l G(int i10) {
        this.f74956a.f75053u = i10 * 1000;
        return this;
    }

    public l H(long j10) {
        if (j10 >= 1048576) {
            this.f74956a.B = j10;
        } else {
            this.f74956a.B = j10 * 1024;
        }
        return this;
    }

    public l I(List<LocalMedia> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.l.f34076ck, new Class[]{List.class}, l.class);
        if (patchProxyResultProxy.isSupported) {
            return (l) patchProxyResultProxy.result;
        }
        if (list == null) {
            return this;
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74956a;
        if (pictureSelectionConfig.f75040k == 1 && pictureSelectionConfig.f75033d) {
            qe.a.e();
        } else {
            qe.a.a(new ArrayList(list));
        }
        return this;
    }

    @Deprecated
    public l J(int i10) {
        this.f74956a.f75049q = i10;
        return this;
    }

    public com.max.mediaselector.lib.a a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34145fk, new Class[0], com.max.mediaselector.lib.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.mediaselector.lib.a) patchProxyResultProxy.result;
        }
        Activity activityE = this.f74957b.e();
        if (activityE == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        if (!(activityE instanceof b)) {
            throw new NullPointerException("Use only build PictureOnlyCameraFragment,Activity or Fragment interface needs to be implemented " + b.class);
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74956a;
        pictureSelectionConfig.M3 = false;
        pictureSelectionConfig.O3 = true;
        PictureSelectionConfig.f75020e4 = null;
        return new com.max.mediaselector.lib.a();
    }

    public com.max.mediaselector.lib.a b(int i10, t<LocalMedia> tVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), tVar}, this, changeQuickRedirect, false, bb.c.l.f34168gk, new Class[]{Integer.TYPE, t.class}, com.max.mediaselector.lib.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.mediaselector.lib.a) patchProxyResultProxy.result;
        }
        Activity activityE = this.f74957b.e();
        if (activityE == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        if (tVar == null) {
            throw new NullPointerException("OnResultCallbackListener cannot be null");
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74956a;
        pictureSelectionConfig.M3 = true;
        pictureSelectionConfig.O3 = false;
        PictureSelectionConfig.f75020e4 = tVar;
        FragmentManager supportFragmentManager = null;
        if (activityE instanceof AppCompatActivity) {
            supportFragmentManager = ((AppCompatActivity) activityE).getSupportFragmentManager();
        } else if (activityE instanceof FragmentActivity) {
            supportFragmentManager = ((FragmentActivity) activityE).getSupportFragmentManager();
        }
        if (supportFragmentManager == null) {
            throw new NullPointerException("FragmentManager cannot be null");
        }
        com.max.mediaselector.lib.a aVar = new com.max.mediaselector.lib.a();
        Fragment fragmentS0 = supportFragmentManager.s0(aVar.k4());
        if (fragmentS0 != null) {
            supportFragmentManager.u().x(fragmentS0).n();
        }
        supportFragmentManager.u().c(i10, aVar, aVar.k4()).k(aVar.k4()).n();
        return aVar;
    }

    public void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34099dk, new Class[0], Void.TYPE).isSupported || com.max.mediaselector.lib.utils.i.a()) {
            return;
        }
        Activity activityE = this.f74957b.e();
        if (activityE == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74956a;
        pictureSelectionConfig.M3 = false;
        pictureSelectionConfig.O3 = true;
        FragmentManager supportFragmentManager = null;
        if (activityE instanceof AppCompatActivity) {
            supportFragmentManager = ((AppCompatActivity) activityE).getSupportFragmentManager();
        } else if (activityE instanceof FragmentActivity) {
            supportFragmentManager = ((FragmentActivity) activityE).getSupportFragmentManager();
        }
        if (supportFragmentManager == null) {
            throw new NullPointerException("FragmentManager cannot be null");
        }
        if (!(activityE instanceof b)) {
            throw new NullPointerException("Use only camera openCamera mode,Activity or Fragment interface needs to be implemented " + b.class);
        }
        String str = com.max.mediaselector.lib.a.f74804n;
        Fragment fragmentS0 = supportFragmentManager.s0(str);
        if (fragmentS0 != null) {
            supportFragmentManager.u().x(fragmentS0).n();
        }
        a.b(supportFragmentManager, str, com.max.mediaselector.lib.a.M4());
    }

    public void d(t<LocalMedia> tVar) {
        if (PatchProxy.proxy(new Object[]{tVar}, this, changeQuickRedirect, false, bb.c.l.f34122ek, new Class[]{t.class}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.i.a()) {
            return;
        }
        Activity activityE = this.f74957b.e();
        if (activityE == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        if (tVar == null) {
            throw new NullPointerException("OnResultCallbackListener cannot be null");
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74956a;
        pictureSelectionConfig.M3 = true;
        pictureSelectionConfig.O3 = false;
        PictureSelectionConfig.f75020e4 = tVar;
        FragmentManager supportFragmentManager = null;
        if (activityE instanceof AppCompatActivity) {
            supportFragmentManager = ((AppCompatActivity) activityE).getSupportFragmentManager();
        } else if (activityE instanceof FragmentActivity) {
            supportFragmentManager = ((FragmentActivity) activityE).getSupportFragmentManager();
        }
        if (supportFragmentManager == null) {
            throw new NullPointerException("FragmentManager cannot be null");
        }
        String str = com.max.mediaselector.lib.a.f74804n;
        Fragment fragmentS0 = supportFragmentManager.s0(str);
        if (fragmentS0 != null) {
            supportFragmentManager.u().x(fragmentS0).n();
        }
        a.b(supportFragmentManager, str, com.max.mediaselector.lib.a.M4());
    }

    public void e(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34191hk, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.i.a()) {
            return;
        }
        Activity activityE = this.f74957b.e();
        if (activityE == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74956a;
        pictureSelectionConfig.M3 = false;
        pictureSelectionConfig.O3 = true;
        Intent intent = new Intent(activityE, (Class<?>) PictureSelectorTransparentActivity.class);
        Fragment fragmentF = this.f74957b.f();
        if (fragmentF != null) {
            fragmentF.startActivityForResult(intent, i10);
        } else {
            activityE.startActivityForResult(intent, i10);
        }
        activityE.overridePendingTransition(R.anim.ps_anim_fade_in, 0);
    }

    public void f(androidx.activity.result.g<Intent> gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, bb.c.l.f34213ik, new Class[]{androidx.activity.result.g.class}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.i.a()) {
            return;
        }
        Activity activityE = this.f74957b.e();
        if (activityE == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        if (gVar == null) {
            throw new NullPointerException("ActivityResultLauncher cannot be null");
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74956a;
        pictureSelectionConfig.M3 = false;
        pictureSelectionConfig.O3 = true;
        gVar.b(new Intent(activityE, (Class<?>) PictureSelectorTransparentActivity.class));
        activityE.overridePendingTransition(R.anim.ps_anim_fade_in, 0);
    }

    public void g(t<LocalMedia> tVar) {
        if (PatchProxy.proxy(new Object[]{tVar}, this, changeQuickRedirect, false, bb.c.l.f34236jk, new Class[]{t.class}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.i.a()) {
            return;
        }
        Activity activityE = this.f74957b.e();
        if (activityE == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        if (tVar == null) {
            throw new NullPointerException("OnResultCallbackListener cannot be null");
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74956a;
        pictureSelectionConfig.M3 = true;
        pictureSelectionConfig.O3 = false;
        PictureSelectionConfig.f75020e4 = tVar;
        activityE.startActivity(new Intent(activityE, (Class<?>) PictureSelectorTransparentActivity.class));
        activityE.overridePendingTransition(R.anim.ps_anim_fade_in, 0);
    }

    public l h(boolean z10) {
        this.f74956a.f75039j = z10;
        return this;
    }

    public l i(boolean z10) {
        this.f74956a.L3 = z10;
        return this;
    }

    public l j(boolean z10) {
        this.f74956a.G2 = z10;
        return this;
    }

    public l k(boolean z10) {
        PictureSelectionConfig pictureSelectionConfig = this.f74956a;
        pictureSelectionConfig.S3 = z10;
        pictureSelectionConfig.S = z10;
        return this;
    }

    public l l(boolean z10) {
        this.f74956a.f75061y2 = z10;
        return this;
    }

    public l m(String str) {
        this.f74956a.f75034e = str;
        return this;
    }

    public l n(String str) {
        this.f74956a.f75036g = str;
        return this;
    }

    public l o(oe.d dVar) {
        PictureSelectionConfig.f75018c4 = dVar;
        return this;
    }

    public l p(String str) {
        this.f74956a.f75035f = str;
        return this;
    }

    public l q(String str) {
        this.f74956a.f75037h = str;
        return this;
    }

    public l r(me.a aVar) {
        if (PictureSelectionConfig.X3 != aVar) {
            PictureSelectionConfig.X3 = aVar;
            this.f74956a.P3 = true;
        } else {
            this.f74956a.P3 = false;
        }
        return this;
    }

    public l s(me.b bVar) {
        if (PictureSelectionConfig.Y3 != bVar) {
            PictureSelectionConfig.Y3 = bVar;
        }
        return this;
    }

    public l t(int i10) {
        this.f74956a.J3 = i10;
        return this;
    }

    public l u(String str) {
        this.f74956a.X = str;
        return this;
    }

    public l v(String str) {
        this.f74956a.V = str;
        return this;
    }

    public l w(String str) {
        this.f74956a.W = str;
        return this;
    }

    public l x(String str) {
        this.f74956a.T = str;
        return this;
    }

    public l y(String str) {
        this.f74956a.U = str;
        return this;
    }

    public l z(oe.j jVar) {
        PictureSelectionConfig.f75023h4 = jVar;
        return this;
    }
}
