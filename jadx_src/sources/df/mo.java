package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemHeyboxVoiceIpBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class mo implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f113499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f113501c;

    private mo(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 FrameLayout frameLayout2) {
        this.f113499a = frameLayout;
        this.f113500b = textView;
        this.f113501c = frameLayout2;
    }

    @androidx.annotation.n0
    public static mo a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18884, new Class[]{View.class}, mo.class);
        if (patchProxyResultProxy.isSupported) {
            return (mo) patchProxyResultProxy.result;
        }
        TextView textView = (TextView) l3.d.a(view, R.id.content);
        if (textView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.content)));
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new mo(frameLayout, textView, frameLayout);
    }

    @androidx.annotation.n0
    public static mo c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18882, new Class[]{LayoutInflater.class}, mo.class);
        return patchProxyResultProxy.isSupported ? (mo) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static mo d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18883, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, mo.class);
        if (patchProxyResultProxy.isSupported) {
            return (mo) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_heybox_voice_ip, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f113499a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18885, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
