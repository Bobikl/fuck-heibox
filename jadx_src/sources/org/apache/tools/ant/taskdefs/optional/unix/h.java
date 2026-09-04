package org.apache.tools.ant.taskdefs.optional.unix;

import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.optional.o;
import org.apache.tools.ant.taskdefs.r3;
import org.apache.tools.ant.types.b0;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.v0;

/* JADX INFO: compiled from: Symlink.java */
/* JADX INFO: loaded from: classes5.dex */
public class h extends nj.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f135424l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f135425m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f135427o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f135428p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f135429q;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<b0> f135426n = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f135430r = false;

    private Properties A2(List<b0> list) {
        Properties properties = new Properties();
        for (b0 b0Var : list) {
            v0 v0Var = new v0();
            b0Var.b3(v0Var, b());
            v0Var.L0(false);
            v0Var.e();
            File fileZ2 = b0Var.z2(b());
            for (String str : v0Var.m()) {
                File file = new File(fileZ2, str);
                File parentFile = file.getParentFile();
                Properties properties2 = new Properties();
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(Files.newInputStream(file.toPath(), new OpenOption[0]));
                    try {
                        properties2.load(bufferedInputStream);
                        File canonicalFile = parentFile.getCanonicalFile();
                        bufferedInputStream.close();
                        try {
                            properties2.store(new PrintStream(new r3((u2) this, 2)), "listing properties");
                        } catch (IOException unused) {
                            log("failed to log unshortened properties");
                            properties2.list(new PrintStream(new r3((u2) this, 2)));
                        }
                        for (String str2 : properties2.stringPropertyNames()) {
                            properties.put(new File(canonicalFile, str2).getAbsolutePath(), properties2.getProperty(str2));
                        }
                    } catch (Throwable th2) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (FileNotFoundException unused2) {
                    v2("Unable to find " + str + "; skipping it.");
                } catch (IOException unused3) {
                    v2("Unable to open " + str + " or its parent dir; skipping it.");
                }
            }
        }
        return properties;
    }

    private void D2() {
        this.f135424l = null;
        this.f135425m = null;
        this.f135427o = null;
        this.f135429q = true;
        this.f135428p = false;
        j2(FilterGroup.TYPE_SINGLE);
        this.f135426n.clear();
    }

    private void K2(Properties properties, File file) throws BuildException {
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(Files.newOutputStream(new File(file, this.f135427o).toPath(), new OpenOption[0]));
            try {
                properties.store(bufferedOutputStream, "Symlinks from " + file);
                bufferedOutputStream.close();
            } catch (Throwable th2) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new BuildException(e10, w1());
        }
    }

    private static void q2(Path path) throws IOException {
        if (path.toFile().delete()) {
            return;
        }
        throw new IOException("Could not delete symlink at " + path);
    }

    @Deprecated
    public static void r2(File file) throws IOException {
        if (Files.isSymbolicLink(file.toPath())) {
            q2(file.toPath());
        }
    }

    @Deprecated
    public static void s2(String str) throws IOException {
        r2(Paths.get(str, new String[0]).toFile());
    }

    private void t2(String str, String str2) throws BuildException {
        Path path = Paths.get(str2, new String[0]);
        Path path2 = Paths.get(str, new String[0]);
        if (!Files.exists(path, LinkOption.NOFOLLOW_LINKS)) {
            try {
                x1("creating symlink " + path + " -> " + path2, 4);
                Files.createSymbolicLink(path, path2, new FileAttribute[0]);
                return;
            } catch (IOException e10) {
                if (this.f135429q) {
                    throw new BuildException("Failed to create symlink " + str2 + " to target " + str, e10);
                }
                X1("Unable to create symlink " + str2 + " to target " + str, e10, 2);
                return;
            }
        }
        if (!this.f135428p) {
            x1("Skipping symlink creation, since file at " + str2 + " already exists and overwrite is set to false", 2);
            return;
        }
        if (!path.toFile().delete()) {
            v2("Deletion of file at " + str2 + " failed, while trying to overwrite it with a symlink");
            return;
        }
        try {
            x1("creating symlink " + path + " -> " + path2 + " after removing original", 4);
            Files.createSymbolicLink(path, path2, new FileAttribute[0]);
        } catch (IOException e11) {
            if (this.f135429q) {
                throw new BuildException("Failed to create symlink " + str2 + " to target " + str, e11);
            }
            X1("Unable to create symlink " + str2 + " to target " + str, e11, 2);
        }
    }

    private Set<File> u2(List<b0> list) {
        final HashSet hashSet = new HashSet();
        for (b0 b0Var : list) {
            v0 v0VarB2 = b0Var.B2(b());
            final File fileZ2 = b0Var.z2(b());
            Stream.of((Object[]) new String[][]{v0VarB2.m(), v0VarB2.j()}).flatMap(new o()).forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.optional.unix.e
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f135419b.w2(fileZ2, hashSet, (String) obj);
                }
            });
        }
        return hashSet;
    }

    private void v2(String str) {
        if (this.f135429q) {
            throw new BuildException(str);
        }
        log(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w2(File file, Set set, String str) {
        try {
            File file2 = new File(file, str);
            File file3 = new File(file2.getParentFile().getCanonicalPath(), file2.getName());
            if (Files.isSymbolicLink(file3.toPath())) {
                set.add(file3);
            }
        } catch (IOException unused) {
            v2("IOException: " + str + " omitted");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List x2(File file) {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y2(Map map, File file) {
        ((List) map.computeIfAbsent(file.getParentFile(), new Function() { // from class: org.apache.tools.ant.taskdefs.optional.unix.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return h.x2((File) obj);
            }
        })).add(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z2(File file, List list) {
        Properties properties = new Properties();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file2 = (File) it.next();
            try {
                properties.put(file2.getName(), file2.getCanonicalPath());
            } catch (IOException unused) {
                v2("Couldn't get canonical name of parent link");
            }
        }
        K2(properties, file);
    }

    public void B2() throws BuildException {
        try {
            if (this.f135426n.isEmpty()) {
                v2("Fileset identifying links to record required");
            } else {
                if (this.f135427o == null) {
                    v2("Name of file to record links in required");
                    return;
                }
                final HashMap map = new HashMap();
                u2(this.f135426n).forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.optional.unix.f
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        h.y2(map, (File) obj);
                    }
                });
                map.forEach(new BiConsumer() { // from class: org.apache.tools.ant.taskdefs.optional.unix.g
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        this.f135423a.z2((File) obj, (List) obj2);
                    }
                });
            }
        } finally {
            D2();
        }
    }

    public void C2() throws BuildException {
        try {
            if (this.f135426n.isEmpty()) {
                v2("File set identifying link file(s) required for action recreate");
                D2();
                return;
            }
            Properties propertiesA2 = A2(this.f135426n);
            for (String str : propertiesA2.stringPropertyNames()) {
                String property = propertiesA2.getProperty(str);
                try {
                    if (Files.isSymbolicLink(Paths.get(str, new String[0])) && new File(str).getCanonicalPath().equals(new File(property).getCanonicalPath())) {
                        x1("not recreating " + str + " as it points to the correct target already", 4);
                    } else {
                        t2(property, str);
                    }
                } catch (IOException e10) {
                    String str2 = "Failed to check if path " + str + " is a symbolic link, linking to " + property;
                    if (this.f135429q) {
                        throw new BuildException(str2, e10);
                    }
                    x1(str2, 2);
                }
            }
            D2();
        } catch (Throwable th2) {
            D2();
            throw th2;
        }
    }

    @Override // org.apache.tools.ant.u2
    public synchronized void D1() throws BuildException {
        if (this.f135430r) {
            throw new BuildException("Infinite recursion detected in Symlink.execute()");
        }
        try {
            this.f135430r = true;
            nj.b.a(this);
            this.f135430r = false;
        } catch (Throwable th2) {
            this.f135430r = false;
            throw th2;
        }
    }

    public void E2(boolean z10) {
        this.f135429q = z10;
    }

    public void F2(String str) {
        this.f135425m = str;
    }

    public void G2(String str) {
        this.f135427o = str;
    }

    public void H2(boolean z10) {
        this.f135428p = z10;
    }

    public void I2(String str) {
        this.f135424l = str;
    }

    public void J2() throws BuildException {
        try {
            String str = this.f135424l;
            if (str == null) {
                v2("Must define the resource to symlink to!");
                return;
            }
            String str2 = this.f135425m;
            if (str2 == null) {
                v2("Must define the link name for symlink!");
            } else {
                t2(str, str2);
            }
        } finally {
            D2();
        }
    }

    @Override // org.apache.tools.ant.u2
    public void V1() throws BuildException {
        super.V1();
        D2();
    }

    @Override // nj.a
    public void j2(String str) {
        super.j2(str);
    }

    public void o2(b0 b0Var) {
        this.f135426n.add(b0Var);
    }

    public void p2() throws BuildException {
        try {
            try {
                String str = this.f135425m;
                if (str == null) {
                    v2("Must define the link name for symlink!");
                    return;
                }
                Path path = Paths.get(str, new String[0]);
                if (Files.isSymbolicLink(path)) {
                    log("Removing symlink: " + this.f135425m);
                    q2(path);
                    return;
                }
                x1("Skipping deletion of " + path + " since it's not a symlink", 3);
            } catch (IOException e10) {
                v2(e10.getMessage());
            }
        } finally {
            D2();
        }
    }
}
