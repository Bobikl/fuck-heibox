package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionEditText;
import com.max.xiaoheihe.view.richtext.RichStackModelView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityRichTextTestBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class v1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final NestedScrollView f116565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionEditText f116566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RichStackModelView f116569e;

    private v1(@androidx.annotation.n0 NestedScrollView nestedScrollView, @androidx.annotation.n0 ExpressionEditText expressionEditText, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 RichStackModelView richStackModelView) {
        this.f116565a = nestedScrollView;
        this.f116566b = expressionEditText;
        this.f116567c = textView;
        this.f116568d = textView2;
        this.f116569e = richStackModelView;
    }

    @androidx.annotation.n0
    public static v1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16532, new Class[]{View.class}, v1.class);
        if (patchProxyResultProxy.isSupported) {
            return (v1) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_json;
        ExpressionEditText expressionEditText = (ExpressionEditText) l3.d.a(view, R.id.et_json);
        if (expressionEditText != null) {
            i10 = R.id.tv_clear;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_clear);
            if (textView != null) {
                i10 = R.id.tv_create;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_create);
                if (textView2 != null) {
                    i10 = R.id.v_rich_stack;
                    RichStackModelView richStackModelView = (RichStackModelView) l3.d.a(view, R.id.v_rich_stack);
                    if (richStackModelView != null) {
                        return new v1((NestedScrollView) view, expressionEditText, textView, textView2, richStackModelView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static v1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16530, new Class[]{LayoutInflater.class}, v1.class);
        return patchProxyResultProxy.isSupported ? (v1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static v1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16531, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, v1.class);
        if (patchProxyResultProxy.isSupported) {
            return (v1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_rich_text_test, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public NestedScrollView b() {
        return this.f116565a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16533, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
