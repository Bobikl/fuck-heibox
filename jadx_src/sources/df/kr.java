package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemNewsLargeBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kr implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f112703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f112704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final id0 f112705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112710h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final z6 f112711i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112712j;

    private kr(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 id0 id0Var, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 z6 z6Var, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f112703a = cardView;
        this.f112704b = cardView2;
        this.f112705c = id0Var;
        this.f112706d = imageView;
        this.f112707e = linearLayout;
        this.f112708f = relativeLayout;
        this.f112709g = textView;
        this.f112710h = textView2;
        this.f112711i = z6Var;
        this.f112712j = relativeLayout2;
    }

    @androidx.annotation.n0
    public static kr a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19188, new Class[]{View.class}, kr.class);
        if (patchProxyResultProxy.isSupported) {
            return (kr) patchProxyResultProxy.result;
        }
        CardView cardView = (CardView) view;
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            id0 id0VarA = id0.a(viewA);
            i10 = R.id.iv_img;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
            if (imageView != null) {
                i10 = R.id.ll_time_visit;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_time_visit);
                if (linearLayout != null) {
                    i10 = R.id.rl_bg;
                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_bg);
                    if (relativeLayout != null) {
                        i10 = R.id.tv_title;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_title);
                        if (textView != null) {
                            i10 = R.id.tv_visits;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_visits);
                            if (textView2 != null) {
                                i10 = R.id.vg_discount_sale;
                                View viewA2 = l3.d.a(view, R.id.vg_discount_sale);
                                if (viewA2 != null) {
                                    z6 z6VarA = z6.a(viewA2);
                                    i10 = R.id.vg_sale;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_sale);
                                    if (relativeLayout2 != null) {
                                        return new kr(cardView, cardView, id0VarA, imageView, linearLayout, relativeLayout, textView, textView2, z6VarA, relativeLayout2);
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
    public static kr c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19186, new Class[]{LayoutInflater.class}, kr.class);
        return patchProxyResultProxy.isSupported ? (kr) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static kr d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19187, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, kr.class);
        if (patchProxyResultProxy.isSupported) {
            return (kr) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_news_large, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f112703a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19189, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
