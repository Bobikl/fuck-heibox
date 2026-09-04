package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.load.java.t;
import kotlin.reflect.jvm.internal.impl.load.kotlin.o;
import kotlin.reflect.jvm.internal.impl.name.f;

/* JADX INFO: compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
/* JADX INFO: loaded from: classes5.dex */
public class a implements o.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final boolean f126509j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map<kotlin.reflect.jvm.internal.impl.name.b, KotlinClassHeader.Kind> f126510k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f126511a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f126512b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f126513c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f126514d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String[] f126515e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String[] f126516f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String[] f126517g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private KotlinClassHeader.Kind f126518h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String[] f126519i = null;

    /* JADX INFO: compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    public static abstract class b implements o.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f126520a = new ArrayList();

        private static /* synthetic */ void e(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumEntryName";
            } else if (i10 == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i10 != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i10 == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i10 != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.b
        public void a(@dl.e Object obj) {
            if (obj instanceof String) {
                this.f126520a.add((String) obj);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.b
        @dl.e
        public o.a b(@dl.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
            if (bVar != null) {
                return null;
            }
            e(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.b
        public void c(@dl.d kotlin.reflect.jvm.internal.impl.name.b bVar, @dl.d f fVar) {
            if (bVar == null) {
                e(0);
            }
            if (fVar == null) {
                e(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.b
        public void d(@dl.d kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar) {
            if (fVar == null) {
                e(2);
            }
        }

        protected abstract void f(@dl.d String[] strArr);

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.b
        public void visitEnd() {
            f((String[]) this.f126520a.toArray(new String[0]));
        }
    }

    /* JADX INFO: compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    public class c implements o.a {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        public class C1162a extends b {
            C1162a() {
            }

            private static /* synthetic */ void e(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.b
            protected void f(@dl.d String[] strArr) {
                if (strArr == null) {
                    e(0);
                }
                a.this.f126515e = strArr;
            }
        }

        /* JADX INFO: compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        public class b extends b {
            b() {
            }

            private static /* synthetic */ void e(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.b
            protected void f(@dl.d String[] strArr) {
                if (strArr == null) {
                    e(0);
                }
                a.this.f126516f = strArr;
            }
        }

        private c() {
        }

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @dl.d
        private o.b g() {
            return new C1162a();
        }

        @dl.d
        private o.b h() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
        public void a(@dl.e f fVar, @dl.d kotlin.reflect.jvm.internal.impl.name.b bVar, @dl.d f fVar2) {
            if (bVar == null) {
                f(1);
            }
            if (fVar2 == null) {
                f(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
        @dl.e
        public o.a b(@dl.e f fVar, @dl.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
            if (bVar != null) {
                return null;
            }
            f(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
        public void c(@dl.e f fVar, @dl.d kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2) {
            if (fVar2 == null) {
                f(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
        public void d(@dl.e f fVar, @dl.e Object obj) {
            if (fVar == null) {
                return;
            }
            String strB = fVar.b();
            if ("k".equals(strB)) {
                if (obj instanceof Integer) {
                    a.this.f126518h = KotlinClassHeader.Kind.getById(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if ("mv".equals(strB)) {
                if (obj instanceof int[]) {
                    a.this.f126511a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strB)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    a.this.f126512b = str;
                    return;
                }
                return;
            }
            if ("xi".equals(strB)) {
                if (obj instanceof Integer) {
                    a.this.f126513c = ((Integer) obj).intValue();
                    return;
                }
                return;
            }
            if ("pn".equals(strB) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                a.this.f126514d = str2;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
        @dl.e
        public o.b e(@dl.e f fVar) {
            String strB = fVar != null ? fVar.b() : null;
            if ("d1".equals(strB)) {
                return g();
            }
            if ("d2".equals(strB)) {
                return h();
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
        public void visitEnd() {
        }
    }

    /* JADX INFO: compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    public class d implements o.a {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        public class C1163a extends b {
            C1163a() {
            }

            private static /* synthetic */ void e(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.b
            protected void f(@dl.d String[] strArr) {
                if (strArr == null) {
                    e(0);
                }
                a.this.f126519i = strArr;
            }
        }

        private d() {
        }

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @dl.d
        private o.b g() {
            return new C1163a();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
        public void a(@dl.e f fVar, @dl.d kotlin.reflect.jvm.internal.impl.name.b bVar, @dl.d f fVar2) {
            if (bVar == null) {
                f(1);
            }
            if (fVar2 == null) {
                f(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
        @dl.e
        public o.a b(@dl.e f fVar, @dl.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
            if (bVar != null) {
                return null;
            }
            f(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
        public void c(@dl.e f fVar, @dl.d kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2) {
            if (fVar2 == null) {
                f(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
        public void d(@dl.e f fVar, @dl.e Object obj) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
        @dl.e
        public o.b e(@dl.e f fVar) {
            if ("b".equals(fVar != null ? fVar.b() : null)) {
                return g();
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
        public void visitEnd() {
        }
    }

    /* JADX INFO: compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    public class e implements o.a {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$e$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        public class C1164a extends b {
            C1164a() {
            }

            private static /* synthetic */ void e(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.b
            protected void f(@dl.d String[] strArr) {
                if (strArr == null) {
                    e(0);
                }
                a.this.f126515e = strArr;
            }
        }

        /* JADX INFO: compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        public class b extends b {
            b() {
            }

            private static /* synthetic */ void e(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.b
            protected void f(@dl.d String[] strArr) {
                if (strArr == null) {
                    e(0);
                }
                a.this.f126516f = strArr;
            }
        }

        private e() {
        }

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @dl.d
        private o.b g() {
            return new C1164a();
        }

        @dl.d
        private o.b h() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
        public void a(@dl.e f fVar, @dl.d kotlin.reflect.jvm.internal.impl.name.b bVar, @dl.d f fVar2) {
            if (bVar == null) {
                f(1);
            }
            if (fVar2 == null) {
                f(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
        @dl.e
        public o.a b(@dl.e f fVar, @dl.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
            if (bVar != null) {
                return null;
            }
            f(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
        public void c(@dl.e f fVar, @dl.d kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2) {
            if (fVar2 == null) {
                f(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
        public void d(@dl.e f fVar, @dl.e Object obj) {
            if (fVar == null) {
                return;
            }
            String strB = fVar.b();
            if ("version".equals(strB)) {
                if (obj instanceof int[]) {
                    a.this.f126511a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strB)) {
                a.this.f126512b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
        @dl.e
        public o.b e(@dl.e f fVar) {
            String strB = fVar != null ? fVar.b() : null;
            if ("data".equals(strB) || "filePartClassNames".equals(strB)) {
                return g();
            }
            if ("strings".equals(strB)) {
                return h();
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
        public void visitEnd() {
        }
    }

    static {
        HashMap map = new HashMap();
        f126510k = map;
        map.put(kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader.Kind.CLASS);
        map.put(kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader.Kind.FILE_FACADE);
        map.put(kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader.Kind.MULTIFILE_CLASS);
        map.put(kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);
        map.put(kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader.Kind.SYNTHETIC_CLASS);
    }

    private static /* synthetic */ void c(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    private boolean m() {
        KotlinClassHeader.Kind kind = this.f126518h;
        return kind == KotlinClassHeader.Kind.CLASS || kind == KotlinClassHeader.Kind.FILE_FACADE || kind == KotlinClassHeader.Kind.MULTIFILE_CLASS_PART;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.c
    @dl.e
    public o.a b(@dl.d kotlin.reflect.jvm.internal.impl.name.b bVar, @dl.d t0 t0Var) {
        KotlinClassHeader.Kind kind;
        if (bVar == null) {
            c(0);
        }
        if (t0Var == null) {
            c(1);
        }
        kotlin.reflect.jvm.internal.impl.name.c cVarB = bVar.b();
        if (cVarB.equals(t.f126309a)) {
            return new c();
        }
        if (cVarB.equals(t.f126327s)) {
            return new d();
        }
        if (f126509j || this.f126518h != null || (kind = f126510k.get(bVar)) == null) {
            return null;
        }
        this.f126518h = kind;
        return new e();
    }

    @dl.e
    public KotlinClassHeader l() {
        if (this.f126518h == null || this.f126511a == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e eVar = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e(this.f126511a, (this.f126513c & 8) != 0);
        if (!eVar.h()) {
            this.f126517g = this.f126515e;
            this.f126515e = null;
        } else if (m() && this.f126515e == null) {
            return null;
        }
        String[] strArr = this.f126519i;
        return new KotlinClassHeader(this.f126518h, eVar, this.f126515e, this.f126517g, this.f126516f, this.f126512b, this.f126513c, this.f126514d, strArr != null ? kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.a.e(strArr) : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.c
    public void visitEnd() {
    }
}
