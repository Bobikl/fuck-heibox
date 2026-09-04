package com.max.hbcommon.component.triplebanner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.viewpager2.widget.ViewPager2;
import bb.c;
import com.max.hbcommon.R;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import xb.a;

/* JADX INFO: compiled from: TripleBannerViewPager.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class TripleBannerViewPager<T> extends BannerViewPager<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TripleBannerDecorationView f67961w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TripleBannerDecorationView f67962x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f67963y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f67964z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripleBannerViewPager(@d Context context) {
        super(context);
        f0.p(context, "context");
        this.f67963y = 0.5f;
        this.f67964z = -1;
        this.A = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripleBannerViewPager(@d Context context, @e AttributeSet attributeSet) {
        super(context, attributeSet);
        f0.p(context, "context");
        this.f67963y = 0.5f;
        this.f67964z = -1;
        this.A = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripleBannerViewPager(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f67963y = 0.5f;
        this.f67964z = -1;
        this.A = true;
    }

    public final void F0() {
        this.A = true;
        this.f67963y = 0.5f;
        this.f67964z = -1;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c5  */
    @Override // com.max.hbcustomview.bannerview.BannerViewPager
    public void H(int i10, float f10, int i11) {
        int i12;
        boolean z10 = true;
        Object[] objArr = {new Integer(i10), new Float(f10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.e.f32003s5, new Class[]{cls, Float.TYPE, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.H(i10, f10, i11);
        int iC = a.c(i10, this.f68997k.r());
        boolean z11 = i11 == 0;
        float f11 = this.f67963y;
        boolean z12 = !((f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1)) == 0) && f11 > 0.7f && f10 < 0.3f;
        boolean z13 = !((f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1)) == 0) && f11 < 0.3f && f10 > 0.7f;
        if ((f10 > 0.7f && z11) || z12) {
            f10 = 1.0f;
        } else if ((f10 < 0.3f && z11) || z13) {
            if (z13 && (iC = iC + 1) >= this.f68997k.r()) {
                iC %= this.f68997k.r();
            }
            f10 = 0.0f;
        }
        this.f67963y = f10;
        if (!this.A) {
            if (f10 == 0.0f) {
                i12 = this.f67964z;
                if (i12 == iC && i12 != -1) {
                    z10 = false;
                }
            } else {
                if (f10 == 1.0f) {
                    i12 = this.f67964z;
                    if (i12 == iC) {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
            }
            getTbd_up().r(this.f67963y, iC, z10);
            getTbd_down().r(this.f67963y, iC, z10);
            if (z10) {
                this.f67964z = iC;
            }
        }
        this.A = false;
    }

    @Override // com.max.hbcustomview.bannerview.BannerViewPager
    public void J(@e List<? extends T> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, c.e.f31986r5, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        F0();
        super.J(list);
    }

    @d
    public final TripleBannerDecorationView getTbd_down() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.f31817h5, new Class[0], TripleBannerDecorationView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TripleBannerDecorationView) patchProxyResultProxy.result;
        }
        TripleBannerDecorationView tripleBannerDecorationView = this.f67962x;
        if (tripleBannerDecorationView != null) {
            return tripleBannerDecorationView;
        }
        f0.S("tbd_down");
        return null;
    }

    @d
    public final TripleBannerDecorationView getTbd_up() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.f31783f5, new Class[0], TripleBannerDecorationView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TripleBannerDecorationView) patchProxyResultProxy.result;
        }
        TripleBannerDecorationView tripleBannerDecorationView = this.f67961w;
        if (tripleBannerDecorationView != null) {
            return tripleBannerDecorationView;
        }
        f0.S("tbd_up");
        return null;
    }

    @Override // com.max.hbcustomview.bannerview.BannerViewPager
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.f31935o5, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        getTbd_up().q();
        getTbd_down().q();
    }

    @Override // com.max.hbcustomview.bannerview.BannerViewPager, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.f31918n5, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        getTbd_up().w();
        getTbd_down().w();
    }

    @Override // com.max.hbcustomview.bannerview.BannerViewPager
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.f31901m5, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onPause();
        getTbd_up().w();
        getTbd_down().w();
    }

    @Override // com.max.hbcustomview.bannerview.BannerViewPager
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.f31884l5, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        getTbd_up().t();
        getTbd_down().t();
    }

    public final void setBdDownList(@e ArrayList<String> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, c.e.f31969q5, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        getTbd_down().setImageList(arrayList);
    }

    public final void setBdUpList(@e ArrayList<String> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, c.e.f31952p5, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        getTbd_up().setImageList(arrayList);
    }

    @Override // com.max.hbcustomview.bannerview.BannerViewPager
    public void setLayoutHeight(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.e.f31867k5, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.setLayoutHeight(i10);
        ic.a aVar = ic.a.f119343a;
        Context context = getContext();
        f0.o(context, "getContext(...)");
        int iD = ((aVar.d(context) * 2) * 30) / 375;
        Context context2 = getContext();
        f0.o(context2, "getContext(...)");
        int iD2 = aVar.d(context2) + iD;
        int i11 = i10 + iD;
        getTbd_up().setLayoutWidthHeight(iD2, i11);
        getTbd_down().setLayoutWidthHeight(iD2, i11);
    }

    public final void setTbd_down(@d TripleBannerDecorationView tripleBannerDecorationView) {
        if (PatchProxy.proxy(new Object[]{tripleBannerDecorationView}, this, changeQuickRedirect, false, c.e.f31834i5, new Class[]{TripleBannerDecorationView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tripleBannerDecorationView, "<set-?>");
        this.f67962x = tripleBannerDecorationView;
    }

    public final void setTbd_up(@d TripleBannerDecorationView tripleBannerDecorationView) {
        if (PatchProxy.proxy(new Object[]{tripleBannerDecorationView}, this, changeQuickRedirect, false, c.e.f31800g5, new Class[]{TripleBannerDecorationView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tripleBannerDecorationView, "<set-?>");
        this.f67961w = tripleBannerDecorationView;
    }

    @Override // com.max.hbcustomview.bannerview.BannerViewPager
    public void z() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.f31850j5, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setClipChildren(false);
        View.inflate(getContext(), R.layout.common_view_triple_banner, this);
        this.f68994h = (ViewPager2) findViewById(R.id.vp_main);
        this.f68993g = (RelativeLayout) findViewById(R.id.bvp_layout_indicator);
        this.f68994h.setPageTransformer(this.f68995i.d());
        View viewFindViewById = findViewById(R.id.tbd_up);
        f0.o(viewFindViewById, "findViewById(...)");
        setTbd_up((TripleBannerDecorationView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.tbd_down);
        f0.o(viewFindViewById2, "findViewById(...)");
        setTbd_down((TripleBannerDecorationView) viewFindViewById2);
        getTbd_down().setSameWithGyroScope(false);
    }
}
