package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ComponentGameImgBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class t3 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f115821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f115822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115829i;

    private t3(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f115821a = cardView;
        this.f115822b = cardView2;
        this.f115823c = imageView;
        this.f115824d = imageView2;
        this.f115825e = imageView3;
        this.f115826f = linearLayout;
        this.f115827g = textView;
        this.f115828h = textView2;
        this.f115829i = linearLayout2;
    }

    @androidx.annotation.n0
    public static t3 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16732, new Class[]{View.class}, t3.class);
        if (patchProxyResultProxy.isSupported) {
            return (t3) patchProxyResultProxy.result;
        }
        CardView cardView = (CardView) view;
        int i10 = R.id.iv_img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
        if (imageView != null) {
            i10 = R.id.iv_in_wish_list;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_in_wish_list);
            if (imageView2 != null) {
                i10 = R.id.iv_owned;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_owned);
                if (imageView3 != null) {
                    i10 = R.id.ll_platform_icon;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_platform_icon);
                    if (linearLayout != null) {
                        i10 = R.id.tv_dlc_tag;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_dlc_tag);
                        if (textView != null) {
                            i10 = R.id.tv_owned;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_owned);
                            if (textView2 != null) {
                                i10 = R.id.vg_is_owned;
                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_is_owned);
                                if (linearLayout2 != null) {
                                    return new t3(cardView, cardView, imageView, imageView2, imageView3, linearLayout, textView, textView2, linearLayout2);
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
    public static t3 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16730, new Class[]{LayoutInflater.class}, t3.class);
        return patchProxyResultProxy.isSupported ? (t3) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static t3 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16731, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, t3.class);
        if (patchProxyResultProxy.isSupported) {
            return (t3) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.component_game_img, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f115821a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16733, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
