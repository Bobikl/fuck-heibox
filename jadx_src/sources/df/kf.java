package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemCommentsMsgBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kf implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f112596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxAvatarView f112597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f112598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f112600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f112601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f112603h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112604i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f112605j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112606k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112607l;

    private kf(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 HeyBoxAvatarView heyBoxAvatarView, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 ExpressionTextView expressionTextView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 ExpressionTextView expressionTextView3, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 ExpressionTextView expressionTextView4, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3) {
        this.f112596a = relativeLayout;
        this.f112597b = heyBoxAvatarView;
        this.f112598c = oVar;
        this.f112599d = imageView;
        this.f112600e = expressionTextView;
        this.f112601f = expressionTextView2;
        this.f112602g = textView;
        this.f112603h = expressionTextView3;
        this.f112604i = textView2;
        this.f112605j = expressionTextView4;
        this.f112606k = relativeLayout2;
        this.f112607l = relativeLayout3;
    }

    @androidx.annotation.n0
    public static kf a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17944, new Class[]{View.class}, kf.class);
        if (patchProxyResultProxy.isSupported) {
            return (kf) patchProxyResultProxy.result;
        }
        int i10 = R.id.avatar;
        HeyBoxAvatarView heyBoxAvatarView = (HeyBoxAvatarView) l3.d.a(view, R.id.avatar);
        if (heyBoxAvatarView != null) {
            i10 = R.id.divider;
            View viewA = l3.d.a(view, R.id.divider);
            if (viewA != null) {
                mb.o oVarA = mb.o.a(viewA);
                i10 = R.id.iv_img;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
                if (imageView != null) {
                    i10 = R.id.tv_link_owner;
                    ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_link_owner);
                    if (expressionTextView != null) {
                        i10 = R.id.tv_link_title;
                        ExpressionTextView expressionTextView2 = (ExpressionTextView) l3.d.a(view, R.id.tv_link_title);
                        if (expressionTextView2 != null) {
                            i10 = R.id.tv_name;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
                            if (textView != null) {
                                i10 = R.id.tv_text;
                                ExpressionTextView expressionTextView3 = (ExpressionTextView) l3.d.a(view, R.id.tv_text);
                                if (expressionTextView3 != null) {
                                    i10 = R.id.tv_time;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_time);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_user_comments;
                                        ExpressionTextView expressionTextView4 = (ExpressionTextView) l3.d.a(view, R.id.tv_user_comments);
                                        if (expressionTextView4 != null) {
                                            i10 = R.id.vg_link;
                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_link);
                                            if (relativeLayout != null) {
                                                i10 = R.id.vg_source;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_source);
                                                if (relativeLayout2 != null) {
                                                    return new kf((RelativeLayout) view, heyBoxAvatarView, oVarA, imageView, expressionTextView, expressionTextView2, textView, expressionTextView3, textView2, expressionTextView4, relativeLayout, relativeLayout2);
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
    public static kf c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17942, new Class[]{LayoutInflater.class}, kf.class);
        return patchProxyResultProxy.isSupported ? (kf) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static kf d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17943, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, kf.class);
        if (patchProxyResultProxy.isSupported) {
            return (kf) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_comments_msg, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f112596a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17945, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
