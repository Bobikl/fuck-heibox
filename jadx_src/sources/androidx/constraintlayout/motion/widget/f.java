package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: Key.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final String A = "motionProgress";
    public static final String B = "transitionEasing";
    public static final String C = "visibility";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f18718f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f18719g = "alpha";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f18720h = "elevation";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f18721i = "rotation";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f18722j = "rotationX";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f18723k = "rotationY";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f18724l = "transformPivotX";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f18725m = "transformPivotY";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f18726n = "transitionPathRotate";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f18727o = "scaleX";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f18728p = "scaleY";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f18729q = "wavePeriod";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f18730r = "waveOffset";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f18731s = "wavePhase";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f18732t = "waveVariesBy";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f18733u = "translationX";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f18734v = "translationY";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f18735w = "translationZ";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f18736x = "progress";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f18737y = "CUSTOM";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f18738z = "curveFit";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f18739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f18740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f18741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f18742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    HashMap<String, ConstraintAttribute> f18743e;

    public f() {
        int i10 = f18718f;
        this.f18739a = i10;
        this.f18740b = i10;
        this.f18741c = null;
    }

    public abstract void a(HashMap<String, androidx.constraintlayout.motion.utils.c> map);

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract f clone();

    public f c(f fVar) {
        this.f18739a = fVar.f18739a;
        this.f18740b = fVar.f18740b;
        this.f18741c = fVar.f18741c;
        this.f18742d = fVar.f18742d;
        this.f18743e = fVar.f18743e;
        return this;
    }

    abstract void d(HashSet<String> hashSet);

    public int e() {
        return this.f18739a;
    }

    abstract void f(Context context, AttributeSet attributeSet);

    boolean g(String str) {
        String str2 = this.f18741c;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public void h(int i10) {
        this.f18739a = i10;
    }

    public void i(HashMap<String, Integer> map) {
    }

    public abstract void j(String str, Object obj);

    public f k(int i10) {
        this.f18740b = i10;
        return this;
    }

    boolean l(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    float m(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    int n(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }
}
