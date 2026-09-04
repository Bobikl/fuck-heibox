package androidx.constraintlayout.core;

import com.meituan.robust.Constants;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class SolverVariable implements Comparable<SolverVariable> {
    public static final int A = 6;
    public static final int B = 7;
    public static final int C = 8;
    private static int D = 1;
    private static int E = 1;
    private static int F = 1;
    private static int G = 1;
    private static int H = 1;
    static final int I = 9;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final boolean f17256s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final boolean f17257t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f17258u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f17259v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f17260w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f17261x = 3;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f17262y = 4;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f17263z = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f17265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f17267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f17269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17270h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float[] f17271i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float[] f17272j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Type f17273k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    b[] f17274l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f17275m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17276n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f17277o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f17278p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    float f17279q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    HashSet<b> f17280r;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17281a;

        static {
            int[] iArr = new int[Type.values().length];
            f17281a = iArr;
            try {
                iArr[Type.UNRESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17281a[Type.CONSTANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17281a[Type.SLACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17281a[Type.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17281a[Type.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public SolverVariable(Type type, String str) {
        this.f17266d = -1;
        this.f17267e = -1;
        this.f17268f = 0;
        this.f17270h = false;
        this.f17271i = new float[9];
        this.f17272j = new float[9];
        this.f17274l = new b[16];
        this.f17275m = 0;
        this.f17276n = 0;
        this.f17277o = false;
        this.f17278p = -1;
        this.f17279q = 0.0f;
        this.f17280r = null;
        this.f17273k = type;
    }

    public SolverVariable(String str, Type type) {
        this.f17266d = -1;
        this.f17267e = -1;
        this.f17268f = 0;
        this.f17270h = false;
        this.f17271i = new float[9];
        this.f17272j = new float[9];
        this.f17274l = new b[16];
        this.f17275m = 0;
        this.f17276n = 0;
        this.f17277o = false;
        this.f17278p = -1;
        this.f17279q = 0.0f;
        this.f17280r = null;
        this.f17265c = str;
        this.f17273k = type;
    }

    private static String e(Type type, String str) {
        if (str != null) {
            return str + E;
        }
        int i10 = a.f17281a[type.ordinal()];
        if (i10 == 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("U");
            int i11 = F + 1;
            F = i11;
            sb2.append(i11);
            return sb2.toString();
        }
        if (i10 == 2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("C");
            int i12 = G + 1;
            G = i12;
            sb3.append(i12);
            return sb3.toString();
        }
        if (i10 == 3) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(androidx.exifinterface.media.a.R4);
            int i13 = D + 1;
            D = i13;
            sb4.append(i13);
            return sb4.toString();
        }
        if (i10 == 4) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("e");
            int i14 = E + 1;
            E = i14;
            sb5.append(i14);
            return sb5.toString();
        }
        if (i10 != 5) {
            throw new AssertionError(type.name());
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(androidx.exifinterface.media.a.X4);
        int i15 = H + 1;
        H = i15;
        sb6.append(i15);
        return sb6.toString();
    }

    static void f() {
        E++;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f17275m;
            if (i10 >= i11) {
                b[] bVarArr = this.f17274l;
                if (i11 >= bVarArr.length) {
                    this.f17274l = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f17274l;
                int i12 = this.f17275m;
                bVarArr2[i12] = bVar;
                this.f17275m = i12 + 1;
                return;
            }
            if (this.f17274l[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    void b() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f17271i[i10] = 0.0f;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(SolverVariable solverVariable) {
        return this.f17266d - solverVariable.f17266d;
    }

    public String d() {
        return this.f17265c;
    }

    public final void g(b bVar) {
        int i10 = this.f17275m;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f17274l[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f17274l;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f17275m--;
                return;
            }
            i11++;
        }
    }

    public void h() {
        this.f17265c = null;
        this.f17273k = Type.UNKNOWN;
        this.f17268f = 0;
        this.f17266d = -1;
        this.f17267e = -1;
        this.f17269g = 0.0f;
        this.f17270h = false;
        this.f17277o = false;
        this.f17278p = -1;
        this.f17279q = 0.0f;
        int i10 = this.f17275m;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f17274l[i11] = null;
        }
        this.f17275m = 0;
        this.f17276n = 0;
        this.f17264b = false;
        Arrays.fill(this.f17272j, 0.0f);
    }

    public void i(e eVar, float f10) {
        this.f17269g = f10;
        this.f17270h = true;
        this.f17277o = false;
        this.f17278p = -1;
        this.f17279q = 0.0f;
        int i10 = this.f17275m;
        this.f17267e = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f17274l[i11].a(eVar, this, false);
        }
        this.f17275m = 0;
    }

    public void j(String str) {
        this.f17265c = str;
    }

    public void k(e eVar, SolverVariable solverVariable, float f10) {
        this.f17277o = true;
        this.f17278p = solverVariable.f17266d;
        this.f17279q = f10;
        int i10 = this.f17275m;
        this.f17267e = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f17274l[i11].G(eVar, this, false);
        }
        this.f17275m = 0;
        eVar.z();
    }

    public void l(Type type, String str) {
        this.f17273k = type;
    }

    String m() {
        String str = this + Constants.ARRAY_TYPE;
        boolean z10 = true;
        boolean z11 = false;
        for (int i10 = 0; i10 < this.f17271i.length; i10++) {
            String str2 = str + this.f17271i[i10];
            float[] fArr = this.f17271i;
            float f10 = fArr[i10];
            if (f10 > 0.0f) {
                z11 = false;
            } else if (f10 < 0.0f) {
                z11 = true;
            }
            if (f10 != 0.0f) {
                z10 = false;
            }
            str = i10 < fArr.length - 1 ? str2 + ", " : str2 + "] ";
        }
        if (z11) {
            str = str + " (-)";
        }
        if (!z10) {
            return str;
        }
        return str + " (*)";
    }

    public final void n(e eVar, b bVar) {
        int i10 = this.f17275m;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f17274l[i11].b(eVar, bVar, false);
        }
        this.f17275m = 0;
    }

    public String toString() {
        if (this.f17265c != null) {
            return "" + this.f17265c;
        }
        return "" + this.f17266d;
    }
}
