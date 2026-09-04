package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemHashtagLinkHorBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class eo implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f110246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f110250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110252g;

    private eo(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f110246a = cardView;
        this.f110247b = imageView;
        this.f110248c = textView;
        this.f110249d = textView2;
        this.f110250e = expressionTextView;
        this.f110251f = view;
        this.f110252g = linearLayout;
    }

    @androidx.annotation.n0
    public static eo a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18852, new Class[]{View.class}, eo.class);
        if (patchProxyResultProxy.isSupported) {
            return (eo) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_image;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_image);
        if (imageView != null) {
            i10 = R.id.tv_comment_num;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_comment_num);
            if (textView != null) {
                i10 = R.id.tv_name;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                if (textView2 != null) {
                    i10 = R.id.tv_title;
                    ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_title);
                    if (expressionTextView != null) {
                        i10 = R.id.v_border;
                        View viewA = l3.d.a(view, R.id.v_border);
                        if (viewA != null) {
                            i10 = R.id.vg_comment;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_comment);
                            if (linearLayout != null) {
                                return new eo((CardView) view, imageView, textView, textView2, expressionTextView, viewA, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static eo c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18850, new Class[]{LayoutInflater.class}, eo.class);
        return patchProxyResultProxy.isSupported ? (eo) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static eo d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18851, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, eo.class);
        if (patchProxyResultProxy.isSupported) {
            return (eo) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_hashtag_link_hor, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f110246a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18853, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
