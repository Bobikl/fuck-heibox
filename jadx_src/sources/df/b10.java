package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.component.AvatarView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemUserTaskProfileHeaderV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b10 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f108715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final AvatarView f108716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f108717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108723i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108724j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108725k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108726l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f108727m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108728n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108729o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108730p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108731q;

    private b10(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 AvatarView avatarView, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4) {
        this.f108715a = constraintLayout;
        this.f108716b = avatarView;
        this.f108717c = progressBar;
        this.f108718d = relativeLayout;
        this.f108719e = textView;
        this.f108720f = textView2;
        this.f108721g = textView3;
        this.f108722h = textView4;
        this.f108723i = textView5;
        this.f108724j = textView6;
        this.f108725k = textView7;
        this.f108726l = textView8;
        this.f108727m = view;
        this.f108728n = linearLayout;
        this.f108729o = linearLayout2;
        this.f108730p = linearLayout3;
        this.f108731q = linearLayout4;
    }

    @androidx.annotation.n0
    public static b10 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20184, new Class[]{View.class}, b10.class);
        if (patchProxyResultProxy.isSupported) {
            return (b10) patchProxyResultProxy.result;
        }
        int i10 = R.id.avatar;
        AvatarView avatarView = (AvatarView) l3.d.a(view, R.id.avatar);
        if (avatarView != null) {
            i10 = R.id.pb_level;
            ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_level);
            if (progressBar != null) {
                i10 = R.id.rl_medal_level;
                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_medal_level);
                if (relativeLayout != null) {
                    i10 = R.id.tv_battery_count;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_battery_count);
                    if (textView != null) {
                        i10 = R.id.tv_hcoin_count;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_hcoin_count);
                        if (textView2 != null) {
                            i10 = R.id.tv_heybox_level_desc;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_heybox_level_desc);
                            if (textView3 != null) {
                                i10 = R.id.tv_level;
                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_level);
                                if (textView4 != null) {
                                    i10 = R.id.tv_level_desc;
                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_level_desc);
                                    if (textView5 != null) {
                                        i10 = R.id.tv_level_exp;
                                        TextView textView6 = (TextView) l3.d.a(view, R.id.tv_level_exp);
                                        if (textView6 != null) {
                                            i10 = R.id.tv_level_hint;
                                            TextView textView7 = (TextView) l3.d.a(view, R.id.tv_level_hint);
                                            if (textView7 != null) {
                                                i10 = R.id.tv_username;
                                                TextView textView8 = (TextView) l3.d.a(view, R.id.tv_username);
                                                if (textView8 != null) {
                                                    i10 = R.id.v_level_divider;
                                                    View viewA = l3.d.a(view, R.id.v_level_divider);
                                                    if (viewA != null) {
                                                        i10 = R.id.vg_battery;
                                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_battery);
                                                        if (linearLayout != null) {
                                                            i10 = R.id.vg_hcoin;
                                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_hcoin);
                                                            if (linearLayout2 != null) {
                                                                i10 = R.id.vg_medals;
                                                                LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_medals);
                                                                if (linearLayout3 != null) {
                                                                    i10 = R.id.vg_recent_achieved;
                                                                    LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_recent_achieved);
                                                                    if (linearLayout4 != null) {
                                                                        return new b10((ConstraintLayout) view, avatarView, progressBar, relativeLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, viewA, linearLayout, linearLayout2, linearLayout3, linearLayout4);
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
    public static b10 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20182, new Class[]{LayoutInflater.class}, b10.class);
        return patchProxyResultProxy.isSupported ? (b10) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static b10 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20183, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, b10.class);
        if (patchProxyResultProxy.isSupported) {
            return (b10) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_user_task_profile_header_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f108715a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20185, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
