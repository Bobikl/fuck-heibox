package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexboxLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogChangeTopicTagBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r4 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FlexboxLayout f115076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FlexboxLayout f115077b;

    private r4(@androidx.annotation.n0 FlexboxLayout flexboxLayout, @androidx.annotation.n0 FlexboxLayout flexboxLayout2) {
        this.f115076a = flexboxLayout;
        this.f115077b = flexboxLayout2;
    }

    @androidx.annotation.n0
    public static r4 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16828, new Class[]{View.class}, r4.class);
        if (patchProxyResultProxy.isSupported) {
            return (r4) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FlexboxLayout flexboxLayout = (FlexboxLayout) view;
        return new r4(flexboxLayout, flexboxLayout);
    }

    @androidx.annotation.n0
    public static r4 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16826, new Class[]{LayoutInflater.class}, r4.class);
        return patchProxyResultProxy.isSupported ? (r4) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static r4 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16827, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, r4.class);
        if (patchProxyResultProxy.isSupported) {
            return (r4) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_change_topic_tag, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FlexboxLayout b() {
        return this.f115076a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16829, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
