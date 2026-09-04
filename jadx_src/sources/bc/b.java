package bc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.n0;
import androidx.viewpager2.widget.ViewPager2;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HbcustomviewBvpLayoutBinding.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final View f35196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final RelativeLayout f35197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ViewPager2 f35198c;

    private b(@n0 View view, @n0 RelativeLayout relativeLayout, @n0 ViewPager2 viewPager2) {
        this.f35196a = view;
        this.f35197b = relativeLayout;
        this.f35198c = viewPager2;
    }

    @n0
    public static b a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.f.Ci, new Class[]{View.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        int i10 = R.id.bvp_layout_indicator;
        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, i10);
        if (relativeLayout != null) {
            i10 = R.id.vp_main;
            ViewPager2 viewPager2 = (ViewPager2) l3.d.a(view, i10);
            if (viewPager2 != null) {
                return new b(view, relativeLayout, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static b b(@n0 LayoutInflater layoutInflater, @n0 ViewGroup viewGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup}, null, changeQuickRedirect, true, bb.c.f.Bi, new Class[]{LayoutInflater.class, ViewGroup.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.hbcustomview_bvp_layout, viewGroup);
        return a(viewGroup);
    }

    @Override // l3.c
    @n0
    public View getRoot() {
        return this.f35196a;
    }
}
