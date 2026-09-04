package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class CLToken extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f18059i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Type f18060j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    char[] f18061k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    char[] f18062l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    char[] f18063m;

    public enum Type {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18064a;

        static {
            int[] iArr = new int[Type.values().length];
            f18064a = iArr;
            try {
                iArr[Type.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18064a[Type.FALSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18064a[Type.NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18064a[Type.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public CLToken(char[] cArr) {
        super(cArr);
        this.f18059i = 0;
        this.f18060j = Type.UNKNOWN;
        this.f18061k = "true".toCharArray();
        this.f18062l = "false".toCharArray();
        this.f18063m = "null".toCharArray();
    }

    public static c B(char[] cArr) {
        return new CLToken(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.c
    protected String A() {
        if (!CLParser.f18051d) {
            return b();
        }
        return "<" + b() + ">";
    }

    public boolean D() throws CLParsingException {
        Type type = this.f18060j;
        if (type == Type.TRUE) {
            return true;
        }
        if (type == Type.FALSE) {
            return false;
        }
        throw new CLParsingException("this token is not a boolean: <" + b() + ">", this);
    }

    public Type E() {
        return this.f18060j;
    }

    public boolean F() throws CLParsingException {
        if (this.f18060j == Type.NULL) {
            return true;
        }
        throw new CLParsingException("this token is not a null: <" + b() + ">", this);
    }

    public boolean G(char c10, long j10) {
        int i10 = a.f18064a[this.f18060j.ordinal()];
        boolean z10 = false;
        if (i10 == 1) {
            char[] cArr = this.f18061k;
            int i11 = this.f18059i;
            z10 = cArr[i11] == c10;
            if (z10 && i11 + 1 == cArr.length) {
                v(j10);
            }
        } else if (i10 == 2) {
            char[] cArr2 = this.f18062l;
            int i12 = this.f18059i;
            z10 = cArr2[i12] == c10;
            if (z10 && i12 + 1 == cArr2.length) {
                v(j10);
            }
        } else if (i10 == 3) {
            char[] cArr3 = this.f18063m;
            int i13 = this.f18059i;
            z10 = cArr3[i13] == c10;
            if (z10 && i13 + 1 == cArr3.length) {
                v(j10);
            }
        } else if (i10 == 4) {
            char[] cArr4 = this.f18061k;
            int i14 = this.f18059i;
            if (cArr4[i14] == c10) {
                this.f18060j = Type.TRUE;
            } else if (this.f18062l[i14] == c10) {
                this.f18060j = Type.FALSE;
            } else if (this.f18063m[i14] == c10) {
                this.f18060j = Type.NULL;
            }
            z10 = true;
        }
        this.f18059i++;
        return z10;
    }

    @Override // androidx.constraintlayout.core.parser.c
    protected String y(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        a(sb2, i10);
        sb2.append(b());
        return sb2.toString();
    }
}
