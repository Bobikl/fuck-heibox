package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbcustomview.ShootEmojiView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.NativeCommentRecommendView;
import com.max.xiaoheihe.module.expression.widget.ExpressionEditText;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutBottomEditorBarBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b30 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final LinearLayout A;

    @androidx.annotation.n0
    public final LinearLayout B;

    @androidx.annotation.n0
    public final ShootEmojiView C;

    @androidx.annotation.n0
    public final LinearLayout D;

    @androidx.annotation.n0
    public final RelativeLayout E;

    @androidx.annotation.n0
    public final ConstraintLayout F;

    @androidx.annotation.n0
    public final LinearLayout G;

    @androidx.annotation.n0
    public final FrameLayout H;

    @androidx.annotation.n0
    public final RelativeLayout I;

    @androidx.annotation.n0
    public final LinearLayout J;

    @androidx.annotation.n0
    public final LinearLayout K;

    @androidx.annotation.n0
    public final LinearLayout L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ShootEmojiView f108758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Barrier f108759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f108760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionEditText f108761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f108767j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108768k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108769l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108770m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f108771n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f108772o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108773p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f108774q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108775r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108776s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108777t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108778u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f108779v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final NativeCommentRecommendView f108780w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f108781x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final NativeCommentRecommendView f108782y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108783z;

    private b30(@androidx.annotation.n0 ShootEmojiView shootEmojiView, @androidx.annotation.n0 Barrier barrier, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ExpressionEditText expressionEditText, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 ImageView imageView7, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 View view, @androidx.annotation.n0 NativeCommentRecommendView nativeCommentRecommendView, @androidx.annotation.n0 mb.o oVar2, @androidx.annotation.n0 NativeCommentRecommendView nativeCommentRecommendView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 ShootEmojiView shootEmojiView2, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 LinearLayout linearLayout7, @androidx.annotation.n0 LinearLayout linearLayout8) {
        this.f108758a = shootEmojiView;
        this.f108759b = barrier;
        this.f108760c = constraintLayout;
        this.f108761d = expressionEditText;
        this.f108762e = imageView;
        this.f108763f = imageView2;
        this.f108764g = imageView3;
        this.f108765h = imageView4;
        this.f108766i = imageView5;
        this.f108767j = qMUIRadiusImageView;
        this.f108768k = imageView6;
        this.f108769l = imageView7;
        this.f108770m = relativeLayout;
        this.f108771n = recyclerView;
        this.f108772o = oVar;
        this.f108773p = textView;
        this.f108774q = expressionTextView;
        this.f108775r = textView2;
        this.f108776s = textView3;
        this.f108777t = textView4;
        this.f108778u = textView5;
        this.f108779v = view;
        this.f108780w = nativeCommentRecommendView;
        this.f108781x = oVar2;
        this.f108782y = nativeCommentRecommendView2;
        this.f108783z = linearLayout;
        this.A = linearLayout2;
        this.B = linearLayout3;
        this.C = shootEmojiView2;
        this.D = linearLayout4;
        this.E = relativeLayout2;
        this.F = constraintLayout2;
        this.G = linearLayout5;
        this.H = frameLayout;
        this.I = relativeLayout3;
        this.J = linearLayout6;
        this.K = linearLayout7;
        this.L = linearLayout8;
    }

    @androidx.annotation.n0
    public static b30 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20390, new Class[]{View.class}, b30.class);
        if (patchProxyResultProxy.isSupported) {
            return (b30) patchProxyResultProxy.result;
        }
        int i10 = R.id.barrier;
        Barrier barrier = (Barrier) l3.d.a(view, R.id.barrier);
        if (barrier != null) {
            i10 = R.id.bottom_root;
            ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.bottom_root);
            if (constraintLayout != null) {
                i10 = R.id.et_editor;
                ExpressionEditText expressionEditText = (ExpressionEditText) l3.d.a(view, R.id.et_editor);
                if (expressionEditText != null) {
                    i10 = R.id.iv_at;
                    ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_at);
                    if (imageView != null) {
                        i10 = R.id.iv_cy;
                        ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_cy);
                        if (imageView2 != null) {
                            i10 = R.id.iv_editor_comment_reply_avatar;
                            ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_editor_comment_reply_avatar);
                            if (imageView3 != null) {
                                i10 = R.id.iv_expression;
                                ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_expression);
                                if (imageView4 != null) {
                                    i10 = R.id.iv_game;
                                    ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_game);
                                    if (imageView5 != null) {
                                        i10 = R.id.iv_notify_avatar;
                                        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_notify_avatar);
                                        if (qMUIRadiusImageView != null) {
                                            i10 = R.id.iv_notify_close;
                                            ImageView imageView6 = (ImageView) l3.d.a(view, R.id.iv_notify_close);
                                            if (imageView6 != null) {
                                                i10 = R.id.iv_pic;
                                                ImageView imageView7 = (ImageView) l3.d.a(view, R.id.iv_pic);
                                                if (imageView7 != null) {
                                                    i10 = R.id.rl_expand_view_container;
                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_expand_view_container);
                                                    if (relativeLayout != null) {
                                                        i10 = R.id.rv_editor_img_container;
                                                        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_editor_img_container);
                                                        if (recyclerView != null) {
                                                            i10 = R.id.top_divider;
                                                            View viewA = l3.d.a(view, R.id.top_divider);
                                                            if (viewA != null) {
                                                                mb.o oVarA = mb.o.a(viewA);
                                                                i10 = R.id.tv_comment_limit;
                                                                TextView textView = (TextView) l3.d.a(view, R.id.tv_comment_limit);
                                                                if (textView != null) {
                                                                    i10 = R.id.tv_editor_comment_reply_msg;
                                                                    ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_editor_comment_reply_msg);
                                                                    if (expressionTextView != null) {
                                                                        i10 = R.id.tv_notify_follow;
                                                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_notify_follow);
                                                                        if (textView2 != null) {
                                                                            i10 = R.id.tv_notify_message;
                                                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_notify_message);
                                                                            if (textView3 != null) {
                                                                                i10 = R.id.tv_notify_title;
                                                                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_notify_title);
                                                                                if (textView4 != null) {
                                                                                    i10 = R.id.tv_send;
                                                                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_send);
                                                                                    if (textView5 != null) {
                                                                                        i10 = R.id.v_mask;
                                                                                        View viewA2 = l3.d.a(view, R.id.v_mask);
                                                                                        if (viewA2 != null) {
                                                                                            i10 = R.id.v_recommend;
                                                                                            NativeCommentRecommendView nativeCommentRecommendView = (NativeCommentRecommendView) l3.d.a(view, R.id.v_recommend);
                                                                                            if (nativeCommentRecommendView != null) {
                                                                                                i10 = R.id.v_reply_div;
                                                                                                View viewA3 = l3.d.a(view, R.id.v_reply_div);
                                                                                                if (viewA3 != null) {
                                                                                                    mb.o oVarA2 = mb.o.a(viewA3);
                                                                                                    i10 = R.id.v_unrecommend;
                                                                                                    NativeCommentRecommendView nativeCommentRecommendView2 = (NativeCommentRecommendView) l3.d.a(view, R.id.v_unrecommend);
                                                                                                    if (nativeCommentRecommendView2 != null) {
                                                                                                        i10 = R.id.vg_bottom_bar;
                                                                                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_bottom_bar);
                                                                                                        if (linearLayout != null) {
                                                                                                            i10 = R.id.vg_bottom_block;
                                                                                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_bottom_block);
                                                                                                            if (linearLayout2 != null) {
                                                                                                                i10 = R.id.vg_edit_all;
                                                                                                                LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_edit_all);
                                                                                                                if (linearLayout3 != null) {
                                                                                                                    ShootEmojiView shootEmojiView = (ShootEmojiView) view;
                                                                                                                    i10 = R.id.vg_editor_buttons;
                                                                                                                    LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_editor_buttons);
                                                                                                                    if (linearLayout4 != null) {
                                                                                                                        i10 = R.id.vg_editor_comment_reply;
                                                                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_editor_comment_reply);
                                                                                                                        if (relativeLayout2 != null) {
                                                                                                                            i10 = R.id.vg_editor_container;
                                                                                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) l3.d.a(view, R.id.vg_editor_container);
                                                                                                                            if (constraintLayout2 != null) {
                                                                                                                                i10 = R.id.vg_editor_img_container;
                                                                                                                                LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_editor_img_container);
                                                                                                                                if (linearLayout5 != null) {
                                                                                                                                    i10 = R.id.vg_expression;
                                                                                                                                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_expression);
                                                                                                                                    if (frameLayout != null) {
                                                                                                                                        i10 = R.id.vg_notify;
                                                                                                                                        RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_notify);
                                                                                                                                        if (relativeLayout3 != null) {
                                                                                                                                            i10 = R.id.vg_recent_expression;
                                                                                                                                            LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_recent_expression);
                                                                                                                                            if (linearLayout6 != null) {
                                                                                                                                                i10 = R.id.vg_recommend_btns;
                                                                                                                                                LinearLayout linearLayout7 = (LinearLayout) l3.d.a(view, R.id.vg_recommend_btns);
                                                                                                                                                if (linearLayout7 != null) {
                                                                                                                                                    i10 = R.id.vg_right_buttons;
                                                                                                                                                    LinearLayout linearLayout8 = (LinearLayout) l3.d.a(view, R.id.vg_right_buttons);
                                                                                                                                                    if (linearLayout8 != null) {
                                                                                                                                                        return new b30(shootEmojiView, barrier, constraintLayout, expressionEditText, imageView, imageView2, imageView3, imageView4, imageView5, qMUIRadiusImageView, imageView6, imageView7, relativeLayout, recyclerView, oVarA, textView, expressionTextView, textView2, textView3, textView4, textView5, viewA2, nativeCommentRecommendView, oVarA2, nativeCommentRecommendView2, linearLayout, linearLayout2, linearLayout3, shootEmojiView, linearLayout4, relativeLayout2, constraintLayout2, linearLayout5, frameLayout, relativeLayout3, linearLayout6, linearLayout7, linearLayout8);
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
    public static b30 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20388, new Class[]{LayoutInflater.class}, b30.class);
        return patchProxyResultProxy.isSupported ? (b30) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static b30 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20389, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, b30.class);
        if (patchProxyResultProxy.isSupported) {
            return (b30) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_bottom_editor_bar, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ShootEmojiView b() {
        return this.f108758a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20391, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
