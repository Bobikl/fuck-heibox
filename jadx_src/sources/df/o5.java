package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogGameLibraryFilterBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o5 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f114095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f114096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f114097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ScrollView f114099e;

    private o5(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ScrollView scrollView) {
        this.f114095a = constraintLayout;
        this.f114096b = frameLayout;
        this.f114097c = bottomButtonLeftItemView;
        this.f114098d = linearLayout;
        this.f114099e = scrollView;
    }

    @androidx.annotation.n0
    public static o5 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16920, new Class[]{View.class}, o5.class);
        if (patchProxyResultProxy.isSupported) {
            return (o5) patchProxyResultProxy.result;
        }
        int i10 = R.id.v_blank;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.v_blank);
        if (frameLayout != null) {
            i10 = R.id.vg_bottom_buttons;
            BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.vg_bottom_buttons);
            if (bottomButtonLeftItemView != null) {
                i10 = R.id.vg_container;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_container);
                if (linearLayout != null) {
                    i10 = R.id.vg_scroll;
                    ScrollView scrollView = (ScrollView) l3.d.a(view, R.id.vg_scroll);
                    if (scrollView != null) {
                        return new o5((ConstraintLayout) view, frameLayout, bottomButtonLeftItemView, linearLayout, scrollView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static o5 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16918, new Class[]{LayoutInflater.class}, o5.class);
        return patchProxyResultProxy.isSupported ? (o5) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static o5 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16919, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, o5.class);
        if (patchProxyResultProxy.isSupported) {
            return (o5) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_game_library_filter, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f114095a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16921, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
