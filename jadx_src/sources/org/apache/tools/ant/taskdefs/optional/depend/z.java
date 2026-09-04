package org.apache.tools.ant.taskdefs.optional.depend;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: JarFileIterator.java */
/* JADX INFO: loaded from: classes5.dex */
public class z implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ZipInputStream f134832b;

    public z(InputStream inputStream) throws IOException {
        this.f134832b = new ZipInputStream(inputStream);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.e
    public c C1() {
        try {
            ZipEntry nextEntry = this.f134832b.getNextEntry();
            c cVar = null;
            while (cVar == null && nextEntry != null) {
                String name = nextEntry.getName();
                if (nextEntry.isDirectory() || !name.endsWith(".class")) {
                    nextEntry = this.f134832b.getNextEntry();
                } else {
                    cVar = new c();
                    cVar.c(this.f134832b);
                }
            }
            return cVar;
        } catch (IOException e10) {
            String message = e10.getMessage();
            String name2 = e10.getClass().getName();
            if (message != null) {
                name2 = name2 + ": " + message;
            }
            throw new BuildException("Problem reading JAR file: " + name2);
        }
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.e, java.lang.Iterable
    public /* synthetic */ Iterator<c> iterator() {
        return d.a(this);
    }
}
