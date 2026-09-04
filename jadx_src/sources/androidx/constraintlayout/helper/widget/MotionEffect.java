package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.widget.R;

/* JADX INFO: loaded from: classes.dex */
public class MotionEffect extends MotionHelper {
    public static final int A = 2;
    public static final int B = 3;
    private static final int C = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f18564w = "FadeMove";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f18565x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f18566y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f18567z = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f18568o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f18569p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f18570q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f18571r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f18572s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f18573t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f18574u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f18575v;

    public MotionEffect(Context context) {
        super(context);
        this.f18568o = 0.1f;
        this.f18569p = 49;
        this.f18570q = 50;
        this.f18571r = 0;
        this.f18572s = 0;
        this.f18573t = true;
        this.f18574u = -1;
        this.f18575v = -1;
    }

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18568o = 0.1f;
        this.f18569p = 49;
        this.f18570q = 50;
        this.f18571r = 0;
        this.f18572s = 0;
        this.f18573t = true;
        this.f18574u = -1;
        this.f18575v = -1;
        J(context, attributeSet);
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f18568o = 0.1f;
        this.f18569p = 49;
        this.f18570q = 50;
        this.f18571r = 0;
        this.f18572s = 0;
        this.f18573t = true;
        this.f18574u = -1;
        this.f18575v = -1;
        J(context, attributeSet);
    }

    private void J(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.X);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.MotionEffect_motionEffect_start) {
                    int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f18569p);
                    this.f18569p = i11;
                    this.f18569p = Math.max(Math.min(i11, 99), 0);
                } else if (index == R.styleable.MotionEffect_motionEffect_end) {
                    int i12 = typedArrayObtainStyledAttributes.getInt(index, this.f18570q);
                    this.f18570q = i12;
                    this.f18570q = Math.max(Math.min(i12, 99), 0);
                } else if (index == R.styleable.MotionEffect_motionEffect_translationX) {
                    this.f18571r = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f18571r);
                } else if (index == R.styleable.MotionEffect_motionEffect_translationY) {
                    this.f18572s = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f18572s);
                } else if (index == R.styleable.MotionEffect_motionEffect_alpha) {
                    this.f18568o = typedArrayObtainStyledAttributes.getFloat(index, this.f18568o);
                } else if (index == R.styleable.MotionEffect_motionEffect_move) {
                    this.f18575v = typedArrayObtainStyledAttributes.getInt(index, this.f18575v);
                } else if (index == R.styleable.MotionEffect_motionEffect_strict) {
                    this.f18573t = typedArrayObtainStyledAttributes.getBoolean(index, this.f18573t);
                } else if (index == R.styleable.MotionEffect_motionEffect_viewTransition) {
                    this.f18574u = typedArrayObtainStyledAttributes.getResourceId(index, this.f18574u);
                }
            }
            int i13 = this.f18569p;
            int i14 = this.f18570q;
            if (i13 == i14) {
                if (i13 > 0) {
                    this.f18569p = i13 - 1;
                } else {
                    this.f18570q = i14 + 1;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0162  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0186, code lost:
    
        if (r14 == 0.0f) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x019a, code lost:
    
        if (r14 == 0.0f) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01aa, code lost:
    
        if (r15 == 0.0f) goto L56;
     */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(androidx.constraintlayout.motion.widget.MotionLayout r22, java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.o> r23) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.MotionEffect.b(androidx.constraintlayout.motion.widget.MotionLayout, java.util.HashMap):void");
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.p
    public boolean f() {
        return true;
    }
}
