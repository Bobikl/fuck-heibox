package org.apache.tools.ant;

import java.io.File;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Vector;
import java.util.function.Supplier;
import org.xml.sax.AttributeList;

/* JADX INFO: compiled from: ProjectHelper.java */
/* JADX INFO: loaded from: classes5.dex */
public class e2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f133119c = "antlib:org.apache.tools.ant";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f133120d = "ant:current";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f133121e = "ant:attribute";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final String f133122f = "antlib:";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f133123g = "ant-type";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final String f133124h = "org.apache.tools.ant.ProjectHelper";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final String f133125i = "META-INF/services/org.apache.tools.ant.ProjectHelper";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final String f133126j = "ant.projectHelper";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f133127k = "USE_PROJECT_NAME_AS_TARGET_PREFIX";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final ThreadLocal<String> f133128l = new ThreadLocal<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final ThreadLocal<String> f133129m = ThreadLocal.withInitial(new Supplier() { // from class: org.apache.tools.ant.c2
        @Override // java.util.function.Supplier
        public final Object get() {
            return e2.u();
        }
    });

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadLocal<Boolean> f133130n = ThreadLocal.withInitial(new Supplier() { // from class: org.apache.tools.ant.d2
        @Override // java.util.function.Supplier
        public final Object get() {
            return Boolean.FALSE;
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Vector<Object> f133131a = new Vector<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String[]> f133132b = new LinkedList();

    /* JADX INFO: compiled from: ProjectHelper.java */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f133133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f133134c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f133135d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final a[] f133136e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f133137a;

        static {
            a aVar = new a("fail");
            f133133b = aVar;
            a aVar2 = new a("warn");
            f133134c = aVar2;
            a aVar3 = new a(org.apache.tools.ant.taskdefs.z0.b.f136024i);
            f133135d = aVar3;
            f133136e = new a[]{aVar, aVar2, aVar3};
        }

        private a(String str) {
            this.f133137a = str;
        }

        public static a b(String str) {
            str.getClass();
            for (a aVar : f133136e) {
                if (str.equals(aVar.a())) {
                    return aVar;
                }
            }
            throw new IllegalArgumentException("Unknown onMissingExtensionPoint " + str);
        }

        public String a() {
            return this.f133137a;
        }

        public String toString() {
            return this.f133137a;
        }
    }

    @Deprecated
    public static String A(Project project, String str) throws BuildException {
        return project.V0(str);
    }

    @Deprecated
    public static String B(Project project, String str, Hashtable<String, Object> hashtable) throws BuildException {
        return p2.u(project).I(null, str, hashtable);
    }

    public static void D(String str) {
        f133129m.set(str);
    }

    public static void E(String str) {
        f133128l.set(str);
    }

    public static void F(boolean z10) {
        f133130n.set(Boolean.valueOf(z10));
    }

    public static void G(Project project, Object obj, Object obj2, String str) {
        i1.B(project, obj.getClass()).M(project, obj, obj2, str);
    }

    public static BuildException c(BuildException buildException, Location location) {
        if (buildException.b() == null || buildException.getMessage() == null) {
            return buildException;
        }
        String str = String.format("The following error occurred while executing this line:%n%s%s", buildException.b().toString(), buildException.getMessage());
        if (!(buildException instanceof ExitStatusException)) {
            return location == null ? new BuildException(str, buildException) : new BuildException(str, buildException, location);
        }
        int iD = ((ExitStatusException) buildException).d();
        return location == null ? new ExitStatusException(str, iD) : new ExitStatusException(str, iD, location);
    }

    public static void d(Project project, Object obj, String str) throws BuildException {
        if (str == null) {
            return;
        }
        if (obj instanceof y2) {
            obj = ((y2) obj).R();
        }
        i1.B(project, obj.getClass()).d(project, obj, str);
    }

    public static void e(Project project, Object obj, char[] cArr, int i10, int i11) throws BuildException {
        d(project, obj, new String(cArr, i10, i11));
    }

    @Deprecated
    public static void h(Object obj, AttributeList attributeList, Project project) throws BuildException {
        if (obj instanceof y2) {
            obj = ((y2) obj).R();
        }
        i1 i1VarB = i1.B(project, obj.getClass());
        int length = attributeList.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                i1VarB.L(project, obj, attributeList.getName(i10).toLowerCase(Locale.ENGLISH), B(project, attributeList.getValue(i10), project.t0()));
            } catch (BuildException e10) {
                if (!attributeList.getName(i10).equals("id")) {
                    throw e10;
                }
            }
        }
    }

    public static void i(Project project, File file) throws BuildException {
        e2 e2VarK = l2.g().k(new org.apache.tools.ant.types.resources.z(file));
        project.i("ant.projectHelper", e2VarK);
        e2VarK.x(project, file);
    }

    public static String j(String str) {
        int iLastIndexOf = str.lastIndexOf(58);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    public static String k(String str) {
        int iLastIndexOf;
        return (str == null || (iLastIndexOf = str.lastIndexOf(58)) == -1) ? "" : str.substring(0, iLastIndexOf);
    }

    public static String l(String str, String str2) {
        if (str == null || str.isEmpty() || str.equals(f133119c)) {
            return str2;
        }
        return str + ":" + str2;
    }

    @Deprecated
    public static ClassLoader m() {
        if (org.apache.tools.ant.util.a1.f()) {
            return org.apache.tools.ant.util.a1.d();
        }
        return null;
    }

    public static String n() {
        return f133129m.get();
    }

    public static String o() {
        return f133128l.get();
    }

    public static e2 s() {
        return l2.g().f().next();
    }

    public static boolean t() {
        return Boolean.TRUE.equals(f133130n.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String u() {
        return ".";
    }

    public static String w(String str) {
        return "attribute namespace:" + str;
    }

    @Deprecated
    public static void z(String str, Vector<String> vector, Vector<String> vector2) throws BuildException {
        p2.G(str, vector, vector2);
    }

    public void C(Project project) throws BuildException {
        t2 t2Var;
        for (String[] strArr : q()) {
            String str = strArr[0];
            String str2 = strArr[1];
            a aVarB = a.b(strArr[2]);
            String str3 = strArr.length > 3 ? strArr[3] : null;
            Hashtable<String, t2> hashtableY0 = project.y0();
            if (str3 == null) {
                t2Var = hashtableY0.get(str);
            } else {
                t2Var = hashtableY0.get(str3 + str);
                if (t2Var == null) {
                    t2Var = hashtableY0.get(str);
                }
            }
            if (t2Var == null) {
                String str4 = "can't add target " + str2 + " to extension-point " + str + " because the extension-point is unknown.";
                if (aVarB == a.f133133b) {
                    throw new BuildException(str4);
                }
                if (aVarB == a.f133134c) {
                    project.O0(hashtableY0.get(str2), "Warning: " + str4, 1);
                }
            } else {
                if (!(t2Var instanceof g1)) {
                    throw new BuildException("referenced target " + str + " is not an extension-point");
                }
                t2Var.d(str2);
            }
        }
    }

    public boolean f(org.apache.tools.ant.types.s1 s1Var) {
        return false;
    }

    public boolean g(org.apache.tools.ant.types.s1 s1Var) {
        return true;
    }

    public String p() {
        return v1.f137078v;
    }

    public List<String[]> q() {
        return this.f133132b;
    }

    public Vector<Object> r() {
        return this.f133131a;
    }

    public void x(Project project, Object obj) throws BuildException {
        throw new BuildException("ProjectHelper.parse() must be implemented in a helper plugin " + getClass().getName());
    }

    public z2 y(Project project, org.apache.tools.ant.types.s1 s1Var) {
        throw new BuildException("can't parse antlib descriptors");
    }
}
