package com.google.android.play.core.splitcompat;

import android.os.Build;
import android.util.Log;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f56217b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f56218a;

    o(f fVar) throws IOException {
        this.f56218a = fVar;
    }

    static /* bridge */ /* synthetic */ Set a(o oVar, Set set, u uVar, ZipFile zipFile) throws IOException {
        HashSet hashSet = new HashSet();
        oVar.f(uVar, set, new k(oVar, hashSet, uVar, zipFile));
        return hashSet;
    }

    @w0(21)
    private static void e(u uVar, l lVar) throws IllegalAccessException, IOException, InvocationTargetException {
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(uVar.a());
            try {
                String strB = uVar.b();
                HashMap map = new HashMap();
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    Matcher matcher = f56217b.matcher(zipEntryNextElement.getName());
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        String strGroup2 = matcher.group(2);
                        Log.d("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'", strB, strGroup2, strGroup));
                        Set hashSet = (Set) map.get(strGroup);
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            map.put(strGroup, hashSet);
                        }
                        hashSet.add(new n(zipEntryNextElement, strGroup2));
                    }
                }
                HashMap map2 = new HashMap();
                for (String str : Build.SUPPORTED_ABIS) {
                    if (map.containsKey(str)) {
                        Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI", str));
                        for (n nVar : (Set) map.get(str)) {
                            if (map2.containsKey(nVar.f56215a)) {
                                Log.d("SplitCompat", String.format("NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI", nVar.f56215a, str));
                            } else {
                                map2.put(nVar.f56215a, nVar);
                                Log.d("SplitCompat", String.format("NativeLibraryExtractor: using library %s for ABI %s", nVar.f56215a, str));
                            }
                        }
                    } else {
                        Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are no native libraries for supported ABI %s", str));
                    }
                }
                lVar.a(zipFile, new HashSet(map2.values()));
                zipFile.close();
            } catch (IOException e10) {
                e = e10;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException e11) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e11);
                    }
                }
                throw e;
            }
        } catch (IOException e12) {
            e = e12;
            zipFile = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(u uVar, Set set, m mVar) throws IOException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            File fileC = this.f56218a.c(uVar.b(), nVar.f56215a);
            boolean z10 = false;
            if (fileC.exists() && fileC.length() == nVar.f56216b.getSize() && f.p(fileC)) {
                z10 = true;
            }
            mVar.a(nVar, fileC, z10);
        }
    }

    @w0(21)
    @p0
    final Set b(u uVar) throws IllegalAccessException, IOException, InvocationTargetException {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        e(uVar, new i(this, uVar, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }

    @w0(21)
    final Set c() throws IllegalAccessException, IOException, InvocationTargetException {
        Log.d("SplitCompat", "NativeLibraryExtractor: synchronizing native libraries");
        Set<u> setJ = this.f56218a.j();
        for (String str : this.f56218a.h()) {
            Iterator it = setJ.iterator();
            do {
                if (!it.hasNext()) {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", str));
                    this.f56218a.n(str);
                    break;
                }
            } while (!((u) it.next()).b().equals(str));
        }
        HashSet hashSet = new HashSet();
        for (u uVar : setJ) {
            HashSet hashSet2 = new HashSet();
            e(uVar, new j(this, hashSet2, uVar));
            for (File file : this.f56218a.i(uVar.b())) {
                if (!hashSet2.contains(file)) {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", file.getAbsolutePath(), uVar.b(), uVar.a().getAbsolutePath()));
                    this.f56218a.o(file);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }
}
