package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameOverviewHeroHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class xl implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f117584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f117585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final SegmentFilterView f117587e;

    private xl(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 SegmentFilterView segmentFilterView) {
        this.f117583a = relativeLayout;
        this.f117584b = qMUIRadiusImageView;
        this.f117585c = recyclerView;
        this.f117586d = textView;
        this.f117587e = segmentFilterView;
    }

    @androidx.annotation.n0
    public static xl a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18616, new Class[]{View.class}, xl.class);
        if (patchProxyResultProxy.isSupported) {
            return (xl) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_hero_avatar;
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_hero_avatar);
        if (qMUIRadiusImageView != null) {
            i10 = R.id.rv_selections;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_selections);
            if (recyclerView != null) {
                i10 = R.id.tv_name;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
                if (textView != null) {
                    i10 = R.id.v_filter;
                    SegmentFilterView segmentFilterView = (SegmentFilterView) l3.d.a(view, R.id.v_filter);
                    if (segmentFilterView != null) {
                        return new xl((RelativeLayout) view, qMUIRadiusImageView, recyclerView, textView, segmentFilterView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static xl c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18614, new Class[]{LayoutInflater.class}, xl.class);
        return patchProxyResultProxy.isSupported ? (xl) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static xl d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18615, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, xl.class);
        if (patchProxyResultProxy.isSupported) {
            return (xl) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_overview_hero_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117583a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18617, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
