package ze;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.max.heybox.hblog.g;
import com.max.video.AbsVideoView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.flow.v;

/* JADX INFO: compiled from: GestureHandler.kt */
/* JADX INFO: loaded from: classes8.dex */
public class b extends GestureDetector.SimpleOnGestureListener implements GestureDetector.OnGestureListener, View.OnTouchListener {
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    private j<Float> A;
    private boolean B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbsVideoView f141969b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f141974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f141975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f141976i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f141977j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f141978k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f141979l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f141980m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f141981n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private j<Boolean> f141983p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private final u<Boolean> f141984q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f141985r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private j<Float> f141986s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private final u<Float> f141987t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f141988u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private j<Float> f141989v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private final u<Float> f141990w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f141991x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private j<Float> f141992y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private final u<Float> f141993z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f141970c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f141971d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f141972e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f141973f = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f141982o = Integer.MAX_VALUE;

    public b() {
        j<Boolean> jVarA = v.a(Boolean.FALSE);
        this.f141983p = jVarA;
        this.f141984q = jVarA;
        Float fValueOf = Float.valueOf(0.0f);
        j<Float> jVarA2 = v.a(fValueOf);
        this.f141986s = jVarA2;
        this.f141987t = jVarA2;
        j<Float> jVarA3 = v.a(fValueOf);
        this.f141989v = jVarA3;
        this.f141990w = jVarA3;
        j<Float> jVarA4 = v.a(fValueOf);
        this.f141992y = jVarA4;
        this.f141993z = jVarA4;
        this.A = v.a(fValueOf);
    }

    @dl.d
    public final b a() {
        this.f141971d = false;
        return this;
    }

    @dl.d
    public final b b() {
        this.f141973f = false;
        return this;
    }

    @dl.d
    public final b c() {
        this.f141972e = false;
        return this;
    }

    @dl.d
    public final b d() {
        this.f141970c = false;
        return this;
    }

    @dl.d
    public final b e() {
        this.f141971d = true;
        return this;
    }

    @dl.d
    public final b f() {
        this.f141972e = true;
        return this;
    }

    @dl.d
    public final b g() {
        this.f141970c = true;
        return this;
    }

    @dl.d
    public final u<Float> h() {
        return this.f141990w;
    }

    public final boolean i() {
        return this.f141991x;
    }

    public final boolean j() {
        return this.f141985r;
    }

    @dl.d
    public final u<Boolean> k() {
        return this.f141984q;
    }

    @dl.d
    public final u<Float> l() {
        return this.f141987t;
    }

    public final boolean m() {
        return this.f141988u;
    }

    @dl.d
    public final u<Float> n() {
        return this.f141993z;
    }

    public final boolean o() {
        return this.B;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(@dl.d MotionEvent e10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.m.Up, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(e10, "e");
        if (this.f141973f) {
            AbsVideoView absVideoView = this.f141969b;
            AbsVideoView absVideoView2 = null;
            if (absVideoView == null) {
                f0.S("target");
                absVideoView = null;
            }
            if (absVideoView.G()) {
                AbsVideoView absVideoView3 = this.f141969b;
                if (absVideoView3 == null) {
                    f0.S("target");
                } else {
                    absVideoView2 = absVideoView3;
                }
                absVideoView2.K();
            } else {
                AbsVideoView absVideoView4 = this.f141969b;
                if (absVideoView4 == null) {
                    f0.S("target");
                    absVideoView4 = null;
                }
                if (absVideoView4.F()) {
                    AbsVideoView absVideoView5 = this.f141969b;
                    if (absVideoView5 == null) {
                        f0.S("target");
                    } else {
                        absVideoView2 = absVideoView5;
                    }
                    absVideoView2.M();
                }
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(@dl.d MotionEvent e10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.m.Rp, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(e10, "e");
        this.f141974g = e10.getX();
        this.f141975h = e10.getY();
        AbsVideoView absVideoView = this.f141969b;
        AbsVideoView absVideoView2 = null;
        if (absVideoView == null) {
            f0.S("target");
            absVideoView = null;
        }
        this.f141976i = absVideoView.getWidth();
        AbsVideoView absVideoView3 = this.f141969b;
        if (absVideoView3 == null) {
            f0.S("target");
        } else {
            absVideoView2 = absVideoView3;
        }
        this.f141977j = absVideoView2.getHeight();
        this.f141983p.setValue(Boolean.TRUE);
        this.f141978k = false;
        this.f141979l = false;
        this.f141981n = false;
        this.f141980m = false;
        this.f141982o = Integer.MAX_VALUE;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(@dl.d MotionEvent e10) {
        if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.m.Vp, new Class[]{MotionEvent.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(e10, "e");
        if (this.f141978k || this.f141979l) {
            return;
        }
        AbsVideoView absVideoView = this.f141969b;
        if (absVideoView == null) {
            f0.S("target");
            absVideoView = null;
        }
        absVideoView.I();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(@dl.e MotionEvent motionEvent, @dl.d MotionEvent e10, float f10, float f11) {
        boolean z10 = false;
        Object[] objArr = {motionEvent, e10, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.Sp, new Class[]{MotionEvent.class, MotionEvent.class, cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(e10, "e2");
        if (motionEvent == null || e10.getPointerCount() != 1) {
            return false;
        }
        motionEvent.getX();
        float y10 = motionEvent.getY();
        int rawX = (int) e10.getRawX();
        int rawY = (int) e10.getRawY();
        if (this.f141984q.getValue().booleanValue()) {
            boolean z11 = ((double) Math.abs(f10)) * 1.5d >= ((double) Math.abs(f11));
            this.f141979l = z11;
            if (!z11 && this.f141975h > (((double) this.f141977j) * 1.0d) / ((double) 5)) {
                float f12 = this.f141974g;
                double d10 = f12;
                float f13 = this.f141976i;
                if (d10 > (((double) f13) * 2.0d) / ((double) 3)) {
                    this.f141978k = true;
                    this.f141981n = this.f141970c;
                } else if (f12 < ((double) f13) / 3.0d) {
                    this.f141978k = true;
                    this.f141980m = this.f141971d;
                }
            }
            if (z11 && this.f141972e) {
                z10 = true;
            }
            this.f141979l = z10;
        }
        if (this.f141979l && !this.f141978k) {
            this.f141986s.setValue(Float.valueOf((rawX - this.f141974g) / this.f141976i));
        } else if (this.f141980m) {
            int i10 = this.f141982o;
            if (i10 == Integer.MAX_VALUE) {
                this.f141989v.setValue(Float.valueOf((y10 - rawY) / this.f141977j));
            } else {
                this.f141989v.setValue(Float.valueOf((i10 - rawY) / this.f141977j));
            }
            g.f74531b.M("_brightnessOffset: " + this.f141989v.getValue().floatValue() + " onChangeVertical: " + this.f141978k + " lastActiveMoveY: " + this.f141982o + "  oldY: " + y10 + "  y: " + rawY);
        } else if (this.f141981n) {
            int i11 = this.f141982o;
            if (i11 == Integer.MAX_VALUE) {
                this.f141992y.setValue(Float.valueOf((y10 - rawY) / this.f141977j));
            } else {
                this.f141992y.setValue(Float.valueOf((i11 - rawY) / this.f141977j));
            }
            g.f74531b.M("_volumeOffset: " + this.f141992y.getValue().floatValue() + " onChangeVertical: " + this.f141978k + " lastActiveMoveY: " + this.f141982o + "  oldY: " + y10 + "  y: " + rawY);
        }
        if (this.f141978k) {
            if (this.f141982o == Integer.MAX_VALUE) {
                this.f141982o = (int) y10;
            } else {
                this.f141982o = rawY;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(@dl.d MotionEvent e10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.m.Tp, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(e10, "e");
        AbsVideoView absVideoView = this.f141969b;
        AbsVideoView absVideoView2 = null;
        if (absVideoView == null) {
            f0.S("target");
            absVideoView = null;
        }
        absVideoView.J();
        AbsVideoView absVideoView3 = this.f141969b;
        if (absVideoView3 == null) {
            f0.S("target");
        } else {
            absVideoView2 = absVideoView3;
        }
        return absVideoView2.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@dl.d View v10, @dl.d MotionEvent event) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{v10, event}, this, changeQuickRedirect, false, bb.c.m.Wp, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(v10, "v");
        f0.p(event, "event");
        if (event.getAction() == 1) {
            if (this.f141979l) {
                AbsVideoView absVideoView = this.f141969b;
                if (absVideoView == null) {
                    f0.S("target");
                    absVideoView = null;
                }
                absVideoView.W(this.f141987t.getValue().floatValue());
            }
            this.f141979l = false;
            this.f141981n = false;
            this.f141980m = false;
            this.f141983p.setValue(Boolean.FALSE);
        }
        return false;
    }

    @dl.d
    public final j<Float> p() {
        return this.A;
    }

    public final void q(boolean z10) {
        this.f141991x = z10;
    }

    public final void r(boolean z10) {
        this.f141985r = z10;
    }

    public final void s(boolean z10) {
        this.f141988u = z10;
    }

    public final void t(@dl.d AbsVideoView videoView) {
        if (PatchProxy.proxy(new Object[]{videoView}, this, changeQuickRedirect, false, bb.c.m.Xp, new Class[]{AbsVideoView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(videoView, "videoView");
        this.f141969b = videoView;
    }

    public final void u(boolean z10) {
        this.B = z10;
    }

    public final void v(@dl.d j<Float> jVar) {
        if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, bb.c.m.Qp, new Class[]{j.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(jVar, "<set-?>");
        this.A = jVar;
    }
}
