package androidx.constraintlayout.core.motion;

import androidx.core.view.j1;

/* JADX INFO: compiled from: CustomVariable.java */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f17404g = "TransitionLayout";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f17405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f17407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f17408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f17409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f17410f;

    public a(a aVar) {
        this.f17407c = Integer.MIN_VALUE;
        this.f17408d = Float.NaN;
        this.f17409e = null;
        this.f17405a = aVar.f17405a;
        this.f17406b = aVar.f17406b;
        this.f17407c = aVar.f17407c;
        this.f17408d = aVar.f17408d;
        this.f17409e = aVar.f17409e;
        this.f17410f = aVar.f17410f;
    }

    public a(a aVar, Object obj) {
        this.f17407c = Integer.MIN_VALUE;
        this.f17408d = Float.NaN;
        this.f17409e = null;
        this.f17405a = aVar.f17405a;
        this.f17406b = aVar.f17406b;
        y(obj);
    }

    public a(String str, int i10) {
        this.f17407c = Integer.MIN_VALUE;
        this.f17408d = Float.NaN;
        this.f17409e = null;
        this.f17405a = str;
        this.f17406b = i10;
    }

    public a(String str, int i10, float f10) {
        this.f17407c = Integer.MIN_VALUE;
        this.f17409e = null;
        this.f17405a = str;
        this.f17406b = i10;
        this.f17408d = f10;
    }

    public a(String str, int i10, int i11) {
        this.f17407c = Integer.MIN_VALUE;
        this.f17408d = Float.NaN;
        this.f17409e = null;
        this.f17405a = str;
        this.f17406b = i10;
        if (i10 == 901) {
            this.f17408d = i11;
        } else {
            this.f17407c = i11;
        }
    }

    public a(String str, int i10, Object obj) {
        this.f17407c = Integer.MIN_VALUE;
        this.f17408d = Float.NaN;
        this.f17409e = null;
        this.f17405a = str;
        this.f17406b = i10;
        y(obj);
    }

    public a(String str, int i10, String str2) {
        this.f17407c = Integer.MIN_VALUE;
        this.f17408d = Float.NaN;
        this.f17405a = str;
        this.f17406b = i10;
        this.f17409e = str2;
    }

    public a(String str, int i10, boolean z10) {
        this.f17407c = Integer.MIN_VALUE;
        this.f17408d = Float.NaN;
        this.f17409e = null;
        this.f17405a = str;
        this.f17406b = i10;
        this.f17410f = z10;
    }

    private static int b(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static String c(int i10) {
        String str = "00000000" + Integer.toHexString(i10);
        return "#" + str.substring(str.length() - 8);
    }

    public static int p(float f10, float f11, float f12) {
        float f13 = f10 * 6.0f;
        int i10 = (int) f13;
        float f14 = f13 - i10;
        float f15 = f12 * 255.0f;
        int i11 = (int) (((1.0f - f11) * f15) + 0.5f);
        int i12 = (int) (((1.0f - (f14 * f11)) * f15) + 0.5f);
        int i13 = (int) (((1.0f - ((1.0f - f14) * f11)) * f15) + 0.5f);
        int i14 = (int) (f15 + 0.5f);
        if (i10 == 0) {
            return ((i14 << 16) + (i13 << 8) + i11) | j1.f21601t;
        }
        if (i10 == 1) {
            return ((i12 << 16) + (i14 << 8) + i11) | j1.f21601t;
        }
        if (i10 == 2) {
            return ((i11 << 16) + (i14 << 8) + i13) | j1.f21601t;
        }
        if (i10 == 3) {
            return ((i11 << 16) + (i12 << 8) + i14) | j1.f21601t;
        }
        if (i10 == 4) {
            return ((i13 << 16) + (i11 << 8) + i14) | j1.f21601t;
        }
        if (i10 != 5) {
            return 0;
        }
        return ((i14 << 16) + (i11 << 8) + i12) | j1.f21601t;
    }

    public static int s(float f10, float f11, float f12, float f13) {
        int iB = b((int) (f10 * 255.0f));
        int iB2 = b((int) (f11 * 255.0f));
        return (iB << 16) | (b((int) (f13 * 255.0f)) << 24) | (iB2 << 8) | b((int) (f12 * 255.0f));
    }

    public void a(e eVar) {
        int i10 = this.f17406b;
        switch (i10) {
            case 900:
            case 902:
            case 906:
                eVar.J(this.f17405a, i10, this.f17407c);
                break;
            case 901:
            case 905:
                eVar.I(this.f17405a, i10, this.f17408d);
                break;
            case 903:
                eVar.K(this.f17405a, i10, this.f17409e);
                break;
            case 904:
                eVar.L(this.f17405a, i10, this.f17410f);
                break;
        }
    }

    public a d() {
        return new a(this);
    }

    public boolean e(a aVar) {
        int i10;
        if (aVar == null || (i10 = this.f17406b) != aVar.f17406b) {
            return false;
        }
        switch (i10) {
            case 900:
            case 906:
                return this.f17407c == aVar.f17407c;
            case 901:
                return this.f17408d == aVar.f17408d;
            case 902:
                return this.f17407c == aVar.f17407c;
            case 903:
                return this.f17407c == aVar.f17407c;
            case 904:
                return this.f17410f == aVar.f17410f;
            case 905:
                return this.f17408d == aVar.f17408d;
            default:
                return false;
        }
    }

    public boolean f() {
        return this.f17410f;
    }

    public int g() {
        return this.f17407c;
    }

    public float h() {
        return this.f17408d;
    }

    public int i() {
        return this.f17407c;
    }

    public int j(float[] fArr) {
        return (b((int) (fArr[3] * 255.0f)) << 24) | (b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public String k() {
        return this.f17405a;
    }

    public String l() {
        return this.f17409e;
    }

    public int m() {
        return this.f17406b;
    }

    public float n() {
        switch (this.f17406b) {
            case 900:
                return this.f17407c;
            case 901:
                return this.f17408d;
            case 902:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 903:
                throw new RuntimeException("Cannot interpolate String");
            case 904:
                return this.f17410f ? 1.0f : 0.0f;
            case 905:
                return this.f17408d;
            default:
                return Float.NaN;
        }
    }

    public void o(float[] fArr) {
        switch (this.f17406b) {
            case 900:
                fArr[0] = this.f17407c;
                return;
            case 901:
                fArr[0] = this.f17408d;
                return;
            case 902:
                int i10 = this.f17407c;
                int i11 = (i10 >> 24) & 255;
                float fPow = (float) Math.pow(((i10 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i10 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i10 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i11 / 255.0f;
                return;
            case 903:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 904:
                fArr[0] = this.f17410f ? 1.0f : 0.0f;
                return;
            case 905:
                fArr[0] = this.f17408d;
                return;
            default:
                return;
        }
    }

    public boolean q() {
        int i10 = this.f17406b;
        return (i10 == 903 || i10 == 904 || i10 == 906) ? false : true;
    }

    public int r() {
        return this.f17406b != 902 ? 1 : 4;
    }

    public void t(boolean z10) {
        this.f17410f = z10;
    }

    public String toString() {
        String str = this.f17405a + ':';
        switch (this.f17406b) {
            case 900:
                return str + this.f17407c;
            case 901:
                return str + this.f17408d;
            case 902:
                return str + c(this.f17407c);
            case 903:
                return str + this.f17409e;
            case 904:
                return str + Boolean.valueOf(this.f17410f);
            case 905:
                return str + this.f17408d;
            default:
                return str + "????";
        }
    }

    public void u(float f10) {
        this.f17408d = f10;
    }

    public void v(int i10) {
        this.f17407c = i10;
    }

    public void w(e eVar, float[] fArr) {
        int i10 = this.f17406b;
        switch (i10) {
            case 900:
                eVar.J(this.f17405a, i10, (int) fArr[0]);
                return;
            case 901:
            case 905:
                eVar.I(this.f17405a, i10, fArr[0]);
                return;
            case 902:
                eVar.J(this.f17405a, this.f17406b, (b((int) (fArr[3] * 255.0f)) << 24) | (b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                return;
            case 903:
            case 906:
                throw new RuntimeException("unable to interpolate " + this.f17405a);
            case 904:
                eVar.L(this.f17405a, i10, fArr[0] > 0.5f);
                return;
            default:
                return;
        }
    }

    public void x(String str) {
        this.f17409e = str;
    }

    public void y(Object obj) {
        switch (this.f17406b) {
            case 900:
            case 906:
                this.f17407c = ((Integer) obj).intValue();
                break;
            case 901:
                this.f17408d = ((Float) obj).floatValue();
                break;
            case 902:
                this.f17407c = ((Integer) obj).intValue();
                break;
            case 903:
                this.f17409e = (String) obj;
                break;
            case 904:
                this.f17410f = ((Boolean) obj).booleanValue();
                break;
            case 905:
                this.f17408d = ((Float) obj).floatValue();
                break;
        }
    }

    public void z(float[] fArr) {
        switch (this.f17406b) {
            case 900:
            case 906:
                this.f17407c = (int) fArr[0];
                return;
            case 901:
            case 905:
                this.f17408d = fArr[0];
                return;
            case 902:
                int iP = p(fArr[0], fArr[1], fArr[2]);
                this.f17407c = iP;
                this.f17407c = (b((int) (fArr[3] * 255.0f)) << 24) | (iP & 16777215);
                return;
            case 903:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 904:
                this.f17410f = ((double) fArr[0]) > 0.5d;
                return;
            default:
                return;
        }
    }
}
