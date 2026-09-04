package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.component.AvatarView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutUserMedalDetailBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class yb0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f117890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final AvatarView f117891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f117895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117899j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117900k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117901l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117902m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117903n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117904o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f117905p;

    private yb0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 AvatarView avatarView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 FrameLayout frameLayout) {
        this.f117890a = linearLayout;
        this.f117891b = avatarView;
        this.f117892c = imageView;
        this.f117893d = imageView2;
        this.f117894e = imageView3;
        this.f117895f = progressBar;
        this.f117896g = textView;
        this.f117897h = textView2;
        this.f117898i = textView3;
        this.f117899j = textView4;
        this.f117900k = textView5;
        this.f117901l = textView6;
        this.f117902m = textView7;
        this.f117903n = textView8;
        this.f117904o = linearLayout2;
        this.f117905p = frameLayout;
    }

    @androidx.annotation.n0
    public static yb0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21305, new Class[]{View.class}, yb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (yb0) patchProxyResultProxy.result;
        }
        int i10 = R.id.avatar;
        AvatarView avatarView = (AvatarView) l3.d.a(view, R.id.avatar);
        if (avatarView != null) {
            i10 = R.id.iv_achievement_level;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_achievement_level);
            if (imageView != null) {
                i10 = R.id.iv_image;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_image);
                if (imageView2 != null) {
                    i10 = R.id.iv_medal;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_medal);
                    if (imageView3 != null) {
                        i10 = R.id.pb_exp;
                        ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_exp);
                        if (progressBar != null) {
                            i10 = R.id.tv_achieved_percent;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_achieved_percent);
                            if (textView != null) {
                                i10 = R.id.tv_desc;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc);
                                if (textView2 != null) {
                                    i10 = R.id.tv_exp_desc;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_exp_desc);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_level;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_level);
                                        if (textView4 != null) {
                                            i10 = R.id.tv_name;
                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_name);
                                            if (textView5 != null) {
                                                i10 = R.id.tv_title;
                                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_title);
                                                if (textView6 != null) {
                                                    i10 = R.id.tv_user_name;
                                                    TextView textView7 = (TextView) l3.d.a(view, R.id.tv_user_name);
                                                    if (textView7 != null) {
                                                        i10 = R.id.tv_wear_state;
                                                        TextView textView8 = (TextView) l3.d.a(view, R.id.tv_wear_state);
                                                        if (textView8 != null) {
                                                            LinearLayout linearLayout = (LinearLayout) view;
                                                            i10 = R.id.vg_wear_state;
                                                            FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_wear_state);
                                                            if (frameLayout != null) {
                                                                return new yb0(linearLayout, avatarView, imageView, imageView2, imageView3, progressBar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, linearLayout, frameLayout);
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
    public static yb0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21303, new Class[]{LayoutInflater.class}, yb0.class);
        return patchProxyResultProxy.isSupported ? (yb0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static yb0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21304, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, yb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (yb0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_user_medal_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f117890a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21306, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
