package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.GameVideoCardView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemRecommendGameVideoCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zv implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f118468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameVideoCardView f118469b;

    private zv(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 GameVideoCardView gameVideoCardView) {
        this.f118468a = frameLayout;
        this.f118469b = gameVideoCardView;
    }

    @androidx.annotation.n0
    public static zv a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19660, new Class[]{View.class}, zv.class);
        if (patchProxyResultProxy.isSupported) {
            return (zv) patchProxyResultProxy.result;
        }
        GameVideoCardView gameVideoCardView = (GameVideoCardView) l3.d.a(view, R.id.game_video_card);
        if (gameVideoCardView != null) {
            return new zv((FrameLayout) view, gameVideoCardView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.game_video_card)));
    }

    @androidx.annotation.n0
    public static zv c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19658, new Class[]{LayoutInflater.class}, zv.class);
        return patchProxyResultProxy.isSupported ? (zv) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static zv d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19659, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, zv.class);
        if (patchProxyResultProxy.isSupported) {
            return (zv) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_recommend_game_video_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f118468a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19661, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
