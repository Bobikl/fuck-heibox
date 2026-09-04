package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.GameAchieveItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemSingleAchievementXBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ry implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final GameAchieveItemView f115342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameAchieveItemView f115343b;

    private ry(@androidx.annotation.n0 GameAchieveItemView gameAchieveItemView, @androidx.annotation.n0 GameAchieveItemView gameAchieveItemView2) {
        this.f115342a = gameAchieveItemView;
        this.f115343b = gameAchieveItemView2;
    }

    @androidx.annotation.n0
    public static ry a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19936, new Class[]{View.class}, ry.class);
        if (patchProxyResultProxy.isSupported) {
            return (ry) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        GameAchieveItemView gameAchieveItemView = (GameAchieveItemView) view;
        return new ry(gameAchieveItemView, gameAchieveItemView);
    }

    @androidx.annotation.n0
    public static ry c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19934, new Class[]{LayoutInflater.class}, ry.class);
        return patchProxyResultProxy.isSupported ? (ry) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ry d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19935, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ry.class);
        if (patchProxyResultProxy.isSupported) {
            return (ry) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_single_achievement_x, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public GameAchieveItemView b() {
        return this.f115342a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19937, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
