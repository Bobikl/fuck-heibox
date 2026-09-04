package com.max.xiaoheihe.module.bbs.post.ui.fragments;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.v;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.transition.f;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.google.gson.JsonObject;
import com.max.hbcommon.analytics.l;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcustomview.shinebuttonlib.ShineButton;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.hbutils.utils.w;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkTreeObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.MultiDimensionObj;
import com.max.xiaoheihe.bean.game.UserSupportStateObj;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.max.xiaoheihe.module.bbs.post.ui.FloatingLikeLottieAnimation;
import com.max.xiaoheihe.module.game.component.GameCommentLikeDislikeHappyView;
import com.max.xiaoheihe.module.game.component.GameRateStarView;
import com.max.xiaoheihe.module.game.z;
import com.max.xiaoheihe.utils.e0;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.w50;
import dl.d;
import dl.e;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.t0;

/* JADX INFO: compiled from: PostGameCommentFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class PostGameCommentFragment extends PostCommentFragment {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @dl.d
    public static final a f81836x1 = new a(null);

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final int f81837y1 = 8;
    private w50 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private long f81838a0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @dl.e
    private FloatingLikeLottieAnimation.a f81840c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @dl.e
    private FloatingLikeLottieAnimation.a f81841p1;
    private boolean Y = true;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f81839b0 = true;

    /* JADX INFO: compiled from: PostGameCommentFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: PostGameCommentFragment.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BBSLinkTreeObj result;
            GameObj game_info;
            BBSLinkTreeObj result2;
            GameObj game_info2;
            BBSLinkTreeObj result3;
            GameObj game_info3;
            BBSLinkTreeObj result4;
            GameObj game_info4;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29197, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Result<BBSLinkTreeObj> resultF4 = PostGameCommentFragment.this.f4();
            String game_type = null;
            if (com.max.hbcommon.utils.c.u((resultF4 == null || (result4 = resultF4.getResult()) == null || (game_info4 = result4.getGame_info()) == null) ? null : game_info4.getAppid())) {
                return;
            }
            Activity activity = ((com.max.hbcommon.base.d) PostGameCommentFragment.this).mContext;
            Activity activity2 = ((com.max.hbcommon.base.d) PostGameCommentFragment.this).mContext;
            Result<BBSLinkTreeObj> resultF5 = PostGameCommentFragment.this.f4();
            String h_src = (resultF5 == null || (result3 = resultF5.getResult()) == null || (game_info3 = result3.getGame_info()) == null) ? null : game_info3.getH_src();
            Result<BBSLinkTreeObj> resultF6 = PostGameCommentFragment.this.f4();
            String appid = (resultF6 == null || (result2 = resultF6.getResult()) == null || (game_info2 = result2.getGame_info()) == null) ? null : game_info2.getAppid();
            Result<BBSLinkTreeObj> resultF7 = PostGameCommentFragment.this.f4();
            if (resultF7 != null && (result = resultF7.getResult()) != null && (game_info = result.getGame_info()) != null) {
                game_type = game_info.getGame_type();
            }
            activity.startActivity(z.b(activity2, h_src, appid, game_type, null, i0.m(), i0.j(), null));
        }
    }

    /* JADX INFO: compiled from: PostGameCommentFragment.kt */
    public static final class c implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@dl.d ValueAnimator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 29208, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            Object animatedValue = animation.getAnimatedValue();
            f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue = ((Float) animatedValue).floatValue();
            w50 w50Var = PostGameCommentFragment.this.Z;
            w50 w50Var2 = null;
            if (w50Var == null) {
                f0.S("linkBinding");
                w50Var = null;
            }
            ViewGroup.LayoutParams layoutParams = w50Var.f117051o.getLayoutParams();
            layoutParams.height = (int) fFloatValue;
            w50 w50Var3 = PostGameCommentFragment.this.Z;
            if (w50Var3 == null) {
                f0.S("linkBinding");
            } else {
                w50Var2 = w50Var3;
            }
            w50Var2.f117051o.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: compiled from: PostGameCommentFragment.kt */
    public static final class d implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f81844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PostGameCommentFragment f81845c;

        d(boolean z10, PostGameCommentFragment postGameCommentFragment) {
            this.f81844b = z10;
            this.f81845c = postGameCommentFragment;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 29211, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 29210, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            if (this.f81844b) {
                return;
            }
            w50 w50Var = this.f81845c.Z;
            if (w50Var == null) {
                f0.S("linkBinding");
                w50Var = null;
            }
            w50Var.f117051o.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 29212, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 29209, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            if (this.f81844b) {
                w50 w50Var = this.f81845c.Z;
                if (w50Var == null) {
                    f0.S("linkBinding");
                    w50Var = null;
                }
                w50Var.f117051o.setVisibility(0);
            }
        }
    }

    /* JADX INFO: compiled from: PostGameCommentFragment.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29213, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PostGameCommentFragment.this.E4();
        }
    }

    /* JADX INFO: compiled from: PostGameCommentFragment.kt */
    public static final class f implements GameCommentLikeDislikeHappyView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.xiaoheihe.module.game.component.GameCommentLikeDislikeHappyView.a
        public void a(@dl.d LinkInfoObj data) {
            BBSLinkTreeObj result;
            String like_lottie_key;
            if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 29216, new Class[]{LinkInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(data, "data");
            w50 w50Var = null;
            if (PostGameCommentFragment.this.f81841p1 != null) {
                FloatingLikeLottieAnimation.a aVar = PostGameCommentFragment.this.f81841p1;
                if (aVar != null) {
                    aVar.a();
                }
                PostGameCommentFragment.this.f81841p1 = null;
            }
            Result<BBSLinkTreeObj> resultF4 = PostGameCommentFragment.this.f4();
            if (resultF4 != null && (result = resultF4.getResult()) != null && (like_lottie_key = result.getLike_lottie_key()) != null) {
                if (!((kotlin.text.u.V1(like_lottie_key) ^ true) && com.max.hbcommon.utils.c.x(data.getUser_support_state().is_happy()))) {
                    like_lottie_key = null;
                }
                if (like_lottie_key != null) {
                    PostGameCommentFragment postGameCommentFragment = PostGameCommentFragment.this;
                    w50 w50Var2 = postGameCommentFragment.Z;
                    if (w50Var2 == null) {
                        f0.S("linkBinding");
                    } else {
                        w50Var = w50Var2;
                    }
                    PostGameCommentFragment.v7(postGameCommentFragment, like_lottie_key, w50Var.f117038b.getGca_happy().getIv_icon(), R.drawable.expression_cube_huaji, false);
                }
            }
            if (PostGameCommentFragment.this.g4() != null) {
                kf.a aVarG4 = PostGameCommentFragment.this.g4();
                f0.m(aVarG4);
                aVarG4.v("0", data.getLink_award_num());
            }
        }

        @Override // com.max.xiaoheihe.module.game.component.GameCommentLikeDislikeHappyView.a
        public void b(@dl.d LinkInfoObj data) {
            if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 29215, new Class[]{LinkInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(data, "data");
            if (PostGameCommentFragment.this.g4() != null) {
                kf.a aVarG4 = PostGameCommentFragment.this.g4();
                f0.m(aVarG4);
                PostGameCommentFragment postGameCommentFragment = PostGameCommentFragment.this;
                UserSupportStateObj user_support_state = data.getUser_support_state();
                f0.o(user_support_state, "data.user_support_state");
                aVarG4.M2(postGameCommentFragment.y7(user_support_state), data.getLink_award_num());
            }
        }

        @Override // com.max.xiaoheihe.module.game.component.GameCommentLikeDislikeHappyView.a
        public void c(@dl.d LinkInfoObj data) {
            BBSLinkTreeObj result;
            String like_lottie_key;
            boolean z10 = false;
            if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 29214, new Class[]{LinkInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(data, "data");
            w50 w50Var = null;
            if (PostGameCommentFragment.this.f81840c0 != null) {
                FloatingLikeLottieAnimation.a aVar = PostGameCommentFragment.this.f81840c0;
                if (aVar != null) {
                    aVar.a();
                }
                PostGameCommentFragment.this.f81840c0 = null;
            }
            Result<BBSLinkTreeObj> resultF4 = PostGameCommentFragment.this.f4();
            if (resultF4 != null && (result = resultF4.getResult()) != null && (like_lottie_key = result.getLike_lottie_key()) != null) {
                if ((!kotlin.text.u.V1(like_lottie_key)) && com.max.hbcommon.utils.c.x(data.getUser_support_state().is_up())) {
                    z10 = true;
                }
                if (!z10) {
                    like_lottie_key = null;
                }
                if (like_lottie_key != null) {
                    PostGameCommentFragment postGameCommentFragment = PostGameCommentFragment.this;
                    w50 w50Var2 = postGameCommentFragment.Z;
                    if (w50Var2 == null) {
                        f0.S("linkBinding");
                    } else {
                        w50Var = w50Var2;
                    }
                    PostGameCommentFragment.v7(postGameCommentFragment, like_lottie_key, w50Var.f117038b.getGca_like().getIv_icon(), R.drawable.expression_cube_zan, true);
                }
            }
            if (PostGameCommentFragment.this.g4() != null) {
                kf.a aVarG4 = PostGameCommentFragment.this.g4();
                f0.m(aVarG4);
                PostGameCommentFragment postGameCommentFragment2 = PostGameCommentFragment.this;
                UserSupportStateObj user_support_state = data.getUser_support_state();
                f0.o(user_support_state, "data.user_support_state");
                aVarG4.v(postGameCommentFragment2.y7(user_support_state), data.getLink_award_num());
            }
        }
    }

    /* JADX INFO: compiled from: PostGameCommentFragment.kt */
    public static final class g extends s<MultiDimensionObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g(Activity activity, List<MultiDimensionObj> list) {
            super(activity, list, R.layout.item_game_comment_multi_dimension_in_pop);
        }

        public void m(@dl.d s.e viewHolder, @dl.d MultiDimensionObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 29217, new Class[]{s.e.class, MultiDimensionObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            PostGameCommentFragment postGameCommentFragment = PostGameCommentFragment.this;
            marginLayoutParams.topMargin = ViewUtils.f(postGameCommentFragment.getContext(), 4.0f);
            marginLayoutParams.bottomMargin = ViewUtils.f(postGameCommentFragment.getContext(), 4.0f);
            marginLayoutParams.leftMargin = ViewUtils.f(postGameCommentFragment.getContext(), 4.0f);
            marginLayoutParams.rightMargin = ViewUtils.f(postGameCommentFragment.getContext(), 4.0f);
            TextView textView = (TextView) viewHolder.i(R.id.tv_name);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_user_laber);
            ((GameRateStarView) viewHolder.i(R.id.ll_user_rating)).setRating(n.p(data.getUser_star()));
            textView.setText(data.getDimension_name());
            textView2.setText(data.getUser_label());
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, MultiDimensionObj multiDimensionObj) {
            if (PatchProxy.proxy(new Object[]{eVar, multiDimensionObj}, this, changeQuickRedirect, false, 29218, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, multiDimensionObj);
        }
    }

    /* JADX INFO: compiled from: PostGameCommentFragment.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29219, new Class[]{View.class}, Void.TYPE).isSupported && System.currentTimeMillis() - PostGameCommentFragment.this.f81838a0 >= 300) {
                PostGameCommentFragment.r7(PostGameCommentFragment.this);
                PostGameCommentFragment.this.f81838a0 = System.currentTimeMillis();
                w50 w50Var = PostGameCommentFragment.this.Z;
                w50 w50Var2 = null;
                if (w50Var == null) {
                    f0.S("linkBinding");
                    w50Var = null;
                }
                if (w50Var.f117051o.getVisibility() == 0) {
                    PostGameCommentFragment.w7(PostGameCommentFragment.this, false);
                    w50 w50Var3 = PostGameCommentFragment.this.Z;
                    if (w50Var3 == null) {
                        f0.S("linkBinding");
                    } else {
                        w50Var2 = w50Var3;
                    }
                    w50Var2.f117040d.setRotation(0.0f);
                    return;
                }
                PostGameCommentFragment.w7(PostGameCommentFragment.this, true);
                w50 w50Var4 = PostGameCommentFragment.this.Z;
                if (w50Var4 == null) {
                    f0.S("linkBinding");
                } else {
                    w50Var2 = w50Var4;
                }
                w50Var2.f117040d.setRotation(180.0f);
            }
        }
    }

    private final void A7() {
        BBSLinkTreeObj result;
        GameObj game_info;
        String appid;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29176, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        Result<BBSLinkTreeObj> resultF4 = f4();
        if (resultF4 != null && (result = resultF4.getResult()) != null && (game_info = result.getGame_info()) != null && (appid = game_info.getAppid()) != null) {
            jsonObject.addProperty("app_id", appid);
        }
        if (!com.max.hbcommon.utils.c.u(c4())) {
            jsonObject.addProperty("link_id", c4());
        }
        l.f66572a.l(lb.d.f131131b3, jsonObject);
    }

    private final void B7(final String str, final ShineButton shineButton, @v int i10, final boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, shineButton, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 29174, new Class[]{String.class, ShineButton.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        shineButton.setCancel();
        shineButton.A();
        Glide.D(this.mContext).l().h(Integer.valueOf(i10)).z1(new com.bumptech.glide.request.target.e<Bitmap>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.fragments.PostGameCommentFragment$showLikeOrHappyLottieAnim$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.bumptech.glide.request.target.p
            public void onLoadCleared(@e Drawable drawable) {
            }

            public void onResourceReady(@d Bitmap resource, @e f<? super Bitmap> fVar) {
                Bitmap bitmapQ7;
                if (PatchProxy.proxy(new Object[]{resource, fVar}, this, changeQuickRedirect, false, 29198, new Class[]{Bitmap.class, f.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(resource, "resource");
                if (this.f81850b.isActive() && (bitmapQ7 = PostGameCommentFragment.q7(this.f81850b, resource, shineButton)) != null) {
                    PostGameCommentFragment postGameCommentFragment = this.f81850b;
                    final ShineButton shineButton2 = shineButton;
                    String str2 = str;
                    boolean z11 = z10;
                    FragmentActivity activity = postGameCommentFragment.getActivity();
                    BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
                    final WeakReference weakReference = new WeakReference(baseActivity != null ? baseActivity.c1() : null);
                    final Rect rect = new Rect();
                    final Rect rect2 = new Rect();
                    Activity mContext = ((com.max.hbcommon.base.d) postGameCommentFragment).mContext;
                    f0.o(mContext, "mContext");
                    FloatingLikeLottieAnimation floatingLikeLottieAnimationA = FloatingLikeLottieAnimation.Builder.B(new FloatingLikeLottieAnimation.Builder(mContext).u(shineButton2), bitmapQ7, null, false, 6, null).F(str2).v(new yh.a<Rect>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.fragments.PostGameCommentFragment$showLikeOrHappyLottieAnim$1$onResourceReady$1$lottieAnimation$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @d
                        public final Rect a() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29200, new Class[0], Rect.class);
                            if (patchProxyResultProxy.isSupported) {
                                return (Rect) patchProxyResultProxy.result;
                            }
                            TitleBar titleBar = weakReference.get();
                            if (titleBar != null) {
                                titleBar.getGlobalVisibleRect(rect);
                            }
                            rect2.set(-1, rect.bottom, -1, -1);
                            return rect2;
                        }

                        /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.Rect, java.lang.Object] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ Rect invoke() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29201, new Class[0], Object.class);
                            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
                        }
                    }).O(new yh.l<FloatingLikeLottieAnimation.Builder, b2>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.fragments.PostGameCommentFragment$showLikeOrHappyLottieAnim$1$onResourceReady$1$lottieAnimation$2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        {
                            super(1);
                        }

                        public final void a(@d FloatingLikeLottieAnimation.Builder it) {
                            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 29202, new Class[]{FloatingLikeLottieAnimation.Builder.class}, Void.TYPE).isSupported) {
                                return;
                            }
                            f0.p(it, "it");
                            shineButton2.setVisibility(4);
                            shineButton2.setChecked(true, false);
                        }

                        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(FloatingLikeLottieAnimation.Builder builder) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{builder}, this, changeQuickRedirect, false, 29203, new Class[]{Object.class}, Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            a(builder);
                            return b2.f124493a;
                        }
                    }).M(new yh.l<FloatingLikeLottieAnimation.Builder, b2>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.fragments.PostGameCommentFragment$showLikeOrHappyLottieAnim$1$onResourceReady$1$lottieAnimation$3
                        public static ChangeQuickRedirect changeQuickRedirect;

                        {
                            super(1);
                        }

                        public final void a(@d FloatingLikeLottieAnimation.Builder it) {
                            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 29204, new Class[]{FloatingLikeLottieAnimation.Builder.class}, Void.TYPE).isSupported) {
                                return;
                            }
                            f0.p(it, "it");
                            shineButton2.setVisibility(0);
                        }

                        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(FloatingLikeLottieAnimation.Builder builder) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{builder}, this, changeQuickRedirect, false, 29205, new Class[]{Object.class}, Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            a(builder);
                            return b2.f124493a;
                        }
                    }).P(new yh.l<FloatingLikeLottieAnimation.Builder, b2>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.fragments.PostGameCommentFragment$showLikeOrHappyLottieAnim$1$onResourceReady$1$lottieAnimation$4
                        public static ChangeQuickRedirect changeQuickRedirect;

                        {
                            super(1);
                        }

                        public final void a(@d FloatingLikeLottieAnimation.Builder it) {
                            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 29206, new Class[]{FloatingLikeLottieAnimation.Builder.class}, Void.TYPE).isSupported) {
                                return;
                            }
                            f0.p(it, "it");
                            shineButton2.setVisibility(0);
                        }

                        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(FloatingLikeLottieAnimation.Builder builder) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{builder}, this, changeQuickRedirect, false, 29207, new Class[]{Object.class}, Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            a(builder);
                            return b2.f124493a;
                        }
                    }).a();
                    if (z11) {
                        postGameCommentFragment.f81840c0 = floatingLikeLottieAnimationA.g();
                    } else {
                        postGameCommentFragment.f81841p1 = floatingLikeLottieAnimationA.g();
                    }
                }
            }

            @Override // com.bumptech.glide.request.target.p
            public /* bridge */ /* synthetic */ void onResourceReady(Object obj, f fVar) {
                if (PatchProxy.proxy(new Object[]{obj, fVar}, this, changeQuickRedirect, false, 29199, new Class[]{Object.class, f.class}, Void.TYPE).isSupported) {
                    return;
                }
                onResourceReady((Bitmap) obj, (f<? super Bitmap>) fVar);
            }
        });
    }

    private final void C7(boolean z10) {
        ValueAnimator valueAnimatorOfFloat;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 29177, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        float size = (((linkInfoObjD4.getMultidimensional_score().size() + 1) / 2) * ViewUtils.f(this.mContext, 21.0f)) + ViewUtils.f(this.mContext, 10.0f) + ViewUtils.f(this.mContext, 14.0f);
        float[] fArr = new float[2];
        if (z10) {
            fArr[0] = 0.0f;
            fArr[1] = size;
            valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        } else {
            fArr[0] = size;
            fArr[1] = 0.0f;
            valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        }
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new c());
        valueAnimatorOfFloat.addListener(new d(z10, this));
        valueAnimatorOfFloat.start();
        addValueAnimator(valueAnimatorOfFloat);
    }

    private final void D7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29173, new Class[0], Void.TYPE).isSupported || d4() == null) {
            return;
        }
        Activity activity = this.mContext;
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        StringBuilder sb2 = new StringBuilder(w.v(activity, linkInfoObjD4.getCreate_at()));
        LinkInfoObj linkInfoObjD5 = d4();
        f0.m(linkInfoObjD5);
        if (!com.max.hbcommon.utils.c.u(linkInfoObjD5.getIp_location())) {
            if (sb2.length() > 0) {
                sb2.append(" · ");
            }
            LinkInfoObj linkInfoObjD6 = d4();
            f0.m(linkInfoObjD6);
            sb2.append(linkInfoObjD6.getIp_location());
        }
        w50 w50Var = this.Z;
        w50 w50Var2 = null;
        if (w50Var == null) {
            f0.S("linkBinding");
            w50Var = null;
        }
        w50Var.f117042f.removeAllViews();
        w50 w50Var3 = this.Z;
        if (w50Var3 == null) {
            f0.S("linkBinding");
            w50Var3 = null;
        }
        LinearLayout linearLayout = w50Var3.f117042f;
        f0.o(linearLayout, "linkBinding.llComment");
        P3(linearLayout);
        w50 w50Var4 = this.Z;
        if (w50Var4 == null) {
            f0.S("linkBinding");
            w50Var4 = null;
        }
        w50Var4.f117043g.setOnClickListener(new e());
        w50 w50Var5 = this.Z;
        if (w50Var5 == null) {
            f0.S("linkBinding");
            w50Var5 = null;
        }
        w50Var5.f117038b.setVisibility(0);
        w50 w50Var6 = this.Z;
        if (w50Var6 == null) {
            f0.S("linkBinding");
            w50Var6 = null;
        }
        GameCommentLikeDislikeHappyView gameCommentLikeDislikeHappyView = w50Var6.f117038b;
        LinkInfoObj linkInfoObjD7 = d4();
        f0.m(linkInfoObjD7);
        gameCommentLikeDislikeHappyView.setLinkInfo(linkInfoObjD7);
        w50 w50Var7 = this.Z;
        if (w50Var7 == null) {
            f0.S("linkBinding");
            w50Var7 = null;
        }
        GameCommentLikeDislikeHappyView gameCommentLikeDislikeHappyView2 = w50Var7.f117038b;
        f0.o(gameCommentLikeDislikeHappyView2, "linkBinding.gcldh");
        GameCommentLikeDislikeHappyView.f(gameCommentLikeDislikeHappyView2, d4(), false, 2, null);
        w50 w50Var8 = this.Z;
        if (w50Var8 == null) {
            f0.S("linkBinding");
            w50Var8 = null;
        }
        w50Var8.f117038b.setOnLDHClickListener(new f());
        w50 w50Var9 = this.Z;
        if (w50Var9 == null) {
            f0.S("linkBinding");
            w50Var9 = null;
        }
        w50Var9.f117050n.setVisibility(0);
        w50 w50Var10 = this.Z;
        if (w50Var10 == null) {
            f0.S("linkBinding");
            w50Var10 = null;
        }
        w50Var10.f117048l.setVisibility(0);
        if (this.f81839b0) {
            w50 w50Var11 = this.Z;
            if (w50Var11 == null) {
                f0.S("linkBinding");
                w50Var11 = null;
            }
            BBSUserSectionView bBSUserSectionView = w50Var11.f117048l;
            LinkInfoObj linkInfoObjD8 = d4();
            f0.m(linkInfoObjD8);
            bBSUserSectionView.setGameRatingDesc(linkInfoObjD8);
            w50 w50Var12 = this.Z;
            if (w50Var12 == null) {
                f0.S("linkBinding");
                w50Var12 = null;
            }
            w50Var12.f117049m.setVisibility(0);
            LinkInfoObj linkInfoObjD9 = d4();
            f0.m(linkInfoObjD9);
            if (n.p(linkInfoObjD9.getScore()) > 0.0f) {
                w50 w50Var13 = this.Z;
                if (w50Var13 == null) {
                    f0.S("linkBinding");
                    w50Var13 = null;
                }
                GameRateStarView gameRateStarView = w50Var13.f117039c;
                LinkInfoObj linkInfoObjD10 = d4();
                f0.m(linkInfoObjD10);
                gameRateStarView.setRating(n.p(linkInfoObjD10.getScore()));
                w50 w50Var14 = this.Z;
                if (w50Var14 == null) {
                    f0.S("linkBinding");
                    w50Var14 = null;
                }
                w50Var14.f117039c.setVisibility(0);
                w50 w50Var15 = this.Z;
                if (w50Var15 == null) {
                    f0.S("linkBinding");
                    w50Var15 = null;
                }
                w50Var15.f117046j.setVisibility(0);
            } else {
                w50 w50Var16 = this.Z;
                if (w50Var16 == null) {
                    f0.S("linkBinding");
                    w50Var16 = null;
                }
                w50Var16.f117039c.setVisibility(8);
                w50 w50Var17 = this.Z;
                if (w50Var17 == null) {
                    f0.S("linkBinding");
                    w50Var17 = null;
                }
                w50Var17.f117046j.setVisibility(8);
            }
            LinkInfoObj linkInfoObjD11 = d4();
            f0.m(linkInfoObjD11);
            if (com.max.hbcommon.utils.c.w(linkInfoObjD11.getMultidimensional_score())) {
                w50 w50Var18 = this.Z;
                if (w50Var18 == null) {
                    f0.S("linkBinding");
                    w50Var18 = null;
                }
                w50Var18.f117040d.setVisibility(8);
                w50 w50Var19 = this.Z;
                if (w50Var19 == null) {
                    f0.S("linkBinding");
                    w50Var19 = null;
                }
                w50Var19.f117049m.setOnClickListener(null);
            } else {
                w50 w50Var20 = this.Z;
                if (w50Var20 == null) {
                    f0.S("linkBinding");
                    w50Var20 = null;
                }
                w50Var20.f117040d.setVisibility(0);
                w50 w50Var21 = this.Z;
                if (w50Var21 == null) {
                    f0.S("linkBinding");
                    w50Var21 = null;
                }
                w50Var21.f117040d.setBackground(q.o(this.mContext, R.color.arrow_bg, 2.0f));
                w50 w50Var22 = this.Z;
                if (w50Var22 == null) {
                    f0.S("linkBinding");
                    w50Var22 = null;
                }
                w50Var22.f117044h.setBackground(q.o(this.mContext, R.color.divider_secondary_2_color, 8.0f));
                w50 w50Var23 = this.Z;
                if (w50Var23 == null) {
                    f0.S("linkBinding");
                    w50Var23 = null;
                }
                w50Var23.f117044h.setLayoutManager(new GridLayoutManager(this.mContext, 2));
                w50 w50Var24 = this.Z;
                if (w50Var24 == null) {
                    f0.S("linkBinding");
                    w50Var24 = null;
                }
                RecyclerView recyclerView = w50Var24.f117044h;
                Activity activity2 = this.mContext;
                LinkInfoObj linkInfoObjD12 = d4();
                f0.m(linkInfoObjD12);
                recyclerView.setAdapter(new g(activity2, linkInfoObjD12.getMultidimensional_score()));
                h hVar = new h();
                w50 w50Var25 = this.Z;
                if (w50Var25 == null) {
                    f0.S("linkBinding");
                    w50Var25 = null;
                }
                w50Var25.f117049m.setOnClickListener(hVar);
            }
            LinkInfoObj linkInfoObjD13 = d4();
            f0.m(linkInfoObjD13);
            if (com.max.hbcommon.utils.c.u(linkInfoObjD13.getPlay_state())) {
                w50 w50Var26 = this.Z;
                if (w50Var26 == null) {
                    f0.S("linkBinding");
                    w50Var26 = null;
                }
                w50Var26.f117045i.setVisibility(8);
            } else {
                w50 w50Var27 = this.Z;
                if (w50Var27 == null) {
                    f0.S("linkBinding");
                    w50Var27 = null;
                }
                TextView textView = w50Var27.f117045i;
                LinkInfoObj linkInfoObjD14 = d4();
                f0.m(linkInfoObjD14);
                textView.setText(linkInfoObjD14.getPlay_state());
                w50 w50Var28 = this.Z;
                if (w50Var28 == null) {
                    f0.S("linkBinding");
                    w50Var28 = null;
                }
                w50Var28.f117045i.setVisibility(0);
            }
        } else {
            LinkInfoObj linkInfoObjD15 = d4();
            f0.m(linkInfoObjD15);
            linkInfoObjD15.setMultidimensional_score(null);
            w50 w50Var29 = this.Z;
            if (w50Var29 == null) {
                f0.S("linkBinding");
                w50Var29 = null;
            }
            BBSUserSectionView bBSUserSectionView2 = w50Var29.f117048l;
            LinkInfoObj linkInfoObjD16 = d4();
            f0.m(linkInfoObjD16);
            bBSUserSectionView2.setData(linkInfoObjD16, null);
            w50 w50Var30 = this.Z;
            if (w50Var30 == null) {
                f0.S("linkBinding");
                w50Var30 = null;
            }
            w50Var30.f117049m.setVisibility(8);
        }
        w50 w50Var31 = this.Z;
        if (w50Var31 == null) {
            f0.S("linkBinding");
            w50Var31 = null;
        }
        w50Var31.f117048l.getLl_top_algin_right().removeAllViews();
        View viewX7 = x7();
        if (viewX7 != null) {
            w50 w50Var32 = this.Z;
            if (w50Var32 == null) {
                f0.S("linkBinding");
                w50Var32 = null;
            }
            w50Var32.f117048l.getLl_top_algin_right().addView(viewX7);
        }
        w50 w50Var33 = this.Z;
        if (w50Var33 == null) {
            f0.S("linkBinding");
            w50Var33 = null;
        }
        ViewGroup.LayoutParams layoutParams = w50Var33.f117050n.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = ViewUtils.f(this.mContext, 6.0f);
        marginLayoutParams.bottomMargin = ViewUtils.f(this.mContext, 14.0f);
        w50 w50Var34 = this.Z;
        if (w50Var34 == null) {
            f0.S("linkBinding");
        } else {
            w50Var2 = w50Var34;
        }
        w50Var2.f117050n.setLayoutParams(marginLayoutParams);
    }

    public static final /* synthetic */ Bitmap q7(PostGameCommentFragment postGameCommentFragment, Bitmap bitmap, ShineButton shineButton) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postGameCommentFragment, bitmap, shineButton}, null, changeQuickRedirect, true, 29196, new Class[]{PostGameCommentFragment.class, Bitmap.class, ShineButton.class}, Bitmap.class);
        return patchProxyResultProxy.isSupported ? (Bitmap) patchProxyResultProxy.result : postGameCommentFragment.z7(bitmap, shineButton);
    }

    public static final /* synthetic */ void r7(PostGameCommentFragment postGameCommentFragment) {
        if (PatchProxy.proxy(new Object[]{postGameCommentFragment}, null, changeQuickRedirect, true, 29194, new Class[]{PostGameCommentFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postGameCommentFragment.A7();
    }

    public static final /* synthetic */ void v7(PostGameCommentFragment postGameCommentFragment, String str, ShineButton shineButton, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{postGameCommentFragment, str, shineButton, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 29193, new Class[]{PostGameCommentFragment.class, String.class, ShineButton.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        postGameCommentFragment.B7(str, shineButton, i10, z10);
    }

    public static final /* synthetic */ void w7(PostGameCommentFragment postGameCommentFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{postGameCommentFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 29195, new Class[]{PostGameCommentFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        postGameCommentFragment.C7(z10);
    }

    private final View x7() {
        BBSLinkTreeObj result;
        GameObj game_info;
        BBSLinkTreeObj result2;
        GameObj game_info2;
        BBSLinkTreeObj result3;
        GameObj game_info3;
        BBSLinkTreeObj result4;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29179, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        String appicon = null;
        if (f4() == null) {
            return null;
        }
        Result<BBSLinkTreeObj> resultF4 = f4();
        if (((resultF4 == null || (result4 = resultF4.getResult()) == null) ? null : result4.getGame_info()) == null) {
            return null;
        }
        View viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.item_game_comment_topic_card, (ViewGroup) null, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_name);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_img);
        Result<BBSLinkTreeObj> resultF5 = f4();
        textView.setText(e0.l((resultF5 == null || (result3 = resultF5.getResult()) == null || (game_info3 = result3.getGame_info()) == null) ? null : game_info3.getName(), 6));
        Result<BBSLinkTreeObj> resultF6 = f4();
        if (com.max.hbcommon.utils.c.u((resultF6 == null || (result2 = resultF6.getResult()) == null || (game_info2 = result2.getGame_info()) == null) ? null : game_info2.getAppicon())) {
            imageView.setImageResource(R.drawable.heybox_logo_right_angle_bg_white);
        } else {
            Result<BBSLinkTreeObj> resultF7 = f4();
            if (resultF7 != null && (result = resultF7.getResult()) != null && (game_info = result.getGame_info()) != null) {
                appicon = game_info.getAppicon();
            }
            com.max.hbimage.b.L(appicon, imageView, R.drawable.heybox_logo_right_angle_bg_white);
        }
        viewInflate.setOnClickListener(new b());
        return viewInflate;
    }

    private final Bitmap z7(Bitmap bitmap, ShineButton shineButton) {
        Object objB;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap, shineButton}, this, changeQuickRedirect, false, 29175, new Class[]{Bitmap.class, ShineButton.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        try {
            kotlin.Result.a aVar = kotlin.Result.f124476c;
            float f10 = ViewUtils.f(this.mContext, 24.0f);
            float width = (bitmap.getWidth() / shineButton.getWidth()) * f10;
            float height = (bitmap.getHeight() / shineButton.getHeight()) * f10;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) width, (int) height, Bitmap.Config.ARGB_8888);
            f0.o(bitmapCreateBitmap, "createBitmap(\n          …g.ARGB_8888\n            )");
            bitmapCreateBitmap.eraseColor(0);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            float f11 = 2;
            canvas.translate(((width - bitmap.getWidth()) / f11) - f11, (height - bitmap.getHeight()) / f11);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            objB = kotlin.Result.b(Bitmap.createScaledBitmap(bitmapCreateBitmap, 72, 72, false));
        } catch (Throwable th2) {
            kotlin.Result.a aVar2 = kotlin.Result.f124476c;
            objB = kotlin.Result.b(t0.a(th2));
        }
        return (Bitmap) (kotlin.Result.i(objB) ? null : objB);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void A4(@dl.e Result<BBSLinkTreeObj> result) {
        if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29192, new Class[]{Result.class}, Void.TYPE).isSupported && isActive()) {
            super.A4(result);
            if (result != null) {
                if (this.Y || r4()) {
                    this.Y = false;
                    G4(false);
                    D7();
                    n5();
                    l5();
                    h5();
                    j5();
                    kf.a aVarG4 = g4();
                    if (aVarG4 != null) {
                        aVarG4.p1();
                    }
                }
            }
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void B4() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29181, new Class[0], Void.TYPE).isSupported && i0.e(this.mContext)) {
            w50 w50Var = this.Z;
            if (w50Var == null) {
                f0.S("linkBinding");
                w50Var = null;
            }
            w50Var.f117038b.getGca_dislike().performClick();
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void C4() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29180, new Class[0], Void.TYPE).isSupported && i0.e(this.mContext)) {
            w50 w50Var = this.Z;
            if (w50Var == null) {
                f0.S("linkBinding");
                w50Var = null;
            }
            w50Var.f117038b.getGca_like().performClick();
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void U3(@dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 29182, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        i5(str);
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        String linkid = linkInfoObjD4.getLinkid();
        f0.m(str);
        V3(linkid, null, str);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void U4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29171, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.U4();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void h5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29187, new Class[0], Void.TYPE).isSupported || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        i5(linkInfoObjD4.getIs_favour());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void i5(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29188, new Class[]{String.class}, Void.TYPE).isSupported || g4() == null) {
            return;
        }
        kf.a aVarG4 = g4();
        f0.m(aVarG4);
        aVarG4.y(str);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment, com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29170, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        super.installViews(view);
        O4("page_style_post");
        w50 w50VarC = w50.c(this.mInflater);
        f0.o(w50VarC, "inflate(mInflater)");
        this.Z = w50VarC;
        ConsecutiveScrollerLayout consecutiveScrollerLayout = E5().f112942c;
        w50 w50Var = this.Z;
        if (w50Var == null) {
            f0.S("linkBinding");
            w50Var = null;
        }
        consecutiveScrollerLayout.addView(w50Var.b(), 0, new ConsecutiveScrollerLayout.LayoutParams(-1, -2));
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void j5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29190, new Class[0], Void.TYPE).isSupported || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        k5(linkInfoObjD4.getFollow_status());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void k5(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29191, new Class[]{String.class}, Void.TYPE).isSupported || g4() == null || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        if (linkInfoObjD4.getUser() != null) {
            kf.a aVarG4 = g4();
            f0.m(aVarG4);
            LinkInfoObj linkInfoObjD5 = d4();
            f0.m(linkInfoObjD5);
            aVarG4.r1(linkInfoObjD5.getUser(), str);
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void l5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29185, new Class[0], Void.TYPE).isSupported || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        m5(linkInfoObjD4.getIs_award_link());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void m5(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29186, new Class[]{String.class}, Void.TYPE).isSupported || g4() == null) {
            return;
        }
        kf.a aVarG4 = g4();
        f0.m(aVarG4);
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        aVarG4.M2(str, linkInfoObjD4.getLink_award_num());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void n5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29183, new Class[0], Void.TYPE).isSupported || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        o5(linkInfoObjD4.getIs_award_link());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void o5(@dl.e String str) {
        kf.a aVarG4;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29184, new Class[]{String.class}, Void.TYPE).isSupported || (aVarG4 = g4()) == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        aVarG4.v(str, linkInfoObjD4 != null ? linkInfoObjD4.getLink_award_num() : null);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment
    public void x6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29172, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.x6();
        getArguments();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void y4(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29189, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (d4() != null) {
            LinkInfoObj linkInfoObjD4 = d4();
            f0.m(linkInfoObjD4);
            linkInfoObjD4.setIs_favour(str);
            h5();
        }
        if (g4() == null || !f0.g("1", str)) {
            return;
        }
        kf.a aVarG4 = g4();
        f0.m(aVarG4);
        aVarG4.l("action_favour", true);
    }

    @dl.d
    public final String y7(@dl.d UserSupportStateObj state) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{state}, this, changeQuickRedirect, false, 29178, new Class[]{UserSupportStateObj.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(state, "state");
        if (com.max.hbcommon.utils.c.x(state.is_up())) {
            return "1";
        }
        return com.max.hbcommon.utils.c.x(state.is_down()) ? "2" : "0";
    }
}
