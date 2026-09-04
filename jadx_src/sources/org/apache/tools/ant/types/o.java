package org.apache.tools.ant.types;

import com.tencent.qcloud.core.util.IOUtils;
import com.umeng.analytics.pro.ak;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;
import java.util.function.Function;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Commandline.java */
/* JADX INFO: loaded from: classes5.dex */
public class o implements Cloneable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f136230d = org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133969k);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final String f136231e = String.format("%nThe ' characters around the executable and arguments are%nnot part of the command.%n", new Object[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<a> f136232b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f136233c = null;

    /* JADX INFO: compiled from: Commandline.java */
    public static class a extends org.apache.tools.ant.b2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String[] f136234e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f136235f = "";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f136236g = "";

        public void B1(a aVar) {
            this.f136234e = aVar.f136234e;
            this.f136235f = aVar.f136235f;
            this.f136236g = aVar.f136236g;
        }

        public String[] D1() {
            String[] strArr = this.f136234e;
            if (strArr == null || strArr.length == 0 || (this.f136235f.isEmpty() && this.f136236g.isEmpty())) {
                return this.f136234e;
            }
            int length = this.f136234e.length;
            String[] strArr2 = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr2[i10] = this.f136235f + this.f136234e[i10] + this.f136236g;
            }
            return strArr2;
        }

        public void G1(File file) {
            this.f136234e = new String[]{file.getAbsolutePath()};
        }

        public void H1(String str) {
            if (str == null) {
                return;
            }
            this.f136234e = o.B(str);
        }

        public void I1(o0 o0Var) {
            this.f136234e = new String[]{o0Var.toString()};
        }

        public void K1(q1 q1Var) {
            o0 o0Var = new o0(b());
            o0Var.c2(q1Var);
            this.f136234e = new String[]{o0Var.toString()};
        }

        public void L1(String str) {
            if (str == null) {
                str = "";
            }
            this.f136235f = str;
        }

        public void N1(String str) {
            if (str == null) {
                str = "";
            }
            this.f136236g = str;
        }

        public void O1(String str) {
            this.f136234e = new String[]{str};
        }
    }

    /* JADX INFO: compiled from: Commandline.java */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f136237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f136238b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f136239c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f136240d = "";

        b(int i10) {
            this.f136237a = i10;
        }

        public int a() {
            if (this.f136238b == -1) {
                this.f136238b = (o.this.f136233c == null ? 0 : 1) + ((int) o.this.f136232b.stream().limit(this.f136237a).map(new Function() { // from class: org.apache.tools.ant.types.p
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((o.a) obj).D1();
                    }
                }).flatMap(new org.apache.tools.ant.taskdefs.optional.o()).count());
            }
            return this.f136238b;
        }

        public String b() {
            return this.f136239c;
        }

        public String c() {
            return this.f136240d;
        }

        public void d(String str) {
            if (str == null) {
                str = "";
            }
            this.f136239c = str;
        }

        public void e(String str) {
            if (str == null) {
                str = "";
            }
            this.f136240d = str;
        }
    }

    public o() {
    }

    public o(String str) {
        String[] strArrB = B(str);
        if (strArrB == null || strArrB.length <= 0) {
            return;
        }
        w(strArrB[0]);
        for (int i10 = 1; i10 < strArrB.length; i10++) {
            h().O1(strArrB[i10]);
        }
    }

    public static String[] B(String str) {
        if (str == null || str.isEmpty()) {
            return new String[0];
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, "\"' ", true);
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        char c10 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (c10 != 1) {
                if (c10 != 2) {
                    if ("'".equals(strNextToken)) {
                        c10 = 1;
                    } else if ("\"".equals(strNextToken)) {
                        c10 = 2;
                    } else if (!" ".equals(strNextToken)) {
                        sb2.append(strNextToken);
                    } else if (z10 || sb2.length() > 0) {
                        arrayList.add(sb2.toString());
                        sb2.setLength(0);
                    }
                    z10 = false;
                } else if ("\"".equals(strNextToken)) {
                    c10 = 0;
                    z10 = true;
                } else {
                    sb2.append(strNextToken);
                }
            } else if ("'".equals(strNextToken)) {
                c10 = 0;
                z10 = true;
            } else {
                sb2.append(strNextToken);
            }
        }
        if (z10 || sb2.length() > 0) {
            arrayList.add(sb2.toString());
        }
        if (c10 != 1 && c10 != 2) {
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        throw new BuildException("unbalanced quotes in " + str);
    }

    public static String l(o oVar) {
        return m(oVar.r());
    }

    public static String m(String[] strArr) {
        return n(strArr, 0);
    }

    protected static String n(String[] strArr, int i10) {
        if (strArr == null || strArr.length <= i10) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        objArr[0] = strArr.length > i10 ? ak.aB : "";
        sb2.append(String.format("argument%s:%n", objArr));
        while (i10 < strArr.length) {
            sb2.append(String.format("'%s'%n", strArr[i10]));
            i10++;
        }
        sb2.append(f136231e);
        return sb2.toString();
    }

    public static String p(o oVar) {
        return q(oVar.s());
    }

    public static String q(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder("Executing '");
        sb2.append(strArr[0]);
        sb2.append("'");
        if (strArr.length > 1) {
            sb2.append(" with ");
            sb2.append(n(strArr, 1));
        } else {
            sb2.append(f136231e);
        }
        return sb2.toString();
    }

    public static String v(String str) {
        if (str.contains("\"")) {
            if (str.contains("'")) {
                throw new BuildException("Can't handle single and double quotes in same argument");
            }
            return '\'' + str + '\'';
        }
        if (!str.contains("'") && !str.contains(" ") && (!f136230d || !str.contains(";"))) {
            return str;
        }
        return kotlin.text.y.f128593b + str + kotlin.text.y.f128593b;
    }

    public static String z(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : strArr) {
            if (sb2.length() > 0) {
                sb2.append(' ');
            }
            sb2.append(v(str));
        }
        return sb2.toString();
    }

    public void c(String[] strArr) {
        for (String str : strArr) {
            h().O1(str);
        }
    }

    public Object clone() {
        try {
            o oVar = (o) super.clone();
            oVar.f136232b = new ArrayList(this.f136232b);
            return oVar;
        } catch (CloneNotSupportedException e10) {
            throw new BuildException(e10);
        }
    }

    public void d(ListIterator<String> listIterator) {
        Iterator<a> it = this.f136232b.iterator();
        while (it.hasNext()) {
            String[] strArrD1 = it.next().D1();
            if (strArrD1 != null) {
                for (String str : strArrD1) {
                    listIterator.add(str);
                }
            }
        }
    }

    public void e(ListIterator<String> listIterator) {
        String str = this.f136233c;
        if (str != null) {
            listIterator.add(str);
        }
        d(listIterator);
    }

    public void f() {
        this.f136233c = null;
        this.f136232b.clear();
    }

    public void g() {
        this.f136232b.clear();
    }

    public a h() {
        return i(false);
    }

    public a i(boolean z10) {
        a aVar = new a();
        if (z10) {
            this.f136232b.add(0, aVar);
        } else {
            this.f136232b.add(aVar);
        }
        return aVar;
    }

    public b j() {
        return new b(this.f136232b.size());
    }

    public String k() {
        return l(this);
    }

    public String o() {
        return p(this);
    }

    public String[] r() {
        ArrayList arrayList = new ArrayList(this.f136232b.size() * 2);
        d(arrayList.listIterator());
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public String[] s() {
        LinkedList linkedList = new LinkedList();
        e(linkedList.listIterator());
        return (String[]) linkedList.toArray(new String[linkedList.size()]);
    }

    public String t() {
        return this.f136233c;
    }

    public String toString() {
        return z(s());
    }

    public Iterator<a> u() {
        return this.f136232b.iterator();
    }

    public void w(String str) {
        x(str, true);
    }

    public void x(String str, boolean z10) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (z10) {
            str = str.replace(IOUtils.DIR_SEPARATOR_UNIX, File.separatorChar).replace(IOUtils.DIR_SEPARATOR_WINDOWS, File.separatorChar);
        }
        this.f136233c = str;
    }

    public int y() {
        return s().length;
    }
}
