package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcustomview.roundedview.HBRoundedCornerLinearLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.max.xiaoheihe.module.game.component.GameCommentLikeDislikeHappyView;
import com.max.xiaoheihe.module.game.component.GameRateStarView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutGameCommentContentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w50 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final NestedScrollView f117037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameCommentLikeDislikeHappyView f117038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameRateStarView f117039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final AppCompatImageView f117040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f117044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117045i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117046j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117047k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSUserSectionView f117048l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBRoundedCornerLinearLayout f117049m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117050n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f117051o;

    private w50(@androidx.annotation.n0 NestedScrollView nestedScrollView, @androidx.annotation.n0 GameCommentLikeDislikeHappyView gameCommentLikeDislikeHappyView, @androidx.annotation.n0 GameRateStarView gameRateStarView, @androidx.annotation.n0 AppCompatImageView appCompatImageView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 BBSUserSectionView bBSUserSectionView, @androidx.annotation.n0 HBRoundedCornerLinearLayout hBRoundedCornerLinearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FrameLayout frameLayout) {
        this.f117037a = nestedScrollView;
        this.f117038b = gameCommentLikeDislikeHappyView;
        this.f117039c = gameRateStarView;
        this.f117040d = appCompatImageView;
        this.f117041e = imageView;
        this.f117042f = linearLayout;
        this.f117043g = linearLayout2;
        this.f117044h = recyclerView;
        this.f117045i = textView;
        this.f117046j = textView2;
        this.f117047k = textView3;
        this.f117048l = bBSUserSectionView;
        this.f117049m = hBRoundedCornerLinearLayout;
        this.f117050n = relativeLayout;
        this.f117051o = frameLayout;
    }

    @androidx.annotation.n0
    public static w50 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20680, new Class[]{View.class}, w50.class);
        if (patchProxyResultProxy.isSupported) {
            return (w50) patchProxyResultProxy.result;
        }
        int i10 = R.id.gcldh;
        GameCommentLikeDislikeHappyView gameCommentLikeDislikeHappyView = (GameCommentLikeDislikeHappyView) l3.d.a(view, R.id.gcldh);
        if (gameCommentLikeDislikeHappyView != null) {
            i10 = R.id.grsv_score;
            GameRateStarView gameRateStarView = (GameRateStarView) l3.d.a(view, R.id.grsv_score);
            if (gameRateStarView != null) {
                i10 = R.id.iv_rating_arrow;
                AppCompatImageView appCompatImageView = (AppCompatImageView) l3.d.a(view, R.id.iv_rating_arrow);
                if (appCompatImageView != null) {
                    i10 = R.id.iv_share;
                    ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_share);
                    if (imageView != null) {
                        i10 = R.id.ll_comment;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_comment);
                        if (linearLayout != null) {
                            i10 = R.id.ll_share;
                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_share);
                            if (linearLayout2 != null) {
                                i10 = R.id.rv;
                                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
                                if (recyclerView != null) {
                                    i10 = R.id.tv_played_state;
                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_played_state);
                                    if (textView != null) {
                                        i10 = R.id.tv_rating_label;
                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_rating_label);
                                        if (textView2 != null) {
                                            i10 = R.id.tv_share;
                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_share);
                                            if (textView3 != null) {
                                                i10 = R.id.v_user;
                                                BBSUserSectionView bBSUserSectionView = (BBSUserSectionView) l3.d.a(view, R.id.v_user);
                                                if (bBSUserSectionView != null) {
                                                    i10 = R.id.vg_game_score;
                                                    HBRoundedCornerLinearLayout hBRoundedCornerLinearLayout = (HBRoundedCornerLinearLayout) l3.d.a(view, R.id.vg_game_score);
                                                    if (hBRoundedCornerLinearLayout != null) {
                                                        i10 = R.id.vg_post_options;
                                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_post_options);
                                                        if (relativeLayout != null) {
                                                            i10 = R.id.vg_rv;
                                                            FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_rv);
                                                            if (frameLayout != null) {
                                                                return new w50((NestedScrollView) view, gameCommentLikeDislikeHappyView, gameRateStarView, appCompatImageView, imageView, linearLayout, linearLayout2, recyclerView, textView, textView2, textView3, bBSUserSectionView, hBRoundedCornerLinearLayout, relativeLayout, frameLayout);
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
    public static w50 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20678, new Class[]{LayoutInflater.class}, w50.class);
        return patchProxyResultProxy.isSupported ? (w50) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static w50 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20679, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, w50.class);
        if (patchProxyResultProxy.isSupported) {
            return (w50) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_game_comment_content, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public NestedScrollView b() {
        return this.f117037a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20681, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
