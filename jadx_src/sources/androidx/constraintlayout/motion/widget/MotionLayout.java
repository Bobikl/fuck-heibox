package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.R;
import androidx.core.view.j1;
import androidx.core.view.w0;
import com.meituan.robust.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements w0 {
    public static final int K4 = 0;
    public static final int L4 = 1;
    public static final int M4 = 2;
    public static final int N4 = 3;
    public static final int O4 = 4;
    public static final int P4 = 5;
    public static final int Q4 = 6;
    public static final int R4 = 7;
    static final String S4 = "MotionLayout";
    private static final boolean T4 = false;
    public static boolean U4 = false;
    public static final int V4 = 0;
    public static final int W4 = 1;
    public static final int X4 = 2;
    static final int Y4 = 50;
    public static final int Z4 = 0;

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    public static final int f18607a5 = 1;

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    public static final int f18608b5 = 2;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final int f18609c5 = 3;

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    private static final float f18610d5 = 1.0E-5f;
    private int A4;
    Rect B4;
    private boolean C4;
    TransitionState D4;
    h E4;
    private boolean F4;
    int G2;
    private boolean G3;
    private RectF G4;
    private View H4;
    private Matrix I4;
    s J;
    private androidx.constraintlayout.motion.utils.a J3;
    ArrayList<Integer> J4;
    Interpolator K;
    private f K3;
    Interpolator L;
    private androidx.constraintlayout.motion.widget.d L3;
    float M;
    boolean M3;
    private int N;
    int N3;
    int O;
    int O3;
    private int P;
    int P3;
    private int Q;
    int Q3;
    private int R;
    boolean R3;
    private boolean S;
    float S3;
    HashMap<View, o> T;
    float T3;
    private long U;
    long U3;
    private float V;
    float V3;
    float W;
    private boolean W3;
    private ArrayList<MotionHelper> X3;
    private ArrayList<MotionHelper> Y3;
    private ArrayList<MotionHelper> Z3;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    float f18611a0;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private CopyOnWriteArrayList<l> f18612a4;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private long f18613b0;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private int f18614b4;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    float f18615c0;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private long f18616c4;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private float f18617d4;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private int f18618e4;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private float f18619f4;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    boolean f18620g4;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    protected boolean f18621h4;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    int f18622i4;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    int f18623j4;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    int f18624k4;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    int f18625l4;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    int f18626m4;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    int f18627n4;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    float f18628o4;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f18629p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private l f18630p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    g f18631p3;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.g f18632p4;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    private boolean f18633q4;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    private k f18634r4;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    private Runnable f18635s4;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    private int[] f18636t4;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    int f18637u4;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    private boolean f18638v4;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    int f18639w4;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    boolean f18640x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private float f18641x2;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    HashMap<View, androidx.constraintlayout.motion.utils.d> f18642x4;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    boolean f18643y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private float f18644y2;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    private int f18645y4;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    private int f18646z4;

    public enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.f18634r4.a();
        }
    }

    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.f18638v4 = false;
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f18649b;

        c(View view) {
            this.f18649b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18649b.setNestedScrollingEnabled(true);
        }
    }

    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.f18634r4.a();
        }
    }

    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18652a;

        static {
            int[] iArr = new int[TransitionState.values().length];
            f18652a = iArr;
            try {
                iArr[TransitionState.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18652a[TransitionState.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18652a[TransitionState.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18652a[TransitionState.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class f extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f18653a = 0.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f18654b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f18655c;

        f() {
        }

        @Override // androidx.constraintlayout.motion.widget.q
        public float a() {
            return MotionLayout.this.M;
        }

        public void b(float f10, float f11, float f12) {
            this.f18653a = f10;
            this.f18654b = f11;
            this.f18655c = f12;
        }

        @Override // androidx.constraintlayout.motion.widget.q, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11;
            float f12;
            float f13 = this.f18653a;
            if (f13 > 0.0f) {
                float f14 = this.f18655c;
                if (f13 / f14 < f10) {
                    f10 = f13 / f14;
                }
                MotionLayout.this.M = f13 - (f14 * f10);
                f11 = (f13 * f10) - (((f14 * f10) * f10) / 2.0f);
                f12 = this.f18654b;
            } else {
                float f15 = this.f18655c;
                if ((-f13) / f15 < f10) {
                    f10 = (-f13) / f15;
                }
                MotionLayout.this.M = (f15 * f10) + f13;
                f11 = (f13 * f10) + (((f15 * f10) * f10) / 2.0f);
                f12 = this.f18654b;
            }
            return f11 + f12;
        }
    }

    public class g {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final int f18657v = 16;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float[] f18658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int[] f18659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float[] f18660c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Path f18661d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Paint f18662e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Paint f18663f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Paint f18664g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Paint f18665h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Paint f18666i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float[] f18667j;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        DashPathEffect f18673p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f18674q;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f18677t;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final int f18668k = -21965;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final int f18669l = -2067046;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final int f18670m = -13391360;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final int f18671n = 1996488704;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final int f18672o = 10;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Rect f18675r = new Rect();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f18676s = false;

        public g() {
            this.f18677t = 1;
            Paint paint = new Paint();
            this.f18662e = paint;
            paint.setAntiAlias(true);
            this.f18662e.setColor(-21965);
            this.f18662e.setStrokeWidth(2.0f);
            this.f18662e.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f18663f = paint2;
            paint2.setAntiAlias(true);
            this.f18663f.setColor(-2067046);
            this.f18663f.setStrokeWidth(2.0f);
            this.f18663f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f18664g = paint3;
            paint3.setAntiAlias(true);
            this.f18664g.setColor(-13391360);
            this.f18664g.setStrokeWidth(2.0f);
            this.f18664g.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f18665h = paint4;
            paint4.setAntiAlias(true);
            this.f18665h.setColor(-13391360);
            this.f18665h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f18667j = new float[8];
            Paint paint5 = new Paint();
            this.f18666i = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f18673p = dashPathEffect;
            this.f18664g.setPathEffect(dashPathEffect);
            this.f18660c = new float[100];
            this.f18659b = new int[50];
            if (this.f18676s) {
                this.f18662e.setStrokeWidth(8.0f);
                this.f18666i.setStrokeWidth(8.0f);
                this.f18663f.setStrokeWidth(8.0f);
                this.f18677t = 4;
            }
        }

        private void c(Canvas canvas) {
            canvas.drawLines(this.f18658a, this.f18662e);
        }

        private void d(Canvas canvas) {
            boolean z10 = false;
            boolean z11 = false;
            for (int i10 = 0; i10 < this.f18674q; i10++) {
                int i11 = this.f18659b[i10];
                if (i11 == 1) {
                    z10 = true;
                }
                if (i11 == 0) {
                    z11 = true;
                }
            }
            if (z10) {
                g(canvas);
            }
            if (z11) {
                e(canvas);
            }
        }

        private void e(Canvas canvas) {
            float[] fArr = this.f18658a;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f10, f12), Math.max(f11, f13), Math.max(f10, f12), Math.max(f11, f13), this.f18664g);
            canvas.drawLine(Math.min(f10, f12), Math.min(f11, f13), Math.min(f10, f12), Math.max(f11, f13), this.f18664g);
        }

        private void f(Canvas canvas, float f10, float f11) {
            float[] fArr = this.f18658a;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[fArr.length - 2];
            float f15 = fArr[fArr.length - 1];
            float fMin = Math.min(f12, f14);
            float fMax = Math.max(f13, f15);
            float fMin2 = f10 - Math.min(f12, f14);
            float fMax2 = Math.max(f13, f15) - f11;
            String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f14 - f12))) + 0.5d)) / 100.0f);
            m(str, this.f18665h);
            canvas.drawText(str, ((fMin2 / 2.0f) - (this.f18675r.width() / 2)) + fMin, f11 - 20.0f, this.f18665h);
            canvas.drawLine(f10, f11, Math.min(f12, f14), f11, this.f18664g);
            String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f15 - f13))) + 0.5d)) / 100.0f);
            m(str2, this.f18665h);
            canvas.drawText(str2, f10 + 5.0f, fMax - ((fMax2 / 2.0f) - (this.f18675r.height() / 2)), this.f18665h);
            canvas.drawLine(f10, f11, f10, Math.max(f13, f15), this.f18664g);
        }

        private void g(Canvas canvas) {
            float[] fArr = this.f18658a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f18664g);
        }

        private void h(Canvas canvas, float f10, float f11) {
            float[] fArr = this.f18658a;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[fArr.length - 2];
            float f15 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f12 - f14, f13 - f15);
            float f16 = f14 - f12;
            float f17 = f15 - f13;
            float f18 = (((f10 - f12) * f16) + ((f11 - f13) * f17)) / (fHypot * fHypot);
            float f19 = f12 + (f16 * f18);
            float f20 = f13 + (f18 * f17);
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f19, f20);
            float fHypot2 = (float) Math.hypot(f19 - f10, f20 - f11);
            String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            m(str, this.f18665h);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.f18675r.width() / 2), -20.0f, this.f18665h);
            canvas.drawLine(f10, f11, f19, f20, this.f18664g);
        }

        private void i(Canvas canvas, float f10, float f11, int i10, int i11) {
            String str = "" + (((int) (((double) (((f10 - (i10 / 2)) * 100.0f) / (MotionLayout.this.getWidth() - i10))) + 0.5d)) / 100.0f);
            m(str, this.f18665h);
            canvas.drawText(str, ((f10 / 2.0f) - (this.f18675r.width() / 2)) + 0.0f, f11 - 20.0f, this.f18665h);
            canvas.drawLine(f10, f11, Math.min(0.0f, 1.0f), f11, this.f18664g);
            String str2 = "" + (((int) (((double) (((f11 - (i11 / 2)) * 100.0f) / (MotionLayout.this.getHeight() - i11))) + 0.5d)) / 100.0f);
            m(str2, this.f18665h);
            canvas.drawText(str2, f10 + 5.0f, 0.0f - ((f11 / 2.0f) - (this.f18675r.height() / 2)), this.f18665h);
            canvas.drawLine(f10, f11, f10, Math.max(0.0f, 1.0f), this.f18664g);
        }

        private void j(Canvas canvas, o oVar) {
            this.f18661d.reset();
            for (int i10 = 0; i10 <= 50; i10++) {
                oVar.g(i10 / 50, this.f18667j, 0);
                Path path = this.f18661d;
                float[] fArr = this.f18667j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f18661d;
                float[] fArr2 = this.f18667j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f18661d;
                float[] fArr3 = this.f18667j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f18661d;
                float[] fArr4 = this.f18667j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f18661d.close();
            }
            this.f18662e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f18661d, this.f18662e);
            canvas.translate(-2.0f, -2.0f);
            this.f18662e.setColor(y1.a.f141526c);
            canvas.drawPath(this.f18661d, this.f18662e);
        }

        private void k(Canvas canvas, int i10, int i11, o oVar) {
            int width;
            int height;
            View view = oVar.f18913b;
            if (view != null) {
                width = view.getWidth();
                height = oVar.f18913b.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            for (int i12 = 1; i12 < i11 - 1; i12++) {
                if (i10 != 4 || this.f18659b[i12 - 1] != 0) {
                    float[] fArr = this.f18660c;
                    int i13 = i12 * 2;
                    float f10 = fArr[i13];
                    float f11 = fArr[i13 + 1];
                    this.f18661d.reset();
                    this.f18661d.moveTo(f10, f11 + 10.0f);
                    this.f18661d.lineTo(f10 + 10.0f, f11);
                    this.f18661d.lineTo(f10, f11 - 10.0f);
                    this.f18661d.lineTo(f10 - 10.0f, f11);
                    this.f18661d.close();
                    int i14 = i12 - 1;
                    oVar.w(i14);
                    if (i10 == 4) {
                        int i15 = this.f18659b[i14];
                        if (i15 == 1) {
                            h(canvas, f10 - 0.0f, f11 - 0.0f);
                        } else if (i15 == 0) {
                            f(canvas, f10 - 0.0f, f11 - 0.0f);
                        } else {
                            if (i15 == 2) {
                                i(canvas, f10 - 0.0f, f11 - 0.0f, width, height);
                            }
                            canvas.drawPath(this.f18661d, this.f18666i);
                        }
                        canvas.drawPath(this.f18661d, this.f18666i);
                    } else {
                        f11 = f11;
                        f10 = f10;
                    }
                    if (i10 == 2) {
                        h(canvas, f10 - 0.0f, f11 - 0.0f);
                    }
                    if (i10 == 3) {
                        f(canvas, f10 - 0.0f, f11 - 0.0f);
                    }
                    if (i10 == 6) {
                        i(canvas, f10 - 0.0f, f11 - 0.0f, width, height);
                    }
                    canvas.drawPath(this.f18661d, this.f18666i);
                }
            }
            float[] fArr2 = this.f18658a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f18663f);
                float[] fArr3 = this.f18658a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f18663f);
            }
        }

        private void l(Canvas canvas, float f10, float f11, float f12, float f13) {
            canvas.drawRect(f10, f11, f12, f13, this.f18664g);
            canvas.drawLine(f10, f11, f12, f13, this.f18664g);
        }

        public void a(Canvas canvas, HashMap<View, o> map, int i10, int i11) {
            if (map == null || map.size() == 0) {
                return;
            }
            canvas.save();
            if (!MotionLayout.this.isInEditMode() && (i11 & 1) == 2) {
                String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.P) + ":" + MotionLayout.this.getProgress();
                canvas.drawText(str, 10.0f, MotionLayout.this.getHeight() - 30, this.f18665h);
                canvas.drawText(str, 11.0f, MotionLayout.this.getHeight() - 29, this.f18662e);
            }
            for (o oVar : map.values()) {
                int iQ = oVar.q();
                if (i11 > 0 && iQ == 0) {
                    iQ = 1;
                }
                if (iQ != 0) {
                    this.f18674q = oVar.e(this.f18660c, this.f18659b);
                    if (iQ >= 1) {
                        int i12 = i10 / 16;
                        float[] fArr = this.f18658a;
                        if (fArr == null || fArr.length != i12 * 2) {
                            this.f18658a = new float[i12 * 2];
                            this.f18661d = new Path();
                        }
                        int i13 = this.f18677t;
                        canvas.translate(i13, i13);
                        this.f18662e.setColor(1996488704);
                        this.f18666i.setColor(1996488704);
                        this.f18663f.setColor(1996488704);
                        this.f18664g.setColor(1996488704);
                        oVar.f(this.f18658a, i12);
                        b(canvas, iQ, this.f18674q, oVar);
                        this.f18662e.setColor(-21965);
                        this.f18663f.setColor(-2067046);
                        this.f18666i.setColor(-2067046);
                        this.f18664g.setColor(-13391360);
                        int i14 = this.f18677t;
                        canvas.translate(-i14, -i14);
                        b(canvas, iQ, this.f18674q, oVar);
                        if (iQ == 5) {
                            j(canvas, oVar);
                        }
                    }
                }
            }
            canvas.restore();
        }

        public void b(Canvas canvas, int i10, int i11, o oVar) {
            if (i10 == 4) {
                d(canvas);
            }
            if (i10 == 2) {
                g(canvas);
            }
            if (i10 == 3) {
                e(canvas);
            }
            c(canvas);
            k(canvas, i10, i11, oVar);
        }

        void m(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f18675r);
        }
    }

    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.constraintlayout.core.widgets.d f18679a = new androidx.constraintlayout.core.widgets.d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.constraintlayout.core.widgets.d f18680b = new androidx.constraintlayout.core.widgets.d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        androidx.constraintlayout.widget.c f18681c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        androidx.constraintlayout.widget.c f18682d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18683e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f18684f;

        h() {
        }

        private void b(int i10, int i11) {
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.O == motionLayout.getStartState()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                androidx.constraintlayout.core.widgets.d dVar = this.f18680b;
                androidx.constraintlayout.widget.c cVar = this.f18682d;
                motionLayout2.x(dVar, optimizationLevel, (cVar == null || cVar.f19556d == 0) ? i10 : i11, (cVar == null || cVar.f19556d == 0) ? i11 : i10);
                androidx.constraintlayout.widget.c cVar2 = this.f18681c;
                if (cVar2 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    androidx.constraintlayout.core.widgets.d dVar2 = this.f18679a;
                    int i12 = cVar2.f19556d;
                    int i13 = i12 == 0 ? i10 : i11;
                    if (i12 == 0) {
                        i10 = i11;
                    }
                    motionLayout3.x(dVar2, optimizationLevel, i13, i10);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.c cVar3 = this.f18681c;
            if (cVar3 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                androidx.constraintlayout.core.widgets.d dVar3 = this.f18679a;
                int i14 = cVar3.f19556d;
                motionLayout4.x(dVar3, optimizationLevel, i14 == 0 ? i10 : i11, i14 == 0 ? i11 : i10);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            androidx.constraintlayout.core.widgets.d dVar4 = this.f18680b;
            androidx.constraintlayout.widget.c cVar4 = this.f18682d;
            int i15 = (cVar4 == null || cVar4.f19556d == 0) ? i10 : i11;
            if (cVar4 == null || cVar4.f19556d == 0) {
                i10 = i11;
            }
            motionLayout5.x(dVar4, optimizationLevel, i15, i10);
        }

        @SuppressLint({"LogConditional"})
        private void d(String str, androidx.constraintlayout.core.widgets.d dVar) {
            String str2 = str + " " + androidx.constraintlayout.motion.widget.c.k((View) dVar.w());
            Log.v(MotionLayout.S4, str2 + "  ========= " + dVar);
            int size = dVar.f2().size();
            for (int i10 = 0; i10 < size; i10++) {
                String str3 = str2 + Constants.ARRAY_TYPE + i10 + "] ";
                ConstraintWidget constraintWidget = dVar.f2().get(i10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                ConstraintAnchor constraintAnchor = constraintWidget.R.f18222f;
                String str4 = lg.a.f131412e;
                sb2.append(constraintAnchor != null ? androidx.exifinterface.media.a.f23244d5 : lg.a.f131412e);
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(constraintWidget.T.f18222f != null ? "B" : lg.a.f131412e);
                String string2 = sb3.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(string2);
                sb4.append(constraintWidget.Q.f18222f != null ? "L" : lg.a.f131412e);
                String string3 = sb4.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(string3);
                if (constraintWidget.S.f18222f != null) {
                    str4 = "R";
                }
                sb5.append(str4);
                String string4 = sb5.toString();
                View view = (View) constraintWidget.w();
                String strK = androidx.constraintlayout.motion.widget.c.k(view);
                if (view instanceof TextView) {
                    strK = strK + "(" + ((Object) ((TextView) view).getText()) + ")";
                }
                Log.v(MotionLayout.S4, str3 + "  " + strK + " " + constraintWidget + " " + string4);
            }
            Log.v(MotionLayout.S4, str2 + " done. ");
        }

        @SuppressLint({"LogConditional"})
        private void e(String str, ConstraintLayout.LayoutParams layoutParams) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" ");
            sb2.append(layoutParams.f19322s != -1 ? "SS" : "__");
            String string = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append(layoutParams.f19320r != -1 ? "|SE" : "|__");
            String string2 = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(string2);
            sb4.append(layoutParams.f19324t != -1 ? "|ES" : "|__");
            String string3 = sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(string3);
            sb5.append(layoutParams.f19326u != -1 ? "|EE" : "|__");
            String string4 = sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append(string4);
            sb6.append(layoutParams.f19292d != -1 ? "|LL" : "|__");
            String string5 = sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(string5);
            sb7.append(layoutParams.f19294e != -1 ? "|LR" : "|__");
            String string6 = sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(string6);
            sb8.append(layoutParams.f19296f != -1 ? "|RL" : "|__");
            String string7 = sb8.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(string7);
            sb9.append(layoutParams.f19298g != -1 ? "|RR" : "|__");
            String string8 = sb9.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append(string8);
            sb10.append(layoutParams.f19300h != -1 ? "|TT" : "|__");
            String string9 = sb10.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append(string9);
            sb11.append(layoutParams.f19302i != -1 ? "|TB" : "|__");
            String string10 = sb11.toString();
            StringBuilder sb12 = new StringBuilder();
            sb12.append(string10);
            sb12.append(layoutParams.f19304j != -1 ? "|BT" : "|__");
            String string11 = sb12.toString();
            StringBuilder sb13 = new StringBuilder();
            sb13.append(string11);
            sb13.append(layoutParams.f19306k != -1 ? "|BB" : "|__");
            Log.v(MotionLayout.S4, str + sb13.toString());
        }

        @SuppressLint({"LogConditional"})
        private void f(String str, ConstraintWidget constraintWidget) {
            String string;
            String string2;
            String string3;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" ");
            String string4 = "__";
            if (constraintWidget.R.f18222f != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(androidx.exifinterface.media.a.f23244d5);
                sb3.append(constraintWidget.R.f18222f.f18221e == ConstraintAnchor.Type.TOP ? androidx.exifinterface.media.a.f23244d5 : "B");
                string = sb3.toString();
            } else {
                string = "__";
            }
            sb2.append(string);
            String string5 = sb2.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(string5);
            if (constraintWidget.T.f18222f != null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("B");
                sb5.append(constraintWidget.T.f18222f.f18221e == ConstraintAnchor.Type.TOP ? androidx.exifinterface.media.a.f23244d5 : "B");
                string2 = sb5.toString();
            } else {
                string2 = "__";
            }
            sb4.append(string2);
            String string6 = sb4.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append(string6);
            if (constraintWidget.Q.f18222f != null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append("L");
                sb7.append(constraintWidget.Q.f18222f.f18221e == ConstraintAnchor.Type.LEFT ? "L" : "R");
                string3 = sb7.toString();
            } else {
                string3 = "__";
            }
            sb6.append(string3);
            String string7 = sb6.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(string7);
            if (constraintWidget.S.f18222f != null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append("R");
                sb9.append(constraintWidget.S.f18222f.f18221e == ConstraintAnchor.Type.LEFT ? "L" : "R");
                string4 = sb9.toString();
            }
            sb8.append(string4);
            Log.v(MotionLayout.S4, str + sb8.toString() + " ---  " + constraintWidget);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void m(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.widget.c cVar) {
            SparseArray<ConstraintWidget> sparseArray = new SparseArray<>();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, dVar);
            sparseArray.put(MotionLayout.this.getId(), dVar);
            if (cVar != null && cVar.f19556d != 0) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.x(this.f18680b, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            for (ConstraintWidget constraintWidget : dVar.f2()) {
                sparseArray.put(((View) constraintWidget.w()).getId(), constraintWidget);
            }
            for (ConstraintWidget constraintWidget2 : dVar.f2()) {
                View view = (View) constraintWidget2.w();
                cVar.u(view.getId(), layoutParams);
                constraintWidget2.W1(cVar.u0(view.getId()));
                constraintWidget2.s1(cVar.n0(view.getId()));
                if (view instanceof ConstraintHelper) {
                    cVar.s((ConstraintHelper) view, constraintWidget2, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).I();
                    }
                }
                layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.h(false, view, constraintWidget2, layoutParams, sparseArray);
                if (cVar.t0(view.getId()) == 1) {
                    constraintWidget2.V1(view.getVisibility());
                } else {
                    constraintWidget2.V1(cVar.s0(view.getId()));
                }
            }
            for (ConstraintWidget constraintWidget3 : dVar.f2()) {
                if (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.l) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) constraintWidget3.w();
                    androidx.constraintlayout.core.widgets.g gVar = (androidx.constraintlayout.core.widgets.g) constraintWidget3;
                    constraintHelper.G(dVar, gVar, sparseArray);
                    ((androidx.constraintlayout.core.widgets.l) gVar).h2();
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:26:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:27:0x0109  */
        /* JADX WARN: Code duplicated, block: B:29:0x010f  */
        /* JADX WARN: Code duplicated, block: B:42:0x013d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:44:0x013d A[SYNTHETIC] */
        /* JADX WARN: Instruction removed from duplicated block: B:29:0x010f, please report this as an issue */
        public void a() {
            ConstraintWidget constraintWidgetG;
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.T.clear();
            SparseArray sparseArray = new SparseArray();
            int[] iArr = new int[childCount];
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = MotionLayout.this.getChildAt(i10);
                o oVar = new o(childAt);
                int id2 = childAt.getId();
                iArr[i10] = id2;
                sparseArray.put(id2, oVar);
                MotionLayout.this.T.put(childAt, oVar);
            }
            int i11 = 0;
            while (i11 < childCount) {
                View childAt2 = MotionLayout.this.getChildAt(i11);
                o oVar2 = MotionLayout.this.T.get(childAt2);
                if (oVar2 == null) {
                    sparseArray = sparseArray;
                } else {
                    if (this.f18681c != null) {
                        ConstraintWidget constraintWidgetG2 = g(this.f18679a, childAt2);
                        if (constraintWidgetG2 != null) {
                            oVar2.V(MotionLayout.this.W0(constraintWidgetG2), this.f18681c, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                        } else if (MotionLayout.this.G2 != 0) {
                            Log.e(MotionLayout.S4, androidx.constraintlayout.motion.widget.c.g() + "no widget for  " + androidx.constraintlayout.motion.widget.c.k(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    } else {
                        if (MotionLayout.this.f18638v4) {
                            androidx.constraintlayout.motion.utils.d dVar = MotionLayout.this.f18642x4.get(childAt2);
                            MotionLayout motionLayout = MotionLayout.this;
                            oVar2.W(dVar, childAt2, motionLayout.f18639w4, motionLayout.f18645y4, MotionLayout.this.f18646z4);
                        }
                        if (this.f18682d == null) {
                            constraintWidgetG = g(this.f18680b, childAt2);
                            if (constraintWidgetG != null) {
                                oVar2.S(MotionLayout.this.W0(constraintWidgetG), this.f18682d, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                            } else if (MotionLayout.this.G2 != 0) {
                                Log.e(MotionLayout.S4, androidx.constraintlayout.motion.widget.c.g() + "no widget for  " + androidx.constraintlayout.motion.widget.c.k(childAt2) + " (" + childAt2.getClass().getName() + ")");
                            }
                        }
                    }
                    if (this.f18682d == null) {
                        constraintWidgetG = g(this.f18680b, childAt2);
                        if (constraintWidgetG != null) {
                            oVar2.S(MotionLayout.this.W0(constraintWidgetG), this.f18682d, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                        } else if (MotionLayout.this.G2 != 0) {
                            Log.e(MotionLayout.S4, androidx.constraintlayout.motion.widget.c.g() + "no widget for  " + androidx.constraintlayout.motion.widget.c.k(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                }
                i11++;
                sparseArray = sparseArray;
            }
            SparseArray sparseArray2 = sparseArray;
            int i12 = 0;
            while (i12 < childCount) {
                SparseArray sparseArray3 = sparseArray2;
                o oVar3 = (o) sparseArray3.get(iArr[i12]);
                int iK = oVar3.k();
                if (iK != -1) {
                    oVar3.a0((o) sparseArray3.get(iK));
                }
                i12++;
                sparseArray2 = sparseArray3;
            }
        }

        void c(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.core.widgets.d dVar2) {
            ConstraintWidget hVar;
            ArrayList<ConstraintWidget> arrayListF2 = dVar.f2();
            HashMap<ConstraintWidget, ConstraintWidget> map = new HashMap<>();
            map.put(dVar, dVar2);
            dVar2.f2().clear();
            dVar2.n(dVar, map);
            for (ConstraintWidget constraintWidget : arrayListF2) {
                if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
                    hVar = new androidx.constraintlayout.core.widgets.a();
                } else if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
                    hVar = new androidx.constraintlayout.core.widgets.f();
                } else if (constraintWidget instanceof androidx.constraintlayout.core.widgets.e) {
                    hVar = new androidx.constraintlayout.core.widgets.e();
                } else if (constraintWidget instanceof androidx.constraintlayout.core.widgets.j) {
                    hVar = new androidx.constraintlayout.core.widgets.j();
                } else {
                    hVar = constraintWidget instanceof androidx.constraintlayout.core.widgets.g ? new androidx.constraintlayout.core.widgets.h() : new ConstraintWidget();
                }
                dVar2.a(hVar);
                map.put(constraintWidget, hVar);
            }
            for (ConstraintWidget constraintWidget2 : arrayListF2) {
                map.get(constraintWidget2).n(constraintWidget2, map);
            }
        }

        ConstraintWidget g(androidx.constraintlayout.core.widgets.d dVar, View view) {
            if (dVar.w() == view) {
                return dVar;
            }
            ArrayList<ConstraintWidget> arrayListF2 = dVar.f2();
            int size = arrayListF2.size();
            for (int i10 = 0; i10 < size; i10++) {
                ConstraintWidget constraintWidget = arrayListF2.get(i10);
                if (constraintWidget.w() == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        void h(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.widget.c cVar, androidx.constraintlayout.widget.c cVar2) {
            this.f18681c = cVar;
            this.f18682d = cVar2;
            this.f18679a = new androidx.constraintlayout.core.widgets.d();
            this.f18680b = new androidx.constraintlayout.core.widgets.d();
            this.f18679a.O2(((ConstraintLayout) MotionLayout.this).f19259d.A2());
            this.f18680b.O2(((ConstraintLayout) MotionLayout.this).f19259d.A2());
            this.f18679a.j2();
            this.f18680b.j2();
            c(((ConstraintLayout) MotionLayout.this).f19259d, this.f18679a);
            c(((ConstraintLayout) MotionLayout.this).f19259d, this.f18680b);
            if (MotionLayout.this.f18611a0 > 0.5d) {
                if (cVar != null) {
                    m(this.f18679a, cVar);
                }
                m(this.f18680b, cVar2);
            } else {
                m(this.f18680b, cVar2);
                if (cVar != null) {
                    m(this.f18679a, cVar);
                }
            }
            this.f18679a.S2(MotionLayout.this.s());
            this.f18679a.U2();
            this.f18680b.S2(MotionLayout.this.s());
            this.f18680b.U2();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    androidx.constraintlayout.core.widgets.d dVar2 = this.f18679a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar2.x1(dimensionBehaviour);
                    this.f18680b.x1(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    androidx.constraintlayout.core.widgets.d dVar3 = this.f18679a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar3.S1(dimensionBehaviour2);
                    this.f18680b.S1(dimensionBehaviour2);
                }
            }
        }

        public boolean i(int i10, int i11) {
            return (i10 == this.f18683e && i11 == this.f18684f) ? false : true;
        }

        public void j(int i10, int i11) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.f18626m4 = mode;
            motionLayout.f18627n4 = mode2;
            motionLayout.getOptimizationLevel();
            b(i10, i11);
            if (((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                b(i10, i11);
                MotionLayout.this.f18622i4 = this.f18679a.j0();
                MotionLayout.this.f18623j4 = this.f18679a.D();
                MotionLayout.this.f18624k4 = this.f18680b.j0();
                MotionLayout.this.f18625l4 = this.f18680b.D();
                MotionLayout motionLayout2 = MotionLayout.this;
                motionLayout2.f18621h4 = (motionLayout2.f18622i4 == motionLayout2.f18624k4 && motionLayout2.f18623j4 == motionLayout2.f18625l4) ? false : true;
            }
            MotionLayout motionLayout3 = MotionLayout.this;
            int i12 = motionLayout3.f18622i4;
            int i13 = motionLayout3.f18623j4;
            int i14 = motionLayout3.f18626m4;
            if (i14 == Integer.MIN_VALUE || i14 == 0) {
                i12 = (int) (i12 + (motionLayout3.f18628o4 * (motionLayout3.f18624k4 - i12)));
            }
            int i15 = i12;
            int i16 = motionLayout3.f18627n4;
            if (i16 == Integer.MIN_VALUE || i16 == 0) {
                i13 = (int) (i13 + (motionLayout3.f18628o4 * (motionLayout3.f18625l4 - i13)));
            }
            MotionLayout.this.w(i10, i11, i15, i13, this.f18679a.J2() || this.f18680b.J2(), this.f18679a.H2() || this.f18680b.H2());
        }

        public void k() {
            j(MotionLayout.this.Q, MotionLayout.this.R);
            MotionLayout.this.V0();
        }

        public void l(int i10, int i11) {
            this.f18683e = i10;
            this.f18684f = i11;
        }
    }

    public interface i {
        float a(int i10);

        void b(MotionEvent motionEvent);

        float c();

        void clear();

        void d(int i10, float f10);

        void e(int i10);

        float f();

        float g(int i10);

        void recycle();
    }

    public static class j implements i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static j f18686b = new j();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        VelocityTracker f18687a;

        private j() {
        }

        public static j h() {
            f18686b.f18687a = VelocityTracker.obtain();
            return f18686b;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public float a(int i10) {
            if (this.f18687a != null) {
                return a(i10);
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public void b(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f18687a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public float c() {
            VelocityTracker velocityTracker = this.f18687a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public void clear() {
            VelocityTracker velocityTracker = this.f18687a;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public void d(int i10, float f10) {
            VelocityTracker velocityTracker = this.f18687a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i10, f10);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public void e(int i10) {
            VelocityTracker velocityTracker = this.f18687a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i10);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public float f() {
            VelocityTracker velocityTracker = this.f18687a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public float g(int i10) {
            VelocityTracker velocityTracker = this.f18687a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(i10);
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public void recycle() {
            VelocityTracker velocityTracker = this.f18687a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f18687a = null;
            }
        }
    }

    public class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f18688a = Float.NaN;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f18689b = Float.NaN;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f18690c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f18691d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final String f18692e = "motion.progress";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final String f18693f = "motion.velocity";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final String f18694g = "motion.StartState";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final String f18695h = "motion.EndState";

        k() {
        }

        void a() {
            int i10 = this.f18690c;
            if (i10 != -1 || this.f18691d != -1) {
                if (i10 == -1) {
                    MotionLayout.this.c1(this.f18691d);
                } else {
                    int i11 = this.f18691d;
                    if (i11 == -1) {
                        MotionLayout.this.setState(i10, -1, -1);
                    } else {
                        MotionLayout.this.setTransition(i10, i11);
                    }
                }
                MotionLayout.this.setState(TransitionState.SETUP);
            }
            if (Float.isNaN(this.f18689b)) {
                if (Float.isNaN(this.f18688a)) {
                    return;
                }
                MotionLayout.this.setProgress(this.f18688a);
            } else {
                MotionLayout.this.setProgress(this.f18688a, this.f18689b);
                this.f18688a = Float.NaN;
                this.f18689b = Float.NaN;
                this.f18690c = -1;
                this.f18691d = -1;
            }
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f18688a);
            bundle.putFloat("motion.velocity", this.f18689b);
            bundle.putInt("motion.StartState", this.f18690c);
            bundle.putInt("motion.EndState", this.f18691d);
            return bundle;
        }

        public void c() {
            this.f18691d = MotionLayout.this.P;
            this.f18690c = MotionLayout.this.N;
            this.f18689b = MotionLayout.this.getVelocity();
            this.f18688a = MotionLayout.this.getProgress();
        }

        public void d(int i10) {
            this.f18691d = i10;
        }

        public void e(float f10) {
            this.f18688a = f10;
        }

        public void f(int i10) {
            this.f18690c = i10;
        }

        public void g(Bundle bundle) {
            this.f18688a = bundle.getFloat("motion.progress");
            this.f18689b = bundle.getFloat("motion.velocity");
            this.f18690c = bundle.getInt("motion.StartState");
            this.f18691d = bundle.getInt("motion.EndState");
        }

        public void h(float f10) {
            this.f18689b = f10;
        }
    }

    public interface l {
        void g(MotionLayout motionLayout, int i10, int i11, float f10);

        void i(MotionLayout motionLayout, int i10);

        void j(MotionLayout motionLayout, int i10, int i11);

        void k(MotionLayout motionLayout, int i10, boolean z10, float f10);
    }

    public MotionLayout(@n0 Context context) {
        super(context);
        this.L = null;
        this.M = 0.0f;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = 0;
        this.R = 0;
        this.S = true;
        this.T = new HashMap<>();
        this.U = 0L;
        this.V = 1.0f;
        this.W = 0.0f;
        this.f18611a0 = 0.0f;
        this.f18615c0 = 0.0f;
        this.f18640x1 = false;
        this.f18643y1 = false;
        this.G2 = 0;
        this.G3 = false;
        this.J3 = new androidx.constraintlayout.motion.utils.a();
        this.K3 = new f();
        this.M3 = true;
        this.R3 = false;
        this.W3 = false;
        this.X3 = null;
        this.Y3 = null;
        this.Z3 = null;
        this.f18612a4 = null;
        this.f18614b4 = 0;
        this.f18616c4 = -1L;
        this.f18617d4 = 0.0f;
        this.f18618e4 = 0;
        this.f18619f4 = 0.0f;
        this.f18620g4 = false;
        this.f18621h4 = false;
        this.f18632p4 = new androidx.constraintlayout.core.motion.utils.g();
        this.f18633q4 = false;
        this.f18635s4 = null;
        this.f18636t4 = null;
        this.f18637u4 = 0;
        this.f18638v4 = false;
        this.f18639w4 = 0;
        this.f18642x4 = new HashMap<>();
        this.B4 = new Rect();
        this.C4 = false;
        this.D4 = TransitionState.UNDEFINED;
        this.E4 = new h();
        this.F4 = false;
        this.G4 = new RectF();
        this.H4 = null;
        this.I4 = null;
        this.J4 = new ArrayList<>();
        G0(null);
    }

    public MotionLayout(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = null;
        this.M = 0.0f;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = 0;
        this.R = 0;
        this.S = true;
        this.T = new HashMap<>();
        this.U = 0L;
        this.V = 1.0f;
        this.W = 0.0f;
        this.f18611a0 = 0.0f;
        this.f18615c0 = 0.0f;
        this.f18640x1 = false;
        this.f18643y1 = false;
        this.G2 = 0;
        this.G3 = false;
        this.J3 = new androidx.constraintlayout.motion.utils.a();
        this.K3 = new f();
        this.M3 = true;
        this.R3 = false;
        this.W3 = false;
        this.X3 = null;
        this.Y3 = null;
        this.Z3 = null;
        this.f18612a4 = null;
        this.f18614b4 = 0;
        this.f18616c4 = -1L;
        this.f18617d4 = 0.0f;
        this.f18618e4 = 0;
        this.f18619f4 = 0.0f;
        this.f18620g4 = false;
        this.f18621h4 = false;
        this.f18632p4 = new androidx.constraintlayout.core.motion.utils.g();
        this.f18633q4 = false;
        this.f18635s4 = null;
        this.f18636t4 = null;
        this.f18637u4 = 0;
        this.f18638v4 = false;
        this.f18639w4 = 0;
        this.f18642x4 = new HashMap<>();
        this.B4 = new Rect();
        this.C4 = false;
        this.D4 = TransitionState.UNDEFINED;
        this.E4 = new h();
        this.F4 = false;
        this.G4 = new RectF();
        this.H4 = null;
        this.I4 = null;
        this.J4 = new ArrayList<>();
        G0(attributeSet);
    }

    public MotionLayout(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.L = null;
        this.M = 0.0f;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = 0;
        this.R = 0;
        this.S = true;
        this.T = new HashMap<>();
        this.U = 0L;
        this.V = 1.0f;
        this.W = 0.0f;
        this.f18611a0 = 0.0f;
        this.f18615c0 = 0.0f;
        this.f18640x1 = false;
        this.f18643y1 = false;
        this.G2 = 0;
        this.G3 = false;
        this.J3 = new androidx.constraintlayout.motion.utils.a();
        this.K3 = new f();
        this.M3 = true;
        this.R3 = false;
        this.W3 = false;
        this.X3 = null;
        this.Y3 = null;
        this.Z3 = null;
        this.f18612a4 = null;
        this.f18614b4 = 0;
        this.f18616c4 = -1L;
        this.f18617d4 = 0.0f;
        this.f18618e4 = 0;
        this.f18619f4 = 0.0f;
        this.f18620g4 = false;
        this.f18621h4 = false;
        this.f18632p4 = new androidx.constraintlayout.core.motion.utils.g();
        this.f18633q4 = false;
        this.f18635s4 = null;
        this.f18636t4 = null;
        this.f18637u4 = 0;
        this.f18638v4 = false;
        this.f18639w4 = 0;
        this.f18642x4 = new HashMap<>();
        this.B4 = new Rect();
        this.C4 = false;
        this.D4 = TransitionState.UNDEFINED;
        this.E4 = new h();
        this.F4 = false;
        this.G4 = new RectF();
        this.H4 = null;
        this.I4 = null;
        this.J4 = new ArrayList<>();
        G0(attributeSet);
    }

    private boolean F0(float f10, float f11, View view, MotionEvent motionEvent) {
        boolean z10;
        if (!(view instanceof ViewGroup)) {
            z10 = false;
            break;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                z10 = false;
                break;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (F0((childAt.getLeft() + f10) - view.getScrollX(), (childAt.getTop() + f11) - view.getScrollY(), childAt, motionEvent)) {
                z10 = true;
                break;
            }
            childCount--;
        }
        if (!z10) {
            this.G4.set(f10, f11, (view.getRight() + f10) - view.getLeft(), (view.getBottom() + f11) - view.getTop());
            if ((motionEvent.getAction() != 0 || this.G4.contains(motionEvent.getX(), motionEvent.getY())) && f0(view, motionEvent, -f10, -f11)) {
                return true;
            }
        }
        return z10;
    }

    private void G0(AttributeSet attributeSet) {
        s sVar;
        U4 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f19390a0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z10 = true;
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.MotionLayout_layoutDescription) {
                    this.J = new s(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == R.styleable.MotionLayout_currentState) {
                    this.O = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == R.styleable.MotionLayout_motionProgress) {
                    this.f18615c0 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.f18640x1 = true;
                } else if (index == R.styleable.MotionLayout_applyMotionScene) {
                    z10 = typedArrayObtainStyledAttributes.getBoolean(index, z10);
                } else if (index == R.styleable.MotionLayout_showPaths) {
                    if (this.G2 == 0) {
                        this.G2 = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == R.styleable.MotionLayout_motionDebug) {
                    this.G2 = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.J == null) {
                Log.e(S4, "WARNING NO app:layoutDescription tag");
            }
            if (!z10) {
                this.J = null;
            }
        }
        if (this.G2 != 0) {
            g0();
        }
        if (this.O != -1 || (sVar = this.J) == null) {
            return;
        }
        this.O = sVar.N();
        this.N = this.J.N();
        this.P = this.J.u();
    }

    private void P0() {
        CopyOnWriteArrayList<l> copyOnWriteArrayList;
        if (this.f18630p2 == null && ((copyOnWriteArrayList = this.f18612a4) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.f18620g4 = false;
        for (Integer num : this.J4) {
            l lVar = this.f18630p2;
            if (lVar != null) {
                lVar.i(this, num.intValue());
            }
            CopyOnWriteArrayList<l> copyOnWriteArrayList2 = this.f18612a4;
            if (copyOnWriteArrayList2 != null) {
                Iterator<l> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().i(this, num.intValue());
                }
            }
        }
        this.J4.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V0() {
        int childCount = getChildCount();
        this.E4.a();
        boolean z10 = true;
        this.f18640x1 = true;
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            sparseArray.put(childAt.getId(), this.T.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int iM = this.J.m();
        if (iM != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                o oVar = this.T.get(getChildAt(i12));
                if (oVar != null) {
                    oVar.T(iM);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.T.size()];
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            o oVar2 = this.T.get(getChildAt(i14));
            if (oVar2.k() != -1) {
                sparseBooleanArray.put(oVar2.k(), true);
                iArr[i13] = oVar2.k();
                i13++;
            }
        }
        if (this.Z3 != null) {
            for (int i15 = 0; i15 < i13; i15++) {
                o oVar3 = this.T.get(findViewById(iArr[i15]));
                if (oVar3 != null) {
                    this.J.z(oVar3);
                }
            }
            Iterator<MotionHelper> it = this.Z3.iterator();
            while (it.hasNext()) {
                it.next().b(this, this.T);
            }
            for (int i16 = 0; i16 < i13; i16++) {
                o oVar4 = this.T.get(findViewById(iArr[i16]));
                if (oVar4 != null) {
                    oVar4.Z(width, height, this.V, getNanoTime());
                }
            }
        } else {
            for (int i17 = 0; i17 < i13; i17++) {
                o oVar5 = this.T.get(findViewById(iArr[i17]));
                if (oVar5 != null) {
                    this.J.z(oVar5);
                    oVar5.Z(width, height, this.V, getNanoTime());
                }
            }
        }
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            o oVar6 = this.T.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && oVar6 != null) {
                this.J.z(oVar6);
                oVar6.Z(width, height, this.V, getNanoTime());
            }
        }
        float fM = this.J.M();
        if (fM != 0.0f) {
            boolean z11 = ((double) fM) < 0.0d;
            float fAbs = Math.abs(fM);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            int i19 = 0;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            while (true) {
                if (i19 >= childCount) {
                    z10 = false;
                    break;
                }
                o oVar7 = this.T.get(getChildAt(i19));
                if (!Float.isNaN(oVar7.f18923l)) {
                    break;
                }
                float fT = oVar7.t();
                float fU = oVar7.u();
                float f10 = z11 ? fU - fT : fU + fT;
                fMin2 = Math.min(fMin2, f10);
                fMax2 = Math.max(fMax2, f10);
                i19++;
            }
            if (!z10) {
                while (i10 < childCount) {
                    o oVar8 = this.T.get(getChildAt(i10));
                    float fT2 = oVar8.t();
                    float fU2 = oVar8.u();
                    float f11 = z11 ? fU2 - fT2 : fU2 + fT2;
                    oVar8.f18925n = 1.0f / (1.0f - fAbs);
                    oVar8.f18924m = fAbs - (((f11 - fMin2) * fAbs) / (fMax2 - fMin2));
                    i10++;
                }
                return;
            }
            for (int i20 = 0; i20 < childCount; i20++) {
                o oVar9 = this.T.get(getChildAt(i20));
                if (!Float.isNaN(oVar9.f18923l)) {
                    fMin = Math.min(fMin, oVar9.f18923l);
                    fMax = Math.max(fMax, oVar9.f18923l);
                }
            }
            while (i10 < childCount) {
                o oVar10 = this.T.get(getChildAt(i10));
                if (!Float.isNaN(oVar10.f18923l)) {
                    oVar10.f18925n = 1.0f / (1.0f - fAbs);
                    if (z11) {
                        oVar10.f18924m = fAbs - (((fMax - oVar10.f18923l) / (fMax - fMin)) * fAbs);
                    } else {
                        oVar10.f18924m = fAbs - (((oVar10.f18923l - fMin) * fAbs) / (fMax - fMin));
                    }
                }
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect W0(ConstraintWidget constraintWidget) {
        this.B4.top = constraintWidget.m0();
        this.B4.left = constraintWidget.l0();
        Rect rect = this.B4;
        int iJ0 = constraintWidget.j0();
        Rect rect2 = this.B4;
        rect.right = iJ0 + rect2.left;
        int iD = constraintWidget.D();
        Rect rect3 = this.B4;
        rect2.bottom = iD + rect3.top;
        return rect3;
    }

    private boolean f0(View view, MotionEvent motionEvent, float f10, float f11) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f10, f11);
            boolean zOnTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f10, -f11);
            return zOnTouchEvent;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(f10, f11);
        if (this.I4 == null) {
            this.I4 = new Matrix();
        }
        matrix.invert(this.I4);
        motionEventObtain.transform(this.I4);
        boolean zOnTouchEvent2 = view.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return zOnTouchEvent2;
    }

    private void g0() {
        s sVar = this.J;
        if (sVar == null) {
            Log.e(S4, "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int iN = sVar.N();
        s sVar2 = this.J;
        i0(iN, sVar2.o(sVar2.N()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        for (s.b bVar : this.J.s()) {
            if (bVar == this.J.f18971c) {
                Log.v(S4, "CHECK: CURRENT");
            }
            k0(bVar);
            int I = bVar.I();
            int iB = bVar.B();
            String strI = androidx.constraintlayout.motion.widget.c.i(getContext(), I);
            String strI2 = androidx.constraintlayout.motion.widget.c.i(getContext(), iB);
            if (sparseIntArray.get(I) == iB) {
                Log.e(S4, "CHECK: two transitions with the same start and end " + strI + "->" + strI2);
            }
            if (sparseIntArray2.get(iB) == I) {
                Log.e(S4, "CHECK: you can't have reverse transitions" + strI + "->" + strI2);
            }
            sparseIntArray.put(I, iB);
            sparseIntArray2.put(iB, I);
            if (this.J.o(I) == null) {
                Log.e(S4, " no such constraintSetStart " + strI);
            }
            if (this.J.o(iB) == null) {
                Log.e(S4, " no such constraintSetEnd " + strI);
            }
        }
    }

    private void i0(int i10, androidx.constraintlayout.widget.c cVar) {
        String strI = androidx.constraintlayout.motion.widget.c.i(getContext(), i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int id2 = childAt.getId();
            if (id2 == -1) {
                Log.w(S4, "CHECK: " + strI + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!");
            }
            if (cVar.k0(id2) == null) {
                Log.w(S4, "CHECK: " + strI + " NO CONSTRAINTS for " + androidx.constraintlayout.motion.widget.c.k(childAt));
            }
        }
        int[] iArrO0 = cVar.o0();
        for (int i12 = 0; i12 < iArrO0.length; i12++) {
            int i13 = iArrO0[i12];
            String strI2 = androidx.constraintlayout.motion.widget.c.i(getContext(), i13);
            if (findViewById(iArrO0[i12]) == null) {
                Log.w(S4, "CHECK: " + strI + " NO View matches id " + strI2);
            }
            if (cVar.n0(i13) == -1) {
                Log.w(S4, "CHECK: " + strI + "(" + strI2 + ") no LAYOUT_HEIGHT");
            }
            if (cVar.u0(i13) == -1) {
                Log.w(S4, "CHECK: " + strI + "(" + strI2 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    private void k0(s.b bVar) {
        if (bVar.I() == bVar.B()) {
            Log.e(S4, "CHECK: start and end constraint set should not be the same!");
        }
    }

    private static boolean k1(float f10, float f11, float f12) {
        if (f10 > 0.0f) {
            float f13 = f10 / f12;
            return f11 + ((f10 * f13) - (((f12 * f13) * f13) / 2.0f)) > 1.0f;
        }
        float f14 = (-f10) / f12;
        return f11 + ((f10 * f14) + (((f12 * f14) * f14) / 2.0f)) < 0.0f;
    }

    private void m0() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            o oVar = this.T.get(childAt);
            if (oVar != null) {
                oVar.U(childAt);
            }
        }
    }

    @SuppressLint({"LogConditional"})
    private void n0() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            Log.v(S4, " " + androidx.constraintlayout.motion.widget.c.g() + " " + androidx.constraintlayout.motion.widget.c.k(this) + " " + androidx.constraintlayout.motion.widget.c.i(getContext(), this.O) + " " + androidx.constraintlayout.motion.widget.c.k(childAt) + childAt.getLeft() + " " + childAt.getTop());
        }
    }

    private void t0() {
        boolean z10;
        float fSignum = Math.signum(this.f18615c0 - this.f18611a0);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.K;
        float interpolation = this.f18611a0 + (!(interpolator instanceof androidx.constraintlayout.motion.utils.a) ? (((nanoTime - this.f18613b0) * fSignum) * 1.0E-9f) / this.V : 0.0f);
        if (this.f18629p1) {
            interpolation = this.f18615c0;
        }
        if ((fSignum <= 0.0f || interpolation < this.f18615c0) && (fSignum > 0.0f || interpolation > this.f18615c0)) {
            z10 = false;
        } else {
            interpolation = this.f18615c0;
            z10 = true;
        }
        if (interpolator != null && !z10) {
            interpolation = this.G3 ? interpolator.getInterpolation((nanoTime - this.U) * 1.0E-9f) : interpolator.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.f18615c0) || (fSignum <= 0.0f && interpolation <= this.f18615c0)) {
            interpolation = this.f18615c0;
        }
        this.f18628o4 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.L;
        if (interpolator2 != null) {
            interpolation = interpolator2.getInterpolation(interpolation);
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            o oVar = this.T.get(childAt);
            if (oVar != null) {
                oVar.L(childAt, interpolation, nanoTime2, this.f18632p4);
            }
        }
        if (this.f18621h4) {
            requestLayout();
        }
    }

    private void u0() {
        CopyOnWriteArrayList<l> copyOnWriteArrayList;
        if ((this.f18630p2 == null && ((copyOnWriteArrayList = this.f18612a4) == null || copyOnWriteArrayList.isEmpty())) || this.f18619f4 == this.W) {
            return;
        }
        if (this.f18618e4 != -1) {
            l lVar = this.f18630p2;
            if (lVar != null) {
                lVar.j(this, this.N, this.P);
            }
            CopyOnWriteArrayList<l> copyOnWriteArrayList2 = this.f18612a4;
            if (copyOnWriteArrayList2 != null) {
                Iterator<l> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().j(this, this.N, this.P);
                }
            }
            this.f18620g4 = true;
        }
        this.f18618e4 = -1;
        float f10 = this.W;
        this.f18619f4 = f10;
        l lVar2 = this.f18630p2;
        if (lVar2 != null) {
            lVar2.g(this, this.N, this.P, f10);
        }
        CopyOnWriteArrayList<l> copyOnWriteArrayList3 = this.f18612a4;
        if (copyOnWriteArrayList3 != null) {
            Iterator<l> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().g(this, this.N, this.P, this.W);
            }
        }
        this.f18620g4 = true;
    }

    private void w0(MotionLayout motionLayout, int i10, int i11) {
        l lVar = this.f18630p2;
        if (lVar != null) {
            lVar.j(this, i10, i11);
        }
        CopyOnWriteArrayList<l> copyOnWriteArrayList = this.f18612a4;
        if (copyOnWriteArrayList != null) {
            Iterator<l> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().j(motionLayout, i10, i11);
            }
        }
    }

    String A0(int i10) {
        s sVar = this.J;
        if (sVar == null) {
            return null;
        }
        return sVar.X(i10);
    }

    public void B0(boolean z10) {
        this.G2 = z10 ? 2 : 1;
        invalidate();
    }

    o C0(int i10) {
        return this.T.get(findViewById(i10));
    }

    public s.b D0(int i10) {
        return this.J.O(i10);
    }

    public void E0(View view, float f10, float f11, float[] fArr, int i10) {
        float f12;
        float fA = this.M;
        float f13 = this.f18611a0;
        if (this.K != null) {
            float fSignum = Math.signum(this.f18615c0 - f13);
            float interpolation = this.K.getInterpolation(this.f18611a0 + f18610d5);
            float interpolation2 = this.K.getInterpolation(this.f18611a0);
            fA = (fSignum * ((interpolation - interpolation2) / f18610d5)) / this.V;
            f12 = interpolation2;
        } else {
            f12 = f13;
        }
        Interpolator interpolator = this.K;
        if (interpolator instanceof q) {
            fA = ((q) interpolator).a();
        }
        o oVar = this.T.get(view);
        if ((i10 & 1) == 0) {
            oVar.C(f12, view.getWidth(), view.getHeight(), f10, f11, fArr);
        } else {
            oVar.p(f12, f10, f11, fArr);
        }
        if (i10 < 2) {
            fArr[0] = fArr[0] * fA;
            fArr[1] = fArr[1] * fA;
        }
    }

    @Override // androidx.core.view.v0
    public void G(@n0 View view, int i10, int i11, int i12, int i13, int i14) {
    }

    public boolean H0() {
        return this.C4;
    }

    public boolean I0() {
        return this.f18638v4;
    }

    public boolean J0() {
        return this.S;
    }

    public boolean K0(int i10) {
        s sVar = this.J;
        if (sVar != null) {
            return sVar.U(i10);
        }
        return false;
    }

    public void L0(int i10) {
        if (!isAttachedToWindow()) {
            this.O = i10;
        }
        if (this.N == i10) {
            setProgress(0.0f);
        } else if (this.P == i10) {
            setProgress(1.0f);
        } else {
            setTransition(i10, i10);
        }
    }

    int M0(String str) {
        s sVar = this.J;
        if (sVar == null) {
            return 0;
        }
        return sVar.W(str);
    }

    protected i N0() {
        return j.h();
    }

    @Override // androidx.core.view.v0
    public void O(@n0 View view, int i10, int i11, @n0 int[] iArr, int i12) {
        s.b bVar;
        v vVarJ;
        int iS;
        s sVar = this.J;
        if (sVar == null || (bVar = sVar.f18971c) == null || !bVar.K()) {
            return;
        }
        int i13 = -1;
        if (!bVar.K() || (vVarJ = bVar.J()) == null || (iS = vVarJ.s()) == -1 || view.getId() == iS) {
            if (sVar.D()) {
                v vVarJ2 = bVar.J();
                if (vVarJ2 != null && (vVarJ2.f() & 4) != 0) {
                    i13 = i11;
                }
                float f10 = this.W;
                if ((f10 == 1.0f || f10 == 0.0f) && view.canScrollVertically(i13)) {
                    return;
                }
            }
            if (bVar.J() != null && (bVar.J().f() & 1) != 0) {
                float F = sVar.F(i10, i11);
                float f11 = this.f18611a0;
                if ((f11 <= 0.0f && F < 0.0f) || (f11 >= 1.0f && F > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new c(view));
                    return;
                }
            }
            float f12 = this.W;
            long nanoTime = getNanoTime();
            float f13 = i10;
            this.S3 = f13;
            float f14 = i11;
            this.T3 = f14;
            this.V3 = (float) ((nanoTime - this.U3) * 1.0E-9d);
            this.U3 = nanoTime;
            sVar.d0(f13, f14);
            if (f12 != this.W) {
                iArr[0] = i10;
                iArr[1] = i11;
            }
            s0(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.R3 = true;
        }
    }

    void O0() {
        s sVar = this.J;
        if (sVar == null) {
            return;
        }
        if (sVar.i(this, this.O)) {
            requestLayout();
            return;
        }
        int i10 = this.O;
        if (i10 != -1) {
            this.J.f(this, i10);
        }
        if (this.J.r0()) {
            this.J.p0();
        }
    }

    @Deprecated
    public void Q0() {
        Log.e(S4, "This method is deprecated. Please call rebuildScene() instead.");
        R0();
    }

    public void R0() {
        this.E4.k();
        invalidate();
    }

    public boolean S0(l lVar) {
        CopyOnWriteArrayList<l> copyOnWriteArrayList = this.f18612a4;
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.remove(lVar);
    }

    @androidx.annotation.w0(api = 17)
    public void T0(int i10, int i11) {
        this.f18638v4 = true;
        this.f18645y4 = getWidth();
        this.f18646z4 = getHeight();
        int rotation = getDisplay().getRotation();
        this.f18639w4 = (rotation + 1) % 4 <= (this.A4 + 1) % 4 ? 2 : 1;
        this.A4 = rotation;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            androidx.constraintlayout.motion.utils.d dVar = this.f18642x4.get(childAt);
            if (dVar == null) {
                dVar = new androidx.constraintlayout.motion.utils.d();
                this.f18642x4.put(childAt, dVar);
            }
            dVar.a(childAt);
        }
        this.N = -1;
        this.P = i10;
        this.J.n0(-1, i10);
        this.E4.h(this.f19259d, null, this.J.o(this.P));
        this.W = 0.0f;
        this.f18611a0 = 0.0f;
        invalidate();
        a1(new b());
        if (i11 > 0) {
            this.V = i11 / 1000.0f;
        }
    }

    public void U0(int i10) {
        if (getCurrentState() == -1) {
            c1(i10);
            return;
        }
        int[] iArr = this.f18636t4;
        if (iArr == null) {
            this.f18636t4 = new int[4];
        } else if (iArr.length <= this.f18637u4) {
            this.f18636t4 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f18636t4;
        int i11 = this.f18637u4;
        this.f18637u4 = i11 + 1;
        iArr2[i11] = i10;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
    public void X0(int i10, float f10, float f11) {
        if (this.J == null || this.f18611a0 == f10) {
            return;
        }
        this.G3 = true;
        this.U = getNanoTime();
        this.V = this.J.t() / 1000.0f;
        this.f18615c0 = f10;
        this.f18640x1 = true;
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            if (i10 != 1 || i10 == 7) {
                f10 = 0.0f;
            } else if (i10 == 2 || i10 == 6) {
                f10 = 1.0f;
            }
            if (this.J.n() == 0) {
                this.J3.b(this.f18611a0, f10, f11, this.V, this.J.B(), this.J.C());
            } else {
                this.J3.f(this.f18611a0, f10, f11, this.J.J(), this.J.K(), this.J.I(), this.J.L(), this.J.H());
            }
            int i11 = this.O;
            this.f18615c0 = f10;
            this.O = i11;
            this.K = this.J3;
        } else if (i10 == 4) {
            this.K3.b(f11, this.f18611a0, this.J.B());
            this.K = this.K3;
        } else if (i10 != 5) {
            if (i10 == 6 || i10 == 7) {
                if (i10 != 1) {
                    f10 = 0.0f;
                } else {
                    f10 = 0.0f;
                }
                if (this.J.n() == 0) {
                    this.J3.b(this.f18611a0, f10, f11, this.V, this.J.B(), this.J.C());
                } else {
                    this.J3.f(this.f18611a0, f10, f11, this.J.J(), this.J.K(), this.J.I(), this.J.L(), this.J.H());
                }
                int i12 = this.O;
                this.f18615c0 = f10;
                this.O = i12;
                this.K = this.J3;
            }
        } else if (k1(f11, this.f18611a0, this.J.B())) {
            this.K3.b(f11, this.f18611a0, this.J.B());
            this.K = this.K3;
        } else {
            this.J3.b(this.f18611a0, f10, f11, this.V, this.J.B(), this.J.C());
            this.M = 0.0f;
            int i13 = this.O;
            this.f18615c0 = f10;
            this.O = i13;
            this.K = this.J3;
        }
        this.f18629p1 = false;
        this.U = getNanoTime();
        invalidate();
    }

    public void Y0(float f10, float f11) {
        if (this.J == null || this.f18611a0 == f10) {
            return;
        }
        this.G3 = true;
        this.U = getNanoTime();
        this.V = this.J.t() / 1000.0f;
        this.f18615c0 = f10;
        this.f18640x1 = true;
        this.J3.f(this.f18611a0, f10, f11, this.J.J(), this.J.K(), this.J.I(), this.J.L(), this.J.H());
        int i10 = this.O;
        this.f18615c0 = f10;
        this.O = i10;
        this.K = this.J3;
        this.f18629p1 = false;
        this.U = getNanoTime();
        invalidate();
    }

    public void Z0() {
        d0(1.0f);
        this.f18635s4 = null;
    }

    public void a1(Runnable runnable) {
        d0(1.0f);
        this.f18635s4 = runnable;
    }

    public void b1() {
        d0(0.0f);
    }

    public void c0(l lVar) {
        if (this.f18612a4 == null) {
            this.f18612a4 = new CopyOnWriteArrayList<>();
        }
        this.f18612a4.add(lVar);
    }

    public void c1(int i10) {
        if (isAttachedToWindow()) {
            e1(i10, -1, -1);
            return;
        }
        if (this.f18634r4 == null) {
            this.f18634r4 = new k();
        }
        this.f18634r4.d(i10);
    }

    void d0(float f10) {
        s sVar = this.J;
        if (sVar == null) {
            return;
        }
        float f11 = this.f18611a0;
        float f12 = this.W;
        if (f11 != f12 && this.f18629p1) {
            this.f18611a0 = f12;
        }
        float f13 = this.f18611a0;
        if (f13 == f10) {
            return;
        }
        this.G3 = false;
        this.f18615c0 = f10;
        this.V = sVar.t() / 1000.0f;
        setProgress(this.f18615c0);
        this.K = null;
        this.L = this.J.x();
        this.f18629p1 = false;
        this.U = getNanoTime();
        this.f18640x1 = true;
        this.W = f13;
        this.f18611a0 = f13;
        invalidate();
    }

    public void d1(int i10, int i11) {
        if (isAttachedToWindow()) {
            f1(i10, -1, -1, i11);
            return;
        }
        if (this.f18634r4 == null) {
            this.f18634r4 = new k();
        }
        this.f18634r4.d(i10);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        a0 a0Var;
        ArrayList<MotionHelper> arrayList = this.Z3;
        if (arrayList != null) {
            Iterator<MotionHelper> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().c(canvas);
            }
        }
        s0(false);
        s sVar = this.J;
        if (sVar != null && (a0Var = sVar.f18987s) != null) {
            a0Var.d();
        }
        super.dispatchDraw(canvas);
        if (this.J == null) {
            return;
        }
        if ((this.G2 & 1) == 1 && !isInEditMode()) {
            this.f18614b4++;
            long nanoTime = getNanoTime();
            long j10 = this.f18616c4;
            if (j10 != -1) {
                long j11 = nanoTime - j10;
                if (j11 > 200000000) {
                    this.f18617d4 = ((int) ((this.f18614b4 / (j11 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f18614b4 = 0;
                    this.f18616c4 = nanoTime;
                }
            } else {
                this.f18616c4 = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            String str = this.f18617d4 + " fps " + androidx.constraintlayout.motion.widget.c.l(this, this.N) + " -> ";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(androidx.constraintlayout.motion.widget.c.l(this, this.P));
            sb2.append(" (progress: ");
            sb2.append(progress);
            sb2.append(" ) state=");
            int i10 = this.O;
            sb2.append(i10 == -1 ? "undefined" : androidx.constraintlayout.motion.widget.c.l(this, i10));
            String string = sb2.toString();
            paint.setColor(j1.f21601t);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.G2 > 1) {
            if (this.f18631p3 == null) {
                this.f18631p3 = new g();
            }
            this.f18631p3.a(canvas, this.T, this.J.t(), this.G2);
        }
        ArrayList<MotionHelper> arrayList2 = this.Z3;
        if (arrayList2 != null) {
            Iterator<MotionHelper> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().h(canvas);
            }
        }
    }

    public boolean e0(int i10, o oVar) {
        s sVar = this.J;
        if (sVar != null) {
            return sVar.h(i10, oVar);
        }
        return false;
    }

    public void e1(int i10, int i11, int i12) {
        f1(i10, i11, i12, -1);
    }

    public void f1(int i10, int i11, int i12, int i13) {
        androidx.constraintlayout.widget.f fVar;
        int iA;
        s sVar = this.J;
        if (sVar != null && (fVar = sVar.f18970b) != null && (iA = fVar.a(this.O, i10, i11, i12)) != -1) {
            i10 = iA;
        }
        int i14 = this.O;
        if (i14 == i10) {
            return;
        }
        if (this.N == i10) {
            d0(0.0f);
            if (i13 > 0) {
                this.V = i13 / 1000.0f;
                return;
            }
            return;
        }
        if (this.P == i10) {
            d0(1.0f);
            if (i13 > 0) {
                this.V = i13 / 1000.0f;
                return;
            }
            return;
        }
        this.P = i10;
        if (i14 != -1) {
            setTransition(i14, i10);
            d0(1.0f);
            this.f18611a0 = 0.0f;
            Z0();
            if (i13 > 0) {
                this.V = i13 / 1000.0f;
                return;
            }
            return;
        }
        this.G3 = false;
        this.f18615c0 = 1.0f;
        this.W = 0.0f;
        this.f18611a0 = 0.0f;
        this.f18613b0 = getNanoTime();
        this.U = getNanoTime();
        this.f18629p1 = false;
        this.K = null;
        if (i13 == -1) {
            this.V = this.J.t() / 1000.0f;
        }
        this.N = -1;
        this.J.n0(-1, this.P);
        SparseArray sparseArray = new SparseArray();
        if (i13 == 0) {
            this.V = this.J.t() / 1000.0f;
        } else if (i13 > 0) {
            this.V = i13 / 1000.0f;
        }
        int childCount = getChildCount();
        this.T.clear();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            this.T.put(childAt, new o(childAt));
            sparseArray.put(childAt.getId(), this.T.get(childAt));
        }
        this.f18640x1 = true;
        this.E4.h(this.f19259d, null, this.J.o(i10));
        R0();
        this.E4.a();
        m0();
        int width = getWidth();
        int height = getHeight();
        if (this.Z3 != null) {
            for (int i16 = 0; i16 < childCount; i16++) {
                o oVar = this.T.get(getChildAt(i16));
                if (oVar != null) {
                    this.J.z(oVar);
                }
            }
            Iterator<MotionHelper> it = this.Z3.iterator();
            while (it.hasNext()) {
                it.next().b(this, this.T);
            }
            for (int i17 = 0; i17 < childCount; i17++) {
                o oVar2 = this.T.get(getChildAt(i17));
                if (oVar2 != null) {
                    oVar2.Z(width, height, this.V, getNanoTime());
                }
            }
        } else {
            for (int i18 = 0; i18 < childCount; i18++) {
                o oVar3 = this.T.get(getChildAt(i18));
                if (oVar3 != null) {
                    this.J.z(oVar3);
                    oVar3.Z(width, height, this.V, getNanoTime());
                }
            }
        }
        float fM = this.J.M();
        if (fM != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i19 = 0; i19 < childCount; i19++) {
                o oVar4 = this.T.get(getChildAt(i19));
                float fU = oVar4.u() + oVar4.t();
                fMin = Math.min(fMin, fU);
                fMax = Math.max(fMax, fU);
            }
            for (int i20 = 0; i20 < childCount; i20++) {
                o oVar5 = this.T.get(getChildAt(i20));
                float fT = oVar5.t();
                float fU2 = oVar5.u();
                oVar5.f18925n = 1.0f / (1.0f - fM);
                oVar5.f18924m = fM - ((((fT + fU2) - fMin) * fM) / (fMax - fMin));
            }
        }
        this.W = 0.0f;
        this.f18611a0 = 0.0f;
        this.f18640x1 = true;
        invalidate();
    }

    public void g1() {
        this.E4.h(this.f19259d, this.J.o(this.N), this.J.o(this.P));
        R0();
    }

    public int[] getConstraintSetIds() {
        s sVar = this.J;
        if (sVar == null) {
            return null;
        }
        return sVar.r();
    }

    public int getCurrentState() {
        return this.O;
    }

    public ArrayList<s.b> getDefinedTransitions() {
        s sVar = this.J;
        if (sVar == null) {
            return null;
        }
        return sVar.s();
    }

    public androidx.constraintlayout.motion.widget.d getDesignTool() {
        if (this.L3 == null) {
            this.L3 = new androidx.constraintlayout.motion.widget.d(this);
        }
        return this.L3;
    }

    public int getEndState() {
        return this.P;
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f18611a0;
    }

    public s getScene() {
        return this.J;
    }

    public int getStartState() {
        return this.N;
    }

    public float getTargetPosition() {
        return this.f18615c0;
    }

    public Bundle getTransitionState() {
        if (this.f18634r4 == null) {
            this.f18634r4 = new k();
        }
        this.f18634r4.c();
        return this.f18634r4.b();
    }

    public long getTransitionTimeMs() {
        s sVar = this.J;
        if (sVar != null) {
            this.V = sVar.t() / 1000.0f;
        }
        return (long) (this.V * 1000.0f);
    }

    public float getVelocity() {
        return this.M;
    }

    @Override // androidx.core.view.w0
    public void h0(@n0 View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.R3 || i10 != 0 || i11 != 0) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
        this.R3 = false;
    }

    public void h1(int i10, androidx.constraintlayout.widget.c cVar) {
        s sVar = this.J;
        if (sVar != null) {
            sVar.j0(i10, cVar);
        }
        g1();
        if (this.O == i10) {
            cVar.r(this);
        }
    }

    public void i1(int i10, androidx.constraintlayout.widget.c cVar, int i11) {
        if (this.J != null && this.O == i10) {
            int i12 = R.id.view_transition;
            h1(i12, z0(i10));
            setState(i12, -1, -1);
            h1(i10, cVar);
            s.b bVar = new s.b(-1, this.J, i12, i10);
            bVar.O(i11);
            setTransition(bVar);
            Z0();
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // androidx.core.view.v0
    public void j(@n0 View view, @n0 View view2, int i10, int i11) {
        this.U3 = getNanoTime();
        this.V3 = 0.0f;
        this.S3 = 0.0f;
        this.T3 = 0.0f;
    }

    @Override // androidx.core.view.v0
    public boolean j0(@n0 View view, @n0 View view2, int i10, int i11) {
        s.b bVar;
        s sVar = this.J;
        return (sVar == null || (bVar = sVar.f18971c) == null || bVar.J() == null || (this.J.f18971c.J().f() & 2) != 0) ? false : true;
    }

    public void j1(int i10, View... viewArr) {
        s sVar = this.J;
        if (sVar != null) {
            sVar.t0(i10, viewArr);
        } else {
            Log.e(S4, " no motionScene");
        }
    }

    @Override // androidx.core.view.v0
    public void k(@n0 View view, int i10) {
        s sVar = this.J;
        if (sVar != null) {
            float f10 = this.V3;
            if (f10 == 0.0f) {
                return;
            }
            sVar.e0(this.S3 / f10, this.T3 / f10);
        }
    }

    public androidx.constraintlayout.widget.c l0(int i10) {
        s sVar = this.J;
        if (sVar == null) {
            return null;
        }
        androidx.constraintlayout.widget.c cVarO = sVar.o(i10);
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.I(cVarO);
        return cVar;
    }

    void o0(boolean z10) {
        s sVar = this.J;
        if (sVar == null) {
            return;
        }
        sVar.k(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        s.b bVar;
        int i10;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.A4 = display.getRotation();
        }
        s sVar = this.J;
        if (sVar != null && (i10 = this.O) != -1) {
            androidx.constraintlayout.widget.c cVarO = sVar.o(i10);
            this.J.h0(this);
            ArrayList<MotionHelper> arrayList = this.Z3;
            if (arrayList != null) {
                Iterator<MotionHelper> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().a(this);
                }
            }
            if (cVarO != null) {
                cVarO.r(this);
            }
            this.N = this.O;
        }
        O0();
        k kVar = this.f18634r4;
        if (kVar != null) {
            if (this.C4) {
                post(new d());
                return;
            } else {
                kVar.a();
                return;
            }
        }
        s sVar2 = this.J;
        if (sVar2 == null || (bVar = sVar2.f18971c) == null || bVar.z() != 4) {
            return;
        }
        Z0();
        setState(TransitionState.SETUP);
        setState(TransitionState.MOVING);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        v vVarJ;
        int iS;
        RectF rectFR;
        s sVar = this.J;
        if (sVar != null && this.S) {
            a0 a0Var = sVar.f18987s;
            if (a0Var != null) {
                a0Var.l(motionEvent);
            }
            s.b bVar = this.J.f18971c;
            if (bVar != null && bVar.K() && (vVarJ = bVar.J()) != null && ((motionEvent.getAction() != 0 || (rectFR = vVarJ.r(this, new RectF())) == null || rectFR.contains(motionEvent.getX(), motionEvent.getY())) && (iS = vVarJ.s()) != -1)) {
                View view = this.H4;
                if (view == null || view.getId() != iS) {
                    this.H4 = findViewById(iS);
                }
                View view2 = this.H4;
                if (view2 != null) {
                    this.G4.set(view2.getLeft(), this.H4.getTop(), this.H4.getRight(), this.H4.getBottom());
                    if (this.G4.contains(motionEvent.getX(), motionEvent.getY()) && !F0(this.H4.getLeft(), this.H4.getTop(), this.H4, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f18633q4 = true;
        try {
            if (this.J == null) {
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            }
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            if (this.P3 != i14 || this.Q3 != i15) {
                R0();
                s0(true);
            }
            this.P3 = i14;
            this.Q3 = i15;
            this.N3 = i14;
            this.O3 = i15;
        } finally {
            this.f18633q4 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.J == null) {
            super.onMeasure(i10, i11);
            return;
        }
        boolean z10 = false;
        boolean z11 = (this.Q == i10 && this.R == i11) ? false : true;
        if (this.F4) {
            this.F4 = false;
            O0();
            P0();
            z11 = true;
        }
        if (this.f19264i) {
            z11 = true;
        }
        this.Q = i10;
        this.R = i11;
        int iN = this.J.N();
        int iU = this.J.u();
        if ((z11 || this.E4.i(iN, iU)) && this.N != -1) {
            super.onMeasure(i10, i11);
            this.E4.h(this.f19259d, this.J.o(iN), this.J.o(iU));
            this.E4.k();
            this.E4.l(iN, iU);
        } else {
            if (z11) {
                super.onMeasure(i10, i11);
            }
            z10 = true;
        }
        if (this.f18621h4 || z10) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int iJ0 = this.f19259d.j0() + getPaddingLeft() + getPaddingRight();
            int iD = this.f19259d.D() + paddingTop;
            int i12 = this.f18626m4;
            if (i12 == Integer.MIN_VALUE || i12 == 0) {
                int i13 = this.f18622i4;
                iJ0 = (int) (i13 + (this.f18628o4 * (this.f18624k4 - i13)));
                requestLayout();
            }
            int i14 = this.f18627n4;
            if (i14 == Integer.MIN_VALUE || i14 == 0) {
                int i15 = this.f18623j4;
                iD = (int) (i15 + (this.f18628o4 * (this.f18625l4 - i15)));
                requestLayout();
            }
            setMeasuredDimension(iJ0, iD);
        }
        t0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onNestedFling(@n0 View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onNestedPreFling(@n0 View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        s sVar = this.J;
        if (sVar != null) {
            sVar.m0(s());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        s sVar = this.J;
        if (sVar == null || !this.S || !sVar.r0()) {
            return super.onTouchEvent(motionEvent);
        }
        s.b bVar = this.J.f18971c;
        if (bVar != null && !bVar.K()) {
            return super.onTouchEvent(motionEvent);
        }
        this.J.f0(motionEvent, getCurrentState(), this);
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f18612a4 == null) {
                this.f18612a4 = new CopyOnWriteArrayList<>();
            }
            this.f18612a4.add(motionHelper);
            if (motionHelper.d()) {
                if (this.X3 == null) {
                    this.X3 = new ArrayList<>();
                }
                this.X3.add(motionHelper);
            }
            if (motionHelper.e()) {
                if (this.Y3 == null) {
                    this.Y3 = new ArrayList<>();
                }
                this.Y3.add(motionHelper);
            }
            if (motionHelper.f()) {
                if (this.Z3 == null) {
                    this.Z3 = new ArrayList<>();
                }
                this.Z3.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.X3;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.Y3;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void p0(int i10, boolean z10) {
        s.b bVarD0 = D0(i10);
        if (z10) {
            bVarD0.Q(true);
            return;
        }
        s sVar = this.J;
        if (bVarD0 == sVar.f18971c) {
            for (s.b bVar : sVar.Q(this.O)) {
                if (bVar.K()) {
                    this.J.f18971c = bVar;
                    break;
                }
            }
        }
        bVarD0.Q(false);
    }

    public void q0(int i10, boolean z10) {
        s sVar = this.J;
        if (sVar != null) {
            sVar.l(i10, z10);
        }
    }

    void r0(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            o oVar = this.T.get(getChildAt(i10));
            if (oVar != null) {
                oVar.i(z10);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        s sVar;
        s.b bVar;
        if (this.f18621h4 || this.O != -1 || (sVar = this.J) == null || (bVar = sVar.f18971c) == null || bVar.E() != 0) {
            super.requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:127:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:129:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:143:0x0221  */
    /* JADX WARN: Code duplicated, block: B:180:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2 A[PHI: r3
  0x00e2: PHI (r3v50 float) = (r3v49 float), (r3v51 float), (r3v51 float) binds: [B:47:0x00ab, B:58:0x00d6, B:60:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0110  */
    /* JADX WARN: Code duplicated, block: B:74:0x0117  */
    /* JADX WARN: Code duplicated, block: B:86:0x0137  */
    /* JADX WARN: Code duplicated, block: B:89:0x014e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0150  */
    /* JADX WARN: Code duplicated, block: B:93:0x0158  */
    /* JADX WARN: Code duplicated, block: B:96:0x016f  */
    /* JADX WARN: Code duplicated, block: B:98:0x017f  */
    void s0(boolean z10) {
        boolean z11;
        char c10;
        int childCount;
        long nanoTime;
        Interpolator interpolator;
        float interpolation;
        Interpolator interpolator2;
        int i10;
        int i11;
        int i12;
        int i13;
        View childAt;
        o oVar;
        boolean z12;
        if (this.f18613b0 == -1) {
            this.f18613b0 = getNanoTime();
        }
        float f10 = this.f18611a0;
        if (f10 > 0.0f && f10 < 1.0f) {
            this.O = -1;
        }
        boolean z13 = false;
        if (this.W3 || (this.f18640x1 && (z10 || this.f18615c0 != f10))) {
            float fSignum = Math.signum(this.f18615c0 - f10);
            long nanoTime2 = getNanoTime();
            Interpolator interpolator3 = this.K;
            float f11 = !(interpolator3 instanceof q) ? (((nanoTime2 - this.f18613b0) * fSignum) * 1.0E-9f) / this.V : 0.0f;
            float f12 = this.f18611a0 + f11;
            if (this.f18629p1) {
                f12 = this.f18615c0;
            }
            if ((fSignum <= 0.0f || f12 < this.f18615c0) && (fSignum > 0.0f || f12 > this.f18615c0)) {
                z11 = false;
            } else {
                f12 = this.f18615c0;
                this.f18640x1 = false;
                z11 = true;
            }
            this.f18611a0 = f12;
            this.W = f12;
            this.f18613b0 = nanoTime2;
            if (interpolator3 == null || z11) {
                this.M = f11;
            } else {
                if (this.G3) {
                    float interpolation2 = interpolator3.getInterpolation((nanoTime2 - this.U) * 1.0E-9f);
                    Interpolator interpolator4 = this.K;
                    androidx.constraintlayout.motion.utils.a aVar = this.J3;
                    c10 = interpolator4 == aVar ? aVar.e() ? (char) 2 : (char) 1 : (char) 0;
                    this.f18611a0 = interpolation2;
                    this.f18613b0 = nanoTime2;
                    Interpolator interpolator5 = this.K;
                    if (interpolator5 instanceof q) {
                        float fA = ((q) interpolator5).a();
                        this.M = fA;
                        if (Math.abs(fA) * this.V <= f18610d5 && c10 == 2) {
                            this.f18640x1 = false;
                        }
                        if (fA > 0.0f && interpolation2 >= 1.0f) {
                            this.f18611a0 = 1.0f;
                            this.f18640x1 = false;
                            interpolation2 = 1.0f;
                        }
                        if (fA >= 0.0f || interpolation2 > 0.0f) {
                            f12 = interpolation2;
                        } else {
                            this.f18611a0 = 0.0f;
                            this.f18640x1 = false;
                            f12 = 0.0f;
                        }
                    } else {
                        f12 = interpolation2;
                    }
                } else {
                    float interpolation3 = interpolator3.getInterpolation(f12);
                    Interpolator interpolator6 = this.K;
                    if (interpolator6 instanceof q) {
                        this.M = ((q) interpolator6).a();
                    } else {
                        this.M = ((interpolator6.getInterpolation(f12 + f11) - interpolation3) * fSignum) / f11;
                    }
                    f12 = interpolation3;
                }
                if (Math.abs(this.M) > f18610d5) {
                    setState(TransitionState.MOVING);
                }
                if (c10 != 1) {
                    if ((fSignum <= 0.0f && f12 >= this.f18615c0) || (fSignum <= 0.0f && f12 <= this.f18615c0)) {
                        f12 = this.f18615c0;
                        this.f18640x1 = false;
                    }
                    if (f12 < 1.0f || f12 <= 0.0f) {
                        this.f18640x1 = false;
                        setState(TransitionState.FINISHED);
                    }
                }
                childCount = getChildCount();
                this.W3 = false;
                nanoTime = getNanoTime();
                this.f18628o4 = f12;
                interpolator = this.L;
                if (interpolator == null) {
                    interpolation = f12;
                } else {
                    interpolation = interpolator.getInterpolation(f12);
                }
                interpolator2 = this.L;
                if (interpolator2 != null) {
                    float interpolation4 = interpolator2.getInterpolation((fSignum / this.V) + f12);
                    this.M = interpolation4;
                    this.M = interpolation4 - this.L.getInterpolation(f12);
                }
                for (i10 = 0; i10 < childCount; i10++) {
                    childAt = getChildAt(i10);
                    oVar = this.T.get(childAt);
                    if (oVar != null) {
                        this.W3 = oVar.L(childAt, interpolation, nanoTime, this.f18632p4) | this.W3;
                    }
                }
                boolean z14 = (fSignum <= 0.0f && f12 >= this.f18615c0) || (fSignum <= 0.0f && f12 <= this.f18615c0);
                if (!this.W3 && !this.f18640x1 && z14) {
                    setState(TransitionState.FINISHED);
                }
                if (this.f18621h4) {
                    requestLayout();
                }
                this.W3 = (!z14) | this.W3;
                if (f12 <= 0.0f && (i13 = this.N) != -1 && this.O != i13) {
                    this.O = i13;
                    this.J.o(i13).p(this);
                    setState(TransitionState.FINISHED);
                    z13 = true;
                }
                if (f12 >= 1.0d) {
                    i11 = this.O;
                    i12 = this.P;
                    if (i11 != i12) {
                        this.O = i12;
                        this.J.o(i12).p(this);
                        setState(TransitionState.FINISHED);
                        z13 = true;
                    }
                }
                if (!this.W3 || this.f18640x1) {
                    invalidate();
                } else if ((fSignum > 0.0f && f12 == 1.0f) || (fSignum < 0.0f && f12 == 0.0f)) {
                    setState(TransitionState.FINISHED);
                }
                if (!this.W3 && !this.f18640x1 && ((fSignum > 0.0f && f12 == 1.0f) || (fSignum < 0.0f && f12 == 0.0f))) {
                    O0();
                }
            }
            c10 = 0;
            if (Math.abs(this.M) > f18610d5) {
                setState(TransitionState.MOVING);
            }
            if (c10 != 1) {
                if (fSignum <= 0.0f) {
                    f12 = this.f18615c0;
                    this.f18640x1 = false;
                } else {
                    f12 = this.f18615c0;
                    this.f18640x1 = false;
                }
                if (f12 < 1.0f) {
                    this.f18640x1 = false;
                    setState(TransitionState.FINISHED);
                } else {
                    this.f18640x1 = false;
                    setState(TransitionState.FINISHED);
                }
            }
            childCount = getChildCount();
            this.W3 = false;
            nanoTime = getNanoTime();
            this.f18628o4 = f12;
            interpolator = this.L;
            if (interpolator == null) {
                interpolation = f12;
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            interpolator2 = this.L;
            if (interpolator2 != null) {
                float interpolation5 = interpolator2.getInterpolation((fSignum / this.V) + f12);
                this.M = interpolation5;
                this.M = interpolation5 - this.L.getInterpolation(f12);
            }
            while (i10 < childCount) {
                childAt = getChildAt(i10);
                oVar = this.T.get(childAt);
                if (oVar != null) {
                    this.W3 = oVar.L(childAt, interpolation, nanoTime, this.f18632p4) | this.W3;
                }
            }
            if (fSignum <= 0.0f) {
            }
            if (!this.W3) {
                setState(TransitionState.FINISHED);
            }
            if (this.f18621h4) {
                requestLayout();
            }
            this.W3 = (!z14) | this.W3;
            if (f12 <= 0.0f) {
                this.O = i13;
                this.J.o(i13).p(this);
                setState(TransitionState.FINISHED);
                z13 = true;
            }
            if (f12 >= 1.0d) {
                i11 = this.O;
                i12 = this.P;
                if (i11 != i12) {
                    this.O = i12;
                    this.J.o(i12).p(this);
                    setState(TransitionState.FINISHED);
                    z13 = true;
                }
            }
            if (this.W3) {
                invalidate();
            } else {
                invalidate();
            }
            if (!this.W3) {
                O0();
            }
        }
        float f13 = this.f18611a0;
        if (f13 < 1.0f) {
            if (f13 <= 0.0f) {
                int i14 = this.O;
                int i15 = this.N;
                z12 = i14 == i15 ? z13 : true;
                this.O = i15;
            }
            this.F4 |= z13;
            if (z13 && !this.f18633q4) {
                requestLayout();
            }
            this.W = this.f18611a0;
        }
        int i16 = this.O;
        int i17 = this.P;
        z12 = i16 == i17 ? z13 : true;
        this.O = i17;
        z13 = z12;
        this.F4 |= z13;
        if (z13) {
            requestLayout();
        }
        this.W = this.f18611a0;
    }

    public void setDebugMode(int i10) {
        this.G2 = i10;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.C4 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.S = z10;
    }

    public void setInterpolatedProgress(float f10) {
        if (this.J != null) {
            setState(TransitionState.MOVING);
            Interpolator interpolatorX = this.J.x();
            if (interpolatorX != null) {
                setProgress(interpolatorX.getInterpolation(f10));
                return;
            }
        }
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<MotionHelper> arrayList = this.Y3;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.Y3.get(i10).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<MotionHelper> arrayList = this.X3;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.X3.get(i10).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            Log.w(S4, "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f18634r4 == null) {
                this.f18634r4 = new k();
            }
            this.f18634r4.e(f10);
            return;
        }
        if (f10 <= 0.0f) {
            if (this.f18611a0 == 1.0f && this.O == this.P) {
                setState(TransitionState.MOVING);
            }
            this.O = this.N;
            if (this.f18611a0 == 0.0f) {
                setState(TransitionState.FINISHED);
            }
        } else if (f10 >= 1.0f) {
            if (this.f18611a0 == 0.0f && this.O == this.N) {
                setState(TransitionState.MOVING);
            }
            this.O = this.P;
            if (this.f18611a0 == 1.0f) {
                setState(TransitionState.FINISHED);
            }
        } else {
            this.O = -1;
            setState(TransitionState.MOVING);
        }
        if (this.J == null) {
            return;
        }
        this.f18629p1 = true;
        this.f18615c0 = f10;
        this.W = f10;
        this.f18613b0 = -1L;
        this.U = -1L;
        this.K = null;
        this.f18640x1 = true;
        invalidate();
    }

    public void setProgress(float f10, float f11) {
        if (isAttachedToWindow()) {
            setProgress(f10);
            setState(TransitionState.MOVING);
            this.M = f11;
            d0(1.0f);
            return;
        }
        if (this.f18634r4 == null) {
            this.f18634r4 = new k();
        }
        this.f18634r4.e(f10);
        this.f18634r4.h(f11);
    }

    public void setScene(s sVar) {
        this.J = sVar;
        sVar.m0(s());
        R0();
    }

    void setStartState(int i10) {
        if (isAttachedToWindow()) {
            this.O = i10;
            return;
        }
        if (this.f18634r4 == null) {
            this.f18634r4 = new k();
        }
        this.f18634r4.f(i10);
        this.f18634r4.d(i10);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i10, int i11, int i12) {
        setState(TransitionState.SETUP);
        this.O = i10;
        this.N = -1;
        this.P = -1;
        androidx.constraintlayout.widget.a aVar = this.f19267l;
        if (aVar != null) {
            aVar.e(i10, i11, i12);
            return;
        }
        s sVar = this.J;
        if (sVar != null) {
            sVar.o(i10).r(this);
        }
    }

    void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.FINISHED;
        if (transitionState == transitionState2 && this.O == -1) {
            return;
        }
        TransitionState transitionState3 = this.D4;
        this.D4 = transitionState;
        TransitionState transitionState4 = TransitionState.MOVING;
        if (transitionState3 == transitionState4 && transitionState == transitionState4) {
            u0();
        }
        int i10 = e.f18652a[transitionState3.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3 && transitionState == transitionState2) {
                v0();
                return;
            }
            return;
        }
        if (transitionState == transitionState4) {
            u0();
        }
        if (transitionState == transitionState2) {
            v0();
        }
    }

    public void setTransition(int i10) {
        if (this.J != null) {
            s.b bVarD0 = D0(i10);
            this.N = bVarD0.I();
            this.P = bVarD0.B();
            if (!isAttachedToWindow()) {
                if (this.f18634r4 == null) {
                    this.f18634r4 = new k();
                }
                this.f18634r4.f(this.N);
                this.f18634r4.d(this.P);
                return;
            }
            float f10 = Float.NaN;
            int i11 = this.O;
            if (i11 == this.N) {
                f10 = 0.0f;
            } else if (i11 == this.P) {
                f10 = 1.0f;
            }
            this.J.o0(bVarD0);
            this.E4.h(this.f19259d, this.J.o(this.N), this.J.o(this.P));
            R0();
            if (this.f18611a0 != f10) {
                if (f10 == 0.0f) {
                    r0(true);
                    this.J.o(this.N).r(this);
                } else if (f10 == 1.0f) {
                    r0(false);
                    this.J.o(this.P).r(this);
                }
            }
            this.f18611a0 = Float.isNaN(f10) ? 0.0f : f10;
            if (!Float.isNaN(f10)) {
                setProgress(f10);
                return;
            }
            Log.v(S4, androidx.constraintlayout.motion.widget.c.g() + " transitionToStart ");
            b1();
        }
    }

    public void setTransition(int i10, int i11) {
        if (!isAttachedToWindow()) {
            if (this.f18634r4 == null) {
                this.f18634r4 = new k();
            }
            this.f18634r4.f(i10);
            this.f18634r4.d(i11);
            return;
        }
        s sVar = this.J;
        if (sVar != null) {
            this.N = i10;
            this.P = i11;
            sVar.n0(i10, i11);
            this.E4.h(this.f19259d, this.J.o(i10), this.J.o(i11));
            R0();
            this.f18611a0 = 0.0f;
            b1();
        }
    }

    protected void setTransition(s.b bVar) {
        this.J.o0(bVar);
        setState(TransitionState.SETUP);
        if (this.O == this.J.u()) {
            this.f18611a0 = 1.0f;
            this.W = 1.0f;
            this.f18615c0 = 1.0f;
        } else {
            this.f18611a0 = 0.0f;
            this.W = 0.0f;
            this.f18615c0 = 0.0f;
        }
        this.f18613b0 = bVar.L(1) ? -1L : getNanoTime();
        int iN = this.J.N();
        int iU = this.J.u();
        if (iN == this.N && iU == this.P) {
            return;
        }
        this.N = iN;
        this.P = iU;
        this.J.n0(iN, iU);
        this.E4.h(this.f19259d, this.J.o(this.N), this.J.o(this.P));
        this.E4.l(this.N, this.P);
        this.E4.k();
        R0();
    }

    public void setTransitionDuration(int i10) {
        s sVar = this.J;
        if (sVar == null) {
            Log.e(S4, "MotionScene not defined");
        } else {
            sVar.k0(i10);
        }
    }

    public void setTransitionListener(l lVar) {
        this.f18630p2 = lVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f18634r4 == null) {
            this.f18634r4 = new k();
        }
        this.f18634r4.g(bundle);
        if (isAttachedToWindow()) {
            this.f18634r4.a();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void t(int i10) {
        s.b bVar;
        if (i10 == 0) {
            this.J = null;
            return;
        }
        try {
            s sVar = new s(getContext(), this, i10);
            this.J = sVar;
            if (this.O == -1) {
                this.O = sVar.N();
                this.N = this.J.N();
                this.P = this.J.u();
            }
            if (!isAttachedToWindow()) {
                this.J = null;
                return;
            }
            try {
                Display display = getDisplay();
                this.A4 = display == null ? 0 : display.getRotation();
                s sVar2 = this.J;
                if (sVar2 != null) {
                    androidx.constraintlayout.widget.c cVarO = sVar2.o(this.O);
                    this.J.h0(this);
                    ArrayList<MotionHelper> arrayList = this.Z3;
                    if (arrayList != null) {
                        Iterator<MotionHelper> it = arrayList.iterator();
                        while (it.hasNext()) {
                            it.next().a(this);
                        }
                    }
                    if (cVarO != null) {
                        cVarO.r(this);
                    }
                    this.N = this.O;
                }
                O0();
                k kVar = this.f18634r4;
                if (kVar != null) {
                    if (this.C4) {
                        post(new a());
                        return;
                    } else {
                        kVar.a();
                        return;
                    }
                }
                s sVar3 = this.J;
                if (sVar3 == null || (bVar = sVar3.f18971c) == null || bVar.z() != 4) {
                    return;
                }
                Z0();
                setState(TransitionState.SETUP);
                setState(TransitionState.MOVING);
            } catch (Exception e10) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e10);
            }
        } catch (Exception e11) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e11);
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return androidx.constraintlayout.motion.widget.c.i(context, this.N) + "->" + androidx.constraintlayout.motion.widget.c.i(context, this.P) + " (pos:" + this.f18611a0 + " Dpos/Dt:" + this.M;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void v(int i10) {
        this.f19267l = null;
    }

    protected void v0() {
        int iIntValue;
        CopyOnWriteArrayList<l> copyOnWriteArrayList;
        if ((this.f18630p2 != null || ((copyOnWriteArrayList = this.f18612a4) != null && !copyOnWriteArrayList.isEmpty())) && this.f18618e4 == -1) {
            this.f18618e4 = this.O;
            if (this.J4.isEmpty()) {
                iIntValue = -1;
            } else {
                ArrayList<Integer> arrayList = this.J4;
                iIntValue = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i10 = this.O;
            if (iIntValue != i10 && i10 != -1) {
                this.J4.add(Integer.valueOf(i10));
            }
        }
        P0();
        Runnable runnable = this.f18635s4;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.f18636t4;
        if (iArr == null || this.f18637u4 <= 0) {
            return;
        }
        c1(iArr[0]);
        int[] iArr2 = this.f18636t4;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.f18637u4--;
    }

    public void x0(int i10, boolean z10, float f10) {
        l lVar = this.f18630p2;
        if (lVar != null) {
            lVar.k(this, i10, z10, f10);
        }
        CopyOnWriteArrayList<l> copyOnWriteArrayList = this.f18612a4;
        if (copyOnWriteArrayList != null) {
            Iterator<l> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().k(this, i10, z10, f10);
            }
        }
    }

    void y0(int i10, float f10, float f11, float f12, float[] fArr) {
        String resourceName;
        HashMap<View, o> map = this.T;
        View viewP = p(i10);
        o oVar = map.get(viewP);
        if (oVar != null) {
            oVar.p(f10, f11, f12, fArr);
            float y10 = viewP.getY();
            this.f18641x2 = f10;
            this.f18644y2 = y10;
            return;
        }
        if (viewP == null) {
            resourceName = "" + i10;
        } else {
            resourceName = viewP.getContext().getResources().getResourceName(i10);
        }
        Log.w(S4, "WARNING could not find view id " + resourceName);
    }

    public androidx.constraintlayout.widget.c z0(int i10) {
        s sVar = this.J;
        if (sVar == null) {
            return null;
        }
        return sVar.o(i10);
    }
}
