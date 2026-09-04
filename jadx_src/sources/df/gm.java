package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.GameDetailDataValueView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameOverviewMmrRightDataBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gm implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final GameDetailDataValueView f111039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameDetailDataValueView f111040b;

    private gm(@androidx.annotation.n0 GameDetailDataValueView gameDetailDataValueView, @androidx.annotation.n0 GameDetailDataValueView gameDetailDataValueView2) {
        this.f111039a = gameDetailDataValueView;
        this.f111040b = gameDetailDataValueView2;
    }

    @androidx.annotation.n0
    public static gm a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18652, new Class[]{View.class}, gm.class);
        if (patchProxyResultProxy.isSupported) {
            return (gm) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        GameDetailDataValueView gameDetailDataValueView = (GameDetailDataValueView) view;
        return new gm(gameDetailDataValueView, gameDetailDataValueView);
    }

    @androidx.annotation.n0
    public static gm c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18650, new Class[]{LayoutInflater.class}, gm.class);
        return patchProxyResultProxy.isSupported ? (gm) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static gm d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18651, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, gm.class);
        if (patchProxyResultProxy.isSupported) {
            return (gm) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_overview_mmr_right_data, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public GameDetailDataValueView b() {
        return this.f111039a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18653, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
