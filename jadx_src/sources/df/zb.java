package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentWebNoticeBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zb implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f118296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118298c;

    private zb(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f118296a = constraintLayout;
        this.f118297b = textView;
        this.f118298c = textView2;
    }

    @androidx.annotation.n0
    public static zb a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17588, new Class[]{View.class}, zb.class);
        if (patchProxyResultProxy.isSupported) {
            return (zb) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_action;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_action);
        if (textView != null) {
            i10 = R.id.tv_desc;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc);
            if (textView2 != null) {
                return new zb((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static zb c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17586, new Class[]{LayoutInflater.class}, zb.class);
        return patchProxyResultProxy.isSupported ? (zb) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static zb d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17587, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, zb.class);
        if (patchProxyResultProxy.isSupported) {
            return (zb) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_web_notice, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f118296a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17589, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
