package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutForwardDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h50 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f111256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Barrier f111257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f111258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f111260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f111261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f111262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f111264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111265j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f111266k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111267l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111268m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111269n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f111270o;

    private h50(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 Barrier barrier, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 View view) {
        this.f111256a = constraintLayout;
        this.f111257b = barrier;
        this.f111258c = bottomButtonLeftItemView;
        this.f111259d = relativeLayout;
        this.f111260e = constraintLayout2;
        this.f111261f = cardView;
        this.f111262g = oVar;
        this.f111263h = imageView;
        this.f111264i = recyclerView;
        this.f111265j = textView;
        this.f111266k = expressionTextView;
        this.f111267l = textView2;
        this.f111268m = textView3;
        this.f111269n = textView4;
        this.f111270o = view;
    }

    @androidx.annotation.n0
    public static h50 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20620, new Class[]{View.class}, h50.class);
        if (patchProxyResultProxy.isSupported) {
            return (h50) patchProxyResultProxy.result;
        }
        int i10 = R.id.barrier;
        Barrier barrier = (Barrier) l3.d.a(view, R.id.barrier);
        if (barrier != null) {
            i10 = R.id.bb_cancel;
            BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.bb_cancel);
            if (bottomButtonLeftItemView != null) {
                i10 = R.id.cardView2;
                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.cardView2);
                if (relativeLayout != null) {
                    i10 = R.id.cl_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.cl_container);
                    if (constraintLayout != null) {
                        i10 = R.id.cv_postcard;
                        CardView cardView = (CardView) l3.d.a(view, R.id.cv_postcard);
                        if (cardView != null) {
                            i10 = R.id.divider;
                            View viewA = l3.d.a(view, R.id.divider);
                            if (viewA != null) {
                                mb.o oVarA = mb.o.a(viewA);
                                i10 = R.id.iv_img;
                                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
                                if (imageView != null) {
                                    i10 = R.id.rv_share;
                                    RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_share);
                                    if (recyclerView != null) {
                                        i10 = R.id.tv_author;
                                        TextView textView = (TextView) l3.d.a(view, R.id.tv_author);
                                        if (textView != null) {
                                            i10 = R.id.tv_desc;
                                            ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_desc);
                                            if (expressionTextView != null) {
                                                i10 = R.id.tv_edit;
                                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_edit);
                                                if (textView2 != null) {
                                                    i10 = R.id.tv_forward;
                                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_forward);
                                                    if (textView3 != null) {
                                                        i10 = R.id.tv_share;
                                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_share);
                                                        if (textView4 != null) {
                                                            i10 = R.id.v_out;
                                                            View viewA2 = l3.d.a(view, R.id.v_out);
                                                            if (viewA2 != null) {
                                                                return new h50((ConstraintLayout) view, barrier, bottomButtonLeftItemView, relativeLayout, constraintLayout, cardView, oVarA, imageView, recyclerView, textView, expressionTextView, textView2, textView3, textView4, viewA2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    @androidx.annotation.n0
    public static h50 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20618, new Class[]{LayoutInflater.class}, h50.class);
        return patchProxyResultProxy.isSupported ? (h50) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static h50 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20619, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, h50.class);
        if (patchProxyResultProxy.isSupported) {
            return (h50) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_forward_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f111256a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20621, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
