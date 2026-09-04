package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: MemberScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final a f127613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f127614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f127615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f127616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f127617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f127618h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f127619i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f127620j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f127621k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f127622l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f127623m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f127624n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final d f127625o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final d f127626p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final d f127627q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final d f127628r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final d f127629s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final d f127630t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final d f127631u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final d f127632v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final d f127633w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final d f127634x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final List<a.C1177a> f127635y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private static final List<a.C1177a> f127636z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final List<c> f127637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f127638b;

    /* JADX INFO: compiled from: MemberScope.kt */
    public static final class a {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MemberScope.kt */
        public static final class C1177a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f127639a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @dl.d
            private final String f127640b;

            public C1177a(int i10, @dl.d String name) {
                f0.p(name, "name");
                this.f127639a = i10;
                this.f127640b = name;
            }

            public final int a() {
                return this.f127639a;
            }

            @dl.d
            public final String b() {
                return this.f127640b;
            }
        }

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int j() {
            int i10 = d.f127614d;
            a aVar = d.f127613c;
            d.f127614d <<= 1;
            return i10;
        }

        public final int b() {
            return d.f127621k;
        }

        public final int c() {
            return d.f127622l;
        }

        public final int d() {
            return d.f127619i;
        }

        public final int e() {
            return d.f127615e;
        }

        public final int f() {
            return d.f127618h;
        }

        public final int g() {
            return d.f127616f;
        }

        public final int h() {
            return d.f127617g;
        }

        public final int i() {
            return d.f127620j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        a.C1177a c1177a;
        a.C1177a c1177a2;
        a aVar = new a(null);
        f127613c = aVar;
        f127614d = 1;
        int iJ = aVar.j();
        f127615e = iJ;
        int iJ2 = aVar.j();
        f127616f = iJ2;
        int iJ3 = aVar.j();
        f127617g = iJ3;
        int iJ4 = aVar.j();
        f127618h = iJ4;
        int iJ5 = aVar.j();
        f127619i = iJ5;
        int iJ6 = aVar.j();
        f127620j = iJ6;
        int iJ7 = aVar.j() - 1;
        f127621k = iJ7;
        int i10 = iJ | iJ2 | iJ3;
        f127622l = i10;
        int i11 = iJ2 | iJ5 | iJ6;
        f127623m = i11;
        int i12 = iJ5 | iJ6;
        f127624n = i12;
        int i13 = 2;
        f127625o = new d(iJ7, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f127626p = new d(i12, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f127627q = new d(iJ, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f127628r = new d(iJ2, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f127629s = new d(iJ3, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f127630t = new d(i10, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f127631u = new d(iJ4, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f127632v = new d(iJ5, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f127633w = new d(iJ6, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f127634x = new d(i11, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        Field[] fields = d.class.getFields();
        f0.o(fields, "T::class.java.fields");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                int i14 = dVar.f127638b;
                String name = field2.getName();
                f0.o(name, "field.name");
                c1177a2 = new a.C1177a(i14, name);
            } else {
                c1177a2 = null;
            }
            if (c1177a2 != null) {
                arrayList2.add(c1177a2);
            }
        }
        f127635y = arrayList2;
        Field[] fields2 = d.class.getFields();
        f0.o(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (f0.g(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            f0.n(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if ((iIntValue == ((-iIntValue) & iIntValue)) == true) {
                String name2 = field4.getName();
                f0.o(name2, "field.name");
                c1177a = new a.C1177a(iIntValue, name2);
            } else {
                c1177a = null;
            }
            if (c1177a != null) {
                arrayList5.add(c1177a);
            }
        }
        f127636z = arrayList5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(int i10, @dl.d List<? extends c> excludes) {
        f0.p(excludes, "excludes");
        this.f127637a = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i10 &= ~((c) it.next()).a();
        }
        this.f127638b = i10;
    }

    public /* synthetic */ d(int i10, List list, int i11, u uVar) {
        this(i10, (i11 & 2) != 0 ? CollectionsKt__CollectionsKt.E() : list);
    }

    public final boolean a(int i10) {
        return (i10 & this.f127638b) != 0;
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f0.g(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        f0.n(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        d dVar = (d) obj;
        return f0.g(this.f127637a, dVar.f127637a) && this.f127638b == dVar.f127638b;
    }

    public int hashCode() {
        return (this.f127637a.hashCode() * 31) + this.f127638b;
    }

    @dl.d
    public final List<c> l() {
        return this.f127637a;
    }

    public final int m() {
        return this.f127638b;
    }

    @dl.e
    public final d n(int i10) {
        int i11 = i10 & this.f127638b;
        if (i11 == 0) {
            return null;
        }
        return new d(i11, this.f127637a);
    }

    @dl.d
    public String toString() {
        Object next;
        Iterator<T> it = f127635y.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((a.C1177a) next).a() == this.f127638b));
        a.C1177a c1177a = (a.C1177a) next;
        String strB = c1177a != null ? c1177a.b() : null;
        if (strB == null) {
            List<a.C1177a> list = f127636z;
            ArrayList arrayList = new ArrayList();
            for (a.C1177a c1177a2 : list) {
                String strB2 = a(c1177a2.a()) ? c1177a2.b() : null;
                if (strB2 != null) {
                    arrayList.add(strB2);
                }
            }
            strB = CollectionsKt___CollectionsKt.h3(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + strB + ", " + this.f127637a + ')';
    }
}
