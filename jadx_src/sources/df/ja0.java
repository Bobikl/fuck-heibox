package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutScreenshotShareBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ja0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f112104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f112107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112112i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f112113j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112114k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112115l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f112116m;

    private ja0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 View view, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 View view2, @androidx.annotation.n0 ConstraintLayout constraintLayout) {
        this.f112104a = relativeLayout;
        this.f112105b = imageView;
        this.f112106c = imageView2;
        this.f112107d = qMUIRadiusImageView;
        this.f112108e = imageView3;
        this.f112109f = view;
        this.f112110g = textView;
        this.f112111h = textView2;
        this.f112112i = textView3;
        this.f112113j = expressionTextView;
        this.f112114k = textView4;
        this.f112115l = view2;
        this.f112116m = constraintLayout;
    }

    @androidx.annotation.n0
    public static ja0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21146, new Class[]{View.class}, ja0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ja0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_bottom_logo;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bottom_logo);
        if (imageView != null) {
            i10 = R.id.iv_game_logo;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_game_logo);
            if (imageView2 != null) {
                i10 = R.id.iv_image;
                QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_image);
                if (qMUIRadiusImageView != null) {
                    i10 = R.id.iv_user_avatar;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_user_avatar);
                    if (imageView3 != null) {
                        i10 = R.id.name_divider;
                        View viewA = l3.d.a(view, R.id.name_divider);
                        if (viewA != null) {
                            i10 = R.id.tv_game_name;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_game_name);
                            if (textView != null) {
                                i10 = R.id.tv_game_name_en;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_game_name_en);
                                if (textView2 != null) {
                                    i10 = R.id.tv_user_comment_desc;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_user_comment_desc);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_user_comments;
                                        ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_user_comments);
                                        if (expressionTextView != null) {
                                            i10 = R.id.tv_user_name;
                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_user_name);
                                            if (textView4 != null) {
                                                i10 = R.id.v_game_logo_mask;
                                                View viewA2 = l3.d.a(view, R.id.v_game_logo_mask);
                                                if (viewA2 != null) {
                                                    i10 = R.id.vg_game_logo;
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.vg_game_logo);
                                                    if (constraintLayout != null) {
                                                        return new ja0((RelativeLayout) view, imageView, imageView2, qMUIRadiusImageView, imageView3, viewA, textView, textView2, textView3, expressionTextView, textView4, viewA2, constraintLayout);
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
    public static ja0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21144, new Class[]{LayoutInflater.class}, ja0.class);
        return patchProxyResultProxy.isSupported ? (ja0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ja0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21145, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ja0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ja0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_screenshot_share, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f112104a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21147, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
