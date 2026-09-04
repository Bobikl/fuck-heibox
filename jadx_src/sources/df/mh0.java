package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.MoreButton;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewRecommendGameAblumBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class mh0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final MoreButton f113475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f113478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f113479i;

    private mh0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 MoreButton moreButton, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView, @androidx.annotation.n0 View view) {
        this.f113471a = relativeLayout;
        this.f113472b = imageView;
        this.f113473c = imageView2;
        this.f113474d = linearLayout;
        this.f113475e = moreButton;
        this.f113476f = recyclerView;
        this.f113477g = textView;
        this.f113478h = hBLineHeightTextView;
        this.f113479i = view;
    }

    @androidx.annotation.n0
    public static mh0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21874, new Class[]{View.class}, mh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (mh0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_card_bg;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_card_bg);
        if (imageView != null) {
            i10 = R.id.iv_card_icon;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_card_icon);
            if (imageView2 != null) {
                i10 = R.id.ll_bottom;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_bottom);
                if (linearLayout != null) {
                    i10 = R.id.mb_more;
                    MoreButton moreButton = (MoreButton) l3.d.a(view, R.id.mb_more);
                    if (moreButton != null) {
                        i10 = R.id.rv;
                        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
                        if (recyclerView != null) {
                            i10 = R.id.tv_card_title;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_card_title);
                            if (textView != null) {
                                i10 = R.id.tv_desc;
                                HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) l3.d.a(view, R.id.tv_desc);
                                if (hBLineHeightTextView != null) {
                                    i10 = R.id.view_gradient;
                                    View viewA = l3.d.a(view, R.id.view_gradient);
                                    if (viewA != null) {
                                        return new mh0((RelativeLayout) view, imageView, imageView2, linearLayout, moreButton, recyclerView, textView, hBLineHeightTextView, viewA);
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
    public static mh0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21872, new Class[]{LayoutInflater.class}, mh0.class);
        return patchProxyResultProxy.isSupported ? (mh0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static mh0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21873, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, mh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (mh0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_recommend_game_ablum, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113471a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21875, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
