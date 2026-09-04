package com.max.mediaselector.lib;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.utils.o;
import com.max.mediaselector.lib.utils.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import oe.j;

/* JADX INFO: compiled from: PictureOnlyCameraFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends com.max.mediaselector.lib.basic.g {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f74804n = a.class.getSimpleName();

    /* JADX INFO: renamed from: com.max.mediaselector.lib.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PictureOnlyCameraFragment.java */
    public class C0598a implements re.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0598a() {
        }

        @Override // re.c
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34453ta, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            a.this.Q2();
        }

        @Override // re.c
        public void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34475ua, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            a.this.p2(re.b.f138890c);
        }
    }

    public static a M4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.l.f34341oa, new Class[0], a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : new a();
    }

    @Override // com.max.mediaselector.lib.basic.g, com.max.mediaselector.lib.basic.c
    public void H1(String[] strArr) {
        boolean zC;
        if (PatchProxy.proxy(new Object[]{strArr}, this, changeQuickRedirect, false, bb.c.l.f34431sa, new Class[]{String[].class}, Void.TYPE).isSupported) {
            return;
        }
        j jVar = PictureSelectionConfig.f75023h4;
        if (jVar != null) {
            zC = jVar.b(this, strArr);
        } else {
            zC = re.a.c(getContext());
            if (!o.e()) {
                zC = re.a.e(getContext());
            }
        }
        if (zC) {
            Q2();
            return;
        }
        if (!re.a.c(getContext())) {
            t.c(getContext(), getString(R.string.ps_camera));
        } else if (!re.a.e(getContext())) {
            t.c(getContext(), getString(R.string.ps_jurisdiction));
        }
        x1();
    }

    @Override // com.max.mediaselector.lib.basic.g, com.max.mediaselector.lib.basic.c
    public int I() {
        return R.layout.ps_empty;
    }

    @Override // com.max.mediaselector.lib.basic.g, com.max.mediaselector.lib.basic.c
    public void c0(LocalMedia localMedia) {
        if (PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, bb.c.l.f34387qa, new Class[]{LocalMedia.class}, Void.TYPE).isSupported) {
            return;
        }
        if (O0(localMedia, false) == 0) {
            i4();
        } else {
            x1();
        }
    }

    @Override // com.max.mediaselector.lib.basic.g
    public String k4() {
        return f74804n;
    }

    @Override // com.max.mediaselector.lib.basic.g, androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.f34409ra, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i11 == 0) {
            x1();
        }
    }

    @Override // com.max.mediaselector.lib.basic.g, androidx.fragment.app.Fragment
    public void onViewCreated(@n0 View view, @p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, bb.c.l.f34364pa, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        if (o.e()) {
            Q2();
        } else {
            re.a.b().i(this, re.b.f138890c, new C0598a());
        }
    }
}
