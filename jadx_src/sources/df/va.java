package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import com.max.hbcustomview.MarqueeTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentPubgGameDataV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class va implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final k90 A;

    @androidx.annotation.n0
    public final RelativeLayout B;

    @androidx.annotation.n0
    public final l90 C;

    @androidx.annotation.n0
    public final m90 D;

    @androidx.annotation.n0
    public final m90 E;

    @androidx.annotation.n0
    public final m90 F;

    @androidx.annotation.n0
    public final LinearLayout G;

    @androidx.annotation.n0
    public final LinearLayout H;

    @androidx.annotation.n0
    public final j90 I;

    @androidx.annotation.n0
    public final n90 J;

    @androidx.annotation.n0
    public final LinearLayout K;

    @androidx.annotation.n0
    public final r90 L;

    @androidx.annotation.n0
    public final LinearLayout M;

    @androidx.annotation.n0
    public final s90 N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartRefreshLayout f116733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f116734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f116735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116740h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final MarqueeTextView f116741i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final NestedScrollView f116742j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f116743k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116744l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116745m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116746n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116747o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116748p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f116749q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final q90 f116750r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116751s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116752t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final g90 f116753u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116754v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116755w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116756x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final h90 f116757y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116758z;

    private va(@androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 MarqueeTextView marqueeTextView, @androidx.annotation.n0 NestedScrollView nestedScrollView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 View view, @androidx.annotation.n0 q90 q90Var, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 g90 g90Var, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 h90 h90Var, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 k90 k90Var, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 l90 l90Var, @androidx.annotation.n0 m90 m90Var, @androidx.annotation.n0 m90 m90Var2, @androidx.annotation.n0 m90 m90Var3, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 j90 j90Var, @androidx.annotation.n0 n90 n90Var, @androidx.annotation.n0 LinearLayout linearLayout7, @androidx.annotation.n0 r90 r90Var, @androidx.annotation.n0 LinearLayout linearLayout8, @androidx.annotation.n0 s90 s90Var) {
        this.f116733a = smartRefreshLayout;
        this.f116734b = checkBox;
        this.f116735c = cardView;
        this.f116736d = imageView;
        this.f116737e = imageView2;
        this.f116738f = imageView3;
        this.f116739g = imageView4;
        this.f116740h = imageView5;
        this.f116741i = marqueeTextView;
        this.f116742j = nestedScrollView;
        this.f116743k = smartRefreshLayout2;
        this.f116744l = textView;
        this.f116745m = textView2;
        this.f116746n = textView3;
        this.f116747o = textView4;
        this.f116748p = textView5;
        this.f116749q = view;
        this.f116750r = q90Var;
        this.f116751s = frameLayout;
        this.f116752t = linearLayout;
        this.f116753u = g90Var;
        this.f116754v = linearLayout2;
        this.f116755w = linearLayout3;
        this.f116756x = linearLayout4;
        this.f116757y = h90Var;
        this.f116758z = relativeLayout;
        this.A = k90Var;
        this.B = relativeLayout2;
        this.C = l90Var;
        this.D = m90Var;
        this.E = m90Var2;
        this.F = m90Var3;
        this.G = linearLayout5;
        this.H = linearLayout6;
        this.I = j90Var;
        this.J = n90Var;
        this.K = linearLayout7;
        this.L = r90Var;
        this.M = linearLayout8;
        this.N = s90Var;
    }

    @androidx.annotation.n0
    public static va a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17468, new Class[]{View.class}, va.class);
        if (patchProxyResultProxy.isSupported) {
            return (va) patchProxyResultProxy.result;
        }
        int i10 = R.id.cb_fpp;
        CheckBox checkBox = (CheckBox) l3.d.a(view, R.id.cb_fpp);
        if (checkBox != null) {
            i10 = R.id.cv_avatar;
            CardView cardView = (CardView) l3.d.a(view, R.id.cv_avatar);
            if (cardView != null) {
                i10 = R.id.iv_avatar;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avatar);
                if (imageView != null) {
                    i10 = R.id.iv_certify_arrow;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_certify_arrow);
                    if (imageView2 != null) {
                        i10 = R.id.iv_mini_program_logo;
                        ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_mini_program_logo);
                        if (imageView3 != null) {
                            i10 = R.id.iv_msg_cancel;
                            ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_msg_cancel);
                            if (imageView4 != null) {
                                i10 = R.id.iv_update_icon;
                                ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_update_icon);
                                if (imageView5 != null) {
                                    i10 = R.id.mtv_msg_content;
                                    MarqueeTextView marqueeTextView = (MarqueeTextView) l3.d.a(view, R.id.mtv_msg_content);
                                    if (marqueeTextView != null) {
                                        i10 = R.id.nsv_pubg;
                                        NestedScrollView nestedScrollView = (NestedScrollView) l3.d.a(view, R.id.nsv_pubg);
                                        if (nestedScrollView != null) {
                                            SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) view;
                                            i10 = R.id.tv_certified;
                                            TextView textView = (TextView) l3.d.a(view, R.id.tv_certified);
                                            if (textView != null) {
                                                i10 = R.id.tv_data_season;
                                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_data_season);
                                                if (textView2 != null) {
                                                    i10 = R.id.tv_name;
                                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_name);
                                                    if (textView3 != null) {
                                                        i10 = R.id.tv_update_desc;
                                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_update_desc);
                                                        if (textView4 != null) {
                                                            i10 = R.id.tv_update_text;
                                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_update_text);
                                                            if (textView5 != null) {
                                                                i10 = R.id.v_mode_info_blank;
                                                                View viewA = l3.d.a(view, R.id.v_mode_info_blank);
                                                                if (viewA != null) {
                                                                    i10 = R.id.vg_all_status;
                                                                    View viewA2 = l3.d.a(view, R.id.vg_all_status);
                                                                    if (viewA2 != null) {
                                                                        q90 q90VarA = q90.a(viewA2);
                                                                        i10 = R.id.vg_bind_card_container;
                                                                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_bind_card_container);
                                                                        if (frameLayout != null) {
                                                                            i10 = R.id.vg_certified;
                                                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_certified);
                                                                            if (linearLayout != null) {
                                                                                i10 = R.id.vg_daily_report;
                                                                                View viewA3 = l3.d.a(view, R.id.vg_daily_report);
                                                                                if (viewA3 != null) {
                                                                                    g90 g90VarA = g90.a(viewA3);
                                                                                    i10 = R.id.vg_data_area;
                                                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_data_area);
                                                                                    if (linearLayout2 != null) {
                                                                                        i10 = R.id.vg_data_container;
                                                                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_data_container);
                                                                                        if (linearLayout3 != null) {
                                                                                            i10 = R.id.vg_data_season_wrapper;
                                                                                            LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_data_season_wrapper);
                                                                                            if (linearLayout4 != null) {
                                                                                                i10 = R.id.vg_friend;
                                                                                                View viewA4 = l3.d.a(view, R.id.vg_friend);
                                                                                                if (viewA4 != null) {
                                                                                                    h90 h90VarA = h90.a(viewA4);
                                                                                                    i10 = R.id.vg_header;
                                                                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_header);
                                                                                                    if (relativeLayout != null) {
                                                                                                        i10 = R.id.vg_match_list;
                                                                                                        View viewA5 = l3.d.a(view, R.id.vg_match_list);
                                                                                                        if (viewA5 != null) {
                                                                                                            k90 k90VarA = k90.a(viewA5);
                                                                                                            i10 = R.id.vg_message;
                                                                                                            RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_message);
                                                                                                            if (relativeLayout2 != null) {
                                                                                                                i10 = R.id.vg_mmr;
                                                                                                                View viewA6 = l3.d.a(view, R.id.vg_mmr);
                                                                                                                if (viewA6 != null) {
                                                                                                                    l90 l90VarA = l90.a(viewA6);
                                                                                                                    i10 = R.id.vg_mode_duo;
                                                                                                                    View viewA7 = l3.d.a(view, R.id.vg_mode_duo);
                                                                                                                    if (viewA7 != null) {
                                                                                                                        m90 m90VarA = m90.a(viewA7);
                                                                                                                        i10 = R.id.vg_mode_solo;
                                                                                                                        View viewA8 = l3.d.a(view, R.id.vg_mode_solo);
                                                                                                                        if (viewA8 != null) {
                                                                                                                            m90 m90VarA2 = m90.a(viewA8);
                                                                                                                            i10 = R.id.vg_mode_squad;
                                                                                                                            View viewA9 = l3.d.a(view, R.id.vg_mode_squad);
                                                                                                                            if (viewA9 != null) {
                                                                                                                                m90 m90VarA3 = m90.a(viewA9);
                                                                                                                                i10 = R.id.vg_name;
                                                                                                                                LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_name);
                                                                                                                                if (linearLayout5 != null) {
                                                                                                                                    i10 = R.id.vg_player_info;
                                                                                                                                    LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_player_info);
                                                                                                                                    if (linearLayout6 != null) {
                                                                                                                                        i10 = R.id.vg_pubg_func_menu;
                                                                                                                                        View viewA10 = l3.d.a(view, R.id.vg_pubg_func_menu);
                                                                                                                                        if (viewA10 != null) {
                                                                                                                                            j90 j90VarA = j90.a(viewA10);
                                                                                                                                            i10 = R.id.vg_recently_20_match;
                                                                                                                                            View viewA11 = l3.d.a(view, R.id.vg_recently_20_match);
                                                                                                                                            if (viewA11 != null) {
                                                                                                                                                n90 n90VarA = n90.a(viewA11);
                                                                                                                                                i10 = R.id.vg_selections;
                                                                                                                                                LinearLayout linearLayout7 = (LinearLayout) l3.d.a(view, R.id.vg_selections);
                                                                                                                                                if (linearLayout7 != null) {
                                                                                                                                                    i10 = R.id.vg_storage;
                                                                                                                                                    View viewA12 = l3.d.a(view, R.id.vg_storage);
                                                                                                                                                    if (viewA12 != null) {
                                                                                                                                                        r90 r90VarA = r90.a(viewA12);
                                                                                                                                                        i10 = R.id.vg_update;
                                                                                                                                                        LinearLayout linearLayout8 = (LinearLayout) l3.d.a(view, R.id.vg_update);
                                                                                                                                                        if (linearLayout8 != null) {
                                                                                                                                                            i10 = R.id.vg_weapon_proficiency;
                                                                                                                                                            View viewA13 = l3.d.a(view, R.id.vg_weapon_proficiency);
                                                                                                                                                            if (viewA13 != null) {
                                                                                                                                                                return new va(smartRefreshLayout, checkBox, cardView, imageView, imageView2, imageView3, imageView4, imageView5, marqueeTextView, nestedScrollView, smartRefreshLayout, textView, textView2, textView3, textView4, textView5, viewA, q90VarA, frameLayout, linearLayout, g90VarA, linearLayout2, linearLayout3, linearLayout4, h90VarA, relativeLayout, k90VarA, relativeLayout2, l90VarA, m90VarA, m90VarA2, m90VarA3, linearLayout5, linearLayout6, j90VarA, n90VarA, linearLayout7, r90VarA, linearLayout8, s90.a(viewA13));
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
    public static va c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17466, new Class[]{LayoutInflater.class}, va.class);
        return patchProxyResultProxy.isSupported ? (va) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static va d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17467, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, va.class);
        if (patchProxyResultProxy.isSupported) {
            return (va) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_pubg_game_data_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartRefreshLayout b() {
        return this.f116733a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17469, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
