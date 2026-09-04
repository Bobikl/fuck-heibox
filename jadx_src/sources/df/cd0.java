package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: MenuDanmakuReportBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cd0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f109341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f109343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f109345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f109346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f109347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109349j;

    private cd0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 View view2, @androidx.annotation.n0 View view3, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f109340a = linearLayout;
        this.f109341b = view;
        this.f109342c = imageView;
        this.f109343d = recyclerView;
        this.f109344e = textView;
        this.f109345f = expressionTextView;
        this.f109346g = view2;
        this.f109347h = view3;
        this.f109348i = linearLayout2;
        this.f109349j = relativeLayout;
    }

    @androidx.annotation.n0
    public static cd0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21425, new Class[]{View.class}, cd0.class);
        if (patchProxyResultProxy.isSupported) {
            return (cd0) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            i10 = R.id.iv_close;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_close);
            if (imageView != null) {
                i10 = R.id.rv_content;
                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_content);
                if (recyclerView != null) {
                    i10 = R.id.tv_cancel;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_cancel);
                    if (textView != null) {
                        i10 = R.id.tv_danmaku_content;
                        ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_danmaku_content);
                        if (expressionTextView != null) {
                            i10 = R.id.v_margin;
                            View viewA2 = l3.d.a(view, R.id.v_margin);
                            if (viewA2 != null) {
                                i10 = R.id.v_shadow;
                                View viewA3 = l3.d.a(view, R.id.v_shadow);
                                if (viewA3 != null) {
                                    i10 = R.id.vg_content;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_content);
                                    if (linearLayout != null) {
                                        i10 = R.id.vg_menu_header;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_menu_header);
                                        if (relativeLayout != null) {
                                            return new cd0((LinearLayout) view, viewA, imageView, recyclerView, textView, expressionTextView, viewA2, viewA3, linearLayout, relativeLayout);
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
    public static cd0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21423, new Class[]{LayoutInflater.class}, cd0.class);
        return patchProxyResultProxy.isSupported ? (cd0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static cd0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21424, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, cd0.class);
        if (patchProxyResultProxy.isSupported) {
            return (cd0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.menu_danmaku_report, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109340a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21426, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
