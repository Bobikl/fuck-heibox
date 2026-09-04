package com.max.xiaoheihe.loader.tinker;

import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: TinkerLoadLibrary.java */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f77299a = "Tinker.LoadLibrary";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: TinkerLoadLibrary.java */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        static /* synthetic */ void a(ClassLoader classLoader, File file) throws Throwable {
            if (PatchProxy.proxy(new Object[]{classLoader, file}, null, changeQuickRedirect, true, 22128, new Class[]{ClassLoader.class, File.class}, Void.TYPE).isSupported) {
                return;
            }
            b(classLoader, file);
        }

        private static void b(ClassLoader classLoader, File file) throws Throwable {
            if (PatchProxy.proxy(new Object[]{classLoader, file}, null, changeQuickRedirect, true, 22127, new Class[]{ClassLoader.class, File.class}, Void.TYPE).isSupported) {
                return;
            }
            Object obj = com.max.xiaoheihe.loader.tinker.a.d(classLoader, "pathList").get(classLoader);
            Field fieldD = com.max.xiaoheihe.loader.tinker.a.d(obj, "nativeLibraryDirectories");
            File[] fileArr = (File[]) fieldD.get(obj);
            ArrayList arrayList = new ArrayList(fileArr.length + 1);
            arrayList.add(file);
            for (File file2 : fileArr) {
                if (!file.equals(file2)) {
                    arrayList.add(file2);
                }
            }
            fieldD.set(obj, arrayList.toArray(new File[0]));
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.loader.tinker.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TinkerLoadLibrary.java */
    public static final class C0631b {
        public static ChangeQuickRedirect changeQuickRedirect;

        private C0631b() {
        }

        static /* synthetic */ void a(ClassLoader classLoader, File file) throws Throwable {
            if (PatchProxy.proxy(new Object[]{classLoader, file}, null, changeQuickRedirect, true, 22130, new Class[]{ClassLoader.class, File.class}, Void.TYPE).isSupported) {
                return;
            }
            b(classLoader, file);
        }

        private static void b(ClassLoader classLoader, File file) throws Throwable {
            if (PatchProxy.proxy(new Object[]{classLoader, file}, null, changeQuickRedirect, true, 22129, new Class[]{ClassLoader.class, File.class}, Void.TYPE).isSupported) {
                return;
            }
            Object obj = com.max.xiaoheihe.loader.tinker.a.d(classLoader, "pathList").get(classLoader);
            List arrayList = (List) com.max.xiaoheihe.loader.tinker.a.d(obj, "nativeLibraryDirectories").get(obj);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (file.equals((File) it.next())) {
                    it.remove();
                    break;
                }
            }
            arrayList.add(0, file);
            List arrayList2 = (List) com.max.xiaoheihe.loader.tinker.a.d(obj, "systemNativeLibraryDirectories").get(obj);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList(2);
            }
            ArrayList arrayList3 = new ArrayList(arrayList.size() + arrayList2.size() + 1);
            arrayList3.addAll(arrayList);
            arrayList3.addAll(arrayList2);
            com.max.xiaoheihe.loader.tinker.a.d(obj, "nativeLibraryPathElements").set(obj, (Object[]) com.max.xiaoheihe.loader.tinker.a.f(obj, "makePathElements", List.class, File.class, List.class).invoke(obj, arrayList3, null, new ArrayList()));
        }
    }

    /* JADX INFO: compiled from: TinkerLoadLibrary.java */
    public static final class c {
        public static ChangeQuickRedirect changeQuickRedirect;

        private c() {
        }

        static /* synthetic */ void a(ClassLoader classLoader, File file) throws Throwable {
            if (PatchProxy.proxy(new Object[]{classLoader, file}, null, changeQuickRedirect, true, 22132, new Class[]{ClassLoader.class, File.class}, Void.TYPE).isSupported) {
                return;
            }
            b(classLoader, file);
        }

        private static void b(ClassLoader classLoader, File file) throws Throwable {
            if (PatchProxy.proxy(new Object[]{classLoader, file}, null, changeQuickRedirect, true, 22131, new Class[]{ClassLoader.class, File.class}, Void.TYPE).isSupported) {
                return;
            }
            Object obj = com.max.xiaoheihe.loader.tinker.a.d(classLoader, "pathList").get(classLoader);
            List arrayList = (List) com.max.xiaoheihe.loader.tinker.a.d(obj, "nativeLibraryDirectories").get(obj);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (file.equals((File) it.next())) {
                    it.remove();
                    break;
                }
            }
            arrayList.add(0, file);
            List arrayList2 = (List) com.max.xiaoheihe.loader.tinker.a.d(obj, "systemNativeLibraryDirectories").get(obj);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList(2);
            }
            ArrayList arrayList3 = new ArrayList(arrayList.size() + arrayList2.size() + 1);
            arrayList3.addAll(arrayList);
            arrayList3.addAll(arrayList2);
            com.max.xiaoheihe.loader.tinker.a.d(obj, "nativeLibraryPathElements").set(obj, (Object[]) com.max.xiaoheihe.loader.tinker.a.f(obj, "makePathElements", List.class).invoke(obj, arrayList3));
        }
    }

    /* JADX INFO: compiled from: TinkerLoadLibrary.java */
    public static final class d {
        public static ChangeQuickRedirect changeQuickRedirect;

        private d() {
        }

        static /* synthetic */ void a(ClassLoader classLoader, File file) throws Throwable {
            if (PatchProxy.proxy(new Object[]{classLoader, file}, null, changeQuickRedirect, true, 22134, new Class[]{ClassLoader.class, File.class}, Void.TYPE).isSupported) {
                return;
            }
            b(classLoader, file);
        }

        private static void b(ClassLoader classLoader, File file) throws Throwable {
            if (PatchProxy.proxy(new Object[]{classLoader, file}, null, changeQuickRedirect, true, 22133, new Class[]{ClassLoader.class, File.class}, Void.TYPE).isSupported) {
                return;
            }
            String path = file.getPath();
            Field fieldD = com.max.xiaoheihe.loader.tinker.a.d(classLoader, "libPath");
            String[] strArrSplit = ((String) fieldD.get(classLoader)).split(":");
            StringBuilder sb2 = new StringBuilder(path);
            for (String str : strArrSplit) {
                if (str != null && !path.equals(str)) {
                    sb2.append(':');
                    sb2.append(str);
                }
            }
            fieldD.set(classLoader, sb2.toString());
            Field fieldD2 = com.max.xiaoheihe.loader.tinker.a.d(classLoader, "libraryPathElements");
            List list = (List) fieldD2.get(classLoader);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.equals((String) it.next())) {
                    it.remove();
                    break;
                }
            }
            list.add(0, path);
            fieldD2.set(classLoader, list);
        }
    }

    public static void a(ClassLoader classLoader, File file) throws Throwable {
        if (PatchProxy.proxy(new Object[]{classLoader, file}, null, changeQuickRedirect, true, 22126, new Class[]{ClassLoader.class, File.class}, Void.TYPE).isSupported || file == null || !file.exists()) {
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 != 25 || Build.VERSION.PREVIEW_SDK_INT == 0) && i10 <= 25) {
            try {
                C0631b.a(classLoader, file);
            } catch (Throwable unused) {
                a.a(classLoader, file);
            }
        } else {
            try {
                c.a(classLoader, file);
            } catch (Throwable unused2) {
                C0631b.a(classLoader, file);
            }
        }
    }
}
