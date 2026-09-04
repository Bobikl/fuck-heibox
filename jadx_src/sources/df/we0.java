package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewDota2FollowUserItemBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class we0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f117151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f117153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f117155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117158i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117159j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117160k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117161l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f117162m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117163n;

    private we0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f117150a = relativeLayout;
        this.f117151b = view;
        this.f117152c = imageView;
        this.f117153d = qMUIRadiusImageView;
        this.f117154e = imageView2;
        this.f117155f = qMUIRadiusImageView2;
        this.f117156g = textView;
        this.f117157h = textView2;
        this.f117158i = textView3;
        this.f117159j = textView4;
        this.f117160k = textView5;
        this.f117161l = textView6;
        this.f117162m = frameLayout;
        this.f117163n = linearLayout;
    }

    @androidx.annotation.n0
    public static we0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21606, new Class[]{View.class}, we0.class);
        if (patchProxyResultProxy.isSupported) {
            return (we0) patchProxyResultProxy.result;
        }
        int i10 = R.id.div;
        View viewA = l3.d.a(view, R.id.div);
        if (viewA != null) {
            i10 = R.id.iv_authentication;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_authentication);
            if (imageView != null) {
                i10 = R.id.iv_avatar;
                QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_avatar);
                if (qMUIRadiusImageView != null) {
                    i10 = R.id.iv_dan_icon;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_dan_icon);
                    if (imageView2 != null) {
                        i10 = R.id.iv_heybox_avatar;
                        QMUIRadiusImageView qMUIRadiusImageView2 = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_heybox_avatar);
                        if (qMUIRadiusImageView2 != null) {
                            i10 = R.id.tv_dan_number;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_dan_number);
                            if (textView != null) {
                                i10 = R.id.tv_heybox_name;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_heybox_name);
                                if (textView2 != null) {
                                    i10 = R.id.tv_invite;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_invite);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_name;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_name);
                                        if (textView4 != null) {
                                            i10 = R.id.tv_rank;
                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_rank);
                                            if (textView5 != null) {
                                                i10 = R.id.tv_state;
                                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_state);
                                                if (textView6 != null) {
                                                    i10 = R.id.vg_dan;
                                                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_dan);
                                                    if (frameLayout != null) {
                                                        i10 = R.id.vg_user;
                                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_user);
                                                        if (linearLayout != null) {
                                                            return new we0((RelativeLayout) view, viewA, imageView, qMUIRadiusImageView, imageView2, qMUIRadiusImageView2, textView, textView2, textView3, textView4, textView5, textView6, frameLayout, linearLayout);
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
    public static we0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21604, new Class[]{LayoutInflater.class}, we0.class);
        return patchProxyResultProxy.isSupported ? (we0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static we0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21605, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, we0.class);
        if (patchProxyResultProxy.isSupported) {
            return (we0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_dota2_follow_user_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117150a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21607, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
