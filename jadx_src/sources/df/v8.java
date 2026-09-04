package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentForbidReasonBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class v8 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f116708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f116709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116711e;

    private v8(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f116707a = relativeLayout;
        this.f116708b = progressBar;
        this.f116709c = recyclerView;
        this.f116710d = textView;
        this.f116711e = linearLayout;
    }

    @androidx.annotation.n0
    public static v8 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17260, new Class[]{View.class}, v8.class);
        if (patchProxyResultProxy.isSupported) {
            return (v8) patchProxyResultProxy.result;
        }
        int i10 = R.id.progress;
        ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.progress);
        if (progressBar != null) {
            i10 = R.id.rv_reason;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_reason);
            if (recyclerView != null) {
                i10 = R.id.tv_please_choose_reason;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_please_choose_reason);
                if (textView != null) {
                    i10 = R.id.vg_content;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_content);
                    if (linearLayout != null) {
                        return new v8((RelativeLayout) view, progressBar, recyclerView, textView, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static v8 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17258, new Class[]{LayoutInflater.class}, v8.class);
        return patchProxyResultProxy.isSupported ? (v8) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static v8 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17259, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, v8.class);
        if (patchProxyResultProxy.isSupported) {
            return (v8) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_forbid_reason, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116707a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17261, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
