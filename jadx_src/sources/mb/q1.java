package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcommon.R;
import com.max.hbcustomview.seekbar.HbRangeTrendView;
import com.max.hbcustomview.seekbar.RangeSeekBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewGameFilterSliderWithLegendBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class q1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f131718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RangeSeekBar f131719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final HbRangeTrendView f131720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final HbRangeTrendView f131721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f131722e;

    private q1(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 RangeSeekBar rangeSeekBar, @androidx.annotation.n0 HbRangeTrendView hbRangeTrendView, @androidx.annotation.n0 HbRangeTrendView hbRangeTrendView2, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f131718a = constraintLayout;
        this.f131719b = rangeSeekBar;
        this.f131720c = hbRangeTrendView;
        this.f131721d = hbRangeTrendView2;
        this.f131722e = linearLayout;
    }

    @androidx.annotation.n0
    public static q1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.Ha, new Class[]{View.class}, q1.class);
        if (patchProxyResultProxy.isSupported) {
            return (q1) patchProxyResultProxy.result;
        }
        int i10 = R.id.rsb;
        RangeSeekBar rangeSeekBar = (RangeSeekBar) l3.d.a(view, i10);
        if (rangeSeekBar != null) {
            i10 = R.id.trend_view;
            HbRangeTrendView hbRangeTrendView = (HbRangeTrendView) l3.d.a(view, i10);
            if (hbRangeTrendView != null) {
                i10 = R.id.trend_view_down;
                HbRangeTrendView hbRangeTrendView2 = (HbRangeTrendView) l3.d.a(view, i10);
                if (hbRangeTrendView2 != null) {
                    i10 = R.id.vg_legend;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                    if (linearLayout != null) {
                        return new q1((ConstraintLayout) view, rangeSeekBar, hbRangeTrendView, hbRangeTrendView2, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static q1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.Fa, new Class[]{LayoutInflater.class}, q1.class);
        return patchProxyResultProxy.isSupported ? (q1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static q1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.Ga, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, q1.class);
        if (patchProxyResultProxy.isSupported) {
            return (q1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_game_filter_slider_with_legend, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f131718a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Ia, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
