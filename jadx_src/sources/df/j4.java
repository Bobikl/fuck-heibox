package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogActivityLoginBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j4 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f112004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final Button f112008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final Button f112009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112010g;

    private j4(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 Button button, @androidx.annotation.n0 Button button2, @androidx.annotation.n0 TextView textView2) {
        this.f112004a = frameLayout;
        this.f112005b = textView;
        this.f112006c = view;
        this.f112007d = linearLayout;
        this.f112008e = button;
        this.f112009f = button2;
        this.f112010g = textView2;
    }

    @androidx.annotation.n0
    public static j4 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16796, new Class[]{View.class}, j4.class);
        if (patchProxyResultProxy.isSupported) {
            return (j4) patchProxyResultProxy.result;
        }
        int i10 = R.id.content;
        TextView textView = (TextView) l3.d.a(view, R.id.content);
        if (textView != null) {
            i10 = R.id.line_v;
            View viewA = l3.d.a(view, R.id.line_v);
            if (viewA != null) {
                i10 = R.id.ll_content;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_content);
                if (linearLayout != null) {
                    i10 = R.id.negativeButton;
                    Button button = (Button) l3.d.a(view, R.id.negativeButton);
                    if (button != null) {
                        i10 = R.id.positiveButton;
                        Button button2 = (Button) l3.d.a(view, R.id.positiveButton);
                        if (button2 != null) {
                            i10 = R.id.title;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.title);
                            if (textView2 != null) {
                                return new j4((FrameLayout) view, textView, viewA, linearLayout, button, button2, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static j4 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16794, new Class[]{LayoutInflater.class}, j4.class);
        return patchProxyResultProxy.isSupported ? (j4) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static j4 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16795, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, j4.class);
        if (patchProxyResultProxy.isSupported) {
            return (j4) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_activity_login, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f112004a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16797, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
