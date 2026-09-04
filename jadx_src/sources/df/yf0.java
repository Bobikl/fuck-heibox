package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.flexbox.FlexboxLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewGameItemBottomBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class yf0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FlexboxLayout f117945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117952i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117953j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117954k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117955l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117956m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117957n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117958o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117959p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117960q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117961r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117962s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117963t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117964u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117965v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117966w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f117967x;

    private yf0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FlexboxLayout flexboxLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 TextView textView12, @androidx.annotation.n0 TextView textView13, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 CardView cardView) {
        this.f117944a = relativeLayout;
        this.f117945b = flexboxLayout;
        this.f117946c = imageView;
        this.f117947d = linearLayout;
        this.f117948e = textView;
        this.f117949f = textView2;
        this.f117950g = textView3;
        this.f117951h = textView4;
        this.f117952i = textView5;
        this.f117953j = textView6;
        this.f117954k = textView7;
        this.f117955l = textView8;
        this.f117956m = textView9;
        this.f117957n = textView10;
        this.f117958o = textView11;
        this.f117959p = textView12;
        this.f117960q = textView13;
        this.f117961r = linearLayout2;
        this.f117962s = linearLayout3;
        this.f117963t = linearLayout4;
        this.f117964u = linearLayout5;
        this.f117965v = linearLayout6;
        this.f117966w = relativeLayout2;
        this.f117967x = cardView;
    }

    @androidx.annotation.n0
    public static yf0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21716, new Class[]{View.class}, yf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (yf0) patchProxyResultProxy.result;
        }
        int i10 = R.id.fl_tags;
        FlexboxLayout flexboxLayout = (FlexboxLayout) l3.d.a(view, R.id.fl_tags);
        if (flexboxLayout != null) {
            i10 = R.id.iv_follow_icon;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_follow_icon);
            if (imageView != null) {
                i10 = R.id.ll_more_tags;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_more_tags);
                if (linearLayout != null) {
                    i10 = R.id.tv_already_release;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_already_release);
                    if (textView != null) {
                        i10 = R.id.tv_deadline_date;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_deadline_date);
                        if (textView2 != null) {
                            i10 = R.id.tv_deadline_date_unit;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_deadline_date_unit);
                            if (textView3 != null) {
                                i10 = R.id.tv_follow_num;
                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_follow_num);
                                if (textView4 != null) {
                                    i10 = R.id.tv_follow_num_unit;
                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_follow_num_unit);
                                    if (textView5 != null) {
                                        i10 = R.id.tv_free_time;
                                        TextView textView6 = (TextView) l3.d.a(view, R.id.tv_free_time);
                                        if (textView6 != null) {
                                            i10 = R.id.tv_game_date;
                                            TextView textView7 = (TextView) l3.d.a(view, R.id.tv_game_date);
                                            if (textView7 != null) {
                                                i10 = R.id.tv_game_date_left;
                                                TextView textView8 = (TextView) l3.d.a(view, R.id.tv_game_date_left);
                                                if (textView8 != null) {
                                                    i10 = R.id.tv_game_date_unit;
                                                    TextView textView9 = (TextView) l3.d.a(view, R.id.tv_game_date_unit);
                                                    if (textView9 != null) {
                                                        i10 = R.id.tv_game_date_unit_left;
                                                        TextView textView10 = (TextView) l3.d.a(view, R.id.tv_game_date_unit_left);
                                                        if (textView10 != null) {
                                                            i10 = R.id.tv_game_no_score;
                                                            TextView textView11 = (TextView) l3.d.a(view, R.id.tv_game_no_score);
                                                            if (textView11 != null) {
                                                                i10 = R.id.tv_game_popularity;
                                                                TextView textView12 = (TextView) l3.d.a(view, R.id.tv_game_popularity);
                                                                if (textView12 != null) {
                                                                    i10 = R.id.tv_game_popularity_unit;
                                                                    TextView textView13 = (TextView) l3.d.a(view, R.id.tv_game_popularity_unit);
                                                                    if (textView13 != null) {
                                                                        i10 = R.id.vg_deadline_date;
                                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_deadline_date);
                                                                        if (linearLayout2 != null) {
                                                                            i10 = R.id.vg_follow_num;
                                                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_follow_num);
                                                                            if (linearLayout3 != null) {
                                                                                i10 = R.id.vg_game_date;
                                                                                LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_game_date);
                                                                                if (linearLayout4 != null) {
                                                                                    i10 = R.id.vg_game_date_left;
                                                                                    LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_game_date_left);
                                                                                    if (linearLayout5 != null) {
                                                                                        i10 = R.id.vg_online;
                                                                                        LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_online);
                                                                                        if (linearLayout6 != null) {
                                                                                            i10 = R.id.vg_right_info;
                                                                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_right_info);
                                                                                            if (relativeLayout != null) {
                                                                                                i10 = R.id.view_online;
                                                                                                CardView cardView = (CardView) l3.d.a(view, R.id.view_online);
                                                                                                if (cardView != null) {
                                                                                                    return new yf0((RelativeLayout) view, flexboxLayout, imageView, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, relativeLayout, cardView);
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
    public static yf0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21714, new Class[]{LayoutInflater.class}, yf0.class);
        return patchProxyResultProxy.isSupported ? (yf0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static yf0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21715, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, yf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (yf0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_game_item_bottom, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117944a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21717, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
