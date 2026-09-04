package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutStoryTextContentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class fb0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final View f110511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f110512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f110513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f110514d;

    private fb0(@androidx.annotation.n0 View view, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView, @androidx.annotation.n0 ExpressionTextView expressionTextView2) {
        this.f110511a = view;
        this.f110512b = expressionTextView;
        this.f110513c = hBLineHeightTextView;
        this.f110514d = expressionTextView2;
    }

    @androidx.annotation.n0
    public static fb0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21230, new Class[]{View.class}, fb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (fb0) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_desc;
        ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_desc);
        if (expressionTextView != null) {
            i10 = R.id.tv_expend;
            HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) l3.d.a(view, R.id.tv_expend);
            if (hBLineHeightTextView != null) {
                i10 = R.id.tv_title;
                ExpressionTextView expressionTextView2 = (ExpressionTextView) l3.d.a(view, R.id.tv_title);
                if (expressionTextView2 != null) {
                    return new fb0(view, expressionTextView, hBLineHeightTextView, expressionTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static fb0 b(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.n0 ViewGroup viewGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup}, null, changeQuickRedirect, true, 21229, new Class[]{LayoutInflater.class, ViewGroup.class}, fb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (fb0) patchProxyResultProxy.result;
        }
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.layout_story_text_content, viewGroup);
        return a(viewGroup);
    }

    @Override // l3.c
    @androidx.annotation.n0
    public View getRoot() {
        return this.f110511a;
    }
}
