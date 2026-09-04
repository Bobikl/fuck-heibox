package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemUserCommentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p00 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f114369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f114370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f114372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f114373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f114374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f114375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114376h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114377i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114378j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final e80 f114379k;

    private p00(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 ExpressionTextView expressionTextView2, @androidx.annotation.n0 ExpressionTextView expressionTextView3, @androidx.annotation.n0 ExpressionTextView expressionTextView4, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 e80 e80Var) {
        this.f114369a = cardView;
        this.f114370b = cardView2;
        this.f114371c = imageView;
        this.f114372d = expressionTextView;
        this.f114373e = expressionTextView2;
        this.f114374f = expressionTextView3;
        this.f114375g = expressionTextView4;
        this.f114376h = linearLayout;
        this.f114377i = relativeLayout;
        this.f114378j = relativeLayout2;
        this.f114379k = e80Var;
    }

    @androidx.annotation.n0
    public static p00 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20136, new Class[]{View.class}, p00.class);
        if (patchProxyResultProxy.isSupported) {
            return (p00) patchProxyResultProxy.result;
        }
        CardView cardView = (CardView) view;
        int i10 = R.id.iv_img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
        if (imageView != null) {
            i10 = R.id.tv_link_owner;
            ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_link_owner);
            if (expressionTextView != null) {
                i10 = R.id.tv_link_title;
                ExpressionTextView expressionTextView2 = (ExpressionTextView) l3.d.a(view, R.id.tv_link_title);
                if (expressionTextView2 != null) {
                    i10 = R.id.tv_text;
                    ExpressionTextView expressionTextView3 = (ExpressionTextView) l3.d.a(view, R.id.tv_text);
                    if (expressionTextView3 != null) {
                        i10 = R.id.tv_user_comments;
                        ExpressionTextView expressionTextView4 = (ExpressionTextView) l3.d.a(view, R.id.tv_user_comments);
                        if (expressionTextView4 != null) {
                            i10 = R.id.vg_item;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_item);
                            if (linearLayout != null) {
                                i10 = R.id.vg_link;
                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_link);
                                if (relativeLayout != null) {
                                    i10 = R.id.vg_source;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_source);
                                    if (relativeLayout2 != null) {
                                        i10 = R.id.vg_user;
                                        View viewA = l3.d.a(view, R.id.vg_user);
                                        if (viewA != null) {
                                            return new p00(cardView, cardView, imageView, expressionTextView, expressionTextView2, expressionTextView3, expressionTextView4, linearLayout, relativeLayout, relativeLayout2, e80.a(viewA));
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
    public static p00 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20134, new Class[]{LayoutInflater.class}, p00.class);
        return patchProxyResultProxy.isSupported ? (p00) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static p00 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20135, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, p00.class);
        if (patchProxyResultProxy.isSupported) {
            return (p00) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_user_comment, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f114369a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20137, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
