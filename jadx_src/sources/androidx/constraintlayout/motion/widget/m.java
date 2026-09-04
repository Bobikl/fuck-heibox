package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: KeyTrigger.java */
/* JADX INFO: loaded from: classes.dex */
public class m extends f {
    static final String Y = "KeyTrigger";
    private static final String Z = "KeyTrigger";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f18847a0 = "viewTransitionOnCross";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f18848b0 = "viewTransitionOnPositiveCross";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f18849c0 = "viewTransitionOnNegativeCross";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f18850d0 = "postLayout";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f18851e0 = "triggerSlack";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f18852f0 = "triggerCollisionView";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f18853g0 = "triggerCollisionId";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f18854h0 = "triggerID";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f18855i0 = "positiveCross";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f18856j0 = "negativeCross";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f18857k0 = "triggerReceiver";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f18858l0 = "CROSS";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f18859m0 = 5;
    private int D = -1;
    private String E = null;
    private int F;
    private String G;
    private String H;
    private int I;
    private int J;
    private View K;
    float L;
    private boolean M;
    private boolean N;
    private boolean O;
    private float P;
    private float Q;
    private boolean R;
    int S;
    int T;
    int U;
    RectF V;
    RectF W;
    HashMap<String, Method> X;

    /* JADX INFO: compiled from: KeyTrigger.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int f18860a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f18861b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f18862c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f18863d = 5;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f18864e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f18865f = 7;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f18866g = 8;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f18867h = 9;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f18868i = 10;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f18869j = 11;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f18870k = 12;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f18871l = 13;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f18872m = 14;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static SparseIntArray f18873n;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f18873n = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyTrigger_framePosition, 8);
            f18873n.append(R.styleable.KeyTrigger_onCross, 4);
            f18873n.append(R.styleable.KeyTrigger_onNegativeCross, 1);
            f18873n.append(R.styleable.KeyTrigger_onPositiveCross, 2);
            f18873n.append(R.styleable.KeyTrigger_motionTarget, 7);
            f18873n.append(R.styleable.KeyTrigger_triggerId, 6);
            f18873n.append(R.styleable.KeyTrigger_triggerSlack, 5);
            f18873n.append(R.styleable.KeyTrigger_motion_triggerOnCollision, 9);
            f18873n.append(R.styleable.KeyTrigger_motion_postLayoutCollision, 10);
            f18873n.append(R.styleable.KeyTrigger_triggerReceiver, 11);
            f18873n.append(R.styleable.KeyTrigger_viewTransitionOnCross, 12);
            f18873n.append(R.styleable.KeyTrigger_viewTransitionOnNegativeCross, 13);
            f18873n.append(R.styleable.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }

        private a() {
        }

        public static void a(m mVar, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (f18873n.get(index)) {
                    case 1:
                        mVar.G = typedArray.getString(index);
                        break;
                    case 2:
                        mVar.H = typedArray.getString(index);
                        break;
                    case 3:
                    default:
                        Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + f18873n.get(index));
                        break;
                    case 4:
                        mVar.E = typedArray.getString(index);
                        break;
                    case 5:
                        mVar.L = typedArray.getFloat(index, mVar.L);
                        break;
                    case 6:
                        mVar.I = typedArray.getResourceId(index, mVar.I);
                        break;
                    case 7:
                        if (MotionLayout.U4) {
                            int resourceId = typedArray.getResourceId(index, mVar.f18740b);
                            mVar.f18740b = resourceId;
                            if (resourceId == -1) {
                                mVar.f18741c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            mVar.f18741c = typedArray.getString(index);
                        } else {
                            mVar.f18740b = typedArray.getResourceId(index, mVar.f18740b);
                        }
                        break;
                    case 8:
                        int integer = typedArray.getInteger(index, mVar.f18739a);
                        mVar.f18739a = integer;
                        mVar.P = (integer + 0.5f) / 100.0f;
                        break;
                    case 9:
                        mVar.J = typedArray.getResourceId(index, mVar.J);
                        break;
                    case 10:
                        mVar.R = typedArray.getBoolean(index, mVar.R);
                        break;
                    case 11:
                        mVar.F = typedArray.getResourceId(index, mVar.F);
                        break;
                    case 12:
                        mVar.U = typedArray.getResourceId(index, mVar.U);
                        break;
                    case 13:
                        mVar.S = typedArray.getResourceId(index, mVar.S);
                        break;
                    case 14:
                        mVar.T = typedArray.getResourceId(index, mVar.T);
                        break;
                }
            }
        }
    }

    public m() {
        int i10 = f.f18718f;
        this.F = i10;
        this.G = null;
        this.H = null;
        this.I = i10;
        this.J = i10;
        this.K = null;
        this.L = 0.1f;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = Float.NaN;
        this.R = false;
        this.S = i10;
        this.T = i10;
        this.U = i10;
        this.V = new RectF();
        this.W = new RectF();
        this.X = new HashMap<>();
        this.f18742d = 5;
        this.f18743e = new HashMap<>();
    }

    private void B(String str, View view) {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            C(str, view);
            return;
        }
        if (this.X.containsKey(str)) {
            method = this.X.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = view.getClass().getMethod(str, new Class[0]);
                this.X.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.X.put(str, null);
                Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + c.k(view));
                return;
            }
        }
        try {
            method.invoke(view, new Object[0]);
        } catch (Exception unused2) {
            Log.e("KeyTrigger", "Exception in call \"" + this.E + "\"on class " + view.getClass().getSimpleName() + " " + c.k(view));
        }
    }

    private void C(String str, View view) {
        boolean z10 = str.length() == 1;
        if (!z10) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f18743e.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z10 || lowerCase.matches(str)) {
                ConstraintAttribute constraintAttribute = this.f18743e.get(str2);
                if (constraintAttribute != null) {
                    constraintAttribute.a(view);
                }
            }
        }
    }

    private void E(RectF rectF, View view, boolean z10) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z10) {
            view.getMatrix().mapRect(rectF);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008c  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:58:0x00dc  */
    public void A(float f10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f11;
        float f12;
        boolean z13;
        boolean z14;
        float f13;
        float f14;
        boolean z15;
        if (this.J != f.f18718f) {
            if (this.K == null) {
                this.K = ((ViewGroup) view.getParent()).findViewById(this.J);
            }
            E(this.V, this.K, this.R);
            E(this.W, view, this.R);
            if (this.V.intersect(this.W)) {
                if (this.M) {
                    this.M = false;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.O) {
                    this.O = false;
                    z15 = true;
                } else {
                    z15 = false;
                }
                this.N = true;
                z14 = z15;
                z12 = false;
            } else {
                if (this.M) {
                    z10 = false;
                } else {
                    this.M = true;
                    z10 = true;
                }
                if (this.N) {
                    this.N = false;
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.O = true;
                z14 = false;
            }
        } else {
            if (this.M) {
                float f15 = this.P;
                if ((f10 - f15) * (this.Q - f15) < 0.0f) {
                    this.M = false;
                    z10 = true;
                }
                if (this.N) {
                    f13 = this.P;
                    f14 = f10 - f13;
                    if ((this.Q - f13) * f14 >= 0.0f && f14 < 0.0f) {
                        this.N = false;
                        z11 = true;
                    }
                    if (this.O) {
                        f11 = this.P;
                        f12 = f10 - f11;
                        if ((this.Q - f11) * f12 < 0.0f || f12 <= 0.0f) {
                            z13 = false;
                        } else {
                            this.O = false;
                            z13 = true;
                        }
                        boolean z16 = z11;
                        z14 = z13;
                        z12 = z16;
                    } else {
                        if (Math.abs(f10 - this.P) > this.L) {
                            this.O = true;
                        }
                        z12 = z11;
                        z14 = false;
                    }
                } else if (Math.abs(f10 - this.P) > this.L) {
                    this.N = true;
                }
                z11 = false;
                if (this.O) {
                    f11 = this.P;
                    f12 = f10 - f11;
                    if ((this.Q - f11) * f12 < 0.0f) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    boolean z17 = z11;
                    z14 = z13;
                    z12 = z17;
                } else {
                    if (Math.abs(f10 - this.P) > this.L) {
                        this.O = true;
                    }
                    z12 = z11;
                    z14 = false;
                }
            } else if (Math.abs(f10 - this.P) > this.L) {
                this.M = true;
            }
            z10 = false;
            if (this.N) {
                f13 = this.P;
                f14 = f10 - f13;
                if ((this.Q - f13) * f14 >= 0.0f) {
                }
                if (this.O) {
                    f11 = this.P;
                    f12 = f10 - f11;
                    if ((this.Q - f11) * f12 < 0.0f) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    boolean z18 = z11;
                    z14 = z13;
                    z12 = z18;
                } else {
                    if (Math.abs(f10 - this.P) > this.L) {
                        this.O = true;
                    }
                    z12 = z11;
                    z14 = false;
                }
            } else if (Math.abs(f10 - this.P) > this.L) {
                this.N = true;
            }
            z11 = false;
            if (this.O) {
                f11 = this.P;
                f12 = f10 - f11;
                if ((this.Q - f11) * f12 < 0.0f) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                boolean z19 = z11;
                z14 = z13;
                z12 = z19;
            } else {
                if (Math.abs(f10 - this.P) > this.L) {
                    this.O = true;
                }
                z12 = z11;
                z14 = false;
            }
        }
        this.Q = f10;
        if (z12 || z10 || z14) {
            ((MotionLayout) view.getParent()).x0(this.I, z14, f10);
        }
        View viewFindViewById = this.F == f.f18718f ? view : ((MotionLayout) view.getParent()).findViewById(this.F);
        if (z12) {
            String str = this.G;
            if (str != null) {
                B(str, viewFindViewById);
            }
            if (this.S != f.f18718f) {
                ((MotionLayout) view.getParent()).j1(this.S, viewFindViewById);
            }
        }
        if (z14) {
            String str2 = this.H;
            if (str2 != null) {
                B(str2, viewFindViewById);
            }
            if (this.T != f.f18718f) {
                ((MotionLayout) view.getParent()).j1(this.T, viewFindViewById);
            }
        }
        if (z10) {
            String str3 = this.E;
            if (str3 != null) {
                B(str3, viewFindViewById);
            }
            if (this.U != f.f18718f) {
                ((MotionLayout) view.getParent()).j1(this.U, viewFindViewById);
            }
        }
    }

    int D() {
        return this.D;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, androidx.constraintlayout.motion.utils.c> map) {
    }

    @Override // androidx.constraintlayout.motion.widget.f
    /* JADX INFO: renamed from: b */
    public f clone() {
        return new m().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public f c(f fVar) {
        super.c(fVar);
        m mVar = (m) fVar;
        this.D = mVar.D;
        this.E = mVar.E;
        this.F = mVar.F;
        this.G = mVar.G;
        this.H = mVar.H;
        this.I = mVar.I;
        this.J = mVar.J;
        this.K = mVar.K;
        this.L = mVar.L;
        this.M = mVar.M;
        this.N = mVar.N;
        this.O = mVar.O;
        this.P = mVar.P;
        this.Q = mVar.Q;
        this.R = mVar.R;
        this.V = mVar.V;
        this.W = mVar.W;
        this.X = mVar.X;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void d(HashSet<String> hashSet) {
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void f(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, R.styleable.N), context);
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void j(String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "positiveCross":
                this.H = obj.toString();
                break;
            case "viewTransitionOnPositiveCross":
                this.T = n(obj);
                break;
            case "triggerCollisionId":
                this.J = n(obj);
                break;
            case "triggerID":
                this.I = n(obj);
                break;
            case "negativeCross":
                this.G = obj.toString();
                break;
            case "triggerCollisionView":
                this.K = (View) obj;
                break;
            case "viewTransitionOnNegativeCross":
                this.S = n(obj);
                break;
            case "CROSS":
                this.E = obj.toString();
                break;
            case "triggerSlack":
                this.L = m(obj);
                break;
            case "viewTransitionOnCross":
                this.U = n(obj);
                break;
            case "postLayout":
                this.R = l(obj);
                break;
            case "triggerReceiver":
                this.F = n(obj);
                break;
        }
    }
}
