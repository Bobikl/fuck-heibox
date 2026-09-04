package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutFriendItemBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n50 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f113674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f113675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f113679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113682i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113683j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113684k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113685l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113686m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113687n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113688o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113690q;

    private n50(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 Guideline guideline, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4) {
        this.f113674a = constraintLayout;
        this.f113675b = view;
        this.f113676c = imageView;
        this.f113677d = imageView2;
        this.f113678e = imageView3;
        this.f113679f = guideline;
        this.f113680g = textView;
        this.f113681h = textView2;
        this.f113682i = textView3;
        this.f113683j = textView4;
        this.f113684k = textView5;
        this.f113685l = textView6;
        this.f113686m = textView7;
        this.f113687n = linearLayout;
        this.f113688o = linearLayout2;
        this.f113689p = linearLayout3;
        this.f113690q = linearLayout4;
    }

    @androidx.annotation.n0
    public static n50 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20644, new Class[]{View.class}, n50.class);
        if (patchProxyResultProxy.isSupported) {
            return (n50) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            i10 = R.id.iv_achievement;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_achievement);
            if (imageView != null) {
                i10 = R.id.iv_avatar;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_avatar);
                if (imageView2 != null) {
                    i10 = R.id.iv_heybox_avatar;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_heybox_avatar);
                    if (imageView3 != null) {
                        i10 = R.id.line_guide;
                        Guideline guideline = (Guideline) l3.d.a(view, R.id.line_guide);
                        if (guideline != null) {
                            i10 = R.id.tv_achievement;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_achievement);
                            if (textView != null) {
                                i10 = R.id.tv_avatar;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_avatar);
                                if (textView2 != null) {
                                    i10 = R.id.tv_heybox_nickname;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_heybox_nickname);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_invite;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_invite);
                                        if (textView4 != null) {
                                            i10 = R.id.tv_nickname;
                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_nickname);
                                            if (textView5 != null) {
                                                i10 = R.id.tv_rank;
                                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_rank);
                                                if (textView6 != null) {
                                                    i10 = R.id.tv_status;
                                                    TextView textView7 = (TextView) l3.d.a(view, R.id.tv_status);
                                                    if (textView7 != null) {
                                                        i10 = R.id.vg_account_info;
                                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_account_info);
                                                        if (linearLayout != null) {
                                                            i10 = R.id.vg_achievement_point;
                                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_achievement_point);
                                                            if (linearLayout2 != null) {
                                                                i10 = R.id.vg_heybox_account;
                                                                LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_heybox_account);
                                                                if (linearLayout3 != null) {
                                                                    i10 = R.id.vg_heybox_account_content;
                                                                    LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_heybox_account_content);
                                                                    if (linearLayout4 != null) {
                                                                        return new n50((ConstraintLayout) view, viewA, imageView, imageView2, imageView3, guideline, textView, textView2, textView3, textView4, textView5, textView6, textView7, linearLayout, linearLayout2, linearLayout3, linearLayout4);
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
    public static n50 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20642, new Class[]{LayoutInflater.class}, n50.class);
        return patchProxyResultProxy.isSupported ? (n50) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static n50 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20643, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, n50.class);
        if (patchProxyResultProxy.isSupported) {
            return (n50) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_friend_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f113674a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20645, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
