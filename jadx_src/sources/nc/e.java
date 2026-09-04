package nc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbexpression.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HbexpressionPackGridFragmentV2Binding.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final FrameLayout f132049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final Space f132050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final FrameLayout f132051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final ImageView f132052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final LinearLayout f132053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final LinearLayout f132054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final RecyclerView f132055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final RecyclerView f132056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final RecyclerView f132057i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    public final TextView f132058j;

    private e(@n0 FrameLayout frameLayout, @n0 Space space, @n0 FrameLayout frameLayout2, @n0 ImageView imageView, @n0 LinearLayout linearLayout, @n0 LinearLayout linearLayout2, @n0 RecyclerView recyclerView, @n0 RecyclerView recyclerView2, @n0 RecyclerView recyclerView3, @n0 TextView textView) {
        this.f132049a = frameLayout;
        this.f132050b = space;
        this.f132051c = frameLayout2;
        this.f132052d = imageView;
        this.f132053e = linearLayout;
        this.f132054f = linearLayout2;
        this.f132055g = recyclerView;
        this.f132056h = recyclerView2;
        this.f132057i = recyclerView3;
        this.f132058j = textView;
    }

    @n0
    public static e a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.g.P2, new Class[]{View.class}, e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_space;
        Space space = (Space) l3.d.a(view, i10);
        if (space != null) {
            i10 = R.id.delete_btn;
            FrameLayout frameLayout = (FrameLayout) l3.d.a(view, i10);
            if (frameLayout != null) {
                i10 = R.id.delete_btn_icon;
                ImageView imageView = (ImageView) l3.d.a(view, i10);
                if (imageView != null) {
                    i10 = R.id.ll_recent_used;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                    if (linearLayout != null) {
                        i10 = R.id.ll_small_expression;
                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, i10);
                        if (linearLayout2 != null) {
                            i10 = R.id.rv_big_expression;
                            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, i10);
                            if (recyclerView != null) {
                                i10 = R.id.rv_recent_used;
                                RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, i10);
                                if (recyclerView2 != null) {
                                    i10 = R.id.rv_small_expression;
                                    RecyclerView recyclerView3 = (RecyclerView) l3.d.a(view, i10);
                                    if (recyclerView3 != null) {
                                        i10 = R.id.tv_small_expression_group_name;
                                        TextView textView = (TextView) l3.d.a(view, i10);
                                        if (textView != null) {
                                            return new e((FrameLayout) view, space, frameLayout, imageView, linearLayout, linearLayout2, recyclerView, recyclerView2, recyclerView3, textView);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static e c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.g.N2, new Class[]{LayoutInflater.class}, e.class);
        return patchProxyResultProxy.isSupported ? (e) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static e d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.g.O2, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbexpression_pack_grid_fragment_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public FrameLayout b() {
        return this.f132049a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Q2, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
