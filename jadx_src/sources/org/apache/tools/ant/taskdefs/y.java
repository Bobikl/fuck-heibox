package org.apache.tools.ant.taskdefs;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: BindTargets.java */
/* JADX INFO: loaded from: classes5.dex */
public class y extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f135935k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<String> f135936l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private org.apache.tools.ant.e2.a f135937m;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean j2(String str) {
        return !str.isEmpty();
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (this.f135935k == null) {
            throw new BuildException("extensionPoint required", w1());
        }
        if (G1() == null || !G1().k().isEmpty()) {
            throw new BuildException("bindtargets only allowed as a top-level task");
        }
        if (this.f135937m == null) {
            this.f135937m = org.apache.tools.ant.e2.a.f133133b;
        }
        org.apache.tools.ant.e2 e2Var = (org.apache.tools.ant.e2) b().w0("ant.projectHelper");
        Iterator<String> it = this.f135936l.iterator();
        while (it.hasNext()) {
            e2Var.q().add(new String[]{this.f135935k, it.next(), this.f135937m.a()});
        }
    }

    public void k2(String str) {
        this.f135935k = str;
    }

    public void l2(String str) {
        try {
            this.f135937m = org.apache.tools.ant.e2.a.b(str);
        } catch (IllegalArgumentException unused) {
            throw new BuildException("Invalid onMissingExtensionPoint: " + str);
        }
    }

    public void m2(org.apache.tools.ant.e2.a aVar) {
        this.f135937m = aVar;
    }

    public void n2(String str) {
        Stream streamFilter = Stream.of((Object[]) str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)).map(new v()).filter(new Predicate() { // from class: org.apache.tools.ant.taskdefs.w
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return y.j2((String) obj);
            }
        });
        List<String> list = this.f135936l;
        Objects.requireNonNull(list);
        streamFilter.forEach(new x(list));
    }
}
