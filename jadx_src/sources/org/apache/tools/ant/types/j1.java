package org.apache.tools.ant.types;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.p2;

/* JADX INFO: compiled from: PropertySet.java */
/* JADX INFO: loaded from: classes5.dex */
public class j1 extends s implements u1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Set<String> f136189i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private k0 f136192l;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f136187g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f136188h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<b> f136190j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<j1> f136191k = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f136193m = true;

    /* JADX INFO: compiled from: PropertySet.java */
    public static class a extends w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final String f136194c = "all";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final String f136195d = "system";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final String f136196e = "commandline";

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"all", f136195d, f136196e};
        }
    }

    /* JADX INFO: compiled from: PropertySet.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f136197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f136198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f136199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f136200d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f136201e;

        private void e(String str, String str2) {
            if (str2 == null || str2.length() < 1) {
                throw new BuildException("Invalid attribute: " + str);
            }
            int i10 = this.f136197a + 1;
            this.f136197a = i10;
            if (i10 != 1) {
                throw new BuildException("Attributes name, regex, and prefix are mutually exclusive");
            }
        }

        public void f(a aVar) {
            String strD = aVar.d();
            e("builtin", strD);
            this.f136201e = strD;
        }

        public void g(String str) {
            e("name", str);
            this.f136198b = str;
        }

        public void h(String str) {
            e("prefix", str);
            this.f136200d = str;
        }

        public void i(String str) {
            e(org.apache.tools.ant.types.selectors.w.f136633s, str);
            this.f136199c = str;
        }

        public String toString() {
            return "name=" + this.f136198b + ", regex=" + this.f136199c + ", prefix=" + this.f136200d + ", builtin=" + this.f136201e;
        }
    }

    private Map<String, Object> B2() {
        String[] strArrY0;
        if (Y1()) {
            return D2().B2();
        }
        H1();
        k0 k0VarZ2 = z2();
        org.apache.tools.ant.util.g0 g0VarI2 = k0VarZ2 == null ? null : k0VarZ2.i2();
        Map<String, Object> mapY2 = y2();
        Set<String> setC2 = C2(mapY2);
        HashMap map = new HashMap();
        for (String str : setC2) {
            Object obj = mapY2.get(str);
            if (obj != null) {
                if (g0VarI2 != null && (strArrY0 = g0VarI2.y0(str)) != null) {
                    str = strArrY0[0];
                }
                map.put(str, obj);
            }
        }
        return map;
    }

    private Set<String> C2(Map<String, Object> map) {
        Set<String> set;
        Set<String> set2;
        if (x2() || (set2 = this.f136189i) == null) {
            set = set2;
            HashSet hashSet = new HashSet();
            n2(hashSet, map);
            Iterator<j1> it = this.f136191k.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().B2().keySet());
            }
            HashSet hashSet2 = hashSet;
            if (this.f136188h) {
                HashSet hashSet3 = new HashSet(map.keySet());
                hashSet3.removeAll(hashSet);
                hashSet2 = hashSet3;
            }
            set = hashSet2;
            if (!x2()) {
                this.f136189i = hashSet2;
                set = hashSet2;
            }
        }
        set = set2;
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String E2(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object F2(String str) {
        return System.getProperties().getProperty(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object G2(Object obj, Object obj2) {
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractMap.SimpleImmutableEntry H2(p2 p2Var, String str) {
        return new AbstractMap.SimpleImmutableEntry(str, p2Var.getProperty(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean I2(AbstractMap.SimpleImmutableEntry simpleImmutableEntry) {
        return simpleImmutableEntry.getValue() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ s1 J2(String str) {
        return new org.apache.tools.ant.types.resources.x0(b(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ s1 K2(Optional optional, s1 s1Var) {
        return new org.apache.tools.ant.types.resources.q0(s1Var, (org.apache.tools.ant.util.g0) optional.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String L2(Map.Entry entry) {
        return ((String) entry.getKey()) + ContainerUtils.KEY_VALUE_DELIMITER + entry.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:64:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d7 A[SYNTHETIC] */
    private void n2(Set<String> set, Map<String, Object> map) {
        if (Y1()) {
            D2().n2(set, map);
        }
        H1();
        for (b bVar : this.f136190j) {
            if (bVar.f136198b != null) {
                if (map.get(bVar.f136198b) != null) {
                    set.add(bVar.f136198b);
                }
            } else if (bVar.f136200d != null) {
                for (String str : map.keySet()) {
                    if (str.startsWith(bVar.f136200d)) {
                        set.add(str);
                    }
                }
            } else if (bVar.f136199c != null) {
                org.apache.tools.ant.util.regexp.e eVarB = new org.apache.tools.ant.util.regexp.f().b();
                eVarB.g(bVar.f136199c);
                for (String str2 : map.keySet()) {
                    if (eVarB.d(str2)) {
                        set.add(str2);
                    }
                }
            } else {
                if (bVar.f136201e == null) {
                    throw new BuildException("Impossible: Invalid PropertyRef!");
                }
                String str3 = bVar.f136201e;
                str3.hashCode();
                byte b10 = -1;
                switch (str3) {
                    case "commandline":
                        b10 = 0;
                    case "system":
                        b10 = 1;
                    case "all":
                        b10 = 2;
                    default:
                        switch (b10) {
                            case 0:
                                set.addAll(b().B0().keySet());
                                break;
                            case 1:
                                set.addAll(w2().keySet());
                                break;
                            case 2:
                                set.addAll(map.keySet());
                                break;
                            default:
                                throw new BuildException("Impossible: Invalid builtin attribute!");
                        }
                }
            }
        }
    }

    private Map<String, Object> w2() {
        return (Map) System.getProperties().stringPropertyNames().stream().collect(Collectors.toMap(new Function() { // from class: org.apache.tools.ant.types.c1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return j1.E2((String) obj);
            }
        }, new Function() { // from class: org.apache.tools.ant.types.d1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return j1.F2((String) obj);
            }
        }, new BinaryOperator() { // from class: org.apache.tools.ant.types.e1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return j1.G2(obj, obj2);
            }
        }));
    }

    private Map<String, Object> y2() {
        Map<String, Object> mapW2;
        Project projectB = b();
        if (projectB == null) {
            mapW2 = w2();
        } else {
            final p2 p2VarU = p2.u(projectB);
            mapW2 = (Map) projectB.v0().stream().map(new Function() { // from class: org.apache.tools.ant.types.g1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return j1.H2(p2VarU, (String) obj);
                }
            }).filter(new Predicate() { // from class: org.apache.tools.ant.types.h1
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return j1.I2((AbstractMap.SimpleImmutableEntry) obj);
                }
            }).collect(Collectors.toMap(new Function() { // from class: org.apache.tools.ant.types.i1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (String) ((AbstractMap.SimpleImmutableEntry) obj).getKey();
                }
            }, new Function() { // from class: org.apache.tools.ant.types.z0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((AbstractMap.SimpleImmutableEntry) obj).getValue();
                }
            }));
        }
        Iterator<j1> it = this.f136191k.iterator();
        while (it.hasNext()) {
            mapW2.putAll(it.next().B2());
        }
        return mapW2;
    }

    public Properties A2() {
        Properties properties = new Properties();
        properties.putAll(B2());
        return properties;
    }

    protected j1 D2() {
        return (j1) O1(j1.class);
    }

    @Override // org.apache.tools.ant.types.s
    protected synchronized void I1(Stack<Object> stack, Project project) throws BuildException {
        if (X1()) {
            return;
        }
        if (Y1()) {
            super.I1(stack, project);
        } else {
            k0 k0Var = this.f136192l;
            if (k0Var != null) {
                s.a2(k0Var, stack, project);
            }
            Iterator<j1> it = this.f136191k.iterator();
            while (it.hasNext()) {
                s.a2(it.next(), stack, project);
            }
            b2(true);
        }
    }

    public void M2(boolean z10) {
        u2();
        this.f136187g = z10;
    }

    public void N2(String str, String str2, String str3) {
        k0 k0VarV2 = v2();
        k0.a aVar = new k0.a();
        aVar.g(str);
        k0VarV2.o2(aVar);
        k0VarV2.n0(str2);
        k0VarV2.q0(str3);
    }

    @Override // org.apache.tools.ant.types.u1
    public boolean O() {
        if (Y1()) {
            return D2().O();
        }
        H1();
        return false;
    }

    public void O2(boolean z10) {
        u2();
        this.f136188h = z10;
    }

    @Override // org.apache.tools.ant.types.s
    public final void c2(q1 q1Var) {
        if (!this.f136193m) {
            throw d2();
        }
        super.c2(q1Var);
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ boolean isEmpty() {
        return t1.a(this);
    }

    @Override // java.lang.Iterable
    public Iterator<s1> iterator() {
        if (Y1()) {
            return D2().iterator();
        }
        H1();
        Stream map = C2(y2()).stream().map(new Function() { // from class: org.apache.tools.ant.types.y0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f136679a.J2((String) obj);
            }
        });
        final Optional map2 = Optional.ofNullable(z2()).map(new Function() { // from class: org.apache.tools.ant.types.a1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k0) obj).i2();
            }
        });
        if (map2.isPresent()) {
            map = map.map(new Function() { // from class: org.apache.tools.ant.types.b1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return j1.K2(map2, (s1) obj);
                }
            });
        }
        return map.iterator();
    }

    public void m2(org.apache.tools.ant.util.g0 g0Var) {
        v2().e2(g0Var);
    }

    public void o2(b bVar) {
        u2();
        b2(false);
        this.f136190j.add(bVar);
    }

    public void p2(j1 j1Var) {
        u2();
        b2(false);
        this.f136191k.add(j1Var);
    }

    public void q2(a aVar) {
        b bVar = new b();
        bVar.f(aVar);
        o2(bVar);
    }

    public void r2(String str) {
        b bVar = new b();
        bVar.g(str);
        o2(bVar);
    }

    public void s2(String str) {
        b bVar = new b();
        bVar.h(str);
        o2(bVar);
    }

    @Override // org.apache.tools.ant.types.u1
    public int size() {
        return Y1() ? D2().size() : A2().size();
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ Stream stream() {
        return t1.b(this);
    }

    public void t2(String str) {
        b bVar = new b();
        bVar.i(str);
        o2(bVar);
    }

    @Override // org.apache.tools.ant.types.s
    public String toString() {
        if (Y1()) {
            return D2().toString();
        }
        H1();
        return (String) new TreeMap(B2()).entrySet().stream().map(new Function() { // from class: org.apache.tools.ant.types.f1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return j1.L2((Map.Entry) obj);
            }
        }).collect(Collectors.joining(", "));
    }

    protected final void u2() {
        if (Y1()) {
            throw d2();
        }
        this.f136193m = false;
    }

    public k0 v2() {
        u2();
        if (this.f136192l != null) {
            throw new BuildException("Too many <mapper>s!");
        }
        this.f136192l = new k0(b());
        b2(false);
        return this.f136192l;
    }

    public boolean x2() {
        if (Y1()) {
            return D2().f136187g;
        }
        H1();
        return this.f136187g;
    }

    public k0 z2() {
        if (Y1()) {
            return D2().f136192l;
        }
        H1();
        return this.f136192l;
    }
}
