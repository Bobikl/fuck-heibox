package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemConceptTopicHorizonBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ng implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f113830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113836h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113837i;

    private ng(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView) {
        this.f113829a = relativeLayout;
        this.f113830b = cardView;
        this.f113831c = imageView;
        this.f113832d = imageView2;
        this.f113833e = imageView3;
        this.f113834f = imageView4;
        this.f113835g = imageView5;
        this.f113836h = relativeLayout2;
        this.f113837i = textView;
    }

    @androidx.annotation.n0
    public static ng a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18059, new Class[]{View.class}, ng.class);
        if (patchProxyResultProxy.isSupported) {
            return (ng) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_root;
        CardView cardView = (CardView) l3.d.a(view, R.id.cv_root);
        if (cardView != null) {
            i10 = R.id.iv_bg;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bg);
            if (imageView != null) {
                i10 = R.id.iv_checked;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_checked);
                if (imageView2 != null) {
                    i10 = R.id.iv_corner_tag;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_corner_tag);
                    if (imageView3 != null) {
                        i10 = R.id.iv_dot;
                        ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_dot);
                        if (imageView4 != null) {
                            i10 = R.id.iv_icon;
                            ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_icon);
                            if (imageView5 != null) {
                                i10 = R.id.rl_content;
                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_content);
                                if (relativeLayout != null) {
                                    i10 = R.id.tv_name;
                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
                                    if (textView != null) {
                                        return new ng((RelativeLayout) view, cardView, imageView, imageView2, imageView3, imageView4, imageView5, relativeLayout, textView);
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
    public static ng c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18057, new Class[]{LayoutInflater.class}, ng.class);
        return patchProxyResultProxy.isSupported ? (ng) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ng d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18058, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ng.class);
        if (patchProxyResultProxy.isSupported) {
            return (ng) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_concept_topic_horizon, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113829a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18060, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
