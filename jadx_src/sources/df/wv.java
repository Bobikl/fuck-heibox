package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.RecommendGameAlbumCard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemRecommendGameAblumBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wv implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RecommendGameAlbumCard f117268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecommendGameAlbumCard f117269b;

    private wv(@androidx.annotation.n0 RecommendGameAlbumCard recommendGameAlbumCard, @androidx.annotation.n0 RecommendGameAlbumCard recommendGameAlbumCard2) {
        this.f117268a = recommendGameAlbumCard;
        this.f117269b = recommendGameAlbumCard2;
    }

    @androidx.annotation.n0
    public static wv a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19648, new Class[]{View.class}, wv.class);
        if (patchProxyResultProxy.isSupported) {
            return (wv) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecommendGameAlbumCard recommendGameAlbumCard = (RecommendGameAlbumCard) view;
        return new wv(recommendGameAlbumCard, recommendGameAlbumCard);
    }

    @androidx.annotation.n0
    public static wv c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19646, new Class[]{LayoutInflater.class}, wv.class);
        return patchProxyResultProxy.isSupported ? (wv) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static wv d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19647, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, wv.class);
        if (patchProxyResultProxy.isSupported) {
            return (wv) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_recommend_game_ablum, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RecommendGameAlbumCard b() {
        return this.f117268a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19649, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
