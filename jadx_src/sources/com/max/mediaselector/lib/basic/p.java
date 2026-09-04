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
import java.util.Arrays;
import oe.t;
import oe.u;

/* JADX INFO: compiled from: PictureSelectionSystemModel.java */
/* JADX INFO: loaded from: classes2.dex */
public final class p {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PictureSelectionConfig f74971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f74972b;

    public p(q qVar, int i10) {
        this.f74972b = qVar;
        PictureSelectionConfig pictureSelectionConfigB = PictureSelectionConfig.b();
        this.f74971a = pictureSelectionConfigB;
        pictureSelectionConfigB.f75029b = i10;
        pictureSelectionConfigB.K = false;
        pictureSelectionConfigB.L = false;
    }

    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Gk, new Class[0], Void.TYPE).isSupported || com.max.mediaselector.lib.utils.i.a()) {
            return;
        }
        Activity activityE = this.f74972b.e();
        if (activityE == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        if (!(activityE instanceof b)) {
            throw new NullPointerException("Use only forSystemResult();,Activity or Fragment interface needs to be implemented " + b.class);
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74971a;
        pictureSelectionConfig.O3 = true;
        FragmentManager supportFragmentManager = null;
        PictureSelectionConfig.f75020e4 = null;
        pictureSelectionConfig.M3 = false;
        if (activityE instanceof AppCompatActivity) {
            supportFragmentManager = ((AppCompatActivity) activityE).getSupportFragmentManager();
        } else if (activityE instanceof FragmentActivity) {
            supportFragmentManager = ((FragmentActivity) activityE).getSupportFragmentManager();
        }
        if (supportFragmentManager == null) {
            throw new NullPointerException("FragmentManager cannot be null");
        }
        String str = com.max.mediaselector.lib.g.f75232r;
        Fragment fragmentS0 = supportFragmentManager.s0(str);
        if (fragmentS0 != null) {
            supportFragmentManager.u().x(fragmentS0).n();
        }
        a.b(supportFragmentManager, str, com.max.mediaselector.lib.g.b5());
    }

    public void b(t<LocalMedia> tVar) {
        if (PatchProxy.proxy(new Object[]{tVar}, this, changeQuickRedirect, false, bb.c.l.Fk, new Class[]{t.class}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.i.a()) {
            return;
        }
        Activity activityE = this.f74972b.e();
        if (activityE == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        if (tVar == null) {
            throw new NullPointerException("OnResultCallbackListener cannot be null");
        }
        PictureSelectionConfig.f75020e4 = tVar;
        PictureSelectionConfig pictureSelectionConfig = this.f74971a;
        pictureSelectionConfig.M3 = true;
        pictureSelectionConfig.O3 = false;
        FragmentManager supportFragmentManager = null;
        if (activityE instanceof AppCompatActivity) {
            supportFragmentManager = ((AppCompatActivity) activityE).getSupportFragmentManager();
        } else if (activityE instanceof FragmentActivity) {
            supportFragmentManager = ((FragmentActivity) activityE).getSupportFragmentManager();
        }
        if (supportFragmentManager == null) {
            throw new NullPointerException("FragmentManager cannot be null");
        }
        String str = com.max.mediaselector.lib.g.f75232r;
        Fragment fragmentS0 = supportFragmentManager.s0(str);
        if (fragmentS0 != null) {
            supportFragmentManager.u().x(fragmentS0).n();
        }
        a.b(supportFragmentManager, str, com.max.mediaselector.lib.g.b5());
    }

    public void c(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Hk, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.i.a()) {
            return;
        }
        Activity activityE = this.f74972b.e();
        if (activityE == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74971a;
        pictureSelectionConfig.M3 = false;
        pictureSelectionConfig.O3 = true;
        Intent intent = new Intent(activityE, (Class<?>) PictureSelectorTransparentActivity.class);
        intent.putExtra(com.max.mediaselector.lib.config.e.f75112q, 1);
        Fragment fragmentF = this.f74972b.f();
        if (fragmentF != null) {
            fragmentF.startActivityForResult(intent, i10);
        } else {
            activityE.startActivityForResult(intent, i10);
        }
        activityE.overridePendingTransition(R.anim.ps_anim_fade_in, 0);
    }

    public void d(androidx.activity.result.g<Intent> gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, bb.c.l.Ik, new Class[]{androidx.activity.result.g.class}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.i.a()) {
            return;
        }
        Activity activityE = this.f74972b.e();
        if (activityE == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        if (gVar == null) {
            throw new NullPointerException("ActivityResultLauncher cannot be null");
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74971a;
        pictureSelectionConfig.M3 = false;
        pictureSelectionConfig.O3 = true;
        Intent intent = new Intent(activityE, (Class<?>) PictureSelectorTransparentActivity.class);
        intent.putExtra(com.max.mediaselector.lib.config.e.f75112q, 1);
        gVar.b(intent);
        activityE.overridePendingTransition(R.anim.ps_anim_fade_in, 0);
    }

    public void e(t<LocalMedia> tVar) {
        if (PatchProxy.proxy(new Object[]{tVar}, this, changeQuickRedirect, false, bb.c.l.Jk, new Class[]{t.class}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.i.a()) {
            return;
        }
        Activity activityE = this.f74972b.e();
        if (activityE == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        if (tVar == null) {
            throw new NullPointerException("OnResultCallbackListener cannot be null");
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74971a;
        pictureSelectionConfig.M3 = true;
        pictureSelectionConfig.O3 = false;
        PictureSelectionConfig.f75020e4 = tVar;
        Intent intent = new Intent(activityE, (Class<?>) PictureSelectorTransparentActivity.class);
        intent.putExtra(com.max.mediaselector.lib.config.e.f75112q, 1);
        activityE.startActivity(intent);
        activityE.overridePendingTransition(R.anim.ps_anim_fade_in, 0);
    }

    public p f(boolean z10) {
        this.f74971a.S = z10;
        return this;
    }

    public p g(me.a aVar) {
        if (PictureSelectionConfig.X3 != aVar) {
            PictureSelectionConfig.X3 = aVar;
            this.f74971a.P3 = true;
        } else {
            this.f74971a.P3 = false;
        }
        return this;
    }

    public p h(me.b bVar) {
        if (PictureSelectionConfig.Y3 != bVar) {
            PictureSelectionConfig.Y3 = bVar;
        }
        return this;
    }

    public p i(oe.j jVar) {
        PictureSelectionConfig.f75023h4 = jVar;
        return this;
    }

    public p j(me.f fVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar}, this, changeQuickRedirect, false, bb.c.l.Ek, new Class[]{me.f.class}, p.class);
        if (patchProxyResultProxy.isSupported) {
            return (p) patchProxyResultProxy.result;
        }
        if (!com.max.mediaselector.lib.utils.o.e() || PictureSelectionConfig.Z3 == fVar) {
            this.f74971a.R3 = false;
        } else {
            PictureSelectionConfig.Z3 = fVar;
            this.f74971a.R3 = true;
        }
        return this;
    }

    public p k(u uVar) {
        PictureSelectionConfig.f75019d4 = uVar;
        return this;
    }

    public p l(int i10) {
        this.f74971a.f75052t = i10 * 1000;
        return this;
    }

    public p m(long j10) {
        if (j10 >= 1048576) {
            this.f74971a.A = j10;
        } else {
            this.f74971a.A = j10 * 1024;
        }
        return this;
    }

    public p n(int i10) {
        this.f74971a.f75053u = i10 * 1000;
        return this;
    }

    public p o(long j10) {
        if (j10 >= 1048576) {
            this.f74971a.B = j10;
        } else {
            this.f74971a.B = j10 * 1024;
        }
        return this;
    }

    public p p(int i10) {
        this.f74971a.f75040k = i10;
        return this;
    }

    public p q(String... strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{strArr}, this, changeQuickRedirect, false, bb.c.l.Dk, new Class[]{String[].class}, p.class);
        if (patchProxyResultProxy.isSupported) {
            return (p) patchProxyResultProxy.result;
        }
        if (strArr != null && strArr.length > 0) {
            this.f74971a.R.addAll(Arrays.asList(strArr));
        }
        return this;
    }
}
