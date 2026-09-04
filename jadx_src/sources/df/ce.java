package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.BigGameCardView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemBigGameCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ce implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final BigGameCardView f109350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BigGameCardView f109351b;

    private ce(@androidx.annotation.n0 BigGameCardView bigGameCardView, @androidx.annotation.n0 BigGameCardView bigGameCardView2) {
        this.f109350a = bigGameCardView;
        this.f109351b = bigGameCardView2;
    }

    @androidx.annotation.n0
    public static ce a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17808, new Class[]{View.class}, ce.class);
        if (patchProxyResultProxy.isSupported) {
            return (ce) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        BigGameCardView bigGameCardView = (BigGameCardView) view;
        return new ce(bigGameCardView, bigGameCardView);
    }

    @androidx.annotation.n0
    public static ce c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17806, new Class[]{LayoutInflater.class}, ce.class);
        return patchProxyResultProxy.isSupported ? (ce) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ce d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17807, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ce.class);
        if (patchProxyResultProxy.isSupported) {
            return (ce) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_big_game_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public BigGameCardView b() {
        return this.f109350a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17809, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
