package com.max.xiaoheihe.module.game;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class CouponGivingActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CouponGivingActivity f84069b;

    @androidx.annotation.i1
    public CouponGivingActivity_ViewBinding(CouponGivingActivity couponGivingActivity) {
        this(couponGivingActivity, couponGivingActivity.getWindow().getDecorView());
    }

    @androidx.annotation.i1
    public CouponGivingActivity_ViewBinding(CouponGivingActivity couponGivingActivity, View view) {
        this.f84069b = couponGivingActivity;
        couponGivingActivity.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
        couponGivingActivity.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        couponGivingActivity.et_search = (EditText) butterknife.internal.f.f(view, R.id.et_search_friend, "field 'et_search'", EditText.class);
        couponGivingActivity.tv_confirm = (TextView) butterknife.internal.f.f(view, R.id.tv_confirm, "field 'tv_confirm'", TextView.class);
        couponGivingActivity.vg_empty = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_empty, "field 'vg_empty'", ViewGroup.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32345, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        CouponGivingActivity couponGivingActivity = this.f84069b;
        if (couponGivingActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84069b = null;
        couponGivingActivity.mRecyclerView = null;
        couponGivingActivity.mRefreshLayout = null;
        couponGivingActivity.et_search = null;
        couponGivingActivity.tv_confirm = null;
        couponGivingActivity.vg_empty = null;
    }
}
