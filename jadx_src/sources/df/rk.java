package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.GameDurationDataView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameDurationDataBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class rk implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final GameDurationDataView f115270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameDurationDataView f115271b;

    private rk(@androidx.annotation.n0 GameDurationDataView gameDurationDataView, @androidx.annotation.n0 GameDurationDataView gameDurationDataView2) {
        this.f115270a = gameDurationDataView;
        this.f115271b = gameDurationDataView2;
    }

    @androidx.annotation.n0
    public static rk a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18489, new Class[]{View.class}, rk.class);
        if (patchProxyResultProxy.isSupported) {
            return (rk) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        GameDurationDataView gameDurationDataView = (GameDurationDataView) view;
        return new rk(gameDurationDataView, gameDurationDataView);
    }

    @androidx.annotation.n0
    public static rk c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18487, new Class[]{LayoutInflater.class}, rk.class);
        return patchProxyResultProxy.isSupported ? (rk) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static rk d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18488, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, rk.class);
        if (patchProxyResultProxy.isSupported) {
            return (rk) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_duration_data, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public GameDurationDataView b() {
        return this.f115270a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18490, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
