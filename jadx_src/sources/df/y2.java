package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionEditText;
import com.max.xiaoheihe.view.uikit.HBUiKitView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityUiKitTestBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y2 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final NestedScrollView f117715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionEditText f117716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBUiKitView f117721g;

    private y2(@androidx.annotation.n0 NestedScrollView nestedScrollView, @androidx.annotation.n0 ExpressionEditText expressionEditText, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 HBUiKitView hBUiKitView) {
        this.f117715a = nestedScrollView;
        this.f117716b = expressionEditText;
        this.f117717c = textView;
        this.f117718d = textView2;
        this.f117719e = textView3;
        this.f117720f = textView4;
        this.f117721g = hBUiKitView;
    }

    @androidx.annotation.n0
    public static y2 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16648, new Class[]{View.class}, y2.class);
        if (patchProxyResultProxy.isSupported) {
            return (y2) patchProxyResultProxy.result;
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
                    i10 = R.id.tv_replace;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_replace);
                    if (textView3 != null) {
                        i10 = R.id.tv_save_template;
                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_save_template);
                        if (textView4 != null) {
                            i10 = R.id.v_ui_kit;
                            HBUiKitView hBUiKitView = (HBUiKitView) l3.d.a(view, R.id.v_ui_kit);
                            if (hBUiKitView != null) {
                                return new y2((NestedScrollView) view, expressionEditText, textView, textView2, textView3, textView4, hBUiKitView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static y2 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16646, new Class[]{LayoutInflater.class}, y2.class);
        return patchProxyResultProxy.isSupported ? (y2) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static y2 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16647, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, y2.class);
        if (patchProxyResultProxy.isSupported) {
            return (y2) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_ui_kit_test, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public NestedScrollView b() {
        return this.f117715a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16649, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
