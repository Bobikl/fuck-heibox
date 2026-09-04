package org.apache.tools.ant.types.resources;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.util.p2;

/* JADX INFO: compiled from: Tokens.java */
/* JADX INFO: loaded from: classes5.dex */
public class n1 extends r {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private p2 f136394k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f136395l;

    @Override // org.apache.tools.ant.types.resources.c, org.apache.tools.ant.types.s
    protected synchronized void I1(Stack<Object> stack, Project project) throws BuildException {
        if (X1()) {
            return;
        }
        super.I1(stack, project);
        if (!Y1()) {
            Object obj = this.f136394k;
            if (obj instanceof org.apache.tools.ant.types.s) {
                org.apache.tools.ant.types.s.a2((org.apache.tools.ant.types.s) obj, stack, project);
            }
            b2(true);
        }
    }

    @Override // org.apache.tools.ant.types.resources.r
    protected synchronized Collection<org.apache.tools.ant.types.s1> n2() {
        org.apache.tools.ant.types.u1 u1VarH2 = h2();
        if (u1VarH2.isEmpty()) {
            return Collections.emptySet();
        }
        if (this.f136394k == null) {
            this.f136394k = new org.apache.tools.ant.util.z0();
        }
        try {
            org.apache.tools.ant.util.u uVar = new org.apache.tools.ant.util.u(u1VarH2);
            try {
                String str = this.f136395l;
                InputStreamReader inputStreamReader = new InputStreamReader(uVar, str == null ? Charset.defaultCharset() : Charset.forName(str));
                try {
                    uVar.g(this);
                    ArrayList arrayList = new ArrayList();
                    String strH = this.f136394k.h(inputStreamReader);
                    while (strH != null) {
                        l1 l1Var = new l1(strH);
                        l1Var.J(b());
                        arrayList.add(l1Var);
                        strH = this.f136394k.h(inputStreamReader);
                    }
                    inputStreamReader.close();
                    uVar.close();
                    return arrayList;
                } catch (Throwable th2) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    uVar.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException e10) {
            throw new BuildException("Error reading tokens", e10);
        }
    }

    public synchronized void o2(p2 p2Var) {
        if (Y1()) {
            throw Z1();
        }
        if (this.f136394k != null) {
            throw new BuildException("Only one nested tokenizer allowed.");
        }
        this.f136394k = p2Var;
        b2(false);
    }

    public synchronized void p2(String str) {
        this.f136395l = str;
    }
}
