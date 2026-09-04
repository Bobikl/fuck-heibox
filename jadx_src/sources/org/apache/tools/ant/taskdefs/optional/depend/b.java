package org.apache.tools.ant.taskdefs.optional.depend;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import java.util.function.Predicate;
import org.apache.tools.ant.taskdefs.s6;
import org.apache.tools.ant.types.resources.x1;

/* JADX INFO: compiled from: AntAnalyzer.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends org.apache.tools.ant.util.depend.a {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean p(Set set, String str) {
        return !set.contains(str);
    }

    @Override // org.apache.tools.ant.util.depend.a
    protected void j(Vector<File> vector, Vector<String> vector2) {
        final HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet<String> hashSet3 = new HashSet(Collections.list(l()));
        HashSet hashSet4 = new HashSet();
        int i10 = m() ? 1000 : 1;
        int i11 = 0;
        while (!hashSet3.isEmpty()) {
            int i12 = i11 + 1;
            if (i11 >= i10) {
                break;
            }
            hashSet4.clear();
            for (String str : hashSet3) {
                hashSet.add(str);
                File fileA = null;
                try {
                    fileA = a(str);
                } catch (IOException unused) {
                }
                if (fileA != null) {
                    hashSet2.add(fileA);
                    try {
                        InputStream inputStreamNewInputStream = fileA.getName().endsWith(".class") ? Files.newInputStream(Paths.get(fileA.getPath(), new String[0]), new OpenOption[0]) : x1.I2(new org.apache.tools.zip.x(fileA.getPath(), "UTF-8"), str.replace(lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX) + ".class");
                        try {
                            c cVar = new c();
                            cVar.c(inputStreamNewInputStream);
                            hashSet4.addAll(cVar.a());
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
                    } catch (IOException unused2) {
                        continue;
                    }
                }
            }
            hashSet3.clear();
            hashSet4.stream().filter(new Predicate() { // from class: org.apache.tools.ant.taskdefs.optional.depend.a
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return b.p(hashSet, (String) obj);
                }
            }).forEach(new s6(hashSet3));
            i11 = i12;
        }
        hashSet.addAll(hashSet4);
        vector.removeAllElements();
        vector.addAll(hashSet2);
        vector2.removeAllElements();
        vector2.addAll(hashSet);
    }

    @Override // org.apache.tools.ant.util.depend.a
    protected boolean n() {
        return true;
    }
}
