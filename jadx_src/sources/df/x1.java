package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.max.hbcommon.component.bottombutton.base.BaseBottomButton;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.view.uikit.HBUiKitView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivitySetApiKeyV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class x1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final NestedScrollView f117339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final BaseBottomButton f117341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f117342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f117343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBUiKitView f117345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f117346h;

    private x1(@androidx.annotation.n0 NestedScrollView nestedScrollView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 BaseBottomButton baseBottomButton, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 HBUiKitView hBUiKitView, @androidx.annotation.n0 ConstraintLayout constraintLayout) {
        this.f117339a = nestedScrollView;
        this.f117340b = textView;
        this.f117341c = baseBottomButton;
        this.f117342d = editText;
        this.f117343e = hBLineHeightTextView;
        this.f117344f = textView2;
        this.f117345g = hBUiKitView;
        this.f117346h = constraintLayout;
    }

    @androidx.annotation.n0
    public static x1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16540, new Class[]{View.class}, x1.class);
        if (patchProxyResultProxy.isSupported) {
            return (x1) patchProxyResultProxy.result;
        }
        int i10 = R.id.button_auto_get;
        TextView textView = (TextView) l3.d.a(view, R.id.button_auto_get);
        if (textView != null) {
            i10 = R.id.button_save;
            BaseBottomButton baseBottomButton = (BaseBottomButton) l3.d.a(view, R.id.button_save);
            if (baseBottomButton != null) {
                i10 = R.id.et_api_key;
                EditText editText = (EditText) l3.d.a(view, R.id.et_api_key);
                if (editText != null) {
                    i10 = R.id.tv_desc;
                    HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) l3.d.a(view, R.id.tv_desc);
                    if (hBLineHeightTextView != null) {
                        i10 = R.id.tv_title;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_title);
                        if (textView2 != null) {
                            i10 = R.id.v_ui_kit;
                            HBUiKitView hBUiKitView = (HBUiKitView) l3.d.a(view, R.id.v_ui_kit);
                            if (hBUiKitView != null) {
                                i10 = R.id.vg_input;
                                ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.vg_input);
                                if (constraintLayout != null) {
                                    return new x1((NestedScrollView) view, textView, baseBottomButton, editText, hBLineHeightTextView, textView2, hBUiKitView, constraintLayout);
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
    public static x1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16538, new Class[]{LayoutInflater.class}, x1.class);
        return patchProxyResultProxy.isSupported ? (x1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static x1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16539, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, x1.class);
        if (patchProxyResultProxy.isSupported) {
            return (x1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_set_api_key_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public NestedScrollView b() {
        return this.f117339a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16541, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
