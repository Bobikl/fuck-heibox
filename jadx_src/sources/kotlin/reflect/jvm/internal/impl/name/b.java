package kotlin.reflect.jvm.internal.impl.name;

import androidx.constraintlayout.core.motion.utils.w;
import com.tencent.qcloud.core.util.IOUtils;

/* JADX INFO: compiled from: ClassId.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f127190d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f127191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f127192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f127193c;

    public b(@dl.d c cVar, @dl.d c cVar2, boolean z10) {
        if (cVar == null) {
            a(1);
        }
        if (cVar2 == null) {
            a(2);
        }
        this.f127191a = cVar;
        this.f127192b = cVar2;
        this.f127193c = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@dl.d c cVar, @dl.d f fVar) {
        this(cVar, c.k(fVar), false);
        if (cVar == null) {
            a(3);
        }
        if (fVar == null) {
            a(4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 5 && i10 != 6 && i10 != 7 && i10 != 9) {
            switch (i10) {
                case 13:
                case 14:
                case 15:
                case 16:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 5 && i10 != 6 && i10 != 7 && i10 != 9) {
            switch (i10) {
                case 13:
                case 14:
                case 15:
                case 16:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 3:
                objArr[0] = "packageFqName";
                break;
            case 2:
                objArr[0] = "relativeClassName";
                break;
            case 4:
                objArr[0] = "topLevelName";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 10:
                objArr[0] = "segment";
                break;
            case 11:
            case 12:
                objArr[0] = w.b.f17895e;
                break;
            default:
                objArr[0] = "topLevelFqName";
                break;
        }
        if (i10 == 5) {
            objArr[1] = "getPackageFqName";
        } else if (i10 == 6) {
            objArr[1] = "getRelativeClassName";
        } else if (i10 == 7) {
            objArr[1] = "getShortClassName";
        } else if (i10 != 9) {
            switch (i10) {
                case 13:
                case 14:
                    objArr[1] = "asString";
                    break;
                case 15:
                case 16:
                    objArr[1] = "asFqNameString";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                    break;
            }
        } else {
            objArr[1] = "asSingleFqName";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[2] = "<init>";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
                break;
            case 8:
                objArr[2] = "createNestedClassId";
                break;
            case 10:
                objArr[2] = "startsWith";
                break;
            case 11:
            case 12:
                objArr[2] = "fromString";
                break;
            default:
                objArr[2] = "topLevel";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 6 && i10 != 7 && i10 != 9) {
            switch (i10) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @dl.d
    public static b e(@dl.d String str) {
        if (str == null) {
            a(11);
        }
        return f(str, false);
    }

    @dl.d
    public static b f(@dl.d String str, boolean z10) {
        String str2;
        if (str == null) {
            a(12);
        }
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            str2 = "";
        } else {
            String strReplace = str.substring(0, iLastIndexOf).replace(IOUtils.DIR_SEPARATOR_UNIX, lg.a.f131414g);
            str = str.substring(iLastIndexOf + 1);
            str2 = strReplace;
        }
        return new b(new c(str2), new c(str), z10);
    }

    @dl.d
    public static b m(@dl.d c cVar) {
        if (cVar == null) {
            a(0);
        }
        return new b(cVar.e(), cVar.g());
    }

    @dl.d
    public c b() {
        if (this.f127191a.d()) {
            c cVar = this.f127192b;
            if (cVar == null) {
                a(9);
            }
            return cVar;
        }
        return new c(this.f127191a.b() + "." + this.f127192b.b());
    }

    @dl.d
    public String c() {
        if (this.f127191a.d()) {
            String strB = this.f127192b.b();
            if (strB == null) {
                a(13);
            }
            return strB;
        }
        String str = this.f127191a.b().replace(lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX) + "/" + this.f127192b.b();
        if (str == null) {
            a(14);
        }
        return str;
    }

    @dl.d
    public b d(@dl.d f fVar) {
        if (fVar == null) {
            a(8);
        }
        return new b(h(), this.f127192b.c(fVar), this.f127193c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f127191a.equals(bVar.f127191a) && this.f127192b.equals(bVar.f127192b) && this.f127193c == bVar.f127193c;
    }

    @dl.e
    public b g() {
        c cVarE = this.f127192b.e();
        if (cVarE.d()) {
            return null;
        }
        return new b(h(), cVarE, this.f127193c);
    }

    @dl.d
    public c h() {
        c cVar = this.f127191a;
        if (cVar == null) {
            a(5);
        }
        return cVar;
    }

    public int hashCode() {
        return (((this.f127191a.hashCode() * 31) + this.f127192b.hashCode()) * 31) + Boolean.valueOf(this.f127193c).hashCode();
    }

    @dl.d
    public c i() {
        c cVar = this.f127192b;
        if (cVar == null) {
            a(6);
        }
        return cVar;
    }

    @dl.d
    public f j() {
        f fVarG = this.f127192b.g();
        if (fVarG == null) {
            a(7);
        }
        return fVarG;
    }

    public boolean k() {
        return this.f127193c;
    }

    public boolean l() {
        return !this.f127192b.e().d();
    }

    public String toString() {
        if (!this.f127191a.d()) {
            return c();
        }
        return "/" + c();
    }
}
