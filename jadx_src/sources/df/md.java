package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemAwardOrCommentsMsgBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class md implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f113400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Barrier f113401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f113402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f113405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f113406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f113408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f113409j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f113410k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113411l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113412m;

    private md(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 Barrier barrier, @androidx.annotation.n0 View view, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 View view2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 ExpressionTextView expressionTextView2, @androidx.annotation.n0 ExpressionTextView expressionTextView3, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f113400a = constraintLayout;
        this.f113401b = barrier;
        this.f113402c = view;
        this.f113403d = imageView;
        this.f113404e = imageView2;
        this.f113405f = frameLayout;
        this.f113406g = view2;
        this.f113407h = textView;
        this.f113408i = expressionTextView;
        this.f113409j = expressionTextView2;
        this.f113410k = expressionTextView3;
        this.f113411l = textView2;
        this.f113412m = relativeLayout;
    }

    @androidx.annotation.n0
    public static md a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17744, new Class[]{View.class}, md.class);
        if (patchProxyResultProxy.isSupported) {
            return (md) patchProxyResultProxy.result;
        }
        int i10 = R.id.barrier_below_source_or_comment;
        Barrier barrier = (Barrier) l3.d.a(view, R.id.barrier_below_source_or_comment);
        if (barrier != null) {
            i10 = R.id.divider;
            View viewA = l3.d.a(view, R.id.divider);
            if (viewA != null) {
                i10 = R.id.iv_avatar;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avatar);
                if (imageView != null) {
                    i10 = R.id.iv_source;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_source);
                    if (imageView2 != null) {
                        i10 = R.id.ll_post_comment;
                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.ll_post_comment);
                        if (frameLayout != null) {
                            i10 = R.id.state;
                            View viewA2 = l3.d.a(view, R.id.state);
                            if (viewA2 != null) {
                                i10 = R.id.tv_name;
                                TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
                                if (textView != null) {
                                    i10 = R.id.tv_source_desc;
                                    ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_source_desc);
                                    if (expressionTextView != null) {
                                        i10 = R.id.tv_source_title;
                                        ExpressionTextView expressionTextView2 = (ExpressionTextView) l3.d.a(view, R.id.tv_source_title);
                                        if (expressionTextView2 != null) {
                                            i10 = R.id.tv_text;
                                            ExpressionTextView expressionTextView3 = (ExpressionTextView) l3.d.a(view, R.id.tv_text);
                                            if (expressionTextView3 != null) {
                                                i10 = R.id.tv_time;
                                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_time);
                                                if (textView2 != null) {
                                                    i10 = R.id.vg_source;
                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_source);
                                                    if (relativeLayout != null) {
                                                        return new md((ConstraintLayout) view, barrier, viewA, imageView, imageView2, frameLayout, viewA2, textView, expressionTextView, expressionTextView2, expressionTextView3, textView2, relativeLayout);
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
    public static md c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17742, new Class[]{LayoutInflater.class}, md.class);
        return patchProxyResultProxy.isSupported ? (md) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static md d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17743, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, md.class);
        if (patchProxyResultProxy.isSupported) {
            return (md) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_award_or_comments_msg, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f113400a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17745, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
