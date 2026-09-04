package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutGameBindingBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class v50 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f116639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f116640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final l20 f116644f;

    private v50(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 l20 l20Var) {
        this.f116639a = linearLayout;
        this.f116640b = cardView;
        this.f116641c = frameLayout;
        this.f116642d = linearLayout2;
        this.f116643e = linearLayout3;
        this.f116644f = l20Var;
    }

    @androidx.annotation.n0
    public static v50 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20676, new Class[]{View.class}, v50.class);
        if (patchProxyResultProxy.isSupported) {
            return (v50) patchProxyResultProxy.result;
        }
        int i10 = R.id.card_bind_card_games;
        CardView cardView = (CardView) l3.d.a(view, R.id.card_bind_card_games);
        if (cardView != null) {
            i10 = R.id.fl_binding_container;
            FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fl_binding_container);
            if (frameLayout != null) {
                i10 = R.id.ll_binding_tab;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_binding_tab);
                if (linearLayout != null) {
                    LinearLayout linearLayout2 = (LinearLayout) view;
                    i10 = R.id.vg_bind_card;
                    View viewA = l3.d.a(view, R.id.vg_bind_card);
                    if (viewA != null) {
                        return new v50(linearLayout2, cardView, frameLayout, linearLayout, linearLayout2, l20.a(viewA));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static v50 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20674, new Class[]{LayoutInflater.class}, v50.class);
        return patchProxyResultProxy.isSupported ? (v50) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static v50 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20675, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, v50.class);
        if (patchProxyResultProxy.isSupported) {
            return (v50) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_game_binding, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f116639a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20677, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
