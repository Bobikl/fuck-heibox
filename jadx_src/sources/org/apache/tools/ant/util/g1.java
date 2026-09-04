package org.apache.tools.ant.util;

import java.io.ByteArrayOutputStream;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: PropertyOutputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public class g1 extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Project f136781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f136782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f136783d;

    public g1(Project project, String str) {
        this(project, str, true);
    }

    public g1(Project project, String str, boolean z10) {
        this.f136781b = project;
        this.f136782c = str;
        this.f136783d = z10;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f136781b == null || this.f136782c == null) {
            return;
        }
        String str = new String(toByteArray());
        Project project = this.f136781b;
        String str2 = this.f136782c;
        if (this.f136783d) {
            str = str.trim();
        }
        project.n1(str2, str);
    }
}
