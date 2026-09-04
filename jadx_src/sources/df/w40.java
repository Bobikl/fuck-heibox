package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionSmallView;
import com.max.xiaoheihe.view.richtext.RichStackModelView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutFeedsConfigTopView1Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w40 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f117025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RichStackModelView f117026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSUserSectionSmallView f117027c;

    private w40(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RichStackModelView richStackModelView, @androidx.annotation.n0 BBSUserSectionSmallView bBSUserSectionSmallView) {
        this.f117025a = linearLayout;
        this.f117026b = richStackModelView;
        this.f117027c = bBSUserSectionSmallView;
    }

    @androidx.annotation.n0
    public static w40 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20576, new Class[]{View.class}, w40.class);
        if (patchProxyResultProxy.isSupported) {
            return (w40) patchProxyResultProxy.result;
        }
        int i10 = R.id.rich_text_top;
        RichStackModelView richStackModelView = (RichStackModelView) l3.d.a(view, R.id.rich_text_top);
        if (richStackModelView != null) {
            i10 = R.id.vg_user;
            BBSUserSectionSmallView bBSUserSectionSmallView = (BBSUserSectionSmallView) l3.d.a(view, R.id.vg_user);
            if (bBSUserSectionSmallView != null) {
                return new w40((LinearLayout) view, richStackModelView, bBSUserSectionSmallView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static w40 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20574, new Class[]{LayoutInflater.class}, w40.class);
        return patchProxyResultProxy.isSupported ? (w40) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static w40 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20575, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, w40.class);
        if (patchProxyResultProxy.isSupported) {
            return (w40) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_feeds_config_top_view_1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f117025a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20577, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
