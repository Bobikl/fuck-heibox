package com.max.xiaoheihe.module.mall;

import android.view.View;
import androidx.annotation.i1;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class MallProductDetailActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MallProductDetailActivity f89677b;

    @i1
    public MallProductDetailActivity_ViewBinding(MallProductDetailActivity mallProductDetailActivity) {
        this(mallProductDetailActivity, mallProductDetailActivity.getWindow().getDecorView());
    }

    @i1
    public MallProductDetailActivity_ViewBinding(MallProductDetailActivity mallProductDetailActivity, View view) {
        this.f89677b = mallProductDetailActivity;
        mallProductDetailActivity.mPurchaseView = butterknife.internal.f.e(view, R.id.vg_purchase, "field 'mPurchaseView'");
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40348, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MallProductDetailActivity mallProductDetailActivity = this.f89677b;
        if (mallProductDetailActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f89677b = null;
        mallProductDetailActivity.mPurchaseView = null;
    }
}
