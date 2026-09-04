package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: MarkerViewPriceTrendV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class qc0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f114853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114857e;

    private qc0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f114853a = linearLayout;
        this.f114854b = textView;
        this.f114855c = textView2;
        this.f114856d = textView3;
        this.f114857e = textView4;
    }

    @androidx.annotation.n0
    public static qc0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21377, new Class[]{View.class}, qc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (qc0) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_current_other_price;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_current_other_price);
        if (textView != null) {
            i10 = R.id.tv_date;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_date);
            if (textView2 != null) {
                i10 = R.id.tv_discount;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_discount);
                if (textView3 != null) {
                    i10 = R.id.tv_price;
                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_price);
                    if (textView4 != null) {
                        return new qc0((LinearLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static qc0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21375, new Class[]{LayoutInflater.class}, qc0.class);
        return patchProxyResultProxy.isSupported ? (qc0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static qc0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21376, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, qc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (qc0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.marker_view_price_trend_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f114853a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21378, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
