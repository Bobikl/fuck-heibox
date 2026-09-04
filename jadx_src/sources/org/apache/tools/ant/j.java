package org.apache.tools.ant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ArgumentProcessorRegistry.java */
/* JADX INFO: loaded from: classes5.dex */
public class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f133472d = "META-INF/services/org.apache.tools.ant.ArgumentProcessor";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<i> f133474a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f133470b = "ant.argument-processor-repo.debug";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f133471c = "true".equals(System.getProperty(f133470b));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static j f133473e = new j();

    private j() {
        a();
    }

    private void a() {
        try {
            ClassLoader classLoaderD = org.apache.tools.ant.util.a1.d();
            if (classLoaderD != null) {
                Iterator it = Collections.list(classLoaderD.getResources(f133472d)).iterator();
                while (it.hasNext()) {
                    URLConnection uRLConnectionOpenConnection = ((URL) it.next()).openConnection();
                    uRLConnectionOpenConnection.setUseCaches(false);
                    i(e(uRLConnectionOpenConnection.getInputStream()));
                }
            }
            InputStream systemResourceAsStream = ClassLoader.getSystemResourceAsStream(f133472d);
            if (systemResourceAsStream != null) {
                i(e(systemResourceAsStream));
            }
        } catch (Exception e10) {
            System.err.println("Unable to load ArgumentProcessor from service META-INF/services/org.apache.tools.ant.ArgumentProcessor (" + e10.getClass().getName() + ": " + e10.getMessage() + ")");
            if (f133471c) {
                e10.printStackTrace(System.err);
            }
        }
    }

    public static j b() {
        return f133473e;
    }

    private i c(Class<? extends i> cls) {
        try {
            return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e10) {
            throw new BuildException("The argument processor class" + cls.getName() + " could not be instantiated with a default constructor", e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private i d(String str) {
        try {
            return c(Class.forName(str));
        } catch (ClassNotFoundException e10) {
            throw new BuildException("Argument processor class " + str + " was not found", e10);
        }
    }

    private i e(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        try {
            String line = bufferedReader.readLine();
            if (line == null || line.isEmpty()) {
                bufferedReader.close();
                return null;
            }
            i iVarD = d(line);
            bufferedReader.close();
            return iVarD;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public List<i> f() {
        return this.f133474a;
    }

    public void g(Class<? extends i> cls) throws BuildException {
        i(c(cls));
    }

    public void h(String str) throws BuildException {
        i(d(str));
    }

    public void i(i iVar) {
        if (iVar == null) {
            return;
        }
        this.f133474a.add(iVar);
        if (f133471c) {
            System.out.println("Argument processor " + iVar.getClass().getName() + " registered.");
        }
    }
}
