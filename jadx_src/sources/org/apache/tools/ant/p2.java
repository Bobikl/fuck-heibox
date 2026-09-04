package org.apache.tools.ant;

import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PropertyHelper.java */
/* JADX INFO: loaded from: classes5.dex */
public class p2 implements org.apache.tools.ant.property.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final e f133564g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final org.apache.tools.ant.property.n f133565h = new org.apache.tools.ant.property.n() { // from class: org.apache.tools.ant.m2
        @Override // org.apache.tools.ant.property.n
        public final String e(String str, ParsePosition parsePosition, org.apache.tools.ant.property.j jVar) {
            return p2.B(str, parsePosition, jVar);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final org.apache.tools.ant.property.n f133566i = new org.apache.tools.ant.property.n() { // from class: org.apache.tools.ant.n2
        @Override // org.apache.tools.ant.property.n
        public final String e(String str, ParsePosition parsePosition, org.apache.tools.ant.property.j jVar) {
            return p2.C(str, parsePosition, jVar);
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final e f133567j = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Project f133568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p2 f133569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Hashtable<Class<? extends c>, List<c>> f133570c = new Hashtable<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Hashtable<String, Object> f133571d = new Hashtable<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Hashtable<String, Object> f133572e = new Hashtable<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Hashtable<String, Object> f133573f = new Hashtable<>();

    /* JADX INFO: compiled from: PropertyHelper.java */
    public class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f133574a = "toString:";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f133575b = 9;

        a() {
        }

        @Override // org.apache.tools.ant.p2.e
        public Object c(String str, p2 p2Var) {
            Object objW0 = (!str.startsWith("toString:") || p2Var.q() == null) ? null : p2Var.q().w0(str.substring(this.f133575b));
            if (objW0 == null) {
                return null;
            }
            return objW0.toString();
        }
    }

    /* JADX INFO: compiled from: PropertyHelper.java */
    public class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f133576a = "ant.refid:";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f133577b = 10;

        b() {
        }

        @Override // org.apache.tools.ant.p2.e
        public Object c(String str, p2 p2Var) {
            if (!str.startsWith("ant.refid:") || p2Var.q() == null) {
                return null;
            }
            return p2Var.q().w0(str.substring(this.f133577b));
        }
    }

    /* JADX INFO: compiled from: PropertyHelper.java */
    public interface c {
    }

    /* JADX INFO: compiled from: PropertyHelper.java */
    public interface d extends c {
        Set<String> a();
    }

    /* JADX INFO: compiled from: PropertyHelper.java */
    public interface e extends c {
        Object c(String str, p2 p2Var);
    }

    /* JADX INFO: compiled from: PropertyHelper.java */
    public interface f extends c {
        boolean b(String str, Object obj, p2 p2Var);

        boolean d(String str, Object obj, p2 p2Var);
    }

    protected p2() {
        d(f133567j);
        d(f133564g);
        d(f133566i);
        d(f133565h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A(Set set, d dVar) {
        set.addAll(dVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String B(String str, ParsePosition parsePosition, org.apache.tools.ant.property.j jVar) {
        int index = parsePosition.getIndex();
        if (str.length() - index < 3 || '$' != str.charAt(index) || '{' != str.charAt(index + 1)) {
            return null;
        }
        int i10 = index + 2;
        int iIndexOf = str.indexOf(125, i10);
        if (iIndexOf >= 0) {
            parsePosition.setIndex(iIndexOf + 1);
            return i10 == iIndexOf ? "" : str.substring(i10, iIndexOf);
        }
        throw new BuildException("Syntax error in property: " + str.substring(index));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String C(String str, ParsePosition parsePosition, org.apache.tools.ant.property.j jVar) {
        int index = parsePosition.getIndex();
        if (str.length() - index < 2 || '$' != str.charAt(index)) {
            return null;
        }
        int i10 = index + 1;
        if ('$' != str.charAt(i10)) {
            return null;
        }
        parsePosition.setIndex(i10);
        return null;
    }

    private static boolean D(Object obj) {
        return obj == null || "".equals(obj);
    }

    static void G(String str, Vector<String> vector, Vector<String> vector2) throws BuildException {
        int i10 = 0;
        while (true) {
            int iIndexOf = str.indexOf(36, i10);
            if (iIndexOf < 0) {
                if (i10 < str.length()) {
                    vector.addElement(str.substring(i10));
                    return;
                }
                return;
            }
            if (iIndexOf > 0) {
                vector.addElement(str.substring(i10, iIndexOf));
            }
            if (iIndexOf == str.length() - 1) {
                vector.addElement("$");
                i10 = iIndexOf + 1;
            } else {
                int i11 = iIndexOf + 1;
                if (str.charAt(i11) != '{') {
                    if (str.charAt(i11) == '$') {
                        vector.addElement("$");
                    } else {
                        vector.addElement(str.substring(iIndexOf, iIndexOf + 2));
                    }
                    i10 = iIndexOf + 2;
                } else {
                    int iIndexOf2 = str.indexOf(125, iIndexOf);
                    if (iIndexOf2 < 0) {
                        throw new BuildException("Syntax error in property: " + str);
                    }
                    String strSubstring = str.substring(iIndexOf + 2, iIndexOf2);
                    vector.addElement(null);
                    vector2.addElement(strSubstring);
                    i10 = iIndexOf2 + 1;
                }
            }
        }
    }

    public static void N(Project project, String str, Object obj) {
        u(project).L(str, obj);
    }

    public static void Q(Project project, String str, Object obj) {
        u(project).R(str, obj, true);
    }

    public static Boolean Y(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (Project.t1(str)) {
            return Boolean.TRUE;
        }
        if (kotlinx.coroutines.s0.f130317e.equalsIgnoreCase(str) || "false".equalsIgnoreCase(str) || "no".equalsIgnoreCase(str)) {
            return Boolean.FALSE;
        }
        return null;
    }

    private boolean h(Object obj) {
        Boolean boolY = Y(obj);
        if (boolY != null) {
            return boolY.booleanValue();
        }
        return getProperty(String.valueOf(obj)) != null;
    }

    protected static Set<Class<? extends c>> i(c cVar) {
        HashSet hashSet = new HashSet();
        for (Class<?> superclass = cVar.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            for (Class<?> cls : superclass.getInterfaces()) {
                if (c.class.isAssignableFrom(cls)) {
                    hashSet.add(cls);
                }
            }
        }
        hashSet.remove(c.class);
        return hashSet;
    }

    public static Object t(Project project, String str) {
        return u(project).getProperty(str);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0013 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:13:0x0015 A[Catch: all -> 0x000f, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x0006, B:13:0x0015, B:15:0x001f), top: B:20:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x001f A[Catch: all -> 0x000f, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x0006, B:13:0x0015, B:15:0x001f), top: B:20:0x0006 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:11:0x0013, please report this as an issue */
    public static synchronized p2 u(Project project) {
        p2 p2Var;
        p2 p2Var2 = null;
        if (project == null) {
            if (p2Var2 != null) {
                return p2Var2;
            }
            p2Var = new p2();
            p2Var.P(project);
            if (project != null) {
                project.i(j1.f133502z, p2Var);
            }
            return p2Var;
        }
        p2Var2 = (p2) project.w0(j1.f133502z);
        if (p2Var2 != null) {
            return p2Var2;
        }
        p2Var = new p2();
        p2Var.P(project);
        if (project != null) {
            project.i(j1.f133502z, p2Var);
        }
        return p2Var;
        throw th;
    }

    public Object E(String str) throws BuildException {
        return new org.apache.tools.ant.property.m(q(), k(), this).g(str);
    }

    @Deprecated
    public void F(String str, Vector<String> vector, Vector<String> vector2) throws BuildException {
        G(str, vector, vector2);
    }

    public String H(String str) throws BuildException {
        Object objE = E(str);
        return (objE == null || (objE instanceof String)) ? (String) objE : objE.toString();
    }

    public String I(String str, String str2, Hashtable<String, Object> hashtable) throws BuildException {
        return H(str2);
    }

    public void J(String str, Object obj) {
        Project project = this.f133568a;
        if (project != null) {
            project.M0("Setting ro project property: " + str + " -> " + obj, 4);
        }
        synchronized (this) {
            this.f133573f.put(str, obj);
            this.f133572e.put(str, obj);
            this.f133571d.put(str, obj);
        }
    }

    @Deprecated
    public void K(String str, String str2, Object obj) {
        J(str2, obj);
    }

    public void L(String str, Object obj) {
        Iterator it = j(f.class).iterator();
        while (it.hasNext()) {
            if (((f) it.next()).b(str, obj, this)) {
                return;
            }
        }
        synchronized (this) {
            if (this.f133568a != null && this.f133571d.containsKey(str)) {
                this.f133568a.M0("Override ignored for property \"" + str + "\"", 3);
                return;
            }
            Project project = this.f133568a;
            if (project != null) {
                project.M0("Setting project property: " + str + " -> " + obj, 4);
            }
            if (str != null && obj != null) {
                this.f133571d.put(str, obj);
            }
        }
    }

    @Deprecated
    public void M(String str, String str2, Object obj) {
        L(str2, obj);
    }

    @Deprecated
    public void O(p2 p2Var) {
        this.f133569b = p2Var;
    }

    public void P(Project project) {
        this.f133568a = project;
    }

    public boolean R(String str, Object obj, boolean z10) {
        Iterator it = j(f.class).iterator();
        while (it.hasNext()) {
            if (((f) it.next()).d(str, obj, this)) {
                return true;
            }
        }
        synchronized (this) {
            if (this.f133572e.containsKey(str)) {
                Project project = this.f133568a;
                if (project != null && z10) {
                    project.M0("Override ignored for user property \"" + str + "\"", 3);
                }
                return false;
            }
            if (this.f133568a != null && z10) {
                if (this.f133571d.containsKey(str)) {
                    this.f133568a.M0("Overriding previous definition of property \"" + str + "\"", 3);
                }
                this.f133568a.M0("Setting project property: " + str + " -> " + obj, 4);
            }
            if (str != null && obj != null) {
                this.f133571d.put(str, obj);
            }
            return true;
        }
    }

    @Deprecated
    public boolean S(String str, String str2, Object obj, boolean z10) {
        return R(str2, obj, z10);
    }

    @Deprecated
    public boolean T(String str, String str2, Object obj, boolean z10, boolean z11, boolean z12) {
        if (p() != null) {
            return p().T(str, str2, obj, z10, z11, z12);
        }
        return false;
    }

    public void U(String str, Object obj) {
        Project project = this.f133568a;
        if (project != null) {
            project.M0("Setting ro project property: " + str + " -> " + obj, 4);
        }
        synchronized (this) {
            this.f133572e.put(str, obj);
            this.f133571d.put(str, obj);
        }
    }

    @Deprecated
    public void V(String str, String str2, Object obj) {
        U(str2, obj);
    }

    public boolean W(Object obj) {
        return D(obj) || h(obj);
    }

    public boolean X(Object obj) {
        return D(obj) || !h(obj);
    }

    public void d(c cVar) {
        ArrayList arrayList;
        synchronized (this.f133570c) {
            for (Class<? extends c> cls : i(cVar)) {
                List<c> list = this.f133570c.get(cls);
                if (list == null) {
                    arrayList = new ArrayList();
                } else {
                    ArrayList arrayList2 = new ArrayList(list);
                    arrayList2.remove(cVar);
                    arrayList = arrayList2;
                }
                arrayList.add(0, cVar);
                this.f133570c.put(cls, Collections.unmodifiableList(arrayList));
            }
        }
    }

    public boolean e(String str) {
        return new org.apache.tools.ant.property.m(q(), k(), this).d(str);
    }

    public void f(Project project) {
        synchronized (this.f133573f) {
            for (Map.Entry<String, Object> entry : this.f133573f.entrySet()) {
                String key = entry.getKey();
                if (project.C0(key) == null) {
                    project.i1(key, entry.getValue().toString());
                }
            }
        }
    }

    public void g(Project project) {
        synchronized (this.f133572e) {
            for (Map.Entry<String, Object> entry : this.f133572e.entrySet()) {
                String key = entry.getKey();
                if (!this.f133573f.containsKey(key)) {
                    project.s1(key, entry.getValue().toString());
                }
            }
        }
    }

    @Override // org.apache.tools.ant.property.a
    public Object getProperty(String str) {
        if (str == null) {
            return null;
        }
        Iterator it = j(e.class).iterator();
        while (it.hasNext()) {
            Object objC = ((e) it.next()).c(str, this);
            if (objC != null) {
                if (objC instanceof org.apache.tools.ant.property.i) {
                    return null;
                }
                return objC;
            }
        }
        return this.f133571d.get(str);
    }

    protected <D extends c> List<D> j(Class<D> cls) {
        List<D> list = (List) this.f133570c.get(cls);
        return list == null ? Collections.emptyList() : list;
    }

    public Collection<org.apache.tools.ant.property.n> k() {
        return j(org.apache.tools.ant.property.n.class);
    }

    public Hashtable<String, Object> l() {
        Hashtable<String, Object> hashtable;
        synchronized (this.f133573f) {
            hashtable = new Hashtable<>(this.f133573f);
        }
        return hashtable;
    }

    protected Hashtable<String, Object> m() {
        return this.f133573f;
    }

    protected Hashtable<String, Object> n() {
        return this.f133571d;
    }

    protected Hashtable<String, Object> o() {
        return this.f133572e;
    }

    @Deprecated
    public p2 p() {
        return this.f133569b;
    }

    public Project q() {
        return this.f133568a;
    }

    public Hashtable<String, Object> r() {
        Hashtable<String, Object> hashtable;
        synchronized (this.f133571d) {
            hashtable = new Hashtable<>(this.f133571d);
        }
        return hashtable;
    }

    @Deprecated
    public Object s(String str, String str2) {
        return getProperty(str2);
    }

    @Deprecated
    public Object v(String str, String str2, boolean z10) {
        Object objV;
        if (p() != null && (objV = p().v(str, str2, z10)) != null) {
            return objV;
        }
        if (this.f133568a == null || !str2.startsWith("toString:")) {
            return null;
        }
        Object objW0 = this.f133568a.w0(str2.substring(9));
        if (objW0 == null) {
            return null;
        }
        return objW0.toString();
    }

    public Set<String> w() {
        final HashSet hashSet = new HashSet(this.f133571d.keySet());
        j(d.class).forEach(new Consumer() { // from class: org.apache.tools.ant.o2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                p2.A(hashSet, (p2.d) obj);
            }
        });
        return Collections.unmodifiableSet(hashSet);
    }

    public Hashtable<String, Object> x() {
        Hashtable<String, Object> hashtable;
        synchronized (this.f133572e) {
            hashtable = new Hashtable<>(this.f133572e);
        }
        return hashtable;
    }

    public Object y(String str) {
        if (str == null) {
            return null;
        }
        return this.f133572e.get(str);
    }

    @Deprecated
    public Object z(String str, String str2) {
        return y(str2);
    }
}
