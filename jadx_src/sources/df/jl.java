package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.dota2.Dota2RadarView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameOverviewAllRadarBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class jl implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f112214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2RadarView f112215b;

    private jl(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 Dota2RadarView dota2RadarView) {
        this.f112214a = linearLayout;
        this.f112215b = dota2RadarView;
    }

    @androidx.annotation.n0
    public static jl a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18561, new Class[]{View.class}, jl.class);
        if (patchProxyResultProxy.isSupported) {
            return (jl) patchProxyResultProxy.result;
        }
        Dota2RadarView dota2RadarView = (Dota2RadarView) l3.d.a(view, R.id.v_dota2_radar);
        if (dota2RadarView != null) {
            return new jl((LinearLayout) view, dota2RadarView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.v_dota2_radar)));
    }

    @androidx.annotation.n0
    public static jl c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18559, new Class[]{LayoutInflater.class}, jl.class);
        return patchProxyResultProxy.isSupported ? (jl) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static jl d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18560, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, jl.class);
        if (patchProxyResultProxy.isSupported) {
            return (jl) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_overview_all_radar, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f112214a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18562, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
