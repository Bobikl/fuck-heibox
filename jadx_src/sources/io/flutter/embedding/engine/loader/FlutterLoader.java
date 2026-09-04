package io.flutter.embedding.engine.loader;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.accs.common.Constants;
import io.flutter.FlutterInjector;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.util.HandlerCompat;
import io.flutter.util.PathUtils;
import io.flutter.util.TraceSection;
import io.flutter.view.VsyncWaiter;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterLoader {
    static final String AOT_SHARED_LIBRARY_NAME = "aot-shared-library-name";
    static final String AOT_VMSERVICE_SHARED_LIBRARY_NAME = "aot-vmservice-shared-library-name";
    static final String AUTOMATICALLY_REGISTER_PLUGINS_KEY = "automatically-register-plugins";
    private static final String DEFAULT_KERNEL_BLOB = "kernel_blob.bin";
    private static final String DEFAULT_LIBRARY = "libflutter.so";
    private static final String ENABLE_IMPELLER_META_DATA_KEY = "io.flutter.embedding.android.EnableImpeller";
    private static final String ENABLE_VULKAN_VALIDATION_META_DATA_KEY = "io.flutter.embedding.android.EnableVulkanValidation";
    static final String FLUTTER_ASSETS_DIR_KEY = "flutter-assets-dir";
    private static final String IMPELLER_BACKEND_META_DATA_KEY = "io.flutter.embedding.android.ImpellerBackend";
    private static final String IMPELLER_OPENGL_GPU_TRACING_DATA_KEY = "io.flutter.embedding.android.EnableOpenGLGPUTracing";
    private static final String IMPELLER_VULKAN_GPU_TRACING_DATA_KEY = "io.flutter.embedding.android.EnableVulkanGPUTracing";
    static final String ISOLATE_SNAPSHOT_DATA_KEY = "isolate-snapshot-data";
    private static final String LEAK_VM_META_DATA_KEY = "io.flutter.embedding.android.LeakVM";
    private static final String OLD_GEN_HEAP_SIZE_META_DATA_KEY = "io.flutter.embedding.android.OldGenHeapSize";
    static final String SNAPSHOT_ASSET_PATH_KEY = "snapshot-asset-path";
    private static final String TAG = "FlutterLoader";
    private static final String VMSERVICE_SNAPSHOT_LIBRARY = "libvmservice_snapshot.so";
    static final String VM_SNAPSHOT_DATA_KEY = "vm-snapshot-data";
    private static FlutterLoader instance;
    private ExecutorService executorService;
    private FlutterApplicationInfo flutterApplicationInfo;
    private FlutterJNI flutterJNI;

    @p0
    Future<InitResult> initResultFuture;
    private long initStartTimestampMillis;
    private boolean initialized;

    @p0
    private Settings settings;

    /* JADX INFO: renamed from: io.flutter.embedding.engine.loader.FlutterLoader$1, reason: invalid class name */
    public class AnonymousClass1 implements Callable<InitResult> {
        final /* synthetic */ Context val$appContext;

        AnonymousClass1(Context context) {
            this.val$appContext = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$call$0() {
            FlutterLoader.this.flutterJNI.prefetchDefaultFontManager();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public InitResult call() {
            TraceSection traceSectionScoped = TraceSection.scoped("FlutterLoader initTask");
            try {
                ResourceExtractor resourceExtractorInitResources = FlutterLoader.this.initResources(this.val$appContext);
                try {
                    FlutterLoader.this.flutterJNI.loadLibrary();
                    FlutterLoader.this.flutterJNI.updateRefreshRate();
                    FlutterLoader.this.executorService.execute(new Runnable() { // from class: io.flutter.embedding.engine.loader.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f119445b.lambda$call$0();
                        }
                    });
                    if (resourceExtractorInitResources != null) {
                        resourceExtractorInitResources.waitForCompletion();
                    }
                    InitResult initResult = new InitResult(PathUtils.getFilesDir(this.val$appContext), PathUtils.getCacheDirectory(this.val$appContext), PathUtils.getDataDirectory(this.val$appContext), null);
                    if (traceSectionScoped != null) {
                        traceSectionScoped.close();
                    }
                    return initResult;
                } catch (UnsatisfiedLinkError e10) {
                    if (!e10.toString().contains("couldn't find \"libflutter.so\"") && !e10.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                        throw e10;
                    }
                    String property = System.getProperty("os.arch");
                    File file = new File(FlutterLoader.this.flutterApplicationInfo.nativeLibraryDir);
                    throw new UnsupportedOperationException("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: " + property + ", and the native libraries directory (with path " + file.getAbsolutePath() + ") contains the following files: " + Arrays.toString(file.list()), e10);
                }
            } catch (Throwable th2) {
                if (traceSectionScoped != null) {
                    try {
                        traceSectionScoped.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static class InitResult {
        final String appStoragePath;
        final String dataDirPath;
        final String engineCachesPath;

        private InitResult(String str, String str2, String str3) {
            this.appStoragePath = str;
            this.engineCachesPath = str2;
            this.dataDirPath = str3;
        }

        /* synthetic */ InitResult(String str, String str2, String str3, AnonymousClass1 anonymousClass1) {
            this(str, str2, str3);
        }
    }

    public static class Settings {
        private String logTag;

        @p0
        public String getLogTag() {
            return this.logTag;
        }

        public void setLogTag(String str) {
            this.logTag = str;
        }
    }

    public FlutterLoader() {
        this(FlutterInjector.instance().getFlutterJNIFactory().provideFlutterJNI());
    }

    public FlutterLoader(@n0 FlutterJNI flutterJNI) {
        this(flutterJNI, FlutterInjector.instance().executorService());
    }

    public FlutterLoader(@n0 FlutterJNI flutterJNI, @n0 ExecutorService executorService) {
        this.initialized = false;
        this.flutterJNI = flutterJNI;
        this.executorService = executorService;
    }

    @n0
    private String fullAssetPathFrom(@n0 String str) {
        return this.flutterApplicationInfo.flutterAssetsDir + File.separator + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ResourceExtractor initResources(@n0 Context context) {
        return null;
    }

    private static boolean isLeakVM(@p0 Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean(LEAK_VM_META_DATA_KEY, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$ensureInitializationCompleteAsync$0(Context context, String[] strArr, Handler handler, Runnable runnable) {
        ensureInitializationComplete(context.getApplicationContext(), strArr);
        handler.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$ensureInitializationCompleteAsync$1(final Context context, final String[] strArr, final Handler handler, final Runnable runnable) {
        try {
            this.initResultFuture.get();
            HandlerCompat.createAsyncHandler(Looper.getMainLooper()).post(new Runnable() { // from class: io.flutter.embedding.engine.loader.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f119435b.lambda$ensureInitializationCompleteAsync$0(context, strArr, handler, runnable);
                }
            });
        } catch (Exception e10) {
            Log.e(TAG, "Flutter initialization failed.", e10);
            throw new RuntimeException(e10);
        }
    }

    @n0
    public boolean automaticallyRegisterPlugins() {
        return this.flutterApplicationInfo.automaticallyRegisterPlugins;
    }

    public void ensureInitializationComplete(@n0 Context context, @p0 String[] strArr) {
        if (this.initialized) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.settings == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            TraceSection traceSectionScoped = TraceSection.scoped("FlutterLoader#ensureInitializationComplete");
            try {
                InitResult initResult = this.initResultFuture.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("--icu-native-lib-path=");
                sb2.append(this.flutterApplicationInfo.nativeLibraryDir);
                String str = File.separator;
                sb2.append(str);
                sb2.append(DEFAULT_LIBRARY);
                arrayList.add(sb2.toString());
                if (strArr != null) {
                    Collections.addAll(arrayList, strArr);
                }
                arrayList.add("--aot-shared-library-name=" + this.flutterApplicationInfo.aotSharedLibraryName);
                arrayList.add("--aot-shared-library-name=" + this.flutterApplicationInfo.nativeLibraryDir + str + this.flutterApplicationInfo.aotSharedLibraryName);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("--cache-dir-path=");
                sb3.append(initResult.engineCachesPath);
                arrayList.add(sb3.toString());
                if (this.flutterApplicationInfo.domainNetworkPolicy != null) {
                    arrayList.add("--domain-network-policy=" + this.flutterApplicationInfo.domainNetworkPolicy);
                }
                if (this.settings.getLogTag() != null) {
                    arrayList.add("--log-tag=" + this.settings.getLogTag());
                }
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                int i10 = bundle != null ? bundle.getInt(OLD_GEN_HEAP_SIZE_META_DATA_KEY) : 0;
                if (i10 == 0) {
                    ActivityManager activityManager = (ActivityManager) context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    i10 = (int) ((memoryInfo.totalMem / 1000000.0d) / 2.0d);
                }
                arrayList.add("--old-gen-heap-size=" + i10);
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 12 * 4));
                arrayList.add("--prefetched-default-font-manager");
                if (bundle != null) {
                    if (bundle.getBoolean(ENABLE_IMPELLER_META_DATA_KEY, false)) {
                        arrayList.add(FlutterShellArgs.ARG_ENABLE_IMPELLER);
                    }
                    if (bundle.getBoolean(ENABLE_VULKAN_VALIDATION_META_DATA_KEY, false)) {
                        arrayList.add(FlutterShellArgs.ARG_ENABLE_VULKAN_VALIDATION);
                    }
                    if (bundle.getBoolean(IMPELLER_OPENGL_GPU_TRACING_DATA_KEY, false)) {
                        arrayList.add("--enable-opengl-gpu-tracing");
                    }
                    if (bundle.getBoolean(IMPELLER_VULKAN_GPU_TRACING_DATA_KEY, false)) {
                        arrayList.add("--enable-vulkan-gpu-tracing");
                    }
                    String string = bundle.getString(IMPELLER_BACKEND_META_DATA_KEY);
                    if (string != null) {
                        arrayList.add("--impeller-backend=" + string);
                    }
                }
                arrayList.add("--leak-vm=" + (isLeakVM(bundle) ? "true" : "false"));
                this.flutterJNI.init(context, (String[]) arrayList.toArray(new String[0]), null, initResult.appStoragePath, initResult.engineCachesPath, SystemClock.uptimeMillis() - this.initStartTimestampMillis);
                this.initialized = true;
                if (traceSectionScoped != null) {
                    traceSectionScoped.close();
                }
            } catch (Throwable th2) {
                if (traceSectionScoped != null) {
                    try {
                        traceSectionScoped.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Exception e10) {
            Log.e(TAG, "Flutter initialization failed.", e10);
            throw new RuntimeException(e10);
        }
    }

    public void ensureInitializationCompleteAsync(@n0 final Context context, @p0 final String[] strArr, @n0 final Handler handler, @n0 final Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.settings == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        if (this.initialized) {
            handler.post(runnable);
        } else {
            this.executorService.execute(new Runnable() { // from class: io.flutter.embedding.engine.loader.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f119440b.lambda$ensureInitializationCompleteAsync$1(context, strArr, handler, runnable);
                }
            });
        }
    }

    @n0
    public String findAppBundlePath() {
        return this.flutterApplicationInfo.flutterAssetsDir;
    }

    @n0
    public String getLookupKeyForAsset(@n0 String str) {
        return fullAssetPathFrom(str);
    }

    @n0
    public String getLookupKeyForAsset(@n0 String str, @n0 String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Constants.KEY_PACKAGES);
        String str3 = File.separator;
        sb2.append(str3);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str);
        return getLookupKeyForAsset(sb2.toString());
    }

    public boolean initialized() {
        return this.initialized;
    }

    public void startInitialization(@n0 Context context) {
        startInitialization(context, new Settings());
    }

    public void startInitialization(@n0 Context context, @n0 Settings settings) {
        if (this.settings != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        TraceSection traceSectionScoped = TraceSection.scoped("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.settings = settings;
            this.initStartTimestampMillis = SystemClock.uptimeMillis();
            this.flutterApplicationInfo = ApplicationInfoLoader.load(applicationContext);
            VsyncWaiter.getInstance((DisplayManager) applicationContext.getSystemService("display"), this.flutterJNI).init();
            this.initResultFuture = this.executorService.submit(new AnonymousClass1(applicationContext));
            if (traceSectionScoped != null) {
                traceSectionScoped.close();
            }
        } catch (Throwable th2) {
            if (traceSectionScoped != null) {
                try {
                    traceSectionScoped.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
