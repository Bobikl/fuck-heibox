package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.hbcustomview.CircleProgressView;
import com.max.hbcustomview.GradientTextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.module.game.component.GameItemView;
import com.max.xiaoheihe.view.richtext.RichStackModelView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameDetailHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class nk implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final LinearLayout A;

    @androidx.annotation.n0
    public final LinearLayout A0;

    @androidx.annotation.n0
    public final LinearLayout B;

    @androidx.annotation.n0
    public final CardView B0;

    @androidx.annotation.n0
    public final LinearLayout C;

    @androidx.annotation.n0
    public final LinearLayout C0;

    @androidx.annotation.n0
    public final LinearLayout D;

    @androidx.annotation.n0
    public final FrameLayout D0;

    @androidx.annotation.n0
    public final LinearLayout E;

    @androidx.annotation.n0
    public final RelativeLayout E0;

    @androidx.annotation.n0
    public final RecyclerView F;

    @androidx.annotation.n0
    public final RelativeLayout F0;

    @androidx.annotation.n0
    public final LinearLayout G;

    @androidx.annotation.n0
    public final RelativeLayout G0;

    @androidx.annotation.n0
    public final RecyclerView H;

    @androidx.annotation.n0
    public final RelativeLayout H0;

    @androidx.annotation.n0
    public final ListSectionHeader I;

    @androidx.annotation.n0
    public final LinearLayout I0;

    @androidx.annotation.n0
    public final ListSectionHeader J;

    @androidx.annotation.n0
    public final RelativeLayout J0;

    @androidx.annotation.n0
    public final ListSectionHeader K;

    @androidx.annotation.n0
    public final mb.f K0;

    @androidx.annotation.n0
    public final RelativeLayout L;

    @androidx.annotation.n0
    public final CardView L0;

    @androidx.annotation.n0
    public final RecyclerView M;

    @androidx.annotation.n0
    public final LinearLayout M0;

    @androidx.annotation.n0
    public final RecyclerView N;

    @androidx.annotation.n0
    public final LinearLayout N0;

    @androidx.annotation.n0
    public final RecyclerView O;

    @androidx.annotation.n0
    public final ViewPager2 O0;

    @androidx.annotation.n0
    public final RecyclerView P;

    @androidx.annotation.n0
    public final RecyclerView Q;

    @androidx.annotation.n0
    public final View R;

    @androidx.annotation.n0
    public final View S;

    @androidx.annotation.n0
    public final View T;

    @androidx.annotation.n0
    public final View U;

    @androidx.annotation.n0
    public final View V;

    @androidx.annotation.n0
    public final View W;

    @androidx.annotation.n0
    public final View X;

    @androidx.annotation.n0
    public final View Y;

    @androidx.annotation.n0
    public final TextView Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final View f113858a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113859a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CircleProgressView f113860b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113861b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f113862c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113863c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f113864d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113865d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f113866e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113867e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f113868f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f113869f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f113870g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113871g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f113872h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113873h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameItemView f113874i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f113875i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113876j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113877j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113878k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113879k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113880l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113881l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113882m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113883m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113884n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113885n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113886o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113887o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113888p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113889p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113890q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113891q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113892r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f113893r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113894s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113895s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113896t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113897t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113898u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113899u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113900v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113901v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113902w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameItemView f113903w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113904x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @androidx.annotation.n0
    public final RichStackModelView f113905x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113906y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113907y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113908z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113909z0;

    private nk(@androidx.annotation.n0 View view, @androidx.annotation.n0 CircleProgressView circleProgressView, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 CardView cardView3, @androidx.annotation.n0 CardView cardView4, @androidx.annotation.n0 CardView cardView5, @androidx.annotation.n0 CardView cardView6, @androidx.annotation.n0 GameItemView gameItemView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 ImageView imageView7, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 LinearLayout linearLayout7, @androidx.annotation.n0 LinearLayout linearLayout8, @androidx.annotation.n0 LinearLayout linearLayout9, @androidx.annotation.n0 LinearLayout linearLayout10, @androidx.annotation.n0 LinearLayout linearLayout11, @androidx.annotation.n0 LinearLayout linearLayout12, @androidx.annotation.n0 LinearLayout linearLayout13, @androidx.annotation.n0 LinearLayout linearLayout14, @androidx.annotation.n0 LinearLayout linearLayout15, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 LinearLayout linearLayout16, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 ListSectionHeader listSectionHeader, @androidx.annotation.n0 ListSectionHeader listSectionHeader2, @androidx.annotation.n0 ListSectionHeader listSectionHeader3, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RecyclerView recyclerView3, @androidx.annotation.n0 RecyclerView recyclerView4, @androidx.annotation.n0 RecyclerView recyclerView5, @androidx.annotation.n0 RecyclerView recyclerView6, @androidx.annotation.n0 RecyclerView recyclerView7, @androidx.annotation.n0 View view2, @androidx.annotation.n0 View view3, @androidx.annotation.n0 View view4, @androidx.annotation.n0 View view5, @androidx.annotation.n0 View view6, @androidx.annotation.n0 View view7, @androidx.annotation.n0 View view8, @androidx.annotation.n0 View view9, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 GradientTextView gradientTextView, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 TextView textView12, @androidx.annotation.n0 TextView textView13, @androidx.annotation.n0 TextView textView14, @androidx.annotation.n0 TextView textView15, @androidx.annotation.n0 TextView textView16, @androidx.annotation.n0 GradientTextView gradientTextView2, @androidx.annotation.n0 TextView textView17, @androidx.annotation.n0 TextView textView18, @androidx.annotation.n0 TextView textView19, @androidx.annotation.n0 TextView textView20, @androidx.annotation.n0 GameItemView gameItemView2, @androidx.annotation.n0 RichStackModelView richStackModelView, @androidx.annotation.n0 LinearLayout linearLayout17, @androidx.annotation.n0 LinearLayout linearLayout18, @androidx.annotation.n0 LinearLayout linearLayout19, @androidx.annotation.n0 CardView cardView7, @androidx.annotation.n0 LinearLayout linearLayout20, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout4, @androidx.annotation.n0 RelativeLayout relativeLayout5, @androidx.annotation.n0 LinearLayout linearLayout21, @androidx.annotation.n0 RelativeLayout relativeLayout6, @androidx.annotation.n0 mb.f fVar, @androidx.annotation.n0 CardView cardView8, @androidx.annotation.n0 LinearLayout linearLayout22, @androidx.annotation.n0 LinearLayout linearLayout23, @androidx.annotation.n0 ViewPager2 viewPager2) {
        this.f113858a = view;
        this.f113860b = circleProgressView;
        this.f113862c = cardView;
        this.f113864d = cardView2;
        this.f113866e = cardView3;
        this.f113868f = cardView4;
        this.f113870g = cardView5;
        this.f113872h = cardView6;
        this.f113874i = gameItemView;
        this.f113876j = imageView;
        this.f113878k = imageView2;
        this.f113880l = imageView3;
        this.f113882m = imageView4;
        this.f113884n = imageView5;
        this.f113886o = imageView6;
        this.f113888p = imageView7;
        this.f113890q = linearLayout;
        this.f113892r = linearLayout2;
        this.f113894s = linearLayout3;
        this.f113896t = linearLayout4;
        this.f113898u = linearLayout5;
        this.f113900v = linearLayout6;
        this.f113902w = linearLayout7;
        this.f113904x = linearLayout8;
        this.f113906y = linearLayout9;
        this.f113908z = linearLayout10;
        this.A = linearLayout11;
        this.B = linearLayout12;
        this.C = linearLayout13;
        this.D = linearLayout14;
        this.E = linearLayout15;
        this.F = recyclerView;
        this.G = linearLayout16;
        this.H = recyclerView2;
        this.I = listSectionHeader;
        this.J = listSectionHeader2;
        this.K = listSectionHeader3;
        this.L = relativeLayout;
        this.M = recyclerView3;
        this.N = recyclerView4;
        this.O = recyclerView5;
        this.P = recyclerView6;
        this.Q = recyclerView7;
        this.R = view2;
        this.S = view3;
        this.T = view4;
        this.U = view5;
        this.V = view6;
        this.W = view7;
        this.X = view8;
        this.Y = view9;
        this.Z = textView;
        this.f113859a0 = textView2;
        this.f113861b0 = textView3;
        this.f113863c0 = textView4;
        this.f113865d0 = textView5;
        this.f113867e0 = textView6;
        this.f113869f0 = expressionTextView;
        this.f113871g0 = textView7;
        this.f113873h0 = textView8;
        this.f113875i0 = gradientTextView;
        this.f113877j0 = textView9;
        this.f113879k0 = textView10;
        this.f113881l0 = textView11;
        this.f113883m0 = textView12;
        this.f113885n0 = textView13;
        this.f113887o0 = textView14;
        this.f113889p0 = textView15;
        this.f113891q0 = textView16;
        this.f113893r0 = gradientTextView2;
        this.f113895s0 = textView17;
        this.f113897t0 = textView18;
        this.f113899u0 = textView19;
        this.f113901v0 = textView20;
        this.f113903w0 = gameItemView2;
        this.f113905x0 = richStackModelView;
        this.f113907y0 = linearLayout17;
        this.f113909z0 = linearLayout18;
        this.A0 = linearLayout19;
        this.B0 = cardView7;
        this.C0 = linearLayout20;
        this.D0 = frameLayout;
        this.E0 = relativeLayout2;
        this.F0 = relativeLayout3;
        this.G0 = relativeLayout4;
        this.H0 = relativeLayout5;
        this.I0 = linearLayout21;
        this.J0 = relativeLayout6;
        this.K0 = fVar;
        this.L0 = cardView8;
        this.M0 = linearLayout22;
        this.N0 = linearLayout23;
        this.O0 = viewPager2;
    }

    @androidx.annotation.n0
    public static nk a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18474, new Class[]{View.class}, nk.class);
        if (patchProxyResultProxy.isSupported) {
            return (nk) patchProxyResultProxy.result;
        }
        int i10 = R.id.cpv_hardware;
        CircleProgressView circleProgressView = (CircleProgressView) l3.d.a(view, R.id.cpv_hardware);
        if (circleProgressView != null) {
            i10 = R.id.cv_dlc;
            CardView cardView = (CardView) l3.d.a(view, R.id.cv_dlc);
            if (cardView != null) {
                i10 = R.id.cv_game_desc;
                CardView cardView2 = (CardView) l3.d.a(view, R.id.cv_game_desc);
                if (cardView2 != null) {
                    i10 = R.id.cv_game_preview;
                    CardView cardView3 = (CardView) l3.d.a(view, R.id.cv_game_preview);
                    if (cardView3 != null) {
                        i10 = R.id.cv_game_video_and_price;
                        CardView cardView4 = (CardView) l3.d.a(view, R.id.cv_game_video_and_price);
                        if (cardView4 != null) {
                            i10 = R.id.cv_region_price;
                            CardView cardView5 = (CardView) l3.d.a(view, R.id.cv_region_price);
                            if (cardView5 != null) {
                                i10 = R.id.cv_subscribe_awards;
                                CardView cardView6 = (CardView) l3.d.a(view, R.id.cv_subscribe_awards);
                                if (cardView6 != null) {
                                    i10 = R.id.giv_concat_game;
                                    GameItemView gameItemView = (GameItemView) l3.d.a(view, R.id.giv_concat_game);
                                    if (gameItemView != null) {
                                        i10 = R.id.iv_developer_arrow;
                                        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_developer_arrow);
                                        if (imageView != null) {
                                            i10 = R.id.iv_developer_avatar;
                                            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_developer_avatar);
                                            if (imageView2 != null) {
                                                i10 = R.id.iv_follow_icon;
                                                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_follow_icon);
                                                if (imageView3 != null) {
                                                    i10 = R.id.iv_icon;
                                                    ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_icon);
                                                    if (imageView4 != null) {
                                                        i10 = R.id.iv_requirements_faq;
                                                        ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_requirements_faq);
                                                        if (imageView5 != null) {
                                                            i10 = R.id.iv_score;
                                                            ImageView imageView6 = (ImageView) l3.d.a(view, R.id.iv_score);
                                                            if (imageView6 != null) {
                                                                i10 = R.id.iv_tritangle;
                                                                ImageView imageView7 = (ImageView) l3.d.a(view, R.id.iv_tritangle);
                                                                if (imageView7 != null) {
                                                                    i10 = R.id.ll_concat_game;
                                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_concat_game);
                                                                    if (linearLayout != null) {
                                                                        i10 = R.id.ll_dlc;
                                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_dlc);
                                                                        if (linearLayout2 != null) {
                                                                            i10 = R.id.ll_game_desc;
                                                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.ll_game_desc);
                                                                            if (linearLayout3 != null) {
                                                                                i10 = R.id.ll_game_preview;
                                                                                LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.ll_game_preview);
                                                                                if (linearLayout4 != null) {
                                                                                    i10 = R.id.ll_hardware_platf;
                                                                                    LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.ll_hardware_platf);
                                                                                    if (linearLayout5 != null) {
                                                                                        i10 = R.id.ll_menu_2;
                                                                                        LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.ll_menu_2);
                                                                                        if (linearLayout6 != null) {
                                                                                            i10 = R.id.ll_morelike;
                                                                                            LinearLayout linearLayout7 = (LinearLayout) l3.d.a(view, R.id.ll_morelike);
                                                                                            if (linearLayout7 != null) {
                                                                                                i10 = R.id.ll_origin_game;
                                                                                                LinearLayout linearLayout8 = (LinearLayout) l3.d.a(view, R.id.ll_origin_game);
                                                                                                if (linearLayout8 != null) {
                                                                                                    i10 = R.id.ll_platform_tags;
                                                                                                    LinearLayout linearLayout9 = (LinearLayout) l3.d.a(view, R.id.ll_platform_tags);
                                                                                                    if (linearLayout9 != null) {
                                                                                                        i10 = R.id.ll_platforms;
                                                                                                        LinearLayout linearLayout10 = (LinearLayout) l3.d.a(view, R.id.ll_platforms);
                                                                                                        if (linearLayout10 != null) {
                                                                                                            i10 = R.id.ll_price_left;
                                                                                                            LinearLayout linearLayout11 = (LinearLayout) l3.d.a(view, R.id.ll_price_left);
                                                                                                            if (linearLayout11 != null) {
                                                                                                                i10 = R.id.ll_region_price;
                                                                                                                LinearLayout linearLayout12 = (LinearLayout) l3.d.a(view, R.id.ll_region_price);
                                                                                                                if (linearLayout12 != null) {
                                                                                                                    i10 = R.id.ll_requirements;
                                                                                                                    LinearLayout linearLayout13 = (LinearLayout) l3.d.a(view, R.id.ll_requirements);
                                                                                                                    if (linearLayout13 != null) {
                                                                                                                        i10 = R.id.ll_rich_tags;
                                                                                                                        LinearLayout linearLayout14 = (LinearLayout) l3.d.a(view, R.id.ll_rich_tags);
                                                                                                                        if (linearLayout14 != null) {
                                                                                                                            i10 = R.id.ll_subscribe_awards;
                                                                                                                            LinearLayout linearLayout15 = (LinearLayout) l3.d.a(view, R.id.ll_subscribe_awards);
                                                                                                                            if (linearLayout15 != null) {
                                                                                                                                i10 = R.id.ll_tags;
                                                                                                                                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.ll_tags);
                                                                                                                                if (recyclerView != null) {
                                                                                                                                    i10 = R.id.ll_user_num;
                                                                                                                                    LinearLayout linearLayout16 = (LinearLayout) l3.d.a(view, R.id.ll_user_num);
                                                                                                                                    if (linearLayout16 != null) {
                                                                                                                                        i10 = R.id.ll_user_num_preview;
                                                                                                                                        RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.ll_user_num_preview);
                                                                                                                                        if (recyclerView2 != null) {
                                                                                                                                            i10 = R.id.lsh_concat_game;
                                                                                                                                            ListSectionHeader listSectionHeader = (ListSectionHeader) l3.d.a(view, R.id.lsh_concat_game);
                                                                                                                                            if (listSectionHeader != null) {
                                                                                                                                                i10 = R.id.lsh_game_desc;
                                                                                                                                                ListSectionHeader listSectionHeader2 = (ListSectionHeader) l3.d.a(view, R.id.lsh_game_desc);
                                                                                                                                                if (listSectionHeader2 != null) {
                                                                                                                                                    i10 = R.id.lsh_morelike;
                                                                                                                                                    ListSectionHeader listSectionHeader3 = (ListSectionHeader) l3.d.a(view, R.id.lsh_morelike);
                                                                                                                                                    if (listSectionHeader3 != null) {
                                                                                                                                                        i10 = R.id.rl_hardware_info;
                                                                                                                                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_hardware_info);
                                                                                                                                                        if (relativeLayout != null) {
                                                                                                                                                            i10 = R.id.rv_dlc;
                                                                                                                                                            RecyclerView recyclerView3 = (RecyclerView) l3.d.a(view, R.id.rv_dlc);
                                                                                                                                                            if (recyclerView3 != null) {
                                                                                                                                                                i10 = R.id.rv_game_award;
                                                                                                                                                                RecyclerView recyclerView4 = (RecyclerView) l3.d.a(view, R.id.rv_game_award);
                                                                                                                                                                if (recyclerView4 != null) {
                                                                                                                                                                    i10 = R.id.rv_morelike;
                                                                                                                                                                    RecyclerView recyclerView5 = (RecyclerView) l3.d.a(view, R.id.rv_morelike);
                                                                                                                                                                    if (recyclerView5 != null) {
                                                                                                                                                                        i10 = R.id.rv_screenshots;
                                                                                                                                                                        RecyclerView recyclerView6 = (RecyclerView) l3.d.a(view, R.id.rv_screenshots);
                                                                                                                                                                        if (recyclerView6 != null) {
                                                                                                                                                                            i10 = R.id.rv_subscribe_awards;
                                                                                                                                                                            RecyclerView recyclerView7 = (RecyclerView) l3.d.a(view, R.id.rv_subscribe_awards);
                                                                                                                                                                            if (recyclerView7 != null) {
                                                                                                                                                                                i10 = R.id.space_concat_game;
                                                                                                                                                                                View viewA = l3.d.a(view, R.id.space_concat_game);
                                                                                                                                                                                if (viewA != null) {
                                                                                                                                                                                    i10 = R.id.space_dlc;
                                                                                                                                                                                    View viewA2 = l3.d.a(view, R.id.space_dlc);
                                                                                                                                                                                    if (viewA2 != null) {
                                                                                                                                                                                        i10 = R.id.space_game_desc;
                                                                                                                                                                                        View viewA3 = l3.d.a(view, R.id.space_game_desc);
                                                                                                                                                                                        if (viewA3 != null) {
                                                                                                                                                                                            i10 = R.id.space_game_preview;
                                                                                                                                                                                            View viewA4 = l3.d.a(view, R.id.space_game_preview);
                                                                                                                                                                                            if (viewA4 != null) {
                                                                                                                                                                                                i10 = R.id.space_ll_menu_2;
                                                                                                                                                                                                View viewA5 = l3.d.a(view, R.id.space_ll_menu_2);
                                                                                                                                                                                                if (viewA5 != null) {
                                                                                                                                                                                                    i10 = R.id.space_morelike;
                                                                                                                                                                                                    View viewA6 = l3.d.a(view, R.id.space_morelike);
                                                                                                                                                                                                    if (viewA6 != null) {
                                                                                                                                                                                                        i10 = R.id.space_region_price;
                                                                                                                                                                                                        View viewA7 = l3.d.a(view, R.id.space_region_price);
                                                                                                                                                                                                        if (viewA7 != null) {
                                                                                                                                                                                                            i10 = R.id.space_subscribe_awards;
                                                                                                                                                                                                            View viewA8 = l3.d.a(view, R.id.space_subscribe_awards);
                                                                                                                                                                                                            if (viewA8 != null) {
                                                                                                                                                                                                                i10 = R.id.tv_coupon_tag;
                                                                                                                                                                                                                TextView textView = (TextView) l3.d.a(view, R.id.tv_coupon_tag);
                                                                                                                                                                                                                if (textView != null) {
                                                                                                                                                                                                                    i10 = R.id.tv_current_price;
                                                                                                                                                                                                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_current_price);
                                                                                                                                                                                                                    if (textView2 != null) {
                                                                                                                                                                                                                        i10 = R.id.tv_current_price_desc;
                                                                                                                                                                                                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_current_price_desc);
                                                                                                                                                                                                                        if (textView3 != null) {
                                                                                                                                                                                                                            i10 = R.id.tv_deadline_date;
                                                                                                                                                                                                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_deadline_date);
                                                                                                                                                                                                                            if (textView4 != null) {
                                                                                                                                                                                                                                i10 = R.id.tv_desc_1;
                                                                                                                                                                                                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_desc_1);
                                                                                                                                                                                                                                if (textView5 != null) {
                                                                                                                                                                                                                                    i10 = R.id.tv_desc_2;
                                                                                                                                                                                                                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_desc_2);
                                                                                                                                                                                                                                    if (textView6 != null) {
                                                                                                                                                                                                                                        i10 = R.id.tv_developer_article_content;
                                                                                                                                                                                                                                        ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_developer_article_content);
                                                                                                                                                                                                                                        if (expressionTextView != null) {
                                                                                                                                                                                                                                            i10 = R.id.tv_developers_words;
                                                                                                                                                                                                                                            TextView textView7 = (TextView) l3.d.a(view, R.id.tv_developers_words);
                                                                                                                                                                                                                                            if (textView7 != null) {
                                                                                                                                                                                                                                                i10 = R.id.tv_developers_words_time;
                                                                                                                                                                                                                                                TextView textView8 = (TextView) l3.d.a(view, R.id.tv_developers_words_time);
                                                                                                                                                                                                                                                if (textView8 != null) {
                                                                                                                                                                                                                                                    i10 = R.id.tv_follow_desc;
                                                                                                                                                                                                                                                    GradientTextView gradientTextView = (GradientTextView) l3.d.a(view, R.id.tv_follow_desc);
                                                                                                                                                                                                                                                    if (gradientTextView != null) {
                                                                                                                                                                                                                                                        i10 = R.id.tv_follow_num;
                                                                                                                                                                                                                                                        TextView textView9 = (TextView) l3.d.a(view, R.id.tv_follow_num);
                                                                                                                                                                                                                                                        if (textView9 != null) {
                                                                                                                                                                                                                                                            i10 = R.id.tv_follow_num_unit;
                                                                                                                                                                                                                                                            TextView textView10 = (TextView) l3.d.a(view, R.id.tv_follow_num_unit);
                                                                                                                                                                                                                                                            if (textView10 != null) {
                                                                                                                                                                                                                                                                i10 = R.id.tv_game_desc;
                                                                                                                                                                                                                                                                TextView textView11 = (TextView) l3.d.a(view, R.id.tv_game_desc);
                                                                                                                                                                                                                                                                if (textView11 != null) {
                                                                                                                                                                                                                                                                    i10 = R.id.tv_hardware_score;
                                                                                                                                                                                                                                                                    TextView textView12 = (TextView) l3.d.a(view, R.id.tv_hardware_score);
                                                                                                                                                                                                                                                                    if (textView12 != null) {
                                                                                                                                                                                                                                                                        i10 = R.id.tv_lowest_discount_and_price;
                                                                                                                                                                                                                                                                        TextView textView13 = (TextView) l3.d.a(view, R.id.tv_lowest_discount_and_price);
                                                                                                                                                                                                                                                                        if (textView13 != null) {
                                                                                                                                                                                                                                                                            i10 = R.id.tv_minimum_price;
                                                                                                                                                                                                                                                                            TextView textView14 = (TextView) l3.d.a(view, R.id.tv_minimum_price);
                                                                                                                                                                                                                                                                            if (textView14 != null) {
                                                                                                                                                                                                                                                                                i10 = R.id.tv_name;
                                                                                                                                                                                                                                                                                TextView textView15 = (TextView) l3.d.a(view, R.id.tv_name);
                                                                                                                                                                                                                                                                                if (textView15 != null) {
                                                                                                                                                                                                                                                                                    i10 = R.id.tv_name_en;
                                                                                                                                                                                                                                                                                    TextView textView16 = (TextView) l3.d.a(view, R.id.tv_name_en);
                                                                                                                                                                                                                                                                                    if (textView16 != null) {
                                                                                                                                                                                                                                                                                        i10 = R.id.tv_rank;
                                                                                                                                                                                                                                                                                        GradientTextView gradientTextView2 = (GradientTextView) l3.d.a(view, R.id.tv_rank);
                                                                                                                                                                                                                                                                                        if (gradientTextView2 != null) {
                                                                                                                                                                                                                                                                                            i10 = R.id.tv_requirements_faq;
                                                                                                                                                                                                                                                                                            TextView textView17 = (TextView) l3.d.a(view, R.id.tv_requirements_faq);
                                                                                                                                                                                                                                                                                            if (textView17 != null) {
                                                                                                                                                                                                                                                                                                i10 = R.id.tv_score;
                                                                                                                                                                                                                                                                                                TextView textView18 = (TextView) l3.d.a(view, R.id.tv_score);
                                                                                                                                                                                                                                                                                                if (textView18 != null) {
                                                                                                                                                                                                                                                                                                    i10 = R.id.tv_score_detail;
                                                                                                                                                                                                                                                                                                    TextView textView19 = (TextView) l3.d.a(view, R.id.tv_score_detail);
                                                                                                                                                                                                                                                                                                    if (textView19 != null) {
                                                                                                                                                                                                                                                                                                        i10 = R.id.tv_user_num_expand;
                                                                                                                                                                                                                                                                                                        TextView textView20 = (TextView) l3.d.a(view, R.id.tv_user_num_expand);
                                                                                                                                                                                                                                                                                                        if (textView20 != null) {
                                                                                                                                                                                                                                                                                                            i10 = R.id.v_game;
                                                                                                                                                                                                                                                                                                            GameItemView gameItemView2 = (GameItemView) l3.d.a(view, R.id.v_game);
                                                                                                                                                                                                                                                                                                            if (gameItemView2 != null) {
                                                                                                                                                                                                                                                                                                                i10 = R.id.v_rich_stack;
                                                                                                                                                                                                                                                                                                                RichStackModelView richStackModelView = (RichStackModelView) l3.d.a(view, R.id.v_rich_stack);
                                                                                                                                                                                                                                                                                                                if (richStackModelView != null) {
                                                                                                                                                                                                                                                                                                                    i10 = R.id.vg_developer_last_event;
                                                                                                                                                                                                                                                                                                                    LinearLayout linearLayout17 = (LinearLayout) l3.d.a(view, R.id.vg_developer_last_event);
                                                                                                                                                                                                                                                                                                                    if (linearLayout17 != null) {
                                                                                                                                                                                                                                                                                                                        i10 = R.id.vg_developers_words;
                                                                                                                                                                                                                                                                                                                        LinearLayout linearLayout18 = (LinearLayout) l3.d.a(view, R.id.vg_developers_words);
                                                                                                                                                                                                                                                                                                                        if (linearLayout18 != null) {
                                                                                                                                                                                                                                                                                                                            i10 = R.id.vg_follow_btn;
                                                                                                                                                                                                                                                                                                                            LinearLayout linearLayout19 = (LinearLayout) l3.d.a(view, R.id.vg_follow_btn);
                                                                                                                                                                                                                                                                                                                            if (linearLayout19 != null) {
                                                                                                                                                                                                                                                                                                                                i10 = R.id.vg_follow_container;
                                                                                                                                                                                                                                                                                                                                CardView cardView7 = (CardView) l3.d.a(view, R.id.vg_follow_container);
                                                                                                                                                                                                                                                                                                                                if (cardView7 != null) {
                                                                                                                                                                                                                                                                                                                                    i10 = R.id.vg_follow_num_container;
                                                                                                                                                                                                                                                                                                                                    LinearLayout linearLayout20 = (LinearLayout) l3.d.a(view, R.id.vg_follow_num_container);
                                                                                                                                                                                                                                                                                                                                    if (linearLayout20 != null) {
                                                                                                                                                                                                                                                                                                                                        i10 = R.id.vg_hardware_info;
                                                                                                                                                                                                                                                                                                                                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_hardware_info);
                                                                                                                                                                                                                                                                                                                                        if (frameLayout != null) {
                                                                                                                                                                                                                                                                                                                                            i10 = R.id.vg_hardware_score;
                                                                                                                                                                                                                                                                                                                                            RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_hardware_score);
                                                                                                                                                                                                                                                                                                                                            if (relativeLayout2 != null) {
                                                                                                                                                                                                                                                                                                                                                i10 = R.id.vg_header_container;
                                                                                                                                                                                                                                                                                                                                                RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_header_container);
                                                                                                                                                                                                                                                                                                                                                if (relativeLayout3 != null) {
                                                                                                                                                                                                                                                                                                                                                    i10 = R.id.vg_name_and_score;
                                                                                                                                                                                                                                                                                                                                                    RelativeLayout relativeLayout4 = (RelativeLayout) l3.d.a(view, R.id.vg_name_and_score);
                                                                                                                                                                                                                                                                                                                                                    if (relativeLayout4 != null) {
                                                                                                                                                                                                                                                                                                                                                        i10 = R.id.vg_price;
                                                                                                                                                                                                                                                                                                                                                        RelativeLayout relativeLayout5 = (RelativeLayout) l3.d.a(view, R.id.vg_price);
                                                                                                                                                                                                                                                                                                                                                        if (relativeLayout5 != null) {
                                                                                                                                                                                                                                                                                                                                                            i10 = R.id.vg_price_bg;
                                                                                                                                                                                                                                                                                                                                                            LinearLayout linearLayout21 = (LinearLayout) l3.d.a(view, R.id.vg_price_bg);
                                                                                                                                                                                                                                                                                                                                                            if (linearLayout21 != null) {
                                                                                                                                                                                                                                                                                                                                                                i10 = R.id.vg_rank;
                                                                                                                                                                                                                                                                                                                                                                RelativeLayout relativeLayout6 = (RelativeLayout) l3.d.a(view, R.id.vg_rank);
                                                                                                                                                                                                                                                                                                                                                                if (relativeLayout6 != null) {
                                                                                                                                                                                                                                                                                                                                                                    i10 = R.id.vg_region_price_title;
                                                                                                                                                                                                                                                                                                                                                                    View viewA9 = l3.d.a(view, R.id.vg_region_price_title);
                                                                                                                                                                                                                                                                                                                                                                    if (viewA9 != null) {
                                                                                                                                                                                                                                                                                                                                                                        mb.f fVarA = mb.f.a(viewA9);
                                                                                                                                                                                                                                                                                                                                                                        i10 = R.id.vg_score;
                                                                                                                                                                                                                                                                                                                                                                        CardView cardView8 = (CardView) l3.d.a(view, R.id.vg_score);
                                                                                                                                                                                                                                                                                                                                                                        if (cardView8 != null) {
                                                                                                                                                                                                                                                                                                                                                                            i10 = R.id.vg_score_container;
                                                                                                                                                                                                                                                                                                                                                                            LinearLayout linearLayout22 = (LinearLayout) l3.d.a(view, R.id.vg_score_container);
                                                                                                                                                                                                                                                                                                                                                                            if (linearLayout22 != null) {
                                                                                                                                                                                                                                                                                                                                                                                i10 = R.id.vg_score_content;
                                                                                                                                                                                                                                                                                                                                                                                LinearLayout linearLayout23 = (LinearLayout) l3.d.a(view, R.id.vg_score_content);
                                                                                                                                                                                                                                                                                                                                                                                if (linearLayout23 != null) {
                                                                                                                                                                                                                                                                                                                                                                                    i10 = R.id.vp2;
                                                                                                                                                                                                                                                                                                                                                                                    ViewPager2 viewPager2 = (ViewPager2) l3.d.a(view, R.id.vp2);
                                                                                                                                                                                                                                                                                                                                                                                    if (viewPager2 != null) {
                                                                                                                                                                                                                                                                                                                                                                                        return new nk(view, circleProgressView, cardView, cardView2, cardView3, cardView4, cardView5, cardView6, gameItemView, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, linearLayout11, linearLayout12, linearLayout13, linearLayout14, linearLayout15, recyclerView, linearLayout16, recyclerView2, listSectionHeader, listSectionHeader2, listSectionHeader3, relativeLayout, recyclerView3, recyclerView4, recyclerView5, recyclerView6, recyclerView7, viewA, viewA2, viewA3, viewA4, viewA5, viewA6, viewA7, viewA8, textView, textView2, textView3, textView4, textView5, textView6, expressionTextView, textView7, textView8, gradientTextView, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, gradientTextView2, textView17, textView18, textView19, textView20, gameItemView2, richStackModelView, linearLayout17, linearLayout18, linearLayout19, cardView7, linearLayout20, frameLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, linearLayout21, relativeLayout6, fVarA, cardView8, linearLayout22, linearLayout23, viewPager2);
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
    public static nk b(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.n0 ViewGroup viewGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup}, null, changeQuickRedirect, true, 18473, new Class[]{LayoutInflater.class, ViewGroup.class}, nk.class);
        if (patchProxyResultProxy.isSupported) {
            return (nk) patchProxyResultProxy.result;
        }
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.item_game_detail_header, viewGroup);
        return a(viewGroup);
    }

    @Override // l3.c
    @androidx.annotation.n0
    public View getRoot() {
        return this.f113858a;
    }
}
