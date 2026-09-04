package org.apache.tools.ant.taskdefs.optional.ejb;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: compiled from: InnerClassFilenameFilter.java */
/* JADX INFO: loaded from: classes5.dex */
public class p implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f135007a;

    p(String str) {
        int iLastIndexOf = str.lastIndexOf(".class");
        this.f135007a = str.substring(0, iLastIndexOf == -1 ? str.length() - 1 : iLastIndexOf);
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        if (str.lastIndexOf(46) == str.lastIndexOf(".class")) {
            if (str.indexOf(this.f135007a + "$") == 0) {
                return true;
            }
        }
        return false;
    }
}
