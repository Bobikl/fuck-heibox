package com.max.hbcommon.base;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.fragment.app.FragmentManager;
import com.max.hbcommon.R;
import com.max.hbutils.utils.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: BaseDialogFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class c extends androidx.fragment.app.j implements f {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f66866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private io.reactivex.disposables.a f66867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected l3.c f66868d;

    public abstract boolean L3();

    public void M3(@n0 FragmentManager fragmentManager, @p0 String str) {
        if (PatchProxy.proxy(new Object[]{fragmentManager, str}, this, changeQuickRedirect, false, bb.c.b.Tu, new Class[]{FragmentManager.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            showNow(fragmentManager, str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void addDisposable(io.reactivex.disposables.b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.b.Vu, new Class[]{io.reactivex.disposables.b.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f66867c == null) {
            this.f66867c = new io.reactivex.disposables.a();
        }
        this.f66867c.c(bVar);
    }

    public void clearCompositeDisposable() {
        io.reactivex.disposables.a aVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Wu, new Class[0], Void.TYPE).isSupported || (aVar = this.f66867c) == null) {
            return;
        }
        aVar.f();
    }

    public f getBaseView() {
        return this;
    }

    public io.reactivex.disposables.a getCompositeDisposable() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Uu, new Class[0], io.reactivex.disposables.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.disposables.a) patchProxyResultProxy.result;
        }
        if (this.f66867c == null) {
            this.f66867c = new io.reactivex.disposables.a();
        }
        return this.f66867c;
    }

    @Override // com.max.hbcommon.base.f
    public Context getViewContext() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Su, new Class[0], Context.class);
        return patchProxyResultProxy.isSupported ? (Context) patchProxyResultProxy.result : getContext();
    }

    @Override // com.max.hbcommon.base.f
    public boolean isActive() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Ru, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f66866b && isAdded();
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onCreate(@p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.b.Mu, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        setStyle(0, R.style.FullScreenDialog);
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Qu, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        this.f66868d = null;
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Ou, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        this.f66866b = true;
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Pu, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
        this.f66866b = false;
        clearCompositeDisposable();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, @p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, bb.c.b.Nu, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        Window window = getDialog().getWindow();
        if (!L3() || window == null) {
            return;
        }
        t.h0(getDialog().getWindow());
    }
}
