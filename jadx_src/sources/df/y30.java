package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.PlatformDataView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutDota2GameDataCardV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y30 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final PlatformDataView f117749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final PlatformDataView f117750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final PlatformDataView f117751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final PlatformDataView f117752i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117753j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117754k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117757n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117758o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117759p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f117760q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117761r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117762s;

    private y30(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 PlatformDataView platformDataView, @androidx.annotation.n0 PlatformDataView platformDataView2, @androidx.annotation.n0 PlatformDataView platformDataView3, @androidx.annotation.n0 PlatformDataView platformDataView4, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4) {
        this.f117744a = relativeLayout;
        this.f117745b = imageView;
        this.f117746c = imageView2;
        this.f117747d = imageView3;
        this.f117748e = linearLayout;
        this.f117749f = platformDataView;
        this.f117750g = platformDataView2;
        this.f117751h = platformDataView3;
        this.f117752i = platformDataView4;
        this.f117753j = textView;
        this.f117754k = textView2;
        this.f117755l = textView3;
        this.f117756m = textView4;
        this.f117757n = textView5;
        this.f117758o = textView6;
        this.f117759p = linearLayout2;
        this.f117760q = cardView;
        this.f117761r = linearLayout3;
        this.f117762s = linearLayout4;
    }

    @androidx.annotation.n0
    public static y30 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20482, new Class[]{View.class}, y30.class);
        if (patchProxyResultProxy.isSupported) {
            return (y30) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_auth_arrow;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_auth_arrow);
        if (imageView != null) {
            i10 = R.id.iv_game_data_card_bg;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_game_data_card_bg);
            if (imageView2 != null) {
                i10 = R.id.iv_mask;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_mask);
                if (imageView3 != null) {
                    i10 = R.id.ll_tips;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_tips);
                    if (linearLayout != null) {
                        i10 = R.id.pdv0;
                        PlatformDataView platformDataView = (PlatformDataView) l3.d.a(view, R.id.pdv0);
                        if (platformDataView != null) {
                            i10 = R.id.pdv1;
                            PlatformDataView platformDataView2 = (PlatformDataView) l3.d.a(view, R.id.pdv1);
                            if (platformDataView2 != null) {
                                i10 = R.id.pdv2;
                                PlatformDataView platformDataView3 = (PlatformDataView) l3.d.a(view, R.id.pdv2);
                                if (platformDataView3 != null) {
                                    i10 = R.id.pdv3;
                                    PlatformDataView platformDataView4 = (PlatformDataView) l3.d.a(view, R.id.pdv3);
                                    if (platformDataView4 != null) {
                                        i10 = R.id.tv_auth;
                                        TextView textView = (TextView) l3.d.a(view, R.id.tv_auth);
                                        if (textView != null) {
                                            i10 = R.id.tv_damage;
                                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_damage);
                                            if (textView2 != null) {
                                                i10 = R.id.tv_damage_rate;
                                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_damage_rate);
                                                if (textView3 != null) {
                                                    i10 = R.id.tv_hero_name;
                                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_hero_name);
                                                    if (textView4 != null) {
                                                        i10 = R.id.tv_nick_name;
                                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_nick_name);
                                                        if (textView5 != null) {
                                                            i10 = R.id.tv_not_data_desc;
                                                            TextView textView6 = (TextView) l3.d.a(view, R.id.tv_not_data_desc);
                                                            if (textView6 != null) {
                                                                i10 = R.id.vg_auth;
                                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_auth);
                                                                if (linearLayout2 != null) {
                                                                    i10 = R.id.vg_card;
                                                                    CardView cardView = (CardView) l3.d.a(view, R.id.vg_card);
                                                                    if (cardView != null) {
                                                                        i10 = R.id.vg_game_data_card_data;
                                                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_game_data_card_data);
                                                                        if (linearLayout3 != null) {
                                                                            i10 = R.id.vg_platform_data;
                                                                            LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_platform_data);
                                                                            if (linearLayout4 != null) {
                                                                                return new y30((RelativeLayout) view, imageView, imageView2, imageView3, linearLayout, platformDataView, platformDataView2, platformDataView3, platformDataView4, textView, textView2, textView3, textView4, textView5, textView6, linearLayout2, cardView, linearLayout3, linearLayout4);
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
    public static y30 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, CacheDataSink.f50934l, new Class[]{LayoutInflater.class}, y30.class);
        return patchProxyResultProxy.isSupported ? (y30) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static y30 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20481, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, y30.class);
        if (patchProxyResultProxy.isSupported) {
            return (y30) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_dota2_game_data_card_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117744a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20483, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
