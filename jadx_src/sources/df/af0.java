package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.KDAView;
import com.max.xiaoheihe.module.game.component.dota2.Dota2HeroImageView;
import com.max.xiaoheihe.module.game.component.dota2.Dota2HeroMmrView;
import com.max.xiaoheihe.module.game.component.dota2.Dota2MatchResultView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewDota2MatchBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class af0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f108536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2HeroImageView f108545j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2HeroMmrView f108546k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final KDAView f108547l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2MatchResultView f108548m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108549n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108550o;

    private af0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 Dota2HeroImageView dota2HeroImageView, @androidx.annotation.n0 Dota2HeroMmrView dota2HeroMmrView, @androidx.annotation.n0 KDAView kDAView, @androidx.annotation.n0 Dota2MatchResultView dota2MatchResultView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f108536a = linearLayout;
        this.f108537b = imageView;
        this.f108538c = imageView2;
        this.f108539d = textView;
        this.f108540e = textView2;
        this.f108541f = textView3;
        this.f108542g = textView4;
        this.f108543h = textView5;
        this.f108544i = textView6;
        this.f108545j = dota2HeroImageView;
        this.f108546k = dota2HeroMmrView;
        this.f108547l = kDAView;
        this.f108548m = dota2MatchResultView;
        this.f108549n = linearLayout2;
        this.f108550o = linearLayout3;
    }

    @androidx.annotation.n0
    public static af0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21622, new Class[]{View.class}, af0.class);
        if (patchProxyResultProxy.isSupported) {
            return (af0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_arrow;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_arrow);
        if (imageView != null) {
            i10 = R.id.iv_dan_icon;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_dan_icon);
            if (imageView2 != null) {
                i10 = R.id.tv_dan_name;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_dan_name);
                if (textView != null) {
                    i10 = R.id.tv_delta;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_delta);
                    if (textView2 != null) {
                        i10 = R.id.tv_duration;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_duration);
                        if (textView3 != null) {
                            i10 = R.id.tv_kd;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_kd);
                            if (textView4 != null) {
                                i10 = R.id.tv_module;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_module);
                                if (textView5 != null) {
                                    i10 = R.id.tv_rank;
                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_rank);
                                    if (textView6 != null) {
                                        i10 = R.id.v_dota2_hero;
                                        Dota2HeroImageView dota2HeroImageView = (Dota2HeroImageView) l3.d.a(view, R.id.v_dota2_hero);
                                        if (dota2HeroImageView != null) {
                                            i10 = R.id.v_hero_mmr;
                                            Dota2HeroMmrView dota2HeroMmrView = (Dota2HeroMmrView) l3.d.a(view, R.id.v_hero_mmr);
                                            if (dota2HeroMmrView != null) {
                                                i10 = R.id.v_kda;
                                                KDAView kDAView = (KDAView) l3.d.a(view, R.id.v_kda);
                                                if (kDAView != null) {
                                                    i10 = R.id.v_match_result;
                                                    Dota2MatchResultView dota2MatchResultView = (Dota2MatchResultView) l3.d.a(view, R.id.v_match_result);
                                                    if (dota2MatchResultView != null) {
                                                        i10 = R.id.vg_dan;
                                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_dan);
                                                        if (linearLayout != null) {
                                                            i10 = R.id.vg_rank;
                                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_rank);
                                                            if (linearLayout2 != null) {
                                                                return new af0((LinearLayout) view, imageView, imageView2, textView, textView2, textView3, textView4, textView5, textView6, dota2HeroImageView, dota2HeroMmrView, kDAView, dota2MatchResultView, linearLayout, linearLayout2);
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
    public static af0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21620, new Class[]{LayoutInflater.class}, af0.class);
        return patchProxyResultProxy.isSupported ? (af0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static af0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21621, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, af0.class);
        if (patchProxyResultProxy.isSupported) {
            return (af0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_dota2_match, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f108536a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21623, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
