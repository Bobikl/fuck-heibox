package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.GameRateStarView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameCommentMultiDimensionInPopBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kk implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f112650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameRateStarView f112651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112653d;

    private kk(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 GameRateStarView gameRateStarView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f112650a = linearLayout;
        this.f112651b = gameRateStarView;
        this.f112652c = textView;
        this.f112653d = textView2;
    }

    @androidx.annotation.n0
    public static kk a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18463, new Class[]{View.class}, kk.class);
        if (patchProxyResultProxy.isSupported) {
            return (kk) patchProxyResultProxy.result;
        }
        int i10 = R.id.ll_user_rating;
        GameRateStarView gameRateStarView = (GameRateStarView) l3.d.a(view, R.id.ll_user_rating);
        if (gameRateStarView != null) {
            i10 = R.id.tv_name;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
            if (textView != null) {
                i10 = R.id.tv_user_laber;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_user_laber);
                if (textView2 != null) {
                    return new kk((LinearLayout) view, gameRateStarView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static kk c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18461, new Class[]{LayoutInflater.class}, kk.class);
        return patchProxyResultProxy.isSupported ? (kk) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static kk d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18462, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, kk.class);
        if (patchProxyResultProxy.isSupported) {
            return (kk) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_comment_multi_dimension_in_pop, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f112650a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18464, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
