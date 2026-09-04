package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemMallCartOrderMultiProductInfoBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wp implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f117231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f117232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117233f;

    private wp(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 View view, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f117228a = relativeLayout;
        this.f117229b = textView;
        this.f117230c = textView2;
        this.f117231d = view;
        this.f117232e = constraintLayout;
        this.f117233f = linearLayout;
    }

    @androidx.annotation.n0
    public static wp a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19028, new Class[]{View.class}, wp.class);
        if (patchProxyResultProxy.isSupported) {
            return (wp) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_count;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_count);
        if (textView != null) {
            i10 = R.id.tv_count_desc;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_count_desc);
            if (textView2 != null) {
                i10 = R.id.v_divider;
                View viewA = l3.d.a(view, R.id.v_divider);
                if (viewA != null) {
                    i10 = R.id.vg_count;
                    ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.vg_count);
                    if (constraintLayout != null) {
                        i10 = R.id.vg_product;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_product);
                        if (linearLayout != null) {
                            return new wp((RelativeLayout) view, textView, textView2, viewA, constraintLayout, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static wp c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19026, new Class[]{LayoutInflater.class}, wp.class);
        return patchProxyResultProxy.isSupported ? (wp) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static wp d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19027, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, wp.class);
        if (patchProxyResultProxy.isSupported) {
            return (wp) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_mall_cart_order_multi_product_info, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117228a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19029, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
