package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: MotionScene.java */
/* JADX INFO: loaded from: classes.dex */
public class s {
    private static final int A = -1;
    private static final int B = -2;
    public static final int C = -1;
    public static final int D = 0;
    public static final int E = 1;
    private static final String F = "MotionScene";
    private static final String G = "Transition";
    private static final String H = "OnSwipe";
    private static final String I = "OnClick";
    private static final String J = "StateSet";
    private static final String K = "Include";
    private static final String L = "include";
    private static final String M = "KeyFrameSet";
    private static final String N = "ConstraintSet";
    private static final String O = "ViewTransition";
    static final int P = 0;
    static final int Q = 1;
    static final int R = 2;
    static final int S = 3;
    static final int T = 4;
    static final int U = 5;
    static final int V = 6;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f18964v = "MotionScene";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final boolean f18965w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f18966x = 8;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final int f18967y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final int f18968z = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MotionLayout f18969a;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MotionEvent f18982n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MotionLayout.i f18985q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f18986r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final a0 f18987s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    float f18988t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    float f18989u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    androidx.constraintlayout.widget.f f18970b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    b f18971c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18972d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<b> f18973e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f18974f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<b> f18975g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SparseArray<androidx.constraintlayout.widget.c> f18976h = new SparseArray<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private HashMap<String, Integer> f18977i = new HashMap<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SparseIntArray f18978j = new SparseIntArray();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f18979k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f18980l = 400;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f18981m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f18983o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f18984p = false;

    /* JADX INFO: compiled from: MotionScene.java */
    public class a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.core.motion.utils.d f18990a;

        a(androidx.constraintlayout.core.motion.utils.d dVar) {
            this.f18990a = dVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return (float) this.f18990a.a(f10);
        }
    }

    /* JADX INFO: compiled from: MotionScene.java */
    public static class b {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f18992s = 0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f18993t = 1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f18994u = 2;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f18995v = 3;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f18996w = 4;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        static final int f18997x = 1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        static final int f18998y = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f18999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f19000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f19001c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f19002d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f19003e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f19004f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f19005g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f19006h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f19007i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final s f19008j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private ArrayList<i> f19009k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private v f19010l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ArrayList<a> f19011m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f19012n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f19013o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f19014p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f19015q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f19016r;

        /* JADX INFO: compiled from: MotionScene.java */
        public static class a implements View.OnClickListener {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f19017e = 1;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f19018f = 17;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f19019g = 16;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f19020h = 256;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f19021i = 4096;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final b f19022b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f19023c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f19024d;

            public a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.f19023c = -1;
                this.f19024d = 17;
                this.f19022b = bVar;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.f19396d0);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i10 = 0; i10 < indexCount; i10++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i10);
                    if (index == R.styleable.OnClick_targetId) {
                        this.f19023c = typedArrayObtainStyledAttributes.getResourceId(index, this.f19023c);
                    } else if (index == R.styleable.OnClick_clickAction) {
                        this.f19024d = typedArrayObtainStyledAttributes.getInt(index, this.f19024d);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            public a(b bVar, int i10, int i11) {
                this.f19022b = bVar;
                this.f19023c = i10;
                this.f19024d = i11;
            }

            public void a(MotionLayout motionLayout, int i10, b bVar) {
                boolean z10;
                View viewFindViewById;
                int i11 = this.f19023c;
                View view = motionLayout;
                if (i11 != -1) {
                    viewFindViewById = motionLayout.findViewById(i11);
                }
                if (view == null) {
                    view = viewFindViewById;
                    Log.e("MotionScene", "OnClick could not find id " + this.f19023c);
                    return;
                }
                int i12 = bVar.f19002d;
                int i13 = bVar.f19001c;
                if (i12 == -1) {
                    view = viewFindViewById;
                    view.setOnClickListener(this);
                    return;
                }
                int i14 = this.f19024d;
                boolean z11 = false;
                if ((i14 & 1) == 0 || i10 != i12) {
                    view = viewFindViewById;
                    z10 = false;
                } else {
                    z10 = true;
                }
                boolean z12 = ((i14 & 1) != 0 && i10 == i12) | z10 | ((i14 & 256) != 0 && i10 == i12) | ((i14 & 16) != 0 && i10 == i13);
                if ((i14 & 4096) != 0 && i10 == i13) {
                    z11 = true;
                }
                if (z12 || z11) {
                    view.setOnClickListener(this);
                }
            }

            boolean b(b bVar, MotionLayout motionLayout) {
                b bVar2 = this.f19022b;
                if (bVar2 == bVar) {
                    return true;
                }
                int i10 = bVar2.f19001c;
                int i11 = this.f19022b.f19002d;
                if (i11 == -1) {
                    return motionLayout.O != i10;
                }
                int i12 = motionLayout.O;
                return i12 == i11 || i12 == i10;
            }

            public void c(MotionLayout motionLayout) {
                int i10 = this.f19023c;
                if (i10 == -1) {
                    return;
                }
                View viewFindViewById = motionLayout.findViewById(i10);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                Log.e("MotionScene", " (*)  could not find id " + this.f19023c);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MotionLayout motionLayout = this.f19022b.f19008j.f18969a;
                if (motionLayout.J0()) {
                    if (this.f19022b.f19002d == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.c1(this.f19022b.f19001c);
                            return;
                        }
                        b bVar = new b(this.f19022b.f19008j, this.f19022b);
                        bVar.f19002d = currentState;
                        bVar.f19001c = this.f19022b.f19001c;
                        motionLayout.setTransition(bVar);
                        motionLayout.Z0();
                        return;
                    }
                    b bVar2 = this.f19022b.f19008j.f18971c;
                    int i10 = this.f19024d;
                    boolean z10 = false;
                    boolean z11 = ((i10 & 1) == 0 && (i10 & 256) == 0) ? false : true;
                    boolean z12 = ((i10 & 16) == 0 && (i10 & 4096) == 0) ? false : true;
                    if (z11 && z12) {
                        b bVar3 = this.f19022b.f19008j.f18971c;
                        b bVar4 = this.f19022b;
                        if (bVar3 != bVar4) {
                            motionLayout.setTransition(bVar4);
                        }
                        if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                            z12 = false;
                            z10 = z11;
                        }
                    } else {
                        z10 = z11;
                    }
                    if (b(bVar2, motionLayout)) {
                        if (z10 && (this.f19024d & 1) != 0) {
                            motionLayout.setTransition(this.f19022b);
                            motionLayout.Z0();
                            return;
                        }
                        if (z12 && (this.f19024d & 16) != 0) {
                            motionLayout.setTransition(this.f19022b);
                            motionLayout.b1();
                        } else if (z10 && (this.f19024d & 256) != 0) {
                            motionLayout.setTransition(this.f19022b);
                            motionLayout.setProgress(1.0f);
                        } else {
                            if (!z12 || (this.f19024d & 4096) == 0) {
                                return;
                            }
                            motionLayout.setTransition(this.f19022b);
                            motionLayout.setProgress(0.0f);
                        }
                    }
                }
            }
        }

        public b(int i10, s sVar, int i11, int i12) {
            this.f18999a = -1;
            this.f19000b = false;
            this.f19001c = -1;
            this.f19002d = -1;
            this.f19003e = 0;
            this.f19004f = null;
            this.f19005g = -1;
            this.f19006h = 400;
            this.f19007i = 0.0f;
            this.f19009k = new ArrayList<>();
            this.f19010l = null;
            this.f19011m = new ArrayList<>();
            this.f19012n = 0;
            this.f19013o = false;
            this.f19014p = -1;
            this.f19015q = 0;
            this.f19016r = 0;
            this.f18999a = i10;
            this.f19008j = sVar;
            this.f19002d = i11;
            this.f19001c = i12;
            this.f19006h = sVar.f18980l;
            this.f19015q = sVar.f18981m;
        }

        b(s sVar, Context context, XmlPullParser xmlPullParser) {
            this.f18999a = -1;
            this.f19000b = false;
            this.f19001c = -1;
            this.f19002d = -1;
            this.f19003e = 0;
            this.f19004f = null;
            this.f19005g = -1;
            this.f19006h = 400;
            this.f19007i = 0.0f;
            this.f19009k = new ArrayList<>();
            this.f19010l = null;
            this.f19011m = new ArrayList<>();
            this.f19012n = 0;
            this.f19013o = false;
            this.f19014p = -1;
            this.f19015q = 0;
            this.f19016r = 0;
            this.f19006h = sVar.f18980l;
            this.f19015q = sVar.f18981m;
            this.f19008j = sVar;
            y(sVar, context, Xml.asAttributeSet(xmlPullParser));
        }

        b(s sVar, b bVar) {
            this.f18999a = -1;
            this.f19000b = false;
            this.f19001c = -1;
            this.f19002d = -1;
            this.f19003e = 0;
            this.f19004f = null;
            this.f19005g = -1;
            this.f19006h = 400;
            this.f19007i = 0.0f;
            this.f19009k = new ArrayList<>();
            this.f19010l = null;
            this.f19011m = new ArrayList<>();
            this.f19012n = 0;
            this.f19013o = false;
            this.f19014p = -1;
            this.f19015q = 0;
            this.f19016r = 0;
            this.f19008j = sVar;
            this.f19006h = sVar.f18980l;
            if (bVar != null) {
                this.f19014p = bVar.f19014p;
                this.f19003e = bVar.f19003e;
                this.f19004f = bVar.f19004f;
                this.f19005g = bVar.f19005g;
                this.f19006h = bVar.f19006h;
                this.f19009k = bVar.f19009k;
                this.f19007i = bVar.f19007i;
                this.f19015q = bVar.f19015q;
            }
        }

        private void x(s sVar, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                if (index == R.styleable.Transition_constraintSetEnd) {
                    this.f19001c = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f19001c);
                    if (com.google.android.exoplayer2.text.ttml.d.f49813w.equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        cVar.w0(context, this.f19001c);
                        sVar.f18976h.append(this.f19001c, cVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f19001c = sVar.a0(context, this.f19001c);
                    }
                } else if (index == R.styleable.Transition_constraintSetStart) {
                    this.f19002d = typedArray.getResourceId(index, this.f19002d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f19002d);
                    if (com.google.android.exoplayer2.text.ttml.d.f49813w.equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
                        cVar2.w0(context, this.f19002d);
                        sVar.f18976h.append(this.f19002d, cVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f19002d = sVar.a0(context, this.f19002d);
                    }
                } else if (index == R.styleable.Transition_motionInterpolator) {
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.f19005g = resourceId;
                        if (resourceId != -1) {
                            this.f19003e = -2;
                        }
                    } else if (i11 == 3) {
                        String string = typedArray.getString(index);
                        this.f19004f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f19005g = typedArray.getResourceId(index, -1);
                                this.f19003e = -2;
                            } else {
                                this.f19003e = -1;
                            }
                        }
                    } else {
                        this.f19003e = typedArray.getInteger(index, this.f19003e);
                    }
                } else if (index == R.styleable.Transition_duration) {
                    int i12 = typedArray.getInt(index, this.f19006h);
                    this.f19006h = i12;
                    if (i12 < 8) {
                        this.f19006h = 8;
                    }
                } else if (index == R.styleable.Transition_staggered) {
                    this.f19007i = typedArray.getFloat(index, this.f19007i);
                } else if (index == R.styleable.Transition_autoTransition) {
                    this.f19012n = typedArray.getInteger(index, this.f19012n);
                } else if (index == R.styleable.Transition_android_id) {
                    this.f18999a = typedArray.getResourceId(index, this.f18999a);
                } else if (index == R.styleable.Transition_transitionDisable) {
                    this.f19013o = typedArray.getBoolean(index, this.f19013o);
                } else if (index == R.styleable.Transition_pathMotionArc) {
                    this.f19014p = typedArray.getInteger(index, -1);
                } else if (index == R.styleable.Transition_layoutDuringTransition) {
                    this.f19015q = typedArray.getInteger(index, 0);
                } else if (index == R.styleable.Transition_transitionFlags) {
                    this.f19016r = typedArray.getInteger(index, 0);
                }
            }
            if (this.f19002d == -1) {
                this.f19000b = true;
            }
        }

        private void y(s sVar, Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f19430u0);
            x(sVar, context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }

        public int A() {
            return this.f19006h;
        }

        public int B() {
            return this.f19001c;
        }

        public int C() {
            return this.f18999a;
        }

        public List<i> D() {
            return this.f19009k;
        }

        public int E() {
            return this.f19015q;
        }

        public List<a> F() {
            return this.f19011m;
        }

        public int G() {
            return this.f19014p;
        }

        public float H() {
            return this.f19007i;
        }

        public int I() {
            return this.f19002d;
        }

        public v J() {
            return this.f19010l;
        }

        public boolean K() {
            return !this.f19013o;
        }

        public boolean L(int i10) {
            return (i10 & this.f19016r) != 0;
        }

        public void M(int i10) {
            a next;
            Iterator<a> it = this.f19011m.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.f19023c != i10);
            if (next != null) {
                this.f19011m.remove(next);
            }
        }

        public void N(int i10) {
            this.f19012n = i10;
        }

        public void O(int i10) {
            this.f19006h = Math.max(i10, 8);
        }

        public void P(boolean z10) {
            Q(z10);
        }

        public void Q(boolean z10) {
            this.f19013o = !z10;
        }

        public void R(int i10, String str, int i11) {
            this.f19003e = i10;
            this.f19004f = str;
            this.f19005g = i11;
        }

        public void S(int i10) {
            this.f19015q = i10;
        }

        public void T(t tVar) {
            this.f19010l = tVar == null ? null : new v(this.f19008j.f18969a, tVar);
        }

        public void U(int i10) {
            v vVarJ = J();
            if (vVarJ != null) {
                vVarJ.E(i10);
            }
        }

        public void V(int i10) {
            this.f19014p = i10;
        }

        public void W(float f10) {
            this.f19007i = f10;
        }

        public void X(int i10) {
            this.f19016r = i10;
        }

        public void t(i iVar) {
            this.f19009k.add(iVar);
        }

        public void u(int i10, int i11) {
            for (a aVar : this.f19011m) {
                if (aVar.f19023c == i10) {
                    aVar.f19024d = i11;
                    return;
                }
            }
            this.f19011m.add(new a(this, i10, i11));
        }

        public void v(Context context, XmlPullParser xmlPullParser) {
            this.f19011m.add(new a(context, this, xmlPullParser));
        }

        public String w(Context context) {
            String resourceEntryName = this.f19002d == -1 ? "null" : context.getResources().getResourceEntryName(this.f19002d);
            if (this.f19001c == -1) {
                return resourceEntryName + " -> null";
            }
            return resourceEntryName + " -> " + context.getResources().getResourceEntryName(this.f19001c);
        }

        public int z() {
            return this.f19012n;
        }
    }

    s(Context context, MotionLayout motionLayout, int i10) {
        this.f18969a = motionLayout;
        this.f18987s = new a0(motionLayout);
        V(context, i10);
        SparseArray<androidx.constraintlayout.widget.c> sparseArray = this.f18976h;
        int i11 = R.id.motion_base;
        sparseArray.put(i11, new androidx.constraintlayout.widget.c());
        this.f18977i.put("motion_base", Integer.valueOf(i11));
    }

    public s(MotionLayout motionLayout) {
        this.f18969a = motionLayout;
        this.f18987s = new a0(motionLayout);
    }

    static String A(Context context, int i10, XmlPullParser xmlPullParser) {
        return ".(" + c.i(context, i10) + ".xml:" + xmlPullParser.getLineNumber() + ") \"" + xmlPullParser.getName() + "\"";
    }

    private int G(int i10) {
        int iE;
        androidx.constraintlayout.widget.f fVar = this.f18970b;
        return (fVar == null || (iE = fVar.e(i10, -1, -1)) == -1) ? i10 : iE;
    }

    private boolean R(int i10) {
        int i11 = this.f18978j.get(i10);
        int size = this.f18978j.size();
        while (i11 > 0) {
            if (i11 == i10) {
                return true;
            }
            int i12 = size - 1;
            if (size < 0) {
                return true;
            }
            i11 = this.f18978j.get(i11);
            size = i12;
        }
        return false;
    }

    private boolean T() {
        return this.f18985q != null;
    }

    private void V(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        b bVar = null;
        try {
            int eventType = xml.getEventType();
            while (true) {
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    if (this.f18979k) {
                        System.out.println("parsing = " + name);
                    }
                    switch (name) {
                        case "MotionScene":
                            c0(context, xml);
                            break;
                        case "Transition":
                            ArrayList<b> arrayList = this.f18973e;
                            b bVar2 = new b(this, context, xml);
                            arrayList.add(bVar2);
                            if (this.f18971c == null && !bVar2.f19000b) {
                                this.f18971c = bVar2;
                                if (bVar2.f19010l != null) {
                                    this.f18971c.f19010l.C(this.f18986r);
                                }
                            }
                            if (bVar2.f19000b) {
                                if (bVar2.f19001c == -1) {
                                    this.f18974f = bVar2;
                                } else {
                                    this.f18975g.add(bVar2);
                                }
                                this.f18973e.remove(bVar2);
                            }
                            bVar = bVar2;
                            break;
                        case "OnSwipe":
                            if (bVar == null) {
                                Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i10) + ".xml:" + xml.getLineNumber() + ")");
                            }
                            if (bVar == null) {
                                break;
                            } else {
                                bVar.f19010l = new v(context, this.f18969a, xml);
                                break;
                            }
                            break;
                        case "OnClick":
                            if (bVar == null) {
                                break;
                            } else {
                                bVar.v(context, xml);
                                break;
                            }
                            break;
                        case "StateSet":
                            this.f18970b = new androidx.constraintlayout.widget.f(context, xml);
                            break;
                        case "ConstraintSet":
                            Z(context, xml);
                            break;
                        case "include":
                        case "Include":
                            b0(context, xml);
                            break;
                        case "KeyFrameSet":
                            i iVar = new i(context, xml);
                            if (bVar == null) {
                                break;
                            } else {
                                bVar.f19009k.add(iVar);
                                break;
                            }
                            break;
                        case "ViewTransition":
                            this.f18987s.b(new z(context, xml));
                            break;
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    private int Z(Context context, XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.a1(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int i10 = 0;
        int iV = -1;
        int iV2 = -1;
        while (true) {
            if (i10 >= attributeCount) {
                if (iV != -1) {
                    if (this.f18969a.G2 != 0) {
                        cVar.z1(true);
                    }
                    cVar.x0(context, xmlPullParser);
                    if (iV2 != -1) {
                        this.f18978j.put(iV, iV2);
                    }
                    this.f18976h.put(iV, cVar);
                }
                return iV;
            }
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (this.f18979k) {
                System.out.println("id string = " + attributeValue);
            }
            attributeName.hashCode();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iV2 = v(context, attributeValue);
                    break;
                case "constraintRotate":
                    cVar.f19556d = Integer.parseInt(attributeValue);
                    break;
                case "id":
                    iV = v(context, attributeValue);
                    this.f18977i.put(q0(attributeValue), Integer.valueOf(iV));
                    cVar.f19554b = c.i(context, iV);
                    break;
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a0(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && N.equals(name)) {
                    return Z(context, xml);
                }
            }
            return -1;
        } catch (IOException e10) {
            e10.printStackTrace();
            return -1;
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
            return -1;
        }
    }

    private void b0(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.A0);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == R.styleable.include_constraintSet) {
                a0(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void c0(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.f19392b0);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == R.styleable.MotionScene_defaultDuration) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f18980l);
                this.f18980l = i11;
                if (i11 < 8) {
                    this.f18980l = 8;
                }
            } else if (index == R.styleable.MotionScene_layoutDuringTransition) {
                this.f18981m = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void g0(int i10, MotionLayout motionLayout) {
        androidx.constraintlayout.widget.c cVar = this.f18976h.get(i10);
        cVar.f19555c = cVar.f19554b;
        int i11 = this.f18978j.get(i10);
        if (i11 > 0) {
            g0(i11, motionLayout);
            androidx.constraintlayout.widget.c cVar2 = this.f18976h.get(i11);
            if (cVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + c.i(this.f18969a.getContext(), i11));
                return;
            }
            cVar.f19555c += "/" + cVar2.f19555c;
            cVar.J0(cVar2);
        } else {
            cVar.f19555c += "  layout";
            cVar.I0(motionLayout);
        }
        cVar.q(cVar);
    }

    public static String q0(String str) {
        if (str == null) {
            return "";
        }
        int iIndexOf = str.indexOf(47);
        return iIndexOf < 0 ? str : str.substring(iIndexOf + 1);
    }

    private int v(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (this.f18979k) {
                System.out.println("id getMap res = " + identifier);
            }
        } else {
            identifier = -1;
        }
        if (identifier != -1) {
            return identifier;
        }
        if (str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e("MotionScene", "error in parsing id");
        return identifier;
    }

    private int w(b bVar) {
        int i10 = bVar.f18999a;
        if (i10 == -1) {
            throw new IllegalArgumentException("The transition must have an id");
        }
        for (int i11 = 0; i11 < this.f18973e.size(); i11++) {
            if (this.f18973e.get(i11).f18999a == i10) {
                return i11;
            }
        }
        return -1;
    }

    float B() {
        b bVar = this.f18971c;
        if (bVar == null || bVar.f19010l == null) {
            return 0.0f;
        }
        return this.f18971c.f19010l.i();
    }

    float C() {
        b bVar = this.f18971c;
        if (bVar == null || bVar.f19010l == null) {
            return 0.0f;
        }
        return this.f18971c.f19010l.j();
    }

    boolean D() {
        b bVar = this.f18971c;
        if (bVar == null || bVar.f19010l == null) {
            return false;
        }
        return this.f18971c.f19010l.k();
    }

    public float E(View view, int i10) {
        return 0.0f;
    }

    float F(float f10, float f11) {
        b bVar = this.f18971c;
        if (bVar == null || bVar.f19010l == null) {
            return 0.0f;
        }
        return this.f18971c.f19010l.l(f10, f11);
    }

    int H() {
        b bVar = this.f18971c;
        if (bVar == null || bVar.f19010l == null) {
            return 0;
        }
        return this.f18971c.f19010l.m();
    }

    float I() {
        b bVar = this.f18971c;
        if (bVar == null || bVar.f19010l == null) {
            return 0.0f;
        }
        return this.f18971c.f19010l.n();
    }

    float J() {
        b bVar = this.f18971c;
        if (bVar == null || bVar.f19010l == null) {
            return 0.0f;
        }
        return this.f18971c.f19010l.o();
    }

    float K() {
        b bVar = this.f18971c;
        if (bVar == null || bVar.f19010l == null) {
            return 0.0f;
        }
        return this.f18971c.f19010l.p();
    }

    float L() {
        b bVar = this.f18971c;
        if (bVar == null || bVar.f19010l == null) {
            return 0.0f;
        }
        return this.f18971c.f19010l.q();
    }

    public float M() {
        b bVar = this.f18971c;
        if (bVar != null) {
            return bVar.f19007i;
        }
        return 0.0f;
    }

    int N() {
        b bVar = this.f18971c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f19002d;
    }

    public b O(int i10) {
        for (b bVar : this.f18973e) {
            if (bVar.f18999a == i10) {
                return bVar;
            }
        }
        return null;
    }

    int P(int i10) {
        Iterator<b> it = this.f18973e.iterator();
        while (it.hasNext()) {
            if (it.next().f19002d == i10) {
                return 0;
            }
        }
        return 1;
    }

    public List<b> Q(int i10) {
        int iG = G(i10);
        ArrayList arrayList = new ArrayList();
        for (b bVar : this.f18973e) {
            if (bVar.f19002d == iG || bVar.f19001c == iG) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    boolean S(View view, int i10) {
        b bVar = this.f18971c;
        if (bVar == null) {
            return false;
        }
        Iterator it = bVar.f19009k.iterator();
        while (it.hasNext()) {
            Iterator<f> it2 = ((i) it.next()).d(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f18739a == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean U(int i10) {
        return this.f18987s.h(i10);
    }

    public int W(String str) {
        Integer num = this.f18977i.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public String X(int i10) {
        for (Map.Entry<String, Integer> entry : this.f18977i.entrySet()) {
            Integer value = entry.getValue();
            if (value != null && value.intValue() == i10) {
                return entry.getKey();
            }
        }
        return null;
    }

    protected void Y(boolean z10, int i10, int i11, int i12, int i13) {
    }

    void d0(float f10, float f11) {
        b bVar = this.f18971c;
        if (bVar == null || bVar.f19010l == null) {
            return;
        }
        this.f18971c.f19010l.v(f10, f11);
    }

    void e0(float f10, float f11) {
        b bVar = this.f18971c;
        if (bVar == null || bVar.f19010l == null) {
            return;
        }
        this.f18971c.f19010l.w(f10, f11);
    }

    public void f(MotionLayout motionLayout, int i10) {
        for (b bVar : this.f18973e) {
            if (bVar.f19011m.size() > 0) {
                Iterator it = bVar.f19011m.iterator();
                while (it.hasNext()) {
                    ((b.a) it.next()).c(motionLayout);
                }
            }
        }
        for (b bVar2 : this.f18975g) {
            if (bVar2.f19011m.size() > 0) {
                Iterator it2 = bVar2.f19011m.iterator();
                while (it2.hasNext()) {
                    ((b.a) it2.next()).c(motionLayout);
                }
            }
        }
        for (b bVar3 : this.f18973e) {
            if (bVar3.f19011m.size() > 0) {
                Iterator it3 = bVar3.f19011m.iterator();
                while (it3.hasNext()) {
                    ((b.a) it3.next()).a(motionLayout, i10, bVar3);
                }
            }
        }
        for (b bVar4 : this.f18975g) {
            if (bVar4.f19011m.size() > 0) {
                Iterator it4 = bVar4.f19011m.iterator();
                while (it4.hasNext()) {
                    ((b.a) it4.next()).a(motionLayout, i10, bVar4);
                }
            }
        }
    }

    void f0(MotionEvent motionEvent, int i10, MotionLayout motionLayout) {
        MotionLayout.i iVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f18985q == null) {
            this.f18985q = this.f18969a.N0();
        }
        this.f18985q.b(motionEvent);
        if (i10 != -1) {
            int action = motionEvent.getAction();
            boolean z10 = false;
            if (action == 0) {
                this.f18988t = motionEvent.getRawX();
                this.f18989u = motionEvent.getRawY();
                this.f18982n = motionEvent;
                this.f18983o = false;
                if (this.f18971c.f19010l != null) {
                    RectF rectFG = this.f18971c.f19010l.g(this.f18969a, rectF);
                    if (rectFG != null && !rectFG.contains(this.f18982n.getX(), this.f18982n.getY())) {
                        this.f18982n = null;
                        this.f18983o = true;
                        return;
                    }
                    RectF rectFR = this.f18971c.f19010l.r(this.f18969a, rectF);
                    if (rectFR == null || rectFR.contains(this.f18982n.getX(), this.f18982n.getY())) {
                        this.f18984p = false;
                    } else {
                        this.f18984p = true;
                    }
                    this.f18971c.f19010l.z(this.f18988t, this.f18989u);
                    return;
                }
                return;
            }
            if (action == 2 && !this.f18983o) {
                float rawY = motionEvent.getRawY() - this.f18989u;
                float rawX = motionEvent.getRawX() - this.f18988t;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.f18982n) == null) {
                    return;
                }
                b bVarJ = j(i10, rawX, rawY, motionEvent2);
                if (bVarJ != null) {
                    motionLayout.setTransition(bVarJ);
                    RectF rectFR2 = this.f18971c.f19010l.r(this.f18969a, rectF);
                    if (rectFR2 != null && !rectFR2.contains(this.f18982n.getX(), this.f18982n.getY())) {
                        z10 = true;
                    }
                    this.f18984p = z10;
                    this.f18971c.f19010l.F(this.f18988t, this.f18989u);
                }
            }
        }
        if (this.f18983o) {
            return;
        }
        b bVar = this.f18971c;
        if (bVar != null && bVar.f19010l != null && !this.f18984p) {
            this.f18971c.f19010l.t(motionEvent, this.f18985q, i10, this);
        }
        this.f18988t = motionEvent.getRawX();
        this.f18989u = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (iVar = this.f18985q) == null) {
            return;
        }
        iVar.recycle();
        this.f18985q = null;
        int i11 = motionLayout.O;
        if (i11 != -1) {
            i(motionLayout, i11);
        }
    }

    public void g(b bVar) {
        int iW = w(bVar);
        if (iW == -1) {
            this.f18973e.add(bVar);
        } else {
            this.f18973e.set(iW, bVar);
        }
    }

    public boolean h(int i10, o oVar) {
        return this.f18987s.e(i10, oVar);
    }

    void h0(MotionLayout motionLayout) {
        for (int i10 = 0; i10 < this.f18976h.size(); i10++) {
            int iKeyAt = this.f18976h.keyAt(i10);
            if (R(iKeyAt)) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            }
            g0(iKeyAt, motionLayout);
        }
    }

    boolean i(MotionLayout motionLayout, int i10) {
        b bVar;
        if (T() || this.f18972d) {
            return false;
        }
        for (b bVar2 : this.f18973e) {
            if (bVar2.f19012n != 0 && ((bVar = this.f18971c) != bVar2 || !bVar.L(2))) {
                if (i10 == bVar2.f19002d && (bVar2.f19012n == 4 || bVar2.f19012n == 2)) {
                    MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(bVar2);
                    if (bVar2.f19012n == 4) {
                        motionLayout.Z0();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.s0(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState);
                        motionLayout.O0();
                    }
                    return true;
                }
                if (i10 == bVar2.f19001c && (bVar2.f19012n == 3 || bVar2.f19012n == 1)) {
                    MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState2);
                    motionLayout.setTransition(bVar2);
                    if (bVar2.f19012n == 3) {
                        motionLayout.b1();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.s0(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState2);
                        motionLayout.O0();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void i0(b bVar) {
        int iW = w(bVar);
        if (iW != -1) {
            this.f18973e.remove(iW);
        }
    }

    public b j(int i10, float f10, float f11, MotionEvent motionEvent) {
        if (i10 == -1) {
            return this.f18971c;
        }
        List<b> listQ = Q(i10);
        float f12 = 0.0f;
        b bVar = null;
        RectF rectF = new RectF();
        for (b bVar2 : listQ) {
            if (!bVar2.f19013o && bVar2.f19010l != null) {
                bVar2.f19010l.C(this.f18986r);
                RectF rectFR = bVar2.f19010l.r(this.f18969a, rectF);
                if (rectFR == null || motionEvent == null || rectFR.contains(motionEvent.getX(), motionEvent.getY())) {
                    RectF rectFG = bVar2.f19010l.g(this.f18969a, rectF);
                    if (rectFG == null || motionEvent == null || rectFG.contains(motionEvent.getX(), motionEvent.getY())) {
                        float fA = bVar2.f19010l.a(f10, f11);
                        if (bVar2.f19010l.f19066l && motionEvent != null) {
                            float x10 = motionEvent.getX() - bVar2.f19010l.f19063i;
                            float y10 = motionEvent.getY() - bVar2.f19010l.f19064j;
                            fA = ((float) (Math.atan2(f11 + y10, f10 + x10) - Math.atan2(x10, y10))) * 10.0f;
                        }
                        float f13 = fA * (bVar2.f19001c == i10 ? -1.0f : 1.1f);
                        if (f13 > f12) {
                            bVar = bVar2;
                            f12 = f13;
                        }
                    }
                }
            }
        }
        return bVar;
    }

    public void j0(int i10, androidx.constraintlayout.widget.c cVar) {
        this.f18976h.put(i10, cVar);
    }

    public void k(boolean z10) {
        this.f18972d = z10;
    }

    public void k0(int i10) {
        b bVar = this.f18971c;
        if (bVar != null) {
            bVar.O(i10);
        } else {
            this.f18980l = i10;
        }
    }

    public void l(int i10, boolean z10) {
        this.f18987s.f(i10, z10);
    }

    public void l0(View view, int i10, String str, Object obj) {
        b bVar = this.f18971c;
        if (bVar == null) {
            return;
        }
        Iterator it = bVar.f19009k.iterator();
        while (it.hasNext()) {
            Iterator<f> it2 = ((i) it.next()).d(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f18739a == i10) {
                    if (obj != null) {
                        ((Float) obj).floatValue();
                    }
                    str.equalsIgnoreCase("app:PerpendicularPath_percent");
                }
            }
        }
    }

    public int m() {
        b bVar = this.f18971c;
        if (bVar != null) {
            return bVar.f19014p;
        }
        return -1;
    }

    public void m0(boolean z10) {
        this.f18986r = z10;
        b bVar = this.f18971c;
        if (bVar == null || bVar.f19010l == null) {
            return;
        }
        this.f18971c.f19010l.C(this.f18986r);
    }

    int n() {
        b bVar = this.f18971c;
        if (bVar == null || bVar.f19010l == null) {
            return 0;
        }
        return this.f18971c.f19010l.e();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0037  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094  */
    /* JADX WARN: Code duplicated, block: B:48:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0073 A[SYNTHETIC] */
    void n0(int i10, int i11) {
        int iE;
        int iE2;
        b bVar;
        Iterator<b> it;
        b bVar2;
        b bVar3;
        b next;
        androidx.constraintlayout.widget.f fVar = this.f18970b;
        if (fVar != null) {
            iE = fVar.e(i10, -1, -1);
            if (iE == -1) {
                iE = i10;
            }
            iE2 = this.f18970b.e(i11, -1, -1);
            if (iE2 == -1) {
            }
            bVar = this.f18971c;
            if (bVar == null && bVar.f19001c == i11 && this.f18971c.f19002d == i10) {
                return;
            }
            it = this.f18973e.iterator();
            while (true) {
                if (it.hasNext()) {
                    bVar2 = this.f18974f;
                    for (b bVar4 : this.f18975g) {
                        if (bVar4.f19001c == i11) {
                            bVar2 = bVar4;
                        }
                    }
                    bVar3 = new b(this, bVar2);
                    bVar3.f19002d = iE;
                    bVar3.f19001c = iE2;
                    if (iE != -1) {
                        this.f18973e.add(bVar3);
                    }
                    this.f18971c = bVar3;
                    return;
                }
                next = it.next();
                if ((next.f19001c != iE2 && next.f19002d == iE) || (next.f19001c == i11 && next.f19002d == i10)) {
                    break;
                }
            }
            this.f18971c = next;
            if (next != null || next.f19010l == null) {
            }
            this.f18971c.f19010l.C(this.f18986r);
            return;
        }
        iE = i10;
        iE2 = i11;
        bVar = this.f18971c;
        if (bVar == null) {
        }
        it = this.f18973e.iterator();
        while (true) {
            if (it.hasNext()) {
                bVar2 = this.f18974f;
                while (r3.hasNext()) {
                    if (bVar4.f19001c == i11) {
                        bVar2 = bVar4;
                    }
                }
                bVar3 = new b(this, bVar2);
                bVar3.f19002d = iE;
                bVar3.f19001c = iE2;
                if (iE != -1) {
                    this.f18973e.add(bVar3);
                }
                this.f18971c = bVar3;
                return;
            }
            next = it.next();
            if (next.f19001c != iE2) {
            }
        }
        this.f18971c = next;
        if (next != null) {
        }
    }

    androidx.constraintlayout.widget.c o(int i10) {
        return p(i10, -1, -1);
    }

    public void o0(b bVar) {
        this.f18971c = bVar;
        if (bVar == null || bVar.f19010l == null) {
            return;
        }
        this.f18971c.f19010l.C(this.f18986r);
    }

    androidx.constraintlayout.widget.c p(int i10, int i11, int i12) {
        int iE;
        if (this.f18979k) {
            System.out.println("id " + i10);
            System.out.println("size " + this.f18976h.size());
        }
        androidx.constraintlayout.widget.f fVar = this.f18970b;
        if (fVar != null && (iE = fVar.e(i10, i11, i12)) != -1) {
            i10 = iE;
        }
        if (this.f18976h.get(i10) != null) {
            return this.f18976h.get(i10);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + c.i(this.f18969a.getContext(), i10) + " In MotionScene");
        SparseArray<androidx.constraintlayout.widget.c> sparseArray = this.f18976h;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    void p0() {
        b bVar = this.f18971c;
        if (bVar == null || bVar.f19010l == null) {
            return;
        }
        this.f18971c.f19010l.G();
    }

    public androidx.constraintlayout.widget.c q(Context context, String str) {
        if (this.f18979k) {
            System.out.println("id " + str);
            System.out.println("size " + this.f18976h.size());
        }
        for (int i10 = 0; i10 < this.f18976h.size(); i10++) {
            int iKeyAt = this.f18976h.keyAt(i10);
            String resourceName = context.getResources().getResourceName(iKeyAt);
            if (this.f18979k) {
                System.out.println("Id for <" + i10 + "> is <" + resourceName + "> looking for <" + str + ">");
            }
            if (str.equals(resourceName)) {
                return this.f18976h.get(iKeyAt);
            }
        }
        return null;
    }

    public int[] r() {
        int size = this.f18976h.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = this.f18976h.keyAt(i10);
        }
        return iArr;
    }

    boolean r0() {
        Iterator<b> it = this.f18973e.iterator();
        while (it.hasNext()) {
            if (it.next().f19010l != null) {
                return true;
            }
        }
        b bVar = this.f18971c;
        return (bVar == null || bVar.f19010l == null) ? false : true;
    }

    public ArrayList<b> s() {
        return this.f18973e;
    }

    public boolean s0(MotionLayout motionLayout) {
        return motionLayout == this.f18969a && motionLayout.J == this;
    }

    public int t() {
        b bVar = this.f18971c;
        return bVar != null ? bVar.f19006h : this.f18980l;
    }

    public void t0(int i10, View... viewArr) {
        this.f18987s.m(i10, viewArr);
    }

    int u() {
        b bVar = this.f18971c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f19001c;
    }

    public Interpolator x() {
        int i10 = this.f18971c.f19003e;
        if (i10 == -2) {
            return AnimationUtils.loadInterpolator(this.f18969a.getContext(), this.f18971c.f19005g);
        }
        if (i10 == -1) {
            return new a(androidx.constraintlayout.core.motion.utils.d.c(this.f18971c.f19004f));
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

    f y(Context context, int i10, int i11, int i12) {
        b bVar = this.f18971c;
        if (bVar == null) {
            return null;
        }
        for (i iVar : bVar.f19009k) {
            for (Integer num : iVar.e()) {
                if (i11 == num.intValue()) {
                    for (f fVar : iVar.d(num.intValue())) {
                        if (fVar.f18739a == i12 && fVar.f18742d == i10) {
                            return fVar;
                        }
                    }
                }
            }
        }
        return null;
    }

    public void z(o oVar) {
        b bVar = this.f18971c;
        if (bVar != null) {
            Iterator it = bVar.f19009k.iterator();
            while (it.hasNext()) {
                ((i) it.next()).b(oVar);
            }
        } else {
            b bVar2 = this.f18974f;
            if (bVar2 != null) {
                Iterator it2 = bVar2.f19009k.iterator();
                while (it2.hasNext()) {
                    ((i) it2.next()).b(oVar);
                }
            }
        }
    }
}
