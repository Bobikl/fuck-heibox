package org.apache.tools.ant.taskdefs.optional.depend;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: DirectoryIterator.java */
/* JADX INFO: loaded from: classes5.dex */
public class y implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Deque<Iterator<File>> f134830b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator<File> f134831c;

    public y(File file, boolean z10) throws IOException {
        this.f134831c = a(file).iterator();
    }

    private List<File> a(File file) {
        File[] fileArrListFiles = file.listFiles();
        return fileArrListFiles == null ? Collections.emptyList() : Arrays.asList(fileArrListFiles);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.e
    public c C1() {
        c cVar = null;
        while (cVar == null) {
            try {
                if (this.f134831c.hasNext()) {
                    File next = this.f134831c.next();
                    if (next.isDirectory()) {
                        this.f134830b.push(this.f134831c);
                        this.f134831c = a(next).iterator();
                    } else {
                        InputStream inputStreamNewInputStream = Files.newInputStream(next.toPath(), new OpenOption[0]);
                        try {
                            if (next.getName().endsWith(".class")) {
                                cVar = new c();
                                cVar.c(inputStreamNewInputStream);
                            }
                            if (inputStreamNewInputStream != null) {
                                inputStreamNewInputStream.close();
                            }
                        } catch (Throwable th2) {
                            if (inputStreamNewInputStream != null) {
                                try {
                                    inputStreamNewInputStream.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                            throw th2;
                        }
                    }
                } else {
                    if (this.f134830b.isEmpty()) {
                        break;
                    }
                    this.f134831c = this.f134830b.pop();
                }
            } catch (IOException unused) {
                return null;
            }
        }
        return cVar;
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.e, java.lang.Iterable
    public /* synthetic */ Iterator<c> iterator() {
        return d.a(this);
    }
}
