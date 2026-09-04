package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.w0;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.s;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.c;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class Carousel extends MotionHelper {
    private static final boolean I = false;
    private static final String J = "Carousel";
    public static final int K = 1;
    public static final int L = 2;
    private int A;
    private int B;
    private int C;
    private float D;
    private int E;
    private int F;
    int G;
    Runnable H;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b f18506o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ArrayList<View> f18507p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f18508q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f18509r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private MotionLayout f18510s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f18511t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f18512u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f18513v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f18514w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f18515x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f18516y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f18517z;

    public class a implements Runnable {

        /* JADX INFO: renamed from: androidx.constraintlayout.helper.widget.Carousel$a$a, reason: collision with other inner class name */
        public class RunnableC0111a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f18519b;

            RunnableC0111a(float f10) {
                this.f18519b = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                Carousel.this.f18510s.X0(5, 1.0f, this.f18519b);
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Carousel.this.f18510s.setProgress(0.0f);
            Carousel.this.Z();
            Carousel.this.f18506o.a(Carousel.this.f18509r);
            float velocity = Carousel.this.f18510s.getVelocity();
            if (Carousel.this.C != 2 || velocity <= Carousel.this.D || Carousel.this.f18509r >= Carousel.this.f18506o.count() - 1) {
                return;
            }
            float f10 = velocity * Carousel.this.f18517z;
            if (Carousel.this.f18509r != 0 || Carousel.this.f18508q <= Carousel.this.f18509r) {
                if (Carousel.this.f18509r != Carousel.this.f18506o.count() - 1 || Carousel.this.f18508q >= Carousel.this.f18509r) {
                    Carousel.this.f18510s.post(new RunnableC0111a(f10));
                }
            }
        }
    }

    public interface b {
        void a(int i10);

        void b(View view, int i10);

        int count();
    }

    public Carousel(Context context) {
        super(context);
        this.f18506o = null;
        this.f18507p = new ArrayList<>();
        this.f18508q = 0;
        this.f18509r = 0;
        this.f18511t = -1;
        this.f18512u = false;
        this.f18513v = -1;
        this.f18514w = -1;
        this.f18515x = -1;
        this.f18516y = -1;
        this.f18517z = 0.9f;
        this.A = 0;
        this.B = 4;
        this.C = 1;
        this.D = 2.0f;
        this.E = -1;
        this.F = 200;
        this.G = -1;
        this.H = new a();
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18506o = null;
        this.f18507p = new ArrayList<>();
        this.f18508q = 0;
        this.f18509r = 0;
        this.f18511t = -1;
        this.f18512u = false;
        this.f18513v = -1;
        this.f18514w = -1;
        this.f18515x = -1;
        this.f18516y = -1;
        this.f18517z = 0.9f;
        this.A = 0;
        this.B = 4;
        this.C = 1;
        this.D = 2.0f;
        this.E = -1;
        this.F = 200;
        this.G = -1;
        this.H = new a();
        U(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f18506o = null;
        this.f18507p = new ArrayList<>();
        this.f18508q = 0;
        this.f18509r = 0;
        this.f18511t = -1;
        this.f18512u = false;
        this.f18513v = -1;
        this.f18514w = -1;
        this.f18515x = -1;
        this.f18516y = -1;
        this.f18517z = 0.9f;
        this.A = 0;
        this.B = 4;
        this.C = 1;
        this.D = 2.0f;
        this.E = -1;
        this.F = 200;
        this.G = -1;
        this.H = new a();
        U(context, attributeSet);
    }

    private void S(boolean z10) {
        Iterator<s.b> it = this.f18510s.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            it.next().Q(z10);
        }
    }

    private boolean T(int i10, boolean z10) {
        MotionLayout motionLayout;
        s.b bVarD0;
        if (i10 == -1 || (motionLayout = this.f18510s) == null || (bVarD0 = motionLayout.D0(i10)) == null || z10 == bVarD0.K()) {
            return false;
        }
        bVarD0.Q(z10);
        return true;
    }

    private void U(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f19421q);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.Carousel_carousel_firstView) {
                    this.f18511t = typedArrayObtainStyledAttributes.getResourceId(index, this.f18511t);
                } else if (index == R.styleable.Carousel_carousel_backwardTransition) {
                    this.f18513v = typedArrayObtainStyledAttributes.getResourceId(index, this.f18513v);
                } else if (index == R.styleable.Carousel_carousel_forwardTransition) {
                    this.f18514w = typedArrayObtainStyledAttributes.getResourceId(index, this.f18514w);
                } else if (index == R.styleable.Carousel_carousel_emptyViewsBehavior) {
                    this.B = typedArrayObtainStyledAttributes.getInt(index, this.B);
                } else if (index == R.styleable.Carousel_carousel_previousState) {
                    this.f18515x = typedArrayObtainStyledAttributes.getResourceId(index, this.f18515x);
                } else if (index == R.styleable.Carousel_carousel_nextState) {
                    this.f18516y = typedArrayObtainStyledAttributes.getResourceId(index, this.f18516y);
                } else if (index == R.styleable.Carousel_carousel_touchUp_dampeningFactor) {
                    this.f18517z = typedArrayObtainStyledAttributes.getFloat(index, this.f18517z);
                } else if (index == R.styleable.Carousel_carousel_touchUpMode) {
                    this.C = typedArrayObtainStyledAttributes.getInt(index, this.C);
                } else if (index == R.styleable.Carousel_carousel_touchUp_velocityThreshold) {
                    this.D = typedArrayObtainStyledAttributes.getFloat(index, this.D);
                } else if (index == R.styleable.Carousel_carousel_infinite) {
                    this.f18512u = typedArrayObtainStyledAttributes.getBoolean(index, this.f18512u);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W() {
        this.f18510s.setTransitionDuration(this.F);
        if (this.E < this.f18509r) {
            this.f18510s.d1(this.f18515x, this.F);
        } else {
            this.f18510s.d1(this.f18516y, this.F);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        b bVar = this.f18506o;
        if (bVar == null || this.f18510s == null || bVar.count() == 0) {
            return;
        }
        int size = this.f18507p.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = this.f18507p.get(i10);
            int iCount = (this.f18509r + i10) - this.A;
            if (this.f18512u) {
                if (iCount < 0) {
                    int i11 = this.B;
                    if (i11 != 4) {
                        b0(view, i11);
                    } else {
                        b0(view, 0);
                    }
                    if (iCount % this.f18506o.count() == 0) {
                        this.f18506o.b(view, 0);
                    } else {
                        b bVar2 = this.f18506o;
                        bVar2.b(view, bVar2.count() + (iCount % this.f18506o.count()));
                    }
                } else if (iCount >= this.f18506o.count()) {
                    if (iCount == this.f18506o.count()) {
                        iCount = 0;
                    } else if (iCount > this.f18506o.count()) {
                        iCount %= this.f18506o.count();
                    }
                    int i12 = this.B;
                    if (i12 != 4) {
                        b0(view, i12);
                    } else {
                        b0(view, 0);
                    }
                    this.f18506o.b(view, iCount);
                } else {
                    b0(view, 0);
                    this.f18506o.b(view, iCount);
                }
            } else if (iCount < 0) {
                b0(view, this.B);
            } else if (iCount >= this.f18506o.count()) {
                b0(view, this.B);
            } else {
                b0(view, 0);
                this.f18506o.b(view, iCount);
            }
        }
        int i13 = this.E;
        if (i13 != -1 && i13 != this.f18509r) {
            this.f18510s.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18578b.W();
                }
            });
        } else if (i13 == this.f18509r) {
            this.E = -1;
        }
        if (this.f18513v == -1 || this.f18514w == -1) {
            Log.w(J, "No backward or forward transitions defined for Carousel!");
            return;
        }
        if (this.f18512u) {
            return;
        }
        int iCount2 = this.f18506o.count();
        if (this.f18509r == 0) {
            T(this.f18513v, false);
        } else {
            T(this.f18513v, true);
            this.f18510s.setTransition(this.f18513v);
        }
        if (this.f18509r == iCount2 - 1) {
            T(this.f18514w, false);
        } else {
            T(this.f18514w, true);
            this.f18510s.setTransition(this.f18514w);
        }
    }

    private boolean a0(int i10, View view, int i11) {
        c.a aVarK0;
        c cVarZ0 = this.f18510s.z0(i10);
        if (cVarZ0 == null || (aVarK0 = cVarZ0.k0(view.getId())) == null) {
            return false;
        }
        aVarK0.f19562c.f19684c = 1;
        view.setVisibility(i11);
        return true;
    }

    private boolean b0(View view, int i10) {
        MotionLayout motionLayout = this.f18510s;
        if (motionLayout == null) {
            return false;
        }
        boolean zA0 = false;
        for (int i11 : motionLayout.getConstraintSetIds()) {
            zA0 |= a0(i11, view, i10);
        }
        return zA0;
    }

    public void V(int i10) {
        this.f18509r = Math.max(0, Math.min(getCount() - 1, i10));
        X();
    }

    public void X() {
        int size = this.f18507p.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = this.f18507p.get(i10);
            if (this.f18506o.count() == 0) {
                b0(view, this.B);
            } else {
                b0(view, 0);
            }
        }
        this.f18510s.R0();
        Z();
    }

    public void Y(int i10, int i11) {
        this.E = Math.max(0, Math.min(getCount() - 1, i10));
        int iMax = Math.max(0, i11);
        this.F = iMax;
        this.f18510s.setTransitionDuration(iMax);
        if (i10 < this.f18509r) {
            this.f18510s.d1(this.f18515x, this.F);
        } else {
            this.f18510s.d1(this.f18516y, this.F);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.l
    public void g(MotionLayout motionLayout, int i10, int i11, float f10) {
        this.G = i10;
    }

    public int getCount() {
        b bVar = this.f18506o;
        if (bVar != null) {
            return bVar.count();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.f18509r;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.l
    public void i(MotionLayout motionLayout, int i10) {
        int i11 = this.f18509r;
        this.f18508q = i11;
        if (i10 == this.f18516y) {
            this.f18509r = i11 + 1;
        } else if (i10 == this.f18515x) {
            this.f18509r = i11 - 1;
        }
        if (this.f18512u) {
            if (this.f18509r >= this.f18506o.count()) {
                this.f18509r = 0;
            }
            if (this.f18509r < 0) {
                this.f18509r = this.f18506o.count() - 1;
            }
        } else {
            if (this.f18509r >= this.f18506o.count()) {
                this.f18509r = this.f18506o.count() - 1;
            }
            if (this.f18509r < 0) {
                this.f18509r = 0;
            }
        }
        if (this.f18508q != this.f18509r) {
            this.f18510s.post(this.H);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @w0(api = 17)
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            for (int i10 = 0; i10 < this.f19249c; i10++) {
                int i11 = this.f19248b[i10];
                View viewP = motionLayout.p(i11);
                if (this.f18511t == i11) {
                    this.A = i10;
                }
                this.f18507p.add(viewP);
            }
            this.f18510s = motionLayout;
            if (this.C == 2) {
                s.b bVarD0 = motionLayout.D0(this.f18514w);
                if (bVarD0 != null) {
                    bVarD0.U(5);
                }
                s.b bVarD1 = this.f18510s.D0(this.f18513v);
                if (bVarD1 != null) {
                    bVarD1.U(5);
                }
            }
            Z();
        }
    }

    public void setAdapter(b bVar) {
        this.f18506o = bVar;
    }
}
