package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewKdaBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gg0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f110983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110988f;

    private gg0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5) {
        this.f110983a = linearLayout;
        this.f110984b = textView;
        this.f110985c = textView2;
        this.f110986d = textView3;
        this.f110987e = textView4;
        this.f110988f = textView5;
    }

    @androidx.annotation.n0
    public static gg0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21748, new Class[]{View.class}, gg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (gg0) patchProxyResultProxy.result;
        }
        int i10 = R.id.div_1;
        TextView textView = (TextView) l3.d.a(view, R.id.div_1);
        if (textView != null) {
            i10 = R.id.div_2;
            TextView textView2 = (TextView) l3.d.a(view, R.id.div_2);
            if (textView2 != null) {
                i10 = R.id.tv_assist;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_assist);
                if (textView3 != null) {
                    i10 = R.id.tv_death;
                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_death);
                    if (textView4 != null) {
                        i10 = R.id.tv_kill;
                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_kill);
                        if (textView5 != null) {
                            return new gg0((LinearLayout) view, textView, textView2, textView3, textView4, textView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static gg0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21746, new Class[]{LayoutInflater.class}, gg0.class);
        return patchProxyResultProxy.isSupported ? (gg0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static gg0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21747, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, gg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (gg0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_kda, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f110983a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21749, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
