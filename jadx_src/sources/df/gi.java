package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.dota2.Dota2MatchItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemDota2MatchBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gi implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final Dota2MatchItemView f111011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2MatchItemView f111012b;

    private gi(@androidx.annotation.n0 Dota2MatchItemView dota2MatchItemView, @androidx.annotation.n0 Dota2MatchItemView dota2MatchItemView2) {
        this.f111011a = dota2MatchItemView;
        this.f111012b = dota2MatchItemView2;
    }

    @androidx.annotation.n0
    public static gi a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18239, new Class[]{View.class}, gi.class);
        if (patchProxyResultProxy.isSupported) {
            return (gi) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        Dota2MatchItemView dota2MatchItemView = (Dota2MatchItemView) view;
        return new gi(dota2MatchItemView, dota2MatchItemView);
    }

    @androidx.annotation.n0
    public static gi c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18237, new Class[]{LayoutInflater.class}, gi.class);
        return patchProxyResultProxy.isSupported ? (gi) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static gi d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18238, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, gi.class);
        if (patchProxyResultProxy.isSupported) {
            return (gi) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_dota2_match, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public Dota2MatchItemView b() {
        return this.f111011a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18240, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
