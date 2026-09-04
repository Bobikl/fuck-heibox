package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.RecommendGameView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemHorRecommendGameBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ro implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RecommendGameView f115284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecommendGameView f115285b;

    private ro(@androidx.annotation.n0 RecommendGameView recommendGameView, @androidx.annotation.n0 RecommendGameView recommendGameView2) {
        this.f115284a = recommendGameView;
        this.f115285b = recommendGameView2;
    }

    @androidx.annotation.n0
    public static ro a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18904, new Class[]{View.class}, ro.class);
        if (patchProxyResultProxy.isSupported) {
            return (ro) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecommendGameView recommendGameView = (RecommendGameView) view;
        return new ro(recommendGameView, recommendGameView);
    }

    @androidx.annotation.n0
    public static ro c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18902, new Class[]{LayoutInflater.class}, ro.class);
        return patchProxyResultProxy.isSupported ? (ro) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ro d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18903, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ro.class);
        if (patchProxyResultProxy.isSupported) {
            return (ro) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_hor_recommend_game, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RecommendGameView b() {
        return this.f115284a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18905, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
