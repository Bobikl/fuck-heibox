package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: GestureDetectorCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f21669a;

    /* JADX INFO: compiled from: GestureDetectorCompat.java */
    public interface a {
        void a(boolean z10);

        void b(GestureDetector.OnDoubleTapListener onDoubleTapListener);

        boolean c(MotionEvent motionEvent);

        boolean d();
    }

    /* JADX INFO: compiled from: GestureDetectorCompat.java */
    public static class b implements a {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final int f21670v = ViewConfiguration.getTapTimeout();

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final int f21671w = ViewConfiguration.getDoubleTapTimeout();

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final int f21672x = 1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final int f21673y = 2;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final int f21674z = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f21675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f21677c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f21678d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Handler f21679e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final GestureDetector.OnGestureListener f21680f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        GestureDetector.OnDoubleTapListener f21681g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f21682h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f21683i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f21684j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f21685k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f21686l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        MotionEvent f21687m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private MotionEvent f21688n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f21689o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private float f21690p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private float f21691q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private float f21692r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private float f21693s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f21694t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private VelocityTracker f21695u;

        /* JADX INFO: compiled from: GestureDetectorCompat.java */
        public class a extends Handler {
            a() {
            }

            a(Handler handler) {
                super(handler.getLooper());
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i10 = message.what;
                if (i10 == 1) {
                    b bVar = b.this;
                    bVar.f21680f.onShowPress(bVar.f21687m);
                    return;
                }
                if (i10 == 2) {
                    b.this.g();
                    return;
                }
                if (i10 != 3) {
                    throw new RuntimeException("Unknown message " + message);
                }
                b bVar2 = b.this;
                GestureDetector.OnDoubleTapListener onDoubleTapListener = bVar2.f21681g;
                if (onDoubleTapListener != null) {
                    if (bVar2.f21682h) {
                        bVar2.f21683i = true;
                    } else {
                        onDoubleTapListener.onSingleTapConfirmed(bVar2.f21687m);
                    }
                }
            }
        }

        b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f21679e = new a(handler);
            } else {
                this.f21679e = new a();
            }
            this.f21680f = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                b((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            h(context);
        }

        private void e() {
            this.f21679e.removeMessages(1);
            this.f21679e.removeMessages(2);
            this.f21679e.removeMessages(3);
            this.f21695u.recycle();
            this.f21695u = null;
            this.f21689o = false;
            this.f21682h = false;
            this.f21685k = false;
            this.f21686l = false;
            this.f21683i = false;
            if (this.f21684j) {
                this.f21684j = false;
            }
        }

        private void f() {
            this.f21679e.removeMessages(1);
            this.f21679e.removeMessages(2);
            this.f21679e.removeMessages(3);
            this.f21689o = false;
            this.f21685k = false;
            this.f21686l = false;
            this.f21683i = false;
            if (this.f21684j) {
                this.f21684j = false;
            }
        }

        private void h(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            }
            if (this.f21680f == null) {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
            this.f21694t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f21677c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f21678d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f21675a = scaledTouchSlop * scaledTouchSlop;
            this.f21676b = scaledDoubleTapSlop * scaledDoubleTapSlop;
        }

        private boolean i(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.f21686l || motionEvent3.getEventTime() - motionEvent2.getEventTime() > f21671w) {
                return false;
            }
            int x10 = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y10 = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            return (x10 * x10) + (y10 * y10) < this.f21676b;
        }

        @Override // androidx.core.view.m.a
        public void a(boolean z10) {
            this.f21694t = z10;
        }

        @Override // androidx.core.view.m.a
        public void b(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f21681g = onDoubleTapListener;
        }

        @Override // androidx.core.view.m.a
        public boolean c(MotionEvent motionEvent) {
            boolean zOnDoubleTap;
            MotionEvent motionEvent2;
            boolean zOnFling;
            GestureDetector.OnDoubleTapListener onDoubleTapListener;
            int action = motionEvent.getAction();
            if (this.f21695u == null) {
                this.f21695u = VelocityTracker.obtain();
            }
            this.f21695u.addMovement(motionEvent);
            int i10 = action & 255;
            boolean z10 = i10 == 6;
            int actionIndex = z10 ? motionEvent.getActionIndex() : -1;
            int pointerCount = motionEvent.getPointerCount();
            float x10 = 0.0f;
            float y10 = 0.0f;
            for (int i11 = 0; i11 < pointerCount; i11++) {
                if (actionIndex != i11) {
                    x10 += motionEvent.getX(i11);
                    y10 += motionEvent.getY(i11);
                }
            }
            float f10 = z10 ? pointerCount - 1 : pointerCount;
            float f11 = x10 / f10;
            float f12 = y10 / f10;
            if (i10 == 0) {
                if (this.f21681g == null) {
                    zOnDoubleTap = false;
                } else {
                    boolean zHasMessages = this.f21679e.hasMessages(3);
                    if (zHasMessages) {
                        this.f21679e.removeMessages(3);
                    }
                    MotionEvent motionEvent3 = this.f21687m;
                    if (motionEvent3 == null || (motionEvent2 = this.f21688n) == null || !zHasMessages || !i(motionEvent3, motionEvent2, motionEvent)) {
                        this.f21679e.sendEmptyMessageDelayed(3, f21671w);
                        zOnDoubleTap = false;
                    } else {
                        this.f21689o = true;
                        zOnDoubleTap = this.f21681g.onDoubleTap(this.f21687m) | false | this.f21681g.onDoubleTapEvent(motionEvent);
                    }
                }
                this.f21690p = f11;
                this.f21692r = f11;
                this.f21691q = f12;
                this.f21693s = f12;
                MotionEvent motionEvent4 = this.f21687m;
                if (motionEvent4 != null) {
                    motionEvent4.recycle();
                }
                this.f21687m = MotionEvent.obtain(motionEvent);
                this.f21685k = true;
                this.f21686l = true;
                this.f21682h = true;
                this.f21684j = false;
                this.f21683i = false;
                if (this.f21694t) {
                    this.f21679e.removeMessages(2);
                    this.f21679e.sendEmptyMessageAtTime(2, this.f21687m.getDownTime() + ((long) f21670v) + ((long) ViewConfiguration.getLongPressTimeout()));
                }
                this.f21679e.sendEmptyMessageAtTime(1, this.f21687m.getDownTime() + ((long) f21670v));
                return zOnDoubleTap | this.f21680f.onDown(motionEvent);
            }
            if (i10 == 1) {
                this.f21682h = false;
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                if (this.f21689o) {
                    zOnFling = this.f21681g.onDoubleTapEvent(motionEvent) | false;
                } else {
                    if (this.f21684j) {
                        this.f21679e.removeMessages(3);
                        this.f21684j = false;
                    } else if (this.f21685k) {
                        boolean zOnSingleTapUp = this.f21680f.onSingleTapUp(motionEvent);
                        if (this.f21683i && (onDoubleTapListener = this.f21681g) != null) {
                            onDoubleTapListener.onSingleTapConfirmed(motionEvent);
                        }
                        zOnFling = zOnSingleTapUp;
                    } else {
                        VelocityTracker velocityTracker = this.f21695u;
                        int pointerId = motionEvent.getPointerId(0);
                        velocityTracker.computeCurrentVelocity(1000, this.f21678d);
                        float yVelocity = velocityTracker.getYVelocity(pointerId);
                        float xVelocity = velocityTracker.getXVelocity(pointerId);
                        if (Math.abs(yVelocity) > this.f21677c || Math.abs(xVelocity) > this.f21677c) {
                            zOnFling = this.f21680f.onFling(this.f21687m, motionEvent, xVelocity, yVelocity);
                        }
                    }
                    zOnFling = false;
                }
                MotionEvent motionEvent5 = this.f21688n;
                if (motionEvent5 != null) {
                    motionEvent5.recycle();
                }
                this.f21688n = motionEventObtain;
                VelocityTracker velocityTracker2 = this.f21695u;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f21695u = null;
                }
                this.f21689o = false;
                this.f21683i = false;
                this.f21679e.removeMessages(1);
                this.f21679e.removeMessages(2);
            } else {
                if (i10 != 2) {
                    if (i10 == 3) {
                        e();
                        return false;
                    }
                    if (i10 == 5) {
                        this.f21690p = f11;
                        this.f21692r = f11;
                        this.f21691q = f12;
                        this.f21693s = f12;
                        f();
                        return false;
                    }
                    if (i10 != 6) {
                        return false;
                    }
                    this.f21690p = f11;
                    this.f21692r = f11;
                    this.f21691q = f12;
                    this.f21693s = f12;
                    this.f21695u.computeCurrentVelocity(1000, this.f21678d);
                    int actionIndex2 = motionEvent.getActionIndex();
                    int pointerId2 = motionEvent.getPointerId(actionIndex2);
                    float xVelocity2 = this.f21695u.getXVelocity(pointerId2);
                    float yVelocity2 = this.f21695u.getYVelocity(pointerId2);
                    for (int i12 = 0; i12 < pointerCount; i12++) {
                        if (i12 != actionIndex2) {
                            int pointerId3 = motionEvent.getPointerId(i12);
                            if ((this.f21695u.getXVelocity(pointerId3) * xVelocity2) + (this.f21695u.getYVelocity(pointerId3) * yVelocity2) < 0.0f) {
                                this.f21695u.clear();
                                return false;
                            }
                        }
                    }
                    return false;
                }
                if (this.f21684j) {
                    return false;
                }
                float f13 = this.f21690p - f11;
                float f14 = this.f21691q - f12;
                if (this.f21689o) {
                    return false | this.f21681g.onDoubleTapEvent(motionEvent);
                }
                if (!this.f21685k) {
                    if (Math.abs(f13) < 1.0f && Math.abs(f14) < 1.0f) {
                        return false;
                    }
                    boolean zOnScroll = this.f21680f.onScroll(this.f21687m, motionEvent, f13, f14);
                    this.f21690p = f11;
                    this.f21691q = f12;
                    return zOnScroll;
                }
                int i13 = (int) (f11 - this.f21692r);
                int i14 = (int) (f12 - this.f21693s);
                int i15 = (i13 * i13) + (i14 * i14);
                if (i15 > this.f21675a) {
                    zOnFling = this.f21680f.onScroll(this.f21687m, motionEvent, f13, f14);
                    this.f21690p = f11;
                    this.f21691q = f12;
                    this.f21685k = false;
                    this.f21679e.removeMessages(3);
                    this.f21679e.removeMessages(1);
                    this.f21679e.removeMessages(2);
                } else {
                    zOnFling = false;
                }
                if (i15 > this.f21675a) {
                    this.f21686l = false;
                }
            }
            return zOnFling;
        }

        @Override // androidx.core.view.m.a
        public boolean d() {
            return this.f21694t;
        }

        void g() {
            this.f21679e.removeMessages(3);
            this.f21683i = false;
            this.f21684j = true;
            this.f21680f.onLongPress(this.f21687m);
        }
    }

    /* JADX INFO: compiled from: GestureDetectorCompat.java */
    public static class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final GestureDetector f21697a;

        c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f21697a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // androidx.core.view.m.a
        public void a(boolean z10) {
            this.f21697a.setIsLongpressEnabled(z10);
        }

        @Override // androidx.core.view.m.a
        public void b(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f21697a.setOnDoubleTapListener(onDoubleTapListener);
        }

        @Override // androidx.core.view.m.a
        public boolean c(MotionEvent motionEvent) {
            return this.f21697a.onTouchEvent(motionEvent);
        }

        @Override // androidx.core.view.m.a
        public boolean d() {
            return this.f21697a.isLongpressEnabled();
        }
    }

    public m(@androidx.annotation.n0 Context context, @androidx.annotation.n0 GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public m(@androidx.annotation.n0 Context context, @androidx.annotation.n0 GestureDetector.OnGestureListener onGestureListener, @androidx.annotation.p0 Handler handler) {
        this.f21669a = new c(context, onGestureListener, handler);
    }

    public boolean a() {
        return this.f21669a.d();
    }

    public boolean b(@androidx.annotation.n0 MotionEvent motionEvent) {
        return this.f21669a.c(motionEvent);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void c(boolean z10) {
        this.f21669a.a(z10);
    }

    public void d(@androidx.annotation.p0 GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f21669a.b(onDoubleTapListener);
    }
}
