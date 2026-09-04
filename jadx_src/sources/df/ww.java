package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.view.richtext.RichViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemRichTextViewBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ww implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RichViewGroup f117270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RichViewGroup f117271b;

    private ww(@androidx.annotation.n0 RichViewGroup richViewGroup, @androidx.annotation.n0 RichViewGroup richViewGroup2) {
        this.f117270a = richViewGroup;
        this.f117271b = richViewGroup2;
    }

    @androidx.annotation.n0
    public static ww a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19752, new Class[]{View.class}, ww.class);
        if (patchProxyResultProxy.isSupported) {
            return (ww) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RichViewGroup richViewGroup = (RichViewGroup) view;
        return new ww(richViewGroup, richViewGroup);
    }

    @androidx.annotation.n0
    public static ww c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19750, new Class[]{LayoutInflater.class}, ww.class);
        return patchProxyResultProxy.isSupported ? (ww) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ww d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19751, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ww.class);
        if (patchProxyResultProxy.isSupported) {
            return (ww) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_rich_text_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RichViewGroup b() {
        return this.f117270a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19753, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
