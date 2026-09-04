package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemMoreLikePostBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cr implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f109483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f109485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f109486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f109487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f109488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f109489g;

    private cr(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 View view, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 FrameLayout frameLayout) {
        this.f109483a = cardView;
        this.f109484b = imageView;
        this.f109485c = expressionTextView;
        this.f109486d = view;
        this.f109487e = constraintLayout;
        this.f109488f = cardView2;
        this.f109489g = frameLayout;
    }

    @androidx.annotation.n0
    public static cr a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19156, new Class[]{View.class}, cr.class);
        if (patchProxyResultProxy.isSupported) {
            return (cr) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_image;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_image);
        if (imageView != null) {
            i10 = R.id.tv_title;
            ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_title);
            if (expressionTextView != null) {
                i10 = R.id.v_divider;
                View viewA = l3.d.a(view, R.id.v_divider);
                if (viewA != null) {
                    i10 = R.id.vg_content;
                    ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.vg_content);
                    if (constraintLayout != null) {
                        CardView cardView = (CardView) view;
                        i10 = R.id.vg_video_play;
                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_video_play);
                        if (frameLayout != null) {
                            return new cr(cardView, imageView, expressionTextView, viewA, constraintLayout, cardView, frameLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static cr c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19154, new Class[]{LayoutInflater.class}, cr.class);
        return patchProxyResultProxy.isSupported ? (cr) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static cr d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19155, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, cr.class);
        if (patchProxyResultProxy.isSupported) {
            return (cr) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_more_like_post, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f109483a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19157, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
