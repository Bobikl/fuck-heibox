package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemPurchaseParamBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class mu implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f113527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113531e;

    private mu(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f113527a = linearLayout;
        this.f113528b = textView;
        this.f113529c = textView2;
        this.f113530d = textView3;
        this.f113531e = relativeLayout;
    }

    @androidx.annotation.n0
    public static mu a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19504, new Class[]{View.class}, mu.class);
        if (patchProxyResultProxy.isSupported) {
            return (mu) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_faq;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_faq);
        if (textView != null) {
            i10 = R.id.tv_option;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_option);
            if (textView2 != null) {
                i10 = R.id.tv_option_desc;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_option_desc);
                if (textView3 != null) {
                    i10 = R.id.vg_title;
                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_title);
                    if (relativeLayout != null) {
                        return new mu((LinearLayout) view, textView, textView2, textView3, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static mu c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19502, new Class[]{LayoutInflater.class}, mu.class);
        return patchProxyResultProxy.isSupported ? (mu) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static mu d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19503, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, mu.class);
        if (patchProxyResultProxy.isSupported) {
            return (mu) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_purchase_param, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f113527a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19505, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
