package org.apache.tools.ant.types.optional;

import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: ScriptCondition.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends a implements org.apache.tools.ant.taskdefs.condition.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f136252g = false;

    public boolean U1() {
        return this.f136252g;
    }

    public void V1(boolean z10) {
        this.f136252g = z10;
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        I1();
        G1("ant_condition");
        return U1();
    }
}
