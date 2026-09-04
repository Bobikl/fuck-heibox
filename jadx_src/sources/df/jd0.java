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

/* JADX INFO: compiled from: TableRowBbsCommentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class jd0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f112146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f112147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final SubCommentView f112151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f112153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112154i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112155j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final UpdatePointViewGroup f112156k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSUserSectionView f112157l;

    private jd0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 SubCommentView subCommentView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 UpdatePointViewGroup updatePointViewGroup, @androidx.annotation.n0 BBSUserSectionView bBSUserSectionView) {
        this.f112146a = linearLayout;
        this.f112147b = oVar;
        this.f112148c = linearLayout2;
        this.f112149d = linearLayout3;
        this.f112150e = relativeLayout;
        this.f112151f = subCommentView;
        this.f112152g = textView;
        this.f112153h = expressionTextView;
        this.f112154i = relativeLayout2;
        this.f112155j = relativeLayout3;
        this.f112156k = updatePointViewGroup;
        this.f112157l = bBSUserSectionView;
    }

    @androidx.annotation.n0
    public static jd0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21452, new Class[]{View.class}, jd0.class);
        if (patchProxyResultProxy.isSupported) {
            return (jd0) patchProxyResultProxy.result;
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
                                                return new jd0(linearLayout2, oVarA, linearLayout, linearLayout2, relativeLayout, subCommentView, textView, expressionTextView, relativeLayout2, relativeLayout3, updatePointViewGroup, bBSUserSectionView);
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
    public static jd0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21450, new Class[]{LayoutInflater.class}, jd0.class);
        return patchProxyResultProxy.isSupported ? (jd0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static jd0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21451, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, jd0.class);
        if (patchProxyResultProxy.isSupported) {
            return (jd0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.table_row_bbs_comment, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f112146a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21453, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
