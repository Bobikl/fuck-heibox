package com.max.xiaoheihe.view.smartrefresh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.n0;
import com.airbnb.lottie.LottieAnimationView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.AccelWorldLottieKt;
import com.max.xiaoheihe.utils.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import java.io.File;
import ng.g;
import ng.i;
import ng.j;

/* JADX INFO: loaded from: classes13.dex */
public class HeyBoxHeaderV2 extends RelativeLayout implements g {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LottieAnimationView f96146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private og.b f96147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f96148d;

    public class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Drawable f96149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f96150c;

        a(j jVar) {
            this.f96150c = jVar;
            this.f96149b = jVar.getLayout().getBackground();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49701, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f96150c.getLayout().setBackgroundDrawable(this.f96149b);
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f96152a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f96152a = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f96152a[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f96152a[RefreshState.Refreshing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f96152a[RefreshState.ReleaseToRefresh.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public HeyBoxHeaderV2(Context context) {
        super(context);
        this.f96147c = og.b.f132310d;
        f(context, null, 0);
    }

    public HeyBoxHeaderV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f96147c = og.b.f132310d;
        f(context, attributeSet, 0);
    }

    public HeyBoxHeaderV2(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f96147c = og.b.f132310d;
        f(context, attributeSet, i10);
    }

    private void f(Context context, AttributeSet attributeSet, int i10) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet, new Integer(i10)}, this, changeQuickRedirect, false, 49693, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setMinimumHeight(com.scwang.smartrefresh.layout.util.b.d(70.0f));
        this.f96146b = new LottieAnimationView(context);
        int iF = ViewUtils.f(context, 54.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iF, iF);
        layoutParams.addRule(13);
        try {
            if (!new File(r.r("refresh")).exists() || com.max.xiaoheihe.view.smartrefresh.a.f96153a) {
                this.f96146b.setAnimation(R.raw.header_refreshing);
            } else {
                this.f96146b.setFailureListener(r.f95734k);
                AccelWorldLottieKt.a(this.f96146b, "refresh");
            }
        } catch (Exception e10) {
            com.max.heybox.hblog.g.G("[HeyBoxHeaderV2][initView] setLottieAnim fail, cause: " + e10);
            try {
                this.f96146b.setAnimation(R.raw.header_refreshing);
            } catch (Exception unused) {
            }
        }
        this.f96146b.setProgress(0.0f);
        this.f96146b.setRepeatMode(1);
        this.f96146b.setRepeatCount(-1);
        addView(this.f96146b, layoutParams);
    }

    private void k() {
        LottieAnimationView lottieAnimationView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49700, new Class[0], Void.TYPE).isSupported || (lottieAnimationView = this.f96146b) == null || lottieAnimationView.A()) {
            return;
        }
        this.f96146b.E();
    }

    private void s(j jVar) {
        if (!PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 49699, new Class[]{j.class}, Void.TYPE).isSupported && this.f96148d == null && this.f96147c == og.b.f132312f) {
            this.f96148d = new a(jVar);
            jVar.getLayout().setBackgroundDrawable(getBackground());
        }
    }

    private void t() {
        Runnable runnable;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49698, new Class[0], Void.TYPE).isSupported || (runnable = this.f96148d) == null) {
            return;
        }
        runnable.run();
        this.f96148d = null;
    }

    @Override // ng.h
    public void b(i iVar, int i10, int i11) {
    }

    @Override // ng.h
    public int g(j jVar, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 49696, new Class[]{j.class, Boolean.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        this.f96146b.p();
        return 0;
    }

    @Override // ng.h
    public og.b getSpinnerStyle() {
        return this.f96147c;
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
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49695, new Class[]{j.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        k();
    }

    @Override // pg.f
    public void q(j jVar, RefreshState refreshState, RefreshState refreshState2) {
        if (PatchProxy.proxy(new Object[]{jVar, refreshState, refreshState2}, this, changeQuickRedirect, false, 49697, new Class[]{j.class, RefreshState.class, RefreshState.class}, Void.TYPE).isSupported) {
            return;
        }
        int i10 = b.f96152a[refreshState2.ordinal()];
        if (i10 == 1) {
            t();
        } else if (i10 != 2) {
            if (i10 == 3) {
                k();
                return;
            } else {
                if (i10 != 4) {
                    return;
                }
                s(jVar);
                return;
            }
        }
        this.f96146b.p();
    }

    @Override // ng.h
    public void r(boolean z10, float f10, int i10, int i11, int i12) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Float(f10), new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49694, new Class[]{Boolean.TYPE, Float.TYPE, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (f10 == 0.0f) {
            this.f96146b.setProgress(0.0f);
        } else if (f10 > 0.4f) {
            k();
        }
    }

    @Override // ng.h
    public void setPrimaryColors(int... iArr) {
    }

    public HeyBoxHeaderV2 u(og.b bVar) {
        this.f96147c = bVar;
        return this;
    }
}
