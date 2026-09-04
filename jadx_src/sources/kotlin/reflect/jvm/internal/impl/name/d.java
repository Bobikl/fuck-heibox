package kotlin.reflect.jvm.internal.impl.name;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.ArraysKt___ArraysKt;
import yh.l;

/* JADX INFO: compiled from: FqNameUnsafe.java */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final f f127197e = f.i("<root>");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f127198f = Pattern.compile("\\.");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final l<String, f> f127199g = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final String f127200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient c f127201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient d f127202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient f f127203d;

    /* JADX INFO: compiled from: FqNameUnsafe.java */
    public static final class a implements l<String, f> {
        a() {
        }

        @Override // yh.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f invoke(String str) {
            return f.e(str);
        }
    }

    public d(@dl.d String str) {
        if (str == null) {
            a(2);
        }
        this.f127200a = str;
    }

    d(@dl.d String str, @dl.d c cVar) {
        if (str == null) {
            a(0);
        }
        if (cVar == null) {
            a(1);
        }
        this.f127200a = str;
        this.f127201b = cVar;
    }

    private d(@dl.d String str, d dVar, f fVar) {
        if (str == null) {
            a(3);
        }
        this.f127200a = str;
        this.f127202c = dVar;
        this.f127203d = fVar;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i11 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1) {
            switch (i10) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i10) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                throw new IllegalStateException(str2);
            case 9:
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    private void d() {
        int iLastIndexOf = this.f127200a.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.f127203d = f.e(this.f127200a.substring(iLastIndexOf + 1));
            this.f127202c = new d(this.f127200a.substring(0, iLastIndexOf));
        } else {
            this.f127203d = f.e(this.f127200a);
            this.f127202c = c.f127194c.j();
        }
    }

    @dl.d
    public static d m(@dl.d f fVar) {
        if (fVar == null) {
            a(16);
        }
        return new d(fVar.b(), c.f127194c.j(), fVar);
    }

    @dl.d
    public String b() {
        String str = this.f127200a;
        if (str == null) {
            a(4);
        }
        return str;
    }

    @dl.d
    public d c(@dl.d f fVar) {
        String strB;
        if (fVar == null) {
            a(9);
        }
        if (e()) {
            strB = fVar.b();
        } else {
            strB = this.f127200a + "." + fVar.b();
        }
        return new d(strB, this, fVar);
    }

    public boolean e() {
        return this.f127200a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f127200a.equals(((d) obj).f127200a);
    }

    public boolean f() {
        return this.f127201b != null || b().indexOf(60) < 0;
    }

    @dl.d
    public d g() {
        d dVar = this.f127202c;
        if (dVar != null) {
            if (dVar == null) {
                a(7);
            }
            return dVar;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        d();
        d dVar2 = this.f127202c;
        if (dVar2 == null) {
            a(8);
        }
        return dVar2;
    }

    @dl.d
    public List<f> h() {
        List<f> listEmptyList = e() ? Collections.emptyList() : ArraysKt___ArraysKt.Oi(f127198f.split(this.f127200a), f127199g);
        if (listEmptyList == null) {
            a(14);
        }
        return listEmptyList;
    }

    public int hashCode() {
        return this.f127200a.hashCode();
    }

    @dl.d
    public f i() {
        f fVar = this.f127203d;
        if (fVar != null) {
            if (fVar == null) {
                a(10);
            }
            return fVar;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        d();
        f fVar2 = this.f127203d;
        if (fVar2 == null) {
            a(11);
        }
        return fVar2;
    }

    @dl.d
    public f j() {
        if (e()) {
            f fVar = f127197e;
            if (fVar == null) {
                a(12);
            }
            return fVar;
        }
        f fVarI = i();
        if (fVarI == null) {
            a(13);
        }
        return fVarI;
    }

    public boolean k(@dl.d f fVar) {
        if (fVar == null) {
            a(15);
        }
        if (e()) {
            return false;
        }
        int iIndexOf = this.f127200a.indexOf(46);
        String str = this.f127200a;
        String strB = fVar.b();
        if (iIndexOf == -1) {
            iIndexOf = this.f127200a.length();
        }
        return str.regionMatches(0, strB, 0, iIndexOf);
    }

    @dl.d
    public c l() {
        c cVar = this.f127201b;
        if (cVar != null) {
            if (cVar == null) {
                a(5);
            }
            return cVar;
        }
        c cVar2 = new c(this);
        this.f127201b = cVar2;
        return cVar2;
    }

    @dl.d
    public String toString() {
        String strB = e() ? f127197e.b() : this.f127200a;
        if (strB == null) {
            a(17);
        }
        return strB;
    }
}
