package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.o;
import androidx.constraintlayout.core.motion.utils.w;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: MotionKey.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements w {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f17554m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f17555n = "alpha";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f17556o = "elevation";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f17557p = "rotationZ";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f17558q = "rotationX";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f17559r = "transitionPathRotate";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f17560s = "scaleX";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f17561t = "scaleY";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f17562u = "translationX";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f17563v = "translationY";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f17564w = "CUSTOM";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f17565x = "visibility";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f17567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f17568j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17569k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HashMap<String, androidx.constraintlayout.core.motion.a> f17570l;

    public b() {
        int i10 = f17554m;
        this.f17566h = i10;
        this.f17567i = i10;
        this.f17568j = null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public boolean a(int i10, int i11) {
        if (i10 != 100) {
            return false;
        }
        this.f17566h = i11;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public boolean b(int i10, float f10) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public boolean c(int i10, boolean z10) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public boolean d(int i10, String str) {
        if (i10 != 101) {
            return false;
        }
        this.f17568j = str;
        return true;
    }

    public abstract void f(HashMap<String, o> map);

    @Override // 
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract b clone();

    public b h(b bVar) {
        this.f17566h = bVar.f17566h;
        this.f17567i = bVar.f17567i;
        this.f17568j = bVar.f17568j;
        this.f17569k = bVar.f17569k;
        return this;
    }

    public abstract void i(HashSet<String> hashSet);

    public int j() {
        return this.f17566h;
    }

    boolean k(String str) {
        String str2 = this.f17568j;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public void l(String str, int i10, float f10) {
        this.f17570l.put(str, new androidx.constraintlayout.core.motion.a(str, i10, f10));
    }

    public void m(String str, int i10, int i11) {
        this.f17570l.put(str, new androidx.constraintlayout.core.motion.a(str, i10, i11));
    }

    public void n(String str, int i10, String str2) {
        this.f17570l.put(str, new androidx.constraintlayout.core.motion.a(str, i10, str2));
    }

    public void o(String str, int i10, boolean z10) {
        this.f17570l.put(str, new androidx.constraintlayout.core.motion.a(str, i10, z10));
    }

    public void p(int i10) {
        this.f17566h = i10;
    }

    public void q(HashMap<String, Integer> map) {
    }

    public b r(int i10) {
        this.f17567i = i10;
        return this;
    }

    boolean s(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    float t(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    int u(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }
}
