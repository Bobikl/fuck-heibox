package com.github.penfeizhou.animation.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: FileReader.java */
/* JADX INFO: loaded from: classes6.dex */
public class c extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f43312c;

    public c(File file) throws IOException {
        super(new f(new FileInputStream(file)));
        this.f43312c = file;
    }

    @Override // com.github.penfeizhou.animation.io.d, com.github.penfeizhou.animation.io.e
    public void reset() throws IOException {
        this.f43313b.close();
        this.f43313b = new f(new FileInputStream(this.f43312c));
    }
}
