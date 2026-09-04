package com.google.android.play.core.splitinstall.internal;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class t implements n {
    t() {
    }

    static Object c(ClassLoader classLoader) {
        return k0.b(classLoader, "pathList", Object.class).a();
    }

    static void d(ClassLoader classLoader, Set set) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            Log.d("Splitcompat", "Adding native library parent directory: ".concat(String.valueOf(file.getParentFile().getAbsolutePath())));
            hashSet.add(file.getParentFile());
        }
        i0 i0VarA = k0.a(c(classLoader), "nativeLibraryDirectories", File.class);
        hashSet.removeAll(Arrays.asList((File[]) i0VarA.a()));
        synchronized (com.google.android.play.core.splitinstall.b1.class) {
            Log.d("Splitcompat", "Adding directories " + hashSet.size());
            i0VarA.e(hashSet);
        }
    }

    static boolean e(ClassLoader classLoader, File file, File file2, boolean z10, s sVar, String str, r rVar) {
        ArrayList arrayList = new ArrayList();
        Object objC = c(classLoader);
        i0 i0VarA = k0.a(objC, "dexElements", Object.class);
        List listAsList = Arrays.asList((Object[]) i0VarA.a());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList2.add((File) k0.b(it.next(), str, File.class).a());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (!z10 && !rVar.a(objC, file2, file)) {
            Log.w("SplitCompat", "Should be optimized ".concat(String.valueOf(file2.getPath())));
            return false;
        }
        i0VarA.d(Arrays.asList(sVar.a(objC, new ArrayList(Collections.singleton(file2)), file, arrayList)));
        if (arrayList.isEmpty()) {
            return true;
        }
        zzbh zzbhVar = new zzbh("DexPathList.makeDexElement failed");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            IOException iOException = (IOException) arrayList.get(i10);
            Log.e("SplitCompat", "DexPathList.makeDexElement failed", iOException);
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, iOException);
            } catch (Exception unused) {
            }
        }
        k0.a(objC, "dexElementsSuppressedExceptions", IOException.class).d(arrayList);
        throw zzbhVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.n
    public final void a(ClassLoader classLoader, Set set) {
        d(classLoader, set);
    }

    @Override // com.google.android.play.core.splitinstall.internal.n
    public final boolean b(ClassLoader classLoader, File file, File file2, boolean z10) {
        return e(classLoader, file, file2, z10, new p(), "zip", new q());
    }
}
