package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.VerGameCardView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemVerGameCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c10 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final VerGameCardView f109121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final VerGameCardView f109122b;

    private c10(@androidx.annotation.n0 VerGameCardView verGameCardView, @androidx.annotation.n0 VerGameCardView verGameCardView2) {
        this.f109121a = verGameCardView;
        this.f109122b = verGameCardView2;
    }

    @androidx.annotation.n0
    public static c10 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20188, new Class[]{View.class}, c10.class);
        if (patchProxyResultProxy.isSupported) {
            return (c10) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        VerGameCardView verGameCardView = (VerGameCardView) view;
        return new c10(verGameCardView, verGameCardView);
    }

    @androidx.annotation.n0
    public static c10 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20186, new Class[]{LayoutInflater.class}, c10.class);
        return patchProxyResultProxy.isSupported ? (c10) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static c10 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20187, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, c10.class);
        if (patchProxyResultProxy.isSupported) {
            return (c10) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_ver_game_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public VerGameCardView b() {
        return this.f109121a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20189, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
