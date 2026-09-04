package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import com.tencent.qcloud.core.util.IOUtils;
import kotlin.text.y;

/* JADX INFO: compiled from: JvmClassName.java */
/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f127569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.name.c f127570b;

    private d(@dl.d String str) {
        if (str == null) {
            a(5);
        }
        this.f127569a = str;
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 3 || i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i10 == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i10 == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i10 == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i10) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 6 && i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @dl.d
    public static d b(@dl.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
        if (bVar == null) {
            a(1);
        }
        kotlin.reflect.jvm.internal.impl.name.c cVarH = bVar.h();
        String strReplace = bVar.i().b().replace(lg.a.f131414g, y.f128594c);
        if (cVarH.d()) {
            return new d(strReplace);
        }
        return new d(cVarH.b().replace(lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX) + "/" + strReplace);
    }

    @dl.d
    public static d c(@dl.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        if (cVar == null) {
            a(2);
        }
        d dVar = new d(cVar.b().replace(lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX));
        dVar.f127570b = cVar;
        return dVar;
    }

    @dl.d
    public static d d(@dl.d String str) {
        if (str == null) {
            a(0);
        }
        return new d(str);
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.name.c e() {
        return new kotlin.reflect.jvm.internal.impl.name.c(this.f127569a.replace(IOUtils.DIR_SEPARATOR_UNIX, lg.a.f131414g));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f127569a.equals(((d) obj).f127569a);
    }

    @dl.d
    public String f() {
        String str = this.f127569a;
        if (str == null) {
            a(8);
        }
        return str;
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.name.c g() {
        int iLastIndexOf = this.f127569a.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            return new kotlin.reflect.jvm.internal.impl.name.c(this.f127569a.substring(0, iLastIndexOf).replace(IOUtils.DIR_SEPARATOR_UNIX, lg.a.f131414g));
        }
        kotlin.reflect.jvm.internal.impl.name.c cVar = kotlin.reflect.jvm.internal.impl.name.c.f127194c;
        if (cVar == null) {
            a(7);
        }
        return cVar;
    }

    public int hashCode() {
        return this.f127569a.hashCode();
    }

    public String toString() {
        return this.f127569a;
    }
}
