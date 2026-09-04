package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.GradientTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutItemFriendRankingXV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l70 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f112900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f112904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f112906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112907h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112908i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112909j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112910k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112911l;

    private l70(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 GradientTextView gradientTextView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3) {
        this.f112900a = relativeLayout;
        this.f112901b = imageView;
        this.f112902c = imageView2;
        this.f112903d = imageView3;
        this.f112904e = progressBar;
        this.f112905f = textView;
        this.f112906g = gradientTextView;
        this.f112907h = textView2;
        this.f112908i = textView3;
        this.f112909j = view;
        this.f112910k = relativeLayout2;
        this.f112911l = relativeLayout3;
    }

    @androidx.annotation.n0
    public static l70 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20844, new Class[]{View.class}, l70.class);
        if (patchProxyResultProxy.isSupported) {
            return (l70) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_friend_rating_img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_friend_rating_img);
        if (imageView != null) {
            i10 = R.id.iv_item_friend_ranking_avatar;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_item_friend_ranking_avatar);
            if (imageView2 != null) {
                i10 = R.id.iv_item_friend_ranking_x_heybox_avatar;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_item_friend_ranking_x_heybox_avatar);
                if (imageView3 != null) {
                    i10 = R.id.pb_item_friend_ranking_x;
                    ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_item_friend_ranking_x);
                    if (progressBar != null) {
                        i10 = R.id.tv_item_friend_ranking_nickname;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_item_friend_ranking_nickname);
                        if (textView != null) {
                            i10 = R.id.tv_item_friend_ranking_num;
                            GradientTextView gradientTextView = (GradientTextView) l3.d.a(view, R.id.tv_item_friend_ranking_num);
                            if (gradientTextView != null) {
                                i10 = R.id.tv_item_friend_ranking_x_heybox_username;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_item_friend_ranking_x_heybox_username);
                                if (textView2 != null) {
                                    i10 = R.id.tv_item_friend_ranking_x_time;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_item_friend_ranking_x_time);
                                    if (textView3 != null) {
                                        i10 = R.id.v_item_friend_ranking_divider;
                                        View viewA = l3.d.a(view, R.id.v_item_friend_ranking_divider);
                                        if (viewA != null) {
                                            i10 = R.id.vg_item_friend_invite;
                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_item_friend_invite);
                                            if (relativeLayout != null) {
                                                i10 = R.id.vg_item_friend_ranking_x_heybox_info;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_item_friend_ranking_x_heybox_info);
                                                if (relativeLayout2 != null) {
                                                    return new l70((RelativeLayout) view, imageView, imageView2, imageView3, progressBar, textView, gradientTextView, textView2, textView3, viewA, relativeLayout, relativeLayout2);
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
    public static l70 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20842, new Class[]{LayoutInflater.class}, l70.class);
        return patchProxyResultProxy.isSupported ? (l70) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static l70 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20843, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, l70.class);
        if (patchProxyResultProxy.isSupported) {
            return (l70) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_item_friend_ranking_x_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f112900a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20845, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
