package com.bumptech.glide.disklrucache;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f40655a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f40656b = Charset.forName("UTF-8");

    private d() {
    }

    static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    static void b(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                b(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }

    static String c(Reader reader) throws IOException {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int i10 = reader.read(cArr);
                if (i10 == -1) {
                    return stringWriter.toString();
                }
                stringWriter.write(cArr, 0, i10);
            }
        } finally {
            reader.close();
        }
    }
}
