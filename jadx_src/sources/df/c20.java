package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.XboxGameItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemXboxGameCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c20 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final XboxGameItemView f109126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final XboxGameItemView f109127b;

    private c20(@androidx.annotation.n0 XboxGameItemView xboxGameItemView, @androidx.annotation.n0 XboxGameItemView xboxGameItemView2) {
        this.f109126a = xboxGameItemView;
        this.f109127b = xboxGameItemView2;
    }

    @androidx.annotation.n0
    public static c20 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20292, new Class[]{View.class}, c20.class);
        if (patchProxyResultProxy.isSupported) {
            return (c20) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        XboxGameItemView xboxGameItemView = (XboxGameItemView) view;
        return new c20(xboxGameItemView, xboxGameItemView);
    }

    @androidx.annotation.n0
    public static c20 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20290, new Class[]{LayoutInflater.class}, c20.class);
        return patchProxyResultProxy.isSupported ? (c20) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static c20 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20291, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, c20.class);
        if (patchProxyResultProxy.isSupported) {
            return (c20) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_xbox_game_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public XboxGameItemView b() {
        return this.f109126a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20293, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
