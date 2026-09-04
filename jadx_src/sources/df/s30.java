package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionEditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutDanmakuInputBarBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class s30 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionEditText f115433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f115437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115439h;

    private s30(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ExpressionEditText expressionEditText, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 View view, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f115432a = relativeLayout;
        this.f115433b = expressionEditText;
        this.f115434c = imageView;
        this.f115435d = textView;
        this.f115436e = view;
        this.f115437f = frameLayout;
        this.f115438g = relativeLayout2;
        this.f115439h = linearLayout;
    }

    @androidx.annotation.n0
    public static s30 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20458, new Class[]{View.class}, s30.class);
        if (patchProxyResultProxy.isSupported) {
            return (s30) patchProxyResultProxy.result;
        }
        int i10 = R.id.danmaku_editor;
        ExpressionEditText expressionEditText = (ExpressionEditText) l3.d.a(view, R.id.danmaku_editor);
        if (expressionEditText != null) {
            i10 = R.id.iv_emoji;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_emoji);
            if (imageView != null) {
                i10 = R.id.tv_send;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_send);
                if (textView != null) {
                    i10 = R.id.v_blank;
                    View viewA = l3.d.a(view, R.id.v_blank);
                    if (viewA != null) {
                        i10 = R.id.vg_emoji;
                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_emoji);
                        if (frameLayout != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) view;
                            i10 = R.id.vg_input_bar_content;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_input_bar_content);
                            if (linearLayout != null) {
                                return new s30(relativeLayout, expressionEditText, imageView, textView, viewA, frameLayout, relativeLayout, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static s30 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20456, new Class[]{LayoutInflater.class}, s30.class);
        return patchProxyResultProxy.isSupported ? (s30) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static s30 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20457, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, s30.class);
        if (patchProxyResultProxy.isSupported) {
            return (s30) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_danmaku_input_bar, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115432a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20459, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
