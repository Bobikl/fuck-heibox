package org.apache.tools.ant.taskdefs.optional.script;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.j1;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.y0;

/* JADX INFO: compiled from: ScriptDefBase.java */
/* JADX INFO: loaded from: classes5.dex */
public class c extends u2 implements y0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map<String, List<Object>> f135334k = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, String> f135335l = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f135336m;

    private a l2() {
        String strL1 = L1();
        Map map = (Map) b().w0(j1.f133480d);
        if (map == null) {
            throw new BuildException("Script repository not found for " + strL1);
        }
        a aVar = (a) map.get(L1());
        if (aVar != null) {
            return aVar;
        }
        throw new BuildException("Script definition not found for " + strL1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List n2(String str) {
        return new ArrayList();
    }

    @Override // org.apache.tools.ant.u2
    public void D1() {
        l2().E2(this.f135335l, this.f135334k, this);
    }

    @Override // org.apache.tools.ant.a1
    public Object J0(String str) {
        List list = (List) this.f135334k.computeIfAbsent(str, new Function() { // from class: org.apache.tools.ant.taskdefs.optional.script.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return c.n2((String) obj);
            }
        });
        Object objC2 = l2().C2(str);
        list.add(objC2);
        return objC2;
    }

    public void j2(String str) {
        this.f135336m = b().V0(str);
    }

    public void k2(String str) {
        throw new BuildException(str);
    }

    public String m2() {
        return this.f135336m;
    }

    @Override // org.apache.tools.ant.w0
    public void r0(String str, String str2) {
        if (!l2().F2(str)) {
            throw new BuildException("<%s> does not support the \"%s\" attribute", L1(), str);
        }
        this.f135335l.put(str, str2);
    }
}
