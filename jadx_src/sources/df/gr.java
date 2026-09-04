package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.GameTimeAchieveItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemMyGameWithTimeAndAchieveBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gr implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final GameTimeAchieveItemView f111081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameTimeAchieveItemView f111082b;

    private gr(@androidx.annotation.n0 GameTimeAchieveItemView gameTimeAchieveItemView, @androidx.annotation.n0 GameTimeAchieveItemView gameTimeAchieveItemView2) {
        this.f111081a = gameTimeAchieveItemView;
        this.f111082b = gameTimeAchieveItemView2;
    }

    @androidx.annotation.n0
    public static gr a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19172, new Class[]{View.class}, gr.class);
        if (patchProxyResultProxy.isSupported) {
            return (gr) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        GameTimeAchieveItemView gameTimeAchieveItemView = (GameTimeAchieveItemView) view;
        return new gr(gameTimeAchieveItemView, gameTimeAchieveItemView);
    }

    @androidx.annotation.n0
    public static gr c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19170, new Class[]{LayoutInflater.class}, gr.class);
        return patchProxyResultProxy.isSupported ? (gr) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static gr d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19171, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, gr.class);
        if (patchProxyResultProxy.isSupported) {
            return (gr) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_my_game_with_time_and_achieve, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public GameTimeAchieveItemView b() {
        return this.f111081a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19173, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
