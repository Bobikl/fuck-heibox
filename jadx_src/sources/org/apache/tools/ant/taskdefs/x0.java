package org.apache.tools.ant.taskdefs;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: DefaultExcludes.java */
/* JADX INFO: loaded from: classes5.dex */
public class x0 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f135927k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f135928l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f135929m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f135930n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f135931o = 1;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String j2(String str) {
        return String.format("  %s%n", str);
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (!this.f135929m && this.f135927k.isEmpty() && this.f135928l.isEmpty() && !this.f135930n) {
            throw new BuildException("<defaultexcludes> task must set at least one attribute (echo=\"false\" doesn't count since that is the default");
        }
        if (this.f135929m) {
            org.apache.tools.ant.v0.G0();
        }
        if (!this.f135927k.isEmpty()) {
            org.apache.tools.ant.v0.J(this.f135927k);
        }
        if (!this.f135928l.isEmpty()) {
            org.apache.tools.ant.v0.F0(this.f135928l);
        }
        if (this.f135930n) {
            x1((String) Arrays.stream(org.apache.tools.ant.v0.V()).map(new Function() { // from class: org.apache.tools.ant.taskdefs.w0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return x0.j2((String) obj);
                }
            }).collect(Collectors.joining("", "Current Default Excludes:%n", "")), this.f135931o);
        }
    }

    public void k2(String str) {
        this.f135927k = str;
    }

    public void l2(boolean z10) {
        this.f135929m = z10;
    }

    public void m2(boolean z10) {
        this.f135930n = z10;
    }

    public void n2(String str) {
        this.f135928l = str;
    }
}
