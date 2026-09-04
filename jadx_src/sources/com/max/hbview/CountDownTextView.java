package com.max.hbview;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: CountDownTextView.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class CountDownTextView extends AppCompatTextView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    public static final b f73741g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f73742h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f73743i = 500;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f73744j = 1000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f73745k = 60000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f73746l = 3600000;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f73747m = 86400000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f73748n = 604800000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f73749o = 2592000000L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f73750p = 31449600000L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f73751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f73752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f73753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f73754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private c f73755f;

    /* JADX INFO: compiled from: CountDownTextView.kt */
    public static final class a extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final WeakReference<CountDownTextView> f73756a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d Looper looper, @dl.d CountDownTextView countDownTextView) {
            super(looper);
            f0.p(looper, "looper");
            f0.p(countDownTextView, "countDownTextView");
            this.f73756a = new WeakReference<>(countDownTextView);
        }

        @Override // android.os.Handler
        public void handleMessage(@dl.d Message msg) {
            CountDownTextView countDownTextView;
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, bb.c.k.yx, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(msg, "msg");
            if (msg.what != 1 || (countDownTextView = this.f73756a.get()) == null) {
                return;
            }
            CountDownTextView.f(countDownTextView);
        }
    }

    /* JADX INFO: compiled from: CountDownTextView.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: CountDownTextView.kt */
    public interface c {
        @dl.d
        String a(long j10);

        void onFinish();
    }

    /* JADX INFO: compiled from: CountDownTextView.kt */
    public static final class d implements c {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbview.CountDownTextView.c
        @dl.d
        public String a(long j10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.k.zx, new Class[]{Long.TYPE}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            if (j10 <= 0) {
                return "";
            }
            if (j10 > 31449600000L) {
                long j11 = j10 % 31449600000L;
                return "" + (j10 / 31449600000L) + (char) 24180;
            }
            if (j10 > 2592000000L) {
                long j12 = j10 % 2592000000L;
                return "" + (j10 / 2592000000L) + (char) 26376;
            }
            if (j10 > 86400000) {
                long j13 = j10 % 86400000;
                return "" + (j10 / 86400000) + (char) 26085;
            }
            if (j10 > 3600000) {
                long j14 = j10 % 3600000;
                return "" + (j10 / 3600000) + "小时";
            }
            if (j10 > 60000) {
                long j15 = j10 % 60000;
                return "" + (j10 / 60000) + (char) 20998;
            }
            if (j10 <= 1000) {
                return "";
            }
            long j16 = j10 % 1000;
            return "" + (j10 / 1000) + (char) 31186;
        }

        @Override // com.max.hbview.CountDownTextView.c
        public void onFinish() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountDownTextView(@dl.d Context context) {
        this(context, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountDownTextView(@dl.d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTextView(@dl.d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f73755f = new d();
        g(context, attributeSet, i10);
    }

    public static final /* synthetic */ void f(CountDownTextView countDownTextView) {
        if (PatchProxy.proxy(new Object[]{countDownTextView}, null, changeQuickRedirect, true, bb.c.k.xx, new Class[]{CountDownTextView.class}, Void.TYPE).isSupported) {
            return;
        }
        countDownTextView.h();
    }

    private final void g(Context context, AttributeSet attributeSet, int i10) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.ux, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.f73815t, i10, 0);
        f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f73752c = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CountDownTextView_autoCountDown, false);
        this.f73751b = typedArrayObtainStyledAttributes.getInteger(R.styleable.CountDownTextView_countDownTarget, 0);
        typedArrayObtainStyledAttributes.recycle();
        Looper mainLooper = Looper.getMainLooper();
        f0.o(mainLooper, "getMainLooper(...)");
        this.f73754e = new a(mainLooper, this);
        if (this.f73752c) {
            i();
        }
    }

    private final void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.vx, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        long jCurrentTimeMillis = this.f73751b - System.currentTimeMillis();
        setText(this.f73755f.a(jCurrentTimeMillis));
        a aVar = null;
        if (jCurrentTimeMillis > 0) {
            a aVar2 = this.f73754e;
            if (aVar2 == null) {
                f0.S("updateHandler");
            } else {
                aVar = aVar2;
            }
            aVar.sendEmptyMessageDelayed(1, 500L);
            return;
        }
        this.f73753d = false;
        a aVar3 = this.f73754e;
        if (aVar3 == null) {
            f0.S("updateHandler");
            aVar3 = null;
        }
        aVar3.removeCallbacksAndMessages(null);
        this.f73755f.onFinish();
    }

    public final long getTargetTime() {
        return this.f73751b;
    }

    @dl.d
    public final c getTimeTransformer() {
        return this.f73755f;
    }

    public final void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.rx, new Class[0], Void.TYPE).isSupported || this.f73753d) {
            return;
        }
        this.f73753d = true;
        a aVar = this.f73754e;
        if (aVar == null) {
            f0.S("updateHandler");
            aVar = null;
        }
        aVar.sendEmptyMessage(1);
    }

    public final void j() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.sx, new Class[0], Void.TYPE).isSupported && this.f73753d) {
            this.f73753d = false;
            a aVar = this.f73754e;
            if (aVar == null) {
                f0.S("updateHandler");
                aVar = null;
            }
            aVar.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.tx, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        j();
    }

    public final void setTargetTime(long j10) {
        this.f73751b = j10;
    }

    public final void setTimeString() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.wx, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setText(this.f73755f.a(this.f73751b - System.currentTimeMillis()));
    }

    public final void setTimeTransformer(@dl.d c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.k.qx, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(cVar, "<set-?>");
        this.f73755f = cVar;
    }
}
