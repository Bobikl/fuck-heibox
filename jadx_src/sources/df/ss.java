package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemPlatformRbBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ss implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RadioButton f115688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f115689b;

    private ss(@androidx.annotation.n0 RadioButton radioButton, @androidx.annotation.n0 RadioButton radioButton2) {
        this.f115688a = radioButton;
        this.f115689b = radioButton2;
    }

    @androidx.annotation.n0
    public static ss a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19324, new Class[]{View.class}, ss.class);
        if (patchProxyResultProxy.isSupported) {
            return (ss) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RadioButton radioButton = (RadioButton) view;
        return new ss(radioButton, radioButton);
    }

    @androidx.annotation.n0
    public static ss c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19322, new Class[]{LayoutInflater.class}, ss.class);
        return patchProxyResultProxy.isSupported ? (ss) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ss d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19323, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ss.class);
        if (patchProxyResultProxy.isSupported) {
            return (ss) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_platform_rb, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RadioButton b() {
        return this.f115688a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19325, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
