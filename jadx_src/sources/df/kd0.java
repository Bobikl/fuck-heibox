package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.module.game.component.GameCommentLikeDislikeHappyView;
import com.max.xiaoheihe.module.game.component.GameRateStarView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: TableRowBbsCommentFirstBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kd0 implements l3.c {
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
    public final TextView E;

    @androidx.annotation.n0
    public final TextView F;

    @androidx.annotation.n0
    public final TextView G;

    @androidx.annotation.n0
    public final TextView H;

    @androidx.annotation.n0
    public final TextView I;

    @androidx.annotation.n0
    public final TextView J;

    @androidx.annotation.n0
    public final TextView K;

    @androidx.annotation.n0
    public final TextView L;

    @androidx.annotation.n0
    public final ExpressionTextView M;

    @androidx.annotation.n0
    public final TextView N;

    @androidx.annotation.n0
    public final TextView O;

    @androidx.annotation.n0
    public final TextView P;

    @androidx.annotation.n0
    public final BBSUserSectionView Q;

    @androidx.annotation.n0
    public final RelativeLayout R;

    @androidx.annotation.n0
    public final h20 S;

    @androidx.annotation.n0
    public final i20 T;

    @androidx.annotation.n0
    public final h20 U;

    @androidx.annotation.n0
    public final RelativeLayout V;

    @androidx.annotation.n0
    public final LinearLayout W;

    @androidx.annotation.n0
    public final RelativeLayout X;

    @androidx.annotation.n0
    public final LinearLayout Y;

    @androidx.annotation.n0
    public final LinearLayout Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final NestedScrollView f112565a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112566a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxAvatarView f112567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f112568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f112569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f112570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameCommentLikeDislikeHappyView f112571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112574i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112575j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112576k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112577l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112578m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112579n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112580o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112581p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112582q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112583r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112584s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112585t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112586u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112587v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112588w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameRateStarView f112589x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112590y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112591z;

    private kd0(@androidx.annotation.n0 NestedScrollView nestedScrollView, @androidx.annotation.n0 HeyBoxAvatarView heyBoxAvatarView, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 GameCommentLikeDislikeHappyView gameCommentLikeDislikeHappyView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 ImageView imageView7, @androidx.annotation.n0 ImageView imageView8, @androidx.annotation.n0 ImageView imageView9, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 LinearLayout linearLayout7, @androidx.annotation.n0 LinearLayout linearLayout8, @androidx.annotation.n0 GameRateStarView gameRateStarView, @androidx.annotation.n0 LinearLayout linearLayout9, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 TextView textView12, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 TextView textView13, @androidx.annotation.n0 TextView textView14, @androidx.annotation.n0 TextView textView15, @androidx.annotation.n0 BBSUserSectionView bBSUserSectionView, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 h20 h20Var, @androidx.annotation.n0 i20 i20Var, @androidx.annotation.n0 h20 h20Var2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 LinearLayout linearLayout10, @androidx.annotation.n0 RelativeLayout relativeLayout4, @androidx.annotation.n0 LinearLayout linearLayout11, @androidx.annotation.n0 LinearLayout linearLayout12, @androidx.annotation.n0 LinearLayout linearLayout13) {
        this.f112565a = nestedScrollView;
        this.f112567b = heyBoxAvatarView;
        this.f112568c = checkBox;
        this.f112569d = cardView;
        this.f112570e = cardView2;
        this.f112571f = gameCommentLikeDislikeHappyView;
        this.f112572g = imageView;
        this.f112573h = imageView2;
        this.f112574i = imageView3;
        this.f112575j = imageView4;
        this.f112576k = imageView5;
        this.f112577l = imageView6;
        this.f112578m = imageView7;
        this.f112579n = imageView8;
        this.f112580o = imageView9;
        this.f112581p = linearLayout;
        this.f112582q = linearLayout2;
        this.f112583r = linearLayout3;
        this.f112584s = linearLayout4;
        this.f112585t = linearLayout5;
        this.f112586u = linearLayout6;
        this.f112587v = linearLayout7;
        this.f112588w = linearLayout8;
        this.f112589x = gameRateStarView;
        this.f112590y = linearLayout9;
        this.f112591z = relativeLayout;
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
        this.D = textView4;
        this.E = textView5;
        this.F = textView6;
        this.G = textView7;
        this.H = textView8;
        this.I = textView9;
        this.J = textView10;
        this.K = textView11;
        this.L = textView12;
        this.M = expressionTextView;
        this.N = textView13;
        this.O = textView14;
        this.P = textView15;
        this.Q = bBSUserSectionView;
        this.R = relativeLayout2;
        this.S = h20Var;
        this.T = i20Var;
        this.U = h20Var2;
        this.V = relativeLayout3;
        this.W = linearLayout10;
        this.X = relativeLayout4;
        this.Y = linearLayout11;
        this.Z = linearLayout12;
        this.f112566a0 = linearLayout13;
    }

    @androidx.annotation.n0
    public static kd0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21456, new Class[]{View.class}, kd0.class);
        if (patchProxyResultProxy.isSupported) {
            return (kd0) patchProxyResultProxy.result;
        }
        int i10 = R.id.avatar;
        HeyBoxAvatarView heyBoxAvatarView = (HeyBoxAvatarView) l3.d.a(view, R.id.avatar);
        if (heyBoxAvatarView != null) {
            i10 = R.id.cb_feedback_up;
            CheckBox checkBox = (CheckBox) l3.d.a(view, R.id.cb_feedback_up);
            if (checkBox != null) {
                i10 = R.id.cv_earn_info;
                CardView cardView = (CardView) l3.d.a(view, R.id.cv_earn_info);
                if (cardView != null) {
                    i10 = R.id.cv_my_prize;
                    CardView cardView2 = (CardView) l3.d.a(view, R.id.cv_my_prize);
                    if (cardView2 != null) {
                        i10 = R.id.gcldh;
                        GameCommentLikeDislikeHappyView gameCommentLikeDislikeHappyView = (GameCommentLikeDislikeHappyView) l3.d.a(view, R.id.gcldh);
                        if (gameCommentLikeDislikeHappyView != null) {
                            i10 = R.id.iv_boutique_more;
                            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_boutique_more);
                            if (imageView != null) {
                                i10 = R.id.iv_boutique_score;
                                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_boutique_score);
                                if (imageView2 != null) {
                                    i10 = R.id.iv_collect;
                                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_collect);
                                    if (imageView3 != null) {
                                        i10 = R.id.iv_h_coin;
                                        ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_h_coin);
                                        if (imageView4 != null) {
                                            i10 = R.id.iv_mi_coin;
                                            ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_mi_coin);
                                            if (imageView5 != null) {
                                                i10 = R.id.iv_opt_down;
                                                ImageView imageView6 = (ImageView) l3.d.a(view, R.id.iv_opt_down);
                                                if (imageView6 != null) {
                                                    i10 = R.id.iv_opt_up;
                                                    ImageView imageView7 = (ImageView) l3.d.a(view, R.id.iv_opt_up);
                                                    if (imageView7 != null) {
                                                        i10 = R.id.iv_share;
                                                        ImageView imageView8 = (ImageView) l3.d.a(view, R.id.iv_share);
                                                        if (imageView8 != null) {
                                                            i10 = R.id.iv_topic_pic;
                                                            ImageView imageView9 = (ImageView) l3.d.a(view, R.id.iv_topic_pic);
                                                            if (imageView9 != null) {
                                                                i10 = R.id.ll_collect;
                                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_collect);
                                                                if (linearLayout != null) {
                                                                    i10 = R.id.ll_comment;
                                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_comment);
                                                                    if (linearLayout2 != null) {
                                                                        i10 = R.id.ll_earn_info;
                                                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.ll_earn_info);
                                                                        if (linearLayout3 != null) {
                                                                            i10 = R.id.ll_games;
                                                                            LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.ll_games);
                                                                            if (linearLayout4 != null) {
                                                                                i10 = R.id.ll_my_prize;
                                                                                LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.ll_my_prize);
                                                                                if (linearLayout5 != null) {
                                                                                    i10 = R.id.ll_opt_down;
                                                                                    LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.ll_opt_down);
                                                                                    if (linearLayout6 != null) {
                                                                                        i10 = R.id.ll_opt_up;
                                                                                        LinearLayout linearLayout7 = (LinearLayout) l3.d.a(view, R.id.ll_opt_up);
                                                                                        if (linearLayout7 != null) {
                                                                                            i10 = R.id.ll_pic;
                                                                                            LinearLayout linearLayout8 = (LinearLayout) l3.d.a(view, R.id.ll_pic);
                                                                                            if (linearLayout8 != null) {
                                                                                                i10 = R.id.ll_rating;
                                                                                                GameRateStarView gameRateStarView = (GameRateStarView) l3.d.a(view, R.id.ll_rating);
                                                                                                if (gameRateStarView != null) {
                                                                                                    i10 = R.id.ll_share;
                                                                                                    LinearLayout linearLayout9 = (LinearLayout) l3.d.a(view, R.id.ll_share);
                                                                                                    if (linearLayout9 != null) {
                                                                                                        i10 = R.id.rl_medal_level;
                                                                                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_medal_level);
                                                                                                        if (relativeLayout != null) {
                                                                                                            i10 = R.id.tv_boutique_score;
                                                                                                            TextView textView = (TextView) l3.d.a(view, R.id.tv_boutique_score);
                                                                                                            if (textView != null) {
                                                                                                                i10 = R.id.tv_collect;
                                                                                                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_collect);
                                                                                                                if (textView2 != null) {
                                                                                                                    i10 = R.id.tv_follow_status;
                                                                                                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_follow_status);
                                                                                                                    if (textView3 != null) {
                                                                                                                        i10 = R.id.tv_h_coin;
                                                                                                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_h_coin);
                                                                                                                        if (textView4 != null) {
                                                                                                                            i10 = R.id.tv_mi_coin;
                                                                                                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_mi_coin);
                                                                                                                            if (textView5 != null) {
                                                                                                                                i10 = R.id.tv_moments_desc;
                                                                                                                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_moments_desc);
                                                                                                                                if (textView6 != null) {
                                                                                                                                    i10 = R.id.tv_official_reply;
                                                                                                                                    TextView textView7 = (TextView) l3.d.a(view, R.id.tv_official_reply);
                                                                                                                                    if (textView7 != null) {
                                                                                                                                        i10 = R.id.tv_opt_down;
                                                                                                                                        TextView textView8 = (TextView) l3.d.a(view, R.id.tv_opt_down);
                                                                                                                                        if (textView8 != null) {
                                                                                                                                            i10 = R.id.tv_opt_up;
                                                                                                                                            TextView textView9 = (TextView) l3.d.a(view, R.id.tv_opt_up);
                                                                                                                                            if (textView9 != null) {
                                                                                                                                                i10 = R.id.tv_related_videos_title;
                                                                                                                                                TextView textView10 = (TextView) l3.d.a(view, R.id.tv_related_videos_title);
                                                                                                                                                if (textView10 != null) {
                                                                                                                                                    i10 = R.id.tv_reply_time;
                                                                                                                                                    TextView textView11 = (TextView) l3.d.a(view, R.id.tv_reply_time);
                                                                                                                                                    if (textView11 != null) {
                                                                                                                                                        i10 = R.id.tv_share;
                                                                                                                                                        TextView textView12 = (TextView) l3.d.a(view, R.id.tv_share);
                                                                                                                                                        if (textView12 != null) {
                                                                                                                                                            i10 = R.id.tv_title;
                                                                                                                                                            ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_title);
                                                                                                                                                            if (expressionTextView != null) {
                                                                                                                                                                i10 = R.id.tv_title_desc;
                                                                                                                                                                TextView textView13 = (TextView) l3.d.a(view, R.id.tv_title_desc);
                                                                                                                                                                if (textView13 != null) {
                                                                                                                                                                    i10 = R.id.tv_title_topic_desc;
                                                                                                                                                                    TextView textView14 = (TextView) l3.d.a(view, R.id.tv_title_topic_desc);
                                                                                                                                                                    if (textView14 != null) {
                                                                                                                                                                        i10 = R.id.tv_user_name;
                                                                                                                                                                        TextView textView15 = (TextView) l3.d.a(view, R.id.tv_user_name);
                                                                                                                                                                        if (textView15 != null) {
                                                                                                                                                                            i10 = R.id.v_user;
                                                                                                                                                                            BBSUserSectionView bBSUserSectionView = (BBSUserSectionView) l3.d.a(view, R.id.v_user);
                                                                                                                                                                            if (bBSUserSectionView != null) {
                                                                                                                                                                                i10 = R.id.vg_boutique;
                                                                                                                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_boutique);
                                                                                                                                                                                if (relativeLayout2 != null) {
                                                                                                                                                                                    i10 = R.id.vg_earn_info_title;
                                                                                                                                                                                    View viewA = l3.d.a(view, R.id.vg_earn_info_title);
                                                                                                                                                                                    if (viewA != null) {
                                                                                                                                                                                        h20 h20VarA = h20.a(viewA);
                                                                                                                                                                                        i10 = R.id.vg_more_earn_info;
                                                                                                                                                                                        View viewA2 = l3.d.a(view, R.id.vg_more_earn_info);
                                                                                                                                                                                        if (viewA2 != null) {
                                                                                                                                                                                            i20 i20VarA = i20.a(viewA2);
                                                                                                                                                                                            i10 = R.id.vg_my_prize_title;
                                                                                                                                                                                            View viewA3 = l3.d.a(view, R.id.vg_my_prize_title);
                                                                                                                                                                                            if (viewA3 != null) {
                                                                                                                                                                                                h20 h20VarA2 = h20.a(viewA3);
                                                                                                                                                                                                i10 = R.id.vg_post_author;
                                                                                                                                                                                                RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_post_author);
                                                                                                                                                                                                if (relativeLayout3 != null) {
                                                                                                                                                                                                    i10 = R.id.vg_post_option;
                                                                                                                                                                                                    LinearLayout linearLayout10 = (LinearLayout) l3.d.a(view, R.id.vg_post_option);
                                                                                                                                                                                                    if (linearLayout10 != null) {
                                                                                                                                                                                                        i10 = R.id.vg_post_options;
                                                                                                                                                                                                        RelativeLayout relativeLayout4 = (RelativeLayout) l3.d.a(view, R.id.vg_post_options);
                                                                                                                                                                                                        if (relativeLayout4 != null) {
                                                                                                                                                                                                            i10 = R.id.vg_related_moments;
                                                                                                                                                                                                            LinearLayout linearLayout11 = (LinearLayout) l3.d.a(view, R.id.vg_related_moments);
                                                                                                                                                                                                            if (linearLayout11 != null) {
                                                                                                                                                                                                                i10 = R.id.vg_title_desc;
                                                                                                                                                                                                                LinearLayout linearLayout12 = (LinearLayout) l3.d.a(view, R.id.vg_title_desc);
                                                                                                                                                                                                                if (linearLayout12 != null) {
                                                                                                                                                                                                                    i10 = R.id.vg_topic;
                                                                                                                                                                                                                    LinearLayout linearLayout13 = (LinearLayout) l3.d.a(view, R.id.vg_topic);
                                                                                                                                                                                                                    if (linearLayout13 != null) {
                                                                                                                                                                                                                        return new kd0((NestedScrollView) view, heyBoxAvatarView, checkBox, cardView, cardView2, gameCommentLikeDislikeHappyView, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, gameRateStarView, linearLayout9, relativeLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, expressionTextView, textView13, textView14, textView15, bBSUserSectionView, relativeLayout2, h20VarA, i20VarA, h20VarA2, relativeLayout3, linearLayout10, relativeLayout4, linearLayout11, linearLayout12, linearLayout13);
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
    public static kd0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21454, new Class[]{LayoutInflater.class}, kd0.class);
        return patchProxyResultProxy.isSupported ? (kd0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static kd0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21455, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, kd0.class);
        if (patchProxyResultProxy.isSupported) {
            return (kd0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.table_row_bbs_comment_first, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public NestedScrollView b() {
        return this.f112565a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21457, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
