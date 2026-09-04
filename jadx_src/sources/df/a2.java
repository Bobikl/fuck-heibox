package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.component.AvatarView;
import com.max.xiaoheihe.module.account.component.SettingItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivitySettingBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a2 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final SettingItemView A;

    @androidx.annotation.n0
    public final SettingItemView B;

    @androidx.annotation.n0
    public final SettingItemView C;

    @androidx.annotation.n0
    public final mb.m0 D;

    @androidx.annotation.n0
    public final CardView E;

    @androidx.annotation.n0
    public final SettingItemView F;

    @androidx.annotation.n0
    public final LinearLayout G;

    @androidx.annotation.n0
    public final SettingItemView H;

    @androidx.annotation.n0
    public final SettingItemView I;

    @androidx.annotation.n0
    public final SettingItemView J;

    @androidx.annotation.n0
    public final SettingItemView K;

    @androidx.annotation.n0
    public final SettingItemView L;

    @androidx.annotation.n0
    public final SettingItemView M;

    @androidx.annotation.n0
    public final SettingItemView N;

    @androidx.annotation.n0
    public final SettingItemView O;

    @androidx.annotation.n0
    public final SettingItemView P;

    @androidx.annotation.n0
    public final SettingItemView Q;

    @androidx.annotation.n0
    public final RelativeLayout R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ScrollView f108298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f108299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final AvatarView f108300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f108301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f108303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f108304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f108305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108307j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f108310m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f108311n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f108312o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f108313p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f108314q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f108315r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f108316s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f108317t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f108318u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f108319v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f108320w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f108321x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f108322y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f108323z;

    private a2(@androidx.annotation.n0 ScrollView scrollView, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 AvatarView avatarView, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 CardView cardView3, @androidx.annotation.n0 CardView cardView4, @androidx.annotation.n0 CardView cardView5, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 CardView cardView6, @androidx.annotation.n0 SettingItemView settingItemView, @androidx.annotation.n0 SettingItemView settingItemView2, @androidx.annotation.n0 SettingItemView settingItemView3, @androidx.annotation.n0 SettingItemView settingItemView4, @androidx.annotation.n0 SettingItemView settingItemView5, @androidx.annotation.n0 SettingItemView settingItemView6, @androidx.annotation.n0 SettingItemView settingItemView7, @androidx.annotation.n0 SettingItemView settingItemView8, @androidx.annotation.n0 SettingItemView settingItemView9, @androidx.annotation.n0 SettingItemView settingItemView10, @androidx.annotation.n0 SettingItemView settingItemView11, @androidx.annotation.n0 SettingItemView settingItemView12, @androidx.annotation.n0 SettingItemView settingItemView13, @androidx.annotation.n0 SettingItemView settingItemView14, @androidx.annotation.n0 SettingItemView settingItemView15, @androidx.annotation.n0 SettingItemView settingItemView16, @androidx.annotation.n0 mb.m0 m0Var, @androidx.annotation.n0 CardView cardView7, @androidx.annotation.n0 SettingItemView settingItemView17, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 SettingItemView settingItemView18, @androidx.annotation.n0 SettingItemView settingItemView19, @androidx.annotation.n0 SettingItemView settingItemView20, @androidx.annotation.n0 SettingItemView settingItemView21, @androidx.annotation.n0 SettingItemView settingItemView22, @androidx.annotation.n0 SettingItemView settingItemView23, @androidx.annotation.n0 SettingItemView settingItemView24, @androidx.annotation.n0 SettingItemView settingItemView25, @androidx.annotation.n0 SettingItemView settingItemView26, @androidx.annotation.n0 SettingItemView settingItemView27, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f108298a = scrollView;
        this.f108299b = cardView;
        this.f108300c = avatarView;
        this.f108301d = cardView2;
        this.f108302e = imageView;
        this.f108303f = cardView3;
        this.f108304g = cardView4;
        this.f108305h = cardView5;
        this.f108306i = textView;
        this.f108307j = textView2;
        this.f108308k = textView3;
        this.f108309l = textView4;
        this.f108310m = cardView6;
        this.f108311n = settingItemView;
        this.f108312o = settingItemView2;
        this.f108313p = settingItemView3;
        this.f108314q = settingItemView4;
        this.f108315r = settingItemView5;
        this.f108316s = settingItemView6;
        this.f108317t = settingItemView7;
        this.f108318u = settingItemView8;
        this.f108319v = settingItemView9;
        this.f108320w = settingItemView10;
        this.f108321x = settingItemView11;
        this.f108322y = settingItemView12;
        this.f108323z = settingItemView13;
        this.A = settingItemView14;
        this.B = settingItemView15;
        this.C = settingItemView16;
        this.D = m0Var;
        this.E = cardView7;
        this.F = settingItemView17;
        this.G = linearLayout;
        this.H = settingItemView18;
        this.I = settingItemView19;
        this.J = settingItemView20;
        this.K = settingItemView21;
        this.L = settingItemView22;
        this.M = settingItemView23;
        this.N = settingItemView24;
        this.O = settingItemView25;
        this.P = settingItemView26;
        this.Q = settingItemView27;
        this.R = relativeLayout;
    }

    @androidx.annotation.n0
    public static a2 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16552, new Class[]{View.class}, a2.class);
        if (patchProxyResultProxy.isSupported) {
            return (a2) patchProxyResultProxy.result;
        }
        int i10 = R.id.app_info_present_setting_items;
        CardView cardView = (CardView) l3.d.a(view, R.id.app_info_present_setting_items);
        if (cardView != null) {
            i10 = R.id.avatar_view;
            AvatarView avatarView = (AvatarView) l3.d.a(view, R.id.avatar_view);
            if (avatarView != null) {
                i10 = R.id.common_user_setting_items;
                CardView cardView2 = (CardView) l3.d.a(view, R.id.common_user_setting_items);
                if (cardView2 != null) {
                    i10 = R.id.iv_change_arrow;
                    ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_change_arrow);
                    if (imageView != null) {
                        i10 = R.id.log_out_setting_items;
                        CardView cardView3 = (CardView) l3.d.a(view, R.id.log_out_setting_items);
                        if (cardView3 != null) {
                            i10 = R.id.safety_and_account_setting_items;
                            CardView cardView4 = (CardView) l3.d.a(view, R.id.safety_and_account_setting_items);
                            if (cardView4 != null) {
                                i10 = R.id.special_user_setting_items;
                                CardView cardView5 = (CardView) l3.d.a(view, R.id.special_user_setting_items);
                                if (cardView5 != null) {
                                    i10 = R.id.tv_change_desc;
                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_change_desc);
                                    if (textView != null) {
                                        i10 = R.id.tv_id;
                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_id);
                                        if (textView2 != null) {
                                            i10 = R.id.tv_logout_btn;
                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_logout_btn);
                                            if (textView3 != null) {
                                                i10 = R.id.tv_name;
                                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_name);
                                                if (textView4 != null) {
                                                    i10 = R.id.user_info_setting_items;
                                                    CardView cardView6 = (CardView) l3.d.a(view, R.id.user_info_setting_items);
                                                    if (cardView6 != null) {
                                                        i10 = R.id.vg_account_manager;
                                                        SettingItemView settingItemView = (SettingItemView) l3.d.a(view, R.id.vg_account_manager);
                                                        if (settingItemView != null) {
                                                            i10 = R.id.vg_address;
                                                            SettingItemView settingItemView2 = (SettingItemView) l3.d.a(view, R.id.vg_address);
                                                            if (settingItemView2 != null) {
                                                                i10 = R.id.vg_agreement;
                                                                SettingItemView settingItemView3 = (SettingItemView) l3.d.a(view, R.id.vg_agreement);
                                                                if (settingItemView3 != null) {
                                                                    i10 = R.id.vg_archival_info;
                                                                    SettingItemView settingItemView4 = (SettingItemView) l3.d.a(view, R.id.vg_archival_info);
                                                                    if (settingItemView4 != null) {
                                                                        i10 = R.id.vg_avatar_decor;
                                                                        SettingItemView settingItemView5 = (SettingItemView) l3.d.a(view, R.id.vg_avatar_decor);
                                                                        if (settingItemView5 != null) {
                                                                            i10 = R.id.vg_check_update;
                                                                            SettingItemView settingItemView6 = (SettingItemView) l3.d.a(view, R.id.vg_check_update);
                                                                            if (settingItemView6 != null) {
                                                                                i10 = R.id.vg_current_account;
                                                                                SettingItemView settingItemView7 = (SettingItemView) l3.d.a(view, R.id.vg_current_account);
                                                                                if (settingItemView7 != null) {
                                                                                    i10 = R.id.vg_debug_config_rylai_service_tag;
                                                                                    SettingItemView settingItemView8 = (SettingItemView) l3.d.a(view, R.id.vg_debug_config_rylai_service_tag);
                                                                                    if (settingItemView8 != null) {
                                                                                        i10 = R.id.vg_debug_option;
                                                                                        SettingItemView settingItemView9 = (SettingItemView) l3.d.a(view, R.id.vg_debug_option);
                                                                                        if (settingItemView9 != null) {
                                                                                            i10 = R.id.vg_developer_server;
                                                                                            SettingItemView settingItemView10 = (SettingItemView) l3.d.a(view, R.id.vg_developer_server);
                                                                                            if (settingItemView10 != null) {
                                                                                                i10 = R.id.vg_faq;
                                                                                                SettingItemView settingItemView11 = (SettingItemView) l3.d.a(view, R.id.vg_faq);
                                                                                                if (settingItemView11 != null) {
                                                                                                    i10 = R.id.vg_fast_test;
                                                                                                    SettingItemView settingItemView12 = (SettingItemView) l3.d.a(view, R.id.vg_fast_test);
                                                                                                    if (settingItemView12 != null) {
                                                                                                        i10 = R.id.vg_feedback_suggestions;
                                                                                                        SettingItemView settingItemView13 = (SettingItemView) l3.d.a(view, R.id.vg_feedback_suggestions);
                                                                                                        if (settingItemView13 != null) {
                                                                                                            i10 = R.id.vg_general_settings;
                                                                                                            SettingItemView settingItemView14 = (SettingItemView) l3.d.a(view, R.id.vg_general_settings);
                                                                                                            if (settingItemView14 != null) {
                                                                                                                i10 = R.id.vg_invite;
                                                                                                                SettingItemView settingItemView15 = (SettingItemView) l3.d.a(view, R.id.vg_invite);
                                                                                                                if (settingItemView15 != null) {
                                                                                                                    i10 = R.id.vg_invite_code;
                                                                                                                    SettingItemView settingItemView16 = (SettingItemView) l3.d.a(view, R.id.vg_invite_code);
                                                                                                                    if (settingItemView16 != null) {
                                                                                                                        i10 = R.id.vg_logo;
                                                                                                                        View viewA = l3.d.a(view, R.id.vg_logo);
                                                                                                                        if (viewA != null) {
                                                                                                                            mb.m0 m0VarA = mb.m0.a(viewA);
                                                                                                                            i10 = R.id.vg_manager_account;
                                                                                                                            CardView cardView7 = (CardView) l3.d.a(view, R.id.vg_manager_account);
                                                                                                                            if (cardView7 != null) {
                                                                                                                                i10 = R.id.vg_personal_info;
                                                                                                                                SettingItemView settingItemView17 = (SettingItemView) l3.d.a(view, R.id.vg_personal_info);
                                                                                                                                if (settingItemView17 != null) {
                                                                                                                                    i10 = R.id.vg_personal_settings;
                                                                                                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_personal_settings);
                                                                                                                                    if (linearLayout != null) {
                                                                                                                                        i10 = R.id.vg_privacy;
                                                                                                                                        SettingItemView settingItemView18 = (SettingItemView) l3.d.a(view, R.id.vg_privacy);
                                                                                                                                        if (settingItemView18 != null) {
                                                                                                                                            i10 = R.id.vg_privacy_settings;
                                                                                                                                            SettingItemView settingItemView19 = (SettingItemView) l3.d.a(view, R.id.vg_privacy_settings);
                                                                                                                                            if (settingItemView19 != null) {
                                                                                                                                                i10 = R.id.vg_rate;
                                                                                                                                                SettingItemView settingItemView20 = (SettingItemView) l3.d.a(view, R.id.vg_rate);
                                                                                                                                                if (settingItemView20 != null) {
                                                                                                                                                    i10 = R.id.vg_reset_password;
                                                                                                                                                    SettingItemView settingItemView21 = (SettingItemView) l3.d.a(view, R.id.vg_reset_password);
                                                                                                                                                    if (settingItemView21 != null) {
                                                                                                                                                        i10 = R.id.vg_set_enviroment;
                                                                                                                                                        SettingItemView settingItemView22 = (SettingItemView) l3.d.a(view, R.id.vg_set_enviroment);
                                                                                                                                                        if (settingItemView22 != null) {
                                                                                                                                                            i10 = R.id.vg_set_heybox_voice_environment;
                                                                                                                                                            SettingItemView settingItemView23 = (SettingItemView) l3.d.a(view, R.id.vg_set_heybox_voice_environment);
                                                                                                                                                            if (settingItemView23 != null) {
                                                                                                                                                                i10 = R.id.vg_set_push_state;
                                                                                                                                                                SettingItemView settingItemView24 = (SettingItemView) l3.d.a(view, R.id.vg_set_push_state);
                                                                                                                                                                if (settingItemView24 != null) {
                                                                                                                                                                    i10 = R.id.vg_switch_rylai_service_tag;
                                                                                                                                                                    SettingItemView settingItemView25 = (SettingItemView) l3.d.a(view, R.id.vg_switch_rylai_service_tag);
                                                                                                                                                                    if (settingItemView25 != null) {
                                                                                                                                                                        i10 = R.id.vg_switch_web_branch;
                                                                                                                                                                        SettingItemView settingItemView26 = (SettingItemView) l3.d.a(view, R.id.vg_switch_web_branch);
                                                                                                                                                                        if (settingItemView26 != null) {
                                                                                                                                                                            i10 = R.id.vg_third_party;
                                                                                                                                                                            SettingItemView settingItemView27 = (SettingItemView) l3.d.a(view, R.id.vg_third_party);
                                                                                                                                                                            if (settingItemView27 != null) {
                                                                                                                                                                                i10 = R.id.vg_user_info;
                                                                                                                                                                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_user_info);
                                                                                                                                                                                if (relativeLayout != null) {
                                                                                                                                                                                    return new a2((ScrollView) view, cardView, avatarView, cardView2, imageView, cardView3, cardView4, cardView5, textView, textView2, textView3, textView4, cardView6, settingItemView, settingItemView2, settingItemView3, settingItemView4, settingItemView5, settingItemView6, settingItemView7, settingItemView8, settingItemView9, settingItemView10, settingItemView11, settingItemView12, settingItemView13, settingItemView14, settingItemView15, settingItemView16, m0VarA, cardView7, settingItemView17, linearLayout, settingItemView18, settingItemView19, settingItemView20, settingItemView21, settingItemView22, settingItemView23, settingItemView24, settingItemView25, settingItemView26, settingItemView27, relativeLayout);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static a2 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16550, new Class[]{LayoutInflater.class}, a2.class);
        return patchProxyResultProxy.isSupported ? (a2) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static a2 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16551, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, a2.class);
        if (patchProxyResultProxy.isSupported) {
            return (a2) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_setting, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ScrollView b() {
        return this.f108298a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16553, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
