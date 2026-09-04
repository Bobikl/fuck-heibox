package com.max.xiaoheihe.module.mall.newcomer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.NewcomerCouponObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.k80;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: NewcomerDialogCouponComponet.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class a implements com.max.hbcommon.view.a.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f90913b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final NewcomerCouponObj f90914a;

    public a(@d NewcomerCouponObj coupoon) {
        f0.p(coupoon, "coupoon");
        this.f90914a = coupoon;
    }

    @Override // com.max.hbcommon.view.a.h
    @d
    public ViewGroup.LayoutParams a(@e Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 42061, new Class[]{Context.class}, ViewGroup.LayoutParams.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup.LayoutParams) patchProxyResultProxy.result;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.leftMargin = ViewUtils.f(context, 20.0f);
        marginLayoutParams.rightMargin = ViewUtils.f(context, 20.0f);
        return marginLayoutParams;
    }

    @Override // com.max.hbcommon.view.a.h
    @d
    public View b(@e Context context) {
        Integer coupon_type;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 42060, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        k80 k80VarC = k80.c(LayoutInflater.from(context));
        f0.o(k80VarC, "inflate(LayoutInflater.from(context))");
        Integer coupon_type2 = this.f90914a.getCoupon_type();
        if ((coupon_type2 != null && coupon_type2.intValue() == 1) || ((coupon_type = this.f90914a.getCoupon_type()) != null && coupon_type.intValue() == 2)) {
            k80VarC.f112478h.setVisibility(0);
            k80VarC.f112474d.setVisibility(8);
            k80VarC.f112476f.setText(this.f90914a.getValue());
        } else {
            k80VarC.f112478h.setVisibility(8);
            k80VarC.f112474d.setVisibility(0);
            if (n.q(this.f90914a.getValue()) % 10 == 0) {
                k80VarC.f112476f.setText(String.valueOf(n.q(this.f90914a.getValue()) / 10));
            } else {
                k80VarC.f112476f.setText(this.f90914a.getValue());
            }
        }
        k80VarC.f112475e.setText(this.f90914a.getSub_title());
        k80VarC.f112473c.setText(this.f90914a.getDescription());
        k80VarC.f112477g.setBackground(q.t(context, R.color.coupon_orange, 5.0f));
        CardView cardViewB = k80VarC.b();
        f0.o(cardViewB, "viewBinding.root");
        return cardViewB;
    }
}
