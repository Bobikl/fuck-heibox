package org.apache.tools.ant.util;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/* JADX INFO: compiled from: SymbolicLinkUtils.java */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j0 f136858a = j0.O();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2 f136859b = new l2();

    protected l2() {
    }

    public static l2 c() {
        return f136859b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean j(String str, File file, String str2) {
        return str.equals(str2);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00e6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.io.File r17, org.apache.tools.ant.u2 r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tools.ant.util.l2.b(java.io.File, org.apache.tools.ant.u2):void");
    }

    public boolean d(File file) throws IOException {
        return e(file.getParentFile(), file.getName());
    }

    public boolean e(File file, String str) throws IOException {
        File file2 = new File(file, str);
        if (file2.exists()) {
            return false;
        }
        final String name = file2.getName();
        String[] list = file.list(new FilenameFilter() { // from class: org.apache.tools.ant.util.k2
            @Override // java.io.FilenameFilter
            public final boolean accept(File file3, String str2) {
                return l2.j(name, file3, str2);
            }
        });
        return list != null && list.length > 0;
    }

    public boolean f(String str) throws IOException {
        return d(new File(str));
    }

    public boolean g(File file) throws IOException {
        return h(file.getParentFile(), file.getName());
    }

    public boolean h(File file, String str) throws IOException {
        File file2 = file != null ? new File(file.getCanonicalPath(), str) : new File(str);
        return !file2.getAbsolutePath().equals(file2.getCanonicalPath());
    }

    public boolean i(String str) throws IOException {
        return g(new File(str));
    }
}
