package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.GradientTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGroupBuyUserOrderSuccessBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ao implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f108598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f108600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108601d;

    private ao(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 GradientTextView gradientTextView, @androidx.annotation.n0 TextView textView) {
        this.f108598a = relativeLayout;
        this.f108599b = linearLayout;
        this.f108600c = gradientTextView;
        this.f108601d = textView;
    }

    @androidx.annotation.n0
    public static ao a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18836, new Class[]{View.class}, ao.class);
        if (patchProxyResultProxy.isSupported) {
            return (ao) patchProxyResultProxy.result;
        }
        int i10 = R.id.ll_user_info;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_user_info);
        if (linearLayout != null) {
            i10 = R.id.tv_order_desc;
            GradientTextView gradientTextView = (GradientTextView) l3.d.a(view, R.id.tv_order_desc);
            if (gradientTextView != null) {
                i10 = R.id.tv_time_desc;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_time_desc);
                if (textView != null) {
                    return new ao((RelativeLayout) view, linearLayout, gradientTextView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ao c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18834, new Class[]{LayoutInflater.class}, ao.class);
        return patchProxyResultProxy.isSupported ? (ao) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ao d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18835, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ao.class);
        if (patchProxyResultProxy.isSupported) {
            return (ao) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_group_buy_user_order_success, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f108598a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18837, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
