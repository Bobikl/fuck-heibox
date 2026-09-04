package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: ActivitySwitchDetailBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m2 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final TextView A;

    @androidx.annotation.n0
    public final TextView B;

    @androidx.annotation.n0
    public final TextView C;

    @androidx.annotation.n0
    public final TextView D;

    @androidx.annotation.n0
    public final LinearLayout E;

    @androidx.annotation.n0
    public final LinearLayout F;

    @androidx.annotation.n0
    public final RelativeLayout G;

    @androidx.annotation.n0
    public final LinearLayout H;

    @androidx.annotation.n0
    public final RelativeLayout I;

    @androidx.annotation.n0
    public final LinearLayout J;

    @androidx.annotation.n0
    public final RelativeLayout K;

    @androidx.annotation.n0
    public final LinearLayout L;

    @androidx.annotation.n0
    public final LinearLayout M;

    @androidx.annotation.n0
    public final RelativeLayout N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CoordinatorLayout f113224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final AppBarLayout f113225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f113226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f113227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113233j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113234k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113235l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113236m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113237n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113238o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113239p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f113240q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final Toolbar f113241r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final CollapsingToolbarLayout f113242s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113243t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113244u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113245v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113246w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113247x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113248y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113249z;

    private m2(@androidx.annotation.n0 CoordinatorLayout coordinatorLayout, @androidx.annotation.n0 AppBarLayout appBarLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 EditText editText2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 ImageView imageView7, @androidx.annotation.n0 ImageView imageView8, @androidx.annotation.n0 ImageView imageView9, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 RecyclerView recyclerView3, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 Toolbar toolbar, @androidx.annotation.n0 CollapsingToolbarLayout collapsingToolbarLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 RelativeLayout relativeLayout4) {
        this.f113224a = coordinatorLayout;
        this.f113225b = appBarLayout;
        this.f113226c = editText;
        this.f113227d = editText2;
        this.f113228e = imageView;
        this.f113229f = imageView2;
        this.f113230g = imageView3;
        this.f113231h = imageView4;
        this.f113232i = imageView5;
        this.f113233j = imageView6;
        this.f113234k = imageView7;
        this.f113235l = imageView8;
        this.f113236m = imageView9;
        this.f113237n = recyclerView;
        this.f113238o = recyclerView2;
        this.f113239p = recyclerView3;
        this.f113240q = smartRefreshLayout;
        this.f113241r = toolbar;
        this.f113242s = collapsingToolbarLayout;
        this.f113243t = textView;
        this.f113244u = textView2;
        this.f113245v = textView3;
        this.f113246w = textView4;
        this.f113247x = textView5;
        this.f113248y = textView6;
        this.f113249z = textView7;
        this.A = textView8;
        this.B = textView9;
        this.C = textView10;
        this.D = textView11;
        this.E = linearLayout;
        this.F = linearLayout2;
        this.G = relativeLayout;
        this.H = linearLayout3;
        this.I = relativeLayout2;
        this.J = linearLayout4;
        this.K = relativeLayout3;
        this.L = linearLayout5;
        this.M = linearLayout6;
        this.N = relativeLayout4;
    }

    @androidx.annotation.n0
    public static m2 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16600, new Class[]{View.class}, m2.class);
        if (patchProxyResultProxy.isSupported) {
            return (m2) patchProxyResultProxy.result;
        }
        int i10 = R.id.app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) l3.d.a(view, R.id.app_bar);
        if (appBarLayout != null) {
            i10 = R.id.et_friend_code;
            EditText editText = (EditText) l3.d.a(view, R.id.et_friend_code);
            if (editText != null) {
                i10 = R.id.et_name;
                EditText editText2 = (EditText) l3.d.a(view, R.id.et_name);
                if (editText2 != null) {
                    i10 = R.id.iv_avartar;
                    ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avartar);
                    if (imageView != null) {
                        i10 = R.id.iv_edit_friend_code;
                        ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_edit_friend_code);
                        if (imageView2 != null) {
                            i10 = R.id.iv_edit_my_game;
                            ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_edit_my_game);
                            if (imageView3 != null) {
                                i10 = R.id.iv_edit_name;
                                ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_edit_name);
                                if (imageView4 != null) {
                                    i10 = R.id.iv_faq;
                                    ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_faq);
                                    if (imageView5 != null) {
                                        i10 = R.id.iv_head_img;
                                        ImageView imageView6 = (ImageView) l3.d.a(view, R.id.iv_head_img);
                                        if (imageView6 != null) {
                                            i10 = R.id.iv_title_back;
                                            ImageView imageView7 = (ImageView) l3.d.a(view, R.id.iv_title_back);
                                            if (imageView7 != null) {
                                                i10 = R.id.iv_title_share;
                                                ImageView imageView8 = (ImageView) l3.d.a(view, R.id.iv_title_share);
                                                if (imageView8 != null) {
                                                    i10 = R.id.iv_update_icon;
                                                    ImageView imageView9 = (ImageView) l3.d.a(view, R.id.iv_update_icon);
                                                    if (imageView9 != null) {
                                                        i10 = R.id.rv_friend;
                                                        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_friend);
                                                        if (recyclerView != null) {
                                                            i10 = R.id.rv_hot_game;
                                                            RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_hot_game);
                                                            if (recyclerView2 != null) {
                                                                i10 = R.id.rv_my_game;
                                                                RecyclerView recyclerView3 = (RecyclerView) l3.d.a(view, R.id.rv_my_game);
                                                                if (recyclerView3 != null) {
                                                                    i10 = R.id.srl;
                                                                    SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                                                                    if (smartRefreshLayout != null) {
                                                                        i10 = R.id.f76252tb;
                                                                        Toolbar toolbar = (Toolbar) l3.d.a(view, R.id.f76252tb);
                                                                        if (toolbar != null) {
                                                                            i10 = R.id.toolbar_layout;
                                                                            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) l3.d.a(view, R.id.toolbar_layout);
                                                                            if (collapsingToolbarLayout != null) {
                                                                                i10 = R.id.tv_add_game_auto;
                                                                                TextView textView = (TextView) l3.d.a(view, R.id.tv_add_game_auto);
                                                                                if (textView != null) {
                                                                                    i10 = R.id.tv_choose_avartar;
                                                                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_choose_avartar);
                                                                                    if (textView2 != null) {
                                                                                        i10 = R.id.tv_confirm;
                                                                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_confirm);
                                                                                        if (textView3 != null) {
                                                                                            i10 = R.id.tv_copy_friend_code;
                                                                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_copy_friend_code);
                                                                                            if (textView4 != null) {
                                                                                                i10 = R.id.tv_friend;
                                                                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_friend);
                                                                                                if (textView5 != null) {
                                                                                                    i10 = R.id.tv_friend_code_text;
                                                                                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_friend_code_text);
                                                                                                    if (textView6 != null) {
                                                                                                        i10 = R.id.tv_friend_num;
                                                                                                        TextView textView7 = (TextView) l3.d.a(view, R.id.tv_friend_num);
                                                                                                        if (textView7 != null) {
                                                                                                            i10 = R.id.tv_hot_game;
                                                                                                            TextView textView8 = (TextView) l3.d.a(view, R.id.tv_hot_game);
                                                                                                            if (textView8 != null) {
                                                                                                                i10 = R.id.tv_my_game;
                                                                                                                TextView textView9 = (TextView) l3.d.a(view, R.id.tv_my_game);
                                                                                                                if (textView9 != null) {
                                                                                                                    i10 = R.id.tv_my_game_num;
                                                                                                                    TextView textView10 = (TextView) l3.d.a(view, R.id.tv_my_game_num);
                                                                                                                    if (textView10 != null) {
                                                                                                                        i10 = R.id.tv_switch_title;
                                                                                                                        TextView textView11 = (TextView) l3.d.a(view, R.id.tv_switch_title);
                                                                                                                        if (textView11 != null) {
                                                                                                                            i10 = R.id.vg_add_game;
                                                                                                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_add_game);
                                                                                                                            if (linearLayout != null) {
                                                                                                                                i10 = R.id.vg_add_game_by_hand;
                                                                                                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_add_game_by_hand);
                                                                                                                                if (linearLayout2 != null) {
                                                                                                                                    i10 = R.id.vg_avartar;
                                                                                                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_avartar);
                                                                                                                                    if (relativeLayout != null) {
                                                                                                                                        i10 = R.id.vg_avartar_bottom;
                                                                                                                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_avartar_bottom);
                                                                                                                                        if (linearLayout3 != null) {
                                                                                                                                            i10 = R.id.vg_bar;
                                                                                                                                            RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_bar);
                                                                                                                                            if (relativeLayout2 != null) {
                                                                                                                                                i10 = R.id.vg_edit_all;
                                                                                                                                                LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_edit_all);
                                                                                                                                                if (linearLayout4 != null) {
                                                                                                                                                    i10 = R.id.vg_friend;
                                                                                                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_friend);
                                                                                                                                                    if (relativeLayout3 != null) {
                                                                                                                                                        i10 = R.id.vg_friend_more;
                                                                                                                                                        LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_friend_more);
                                                                                                                                                        if (linearLayout5 != null) {
                                                                                                                                                            i10 = R.id.vg_my_game_more;
                                                                                                                                                            LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_my_game_more);
                                                                                                                                                            if (linearLayout6 != null) {
                                                                                                                                                                i10 = R.id.vg_user_item;
                                                                                                                                                                RelativeLayout relativeLayout4 = (RelativeLayout) l3.d.a(view, R.id.vg_user_item);
                                                                                                                                                                if (relativeLayout4 != null) {
                                                                                                                                                                    return new m2((CoordinatorLayout) view, appBarLayout, editText, editText2, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, recyclerView, recyclerView2, recyclerView3, smartRefreshLayout, toolbar, collapsingToolbarLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, linearLayout, linearLayout2, relativeLayout, linearLayout3, relativeLayout2, linearLayout4, relativeLayout3, linearLayout5, linearLayout6, relativeLayout4);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static m2 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16598, new Class[]{LayoutInflater.class}, m2.class);
        return patchProxyResultProxy.isSupported ? (m2) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static m2 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16599, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, m2.class);
        if (patchProxyResultProxy.isSupported) {
            return (m2) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_switch_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CoordinatorLayout b() {
        return this.f113224a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16601, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
