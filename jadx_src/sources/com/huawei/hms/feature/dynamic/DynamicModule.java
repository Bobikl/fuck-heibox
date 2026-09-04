package com.huawei.hms.feature.dynamic;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.common.util.Logger;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes7.dex */
public class DynamicModule {
    public static final int MODULE_INTER_ERROR = 3;
    public static final int MODULE_NEED_UPDATE = 2;
    public static final int MODULE_NORMAL = 0;
    public static final int MODULE_NOT_EXIST = 1;
    public static final int MODULE_NOT_PRESET_HSF = 5;
    public static final int MODULE_NOT_READY = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f60628c = 256;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f60629d = -100;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f60634i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f60635j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f60636k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f60637l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f60640a;
    public static final VersionPolicy PREFER_REMOTE = new com.huawei.hms.feature.dynamic.e.e();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new com.huawei.hms.feature.dynamic.e.c();
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new com.huawei.hms.feature.dynamic.e.d();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new com.huawei.hms.feature.dynamic.e.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f60627b = DynamicModule.class.getSimpleName();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadLocal<HashMap<String, Boolean>> f60630e = new ThreadLocal<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ThreadLocal<HashMap<String, String>> f60631f = new ThreadLocal<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ThreadLocal<HashMap<String, IDynamicLoader>> f60632g = new ThreadLocal<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ThreadLocal<HashMap<String, ClassLoader>> f60633h = new ThreadLocal<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static HashMap<String, Boolean> f60638m = new HashMap<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static HashMap<String, Boolean> f60639n = new HashMap<>();

    public static class DynamicLoaderClassLoader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static HashMap<String, ClassLoader> f60641a = new HashMap<>();

        public static ClassLoader getsClassLoader(String str) {
            return f60641a.get(str);
        }

        public static void setsClassLoader(String str, ClassLoader classLoader) {
            f60641a.put(str, classLoader);
        }
    }

    public static class LoadingException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Bundle f60642a;

        public LoadingException(String str) {
            super(str);
        }

        public LoadingException(String str, Bundle bundle) {
            super(str);
            this.f60642a = bundle;
        }

        public Bundle getBundle() {
            return this.f60642a;
        }
    }

    public interface VersionPolicy {
        Bundle getModuleInfo(Context context, String str) throws LoadingException;
    }

    public static final class a extends HashMap<String, ClassLoader> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f60643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ClassLoader f60644b;

        public a(String str, ClassLoader classLoader) {
            this.f60643a = str;
            this.f60644b = classLoader;
            put(str, classLoader);
        }
    }

    public static final class b extends HashMap<String, ClassLoader> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f60645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ClassLoader f60646b;

        public b(String str, ClassLoader classLoader) {
            this.f60645a = str;
            this.f60646b = classLoader;
            put(str, classLoader);
        }
    }

    public static final class c implements Callable<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f60647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f60648b;

        public c(Context context, Bundle bundle) {
            this.f60647a = context;
            this.f60648b = bundle;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Bundle call() {
            try {
                return DynamicModule.queryHMSModuleBundle(this.f60647a, com.huawei.hms.feature.dynamic.b.f60683e, this.f60648b);
            } catch (Exception e10) {
                Logger.w(DynamicModule.f60627b, "Query provider error.", e10);
                return new Bundle();
            }
        }
    }

    public static final class d extends HashMap<String, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f60649a;

        public d(String str) {
            this.f60649a = str;
            put(str, Boolean.TRUE);
        }
    }

    public static final class e extends HashMap<String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f60650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f60651b;

        public e(String str, String str2) {
            this.f60650a = str;
            this.f60651b = str2;
            put(str, str2);
        }
    }

    public static final class f extends HashMap<String, IDynamicLoader> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f60652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IBinder f60653b;

        public f(String str, IBinder iBinder) {
            this.f60652a = str;
            this.f60653b = iBinder;
            put(str, IDynamicLoader.Stub.asInterface(iBinder));
        }
    }

    public static class g extends Exception {
        public g(String str) {
            super(str);
        }

        public /* synthetic */ g(String str, a aVar) {
            this(str);
        }
    }

    public DynamicModule(Context context) {
        this.f60640a = context;
    }

    public static int a(Context context, String str, Bundle bundle) throws Throwable {
        int i10;
        boolean zA;
        String str2;
        Bundle bundle2 = new Bundle();
        LoadingException loadingException = null;
        try {
            bundle2 = queryHMSModuleBundle(context, com.huawei.hms.feature.dynamic.b.f60683e, bundle);
            i10 = bundle2.getInt(com.huawei.hms.feature.dynamic.b.f60689k);
            try {
                zA = a(str, bundle2.getInt(com.huawei.hms.feature.dynamic.b.f60704z));
            } catch (LoadingException e10) {
                e = e10;
                Logger.w(f60627b, "Get loader in HMS failed:" + e.getMessage());
                loadingException = e.getBundle() != null ? new LoadingException(e.getMessage(), e.getBundle()) : new LoadingException(e.getMessage());
                zA = false;
            } catch (Exception e11) {
                e = e11;
                Logger.w(f60627b, "Get hms loader info failed:" + e.getMessage());
                zA = false;
            }
        } catch (LoadingException e12) {
            e = e12;
            i10 = 0;
        } catch (Exception e13) {
            e = e13;
            i10 = 0;
        }
        Bundle assetModuleInfo = AssetLoadManager.getAssetModuleInfo(context, com.huawei.hms.feature.dynamic.b.f60683e);
        int i11 = assetModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.f60691m);
        String string = assetModuleInfo.getString(com.huawei.hms.feature.dynamic.b.f60692n);
        if (i10 == 0 && i11 == 0) {
            Logger.w(f60627b, "No available dynamic loader in HMS and asset.");
            if (loadingException == null) {
                return 0;
            }
            throw loadingException;
        }
        String str3 = f60627b;
        Logger.i(str3, "HMS loader version:" + i10 + ", asset loader version:" + i11);
        if (i10 <= i11) {
            Logger.i(str3, "Choose dynamicLoader in asset.");
            bundle.putString(com.huawei.hms.feature.dynamic.b.f60696r, string);
            bundle.putInt(com.huawei.hms.feature.dynamic.b.f60695q, i11);
            return i11;
        }
        Logger.i(str3, "Choose dynamicLoader in HMS.");
        if (zA) {
            Logger.i(str3, "Need to copy HMS dynamicLoader to local dir.");
            ModuleCopy.copyModule(context, bundle2);
        }
        String string2 = bundle2.getString(com.huawei.hms.feature.dynamic.b.f60692n);
        if (!TextUtils.isEmpty(string2) && new File(string2).exists()) {
            if (ModuleCopy.isLocalModuleFile(context, string2) || com.huawei.hms.feature.dynamic.f.c.a(context, string2)) {
                bundle.putString(com.huawei.hms.feature.dynamic.b.f60696r, string2);
                bundle.putInt(com.huawei.hms.feature.dynamic.b.f60695q, i10);
            } else {
                str2 = "checkPathValidity failed, choose assets loader as default.";
            }
            return i10;
        }
        str2 = "HMS dynamicloader is not available, choose assets loader as default.";
        Logger.i(str3, str2);
        bundle.putString(com.huawei.hms.feature.dynamic.b.f60696r, string);
        bundle.putInt(com.huawei.hms.feature.dynamic.b.f60695q, i11);
        return i10;
    }

    public static int a(VersionPolicy versionPolicy) {
        if (versionPolicy instanceof com.huawei.hms.feature.dynamic.e.e) {
            return 1;
        }
        if (versionPolicy instanceof com.huawei.hms.feature.dynamic.e.d) {
            return 2;
        }
        return versionPolicy instanceof com.huawei.hms.feature.dynamic.e.c ? 3 : 0;
    }

    public static Context a(Context context, String str, Bundle bundle, IDynamicLoader iDynamicLoader) throws LoadingException {
        try {
            IObjectWrapper iObjectWrapperLoad = iDynamicLoader.load(ObjectWrapper.wrap(context), str, bundle.getInt(com.huawei.hms.feature.dynamic.b.f60689k), ObjectWrapper.wrap(bundle));
            Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapperLoad);
            if (objUnwrap == null) {
                Logger.w(f60627b, "Get remote context is null, module:" + str);
                return null;
            }
            if (objUnwrap instanceof Context) {
                Logger.i(f60627b, "Get context for module:" + str + " success.");
                return (Context) objUnwrap;
            }
            if (objUnwrap instanceof Bundle) {
                Logger.i(f60627b, "Get module info bundle for " + str);
                return a(context, str, bundle, iDynamicLoader, (Bundle) objUnwrap);
            }
            if (objUnwrap.getClass().getName().equals(LoadingException.class.getName())) {
                Bundle bundle2 = (Bundle) ObjectWrapper.unwrap(iObjectWrapperLoad).getClass().getDeclaredMethod("getBundle", new Class[0]).invoke(ObjectWrapper.unwrap(iObjectWrapperLoad), new Object[0]);
                Logger.w(f60627b, "Successfully get the bundle in exception.");
                throw new LoadingException("Failed to load, please check the bundle in exception.", bundle2);
            }
            Logger.w(f60627b, "Get remote context is null, module:" + str);
            return null;
        } catch (LoadingException e10) {
            throw e10;
        } catch (Exception e11) {
            Logger.w(f60627b, "Failed to get module context for:" + str, e11);
            return null;
        }
    }

    public static Context a(Context context, String str, Bundle bundle, IDynamicLoader iDynamicLoader, Bundle bundle2) throws LoadingException {
        bundle.putInt(com.huawei.hms.feature.dynamic.b.f60701w, 4);
        if (AssetLoadManager.getAssetModuleInfo(context, str).getInt(com.huawei.hms.feature.dynamic.b.f60691m, 0) <= 0) {
            Logger.i(f60627b, "No fallback module in assets.");
            throw new LoadingException("Load exception, please check the bundle in exception.", bundle2);
        }
        Object objUnwrap = null;
        try {
            objUnwrap = ObjectWrapper.unwrap(iDynamicLoader.load(ObjectWrapper.wrap(context), str, bundle.getInt(com.huawei.hms.feature.dynamic.b.f60689k), ObjectWrapper.wrap(bundle)));
        } catch (RemoteException e10) {
            Logger.w(f60627b, "tryWithAssetsModule RemoteException.", e10);
        }
        if (!(objUnwrap instanceof Context)) {
            Logger.w(f60627b, "tryWithAssetsModule get dynamicContext failed: null or wrong type.");
            throw new LoadingException("Load exception, please check the bundle in exception.", bundle2);
        }
        Logger.i(f60627b, "get dynamic module context for:" + str + " from assets fallback success.");
        return (Context) objUnwrap;
    }

    public static Bundle a(Context context, Bundle bundle) throws g {
        a aVar = null;
        try {
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            FutureTask futureTask = new FutureTask(new c(context, bundle));
            executorServiceNewSingleThreadExecutor.execute(futureTask);
            Bundle bundle2 = (Bundle) futureTask.get(f60637l, TimeUnit.MILLISECONDS);
            String string = bundle2.getString(com.huawei.hms.feature.dynamic.b.f60696r);
            if (!TextUtils.isEmpty(string) && new File(string).exists()) {
                Logger.i(f60627b, "Query HMS module:huawei_module_dynamicloader info success.");
                return bundle2;
            }
            Logger.w(f60627b, "The loader_path:" + string + " is not available.");
            throw new g("The loader_path in queryBundle is empty or not exist.", aVar);
        } catch (TimeoutException unused) {
            Logger.w(f60627b, "Query hms provider timeout: over " + f60637l + " ms, choose the local loader fallback.");
            return new Bundle();
        } catch (Exception e10) {
            Logger.w(f60627b, "FutureTask: query provider exception.", e10);
            throw new g("failed to get :huawei_module_dynamicloader info.", aVar);
        }
    }

    public static DynamicModule a(Context context, String str, VersionPolicy versionPolicy) throws LoadingException {
        Bundle moduleInfo = versionPolicy.getModuleInfo(context, str);
        if (moduleInfo.getInt(com.huawei.hms.feature.dynamic.b.f60689k) <= 0) {
            if (moduleInfo.getInt(com.huawei.hms.feature.dynamic.b.f60690l) <= 0) {
                throw new LoadingException("Query remote version and local version failed.");
            }
            Logger.i(f60627b, "Remote version is invalid, use local context.");
            return new DynamicModule(context.getApplicationContext());
        }
        try {
            return c(context, str, moduleInfo);
        } catch (LoadingException e10) {
            Logger.w(f60627b, "Failed to load remote module.", e10);
            if (getLocalVersion(context, str) <= 0) {
                throw e10;
            }
            Logger.d(f60627b, "Local module version is valid, use local fallback.");
            return new DynamicModule(context.getApplicationContext());
        }
    }

    public static DynamicModule a(Context context, String str, VersionPolicy versionPolicy, Bundle bundle) throws LoadingException {
        int iA = a(versionPolicy);
        String string = bundle.getString(com.huawei.hms.feature.dynamic.b.f60696r);
        Logger.i(f60627b, "The loader path for module:" + str + " is:" + string + ", and versionType is:" + iA);
        if (TextUtils.isEmpty(string)) {
            throw new LoadingException("Cannot find a valid dynamic loader in HMS or local.");
        }
        Boolean bool = f60639n.get(str);
        Boolean bool2 = f60638m.get(str);
        bundle.putString(com.huawei.hms.feature.dynamic.b.f60688j, str);
        bundle.putInt(com.huawei.hms.feature.dynamic.b.f60701w, iA);
        bundle.putBoolean(com.huawei.hms.feature.dynamic.b.f60702x, bool != null ? bool.booleanValue() : false);
        bundle.putBoolean(com.huawei.hms.feature.dynamic.b.f60703y, bool2 != null ? bool2.booleanValue() : false);
        try {
            return b(context, str, bundle);
        } catch (LoadingException e10) {
            throw e10;
        } catch (Exception e11) {
            Logger.e(f60627b, "Other exception,", e11);
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            return new DynamicModule(context);
        }
    }

    public static IDynamicInstall a(Context context, String str) throws LoadingException {
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (com.huawei.hms.feature.dynamic.f.c.a(context, str)) {
                        return IDynamicInstall.Stub.asInterface((IBinder) new com.huawei.hms.feature.dynamic.e.a(str, ClassLoader.getSystemClassLoader()).loadClass(com.huawei.hms.feature.dynamic.b.f60685g).getConstructor(new Class[0]).newInstance(new Object[0]));
                    }
                    Logger.w(f60627b, "check path failed: invalid.");
                    throw new LoadingException("getHMSDynamicInstaller: checkPathValidity failed.");
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
                throw new LoadingException("getHMSDynamicInstaller: failed to instantiate dynamic loader:" + e10.getMessage());
            }
        }
        throw new LoadingException("Failed to get dynamicLoader path.");
    }

    public static IDynamicLoader a(Context context, String str, String str2, ClassLoader classLoader) {
        if (classLoader == null) {
            try {
                classLoader = new com.huawei.hms.feature.dynamic.e.a(str2, ClassLoader.getSystemClassLoader());
                f60633h.set(new b(str, classLoader));
            } catch (Exception e10) {
                Logger.w(f60627b, "Get iDynamicLoader failed.", e10);
                return null;
            }
        }
        return IDynamicLoader.Stub.asInterface((IBinder) classLoader.loadClass(com.huawei.hms.feature.dynamic.b.f60684f).getConstructor(new Class[0]).newInstance(new Object[0]));
    }

    public static Class<?> a(Context context) throws LoadingException {
        Class<?> clsLoadClass;
        try {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            clsLoadClass = context.getClassLoader().loadClass(DynamicLoaderClassLoader.class.getName());
        } catch (ClassNotFoundException unused) {
            Logger.w(f60627b, "ClassLoader class not found when use client context.");
            clsLoadClass = null;
        }
        if (clsLoadClass == null) {
            try {
                ClassLoader classLoader = DynamicModule.class.getClassLoader();
                Objects.requireNonNull(classLoader);
                clsLoadClass = classLoader.loadClass(DynamicLoaderClassLoader.class.getName());
                if (clsLoadClass == null) {
                    throw new LoadingException("ClassLoader class is null.");
                }
            } catch (ClassNotFoundException unused2) {
                throw new LoadingException("ClassLoader class not found when use DynamicModule's classLoader.");
            }
        }
        return clsLoadClass;
    }

    public static void a(Context context, VersionPolicy versionPolicy, String str, Bundle bundle) throws LoadingException {
        if (((context == null || versionPolicy == null || str == null) || str.length() == 0 || str.length() > 256) || bundle == null) {
            throw new LoadingException("Null param, please check it.");
        }
    }

    public static void a(String str, ClassLoader classLoader) throws LoadingException {
        try {
            f60632g.set(new f(str, (IBinder) classLoader.loadClass(com.huawei.hms.feature.dynamic.b.f60684f).getConstructor(new Class[0]).newInstance(new Object[0])));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new LoadingException("Failed to get loader interface:" + e10.getMessage());
        }
    }

    public static boolean a(String str, int i10) {
        if (i10 == 1) {
            Boolean bool = f60639n.get(str);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
        if (i10 != 2) {
            return i10 == 3 || i10 == 4;
        }
        Boolean bool2 = f60638m.get(str);
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        return false;
    }

    public static Bundle b(Context context, String str) throws LoadingException {
        boolean z10 = true;
        try {
            try {
                Class<?> clsA = a(context);
                Method declaredMethod = clsA.getDeclaredMethod("getsClassLoader", String.class);
                Method declaredMethod2 = clsA.getDeclaredMethod("setsClassLoader", String.class, ClassLoader.class);
                ClassLoader classLoader = (ClassLoader) declaredMethod.invoke(null, str);
                if (classLoader != null) {
                    if (classLoader != ClassLoader.getSystemClassLoader()) {
                        Logger.i(f60627b, "Cached loader is available, ready to use it.");
                        try {
                            a(str, classLoader);
                        } catch (LoadingException e10) {
                            Logger.w(f60627b, "Get loader interface failed.", e10);
                        }
                    }
                    HashMap<String, Boolean> map = new HashMap<>();
                    map.put(str, Boolean.valueOf(z10));
                    f60630e.set(map);
                    return new Bundle();
                }
                try {
                    String str2 = f60627b;
                    Logger.i(str2, "No available cached loader, query remote.");
                    Bundle bundleC = c(context, str);
                    synchronized (DynamicModule.class) {
                        HashMap<String, String> map2 = f60631f.get();
                        Objects.requireNonNull(map2);
                        String str3 = map2.get(str);
                        if (TextUtils.isEmpty(str3)) {
                            return bundleC;
                        }
                        if (!com.huawei.hms.feature.dynamic.f.c.a(context, str3)) {
                            Logger.w(str2, "The loaderPath is invalid.");
                            throw new LoadingException("getHMSModuleInfo: checkPathValidity failed.");
                        }
                        com.huawei.hms.feature.dynamic.e.a aVar = new com.huawei.hms.feature.dynamic.e.a(str3, ClassLoader.getSystemClassLoader());
                        a(str, aVar);
                        declaredMethod2.invoke(null, str, aVar);
                        f60630e.set(new d(str));
                        return bundleC;
                    }
                } catch (g unused) {
                }
            } catch (LoadingException e11) {
                throw e11;
            }
        } catch (Exception e12) {
            Logger.w(f60627b, "failed to load.", e12);
        }
        z10 = false;
        HashMap<String, Boolean> map3 = new HashMap<>();
        map3.put(str, Boolean.valueOf(z10));
        f60630e.set(map3);
        return new Bundle();
    }

    public static DynamicModule b(Context context, VersionPolicy versionPolicy, String str, Bundle bundle) throws Throwable {
        String str2 = f60627b;
        Logger.i(str2, "dynamic-api version: 10024300");
        a(context, versionPolicy, str, bundle);
        try {
            int iA = a(context, str, bundle);
            if (iA >= 10015300) {
                Logger.i(str2, "Load start in new-version-policy.");
                return a(context, str, versionPolicy, bundle);
            }
            if (iA <= 0) {
                throw new LoadingException("Cannot find a valid dynamicLoader in HMS and local.");
            }
            Logger.i(str2, "Load start in old-version-policy.");
            return a(context, str, versionPolicy);
        } catch (LoadingException e10) {
            throw e10;
        } catch (Exception e11) {
            Logger.e(f60627b, "Other exception:" + e11);
            throw new LoadingException("Load failed.");
        }
    }

    public static DynamicModule b(Context context, String str, Bundle bundle) throws LoadingException {
        ClassLoader classLoader;
        synchronized (DynamicModule.class) {
            ThreadLocal<HashMap<String, ClassLoader>> threadLocal = f60633h;
            if (threadLocal.get() == null || threadLocal.get().get(str) == null) {
                Logger.i(f60627b, "No available cached loader for module:" + str);
                classLoader = null;
            } else {
                Logger.i(f60627b, "Cached loader for module is available, ready to use it.");
                classLoader = threadLocal.get().get(str);
            }
        }
        IDynamicLoader iDynamicLoaderA = a(context, str, bundle.getString(com.huawei.hms.feature.dynamic.b.f60696r), classLoader);
        if (iDynamicLoaderA == null) {
            throw new LoadingException("Failed to get iDynamicLoader: null.");
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Context contextA = a(context, str, bundle, iDynamicLoaderA);
        if (contextA != null) {
            return new DynamicModule(contextA);
        }
        throw new LoadingException("New version policy: Failed to get module context: null.");
    }

    public static IDynamicInstall b(Context context) throws LoadingException {
        int i10;
        int localVersion = 0;
        String string = null;
        try {
            Bundle bundleA = a(context, (Bundle) null);
            string = bundleA.getString(com.huawei.hms.feature.dynamic.b.f60696r);
            i10 = bundleA.getInt(com.huawei.hms.feature.dynamic.b.f60695q);
        } catch (Exception e10) {
            Logger.w(f60627b, "Cannot get remote HMS dynamicLoader.", e10);
            i10 = 0;
        }
        try {
            localVersion = getLocalVersion(context, com.huawei.hms.feature.dynamic.b.f60683e);
        } catch (Exception e11) {
            Logger.w(f60627b, "Cannot find local dynamicLoader fallback.", e11);
        }
        String str = f60627b;
        Logger.i(str, "DynamicLoader remoteHMSVersion:" + i10 + ", hmsLoaderPath:" + string + ", localLoaderVersion:" + localVersion);
        int iMax = Math.max(i10, localVersion);
        if (iMax > 10009300) {
            if (i10 <= localVersion) {
                Logger.i(str, "Choose local dynamicLoader fallback: ");
                f60634i = 2;
                return c(context);
            }
            Logger.i(str, "Choose hms dynamicLoader: " + string);
            f60634i = 1;
            return a(context, string);
        }
        Logger.w(str, "The current version:" + iMax + " is too low.");
        throw new LoadingException("The loader version:" + iMax + " is too low to support HFF.");
    }

    public static Bundle c(Context context, String str) throws g, LoadingException {
        try {
            Bundle bundleQueryHMSModuleBundle = queryHMSModuleBundle(context, str);
            String string = bundleQueryHMSModuleBundle.getString(com.huawei.hms.feature.dynamic.b.f60696r);
            if (!TextUtils.isEmpty(string) && new File(string).exists()) {
                f60631f.set(new e(str, string));
                Logger.i(f60627b, "Query remote version by module name:" + str + " success.");
                return bundleQueryHMSModuleBundle;
            }
            Logger.w(f60627b, "The loader_path:" + string + " in query bundle is not available,change the module version to:-100");
            bundleQueryHMSModuleBundle.putInt(com.huawei.hms.feature.dynamic.b.f60689k, -100);
            return bundleQueryHMSModuleBundle;
        } catch (LoadingException e10) {
            throw e10;
        } catch (Exception unused) {
            throw new g("failed to Query remote version.", null);
        }
    }

    public static DynamicModule c(Context context, String str, Bundle bundle) throws LoadingException {
        Boolean bool;
        IDynamicLoader iDynamicLoader;
        try {
            synchronized (DynamicModule.class) {
                HashMap<String, Boolean> map = f60630e.get();
                Objects.requireNonNull(map);
                bool = map.get(str);
                HashMap<String, IDynamicLoader> map2 = f60632g.get();
                Objects.requireNonNull(map2);
                iDynamicLoader = map2.get(str);
            }
            if (bool == null || iDynamicLoader == null) {
                throw new LoadingException("The loader for " + str + " was not prepared.");
            }
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Context contextA = a(context, str, bundle, iDynamicLoader);
            if (contextA != null) {
                return new DynamicModule(contextA);
            }
            throw new LoadingException("Failed to get remote module context: null");
        } catch (LoadingException e10) {
            throw e10;
        } catch (Exception unused) {
            throw new LoadingException("Load Module Error.");
        }
    }

    public static IDynamicInstall c(Context context) throws LoadingException {
        try {
            return (IDynamicInstall) context.getClassLoader().loadClass(com.huawei.hms.feature.dynamic.b.f60685g).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new LoadingException("getLocalLoaderFallback: failed to instantiate dynamic loader: " + e10.getMessage());
        }
    }

    public static void enable3rdPhone(String str, boolean z10) {
        f60638m.put(str, Boolean.valueOf(z10));
    }

    public static void enableLowEMUI(String str, boolean z10) {
        f60639n.put(str, Boolean.valueOf(z10));
    }

    public static Set<String> getInstalledModuleInfo() {
        return com.huawei.hms.feature.dynamic.d.a().f60712a;
    }

    public static Bundle getLocalModuleInfo(Context context, String str) {
        int localVersion = getLocalVersion(context, str);
        Bundle bundle = new Bundle();
        bundle.putString(com.huawei.hms.feature.dynamic.b.f60688j, str);
        bundle.putInt(com.huawei.hms.feature.dynamic.b.f60690l, localVersion);
        return bundle;
    }

    public static int getLocalVersion(Context context, String str) {
        if (context == null || str.length() == 0 || str.length() > 256) {
            Logger.e(f60627b, "Invalid context or moduleName.");
            return 0;
        }
        try {
            String str2 = AssetLoadManager.f60606d + str + ".ModuleDescriptor";
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            return context.getClassLoader().loadClass(str2).getDeclaredField("MODULE_VERSION").getInt(null);
        } catch (ClassNotFoundException unused) {
            Logger.w(f60627b, "Cannot find the class of module descriptor for " + str);
            return 0;
        } catch (Exception e10) {
            Logger.w(f60627b, "Get local module info failed.", e10);
            return 0;
        }
    }

    public static Bundle getRemoteModuleInfo(Context context, String str) throws LoadingException {
        try {
            synchronized (DynamicModule.class) {
                ThreadLocal<HashMap<String, Boolean>> threadLocal = f60630e;
                if (threadLocal.get() == null || threadLocal.get().get(str) == null || !threadLocal.get().get(str).booleanValue()) {
                    Bundle bundleB = b(context, str);
                    if (bundleB.getInt(com.huawei.hms.feature.dynamic.b.f60689k) > 0) {
                        return bundleB;
                    }
                }
                if (threadLocal.get().get(str).booleanValue()) {
                    try {
                        return c(context, str);
                    } catch (g e10) {
                        Logger.w(f60627b, "Query remote module info in HMS failed.", e10);
                    }
                }
                return new Bundle();
            }
        } catch (LoadingException e11) {
            throw e11;
        } catch (Exception e12) {
            Logger.w(f60627b, "Get remote module info for " + str + " failed.", e12);
        }
    }

    public static int getRemoteVersion(Context context, String str) throws LoadingException {
        try {
            Bundle bundleC = c(context, str);
            if (bundleC != null && !bundleC.isEmpty()) {
                return bundleC.getInt(com.huawei.hms.feature.dynamic.b.f60689k);
            }
            Logger.w(f60627b, "Query remote module:" + str + " info failed.");
            throw new LoadingException("Query remote module info failed: null or empty.");
        } catch (g e10) {
            Logger.w(f60627b, "Query remote module:" + str + " exception:" + e10);
            return 0;
        }
    }

    public static void install(Context context, int i10) {
        String str = f60627b;
        Logger.i(str, "dynamic-api version: 10024300");
        if (context == null) {
            Logger.e(str, "The input context is null.");
            return;
        }
        try {
            f60637l = i10;
            Logger.i(str, "Query HMS provider timeOut is set to:" + f60637l + " ms.");
            IDynamicInstall iDynamicInstallB = b(context);
            if (iDynamicInstallB == null) {
                throw new LoadingException("Get dynamicInstaller failed.");
            }
            Bundle bundleInstall = iDynamicInstallB.install(ObjectWrapper.wrap(context), new Bundle());
            if (bundleInstall == null) {
                throw new LoadingException("Get install info failed: moduleBundle is null.");
            }
            com.huawei.hms.feature.dynamic.d.a().a(bundleInstall);
            Logger.i(str, "Install module success.");
        } catch (RemoteException | LoadingException | NullPointerException e10) {
            if (f60634i == 2 || getLocalVersion(context, com.huawei.hms.feature.dynamic.b.f60683e) <= 0) {
                Logger.w(f60627b, "Install module failed.", e10);
                return;
            }
            String str2 = f60627b;
            Logger.i(str2, "Ready to use local loader-fallback to retry:");
            try {
                Bundle bundleInstall2 = c(context).install(ObjectWrapper.wrap(context), new Bundle());
                if (bundleInstall2 == null) {
                    throw new LoadingException("Retry: get install info failed: moduleBundle is null.");
                }
                com.huawei.hms.feature.dynamic.d.a().a(bundleInstall2);
                Logger.i(str2, "Retry install module with local loader-fallback success.");
            } catch (RemoteException | LoadingException | NullPointerException e11) {
                Logger.w(f60627b, "Retry failed with local loader-fallback.", e11);
            }
        }
    }

    public static DynamicModule load(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        return b(context, versionPolicy, str, new Bundle());
    }

    public static DynamicModule loadV2(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        Bundle bundle = new Bundle();
        bundle.putString(com.huawei.hms.feature.dynamic.b.f60697s, "v2");
        return b(context, versionPolicy, str, bundle);
    }

    public static DynamicModule loadV3(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        return loadV3(context, versionPolicy, str, new Bundle());
    }

    public static DynamicModule loadV3(Context context, VersionPolicy versionPolicy, String str, Bundle bundle) throws LoadingException {
        bundle.putString(com.huawei.hms.feature.dynamic.b.f60697s, com.huawei.hms.feature.dynamic.b.f60699u);
        return b(context, versionPolicy, str, bundle);
    }

    public static Bundle queryHMSModuleBundle(Context context, String str) throws g, LoadingException {
        return queryHMSModuleBundle(context, str, null);
    }

    public static Bundle queryHMSModuleBundle(Context context, String str, Bundle bundle) throws g, LoadingException {
        a aVar = null;
        try {
            if (!com.huawei.hms.feature.dynamic.f.c.a(context)) {
                Logger.w(f60627b, "No valid HMS Core in this device.");
                throw new g("HMS Core is not installed.", aVar);
            }
            ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver == null) {
                throw new g("Query remote version failed: null contentResolver.", aVar);
            }
            Bundle bundleCall = contentResolver.call(Uri.parse(com.huawei.hms.feature.dynamic.b.f60679a), str, (String) null, bundle);
            if (bundleCall == null) {
                Logger.w(f60627b, "Failed to get bundle info:null.");
                throw new g("Query remote version failed: null bundle info.", aVar);
            }
            int i10 = bundleCall.getInt(com.huawei.hms.feature.dynamic.b.f60686h);
            String string = bundleCall.getString(com.huawei.hms.feature.dynamic.b.f60696r);
            String str2 = f60627b;
            Logger.i(str2, "bundle info: errorCode:" + i10 + ", moduleVersion:" + bundleCall.getInt(com.huawei.hms.feature.dynamic.b.f60689k) + ", modulePath:" + bundleCall.getString(com.huawei.hms.feature.dynamic.b.f60692n) + ", loader_version:" + bundleCall.getInt(com.huawei.hms.feature.dynamic.b.f60695q) + ", loaderPath:" + string + ", armeabiType:" + bundleCall.getInt(com.huawei.hms.feature.dynamic.b.f60700v));
            if (i10 == 0) {
                return bundleCall;
            }
            Logger.w(str2, "Failed to get " + str + " bundle info, errcode:" + i10);
            throw new LoadingException("Query " + str + " unavailable, errorCode:" + i10, bundleCall);
        } catch (LoadingException e10) {
            throw e10;
        } catch (Exception unused) {
            throw new g("failed to get :" + str + " info from HMS Core.", aVar);
        }
    }

    public final Context getModuleContext() {
        return this.f60640a;
    }
}
