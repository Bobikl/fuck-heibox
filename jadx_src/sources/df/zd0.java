package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: VideoPostHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zd0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f118323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxAvatarView f118328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f118330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118331i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118332j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f118333k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118334l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118335m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118336n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118337o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118338p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final nn f118339q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118340r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118341s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118342t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118343u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118344v;

    private zd0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 HeyBoxAvatarView heyBoxAvatarView, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 nn nnVar, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout4, @androidx.annotation.n0 RelativeLayout relativeLayout5, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f118323a = relativeLayout;
        this.f118324b = textView;
        this.f118325c = imageView;
        this.f118326d = imageView2;
        this.f118327e = textView2;
        this.f118328f = heyBoxAvatarView;
        this.f118329g = imageView3;
        this.f118330h = constraintLayout;
        this.f118331i = relativeLayout2;
        this.f118332j = textView3;
        this.f118333k = expressionTextView;
        this.f118334l = textView4;
        this.f118335m = textView5;
        this.f118336n = textView6;
        this.f118337o = textView7;
        this.f118338p = linearLayout;
        this.f118339q = nnVar;
        this.f118340r = relativeLayout3;
        this.f118341s = relativeLayout4;
        this.f118342t = relativeLayout5;
        this.f118343u = linearLayout2;
        this.f118344v = linearLayout3;
    }

    @androidx.annotation.n0
    public static zd0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21516, new Class[]{View.class}, zd0.class);
        if (patchProxyResultProxy.isSupported) {
            return (zd0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_article_collection_index;
        TextView textView = (TextView) l3.d.a(view, R.id.iv_article_collection_index);
        if (textView != null) {
            i10 = R.id.iv_article_collection_left_icon;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_article_collection_left_icon);
            if (imageView != null) {
                i10 = R.id.iv_article_collection_right_icon;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_article_collection_right_icon);
                if (imageView2 != null) {
                    i10 = R.id.iv_article_collection_text;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.iv_article_collection_text);
                    if (textView2 != null) {
                        i10 = R.id.iv_avatar;
                        HeyBoxAvatarView heyBoxAvatarView = (HeyBoxAvatarView) l3.d.a(view, R.id.iv_avatar);
                        if (heyBoxAvatarView != null) {
                            i10 = R.id.iv_expand;
                            ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_expand);
                            if (imageView3 != null) {
                                i10 = R.id.ll_article_collection;
                                ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.ll_article_collection);
                                if (constraintLayout != null) {
                                    i10 = R.id.rl_medal_level;
                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_medal_level);
                                    if (relativeLayout != null) {
                                        i10 = R.id.tv_author_desc;
                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_author_desc);
                                        if (textView3 != null) {
                                            i10 = R.id.tv_desc;
                                            ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_desc);
                                            if (expressionTextView != null) {
                                                i10 = R.id.tv_follow_status;
                                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_follow_status);
                                                if (textView4 != null) {
                                                    i10 = R.id.tv_title;
                                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_title);
                                                    if (textView5 != null) {
                                                        i10 = R.id.tv_user_name;
                                                        TextView textView6 = (TextView) l3.d.a(view, R.id.tv_user_name);
                                                        if (textView6 != null) {
                                                            i10 = R.id.tv_video_info;
                                                            TextView textView7 = (TextView) l3.d.a(view, R.id.tv_video_info);
                                                            if (textView7 != null) {
                                                                i10 = R.id.vg_cards;
                                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_cards);
                                                                if (linearLayout != null) {
                                                                    i10 = R.id.vg_header_game_rec;
                                                                    View viewA = l3.d.a(view, R.id.vg_header_game_rec);
                                                                    if (viewA != null) {
                                                                        nn nnVarA = nn.a(viewA);
                                                                        i10 = R.id.vg_header_game_rec_wrapper;
                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_header_game_rec_wrapper);
                                                                        if (relativeLayout2 != null) {
                                                                            i10 = R.id.vg_panel_primary;
                                                                            RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_panel_primary);
                                                                            if (relativeLayout3 != null) {
                                                                                i10 = R.id.vg_panel_sub_a;
                                                                                RelativeLayout relativeLayout4 = (RelativeLayout) l3.d.a(view, R.id.vg_panel_sub_a);
                                                                                if (relativeLayout4 != null) {
                                                                                    i10 = R.id.vg_panel_sub_b;
                                                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_panel_sub_b);
                                                                                    if (linearLayout2 != null) {
                                                                                        i10 = R.id.vg_title;
                                                                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_title);
                                                                                        if (linearLayout3 != null) {
                                                                                            return new zd0((RelativeLayout) view, textView, imageView, imageView2, textView2, heyBoxAvatarView, imageView3, constraintLayout, relativeLayout, textView3, expressionTextView, textView4, textView5, textView6, textView7, linearLayout, nnVarA, relativeLayout2, relativeLayout3, relativeLayout4, linearLayout2, linearLayout3);
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
    public static zd0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21514, new Class[]{LayoutInflater.class}, zd0.class);
        return patchProxyResultProxy.isSupported ? (zd0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static zd0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21515, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, zd0.class);
        if (patchProxyResultProxy.isSupported) {
            return (zd0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.video_post_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f118323a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21517, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
