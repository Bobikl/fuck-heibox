package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import androidx.annotation.n0;
import androidx.annotation.u;
import androidx.annotation.w0;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: compiled from: ResourcesFlusher.java */
/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f1818a = "ResourcesFlusher";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f1819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f1820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Class<?> f1821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f1822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Field f1823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f1824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Field f1825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f1826i;

    /* JADX INFO: compiled from: ResourcesFlusher.java */
    @w0(16)
    public static class a {
        private a() {
        }

        @u
        static void a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    private n() {
    }

    static void a(@n0 Resources resources) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return;
        }
        if (i10 >= 24) {
            d(resources);
        } else {
            c(resources);
        }
    }

    @w0(21)
    private static void b(@n0 Resources resources) {
        if (!f1820c) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f1819b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e(f1818a, "Could not retrieve Resources#mDrawableCache field", e10);
            }
            f1820c = true;
        }
        Field field = f1819b;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e(f1818a, "Could not retrieve value from Resources#mDrawableCache", e11);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    @w0(23)
    private static void c(@n0 Resources resources) {
        if (!f1820c) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f1819b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e(f1818a, "Could not retrieve Resources#mDrawableCache field", e10);
            }
            f1820c = true;
        }
        Object obj = null;
        Field field = f1819b;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e(f1818a, "Could not retrieve value from Resources#mDrawableCache", e11);
            }
        }
        if (obj == null) {
            return;
        }
        e(obj);
    }

    @w0(24)
    private static void d(@n0 Resources resources) {
        Object obj;
        if (!f1826i) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f1825h = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e(f1818a, "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f1826i = true;
        }
        Field field = f1825h;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e11) {
            Log.e(f1818a, "Could not retrieve value from Resources#mResourcesImpl", e11);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f1820c) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f1819b = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e12) {
                Log.e(f1818a, "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
            }
            f1820c = true;
        }
        Field field2 = f1819b;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e13) {
                Log.e(f1818a, "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
            }
        }
        if (obj2 != null) {
            e(obj2);
        }
    }

    @w0(16)
    private static void e(@n0 Object obj) {
        if (!f1822e) {
            try {
                f1821d = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e(f1818a, "Could not find ThemedResourceCache class", e10);
            }
            f1822e = true;
        }
        Class<?> cls = f1821d;
        if (cls == null) {
            return;
        }
        if (!f1824g) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f1823f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e(f1818a, "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f1824g = true;
        }
        Field field = f1823f;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e(f1818a, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
        }
        if (longSparseArray != null) {
            a.a(longSparseArray);
        }
    }
}
