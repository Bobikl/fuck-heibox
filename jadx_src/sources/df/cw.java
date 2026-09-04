package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemRecommendNewcomerCardCouponBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cw implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f109532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f109536e;

    private cw(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView) {
        this.f109532a = constraintLayout;
        this.f109533b = textView;
        this.f109534c = textView2;
        this.f109535d = textView3;
        this.f109536e = hBLineHeightTextView;
    }

    @androidx.annotation.n0
    public static cw a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19672, new Class[]{View.class}, cw.class);
        if (patchProxyResultProxy.isSupported) {
            return (cw) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_action;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_action);
        if (textView != null) {
            i10 = R.id.tv_desc;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc);
            if (textView2 != null) {
                i10 = R.id.tv_value;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_value);
                if (textView3 != null) {
                    i10 = R.id.tv_value_unit;
                    HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) l3.d.a(view, R.id.tv_value_unit);
                    if (hBLineHeightTextView != null) {
                        return new cw((ConstraintLayout) view, textView, textView2, textView3, hBLineHeightTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static cw c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19670, new Class[]{LayoutInflater.class}, cw.class);
        return patchProxyResultProxy.isSupported ? (cw) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static cw d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19671, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, cw.class);
        if (patchProxyResultProxy.isSupported) {
            return (cw) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_recommend_newcomer_card_coupon, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f109532a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19673, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
