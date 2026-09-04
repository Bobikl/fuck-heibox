package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutHeyboxPopupMenuBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class u0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f131775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f131776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f131777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final o f131778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f131779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f131780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f131781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131783i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f131784j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f131785k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f131786l;

    private u0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 o oVar, @androidx.annotation.n0 View view, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 View view2, @androidx.annotation.n0 View view3, @androidx.annotation.n0 View view4) {
        this.f131775a = relativeLayout;
        this.f131776b = constraintLayout;
        this.f131777c = cardView;
        this.f131778d = oVar;
        this.f131779e = view;
        this.f131780f = frameLayout;
        this.f131781g = recyclerView;
        this.f131782h = textView;
        this.f131783i = textView2;
        this.f131784j = view2;
        this.f131785k = view3;
        this.f131786l = view4;
    }

    @androidx.annotation.n0
    public static u0 a(@androidx.annotation.n0 View view) {
        View viewA;
        View viewA2;
        View viewA3;
        View viewA4;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.X8, new Class[]{View.class}, u0.class);
        if (patchProxyResultProxy.isSupported) {
            return (u0) patchProxyResultProxy.result;
        }
        int i10 = R.id.cl_root;
        ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, i10);
        if (constraintLayout != null) {
            i10 = R.id.cv_cancel;
            CardView cardView = (CardView) l3.d.a(view, i10);
            if (cardView != null && (viewA = l3.d.a(view, (i10 = R.id.divider))) != null) {
                o oVarA = o.a(viewA);
                i10 = R.id.divider2;
                View viewA5 = l3.d.a(view, i10);
                if (viewA5 != null) {
                    i10 = R.id.fl_rv;
                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, i10);
                    if (frameLayout != null) {
                        i10 = R.id.rv_data;
                        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, i10);
                        if (recyclerView != null) {
                            i10 = R.id.tv_btn;
                            TextView textView = (TextView) l3.d.a(view, i10);
                            if (textView != null) {
                                i10 = R.id.tv_title;
                                TextView textView2 = (TextView) l3.d.a(view, i10);
                                if (textView2 != null && (viewA2 = l3.d.a(view, (i10 = R.id.view_gradient_bottom))) != null && (viewA3 = l3.d.a(view, (i10 = R.id.view_gradient_top))) != null && (viewA4 = l3.d.a(view, (i10 = R.id.view_nav_bar))) != null) {
                                    return new u0((RelativeLayout) view, constraintLayout, cardView, oVarA, viewA5, frameLayout, recyclerView, textView, textView2, viewA2, viewA3, viewA4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static u0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.V8, new Class[]{LayoutInflater.class}, u0.class);
        return patchProxyResultProxy.isSupported ? (u0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static u0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.W8, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, u0.class);
        if (patchProxyResultProxy.isSupported) {
            return (u0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_heybox_popup_menu, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f131775a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Y8, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
