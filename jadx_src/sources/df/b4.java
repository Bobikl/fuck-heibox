package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.GameItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ComponentGameSmallPic128x64WithPaddingBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b4 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final GameItemView f108784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameItemView f108785b;

    private b4(@androidx.annotation.n0 GameItemView gameItemView, @androidx.annotation.n0 GameItemView gameItemView2) {
        this.f108784a = gameItemView;
        this.f108785b = gameItemView2;
    }

    @androidx.annotation.n0
    public static b4 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16764, new Class[]{View.class}, b4.class);
        if (patchProxyResultProxy.isSupported) {
            return (b4) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        GameItemView gameItemView = (GameItemView) view;
        return new b4(gameItemView, gameItemView);
    }

    @androidx.annotation.n0
    public static b4 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16762, new Class[]{LayoutInflater.class}, b4.class);
        return patchProxyResultProxy.isSupported ? (b4) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static b4 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16763, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, b4.class);
        if (patchProxyResultProxy.isSupported) {
            return (b4) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.component_game_small_pic128x64_with_padding, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public GameItemView b() {
        return this.f108784a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16765, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
