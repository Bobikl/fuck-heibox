package com.max.xiaoheihe.module.mall;

import android.view.View;
import androidx.annotation.i1;
import butterknife.Unbinder;
import com.max.hbcustomview.ViewPagerFixed;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class MallOrderListFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MallOrderListFragment f89652b;

    @i1
    public MallOrderListFragment_ViewBinding(MallOrderListFragment mallOrderListFragment, View view) {
        this.f89652b = mallOrderListFragment;
        mallOrderListFragment.vp = (ViewPagerFixed) butterknife.internal.f.f(view, R.id.vp, "field 'vp'", ViewPagerFixed.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40283, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MallOrderListFragment mallOrderListFragment = this.f89652b;
        if (mallOrderListFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f89652b = null;
        mallOrderListFragment.vp = null;
    }
}
