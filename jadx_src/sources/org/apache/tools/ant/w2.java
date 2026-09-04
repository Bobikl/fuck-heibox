package org.apache.tools.ant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: TaskConfigurationChecker.java */
/* JADX INFO: loaded from: classes5.dex */
public class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f137104a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u2 f137105b;

    public w2(u2 u2Var) {
        this.f137105b = u2Var;
    }

    public void a(boolean z10, String str) {
        if (z10) {
            return;
        }
        this.f137104a.add(str);
    }

    public void b() throws BuildException {
        if (this.f137104a.isEmpty()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.format("Configuration error on <%s>:%n", this.f137105b.K1()));
        Iterator<String> it = this.f137104a.iterator();
        while (it.hasNext()) {
            sb2.append(String.format("- %s%n", it.next()));
        }
        throw new BuildException(sb2.toString(), this.f137105b.w1());
    }

    public void c(String str) {
        this.f137104a.add(str);
    }
}
