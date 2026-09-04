package io.flutter.embedding.engine.deferredcomponents;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.c;
import com.google.android.play.core.splitinstall.d;
import com.google.android.play.core.splitinstall.e;
import com.google.android.play.core.splitinstall.f;
import com.google.android.play.core.splitinstall.g;
import com.google.android.play.core.tasks.OnFailureListener;
import com.google.android.play.core.tasks.OnSuccessListener;
import com.xiaomi.mipush.sdk.Constants;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.loader.ApplicationInfoLoader;
import io.flutter.embedding.engine.loader.FlutterApplicationInfo;
import io.flutter.embedding.engine.systemchannels.DeferredComponentChannel;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class PlayStoreDeferredComponentManager implements DeferredComponentManager {
    public static final String MAPPING_KEY = DeferredComponentManager.class.getName() + ".loadingUnitMapping";
    private static final String TAG = "PlayStoreDeferredComponentManager";

    @p0
    private DeferredComponentChannel channel;

    @n0
    private Context context;

    @n0
    private FlutterApplicationInfo flutterApplicationInfo;

    @p0
    private FlutterJNI flutterJNI;
    private FeatureInstallStateUpdatedListener listener;

    @n0
    protected SparseArray<String> loadingUnitIdToComponentNames;

    @n0
    protected SparseArray<String> loadingUnitIdToSharedLibraryNames;

    @n0
    private Map<String, Integer> nameToSessionId;

    @n0
    private SparseIntArray sessionIdToLoadingUnitId;

    @n0
    private SparseArray<String> sessionIdToName;

    @n0
    private SparseArray<String> sessionIdToState;

    @n0
    private c splitInstallManager;

    public class FeatureInstallStateUpdatedListener implements g {
        private FeatureInstallStateUpdatedListener() {
        }

        @Override // k9.a
        @SuppressLint({"DefaultLocale"})
        public void onStateUpdate(@n0 f fVar) {
            int iH = fVar.h();
            if (PlayStoreDeferredComponentManager.this.sessionIdToName.get(iH) != null) {
                switch (fVar.i()) {
                    case 1:
                        Log.d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) install pending.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iH), Integer.valueOf(iH)));
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iH, "pending");
                        break;
                    case 2:
                        Log.d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) downloading.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iH), Integer.valueOf(iH)));
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iH, "downloading");
                        break;
                    case 3:
                        Log.d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) downloaded.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iH), Integer.valueOf(iH)));
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iH, "downloaded");
                        break;
                    case 4:
                        Log.d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) installing.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iH), Integer.valueOf(iH)));
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iH, "installing");
                        break;
                    case 5:
                        Log.d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) install successfully.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iH), Integer.valueOf(iH)));
                        PlayStoreDeferredComponentManager playStoreDeferredComponentManager = PlayStoreDeferredComponentManager.this;
                        playStoreDeferredComponentManager.loadAssets(playStoreDeferredComponentManager.sessionIdToLoadingUnitId.get(iH), (String) PlayStoreDeferredComponentManager.this.sessionIdToName.get(iH));
                        if (PlayStoreDeferredComponentManager.this.sessionIdToLoadingUnitId.get(iH) > 0) {
                            PlayStoreDeferredComponentManager playStoreDeferredComponentManager2 = PlayStoreDeferredComponentManager.this;
                            playStoreDeferredComponentManager2.loadDartLibrary(playStoreDeferredComponentManager2.sessionIdToLoadingUnitId.get(iH), (String) PlayStoreDeferredComponentManager.this.sessionIdToName.get(iH));
                        }
                        if (PlayStoreDeferredComponentManager.this.channel != null) {
                            PlayStoreDeferredComponentManager.this.channel.completeInstallSuccess((String) PlayStoreDeferredComponentManager.this.sessionIdToName.get(iH));
                        }
                        PlayStoreDeferredComponentManager.this.sessionIdToName.delete(iH);
                        PlayStoreDeferredComponentManager.this.sessionIdToLoadingUnitId.delete(iH);
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iH, "installed");
                        break;
                    case 6:
                        Log.e(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) install failed with: %s", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iH), Integer.valueOf(iH), Integer.valueOf(fVar.c())));
                        PlayStoreDeferredComponentManager.this.flutterJNI.deferredComponentInstallFailure(PlayStoreDeferredComponentManager.this.sessionIdToLoadingUnitId.get(iH), "Module install failed with " + fVar.c(), true);
                        if (PlayStoreDeferredComponentManager.this.channel != null) {
                            PlayStoreDeferredComponentManager.this.channel.completeInstallError((String) PlayStoreDeferredComponentManager.this.sessionIdToName.get(iH), "Android Deferred Component failed to install.");
                        }
                        PlayStoreDeferredComponentManager.this.sessionIdToName.delete(iH);
                        PlayStoreDeferredComponentManager.this.sessionIdToLoadingUnitId.delete(iH);
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iH, z5.f.f141859j);
                        break;
                    case 7:
                        Log.d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) install canceled.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iH), Integer.valueOf(iH)));
                        if (PlayStoreDeferredComponentManager.this.channel != null) {
                            PlayStoreDeferredComponentManager.this.channel.completeInstallError((String) PlayStoreDeferredComponentManager.this.sessionIdToName.get(iH), "Android Deferred Component installation canceled.");
                        }
                        PlayStoreDeferredComponentManager.this.sessionIdToName.delete(iH);
                        PlayStoreDeferredComponentManager.this.sessionIdToLoadingUnitId.delete(iH);
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iH, "cancelled");
                        break;
                    case 8:
                        Log.d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) install requires user confirmation.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iH), Integer.valueOf(iH)));
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iH, "requiresUserConfirmation");
                        break;
                    case 9:
                        Log.d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) install canceling.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iH), Integer.valueOf(iH)));
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iH, "canceling");
                        break;
                    default:
                        Log.d(PlayStoreDeferredComponentManager.TAG, "Unknown status: " + fVar.i());
                        break;
                }
            }
        }
    }

    public PlayStoreDeferredComponentManager(@n0 Context context, @p0 FlutterJNI flutterJNI) {
        this.context = context;
        this.flutterJNI = flutterJNI;
        this.flutterApplicationInfo = ApplicationInfoLoader.load(context);
        this.splitInstallManager = d.a(context);
        FeatureInstallStateUpdatedListener featureInstallStateUpdatedListener = new FeatureInstallStateUpdatedListener();
        this.listener = featureInstallStateUpdatedListener;
        this.splitInstallManager.i(featureInstallStateUpdatedListener);
        this.sessionIdToName = new SparseArray<>();
        this.sessionIdToLoadingUnitId = new SparseIntArray();
        this.sessionIdToState = new SparseArray<>();
        this.nameToSessionId = new HashMap();
        this.loadingUnitIdToComponentNames = new SparseArray<>();
        this.loadingUnitIdToSharedLibraryNames = new SparseArray<>();
        initLoadingUnitMappingToComponentNames();
    }

    @n0
    private ApplicationInfo getApplicationInfo() {
        try {
            return this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException(e10);
        }
    }

    private void initLoadingUnitMappingToComponentNames() {
        Bundle bundle;
        ApplicationInfo applicationInfo = getApplicationInfo();
        if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
            return;
        }
        String str = MAPPING_KEY;
        String string = bundle.getString(str, null);
        if (string == null) {
            Log.e(TAG, "No loading unit to dynamic feature module name found. Ensure '" + str + "' is defined in the base module's AndroidManifest.");
            return;
        }
        if (string.equals("")) {
            return;
        }
        for (String str2 : string.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            String[] strArrSplit = str2.split(":", -1);
            int i10 = Integer.parseInt(strArrSplit[0]);
            this.loadingUnitIdToComponentNames.put(i10, strArrSplit[1]);
            if (strArrSplit.length > 2) {
                this.loadingUnitIdToSharedLibraryNames.put(i10, strArrSplit[2]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$installDeferredComponent$0(String str, int i10, Integer num) {
        this.sessionIdToName.put(num.intValue(), str);
        this.sessionIdToLoadingUnitId.put(num.intValue(), i10);
        if (this.nameToSessionId.containsKey(str)) {
            this.sessionIdToState.remove(this.nameToSessionId.get(str).intValue());
        }
        this.nameToSessionId.put(str, num);
        this.sessionIdToState.put(num.intValue(), "Requested");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$installDeferredComponent$1(int i10, String str, Exception exc) {
        SplitInstallException splitInstallException = (SplitInstallException) exc;
        int iD = splitInstallException.d();
        if (iD == -6) {
            this.flutterJNI.deferredComponentInstallFailure(i10, "Install of deferred component module \"" + str + "\" failed with a network error", true);
            return;
        }
        if (iD != -2) {
            this.flutterJNI.deferredComponentInstallFailure(i10, String.format("Install of deferred component module \"%s\" failed with error %d: %s", str, Integer.valueOf(splitInstallException.d()), splitInstallException.getMessage()), false);
            return;
        }
        this.flutterJNI.deferredComponentInstallFailure(i10, "Install of deferred component module \"" + str + "\" failed as it is unavailable", false);
    }

    private boolean verifyJNI() {
        if (this.flutterJNI != null) {
            return true;
        }
        Log.e(TAG, "No FlutterJNI provided. `setJNI` must be called on the DeferredComponentManager before attempting to load dart libraries or invoking with platform channels.");
        return false;
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void destroy() {
        this.splitInstallManager.h(this.listener);
        this.channel = null;
        this.flutterJNI = null;
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    @n0
    public String getDeferredComponentInstallState(int i10, @p0 String str) {
        if (str == null) {
            str = this.loadingUnitIdToComponentNames.get(i10);
        }
        if (str == null) {
            Log.e(TAG, "Deferred component name was null and could not be resolved from loading unit id.");
            return "unknown";
        }
        if (this.nameToSessionId.containsKey(str)) {
            return this.sessionIdToState.get(this.nameToSessionId.get(str).intValue());
        }
        return this.splitInstallManager.q().contains(str) ? "installedPendingLoad" : "unknown";
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void installDeferredComponent(final int i10, @p0 final String str) {
        final String str2 = str != null ? str : this.loadingUnitIdToComponentNames.get(i10);
        if (str2 == null) {
            Log.e(TAG, "Deferred component name was null and could not be resolved from loading unit id.");
        } else if (!str2.equals("") || i10 <= 0) {
            this.splitInstallManager.startInstall(e.c().b(str2).c()).addOnSuccessListener(new OnSuccessListener() { // from class: io.flutter.embedding.engine.deferredcomponents.a
                public final void a(Object obj) {
                    this.f119429a.lambda$installDeferredComponent$0(str2, i10, (Integer) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: io.flutter.embedding.engine.deferredcomponents.b
                public final void a(Exception exc) {
                    this.f119432a.lambda$installDeferredComponent$1(i10, str, exc);
                }
            });
        } else {
            loadDartLibrary(i10, str2);
        }
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void loadAssets(int i10, @n0 String str) {
        if (verifyJNI()) {
            try {
                Context context = this.context;
                Context contextCreatePackageContext = context.createPackageContext(context.getPackageName(), 0);
                this.context = contextCreatePackageContext;
                this.flutterJNI.updateJavaAssetManager(contextCreatePackageContext.getAssets(), this.flutterApplicationInfo.flutterAssetsDir);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void loadDartLibrary(int i10, @n0 String str) {
        if (verifyJNI() && i10 >= 0) {
            String str2 = this.loadingUnitIdToSharedLibraryNames.get(i10);
            if (str2 == null) {
                str2 = this.flutterApplicationInfo.aotSharedLibraryName + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i10 + ".part.so";
            }
            String str3 = Build.SUPPORTED_ABIS[0];
            String strReplace = str3.replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, lg.a.f131412e);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            LinkedList linkedList = new LinkedList();
            linkedList.add(this.context.getFilesDir());
            for (String str4 : this.context.getApplicationInfo().splitSourceDirs) {
                linkedList.add(new File(str4));
            }
            while (!linkedList.isEmpty()) {
                File file = (File) linkedList.remove();
                if (file == null || !file.isDirectory() || file.listFiles() == null) {
                    String name = file.getName();
                    if (name.endsWith(".apk") && ((name.startsWith(str) || name.startsWith("split_config")) && name.contains(strReplace))) {
                        arrayList.add(file.getAbsolutePath());
                    } else if (name.equals(str2)) {
                        arrayList2.add(file.getAbsolutePath());
                    }
                } else {
                    for (File file2 : file.listFiles()) {
                        linkedList.add(file2);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(str2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((String) it.next()) + "!lib/" + str3 + "/" + str2);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add((String) it2.next());
            }
            this.flutterJNI.loadDartDeferredLibrary(i10, (String[]) arrayList3.toArray(new String[arrayList3.size()]));
        }
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void setDeferredComponentChannel(@n0 DeferredComponentChannel deferredComponentChannel) {
        this.channel = deferredComponentChannel;
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void setJNI(@n0 FlutterJNI flutterJNI) {
        this.flutterJNI = flutterJNI;
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public boolean uninstallDeferredComponent(int i10, @p0 String str) {
        if (str == null) {
            str = this.loadingUnitIdToComponentNames.get(i10);
        }
        if (str == null) {
            Log.e(TAG, "Deferred component name was null and could not be resolved from loading unit id.");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        this.splitInstallManager.deferredUninstall(arrayList);
        if (this.nameToSessionId.get(str) == null) {
            return true;
        }
        this.sessionIdToState.delete(this.nameToSessionId.get(str).intValue());
        return true;
    }
}
