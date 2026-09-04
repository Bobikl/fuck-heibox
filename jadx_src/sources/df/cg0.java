package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.GameRateStarView;
import com.max.xiaoheihe.view.BoxAutoPlayView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewGameTimeAchieveItemBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cg0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BoxAutoPlayView f109396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f109397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameRateStarView f109398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f109403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109407m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109408n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109409o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109410p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109411q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109412r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109413s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109414t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109415u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109416v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109417w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109418x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f109419y;

    private cg0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 BoxAutoPlayView boxAutoPlayView, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 GameRateStarView gameRateStarView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 View view) {
        this.f109395a = linearLayout;
        this.f109396b = boxAutoPlayView;
        this.f109397c = cardView;
        this.f109398d = gameRateStarView;
        this.f109399e = imageView;
        this.f109400f = imageView2;
        this.f109401g = imageView3;
        this.f109402h = imageView4;
        this.f109403i = progressBar;
        this.f109404j = textView;
        this.f109405k = textView2;
        this.f109406l = textView3;
        this.f109407m = textView4;
        this.f109408n = textView5;
        this.f109409o = textView6;
        this.f109410p = textView7;
        this.f109411q = textView8;
        this.f109412r = textView9;
        this.f109413s = linearLayout2;
        this.f109414t = linearLayout3;
        this.f109415u = linearLayout4;
        this.f109416v = linearLayout5;
        this.f109417w = linearLayout6;
        this.f109418x = relativeLayout;
        this.f109419y = view;
    }

    @androidx.annotation.n0
    public static cg0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21732, new Class[]{View.class}, cg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (cg0) patchProxyResultProxy.result;
        }
        int i10 = R.id.bv_bg;
        BoxAutoPlayView boxAutoPlayView = (BoxAutoPlayView) l3.d.a(view, R.id.bv_bg);
        if (boxAutoPlayView != null) {
            i10 = R.id.cv_img;
            CardView cardView = (CardView) l3.d.a(view, R.id.cv_img);
            if (cardView != null) {
                i10 = R.id.grsv;
                GameRateStarView gameRateStarView = (GameRateStarView) l3.d.a(view, R.id.grsv);
                if (gameRateStarView != null) {
                    i10 = R.id.iv_icon;
                    ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
                    if (imageView != null) {
                        i10 = R.id.iv_not_owned_help;
                        ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_not_owned_help);
                        if (imageView2 != null) {
                            i10 = R.id.iv_prefect_achievement;
                            ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_prefect_achievement);
                            if (imageView3 != null) {
                                i10 = R.id.iv_special_icon;
                                ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_special_icon);
                                if (imageView4 != null) {
                                    i10 = R.id.pb_achievement;
                                    ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_achievement);
                                    if (progressBar != null) {
                                        i10 = R.id.tv_achievement;
                                        TextView textView = (TextView) l3.d.a(view, R.id.tv_achievement);
                                        if (textView != null) {
                                            i10 = R.id.tv_bronze;
                                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_bronze);
                                            if (textView2 != null) {
                                                i10 = R.id.tv_gold;
                                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_gold);
                                                if (textView3 != null) {
                                                    i10 = R.id.tv_goto_comment;
                                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_goto_comment);
                                                    if (textView4 != null) {
                                                        i10 = R.id.tv_name;
                                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_name);
                                                        if (textView5 != null) {
                                                            i10 = R.id.tv_online_num;
                                                            TextView textView6 = (TextView) l3.d.a(view, R.id.tv_online_num);
                                                            if (textView6 != null) {
                                                                i10 = R.id.tv_playtime_forever;
                                                                TextView textView7 = (TextView) l3.d.a(view, R.id.tv_playtime_forever);
                                                                if (textView7 != null) {
                                                                    i10 = R.id.tv_silver;
                                                                    TextView textView8 = (TextView) l3.d.a(view, R.id.tv_silver);
                                                                    if (textView8 != null) {
                                                                        i10 = R.id.tv_special_time;
                                                                        TextView textView9 = (TextView) l3.d.a(view, R.id.tv_special_time);
                                                                        if (textView9 != null) {
                                                                            i10 = R.id.vg_achievement;
                                                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_achievement);
                                                                            if (linearLayout != null) {
                                                                                LinearLayout linearLayout2 = (LinearLayout) view;
                                                                                i10 = R.id.vg_not_owned;
                                                                                LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_not_owned);
                                                                                if (linearLayout3 != null) {
                                                                                    i10 = R.id.vg_online_num;
                                                                                    LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_online_num);
                                                                                    if (linearLayout4 != null) {
                                                                                        i10 = R.id.vg_psn_trophy;
                                                                                        LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_psn_trophy);
                                                                                        if (linearLayout5 != null) {
                                                                                            i10 = R.id.vg_right;
                                                                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_right);
                                                                                            if (relativeLayout != null) {
                                                                                                i10 = R.id.view_online;
                                                                                                View viewA = l3.d.a(view, R.id.view_online);
                                                                                                if (viewA != null) {
                                                                                                    return new cg0(linearLayout2, boxAutoPlayView, cardView, gameRateStarView, imageView, imageView2, imageView3, imageView4, progressBar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, relativeLayout, viewA);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static cg0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21730, new Class[]{LayoutInflater.class}, cg0.class);
        return patchProxyResultProxy.isSupported ? (cg0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static cg0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21731, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, cg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (cg0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_game_time_achieve_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109395a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21733, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
