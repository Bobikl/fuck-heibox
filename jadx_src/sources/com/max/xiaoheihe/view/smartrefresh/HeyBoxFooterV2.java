package com.max.xiaoheihe.view.smartrefresh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.n0;
import com.airbnb.lottie.LottieAnimationView;
import com.max.hbutils.utils.ViewUtils;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.AccelWorldLottieKt;
import com.max.xiaoheihe.utils.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import java.io.File;
import ng.f;
import ng.i;
import ng.j;

/* JADX INFO: loaded from: classes13.dex */
public class HeyBoxFooterV2 extends LinearLayout implements f {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LottieAnimationView f96138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private og.b f96139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f96140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f96141e;

    public class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Drawable f96142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f96143c;

        a(j jVar) {
            this.f96143c = jVar;
            this.f96142b = jVar.getLayout().getBackground();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49692, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f96143c.getLayout().setBackgroundDrawable(this.f96142b);
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f96145a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f96145a = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f96145a[RefreshState.PullUpToLoad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f96145a[RefreshState.Loading.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f96145a[RefreshState.LoadReleased.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f96145a[RefreshState.Refreshing.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f96145a[RefreshState.ReleaseToLoad.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public HeyBoxFooterV2(Context context) {
        super(context);
        this.f96139c = og.b.f132310d;
        this.f96140d = false;
        f(context, null, 0);
    }

    public HeyBoxFooterV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f96139c = og.b.f132310d;
        this.f96140d = false;
        f(context, attributeSet, 0);
    }

    public HeyBoxFooterV2(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f96139c = og.b.f132310d;
        this.f96140d = false;
        f(context, attributeSet, i10);
    }

    private void f(Context context, AttributeSet attributeSet, int i10) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet, new Integer(i10)}, this, changeQuickRedirect, false, 49683, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setGravity(17);
        this.f96138b = new LottieAnimationView(context);
        int iF = ViewUtils.f(context, 22.0f);
        int iF2 = ViewUtils.f(context, 8.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iF, iF);
        layoutParams.gravity = 17;
        layoutParams.topMargin = iF2;
        layoutParams.bottomMargin = iF2;
        try {
            if (!new File(r.r(r.f95726c)).exists() || com.max.xiaoheihe.view.smartrefresh.a.f96153a) {
                this.f96138b.setAnimation(R.raw.footer_loading);
            } else {
                this.f96138b.setFailureListener(r.f95734k);
                AccelWorldLottieKt.a(this.f96138b, r.f95726c);
            }
        } catch (Exception e10) {
            g.G("[HeyBoxFooterV2][initView] setLottieAnim fail, cause: " + e10);
            try {
                this.f96138b.setAnimation(R.raw.footer_loading);
            } catch (Exception unused) {
            }
        }
        this.f96138b.setProgress(0.0f);
        this.f96138b.setRepeatMode(1);
        this.f96138b.setRepeatCount(-1);
        addView(this.f96138b, layoutParams);
    }

    private void k() {
        LottieAnimationView lottieAnimationView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49691, new Class[0], Void.TYPE).isSupported || (lottieAnimationView = this.f96138b) == null || lottieAnimationView.A()) {
            return;
        }
        this.f96138b.E();
    }

    private void s(j jVar) {
        if (!PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 49690, new Class[]{j.class}, Void.TYPE).isSupported && this.f96141e == null && this.f96139c == og.b.f132312f) {
            this.f96141e = new a(jVar);
            jVar.getLayout().setBackgroundDrawable(getBackground());
        }
    }

    private void t() {
        Runnable runnable;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49689, new Class[0], Void.TYPE).isSupported || (runnable = this.f96141e) == null) {
            return;
        }
        runnable.run();
        this.f96141e = null;
    }

    @Override // ng.h
    public void b(i iVar, int i10, int i11) {
    }

    @Override // ng.h
    public int g(j jVar, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 49687, new Class[]{j.class, Boolean.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (!this.f96140d) {
            this.f96138b.p();
        }
        return 0;
    }

    @Override // ng.h
    public og.b getSpinnerStyle() {
        return this.f96139c;
    }

    @Override // ng.h
    @n0
    public View getView() {
        return this;
    }

    @Override // ng.h
    public void h(float f10, int i10, int i11) {
    }

    @Override // ng.h
    public boolean j() {
        return false;
    }

    @Override // ng.h
    public void o(@n0 j jVar, int i10, int i11) {
    }

    @Override // ng.h
    public void p(j jVar, int i10, int i11) {
        Object[] objArr = {jVar, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49686, new Class[]{j.class, cls, cls}, Void.TYPE).isSupported || this.f96140d) {
            return;
        }
        this.f96138b.setVisibility(0);
        k();
    }

    @Override // pg.f
    public void q(j jVar, RefreshState refreshState, RefreshState refreshState2) {
        if (PatchProxy.proxy(new Object[]{jVar, refreshState, refreshState2}, this, changeQuickRedirect, false, 49688, new Class[]{j.class, RefreshState.class, RefreshState.class}, Void.TYPE).isSupported || this.f96140d) {
            return;
        }
        switch (b.f96145a[refreshState2.ordinal()]) {
            case 1:
                t();
                break;
            case 2:
                break;
            case 3:
            case 4:
            case 5:
                k();
                return;
            case 6:
                s(jVar);
                return;
            default:
                return;
        }
        this.f96138b.p();
    }

    @Override // ng.h
    public void r(boolean z10, float f10, int i10, int i11, int i12) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Float(f10), new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49685, new Class[]{Boolean.TYPE, Float.TYPE, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (f10 == 0.0f) {
            this.f96138b.setProgress(0.0f);
        } else if (f10 > 0.4f) {
            k();
        }
    }

    @Override // ng.f
    public boolean setNoMoreData(boolean z10) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49684, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this.f96140d != z10) {
            this.f96140d = z10;
            LottieAnimationView lottieAnimationView = this.f96138b;
            if (z10) {
                lottieAnimationView.setVisibility(8);
            } else {
                lottieAnimationView.setVisibility(0);
            }
            this.f96138b.p();
        }
        return true;
    }

    @Override // ng.h
    public void setPrimaryColors(int... iArr) {
    }

    public HeyBoxFooterV2 u(og.b bVar) {
        this.f96139c = bVar;
        return this;
    }
}
