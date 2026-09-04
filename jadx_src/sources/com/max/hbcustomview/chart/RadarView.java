package com.max.hbcustomview.chart;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.l;
import androidx.compose.foundation.b0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.i;
import androidx.core.view.j1;
import com.max.hbcustomview.GradientTextView;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RadarView.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class RadarView extends ConstraintLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Shader G2;
    private float J;
    private float K;
    private Paint L;
    private Paint M;
    private Paint N;
    private Paint O;
    private int P;
    private int Q;
    private int R;

    @e
    private ArrayList<b> S;

    @e
    private ArrayList<b> T;
    private double U;
    private float V;
    private int W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private Path f69052a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private Path f69053b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f69054c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f69055p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private float f69056p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @e
    private Shader f69057p3;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private int f69058x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f69059x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private int f69060y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private int f69061y2;

    /* JADX INFO: compiled from: RadarView.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f69062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f69063b;

        public a(float f10, float f11) {
            this.f69062a = f10;
            this.f69063b = f11;
        }

        public final float a() {
            return this.f69062a;
        }

        public final float b() {
            return this.f69063b;
        }

        public final void c(float f10) {
            this.f69062a = f10;
        }

        public final void d(float f10) {
            this.f69063b = f10;
        }
    }

    /* JADX INFO: compiled from: RadarView.kt */
    public static final class b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @d
        private String f69064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f69065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f69066c;

        public b(@d String label, float f10, boolean z10) {
            f0.p(label, "label");
            this.f69064a = label;
            this.f69065b = f10;
            this.f69066c = z10;
        }

        public static /* synthetic */ b e(b bVar, String str, float f10, boolean z10, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar, str, new Float(f10), new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.f.f32587ti, new Class[]{b.class, String.class, Float.TYPE, Boolean.TYPE, Integer.TYPE, Object.class}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (b) patchProxyResultProxy.result;
            }
            if ((i10 & 1) != 0) {
                str = bVar.f69064a;
            }
            if ((i10 & 2) != 0) {
                f10 = bVar.f69065b;
            }
            if ((i10 & 4) != 0) {
                z10 = bVar.f69066c;
            }
            return bVar.d(str, f10, z10);
        }

        @d
        public final String a() {
            return this.f69064a;
        }

        public final float b() {
            return this.f69065b;
        }

        public final boolean c() {
            return this.f69066c;
        }

        @d
        public final b d(@d String label, float f10, boolean z10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{label, new Float(f10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.f32565si, new Class[]{String.class, Float.TYPE, Boolean.TYPE}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (b) patchProxyResultProxy.result;
            }
            f0.p(label, "label");
            return new b(label, f10, z10);
        }

        public boolean equals(@e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.f.f32653wi, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return f0.g(this.f69064a, bVar.f69064a) && Float.compare(this.f69065b, bVar.f69065b) == 0 && this.f69066c == bVar.f69066c;
        }

        public final boolean f() {
            return this.f69066c;
        }

        @d
        public final String g() {
            return this.f69064a;
        }

        public final float h() {
            return this.f69065b;
        }

        public int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32631vi, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (((this.f69064a.hashCode() * 31) + Float.floatToIntBits(this.f69065b)) * 31) + b0.a(this.f69066c);
        }

        public final void i(boolean z10) {
            this.f69066c = z10;
        }

        public final void j(@d String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.f.f32543ri, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(str, "<set-?>");
            this.f69064a = str;
        }

        public final void k(float f10) {
            this.f69065b = f10;
        }

        @d
        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32609ui, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "RadarData(label=" + this.f69064a + ", score=" + this.f69065b + ", highlight=" + this.f69066c + ')';
        }
    }

    /* JADX INFO: compiled from: RadarView.kt */
    public final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69067a;

        static {
            int[] iArr = new int[GradientDrawable.Orientation.values().length];
            try {
                iArr[GradientDrawable.Orientation.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GradientDrawable.Orientation.BOTTOM_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GradientDrawable.Orientation.LEFT_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GradientDrawable.Orientation.RIGHT_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GradientDrawable.Orientation.BL_TR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f69067a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadarView(@d Context context) {
        this(context, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadarView(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadarView(@d Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadarView(@d Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        f0.p(context, "context");
        this.P = 5;
        ic.a aVar = ic.a.f119343a;
        Context context2 = getContext();
        f0.o(context2, "getContext(...)");
        this.Q = aVar.a(context2, 80.0f);
        Context context3 = getContext();
        f0.o(context3, "getContext(...)");
        this.R = aVar.a(context3, 40.0f);
        this.V = 10.0f;
        this.W = 4;
        this.f69054c0 = -1;
        this.f69055p1 = -1;
        this.f69058x1 = -1;
        this.f69060y1 = -1;
        this.f69056p2 = 12.0f;
        this.f69059x2 = -1;
        this.f69061y2 = -1;
        Q(attributeSet);
    }

    private final LinearGradient C(@l int i10, @l int i11, GradientDrawable.Orientation orientation) {
        Object[] objArr = {new Integer(i10), new Integer(i11), orientation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32498pi, new Class[]{cls, cls, GradientDrawable.Orientation.class}, LinearGradient.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearGradient) patchProxyResultProxy.result;
        }
        Rect rectM = M(orientation);
        return new LinearGradient(rectM.left, rectM.top, rectM.right, rectM.bottom, new int[]{i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
    }

    private final a D(float f10, double d10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), new Double(d10)}, this, changeQuickRedirect, false, bb.c.f.f32429mi, new Class[]{Float.TYPE, Double.TYPE}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        double d11 = f10;
        return new a((float) (((double) this.J) + (Math.sin(d10) * d11)), (float) (((double) this.K) - (d11 * Math.cos(d10))));
    }

    private final Shader E() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32452ni, new Class[0], Shader.class);
        if (patchProxyResultProxy.isSupported) {
            return (Shader) patchProxyResultProxy.result;
        }
        if (this.G2 == null) {
            this.G2 = C(this.f69054c0, this.f69055p1, GradientDrawable.Orientation.BL_TR);
        }
        Shader shader = this.G2;
        f0.m(shader);
        return shader;
    }

    private final Shader F() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32475oi, new Class[0], Shader.class);
        if (patchProxyResultProxy.isSupported) {
            return (Shader) patchProxyResultProxy.result;
        }
        if (this.f69057p3 == null) {
            this.f69057p3 = C(this.f69058x1, this.f69060y1, GradientDrawable.Orientation.BL_TR);
        }
        Shader shader = this.f69057p3;
        f0.m(shader);
        return shader;
    }

    private final double H() {
        return 6.283185307179586d / ((double) this.P);
    }

    private final void I(Canvas canvas) {
        Paint paint;
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.f32383ki, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        Paint paint2 = this.L;
        if (paint2 == null) {
            f0.S("linePaint");
            paint2 = null;
        }
        if (paint2.getShader() == null) {
            Paint paint3 = this.L;
            if (paint3 == null) {
                f0.S("linePaint");
                paint3 = null;
            }
            paint3.setShader(E());
        }
        double d10 = 0.0d;
        int i10 = this.P;
        for (int i11 = 0; i11 < i10; i11++) {
            a aVarD = D(this.Q, d10);
            float f10 = this.J;
            float f11 = this.K;
            float fA = aVarD.a();
            float fB = aVarD.b();
            Paint paint4 = this.L;
            if (paint4 == null) {
                f0.S("linePaint");
                paint = null;
            } else {
                paint = paint4;
            }
            canvas.drawLine(f10, f11, fA, fB, paint);
            d10 -= this.U;
        }
    }

    private final void J(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.f32336ii, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        Paint paint = this.M;
        Paint paint2 = null;
        if (paint == null) {
            f0.S("planePaint");
            paint = null;
        }
        if (paint.getShader() == null) {
            Paint paint3 = this.M;
            if (paint3 == null) {
                f0.S("planePaint");
                paint3 = null;
            }
            paint3.setShader(E());
            Paint paint4 = this.M;
            if (paint4 == null) {
                f0.S("planePaint");
            } else {
                paint2 = paint4;
            }
            paint2.setAlpha(25);
        }
        for (int i10 = this.W; i10 > 0; i10--) {
            K((this.Q * i10) / this.W, canvas);
        }
    }

    private final void K(float f10, Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{new Float(f10), canvas}, this, changeQuickRedirect, false, bb.c.f.f32360ji, new Class[]{Float.TYPE, Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        double d10 = 0.0d;
        Path path = this.f69052a0;
        Paint paint = null;
        if (path == null) {
            f0.S("netPath");
            path = null;
        }
        path.reset();
        int i10 = this.P;
        for (int i11 = 0; i11 < i10; i11++) {
            a aVarD = D(f10, d10);
            if (i11 == 0) {
                Path path2 = this.f69052a0;
                if (path2 == null) {
                    f0.S("netPath");
                    path2 = null;
                }
                path2.moveTo(aVarD.a(), aVarD.b());
            } else {
                Path path3 = this.f69052a0;
                if (path3 == null) {
                    f0.S("netPath");
                    path3 = null;
                }
                path3.lineTo(aVarD.a(), aVarD.b());
            }
            d10 -= this.U;
        }
        Path path4 = this.f69052a0;
        if (path4 == null) {
            f0.S("netPath");
            path4 = null;
        }
        path4.close();
        Path path5 = this.f69052a0;
        if (path5 == null) {
            f0.S("netPath");
            path5 = null;
        }
        Paint paint2 = this.M;
        if (paint2 == null) {
            f0.S("planePaint");
        } else {
            paint = paint2;
        }
        canvas.drawPath(path5, paint);
    }

    private final void L(Canvas canvas, boolean z10) {
        if (PatchProxy.proxy(new Object[]{canvas, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.f32406li, new Class[]{Canvas.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList<b> arrayList = z10 ? this.S : this.T;
        if (arrayList != null) {
            Paint paint = this.O;
            Paint paint2 = null;
            if (paint == null) {
                f0.S("regionLinePaint");
                paint = null;
            }
            paint.setShader(z10 ? E() : F());
            Paint paint3 = this.O;
            if (paint3 == null) {
                f0.S("regionLinePaint");
                paint3 = null;
            }
            paint3.setAlpha(153);
            Paint paint4 = this.N;
            if (paint4 == null) {
                f0.S("regionPaint");
                paint4 = null;
            }
            paint4.setShader(z10 ? E() : F());
            Paint paint5 = this.N;
            if (paint5 == null) {
                f0.S("regionPaint");
                paint5 = null;
            }
            paint5.setAlpha(76);
            double d10 = 0.0d;
            Path path = this.f69053b0;
            if (path == null) {
                f0.S("regionPath");
                path = null;
            }
            path.reset();
            int i10 = this.P;
            for (int i11 = 0; i11 < i10; i11++) {
                a aVarD = D((this.Q * arrayList.get(i11).h()) / this.V, d10);
                if (i11 == 0) {
                    Path path2 = this.f69053b0;
                    if (path2 == null) {
                        f0.S("regionPath");
                        path2 = null;
                    }
                    path2.moveTo(aVarD.a(), aVarD.b());
                } else {
                    Path path3 = this.f69053b0;
                    if (path3 == null) {
                        f0.S("regionPath");
                        path3 = null;
                    }
                    path3.lineTo(aVarD.a(), aVarD.b());
                }
                d10 -= this.U;
            }
            Path path4 = this.f69053b0;
            if (path4 == null) {
                f0.S("regionPath");
                path4 = null;
            }
            path4.close();
            Path path5 = this.f69053b0;
            if (path5 == null) {
                f0.S("regionPath");
                path5 = null;
            }
            Paint paint6 = this.O;
            if (paint6 == null) {
                f0.S("regionLinePaint");
                paint6 = null;
            }
            canvas.drawPath(path5, paint6);
            Path path6 = this.f69053b0;
            if (path6 == null) {
                f0.S("regionPath");
                path6 = null;
            }
            Paint paint7 = this.N;
            if (paint7 == null) {
                f0.S("regionPaint");
            } else {
                paint2 = paint7;
            }
            canvas.drawPath(path6, paint2);
        }
    }

    private final Rect M(GradientDrawable.Orientation orientation) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{orientation}, this, changeQuickRedirect, false, bb.c.f.f32521qi, new Class[]{GradientDrawable.Orientation.class}, Rect.class);
        if (patchProxyResultProxy.isSupported) {
            return (Rect) patchProxyResultProxy.result;
        }
        if (orientation == null) {
            return new Rect(0, 0, getMeasuredWidth(), 0);
        }
        int i10 = c.f69067a[orientation.ordinal()];
        if (i10 == 1) {
            return new Rect(0, 0, 0, getMeasuredHeight());
        }
        if (i10 == 2) {
            return new Rect(0, getMeasuredHeight(), 0, 0);
        }
        if (i10 == 3) {
            return new Rect(0, 0, getMeasuredWidth(), 0);
        }
        if (i10 != 4) {
            return i10 != 5 ? new Rect(0, 0, getMeasuredWidth(), 0) : new Rect(0, getMeasuredHeight(), getMeasuredWidth(), 0);
        }
        return new Rect(getMeasuredWidth(), 0, 0, 0);
    }

    private final void N() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32175bi, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Paint paint = new Paint();
        this.L = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.L;
        Paint paint3 = null;
        if (paint2 == null) {
            f0.S("linePaint");
            paint2 = null;
        }
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint4 = this.L;
        if (paint4 == null) {
            f0.S("linePaint");
            paint4 = null;
        }
        paint4.setStrokeWidth(1.0f);
        Paint paint5 = this.L;
        if (paint5 == null) {
            f0.S("linePaint");
            paint5 = null;
        }
        paint5.setAlpha(38);
        Paint paint6 = new Paint();
        this.M = paint6;
        paint6.setAntiAlias(true);
        Paint paint7 = this.M;
        if (paint7 == null) {
            f0.S("planePaint");
            paint7 = null;
        }
        paint7.setStyle(Paint.Style.FILL);
        Paint paint8 = new Paint();
        this.N = paint8;
        paint8.setAntiAlias(true);
        Paint paint9 = this.N;
        if (paint9 == null) {
            f0.S("regionPaint");
            paint9 = null;
        }
        paint9.setStyle(Paint.Style.FILL);
        Paint paint10 = new Paint();
        this.O = paint10;
        paint10.setAntiAlias(true);
        Paint paint11 = this.O;
        if (paint11 == null) {
            f0.S("regionLinePaint");
            paint11 = null;
        }
        paint11.setStyle(Paint.Style.STROKE);
        Paint paint12 = this.O;
        if (paint12 == null) {
            f0.S("regionLinePaint");
        } else {
            paint3 = paint12;
        }
        ic.a aVar = ic.a.f119343a;
        Context context = getContext();
        f0.o(context, "getContext(...)");
        paint3.setStrokeWidth(aVar.a(context, 1.5f));
        this.f69052a0 = new Path();
        this.f69053b0 = new Path();
        this.U = H();
    }

    private final void Q(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, bb.c.f.f32152ai, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f68737x2);
        f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        ic.a aVar = ic.a.f119343a;
        Context context = getContext();
        f0.o(context, "getContext(...)");
        this.Q = aVar.b(context, typedArrayObtainStyledAttributes.getInteger(R.styleable.RadarView_radar_radius, 80));
        this.f69054c0 = getResources().getColor(R.color.level_gradient_yellow_start_color);
        this.f69055p1 = getResources().getColor(R.color.level_gradient_yellow_end_color);
        Resources resources = getContext().getResources();
        int i10 = R.color.text_secondary_1_color;
        this.f69059x2 = i.e(resources, i10, null);
        this.f69061y2 = i.e(getContext().getResources(), i10, null);
        N();
    }

    private final boolean R() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32222di, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        ArrayList<b> arrayList = this.T;
        if (arrayList != null) {
            if (!(arrayList != null && arrayList.size() == 0)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ void setData$default(RadarView radarView, ArrayList arrayList, ArrayList arrayList2, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{radarView, arrayList, arrayList2, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.f.f32268fi, new Class[]{RadarView.class, ArrayList.class, ArrayList.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            arrayList2 = null;
        }
        radarView.setData(arrayList, arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:17:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:26:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f3  */
    public final void P() {
        int iA;
        String strValueOf;
        String strValueOf2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32198ci, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View view = new View(getContext());
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(1, 1);
        view.setId(R.id.center);
        view.setBackgroundColor(j1.f21601t);
        addView(view, layoutParams);
        int i10 = this.Q;
        int i11 = this.R;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i10 + i11;
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i10 + i11;
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.H(this);
        cVar.K(view.getId(), 6, 0, 6);
        int i12 = 3;
        cVar.K(view.getId(), 3, 0, 3);
        cVar.r(this);
        int i13 = this.P;
        int i14 = 0;
        while (i14 < i13) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.hbcustomview_layout_radar_label, (ViewGroup) null);
            viewInflate.setId(View.generateViewId());
            addView(viewInflate);
            androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
            cVar2.H(this);
            int i15 = this.P;
            float f10 = 360 - ((360 / i15) * i14);
            if (i15 == 6) {
                if (i14 == 1) {
                    ic.a aVar = ic.a.f119343a;
                    Context context = getContext();
                    f0.o(context, "getContext(...)");
                    iA = aVar.a(context, R() ? 5.0f : 11.0f);
                } else if (i14 == 2 || i14 == 4) {
                    ic.a aVar2 = ic.a.f119343a;
                    Context context2 = getContext();
                    f0.o(context2, "getContext(...)");
                    iA = aVar2.a(context2, 8.0f);
                } else if (i14 != 5) {
                    iA = 0;
                } else {
                    ic.a aVar3 = ic.a.f119343a;
                    Context context3 = getContext();
                    f0.o(context3, "getContext(...)");
                    iA = aVar3.a(context3, R() ? 5.0f : 11.0f);
                }
            } else if (i15 != 5) {
                iA = 0;
            } else if (i14 == 1) {
                ic.a aVar4 = ic.a.f119343a;
                Context context4 = getContext();
                f0.o(context4, "getContext(...)");
                iA = aVar4.a(context4, R() ? 5.0f : 11.0f);
            } else if (i14 == 2 || i14 == i12) {
                ic.a aVar5 = ic.a.f119343a;
                Context context5 = getContext();
                f0.o(context5, "getContext(...)");
                iA = aVar5.a(context5, 2.0f);
            } else if (i14 != 4) {
                iA = 0;
            } else {
                ic.a aVar6 = ic.a.f119343a;
                Context context6 = getContext();
                f0.o(context6, "getContext(...)");
                iA = aVar6.a(context6, R() ? 5.0f : 11.0f);
            }
            int id2 = viewInflate.getId();
            int i16 = R.id.center;
            int i17 = this.Q;
            ic.a aVar7 = ic.a.f119343a;
            Context context7 = getContext();
            f0.o(context7, "getContext(...)");
            cVar2.M(id2, i16, i17 + aVar7.a(context7, 15.0f) + iA, f10);
            cVar2.r(this);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_desc);
            GradientTextView gradientTextView = (GradientTextView) viewInflate.findViewById(R.id.tv_value);
            GradientTextView gradientTextView2 = (GradientTextView) viewInflate.findViewById(R.id.tv_value2);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_div);
            ArrayList<b> arrayList = this.S;
            f0.m(arrayList);
            textView.setText(arrayList.get(i14).g());
            textView.setTextColor(this.f69061y2);
            gradientTextView.setTextSize(1, this.f69056p2);
            ArrayList<b> arrayList2 = this.S;
            f0.m(arrayList2);
            if (arrayList2.get(i14).h() == this.V) {
                ArrayList<b> arrayList3 = this.S;
                f0.m(arrayList3);
                strValueOf = String.valueOf((int) arrayList3.get(i14).h());
            } else {
                ArrayList<b> arrayList4 = this.S;
                f0.m(arrayList4);
                strValueOf = String.valueOf(arrayList4.get(i14).h());
            }
            gradientTextView.setText(strValueOf);
            ArrayList<b> arrayList5 = this.S;
            f0.m(arrayList5);
            if (arrayList5.get(i14).f()) {
                gradientTextView.setColors(this.f69054c0, this.f69055p1, GradientDrawable.Orientation.BL_TR);
            } else {
                int i18 = this.f69059x2;
                gradientTextView.setColors(i18, i18);
            }
            ArrayList<b> arrayList6 = this.T;
            if ((arrayList6 != null ? arrayList6.size() : 0) > 0) {
                gradientTextView2.setVisibility(0);
                textView2.setVisibility(0);
                textView2.setTextColor(this.f69059x2);
                ArrayList<b> arrayList7 = this.T;
                f0.m(arrayList7);
                if (arrayList7.get(i14).h() == this.V) {
                    ArrayList<b> arrayList8 = this.T;
                    f0.m(arrayList8);
                    strValueOf2 = String.valueOf((int) arrayList8.get(i14).h());
                } else {
                    ArrayList<b> arrayList9 = this.T;
                    f0.m(arrayList9);
                    strValueOf2 = String.valueOf(arrayList9.get(i14).h());
                }
                gradientTextView2.setText(strValueOf2);
                ArrayList<b> arrayList10 = this.T;
                f0.m(arrayList10);
                if (arrayList10.get(i14).f()) {
                    gradientTextView2.setColors(this.f69058x1, this.f69060y1, GradientDrawable.Orientation.BL_TR);
                } else {
                    int i19 = this.f69059x2;
                    gradientTextView2.setColors(i19, i19);
                }
            } else {
                gradientTextView2.setVisibility(8);
                textView2.setVisibility(8);
            }
            i14++;
            i12 = 3;
        }
    }

    public final int getMDescColor() {
        return this.f69061y2;
    }

    public final int getMNormalValueColor() {
        return this.f69059x2;
    }

    public final float getMNormalValueSizeDP() {
        return this.f69056p2;
    }

    public final float getMax_value() {
        return this.V;
    }

    @e
    public final Shader getShader() {
        return this.G2;
    }

    @e
    public final Shader getShader2() {
        return this.f69057p3;
    }

    @Override // android.view.View
    public void onDraw(@d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.f32314hi, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        super.onDraw(canvas);
        I(canvas);
        J(canvas);
        L(canvas, true);
        ArrayList<b> arrayList = this.T;
        if ((arrayList != null ? arrayList.size() : 0) > 0) {
            L(canvas, false);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32291gi, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onMeasure(i10, i11);
        int i12 = (this.Q + this.R) * 2;
        setMeasuredDimension(i12, i12);
        float f10 = i12 / 2;
        this.J = f10;
        this.K = f10;
    }

    public final void setColors(int i10, int i11) {
        this.f69054c0 = i10;
        this.f69055p1 = i11;
    }

    public final void setColors2(int i10, int i11) {
        this.f69058x1 = i10;
        this.f69060y1 = i11;
    }

    public final void setData(@d ArrayList<b> list, @e ArrayList<b> arrayList) {
        if (PatchProxy.proxy(new Object[]{list, arrayList}, this, changeQuickRedirect, false, bb.c.f.f32245ei, new Class[]{ArrayList.class, ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "list");
        this.S = list;
        this.T = arrayList;
        f0.m(list);
        this.P = list.size();
        removeAllViews();
        this.U = H();
        P();
        setWillNotDraw(false);
        invalidate();
    }

    public final void setMDescColor(int i10) {
        this.f69061y2 = i10;
    }

    public final void setMNormalValueColor(int i10) {
        this.f69059x2 = i10;
    }

    public final void setMNormalValueSizeDP(float f10) {
        this.f69056p2 = f10;
    }

    public final void setMax_value(float f10) {
        this.V = f10;
    }

    public final void setShader(@e Shader shader) {
        this.G2 = shader;
    }

    public final void setShader2(@e Shader shader) {
        this.f69057p3 = shader;
    }
}
