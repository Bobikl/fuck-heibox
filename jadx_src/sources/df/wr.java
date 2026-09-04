package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.NormalGameCard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemNormalGameCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wr implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final NormalGameCard f117240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final NormalGameCard f117241b;

    private wr(@androidx.annotation.n0 NormalGameCard normalGameCard, @androidx.annotation.n0 NormalGameCard normalGameCard2) {
        this.f117240a = normalGameCard;
        this.f117241b = normalGameCard2;
    }

    @androidx.annotation.n0
    public static wr a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19236, new Class[]{View.class}, wr.class);
        if (patchProxyResultProxy.isSupported) {
            return (wr) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        NormalGameCard normalGameCard = (NormalGameCard) view;
        return new wr(normalGameCard, normalGameCard);
    }

    @androidx.annotation.n0
    public static wr c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19234, new Class[]{LayoutInflater.class}, wr.class);
        return patchProxyResultProxy.isSupported ? (wr) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static wr d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19235, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, wr.class);
        if (patchProxyResultProxy.isSupported) {
            return (wr) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_normal_game_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public NormalGameCard b() {
        return this.f117240a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19237, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
