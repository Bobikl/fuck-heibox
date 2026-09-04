package org.apache.tools.ant.types.selectors.modifiedselector;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Iterator;
import java.util.Properties;

/* JADX INFO: compiled from: PropertiesfileCache.java */
/* JADX INFO: loaded from: classes5.dex */
public class j implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f136583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Properties f136584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f136585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f136586d;

    public j() {
        this.f136583a = null;
        this.f136584b = new Properties();
        this.f136585c = false;
        this.f136586d = true;
    }

    public j(File file) {
        this.f136583a = null;
        this.f136584b = new Properties();
        this.f136585c = false;
        this.f136586d = true;
        this.f136583a = file;
    }

    @Override // org.apache.tools.ant.types.selectors.modifiedselector.b
    public void a() {
        File file = this.f136583a;
        if (file != null && file.isFile() && this.f136583a.canRead()) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(Files.newInputStream(this.f136583a.toPath(), new OpenOption[0]));
                try {
                    this.f136584b.load(bufferedInputStream);
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        this.f136585c = true;
        this.f136586d = false;
    }

    @Override // org.apache.tools.ant.types.selectors.modifiedselector.b
    public void b() {
        this.f136584b = new Properties();
        this.f136583a.delete();
        this.f136585c = true;
        this.f136586d = false;
    }

    public File c() {
        return this.f136583a;
    }

    public void d(File file) {
        this.f136583a = file;
    }

    @Override // org.apache.tools.ant.types.selectors.modifiedselector.b
    public void f() {
        if (this.f136586d) {
            if (this.f136583a != null && this.f136584b.propertyNames().hasMoreElements()) {
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(Files.newOutputStream(this.f136583a.toPath(), new OpenOption[0]));
                    try {
                        this.f136584b.store(bufferedOutputStream, (String) null);
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                    } catch (Throwable th2) {
                        try {
                            bufferedOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            this.f136586d = false;
        }
    }

    @Override // org.apache.tools.ant.types.selectors.modifiedselector.b
    public Object get(Object obj) {
        if (!this.f136585c) {
            a();
        }
        try {
            return this.f136584b.getProperty(String.valueOf(obj));
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // org.apache.tools.ant.types.selectors.modifiedselector.b
    public boolean isValid() {
        return this.f136583a != null;
    }

    @Override // org.apache.tools.ant.types.selectors.modifiedselector.b
    public Iterator<String> iterator() {
        return this.f136584b.stringPropertyNames().iterator();
    }

    @Override // org.apache.tools.ant.types.selectors.modifiedselector.b
    public void put(Object obj, Object obj2) {
        this.f136584b.put(String.valueOf(obj), String.valueOf(obj2));
        this.f136586d = true;
    }

    public String toString() {
        return String.format("<PropertiesfileCache:cachefile=%s;noOfEntries=%d>", this.f136583a, Integer.valueOf(this.f136584b.size()));
    }
}
