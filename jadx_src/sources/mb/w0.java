package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutListBottomSheetDialogBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class w0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f131811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f131812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f131813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final o f131814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f131815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f131818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f131819i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f131820j;

    private w0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 o oVar, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, @androidx.annotation.n0 View view3) {
        this.f131811a = relativeLayout;
        this.f131812b = cardView;
        this.f131813c = cardView2;
        this.f131814d = oVar;
        this.f131815e = recyclerView;
        this.f131816f = textView;
        this.f131817g = textView2;
        this.f131818h = view;
        this.f131819i = view2;
        this.f131820j = view3;
    }

    @androidx.annotation.n0
    public static w0 a(@androidx.annotation.n0 View view) {
        View viewA;
        View viewA2;
        View viewA3;
        View viewA4;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.f31787f9, new Class[]{View.class}, w0.class);
        if (patchProxyResultProxy.isSupported) {
            return (w0) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_cancel;
        CardView cardView = (CardView) l3.d.a(view, i10);
        if (cardView != null) {
            i10 = R.id.cv_data;
            CardView cardView2 = (CardView) l3.d.a(view, i10);
            if (cardView2 != null && (viewA = l3.d.a(view, (i10 = R.id.divider))) != null) {
                o oVarA = o.a(viewA);
                i10 = R.id.rv_data;
                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, i10);
                if (recyclerView != null) {
                    i10 = R.id.tv_btn;
                    TextView textView = (TextView) l3.d.a(view, i10);
                    if (textView != null) {
                        i10 = R.id.tv_title;
                        TextView textView2 = (TextView) l3.d.a(view, i10);
                        if (textView2 != null && (viewA2 = l3.d.a(view, (i10 = R.id.view_gradient_bottom))) != null && (viewA3 = l3.d.a(view, (i10 = R.id.view_gradient_top))) != null && (viewA4 = l3.d.a(view, (i10 = R.id.view_nav_bar))) != null) {
                            return new w0((RelativeLayout) view, cardView, cardView2, oVarA, recyclerView, textView, textView2, viewA2, viewA3, viewA4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static w0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.f31753d9, new Class[]{LayoutInflater.class}, w0.class);
        return patchProxyResultProxy.isSupported ? (w0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static w0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.f31770e9, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, w0.class);
        if (patchProxyResultProxy.isSupported) {
            return (w0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_list_bottom_sheet_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f131811a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31804g9, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
