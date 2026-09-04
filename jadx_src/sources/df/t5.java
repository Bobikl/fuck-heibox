package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogItemDescTagBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class t5 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f115848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f115852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.f f115854h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.f f115855i;

    private t5(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 mb.f fVar, @androidx.annotation.n0 mb.f fVar2) {
        this.f115847a = relativeLayout;
        this.f115848b = bottomButtonLeftItemView;
        this.f115849c = imageView;
        this.f115850d = recyclerView;
        this.f115851e = recyclerView2;
        this.f115852f = frameLayout;
        this.f115853g = linearLayout;
        this.f115854h = fVar;
        this.f115855i = fVar2;
    }

    @androidx.annotation.n0
    public static t5 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16940, new Class[]{View.class}, t5.class);
        if (patchProxyResultProxy.isSupported) {
            return (t5) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_button;
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.bottom_button);
        if (bottomButtonLeftItemView != null) {
            i10 = R.id.iv_close;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_close);
            if (imageView != null) {
                i10 = R.id.rv_1;
                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_1);
                if (recyclerView != null) {
                    i10 = R.id.rv_2;
                    RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_2);
                    if (recyclerView2 != null) {
                        i10 = R.id.vg_bg;
                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_bg);
                        if (frameLayout != null) {
                            i10 = R.id.vg_bottom_bar;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_bottom_bar);
                            if (linearLayout != null) {
                                i10 = R.id.vg_title_1;
                                View viewA = l3.d.a(view, R.id.vg_title_1);
                                if (viewA != null) {
                                    mb.f fVarA = mb.f.a(viewA);
                                    i10 = R.id.vg_title_2;
                                    View viewA2 = l3.d.a(view, R.id.vg_title_2);
                                    if (viewA2 != null) {
                                        return new t5((RelativeLayout) view, bottomButtonLeftItemView, imageView, recyclerView, recyclerView2, frameLayout, linearLayout, fVarA, mb.f.a(viewA2));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static t5 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16938, new Class[]{LayoutInflater.class}, t5.class);
        return patchProxyResultProxy.isSupported ? (t5) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static t5 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16939, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, t5.class);
        if (patchProxyResultProxy.isSupported) {
            return (t5) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_item_desc_tag, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115847a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16941, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
