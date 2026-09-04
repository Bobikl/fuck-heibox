package org.apache.tools.ant.taskdefs.condition;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.util.h2;

/* JADX INFO: compiled from: Or.java */
/* JADX INFO: loaded from: classes5.dex */
public class y extends e implements d {
    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        return h2.a(b2()).anyMatch(new a());
    }
}
