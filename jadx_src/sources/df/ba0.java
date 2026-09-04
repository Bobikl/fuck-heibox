package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.max.hbcommon.component.HeyBoxTabLayout;
import com.max.hbcustomview.SwitchButton.SwitchButton;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutRollRoomTabHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ba0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f108885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SwitchButton f108887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxTabLayout f108888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108889e;

    private ba0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 SwitchButton switchButton, @androidx.annotation.n0 HeyBoxTabLayout heyBoxTabLayout, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f108885a = relativeLayout;
        this.f108886b = relativeLayout2;
        this.f108887c = switchButton;
        this.f108888d = heyBoxTabLayout;
        this.f108889e = linearLayout;
    }

    @androidx.annotation.n0
    public static ba0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21114, new Class[]{View.class}, ba0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ba0) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv_filter;
        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rv_filter);
        if (relativeLayout != null) {
            i10 = R.id.sb_privacy;
            SwitchButton switchButton = (SwitchButton) l3.d.a(view, R.id.sb_privacy);
            if (switchButton != null) {
                i10 = R.id.tl_sort_type;
                HeyBoxTabLayout heyBoxTabLayout = (HeyBoxTabLayout) l3.d.a(view, R.id.tl_sort_type);
                if (heyBoxTabLayout != null) {
                    i10 = R.id.vg_filter;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_filter);
                    if (linearLayout != null) {
                        return new ba0((RelativeLayout) view, relativeLayout, switchButton, heyBoxTabLayout, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ba0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21112, new Class[]{LayoutInflater.class}, ba0.class);
        return patchProxyResultProxy.isSupported ? (ba0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ba0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21113, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ba0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ba0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_roll_room_tab_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f108885a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21115, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
