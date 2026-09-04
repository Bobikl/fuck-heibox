package org.apache.tools.ant;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.tools.ant.taskdefs.t3;
import org.apache.tools.ant.taskdefs.u3;
import org.xml.sax.AttributeList;
import org.xml.sax.helpers.AttributeListImpl;

/* JADX INFO: loaded from: classes5.dex */
public class RuntimeConfigurable implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    private transient AttributeList f133069e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f133066b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<RuntimeConfigurable> f133067c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient Object f133068d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient boolean f133070f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private LinkedHashMap<String, Object> f133071g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private StringBuffer f133072h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f133073i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f133074j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f133075k = null;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f133076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f133077b;

        private b(String str, boolean z10) {
            this.f133076a = str;
            this.f133077b = z10;
        }

        public String a() {
            return this.f133076a;
        }

        public boolean b() {
            return this.f133077b;
        }
    }

    public static class c {
        private c() {
        }

        public void a(org.apache.tools.ant.attribute.g gVar) {
        }
    }

    public RuntimeConfigurable(Object obj, String str) {
        A(obj);
        y(str);
        if (obj instanceof u2) {
            ((u2) obj).f2(this);
        }
    }

    private String e(String str) {
        int iLastIndexOf = str.lastIndexOf(58);
        return str.substring(0, str.lastIndexOf(58, iLastIndexOf - 1)) + str.substring(iLastIndexOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b p(String str, u uVar) {
        boolean z10 = false;
        String str2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (!str.contains(":")) {
            return new b(str2, z10);
        }
        String strE = e(str);
        return uVar.J(e2.w(e2.k(strE))) == null ? new b(objArr3 == true ? 1 : 0, z10) : new b(strE, true);
    }

    public synchronized void A(Object obj) {
        this.f133068d = obj;
        this.f133073i = false;
    }

    public synchronized void a(RuntimeConfigurable runtimeConfigurable) {
        List<RuntimeConfigurable> arrayList = this.f133067c;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.f133067c = arrayList;
        arrayList.add(runtimeConfigurable);
    }

    public synchronized void b(String str) {
        if (str.isEmpty()) {
            return;
        }
        StringBuffer stringBuffer = this.f133072h;
        if (stringBuffer == null) {
            stringBuffer = new StringBuffer(str);
        } else {
            stringBuffer.append(str);
        }
        this.f133072h = stringBuffer;
    }

    public synchronized void c(char[] cArr, int i10, int i11) {
        if (i11 == 0) {
            return;
        }
        StringBuffer stringBuffer = this.f133072h;
        if (stringBuffer == null) {
            stringBuffer = new StringBuffer(i11);
        }
        stringBuffer.append(cArr, i10, i11);
        this.f133072h = stringBuffer;
    }

    public void d(RuntimeConfigurable runtimeConfigurable) {
        LinkedHashMap<String, Object> linkedHashMap = runtimeConfigurable.f133071g;
        if (linkedHashMap != null) {
            for (String str : linkedHashMap.keySet()) {
                LinkedHashMap<String, Object> linkedHashMap2 = this.f133071g;
                if (linkedHashMap2 == null || linkedHashMap2.get(str) == null) {
                    v(str, (String) runtimeConfigurable.f133071g.get(str));
                }
            }
        }
        String str2 = this.f133074j;
        if (str2 == null) {
            str2 = runtimeConfigurable.f133074j;
        }
        this.f133074j = str2;
        if (runtimeConfigurable.f133067c != null) {
            ArrayList arrayList = new ArrayList(runtimeConfigurable.f133067c);
            List<RuntimeConfigurable> list = this.f133067c;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f133067c = arrayList;
        }
        if (runtimeConfigurable.f133072h != null) {
            StringBuffer stringBuffer = this.f133072h;
            if (stringBuffer == null || stringBuffer.toString().trim().isEmpty()) {
                this.f133072h = new StringBuffer(runtimeConfigurable.f133072h.toString());
            }
        }
    }

    public synchronized Hashtable<String, Object> f() {
        Map mapEmptyMap;
        mapEmptyMap = this.f133071g;
        if (mapEmptyMap == null) {
            mapEmptyMap = Collections.emptyMap();
        }
        return new Hashtable<>(mapEmptyMap);
    }

    @Deprecated
    public synchronized AttributeList g() {
        return this.f133069e;
    }

    synchronized RuntimeConfigurable h(int i10) {
        return this.f133067c.get(i10);
    }

    public synchronized Enumeration<RuntimeConfigurable> i() {
        List<RuntimeConfigurable> list;
        list = this.f133067c;
        return list == null ? Collections.emptyEnumeration() : Collections.enumeration(list);
    }

    public synchronized String j() {
        return this.f133066b;
    }

    public synchronized String k() {
        return this.f133075k;
    }

    public synchronized String l() {
        return this.f133074j;
    }

    public synchronized Object m() {
        return this.f133068d;
    }

    public synchronized StringBuffer n() {
        StringBuffer stringBuffer;
        stringBuffer = this.f133072h;
        if (stringBuffer == null) {
            stringBuffer = new StringBuffer(0);
        }
        return stringBuffer;
    }

    public boolean o(z2 z2Var) {
        if (!this.f133070f) {
            return true;
        }
        u uVarY = u.y(z2Var.b());
        i1 i1VarB = i1.B(z2Var.b(), c.class);
        for (Map.Entry<String, Object> entry : this.f133071g.entrySet()) {
            b bVarP = p(entry.getKey(), uVarY);
            if (bVarP.b()) {
                String str = (String) entry.getValue();
                try {
                    org.apache.tools.ant.attribute.g gVar = (org.apache.tools.ant.attribute.g) i1VarB.j(z2Var.b(), new c(), bVarP.a());
                    if (gVar != null && !gVar.i(z2Var, z2Var.b().V0(str))) {
                        return false;
                    }
                } catch (BuildException unused) {
                    throw new BuildException("Unsupported attribute " + bVarP.a());
                }
            }
        }
        return true;
    }

    public void q(Project project) throws BuildException {
        r(project, true);
    }

    public synchronized void r(Project project, boolean z10) throws BuildException {
        if (this.f133073i) {
            return;
        }
        Object objR = this.f133068d;
        if (objR instanceof y2) {
            objR = ((y2) objR).R();
        }
        i1 i1VarB = i1.B(project, objR.getClass());
        u uVarY = u.y(project);
        LinkedHashMap<String, Object> linkedHashMap = this.f133071g;
        if (linkedHashMap != null) {
            for (Map.Entry<String, Object> entry : linkedHashMap.entrySet()) {
                String key = entry.getKey();
                if (!p(key, uVarY).b()) {
                    Object value = entry.getValue();
                    Object objE = value instanceof e1 ? ((e1) value).e() : p2.u(project).E(value.toString());
                    if (!(objR instanceof u3)) {
                        value = objE;
                        break;
                    }
                    Iterator<t3.a> it = ((u3) objR).k2().r2().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            t3.a next = it.next();
                            if (next.c().equals(key)) {
                                if (next.d()) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        }
                        value = objE;
                        break;
                    }
                    try {
                        try {
                            i1VarB.K(project, objR, key, value);
                        } catch (BuildException e10) {
                            if (!"id".equals(key)) {
                                throw e10;
                            }
                        }
                    } catch (UnsupportedAttributeException e11) {
                        if (!"id".equals(key)) {
                            if (j() == null) {
                                throw e11;
                            }
                            throw new BuildException(j() + " doesn't support the \"" + e11.d() + "\" attribute", e11);
                        }
                    }
                }
            }
        }
        StringBuffer stringBuffer = this.f133072h;
        if (stringBuffer != null) {
            e2.d(project, this.f133068d, stringBuffer.substring(0));
        }
        String str = this.f133075k;
        if (str != null) {
            project.i(str, this.f133068d);
        }
        this.f133073i = true;
    }

    public void s(Project project) {
        this.f133073i = false;
        q(project);
    }

    public synchronized void t(String str) {
        this.f133071g.remove(str);
    }

    public synchronized void u(String str, Object obj) {
        String string = null;
        if (str.equalsIgnoreCase(e2.f133123g)) {
            if (obj != null) {
                string = obj.toString();
            }
            this.f133074j = string;
        } else {
            if (this.f133071g == null) {
                this.f133071g = new LinkedHashMap<>();
            }
            if (!"refid".equalsIgnoreCase(str) || this.f133071g.isEmpty()) {
                this.f133071g.put(str, obj);
            } else {
                LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
                linkedHashMap.put(str, obj);
                linkedHashMap.putAll(this.f133071g);
                this.f133071g = linkedHashMap;
            }
            if ("id".equals(str)) {
                if (obj != null) {
                    string = obj.toString();
                }
                this.f133075k = string;
            }
        }
    }

    public synchronized void v(String str, String str2) {
        if (str.contains(":")) {
            this.f133070f = true;
        }
        u(str, str2);
    }

    @Deprecated
    public synchronized void w(AttributeList attributeList) {
        this.f133069e = new AttributeListImpl(attributeList);
        for (int i10 = 0; i10 < attributeList.getLength(); i10++) {
            v(attributeList.getName(i10), attributeList.getValue(i10));
        }
    }

    synchronized void x(i1.r rVar) {
    }

    public synchronized void y(String str) {
        this.f133066b = str;
    }

    public synchronized void z(String str) {
        this.f133074j = str;
    }
}
