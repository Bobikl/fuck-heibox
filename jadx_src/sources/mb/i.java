package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.max.hbcommon.R;
import com.max.hbcommon.component.ezcalendarview.DayPickerViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DayPickerContentMaterialBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class i implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f131565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final DayPickerViewPager f131566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageButton f131567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageButton f131568d;

    private i(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 DayPickerViewPager dayPickerViewPager, @androidx.annotation.n0 ImageButton imageButton, @androidx.annotation.n0 ImageButton imageButton2) {
        this.f131565a = frameLayout;
        this.f131566b = dayPickerViewPager;
        this.f131567c = imageButton;
        this.f131568d = imageButton2;
    }

    @androidx.annotation.n0
    public static i a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.f31750d6, new Class[]{View.class}, i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        int i10 = R.id.day_picker_view_pager;
        DayPickerViewPager dayPickerViewPager = (DayPickerViewPager) l3.d.a(view, i10);
        if (dayPickerViewPager != null) {
            i10 = R.id.next;
            ImageButton imageButton = (ImageButton) l3.d.a(view, i10);
            if (imageButton != null) {
                i10 = R.id.prev;
                ImageButton imageButton2 = (ImageButton) l3.d.a(view, i10);
                if (imageButton2 != null) {
                    return new i((FrameLayout) view, dayPickerViewPager, imageButton, imageButton2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static i c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.f31716b6, new Class[]{LayoutInflater.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static i d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.f31733c6, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.day_picker_content_material, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f131565a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31767e6, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
