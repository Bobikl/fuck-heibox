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

/* JADX INFO: compiled from: ItemFriendRankingXBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zj implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f118380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f118384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f118386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118388i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f118389j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118390k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118391l;

    private zj(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 GradientTextView gradientTextView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3) {
        this.f118380a = relativeLayout;
        this.f118381b = imageView;
        this.f118382c = imageView2;
        this.f118383d = imageView3;
        this.f118384e = progressBar;
        this.f118385f = textView;
        this.f118386g = gradientTextView;
        this.f118387h = textView2;
        this.f118388i = textView3;
        this.f118389j = view;
        this.f118390k = relativeLayout2;
        this.f118391l = relativeLayout3;
    }

    @androidx.annotation.n0
    public static zj a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18419, new Class[]{View.class}, zj.class);
        if (patchProxyResultProxy.isSupported) {
            return (zj) patchProxyResultProxy.result;
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
                                                    return new zj((RelativeLayout) view, imageView, imageView2, imageView3, progressBar, textView, gradientTextView, textView2, textView3, viewA, relativeLayout, relativeLayout2);
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
    public static zj c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18417, new Class[]{LayoutInflater.class}, zj.class);
        return patchProxyResultProxy.isSupported ? (zj) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static zj d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18418, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, zj.class);
        if (patchProxyResultProxy.isSupported) {
            return (zj) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_friend_ranking_x, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f118380a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18420, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
