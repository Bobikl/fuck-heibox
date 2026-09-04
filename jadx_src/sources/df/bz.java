package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemSteamWalletCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class bz implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f109063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109071i;

    private bz(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5) {
        this.f109063a = cardView;
        this.f109064b = imageView;
        this.f109065c = imageView2;
        this.f109066d = imageView3;
        this.f109067e = textView;
        this.f109068f = textView2;
        this.f109069g = textView3;
        this.f109070h = textView4;
        this.f109071i = textView5;
    }

    @androidx.annotation.n0
    public static bz a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19976, new Class[]{View.class}, bz.class);
        if (patchProxyResultProxy.isSupported) {
            return (bz) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_add;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_add);
        if (imageView != null) {
            i10 = R.id.iv_img;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_img);
            if (imageView2 != null) {
                i10 = R.id.iv_sub;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_sub);
                if (imageView3 != null) {
                    i10 = R.id.tv_add;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_add);
                    if (textView != null) {
                        i10 = R.id.tv_count;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_count);
                        if (textView2 != null) {
                            i10 = R.id.tv_current_rmb;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_current_rmb);
                            if (textView3 != null) {
                                i10 = R.id.tv_discount;
                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_discount);
                                if (textView4 != null) {
                                    i10 = R.id.tv_original_rmb;
                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_original_rmb);
                                    if (textView5 != null) {
                                        return new bz((CardView) view, imageView, imageView2, imageView3, textView, textView2, textView3, textView4, textView5);
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
    public static bz c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19974, new Class[]{LayoutInflater.class}, bz.class);
        return patchProxyResultProxy.isSupported ? (bz) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static bz d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19975, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, bz.class);
        if (patchProxyResultProxy.isSupported) {
            return (bz) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_steam_wallet_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f109063a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19977, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
