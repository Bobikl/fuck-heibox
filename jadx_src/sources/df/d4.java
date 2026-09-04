package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ComponentNormalPriceBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d4 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f109606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109611f;

    private d4(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f109606a = relativeLayout;
        this.f109607b = textView;
        this.f109608c = textView2;
        this.f109609d = textView3;
        this.f109610e = textView4;
        this.f109611f = relativeLayout2;
    }

    @androidx.annotation.n0
    public static d4 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16772, new Class[]{View.class}, d4.class);
        if (patchProxyResultProxy.isSupported) {
            return (d4) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_current_price;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_current_price);
        if (textView != null) {
            i10 = R.id.tv_current_price_symbol;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_current_price_symbol);
            if (textView2 != null) {
                i10 = R.id.tv_lowest_in_history;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_lowest_in_history);
                if (textView3 != null) {
                    i10 = R.id.tv_original_price;
                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_original_price);
                    if (textView4 != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        return new d4(relativeLayout, textView, textView2, textView3, textView4, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static d4 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16770, new Class[]{LayoutInflater.class}, d4.class);
        return patchProxyResultProxy.isSupported ? (d4) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static d4 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16771, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, d4.class);
        if (patchProxyResultProxy.isSupported) {
            return (d4) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.component_normal_price, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f109606a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16773, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
