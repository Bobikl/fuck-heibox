package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.GradientTextView;
import com.max.hbcustomview.chart.RadarView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameMultiDimensionRadarBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class el implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f110233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadarView f110234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f110236d;

    private el(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 RadarView radarView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 GradientTextView gradientTextView) {
        this.f110233a = constraintLayout;
        this.f110234b = radarView;
        this.f110235c = textView;
        this.f110236d = gradientTextView;
    }

    @androidx.annotation.n0
    public static el a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18541, new Class[]{View.class}, el.class);
        if (patchProxyResultProxy.isSupported) {
            return (el) patchProxyResultProxy.result;
        }
        int i10 = R.id.radar;
        RadarView radarView = (RadarView) l3.d.a(view, R.id.radar);
        if (radarView != null) {
            i10 = R.id.tv_desc;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
            if (textView != null) {
                i10 = R.id.tv_total_num;
                GradientTextView gradientTextView = (GradientTextView) l3.d.a(view, R.id.tv_total_num);
                if (gradientTextView != null) {
                    return new el((ConstraintLayout) view, radarView, textView, gradientTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static el c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18539, new Class[]{LayoutInflater.class}, el.class);
        return patchProxyResultProxy.isSupported ? (el) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static el d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18540, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, el.class);
        if (patchProxyResultProxy.isSupported) {
            return (el) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_multi_dimension_radar, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f110233a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18542, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
