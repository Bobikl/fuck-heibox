package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.view.SubCommentView;
import com.max.xiaoheihe.view.UpdatePointViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: TableRowBbsCommentV3Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ld0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f113009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f113010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final SubCommentView f113014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f113016h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113017i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113018j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final UpdatePointViewGroup f113019k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSUserSectionView f113020l;

    private ld0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 SubCommentView subCommentView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 UpdatePointViewGroup updatePointViewGroup, @androidx.annotation.n0 BBSUserSectionView bBSUserSectionView) {
        this.f113009a = linearLayout;
        this.f113010b = oVar;
        this.f113011c = linearLayout2;
        this.f113012d = linearLayout3;
        this.f113013e = relativeLayout;
        this.f113014f = subCommentView;
        this.f113015g = textView;
        this.f113016h = expressionTextView;
        this.f113017i = relativeLayout2;
        this.f113018j = relativeLayout3;
        this.f113019k = updatePointViewGroup;
        this.f113020l = bBSUserSectionView;
    }

    @androidx.annotation.n0
    public static ld0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21460, new Class[]{View.class}, ld0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ld0) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            mb.o oVarA = mb.o.a(viewA);
            i10 = R.id.ll_pic;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_pic);
            if (linearLayout != null) {
                LinearLayout linearLayout2 = (LinearLayout) view;
                i10 = R.id.rl_comment;
                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_comment);
                if (relativeLayout != null) {
                    i10 = R.id.rv_sub_comments;
                    SubCommentView subCommentView = (SubCommentView) l3.d.a(view, R.id.rv_sub_comments);
                    if (subCommentView != null) {
                        i10 = R.id.tv_author_award;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_author_award);
                        if (textView != null) {
                            i10 = R.id.tv_comment;
                            ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_comment);
                            if (expressionTextView != null) {
                                i10 = R.id.vg_comments_detail;
                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_comments_detail);
                                if (relativeLayout2 != null) {
                                    i10 = R.id.vg_lab_top;
                                    RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_lab_top);
                                    if (relativeLayout3 != null) {
                                        i10 = R.id.vg_main_comment;
                                        UpdatePointViewGroup updatePointViewGroup = (UpdatePointViewGroup) l3.d.a(view, R.id.vg_main_comment);
                                        if (updatePointViewGroup != null) {
                                            i10 = R.id.vg_title;
                                            BBSUserSectionView bBSUserSectionView = (BBSUserSectionView) l3.d.a(view, R.id.vg_title);
                                            if (bBSUserSectionView != null) {
                                                return new ld0(linearLayout2, oVarA, linearLayout, linearLayout2, relativeLayout, subCommentView, textView, expressionTextView, relativeLayout2, relativeLayout3, updatePointViewGroup, bBSUserSectionView);
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
    public static ld0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21458, new Class[]{LayoutInflater.class}, ld0.class);
        return patchProxyResultProxy.isSupported ? (ld0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ld0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21459, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ld0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ld0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.table_row_bbs_comment_v3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f113009a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21461, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
