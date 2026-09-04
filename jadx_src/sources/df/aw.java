package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.MiddleGameCardView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemRecommendMiddleGameCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class aw implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final MiddleGameCardView f108641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final MiddleGameCardView f108642b;

    private aw(@androidx.annotation.n0 MiddleGameCardView middleGameCardView, @androidx.annotation.n0 MiddleGameCardView middleGameCardView2) {
        this.f108641a = middleGameCardView;
        this.f108642b = middleGameCardView2;
    }

    @androidx.annotation.n0
    public static aw a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19664, new Class[]{View.class}, aw.class);
        if (patchProxyResultProxy.isSupported) {
            return (aw) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        MiddleGameCardView middleGameCardView = (MiddleGameCardView) view;
        return new aw(middleGameCardView, middleGameCardView);
    }

    @androidx.annotation.n0
    public static aw c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19662, new Class[]{LayoutInflater.class}, aw.class);
        return patchProxyResultProxy.isSupported ? (aw) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static aw d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19663, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, aw.class);
        if (patchProxyResultProxy.isSupported) {
            return (aw) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_recommend_middle_game_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public MiddleGameCardView b() {
        return this.f108641a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19665, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
