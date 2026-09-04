package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.R;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: TouchResponse.java */
/* JADX INFO: loaded from: classes.dex */
public class v {
    private static final String G = "TouchResponse";
    private static final boolean H = false;
    private static final int I = 1000;
    private static final float J = 1.0E-7f;
    private static final float[][] K = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    private static final float[][] L = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    private static final int M = 0;
    private static final int N = 1;
    private static final int O = 2;
    private static final int P = 3;
    private static final int Q = 4;
    private static final int R = 5;
    private static final int S = 0;
    private static final int T = 1;
    private static final int U = 2;
    private static final int V = 3;
    private static final int W = 4;
    private static final int X = 5;
    private static final int Y = 6;
    static final int Z = 1;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    static final int f19051a0 = 2;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    static final int f19052b0 = 4;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f19053c0 = 0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f19054d0 = 1;
    private float A;
    private float B;
    private float C;
    private float D;
    private int E;
    private int F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f19061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f19062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f19063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f19064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f19065k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f19066l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f19067m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f19068n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f19069o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float[] f19070p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int[] f19071q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f19072r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f19073s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final MotionLayout f19074t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f19075u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f19076v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f19077w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f19078x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f19079y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f19080z;

    /* JADX INFO: compiled from: TouchResponse.java */
    public class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: compiled from: TouchResponse.java */
    public class b implements NestedScrollView.c {
        b() {
        }

        @Override // androidx.core.widget.NestedScrollView.c
        public void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
        }
    }

    v(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f19055a = 0;
        this.f19056b = 0;
        this.f19057c = 0;
        this.f19058d = -1;
        this.f19059e = -1;
        this.f19060f = -1;
        this.f19061g = 0.5f;
        this.f19062h = 0.5f;
        this.f19063i = 0.5f;
        this.f19064j = 0.5f;
        this.f19065k = -1;
        this.f19066l = false;
        this.f19067m = 0.0f;
        this.f19068n = 1.0f;
        this.f19069o = false;
        this.f19070p = new float[2];
        this.f19071q = new int[2];
        this.f19075u = 4.0f;
        this.f19076v = 1.2f;
        this.f19077w = true;
        this.f19078x = 1.0f;
        this.f19079y = 0;
        this.f19080z = 10.0f;
        this.A = 10.0f;
        this.B = 1.0f;
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = 0;
        this.F = 0;
        this.f19074t = motionLayout;
        c(context, Xml.asAttributeSet(xmlPullParser));
    }

    public v(MotionLayout motionLayout, t tVar) {
        this.f19055a = 0;
        this.f19056b = 0;
        this.f19057c = 0;
        this.f19058d = -1;
        this.f19059e = -1;
        this.f19060f = -1;
        this.f19061g = 0.5f;
        this.f19062h = 0.5f;
        this.f19063i = 0.5f;
        this.f19064j = 0.5f;
        this.f19065k = -1;
        this.f19066l = false;
        this.f19067m = 0.0f;
        this.f19068n = 1.0f;
        this.f19069o = false;
        this.f19070p = new float[2];
        this.f19071q = new int[2];
        this.f19075u = 4.0f;
        this.f19076v = 1.2f;
        this.f19077w = true;
        this.f19078x = 1.0f;
        this.f19079y = 0;
        this.f19080z = 10.0f;
        this.A = 10.0f;
        this.B = 1.0f;
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = 0;
        this.F = 0;
        this.f19074t = motionLayout;
        this.f19058d = tVar.q();
        int iR = tVar.r();
        this.f19055a = iR;
        if (iR != -1) {
            float[] fArr = K[iR];
            this.f19062h = fArr[0];
            this.f19061g = fArr[1];
        }
        int iB = tVar.b();
        this.f19056b = iB;
        float[][] fArr2 = L;
        if (iB < fArr2.length) {
            float[] fArr3 = fArr2[iB];
            this.f19067m = fArr3[0];
            this.f19068n = fArr3[1];
        } else {
            this.f19068n = Float.NaN;
            this.f19067m = Float.NaN;
            this.f19066l = true;
        }
        this.f19075u = tVar.g();
        this.f19076v = tVar.f();
        this.f19077w = tVar.h();
        this.f19078x = tVar.c();
        this.f19080z = tVar.d();
        this.f19059e = tVar.s();
        this.f19057c = tVar.j();
        this.f19079y = tVar.i();
        this.f19060f = tVar.e();
        this.f19065k = tVar.k();
        this.E = tVar.l();
        this.A = tVar.m();
        this.B = tVar.n();
        this.C = tVar.o();
        this.D = tVar.p();
        this.F = tVar.a();
    }

    private void b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index == R.styleable.OnSwipe_touchAnchorId) {
                this.f19058d = typedArray.getResourceId(index, this.f19058d);
            } else if (index == R.styleable.OnSwipe_touchAnchorSide) {
                int i11 = typedArray.getInt(index, this.f19055a);
                this.f19055a = i11;
                float[] fArr = K[i11];
                this.f19062h = fArr[0];
                this.f19061g = fArr[1];
            } else if (index == R.styleable.OnSwipe_dragDirection) {
                int i12 = typedArray.getInt(index, this.f19056b);
                this.f19056b = i12;
                float[][] fArr2 = L;
                if (i12 < fArr2.length) {
                    float[] fArr3 = fArr2[i12];
                    this.f19067m = fArr3[0];
                    this.f19068n = fArr3[1];
                } else {
                    this.f19068n = Float.NaN;
                    this.f19067m = Float.NaN;
                    this.f19066l = true;
                }
            } else if (index == R.styleable.OnSwipe_maxVelocity) {
                this.f19075u = typedArray.getFloat(index, this.f19075u);
            } else if (index == R.styleable.OnSwipe_maxAcceleration) {
                this.f19076v = typedArray.getFloat(index, this.f19076v);
            } else if (index == R.styleable.OnSwipe_moveWhenScrollAtTop) {
                this.f19077w = typedArray.getBoolean(index, this.f19077w);
            } else if (index == R.styleable.OnSwipe_dragScale) {
                this.f19078x = typedArray.getFloat(index, this.f19078x);
            } else if (index == R.styleable.OnSwipe_dragThreshold) {
                this.f19080z = typedArray.getFloat(index, this.f19080z);
            } else if (index == R.styleable.OnSwipe_touchRegionId) {
                this.f19059e = typedArray.getResourceId(index, this.f19059e);
            } else if (index == R.styleable.OnSwipe_onTouchUp) {
                this.f19057c = typedArray.getInt(index, this.f19057c);
            } else if (index == R.styleable.OnSwipe_nestedScrollFlags) {
                this.f19079y = typedArray.getInteger(index, 0);
            } else if (index == R.styleable.OnSwipe_limitBoundsTo) {
                this.f19060f = typedArray.getResourceId(index, 0);
            } else if (index == R.styleable.OnSwipe_rotationCenterId) {
                this.f19065k = typedArray.getResourceId(index, this.f19065k);
            } else if (index == R.styleable.OnSwipe_springDamping) {
                this.A = typedArray.getFloat(index, this.A);
            } else if (index == R.styleable.OnSwipe_springMass) {
                this.B = typedArray.getFloat(index, this.B);
            } else if (index == R.styleable.OnSwipe_springStiffness) {
                this.C = typedArray.getFloat(index, this.C);
            } else if (index == R.styleable.OnSwipe_springStopThreshold) {
                this.D = typedArray.getFloat(index, this.D);
            } else if (index == R.styleable.OnSwipe_springBoundary) {
                this.E = typedArray.getInt(index, this.E);
            } else if (index == R.styleable.OnSwipe_autoCompleteMode) {
                this.F = typedArray.getInt(index, this.F);
            }
        }
    }

    private void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f19398e0);
        b(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void A(float f10) {
        this.f19076v = f10;
    }

    public void B(float f10) {
        this.f19075u = f10;
    }

    public void C(boolean z10) {
        if (z10) {
            float[][] fArr = L;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = K;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = L;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = K;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = K[this.f19055a];
        this.f19062h = fArr5[0];
        this.f19061g = fArr5[1];
        int i10 = this.f19056b;
        float[][] fArr6 = L;
        if (i10 >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i10];
        this.f19067m = fArr7[0];
        this.f19068n = fArr7[1];
    }

    public void D(float f10, float f11) {
        this.f19062h = f10;
        this.f19061g = f11;
    }

    public void E(int i10) {
        this.f19057c = i10;
    }

    void F(float f10, float f11) {
        this.f19072r = f10;
        this.f19073s = f11;
        this.f19069o = false;
    }

    void G() {
        View viewFindViewById;
        int i10 = this.f19058d;
        if (i10 != -1) {
            viewFindViewById = this.f19074t.findViewById(i10);
            if (viewFindViewById == null) {
                Log.e(G, "cannot find TouchAnchorId @id/" + c.i(this.f19074t.getContext(), this.f19058d));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new a());
            nestedScrollView.setOnScrollChangeListener(new b());
        }
    }

    float a(float f10, float f11) {
        return (f10 * this.f19067m) + (f11 * this.f19068n);
    }

    public int d() {
        return this.f19058d;
    }

    public int e() {
        return this.F;
    }

    public int f() {
        return this.f19079y;
    }

    RectF g(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i10 = this.f19060f;
        if (i10 == -1 || (viewFindViewById = viewGroup.findViewById(i10)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    int h() {
        return this.f19060f;
    }

    float i() {
        return this.f19076v;
    }

    public float j() {
        return this.f19075u;
    }

    boolean k() {
        return this.f19077w;
    }

    float l(float f10, float f11) {
        this.f19074t.y0(this.f19058d, this.f19074t.getProgress(), this.f19062h, this.f19061g, this.f19070p);
        float f12 = this.f19067m;
        if (f12 != 0.0f) {
            float[] fArr = this.f19070p;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f10 * f12) / fArr[0];
        }
        float[] fArr2 = this.f19070p;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f11 * this.f19068n) / fArr2[1];
    }

    public int m() {
        return this.E;
    }

    public float n() {
        return this.A;
    }

    public float o() {
        return this.B;
    }

    public float p() {
        return this.C;
    }

    public float q() {
        return this.D;
    }

    RectF r(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i10 = this.f19059e;
        if (i10 == -1 || (viewFindViewById = viewGroup.findViewById(i10)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    int s() {
        return this.f19059e;
    }

    void t(MotionEvent motionEvent, MotionLayout.i iVar, int i10, s sVar) {
        int i11;
        if (this.f19066l) {
            u(motionEvent, iVar, i10, sVar);
            return;
        }
        iVar.b(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f19072r = motionEvent.getRawX();
            this.f19073s = motionEvent.getRawY();
            this.f19069o = false;
            return;
        }
        if (action == 1) {
            this.f19069o = false;
            iVar.e(1000);
            float f10 = iVar.f();
            float fC = iVar.c();
            float progress = this.f19074t.getProgress();
            int i12 = this.f19058d;
            if (i12 != -1) {
                this.f19074t.y0(i12, progress, this.f19062h, this.f19061g, this.f19070p);
            } else {
                float fMin = Math.min(this.f19074t.getWidth(), this.f19074t.getHeight());
                float[] fArr = this.f19070p;
                fArr[1] = this.f19068n * fMin;
                fArr[0] = fMin * this.f19067m;
            }
            float f11 = this.f19067m;
            float[] fArr2 = this.f19070p;
            float fAbs = f11 != 0.0f ? f10 / fArr2[0] : fC / fArr2[1];
            float f12 = !Float.isNaN(fAbs) ? (fAbs / 3.0f) + progress : progress;
            if (f12 == 0.0f || f12 == 1.0f || (i11 = this.f19057c) == 3) {
                if (0.0f >= f12 || 1.0f <= f12) {
                    this.f19074t.setState(MotionLayout.TransitionState.FINISHED);
                    return;
                }
                return;
            }
            float f13 = ((double) f12) < 0.5d ? 0.0f : 1.0f;
            if (i11 == 6) {
                if (progress + fAbs < 0.0f) {
                    fAbs = Math.abs(fAbs);
                }
                f13 = 1.0f;
            }
            if (this.f19057c == 7) {
                if (progress + fAbs > 1.0f) {
                    fAbs = -Math.abs(fAbs);
                }
                f13 = 0.0f;
            }
            this.f19074t.X0(this.f19057c, f13, fAbs);
            if (0.0f >= progress || 1.0f <= progress) {
                this.f19074t.setState(MotionLayout.TransitionState.FINISHED);
                return;
            }
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY = motionEvent.getRawY() - this.f19073s;
        float rawX = motionEvent.getRawX() - this.f19072r;
        if (Math.abs((this.f19067m * rawX) + (this.f19068n * rawY)) > this.f19080z || this.f19069o) {
            float progress2 = this.f19074t.getProgress();
            if (!this.f19069o) {
                this.f19069o = true;
                this.f19074t.setProgress(progress2);
            }
            int i13 = this.f19058d;
            if (i13 != -1) {
                this.f19074t.y0(i13, progress2, this.f19062h, this.f19061g, this.f19070p);
            } else {
                float fMin2 = Math.min(this.f19074t.getWidth(), this.f19074t.getHeight());
                float[] fArr3 = this.f19070p;
                fArr3[1] = this.f19068n * fMin2;
                fArr3[0] = fMin2 * this.f19067m;
            }
            float f14 = this.f19067m;
            float[] fArr4 = this.f19070p;
            if (Math.abs(((f14 * fArr4[0]) + (this.f19068n * fArr4[1])) * this.f19078x) < 0.01d) {
                float[] fArr5 = this.f19070p;
                fArr5[0] = 0.01f;
                fArr5[1] = 0.01f;
            }
            float fMax = Math.max(Math.min(progress2 + (this.f19067m != 0.0f ? rawX / this.f19070p[0] : rawY / this.f19070p[1]), 1.0f), 0.0f);
            if (this.f19057c == 6) {
                fMax = Math.max(fMax, 0.01f);
            }
            if (this.f19057c == 7) {
                fMax = Math.min(fMax, 0.99f);
            }
            float progress3 = this.f19074t.getProgress();
            if (fMax != progress3) {
                if (progress3 == 0.0f || progress3 == 1.0f) {
                    this.f19074t.r0(progress3 == 0.0f);
                }
                this.f19074t.setProgress(fMax);
                iVar.e(1000);
                this.f19074t.M = this.f19067m != 0.0f ? iVar.f() / this.f19070p[0] : iVar.c() / this.f19070p[1];
            } else {
                this.f19074t.M = 0.0f;
            }
            this.f19072r = motionEvent.getRawX();
            this.f19073s = motionEvent.getRawY();
        }
    }

    public String toString() {
        if (Float.isNaN(this.f19067m)) {
            return f.f18721i;
        }
        return this.f19067m + " , " + this.f19068n;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0270  */
    /* JADX WARN: Code duplicated, block: B:58:0x0294  */
    /* JADX WARN: Code duplicated, block: B:61:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x02bd  */
    void u(MotionEvent motionEvent, MotionLayout.i iVar, int i10, s sVar) {
        float left;
        float f10;
        int top;
        int bottom;
        int i11;
        float degrees;
        float f11;
        int i12;
        iVar.b(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f19072r = motionEvent.getRawX();
            this.f19073s = motionEvent.getRawY();
            this.f19069o = false;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            motionEvent.getRawY();
            motionEvent.getRawX();
            float width = this.f19074t.getWidth() / 2.0f;
            float height = this.f19074t.getHeight() / 2.0f;
            int i13 = this.f19065k;
            if (i13 != -1) {
                View viewFindViewById = this.f19074t.findViewById(i13);
                this.f19074t.getLocationOnScreen(this.f19071q);
                float left2 = this.f19071q[0] + ((viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f);
                height = ((viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f) + this.f19071q[1];
                width = left2;
            } else {
                int i14 = this.f19058d;
                if (i14 != -1) {
                    View viewFindViewById2 = this.f19074t.findViewById(this.f19074t.C0(i14).k());
                    if (viewFindViewById2 == null) {
                        Log.e(G, "could not find view to animate to");
                    } else {
                        this.f19074t.getLocationOnScreen(this.f19071q);
                        width = this.f19071q[0] + ((viewFindViewById2.getLeft() + viewFindViewById2.getRight()) / 2.0f);
                        height = this.f19071q[1] + ((viewFindViewById2.getTop() + viewFindViewById2.getBottom()) / 2.0f);
                    }
                }
            }
            float rawX = motionEvent.getRawX() - width;
            float rawY = motionEvent.getRawY() - height;
            double dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width);
            float fAtan2 = (float) (((dAtan2 - Math.atan2(this.f19073s - height, this.f19072r - width)) * 180.0d) / 3.141592653589793d);
            if (fAtan2 > 330.0f) {
                fAtan2 -= 360.0f;
            } else if (fAtan2 < -330.0f) {
                fAtan2 += 360.0f;
            }
            if (Math.abs(fAtan2) > 0.01d || this.f19069o) {
                float progress = this.f19074t.getProgress();
                if (!this.f19069o) {
                    this.f19069o = true;
                    this.f19074t.setProgress(progress);
                }
                int i15 = this.f19058d;
                if (i15 != -1) {
                    this.f19074t.y0(i15, progress, this.f19062h, this.f19061g, this.f19070p);
                    float[] fArr = this.f19070p;
                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                } else {
                    this.f19070p[1] = 360.0f;
                }
                float fMax = Math.max(Math.min(progress + ((fAtan2 * this.f19078x) / this.f19070p[1]), 1.0f), 0.0f);
                float progress2 = this.f19074t.getProgress();
                if (fMax != progress2) {
                    if (progress2 == 0.0f || progress2 == 1.0f) {
                        this.f19074t.r0(progress2 == 0.0f);
                    }
                    this.f19074t.setProgress(fMax);
                    iVar.e(1000);
                    float f12 = iVar.f();
                    double dC = iVar.c();
                    double d10 = f12;
                    this.f19074t.M = (float) Math.toDegrees((float) ((Math.hypot(dC, d10) * Math.sin(Math.atan2(dC, d10) - dAtan2)) / Math.hypot(rawX, rawY)));
                } else {
                    this.f19074t.M = 0.0f;
                }
                this.f19072r = motionEvent.getRawX();
                this.f19073s = motionEvent.getRawY();
                return;
            }
            return;
        }
        this.f19069o = false;
        iVar.e(16);
        float f13 = iVar.f();
        float fC = iVar.c();
        float progress3 = this.f19074t.getProgress();
        float width2 = this.f19074t.getWidth() / 2.0f;
        float height2 = this.f19074t.getHeight() / 2.0f;
        int i16 = this.f19065k;
        if (i16 == -1) {
            int i17 = this.f19058d;
            if (i17 != -1) {
                View viewFindViewById3 = this.f19074t.findViewById(this.f19074t.C0(i17).k());
                this.f19074t.getLocationOnScreen(this.f19071q);
                left = this.f19071q[0] + ((viewFindViewById3.getLeft() + viewFindViewById3.getRight()) / 2.0f);
                f10 = this.f19071q[1];
                top = viewFindViewById3.getTop();
                bottom = viewFindViewById3.getBottom();
            }
            float rawX2 = motionEvent.getRawX() - width2;
            float rawY2 = motionEvent.getRawY() - height2;
            double degrees2 = Math.toDegrees(Math.atan2(rawY2, rawX2));
            i11 = this.f19058d;
            if (i11 != -1) {
                this.f19074t.y0(i11, progress3, this.f19062h, this.f19061g, this.f19070p);
                float[] fArr2 = this.f19070p;
                fArr2[1] = (float) Math.toDegrees(fArr2[1]);
            } else {
                this.f19070p[1] = 360.0f;
            }
            degrees = ((float) (Math.toDegrees(Math.atan2(fC + rawY2, f13 + rawX2)) - degrees2)) * 62.5f;
            if (Float.isNaN(degrees)) {
                f11 = progress3;
            } else {
                f11 = (((degrees * 3.0f) * this.f19078x) / this.f19070p[1]) + progress3;
            }
            if (f11 != 0.0f || f11 == 1.0f || (i12 = this.f19057c) == 3) {
                if (0.0f < f11 || 1.0f <= f11) {
                    this.f19074t.setState(MotionLayout.TransitionState.FINISHED);
                }
                return;
            }
            float fAbs = (degrees * this.f19078x) / this.f19070p[1];
            float f14 = ((double) f11) < 0.5d ? 0.0f : 1.0f;
            if (i12 == 6) {
                if (progress3 + fAbs < 0.0f) {
                    fAbs = Math.abs(fAbs);
                }
                f14 = 1.0f;
            }
            if (this.f19057c == 7) {
                if (progress3 + fAbs > 1.0f) {
                    fAbs = -Math.abs(fAbs);
                }
                f14 = 0.0f;
            }
            this.f19074t.X0(this.f19057c, f14, fAbs * 3.0f);
            if (0.0f >= progress3 || 1.0f <= progress3) {
                this.f19074t.setState(MotionLayout.TransitionState.FINISHED);
                return;
            }
            return;
        }
        View viewFindViewById4 = this.f19074t.findViewById(i16);
        this.f19074t.getLocationOnScreen(this.f19071q);
        left = this.f19071q[0] + ((viewFindViewById4.getLeft() + viewFindViewById4.getRight()) / 2.0f);
        f10 = this.f19071q[1];
        top = viewFindViewById4.getTop();
        bottom = viewFindViewById4.getBottom();
        height2 = f10 + ((top + bottom) / 2.0f);
        width2 = left;
        float rawX3 = motionEvent.getRawX() - width2;
        float rawY3 = motionEvent.getRawY() - height2;
        double degrees3 = Math.toDegrees(Math.atan2(rawY3, rawX3));
        i11 = this.f19058d;
        if (i11 != -1) {
            this.f19074t.y0(i11, progress3, this.f19062h, this.f19061g, this.f19070p);
            float[] fArr3 = this.f19070p;
            fArr3[1] = (float) Math.toDegrees(fArr3[1]);
        } else {
            this.f19070p[1] = 360.0f;
        }
        degrees = ((float) (Math.toDegrees(Math.atan2(fC + rawY3, f13 + rawX3)) - degrees3)) * 62.5f;
        if (Float.isNaN(degrees)) {
            f11 = (((degrees * 3.0f) * this.f19078x) / this.f19070p[1]) + progress3;
        } else {
            f11 = progress3;
        }
        if (f11 != 0.0f) {
        }
        if (0.0f < f11) {
        }
        this.f19074t.setState(MotionLayout.TransitionState.FINISHED);
    }

    void v(float f10, float f11) {
        float progress = this.f19074t.getProgress();
        if (!this.f19069o) {
            this.f19069o = true;
            this.f19074t.setProgress(progress);
        }
        this.f19074t.y0(this.f19058d, progress, this.f19062h, this.f19061g, this.f19070p);
        float f12 = this.f19067m;
        float[] fArr = this.f19070p;
        if (Math.abs((f12 * fArr[0]) + (this.f19068n * fArr[1])) < 0.01d) {
            float[] fArr2 = this.f19070p;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f13 = this.f19067m;
        float fMax = Math.max(Math.min(progress + (f13 != 0.0f ? (f10 * f13) / this.f19070p[0] : (f11 * this.f19068n) / this.f19070p[1]), 1.0f), 0.0f);
        if (fMax != this.f19074t.getProgress()) {
            this.f19074t.setProgress(fMax);
        }
    }

    void w(float f10, float f11) {
        this.f19069o = false;
        float progress = this.f19074t.getProgress();
        this.f19074t.y0(this.f19058d, progress, this.f19062h, this.f19061g, this.f19070p);
        float f12 = this.f19067m;
        float[] fArr = this.f19070p;
        float f13 = f12 != 0.0f ? (f10 * f12) / fArr[0] : (f11 * this.f19068n) / fArr[1];
        if (!Float.isNaN(f13)) {
            progress += f13 / 3.0f;
        }
        if (progress != 0.0f) {
            boolean z10 = progress != 1.0f;
            int i10 = this.f19057c;
            if ((i10 != 3) && z10) {
                this.f19074t.X0(i10, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f13);
            }
        }
    }

    public void x(int i10) {
        this.f19058d = i10;
    }

    void y(int i10) {
        this.F = i10;
    }

    void z(float f10, float f11) {
        this.f19072r = f10;
        this.f19073s = f11;
    }
}
