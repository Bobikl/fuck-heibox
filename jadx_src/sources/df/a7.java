package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbcustomview.ShootEmojiView;
import com.max.hbcustomview.shinebuttonlib.ShineButton;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionEditText;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: EditCommentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a7 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final TextView A;

    @androidx.annotation.n0
    public final ExpressionTextView B;

    @androidx.annotation.n0
    public final TextView C;

    @androidx.annotation.n0
    public final TextView D;

    @androidx.annotation.n0
    public final View E;

    @androidx.annotation.n0
    public final LinearLayout F;

    @androidx.annotation.n0
    public final LinearLayout G;

    @androidx.annotation.n0
    public final LinearLayout H;

    @androidx.annotation.n0
    public final LinearLayout I;

    @androidx.annotation.n0
    public final LinearLayout J;

    @androidx.annotation.n0
    public final ShootEmojiView K;

    @androidx.annotation.n0
    public final LinearLayout L;

    @androidx.annotation.n0
    public final LinearLayout M;

    @androidx.annotation.n0
    public final RelativeLayout N;

    @androidx.annotation.n0
    public final LinearLayout O;

    @androidx.annotation.n0
    public final LinearLayout P;

    @androidx.annotation.n0
    public final RelativeLayout Q;

    @androidx.annotation.n0
    public final RelativeLayout R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ShootEmojiView f108379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f108380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionEditText f108381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f108382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ShineButton f108386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108387i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ShineButton f108388j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108389k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f108390l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108391m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108392n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108393o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f108394p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final ShineButton f108395q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f108396r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108397s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108398t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108399u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108400v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108401w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108402x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108403y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108404z;

    private a7(@androidx.annotation.n0 ShootEmojiView shootEmojiView, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 ExpressionEditText expressionEditText, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ShineButton shineButton, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ShineButton shineButton2, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 ImageView imageView7, @androidx.annotation.n0 ImageView imageView8, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 ShineButton shineButton3, @androidx.annotation.n0 View view, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 View view2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 ShootEmojiView shootEmojiView2, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 LinearLayout linearLayout7, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout8, @androidx.annotation.n0 LinearLayout linearLayout9, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3) {
        this.f108379a = shootEmojiView;
        this.f108380b = checkBox;
        this.f108381c = expressionEditText;
        this.f108382d = frameLayout;
        this.f108383e = imageView;
        this.f108384f = imageView2;
        this.f108385g = imageView3;
        this.f108386h = shineButton;
        this.f108387i = imageView4;
        this.f108388j = shineButton2;
        this.f108389k = imageView5;
        this.f108390l = qMUIRadiusImageView;
        this.f108391m = imageView6;
        this.f108392n = imageView7;
        this.f108393o = imageView8;
        this.f108394p = recyclerView;
        this.f108395q = shineButton3;
        this.f108396r = view;
        this.f108397s = textView;
        this.f108398t = textView2;
        this.f108399u = textView3;
        this.f108400v = textView4;
        this.f108401w = textView5;
        this.f108402x = textView6;
        this.f108403y = textView7;
        this.f108404z = textView8;
        this.A = textView9;
        this.B = expressionTextView;
        this.C = textView10;
        this.D = textView11;
        this.E = view2;
        this.F = linearLayout;
        this.G = linearLayout2;
        this.H = linearLayout3;
        this.I = linearLayout4;
        this.J = linearLayout5;
        this.K = shootEmojiView2;
        this.L = linearLayout6;
        this.M = linearLayout7;
        this.N = relativeLayout;
        this.O = linearLayout8;
        this.P = linearLayout9;
        this.Q = relativeLayout2;
        this.R = relativeLayout3;
    }

    @androidx.annotation.n0
    public static a7 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17072, new Class[]{View.class}, a7.class);
        if (patchProxyResultProxy.isSupported) {
            return (a7) patchProxyResultProxy.result;
        }
        int i10 = R.id.cb_forward_to_timeline;
        CheckBox checkBox = (CheckBox) l3.d.a(view, R.id.cb_forward_to_timeline);
        if (checkBox != null) {
            i10 = R.id.et_edit_comment;
            ExpressionEditText expressionEditText = (ExpressionEditText) l3.d.a(view, R.id.et_edit_comment);
            if (expressionEditText != null) {
                i10 = R.id.fl_expression;
                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fl_expression);
                if (frameLayout != null) {
                    i10 = R.id.iv_add_img;
                    ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_add_img);
                    if (imageView != null) {
                        i10 = R.id.iv_at;
                        ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_at);
                        if (imageView2 != null) {
                            i10 = R.id.iv_cy;
                            ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_cy);
                            if (imageView3 != null) {
                                i10 = R.id.iv_edit_comment_charge;
                                ShineButton shineButton = (ShineButton) l3.d.a(view, R.id.iv_edit_comment_charge);
                                if (shineButton != null) {
                                    i10 = R.id.iv_edit_comment_comment;
                                    ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_edit_comment_comment);
                                    if (imageView4 != null) {
                                        i10 = R.id.iv_edit_comment_favor;
                                        ShineButton shineButton2 = (ShineButton) l3.d.a(view, R.id.iv_edit_comment_favor);
                                        if (shineButton2 != null) {
                                            i10 = R.id.iv_edit_comment_forward;
                                            ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_edit_comment_forward);
                                            if (imageView5 != null) {
                                                i10 = R.id.iv_edit_comment_notify_avatar;
                                                QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_edit_comment_notify_avatar);
                                                if (qMUIRadiusImageView != null) {
                                                    i10 = R.id.iv_edit_comment_notify_close;
                                                    ImageView imageView6 = (ImageView) l3.d.a(view, R.id.iv_edit_comment_notify_close);
                                                    if (imageView6 != null) {
                                                        i10 = R.id.iv_edit_comment_reply_floor_avatar;
                                                        ImageView imageView7 = (ImageView) l3.d.a(view, R.id.iv_edit_comment_reply_floor_avatar);
                                                        if (imageView7 != null) {
                                                            i10 = R.id.iv_expression;
                                                            ImageView imageView8 = (ImageView) l3.d.a(view, R.id.iv_expression);
                                                            if (imageView8 != null) {
                                                                i10 = R.id.rv_edit_comment_edit_pic;
                                                                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_edit_comment_edit_pic);
                                                                if (recyclerView != null) {
                                                                    i10 = R.id.sb_edit_comment_award;
                                                                    ShineButton shineButton3 = (ShineButton) l3.d.a(view, R.id.sb_edit_comment_award);
                                                                    if (shineButton3 != null) {
                                                                        i10 = R.id.top_divider;
                                                                        View viewA = l3.d.a(view, R.id.top_divider);
                                                                        if (viewA != null) {
                                                                            i10 = R.id.tv_combo_tip;
                                                                            TextView textView = (TextView) l3.d.a(view, R.id.tv_combo_tip);
                                                                            if (textView != null) {
                                                                                i10 = R.id.tv_edit_comment_award_num;
                                                                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_edit_comment_award_num);
                                                                                if (textView2 != null) {
                                                                                    i10 = R.id.tv_edit_comment_charge_num;
                                                                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_edit_comment_charge_num);
                                                                                    if (textView3 != null) {
                                                                                        i10 = R.id.tv_edit_comment_comment_text;
                                                                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_edit_comment_comment_text);
                                                                                        if (textView4 != null) {
                                                                                            i10 = R.id.tv_edit_comment_favor_text;
                                                                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_edit_comment_favor_text);
                                                                                            if (textView5 != null) {
                                                                                                i10 = R.id.tv_edit_comment_forward_text;
                                                                                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_edit_comment_forward_text);
                                                                                                if (textView6 != null) {
                                                                                                    i10 = R.id.tv_edit_comment_notify_follow;
                                                                                                    TextView textView7 = (TextView) l3.d.a(view, R.id.tv_edit_comment_notify_follow);
                                                                                                    if (textView7 != null) {
                                                                                                        i10 = R.id.tv_edit_comment_notify_message;
                                                                                                        TextView textView8 = (TextView) l3.d.a(view, R.id.tv_edit_comment_notify_message);
                                                                                                        if (textView8 != null) {
                                                                                                            i10 = R.id.tv_edit_comment_notify_title;
                                                                                                            TextView textView9 = (TextView) l3.d.a(view, R.id.tv_edit_comment_notify_title);
                                                                                                            if (textView9 != null) {
                                                                                                                i10 = R.id.tv_edit_comment_reply_floor_msg;
                                                                                                                ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_edit_comment_reply_floor_msg);
                                                                                                                if (expressionTextView != null) {
                                                                                                                    i10 = R.id.tv_edit_comment_send;
                                                                                                                    TextView textView10 = (TextView) l3.d.a(view, R.id.tv_edit_comment_send);
                                                                                                                    if (textView10 != null) {
                                                                                                                        i10 = R.id.tv_forward_tips;
                                                                                                                        TextView textView11 = (TextView) l3.d.a(view, R.id.tv_forward_tips);
                                                                                                                        if (textView11 != null) {
                                                                                                                            i10 = R.id.v_edit_comment_translucent_layer;
                                                                                                                            View viewA2 = l3.d.a(view, R.id.v_edit_comment_translucent_layer);
                                                                                                                            if (viewA2 != null) {
                                                                                                                                i10 = R.id.vg_combo_tip;
                                                                                                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_combo_tip);
                                                                                                                                if (linearLayout != null) {
                                                                                                                                    i10 = R.id.vg_edit_comment;
                                                                                                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_edit_comment);
                                                                                                                                    if (linearLayout2 != null) {
                                                                                                                                        i10 = R.id.vg_edit_comment_award;
                                                                                                                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_edit_comment_award);
                                                                                                                                        if (linearLayout3 != null) {
                                                                                                                                            i10 = R.id.vg_edit_comment_charge;
                                                                                                                                            LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_edit_comment_charge);
                                                                                                                                            if (linearLayout4 != null) {
                                                                                                                                                i10 = R.id.vg_edit_comment_comment;
                                                                                                                                                LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_edit_comment_comment);
                                                                                                                                                if (linearLayout5 != null) {
                                                                                                                                                    ShootEmojiView shootEmojiView = (ShootEmojiView) view;
                                                                                                                                                    i10 = R.id.vg_edit_comment_editor;
                                                                                                                                                    LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_edit_comment_editor);
                                                                                                                                                    if (linearLayout6 != null) {
                                                                                                                                                        i10 = R.id.vg_edit_comment_ex;
                                                                                                                                                        LinearLayout linearLayout7 = (LinearLayout) l3.d.a(view, R.id.vg_edit_comment_ex);
                                                                                                                                                        if (linearLayout7 != null) {
                                                                                                                                                            i10 = R.id.vg_edit_comment_ex_new;
                                                                                                                                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_edit_comment_ex_new);
                                                                                                                                                            if (relativeLayout != null) {
                                                                                                                                                                i10 = R.id.vg_edit_comment_favor;
                                                                                                                                                                LinearLayout linearLayout8 = (LinearLayout) l3.d.a(view, R.id.vg_edit_comment_favor);
                                                                                                                                                                if (linearLayout8 != null) {
                                                                                                                                                                    i10 = R.id.vg_edit_comment_forward;
                                                                                                                                                                    LinearLayout linearLayout9 = (LinearLayout) l3.d.a(view, R.id.vg_edit_comment_forward);
                                                                                                                                                                    if (linearLayout9 != null) {
                                                                                                                                                                        i10 = R.id.vg_edit_comment_notify;
                                                                                                                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_edit_comment_notify);
                                                                                                                                                                        if (relativeLayout2 != null) {
                                                                                                                                                                            i10 = R.id.vg_edit_comment_reply_floor;
                                                                                                                                                                            RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_edit_comment_reply_floor);
                                                                                                                                                                            if (relativeLayout3 != null) {
                                                                                                                                                                                return new a7(shootEmojiView, checkBox, expressionEditText, frameLayout, imageView, imageView2, imageView3, shineButton, imageView4, shineButton2, imageView5, qMUIRadiusImageView, imageView6, imageView7, imageView8, recyclerView, shineButton3, viewA, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, expressionTextView, textView10, textView11, viewA2, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, shootEmojiView, linearLayout6, linearLayout7, relativeLayout, linearLayout8, linearLayout9, relativeLayout2, relativeLayout3);
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
    public static a7 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17070, new Class[]{LayoutInflater.class}, a7.class);
        return patchProxyResultProxy.isSupported ? (a7) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static a7 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17071, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, a7.class);
        if (patchProxyResultProxy.isSupported) {
            return (a7) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.edit_comment, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ShootEmojiView b() {
        return this.f108379a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17073, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
