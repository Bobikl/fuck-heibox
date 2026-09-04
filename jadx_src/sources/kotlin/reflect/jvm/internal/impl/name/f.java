package kotlin.reflect.jvm.internal.impl.name;

/* JADX INFO: compiled from: Name.java */
/* JADX INFO: loaded from: classes5.dex */
public final class f implements Comparable<f> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final String f127205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f127206c;

    private f(@dl.d String str, boolean z10) {
        if (str == null) {
            a(0);
        }
        this.f127205b = str;
        this.f127206c = z10;
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i10 == 1) {
            objArr[1] = "asString";
        } else if (i10 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i10 == 3 || i10 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "special";
                break;
            case 8:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @dl.d
    public static f e(@dl.d String str) {
        if (str == null) {
            a(8);
        }
        return str.startsWith("<") ? i(str) : f(str);
    }

    @dl.d
    public static f f(@dl.d String str) {
        if (str == null) {
            a(5);
        }
        return new f(str, false);
    }

    public static boolean h(@dl.d String str) {
        if (str == null) {
            a(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    @dl.d
    public static f i(@dl.d String str) {
        if (str == null) {
            a(7);
        }
        if (str.startsWith("<")) {
            return new f(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': " + str);
    }

    @dl.d
    public String b() {
        String str = this.f127205b;
        if (str == null) {
            a(1);
        }
        return str;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        return this.f127205b.compareTo(fVar.f127205b);
    }

    @dl.d
    public String d() {
        if (this.f127206c) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strB = b();
        if (strB == null) {
            a(2);
        }
        return strB;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f127206c == fVar.f127206c && this.f127205b.equals(fVar.f127205b);
    }

    public boolean g() {
        return this.f127206c;
    }

    public int hashCode() {
        return (this.f127205b.hashCode() * 31) + (this.f127206c ? 1 : 0);
    }

    public String toString() {
        return this.f127205b;
    }
}
