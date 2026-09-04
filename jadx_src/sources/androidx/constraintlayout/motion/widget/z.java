package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: ViewTransition.java */
/* JADX INFO: loaded from: classes.dex */
public class z {
    public static final String A = "ConstraintOverride";
    public static final String B = "CustomAttribute";
    public static final String C = "CustomMethod";
    private static final int D = -1;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 4;
    public static final int I = 5;
    static final int J = 0;
    static final int K = 1;
    static final int L = 2;
    private static final int M = -1;
    private static final int N = -2;
    static final int O = 0;
    static final int P = 1;
    static final int Q = 2;
    static final int R = 3;
    static final int S = 4;
    static final int T = 5;
    static final int U = 6;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static String f19086x = "ViewTransition";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f19087y = "ViewTransition";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f19088z = "KeyFrameSet";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    androidx.constraintlayout.widget.c f19089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19090b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f19094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    i f19095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    androidx.constraintlayout.widget.c.a f19096h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f19099k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f19100l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    Context f19104p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19091c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19092d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19093e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19097i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19098j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f19101m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f19102n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f19103o = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f19105q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f19106r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f19107s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f19108t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f19109u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f19110v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f19111w = -1;

    /* JADX INFO: compiled from: ViewTransition.java */
    public class a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.core.motion.utils.d f19112a;

        a(androidx.constraintlayout.core.motion.utils.d dVar) {
            this.f19112a = dVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return (float) this.f19112a.a(f10);
        }
    }

    /* JADX INFO: compiled from: ViewTransition.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f19114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f19115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f19116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        o f19117d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f19119f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        a0 f19121h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Interpolator f19122i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f19124k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f19125l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        long f19126m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f19128o;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        androidx.constraintlayout.core.motion.utils.g f19120g = new androidx.constraintlayout.core.motion.utils.g();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f19123j = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Rect f19127n = new Rect();

        b(a0 a0Var, o oVar, int i10, int i11, int i12, Interpolator interpolator, int i13, int i14) {
            this.f19128o = false;
            this.f19121h = a0Var;
            this.f19117d = oVar;
            this.f19118e = i10;
            this.f19119f = i11;
            long jNanoTime = System.nanoTime();
            this.f19116c = jNanoTime;
            this.f19126m = jNanoTime;
            this.f19121h.c(this);
            this.f19122i = interpolator;
            this.f19114a = i13;
            this.f19115b = i14;
            if (i12 == 3) {
                this.f19128o = true;
            }
            this.f19125l = i10 == 0 ? Float.MAX_VALUE : 1.0f / i10;
            a();
        }

        void a() {
            if (this.f19123j) {
                c();
            } else {
                b();
            }
        }

        void b() {
            long jNanoTime = System.nanoTime();
            long j10 = jNanoTime - this.f19126m;
            this.f19126m = jNanoTime;
            float f10 = this.f19124k + (((float) (j10 * 1.0E-6d)) * this.f19125l);
            this.f19124k = f10;
            if (f10 >= 1.0f) {
                this.f19124k = 1.0f;
            }
            Interpolator interpolator = this.f19122i;
            float interpolation = interpolator == null ? this.f19124k : interpolator.getInterpolation(this.f19124k);
            o oVar = this.f19117d;
            boolean zL = oVar.L(oVar.f18913b, interpolation, jNanoTime, this.f19120g);
            if (this.f19124k >= 1.0f) {
                if (this.f19114a != -1) {
                    this.f19117d.J().setTag(this.f19114a, Long.valueOf(System.nanoTime()));
                }
                if (this.f19115b != -1) {
                    this.f19117d.J().setTag(this.f19115b, null);
                }
                if (!this.f19128o) {
                    this.f19121h.k(this);
                }
            }
            if (this.f19124k < 1.0f || zL) {
                this.f19121h.g();
            }
        }

        void c() {
            long jNanoTime = System.nanoTime();
            long j10 = jNanoTime - this.f19126m;
            this.f19126m = jNanoTime;
            float f10 = this.f19124k - (((float) (j10 * 1.0E-6d)) * this.f19125l);
            this.f19124k = f10;
            if (f10 < 0.0f) {
                this.f19124k = 0.0f;
            }
            Interpolator interpolator = this.f19122i;
            float interpolation = interpolator == null ? this.f19124k : interpolator.getInterpolation(this.f19124k);
            o oVar = this.f19117d;
            boolean zL = oVar.L(oVar.f18913b, interpolation, jNanoTime, this.f19120g);
            if (this.f19124k <= 0.0f) {
                if (this.f19114a != -1) {
                    this.f19117d.J().setTag(this.f19114a, Long.valueOf(System.nanoTime()));
                }
                if (this.f19115b != -1) {
                    this.f19117d.J().setTag(this.f19115b, null);
                }
                this.f19121h.k(this);
            }
            if (this.f19124k > 0.0f || zL) {
                this.f19121h.g();
            }
        }

        public void d(int i10, float f10, float f11) {
            if (i10 == 1) {
                if (this.f19123j) {
                    return;
                }
                e(true);
            } else {
                if (i10 != 2) {
                    return;
                }
                this.f19117d.J().getHitRect(this.f19127n);
                if (this.f19127n.contains((int) f10, (int) f11) || this.f19123j) {
                    return;
                }
                e(true);
            }
        }

        void e(boolean z10) {
            int i10;
            this.f19123j = z10;
            if (z10 && (i10 = this.f19119f) != -1) {
                this.f19125l = i10 == 0 ? Float.MAX_VALUE : 1.0f / i10;
            }
            this.f19121h.g();
            this.f19126m = System.nanoTime();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    z(Context context, XmlPullParser xmlPullParser) {
        byte b10;
        this.f19104p = context;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (!name.equals(A)) {
                                b10 = -1;
                            } else {
                                b10 = 2;
                            }
                            break;
                        case -1239391468:
                            if (!name.equals(f19088z)) {
                                b10 = -1;
                            } else {
                                b10 = 1;
                            }
                            break;
                        case 61998586:
                            if (!name.equals(f19087y)) {
                                b10 = -1;
                            } else {
                                b10 = 0;
                            }
                            break;
                        case 366511058:
                            if (!name.equals(C)) {
                                b10 = -1;
                            } else {
                                b10 = 4;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals(B)) {
                                b10 = -1;
                            } else {
                                b10 = 3;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    if (b10 == 0) {
                        n(context, xmlPullParser);
                    } else if (b10 == 1) {
                        this.f19095g = new i(context, xmlPullParser);
                    } else if (b10 == 2) {
                        this.f19096h = androidx.constraintlayout.widget.c.w(context, xmlPullParser);
                    } else if (b10 == 3 || b10 == 4) {
                        ConstraintAttribute.j(context, xmlPullParser, this.f19096h.f19566g);
                    } else {
                        Log.e(f19086x, c.f() + " unknown tag " + name);
                        Log.e(f19086x, ".xml:" + xmlPullParser.getLineNumber());
                    }
                } else if (eventType == 3 && f19087y.equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(View[] viewArr) {
        if (this.f19105q != -1) {
            for (View view : viewArr) {
                view.setTag(this.f19105q, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.f19106r != -1) {
            for (View view2 : viewArr) {
                view2.setTag(this.f19106r, null);
            }
        }
    }

    private void n(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.f19440z0);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == R.styleable.ViewTransition_android_id) {
                this.f19090b = typedArrayObtainStyledAttributes.getResourceId(index, this.f19090b);
            } else if (index == R.styleable.ViewTransition_motionTarget) {
                if (MotionLayout.U4) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f19099k);
                    this.f19099k = resourceId;
                    if (resourceId == -1) {
                        this.f19100l = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.f19100l = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.f19099k = typedArrayObtainStyledAttributes.getResourceId(index, this.f19099k);
                }
            } else if (index == R.styleable.ViewTransition_onStateTransition) {
                this.f19091c = typedArrayObtainStyledAttributes.getInt(index, this.f19091c);
            } else if (index == R.styleable.ViewTransition_transitionDisable) {
                this.f19092d = typedArrayObtainStyledAttributes.getBoolean(index, this.f19092d);
            } else if (index == R.styleable.ViewTransition_pathMotionArc) {
                this.f19093e = typedArrayObtainStyledAttributes.getInt(index, this.f19093e);
            } else if (index == R.styleable.ViewTransition_duration) {
                this.f19097i = typedArrayObtainStyledAttributes.getInt(index, this.f19097i);
            } else if (index == R.styleable.ViewTransition_upDuration) {
                this.f19098j = typedArrayObtainStyledAttributes.getInt(index, this.f19098j);
            } else if (index == R.styleable.ViewTransition_viewTransitionMode) {
                this.f19094f = typedArrayObtainStyledAttributes.getInt(index, this.f19094f);
            } else if (index == R.styleable.ViewTransition_motionInterpolator) {
                int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i11 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f19103o = resourceId2;
                    if (resourceId2 != -1) {
                        this.f19101m = -2;
                    }
                } else if (i11 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f19102n = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f19101m = -1;
                    } else {
                        this.f19103o = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f19101m = -2;
                    }
                } else {
                    this.f19101m = typedArrayObtainStyledAttributes.getInteger(index, this.f19101m);
                }
            } else if (index == R.styleable.ViewTransition_setsTag) {
                this.f19105q = typedArrayObtainStyledAttributes.getResourceId(index, this.f19105q);
            } else if (index == R.styleable.ViewTransition_clearsTag) {
                this.f19106r = typedArrayObtainStyledAttributes.getResourceId(index, this.f19106r);
            } else if (index == R.styleable.ViewTransition_ifTagSet) {
                this.f19107s = typedArrayObtainStyledAttributes.getResourceId(index, this.f19107s);
            } else if (index == R.styleable.ViewTransition_ifTagNotSet) {
                this.f19108t = typedArrayObtainStyledAttributes.getResourceId(index, this.f19108t);
            } else if (index == R.styleable.ViewTransition_SharedValueId) {
                this.f19110v = typedArrayObtainStyledAttributes.getResourceId(index, this.f19110v);
            } else if (index == R.styleable.ViewTransition_SharedValue) {
                this.f19109u = typedArrayObtainStyledAttributes.getInteger(index, this.f19109u);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void v(s.b bVar, View view) {
        int i10 = this.f19097i;
        if (i10 != -1) {
            bVar.O(i10);
        }
        bVar.V(this.f19093e);
        bVar.R(this.f19101m, this.f19102n, this.f19103o);
        int id2 = view.getId();
        i iVar = this.f19095g;
        if (iVar != null) {
            ArrayList<f> arrayListD = iVar.d(-1);
            i iVar2 = new i();
            Iterator<f> it = arrayListD.iterator();
            while (it.hasNext()) {
                iVar2.c(it.next().clone().k(id2));
            }
            bVar.t(iVar2);
        }
    }

    void b(a0 a0Var, MotionLayout motionLayout, View view) {
        o oVar = new o(view);
        oVar.Q(view);
        this.f19095g.a(oVar);
        oVar.Z(motionLayout.getWidth(), motionLayout.getHeight(), this.f19097i, System.nanoTime());
        new b(a0Var, oVar, this.f19097i, this.f19098j, this.f19091c, f(motionLayout.getContext()), this.f19105q, this.f19106r);
    }

    void c(a0 a0Var, MotionLayout motionLayout, int i10, androidx.constraintlayout.widget.c cVar, final View... viewArr) {
        if (this.f19092d) {
            return;
        }
        int i11 = this.f19094f;
        if (i11 == 2) {
            b(a0Var, motionLayout, viewArr[0]);
            return;
        }
        if (i11 == 1) {
            for (int i12 : motionLayout.getConstraintSetIds()) {
                if (i12 != i10) {
                    androidx.constraintlayout.widget.c cVarZ0 = motionLayout.z0(i12);
                    for (View view : viewArr) {
                        androidx.constraintlayout.widget.c.a aVarK0 = cVarZ0.k0(view.getId());
                        androidx.constraintlayout.widget.c.a aVar = this.f19096h;
                        if (aVar != null) {
                            aVar.h(aVarK0);
                            aVarK0.f19566g.putAll(this.f19096h.f19566g);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
        cVar2.I(cVar);
        for (View view2 : viewArr) {
            androidx.constraintlayout.widget.c.a aVarK1 = cVar2.k0(view2.getId());
            androidx.constraintlayout.widget.c.a aVar2 = this.f19096h;
            if (aVar2 != null) {
                aVar2.h(aVarK1);
                aVarK1.f19566g.putAll(this.f19096h.f19566g);
            }
        }
        motionLayout.h1(i10, cVar2);
        int i13 = R.id.view_transition;
        motionLayout.h1(i13, cVar);
        motionLayout.setState(i13, -1, -1);
        s.b bVar = new s.b(-1, motionLayout.J, i13, i10);
        for (View view3 : viewArr) {
            v(bVar, view3);
        }
        motionLayout.setTransition(bVar);
        motionLayout.a1(new Runnable() { // from class: androidx.constraintlayout.motion.widget.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f19084b.l(viewArr);
            }
        });
    }

    boolean d(View view) {
        int i10 = this.f19107s;
        boolean z10 = i10 == -1 || view.getTag(i10) != null;
        int i11 = this.f19108t;
        return z10 && (i11 == -1 || view.getTag(i11) == null);
    }

    int e() {
        return this.f19090b;
    }

    Interpolator f(Context context) {
        int i10 = this.f19101m;
        if (i10 == -2) {
            return AnimationUtils.loadInterpolator(context, this.f19103o);
        }
        if (i10 == -1) {
            return new a(androidx.constraintlayout.core.motion.utils.d.c(this.f19102n));
        }
        if (i10 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i10 == 1) {
            return new AccelerateInterpolator();
        }
        if (i10 == 2) {
            return new DecelerateInterpolator();
        }
        if (i10 == 4) {
            return new BounceInterpolator();
        }
        if (i10 == 5) {
            return new OvershootInterpolator();
        }
        if (i10 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public int g() {
        return this.f19109u;
    }

    public int h() {
        return this.f19111w;
    }

    public int i() {
        return this.f19110v;
    }

    public int j() {
        return this.f19091c;
    }

    boolean k() {
        return !this.f19092d;
    }

    boolean m(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f19099k == -1 && this.f19100l == null) || !d(view)) {
            return false;
        }
        if (view.getId() == this.f19099k) {
            return true;
        }
        return this.f19100l != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).f19289b0) != null && str.matches(this.f19100l);
    }

    void o(boolean z10) {
        this.f19092d = !z10;
    }

    void p(int i10) {
        this.f19090b = i10;
    }

    public void q(int i10) {
        this.f19109u = i10;
    }

    public void r(int i10) {
        this.f19111w = i10;
    }

    public void s(int i10) {
        this.f19110v = i10;
    }

    public void t(int i10) {
        this.f19091c = i10;
    }

    public String toString() {
        return "ViewTransition(" + c.i(this.f19104p, this.f19090b) + ")";
    }

    boolean u(int i10) {
        int i11 = this.f19091c;
        if (i11 == 1) {
            return i10 == 0;
        }
        if (i11 == 2) {
            return i10 == 1;
        }
        return i11 == 3 && i10 == 0;
    }
}
