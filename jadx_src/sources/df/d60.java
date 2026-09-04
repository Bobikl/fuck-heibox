package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbcustomview.ScrollSingleLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.PlatformDataView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutGameDataCardSteamV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d60 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f109632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f109633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ScrollSingleLayout f109637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final PlatformDataView f109639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final PlatformDataView f109640i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final PlatformDataView f109641j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109642k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109643l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109644m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109645n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109646o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109647p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109648q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109649r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109650s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f109651t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109652u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f109653v;

    private d60(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ScrollSingleLayout scrollSingleLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 PlatformDataView platformDataView, @androidx.annotation.n0 PlatformDataView platformDataView2, @androidx.annotation.n0 PlatformDataView platformDataView3, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 FrameLayout frameLayout2) {
        this.f109632a = cardView;
        this.f109633b = qMUIRadiusImageView;
        this.f109634c = imageView;
        this.f109635d = imageView2;
        this.f109636e = linearLayout;
        this.f109637f = scrollSingleLayout;
        this.f109638g = linearLayout2;
        this.f109639h = platformDataView;
        this.f109640i = platformDataView2;
        this.f109641j = platformDataView3;
        this.f109642k = relativeLayout;
        this.f109643l = relativeLayout2;
        this.f109644m = textView;
        this.f109645n = textView2;
        this.f109646o = textView3;
        this.f109647p = textView4;
        this.f109648q = textView5;
        this.f109649r = textView6;
        this.f109650s = textView7;
        this.f109651t = frameLayout;
        this.f109652u = relativeLayout3;
        this.f109653v = frameLayout2;
    }

    @androidx.annotation.n0
    public static d60 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20708, new Class[]{View.class}, d60.class);
        if (patchProxyResultProxy.isSupported) {
            return (d60) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_steam_info_card_avatar;
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_steam_info_card_avatar);
        if (qMUIRadiusImageView != null) {
            i10 = R.id.iv_steam_info_card_avatar_frame;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_steam_info_card_avatar_frame);
            if (imageView != null) {
                i10 = R.id.iv_steam_info_card_head_image;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_steam_info_card_head_image);
                if (imageView2 != null) {
                    i10 = R.id.ll_friends;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_friends);
                    if (linearLayout != null) {
                        i10 = R.id.ll_steam_info_card_recent_get;
                        ScrollSingleLayout scrollSingleLayout = (ScrollSingleLayout) l3.d.a(view, R.id.ll_steam_info_card_recent_get);
                        if (scrollSingleLayout != null) {
                            i10 = R.id.ll_tips;
                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_tips);
                            if (linearLayout2 != null) {
                                i10 = R.id.pdv0;
                                PlatformDataView platformDataView = (PlatformDataView) l3.d.a(view, R.id.pdv0);
                                if (platformDataView != null) {
                                    i10 = R.id.pdv1;
                                    PlatformDataView platformDataView2 = (PlatformDataView) l3.d.a(view, R.id.pdv1);
                                    if (platformDataView2 != null) {
                                        i10 = R.id.pdv2;
                                        PlatformDataView platformDataView3 = (PlatformDataView) l3.d.a(view, R.id.pdv2);
                                        if (platformDataView3 != null) {
                                            i10 = R.id.rl_steam_info_card_avatar_wrapper;
                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_steam_info_card_avatar_wrapper);
                                            if (relativeLayout != null) {
                                                i10 = R.id.rl_steam_info_card_more_data;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.rl_steam_info_card_more_data);
                                                if (relativeLayout2 != null) {
                                                    i10 = R.id.tv_management;
                                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_management);
                                                    if (textView != null) {
                                                        i10 = R.id.tv_no_friends_tips;
                                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_no_friends_tips);
                                                        if (textView2 != null) {
                                                            i10 = R.id.tv_online_state;
                                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_online_state);
                                                            if (textView3 != null) {
                                                                i10 = R.id.tv_recent_get;
                                                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_recent_get);
                                                                if (textView4 != null) {
                                                                    i10 = R.id.tv_steam_info_card_level;
                                                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_steam_info_card_level);
                                                                    if (textView5 != null) {
                                                                        i10 = R.id.tv_steam_info_card_username;
                                                                        TextView textView6 = (TextView) l3.d.a(view, R.id.tv_steam_info_card_username);
                                                                        if (textView6 != null) {
                                                                            i10 = R.id.tv_tips;
                                                                            TextView textView7 = (TextView) l3.d.a(view, R.id.tv_tips);
                                                                            if (textView7 != null) {
                                                                                i10 = R.id.vg_card;
                                                                                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_card);
                                                                                if (frameLayout != null) {
                                                                                    i10 = R.id.vg_friends;
                                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_friends);
                                                                                    if (relativeLayout3 != null) {
                                                                                        i10 = R.id.vg_steam_info_card_level;
                                                                                        FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_steam_info_card_level);
                                                                                        if (frameLayout2 != null) {
                                                                                            return new d60((CardView) view, qMUIRadiusImageView, imageView, imageView2, linearLayout, scrollSingleLayout, linearLayout2, platformDataView, platformDataView2, platformDataView3, relativeLayout, relativeLayout2, textView, textView2, textView3, textView4, textView5, textView6, textView7, frameLayout, relativeLayout3, frameLayout2);
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
    public static d60 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20706, new Class[]{LayoutInflater.class}, d60.class);
        return patchProxyResultProxy.isSupported ? (d60) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static d60 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20707, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, d60.class);
        if (patchProxyResultProxy.isSupported) {
            return (d60) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_game_data_card_steam_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f109632a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20709, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
