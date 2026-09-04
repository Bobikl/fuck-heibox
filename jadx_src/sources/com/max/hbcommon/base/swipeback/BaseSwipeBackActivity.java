package com.max.hbcommon.base.swipeback;

import android.app.Activity;
import android.os.Bundle;
import bb.c;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.swipebacklayout.ActivitySwipeBackLayout;
import com.max.hbcustomview.swipebacklayout.b;
import com.max.hbcustomview.swipebacklayout.d;
import com.max.hbcustomview.swipebacklayout.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes9.dex */
public class BaseSwipeBackActivity extends BaseActivity implements b {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Activity L;
    private d M;

    public boolean M1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31430o3, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f0().getSwipeBackEnable();
    }

    public boolean N1() {
        return true;
    }

    public boolean O1() {
        return true;
    }

    public void Q1(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.d.f31407n3, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0().setEnableGesture(z10);
    }

    @Override // com.max.hbcustomview.swipebacklayout.b
    public ActivitySwipeBackLayout f0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31384m3, new Class[0], ActivitySwipeBackLayout.class);
        return patchProxyResultProxy.isSupported ? (ActivitySwipeBackLayout) patchProxyResultProxy.result : this.M.c();
    }

    @Override // com.max.hbcommon.base.BaseActivity, android.app.Activity
    public void finish() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31453p3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.finish();
        this.M.b();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, c.d.f31315j3, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        this.L = this;
        d dVar = new d(this);
        this.M = dVar;
        dVar.d(N1());
        Q1(O1());
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void onEnterAnimationComplete() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31361l3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onEnterAnimationComplete();
        if (!f0().f69522f || f0().f69528l) {
            return;
        }
        if (f0().D()) {
            e.h(this.L);
        } else {
            e.g(this.L);
        }
        f0().f69527k = false;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, c.d.f31338k3, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onPostCreate(bundle);
        this.M.e();
    }
}
