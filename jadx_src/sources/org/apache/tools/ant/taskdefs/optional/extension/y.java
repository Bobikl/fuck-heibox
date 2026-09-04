package org.apache.tools.ant.taskdefs.optional.extension;

import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.j1;
import org.apache.tools.ant.u2;

/* JADX INFO: compiled from: JarLibManifestTask.java */
/* JADX INFO: loaded from: classes5.dex */
public final class y extends u2 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f135090p = "1.0";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f135091q = "Created-By";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private File f135092k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private j f135093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<m> f135094m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<m> f135095n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List<q> f135096o = new ArrayList();

    private void o2(Attributes attributes, Attributes.Name name, final String str, int i10) {
        attributes.put(name, IntStream.range(0, i10).mapToObj(new IntFunction() { // from class: org.apache.tools.ant.taskdefs.optional.extension.x
            @Override // java.util.function.IntFunction
            public final Object apply(int i11) {
                return y.r2(str, i11);
            }
        }).collect(Collectors.joining(" ")));
    }

    private void p2(Attributes attributes) {
        for (q qVar : this.f135096o) {
            attributes.putValue(qVar.a(), qVar.b());
        }
    }

    private void q2(Attributes attributes, String str, List<j> list) throws BuildException {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            j.d(list.get(i10), str + i10 + Constants.ACCEPT_TIME_SEPARATOR_SERVER, attributes);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String r2(String str, int i10) {
        return str + i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j[] s2(Project project, m mVar) {
        return mVar.i2(project);
    }

    private List<j> u2(List<m> list) throws BuildException {
        final Project projectB = b();
        return (List) list.stream().map(new Function() { // from class: org.apache.tools.ant.taskdefs.optional.extension.w
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return y.s2(projectB, (m) obj);
            }
        }).flatMap(new s()).collect(Collectors.toList());
    }

    private void v2() throws BuildException {
        File file = this.f135092k;
        if (file == null) {
            throw new BuildException("Destfile attribute not specified.");
        }
        if (file.exists() && !this.f135092k.isFile()) {
            throw new BuildException("%s is not a file.", this.f135092k);
        }
    }

    private void w2(Manifest manifest) throws IOException {
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(this.f135092k.toPath(), new OpenOption[0]);
        try {
            manifest.write(outputStreamNewOutputStream);
            outputStreamNewOutputStream.flush();
            outputStreamNewOutputStream.close();
        } catch (Throwable th2) {
            if (outputStreamNewOutputStream != null) {
                try {
                    outputStreamNewOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        v2();
        Manifest manifest = new Manifest();
        Attributes mainAttributes = manifest.getMainAttributes();
        mainAttributes.put(Attributes.Name.MANIFEST_VERSION, "1.0");
        mainAttributes.putValue(f135091q, "Apache Ant " + b().u0(j1.f133478b));
        p2(mainAttributes);
        j jVar = this.f135093l;
        if (jVar != null) {
            j.e(jVar, mainAttributes);
        }
        List<j> listU2 = u2(this.f135094m);
        o2(mainAttributes, j.f135048h, "lib", listU2.size());
        q2(mainAttributes, "lib", listU2);
        List<j> listU3 = u2(this.f135095n);
        o2(mainAttributes, j.f135049i, "opt", listU3.size());
        q2(mainAttributes, "opt", listU3);
        try {
            x1("Generating manifest " + this.f135092k.getAbsoluteFile(), 2);
            w2(manifest);
        } catch (IOException e10) {
            throw new BuildException(e10.getMessage(), e10);
        }
    }

    public void k2(q qVar) {
        this.f135096o.add(qVar);
    }

    public void l2(m mVar) {
        this.f135094m.add(mVar);
    }

    public void m2(k kVar) throws BuildException {
        if (this.f135093l != null) {
            throw new BuildException("Can not have multiple extensions defined in one library.");
        }
        this.f135093l = kVar.m2();
    }

    public void n2(m mVar) {
        this.f135095n.add(mVar);
    }

    public void t2(File file) {
        this.f135092k = file;
    }
}
