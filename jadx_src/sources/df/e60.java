package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.GameStatAccountMiniCard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutGameDataCardV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e60 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final GameStatAccountMiniCard f110052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameStatAccountMiniCard f110053b;

    private e60(@androidx.annotation.n0 GameStatAccountMiniCard gameStatAccountMiniCard, @androidx.annotation.n0 GameStatAccountMiniCard gameStatAccountMiniCard2) {
        this.f110052a = gameStatAccountMiniCard;
        this.f110053b = gameStatAccountMiniCard2;
    }

    @androidx.annotation.n0
    public static e60 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20712, new Class[]{View.class}, e60.class);
        if (patchProxyResultProxy.isSupported) {
            return (e60) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        GameStatAccountMiniCard gameStatAccountMiniCard = (GameStatAccountMiniCard) view;
        return new e60(gameStatAccountMiniCard, gameStatAccountMiniCard);
    }

    @androidx.annotation.n0
    public static e60 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20710, new Class[]{LayoutInflater.class}, e60.class);
        return patchProxyResultProxy.isSupported ? (e60) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static e60 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20711, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, e60.class);
        if (patchProxyResultProxy.isSupported) {
            return (e60) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_game_data_card_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public GameStatAccountMiniCard b() {
        return this.f110052a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20713, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
