package org.apache.tools.ant.types.resources;

import java.io.File;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: FileResourceIterator.java */
/* JADX INFO: loaded from: classes5.dex */
public class a0 implements Iterator<org.apache.tools.ant.types.s1> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Project f136324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f136325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String[] f136326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f136327e;

    @Deprecated
    public a0() {
        this.f136327e = 0;
    }

    @Deprecated
    public a0(File file) {
        this((Project) null, file);
    }

    @Deprecated
    public a0(File file, String[] strArr) {
        this(null, file, strArr);
    }

    public a0(Project project) {
        this.f136327e = 0;
        this.f136324b = project;
    }

    public a0(Project project, File file) {
        this(project);
        this.f136325c = file;
    }

    public a0(Project project, File file, String[] strArr) {
        this(project, file);
        a(strArr);
    }

    public void a(String[] strArr) {
        String[] strArr2 = this.f136326d;
        int length = strArr2 == null ? 0 : strArr2.length;
        String[] strArr3 = new String[strArr.length + length];
        if (length > 0) {
            System.arraycopy(strArr2, 0, strArr3, 0, length);
        }
        this.f136326d = strArr3;
        System.arraycopy(strArr, 0, strArr3, length, strArr.length);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public org.apache.tools.ant.types.s1 next() {
        return c();
    }

    public z c() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        File file = this.f136325c;
        String[] strArr = this.f136326d;
        int i10 = this.f136327e;
        this.f136327e = i10 + 1;
        z zVar = new z(file, strArr[i10]);
        zVar.J(this.f136324b);
        return zVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f136327e < this.f136326d.length;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
