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

/* JADX INFO: compiled from: LayoutGameDataCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c60 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f109176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109184i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109185j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109186k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109187l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109188m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109189n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109190o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109191p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109192q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109193r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109194s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f109195t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109196u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109197v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109198w;

    private c60(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 ImageView imageView7, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4) {
        this.f109176a = relativeLayout;
        this.f109177b = relativeLayout2;
        this.f109178c = imageView;
        this.f109179d = imageView2;
        this.f109180e = imageView3;
        this.f109181f = imageView4;
        this.f109182g = imageView5;
        this.f109183h = imageView6;
        this.f109184i = imageView7;
        this.f109185j = linearLayout;
        this.f109186k = textView;
        this.f109187l = textView2;
        this.f109188m = textView3;
        this.f109189n = textView4;
        this.f109190o = textView5;
        this.f109191p = textView6;
        this.f109192q = textView7;
        this.f109193r = textView8;
        this.f109194s = textView9;
        this.f109195t = cardView;
        this.f109196u = linearLayout2;
        this.f109197v = linearLayout3;
        this.f109198w = linearLayout4;
    }

    @androidx.annotation.n0
    public static c60 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20704, new Class[]{View.class}, c60.class);
        if (patchProxyResultProxy.isSupported) {
            return (c60) patchProxyResultProxy.result;
        }
        int i10 = R.id.cell3;
        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.cell3);
        if (relativeLayout != null) {
            i10 = R.id.iv_game_data_card_bg;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_game_data_card_bg);
            if (imageView != null) {
                i10 = R.id.iv_game_data_card_role;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_game_data_card_role);
                if (imageView2 != null) {
                    i10 = R.id.iv_img0;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_img0);
                    if (imageView3 != null) {
                        i10 = R.id.iv_img1;
                        ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_img1);
                        if (imageView4 != null) {
                            i10 = R.id.iv_img2;
                            ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_img2);
                            if (imageView5 != null) {
                                i10 = R.id.iv_img3;
                                ImageView imageView6 = (ImageView) l3.d.a(view, R.id.iv_img3);
                                if (imageView6 != null) {
                                    i10 = R.id.iv_level_img;
                                    ImageView imageView7 = (ImageView) l3.d.a(view, R.id.iv_level_img);
                                    if (imageView7 != null) {
                                        i10 = R.id.ll_card_desc;
                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_card_desc);
                                        if (linearLayout != null) {
                                            i10 = R.id.tv_data0;
                                            TextView textView = (TextView) l3.d.a(view, R.id.tv_data0);
                                            if (textView != null) {
                                                i10 = R.id.tv_data1;
                                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_data1);
                                                if (textView2 != null) {
                                                    i10 = R.id.tv_data2;
                                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_data2);
                                                    if (textView3 != null) {
                                                        i10 = R.id.tv_data3;
                                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_data3);
                                                        if (textView4 != null) {
                                                            i10 = R.id.tv_desc0;
                                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_desc0);
                                                            if (textView5 != null) {
                                                                i10 = R.id.tv_desc1;
                                                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_desc1);
                                                                if (textView6 != null) {
                                                                    i10 = R.id.tv_desc2;
                                                                    TextView textView7 = (TextView) l3.d.a(view, R.id.tv_desc2);
                                                                    if (textView7 != null) {
                                                                        i10 = R.id.tv_desc3;
                                                                        TextView textView8 = (TextView) l3.d.a(view, R.id.tv_desc3);
                                                                        if (textView8 != null) {
                                                                            i10 = R.id.tv_level;
                                                                            TextView textView9 = (TextView) l3.d.a(view, R.id.tv_level);
                                                                            if (textView9 != null) {
                                                                                i10 = R.id.vg_card;
                                                                                CardView cardView = (CardView) l3.d.a(view, R.id.vg_card);
                                                                                if (cardView != null) {
                                                                                    i10 = R.id.vg_desc3;
                                                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_desc3);
                                                                                    if (linearLayout2 != null) {
                                                                                        i10 = R.id.vg_game_data_card_data;
                                                                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_game_data_card_data);
                                                                                        if (linearLayout3 != null) {
                                                                                            i10 = R.id.vg_kv3;
                                                                                            LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_kv3);
                                                                                            if (linearLayout4 != null) {
                                                                                                return new c60((RelativeLayout) view, relativeLayout, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, cardView, linearLayout2, linearLayout3, linearLayout4);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
    public static c60 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20702, new Class[]{LayoutInflater.class}, c60.class);
        return patchProxyResultProxy.isSupported ? (c60) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static c60 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20703, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, c60.class);
        if (patchProxyResultProxy.isSupported) {
            return (c60) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_game_data_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f109176a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20705, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
