package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.likecomment.BBSLinkListLikeComment;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: TableRowSubCommentV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class qd0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSLinkListLikeComment f114862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxAvatarView f114864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f114867g;

    private qd0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 BBSLinkListLikeComment bBSLinkListLikeComment, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 HeyBoxAvatarView heyBoxAvatarView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 ExpressionTextView expressionTextView) {
        this.f114861a = relativeLayout;
        this.f114862b = bBSLinkListLikeComment;
        this.f114863c = linearLayout;
        this.f114864d = heyBoxAvatarView;
        this.f114865e = textView;
        this.f114866f = textView2;
        this.f114867g = expressionTextView;
    }

    @androidx.annotation.n0
    public static qd0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21480, new Class[]{View.class}, qd0.class);
        if (patchProxyResultProxy.isSupported) {
            return (qd0) patchProxyResultProxy.result;
        }
        int i10 = R.id.bbs_link_list_like_comment;
        BBSLinkListLikeComment bBSLinkListLikeComment = (BBSLinkListLikeComment) l3.d.a(view, R.id.bbs_link_list_like_comment);
        if (bBSLinkListLikeComment != null) {
            i10 = R.id.ll_sub_comment_title;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_sub_comment_title);
            if (linearLayout != null) {
                i10 = R.id.sub_comment_avatar;
                HeyBoxAvatarView heyBoxAvatarView = (HeyBoxAvatarView) l3.d.a(view, R.id.sub_comment_avatar);
                if (heyBoxAvatarView != null) {
                    i10 = R.id.tv_name;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
                    if (textView != null) {
                        i10 = R.id.tv_reply_to;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_reply_to);
                        if (textView2 != null) {
                            i10 = R.id.tv_sub_comment_content;
                            ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_sub_comment_content);
                            if (expressionTextView != null) {
                                return new qd0((RelativeLayout) view, bBSLinkListLikeComment, linearLayout, heyBoxAvatarView, textView, textView2, expressionTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static qd0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21478, new Class[]{LayoutInflater.class}, qd0.class);
        return patchProxyResultProxy.isSupported ? (qd0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static qd0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21479, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, qd0.class);
        if (patchProxyResultProxy.isSupported) {
            return (qd0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.table_row_sub_comment_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114861a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21481, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
