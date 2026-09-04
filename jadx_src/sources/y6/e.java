package y6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.p0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ManifestParser.java */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f141605b = "ManifestParser";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f141606c = "GlideModule";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f141607a;

    public e(Context context) {
        this.f141607a = context;
    }

    @p0
    private ApplicationInfo a() throws PackageManager.NameNotFoundException {
        return this.f141607a.getPackageManager().getApplicationInfo(this.f141607a.getPackageName(), 128);
    }

    private static c c(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object objNewInstance = null;
            try {
                objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e10) {
                d(cls, e10);
            } catch (InstantiationException e11) {
                d(cls, e11);
            } catch (NoSuchMethodException e12) {
                d(cls, e12);
            } catch (InvocationTargetException e13) {
                d(cls, e13);
            }
            if (objNewInstance instanceof c) {
                return (c) objNewInstance;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
        } catch (ClassNotFoundException e14) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e14);
        }
    }

    private static void d(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    public List<c> b() {
        if (Log.isLoggable(f141605b, 3)) {
            Log.d(f141605b, "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfoA = a();
            if (applicationInfoA != null && applicationInfoA.metaData != null) {
                if (Log.isLoggable(f141605b, 2)) {
                    Log.v(f141605b, "Got app info metadata: " + applicationInfoA.metaData);
                }
                for (String str : applicationInfoA.metaData.keySet()) {
                    if (f141606c.equals(applicationInfoA.metaData.get(str))) {
                        arrayList.add(c(str));
                        if (Log.isLoggable(f141605b, 3)) {
                            Log.d(f141605b, "Loaded Glide module: " + str);
                        }
                    }
                }
                if (Log.isLoggable(f141605b, 3)) {
                    Log.d(f141605b, "Finished loading Glide modules");
                }
                return arrayList;
            }
            if (Log.isLoggable(f141605b, 3)) {
                Log.d(f141605b, "Got null app info metadata");
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e10) {
            if (Log.isLoggable(f141605b, 6)) {
                Log.e(f141605b, "Failed to parse glide modules", e10);
            }
        }
    }
}
