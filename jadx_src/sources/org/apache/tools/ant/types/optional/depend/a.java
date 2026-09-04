package org.apache.tools.ant.types.optional.depend;

import com.tencent.qcloud.core.util.IOUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.b0;
import org.apache.tools.ant.types.s;
import org.apache.tools.ant.util.j2;
import org.apache.tools.ant.v0;

/* JADX INFO: compiled from: ClassfileSet.java */
/* JADX INFO: loaded from: classes5.dex */
public class a extends b0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<String> f136257r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private List<b0> f136258s;

    /* JADX INFO: renamed from: org.apache.tools.ant.types.optional.depend.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ClassfileSet.java */
    public static class C1237a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f136259a;

        public String a() {
            return this.f136259a;
        }

        public void b(String str) {
            this.f136259a = str;
        }
    }

    public a() {
        this.f136257r = new ArrayList();
        this.f136258s = new ArrayList();
    }

    protected a(a aVar) {
        super(aVar);
        this.f136257r = new ArrayList();
        this.f136258s = new ArrayList();
        this.f136257r.addAll(aVar.f136257r);
    }

    private a f3() {
        return (a) O1(a.class);
    }

    @Override // org.apache.tools.ant.types.i
    public v0 B2(Project project) {
        if (Y1()) {
            return E2(project).B2(project);
        }
        K1(project);
        i iVar = new i(super.B2(project));
        Vector<String> vector = new Vector<>(this.f136257r);
        for (b0 b0Var : this.f136258s) {
            for (String str : b0Var.B2(project).m()) {
                if (str.endsWith(".class")) {
                    vector.addElement(j2.i(str, ".class").replace(IOUtils.DIR_SEPARATOR_UNIX, lg.a.f131414g).replace(IOUtils.DIR_SEPARATOR_WINDOWS, lg.a.f131414g));
                }
            }
            iVar.T0(b0Var.z2(project));
        }
        iVar.p(z2(project));
        iVar.Y0(vector);
        iVar.e();
        return iVar;
    }

    @Override // org.apache.tools.ant.types.i, org.apache.tools.ant.types.s
    protected synchronized void I1(Stack<Object> stack, Project project) {
        if (X1()) {
            return;
        }
        super.I1(stack, project);
        if (!Y1()) {
            Iterator<b0> it = this.f136258s.iterator();
            while (it.hasNext()) {
                s.a2(it.next(), stack, project);
            }
            b2(true);
        }
    }

    @Override // org.apache.tools.ant.types.b0, org.apache.tools.ant.types.i, org.apache.tools.ant.types.s, org.apache.tools.ant.b2
    public Object clone() {
        return new a(Y1() ? f3() : this);
    }

    public void d3(C1237a c1237a) {
        this.f136257r.add(c1237a.a());
    }

    public void e3(b0 b0Var) {
        this.f136258s.add(b0Var);
        b2(false);
    }

    public void g3(String str) {
        this.f136257r.add(str);
    }
}
