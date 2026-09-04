package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemArticleBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class hd implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f111400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111405f;

    private hd(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f111400a = linearLayout;
        this.f111401b = imageView;
        this.f111402c = textView;
        this.f111403d = textView2;
        this.f111404e = textView3;
        this.f111405f = linearLayout2;
    }

    @androidx.annotation.n0
    public static hd a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17724, new Class[]{View.class}, hd.class);
        if (patchProxyResultProxy.isSupported) {
            return (hd) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_more;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_more);
        if (imageView != null) {
            i10 = R.id.tv_click;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_click);
            if (textView != null) {
                i10 = R.id.tv_comment_num;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_comment_num);
                if (textView2 != null) {
                    i10 = R.id.tv_link_award_num;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_link_award_num);
                    if (textView3 != null) {
                        i10 = R.id.vg_option_bar;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_option_bar);
                        if (linearLayout != null) {
                            return new hd((LinearLayout) view, imageView, textView, textView2, textView3, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static hd c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17722, new Class[]{LayoutInflater.class}, hd.class);
        return patchProxyResultProxy.isSupported ? (hd) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static hd d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17723, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, hd.class);
        if (patchProxyResultProxy.isSupported) {
            return (hd) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_article, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f111400a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17725, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
