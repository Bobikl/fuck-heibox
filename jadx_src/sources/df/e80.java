package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.hbcustomview.shinebuttonlib.ShineButton;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.GameRateStarView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutMomentsUserTitleBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e80 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxAvatarView f110064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ShineButton f110067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110071i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110072j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110073k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameRateStarView f110075m;

    private e80(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 HeyBoxAvatarView heyBoxAvatarView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 ShineButton shineButton, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 GameRateStarView gameRateStarView) {
        this.f110063a = relativeLayout;
        this.f110064b = heyBoxAvatarView;
        this.f110065c = imageView;
        this.f110066d = relativeLayout2;
        this.f110067e = shineButton;
        this.f110068f = textView;
        this.f110069g = textView2;
        this.f110070h = textView3;
        this.f110071i = textView4;
        this.f110072j = view;
        this.f110073k = linearLayout;
        this.f110074l = linearLayout2;
        this.f110075m = gameRateStarView;
    }

    @androidx.annotation.n0
    public static e80 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20918, new Class[]{View.class}, e80.class);
        if (patchProxyResultProxy.isSupported) {
            return (e80) patchProxyResultProxy.result;
        }
        int i10 = R.id.avatar;
        HeyBoxAvatarView heyBoxAvatarView = (HeyBoxAvatarView) l3.d.a(view, R.id.avatar);
        if (heyBoxAvatarView != null) {
            i10 = R.id.iv_not_interested;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_not_interested);
            if (imageView != null) {
                i10 = R.id.rl_medal_level;
                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_medal_level);
                if (relativeLayout != null) {
                    i10 = R.id.sb_interactive_like;
                    ShineButton shineButton = (ShineButton) l3.d.a(view, R.id.sb_interactive_like);
                    if (shineButton != null) {
                        i10 = R.id.tv_desc;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
                        if (textView != null) {
                            i10 = R.id.tv_interactive_comment;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_interactive_comment);
                            if (textView2 != null) {
                                i10 = R.id.tv_interactive_like;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_interactive_like);
                                if (textView3 != null) {
                                    i10 = R.id.tv_name;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_name);
                                    if (textView4 != null) {
                                        i10 = R.id.v_placeholder;
                                        View viewA = l3.d.a(view, R.id.v_placeholder);
                                        if (viewA != null) {
                                            i10 = R.id.vg_interactive_comment;
                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_interactive_comment);
                                            if (linearLayout != null) {
                                                i10 = R.id.vg_interactive_like;
                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_interactive_like);
                                                if (linearLayout2 != null) {
                                                    i10 = R.id.vg_rating_star;
                                                    GameRateStarView gameRateStarView = (GameRateStarView) l3.d.a(view, R.id.vg_rating_star);
                                                    if (gameRateStarView != null) {
                                                        return new e80((RelativeLayout) view, heyBoxAvatarView, imageView, relativeLayout, shineButton, textView, textView2, textView3, textView4, viewA, linearLayout, linearLayout2, gameRateStarView);
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
    public static e80 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20916, new Class[]{LayoutInflater.class}, e80.class);
        return patchProxyResultProxy.isSupported ? (e80) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static e80 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20917, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, e80.class);
        if (patchProxyResultProxy.isSupported) {
            return (e80) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_moments_user_title, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110063a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20919, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
