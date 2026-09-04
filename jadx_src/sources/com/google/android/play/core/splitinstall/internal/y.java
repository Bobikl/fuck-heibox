package com.google.android.play.core.splitinstall.internal;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class y implements n {
    y() {
    }

    public static void c(ClassLoader classLoader, Set set, x xVar) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((File) it.next()).getParentFile());
        }
        Object objC = t.c(classLoader);
        j0 j0VarB = k0.b(objC, "nativeLibraryDirectories", List.class);
        synchronized (com.google.android.play.core.splitinstall.b1.class) {
            ArrayList arrayList = new ArrayList((Collection) j0VarB.a());
            hashSet.removeAll(arrayList);
            arrayList.addAll(hashSet);
            j0VarB.c(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Object[] objArrA = xVar.a(objC, new ArrayList(hashSet), null, arrayList2);
        if (arrayList2.isEmpty()) {
            synchronized (com.google.android.play.core.splitinstall.b1.class) {
                k0.a(objC, "nativeLibraryPathElements", Object.class).e(Arrays.asList(objArrA));
            }
            return;
        }
        zzbh zzbhVar = new zzbh("Error in makePathElements");
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, (IOException) arrayList2.get(i10));
            } catch (Exception unused) {
            }
        }
        throw zzbhVar;
    }

    public static boolean d(ClassLoader classLoader, File file, File file2, boolean z10, String str) {
        return t.e(classLoader, file, file2, z10, new v(), "zip", new q());
    }

    @Override // com.google.android.play.core.splitinstall.internal.n
    public final void a(ClassLoader classLoader, Set set) {
        c(classLoader, set, new w());
    }

    @Override // com.google.android.play.core.splitinstall.internal.n
    public final boolean b(ClassLoader classLoader, File file, File file2, boolean z10) {
        return d(classLoader, file, file2, z10, "zip");
    }
}
