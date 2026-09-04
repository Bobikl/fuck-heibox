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

/* JADX INFO: compiled from: ItemGameStoreItemBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class in implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f111837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f111838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111845j;

    private in(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f111836a = relativeLayout;
        this.f111837b = cardView;
        this.f111838c = oVar;
        this.f111839d = imageView;
        this.f111840e = imageView2;
        this.f111841f = textView;
        this.f111842g = textView2;
        this.f111843h = linearLayout;
        this.f111844i = linearLayout2;
        this.f111845j = linearLayout3;
    }

    @androidx.annotation.n0
    public static in a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18764, new Class[]{View.class}, in.class);
        if (patchProxyResultProxy.isSupported) {
            return (in) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_img;
        CardView cardView = (CardView) l3.d.a(view, R.id.cv_img);
        if (cardView != null) {
            i10 = R.id.divider;
            View viewA = l3.d.a(view, R.id.divider);
            if (viewA != null) {
                mb.o oVarA = mb.o.a(viewA);
                i10 = R.id.iv_heybox_price;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_heybox_price);
                if (imageView != null) {
                    i10 = R.id.iv_img;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_img);
                    if (imageView2 != null) {
                        i10 = R.id.tv_heybox_price;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_heybox_price);
                        if (textView != null) {
                            i10 = R.id.tv_rmb_signal;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_rmb_signal);
                            if (textView2 != null) {
                                i10 = R.id.vg_is_owned;
                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_is_owned);
                                if (linearLayout != null) {
                                    i10 = R.id.vg_name;
                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_name);
                                    if (linearLayout2 != null) {
                                        i10 = R.id.vg_store_price;
                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_store_price);
                                        if (linearLayout3 != null) {
                                            return new in((RelativeLayout) view, cardView, oVarA, imageView, imageView2, textView, textView2, linearLayout, linearLayout2, linearLayout3);
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
    public static in c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18762, new Class[]{LayoutInflater.class}, in.class);
        return patchProxyResultProxy.isSupported ? (in) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static in d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18763, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, in.class);
        if (patchProxyResultProxy.isSupported) {
            return (in) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_store_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111836a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18765, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
