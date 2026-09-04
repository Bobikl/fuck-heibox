package io.flutter.embedding.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.FlutterInjector;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.embedding.engine.plugins.PluginRegistry;
import io.flutter.embedding.engine.plugins.activity.ActivityControlSurface;
import io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface;
import io.flutter.embedding.engine.plugins.contentprovider.ContentProviderControlSurface;
import io.flutter.embedding.engine.plugins.service.ServiceControlSurface;
import io.flutter.embedding.engine.plugins.util.GeneratedPluginRegister;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.systemchannels.AccessibilityChannel;
import io.flutter.embedding.engine.systemchannels.BackGestureChannel;
import io.flutter.embedding.engine.systemchannels.DeferredComponentChannel;
import io.flutter.embedding.engine.systemchannels.LifecycleChannel;
import io.flutter.embedding.engine.systemchannels.LocalizationChannel;
import io.flutter.embedding.engine.systemchannels.MouseCursorChannel;
import io.flutter.embedding.engine.systemchannels.NavigationChannel;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import io.flutter.embedding.engine.systemchannels.ProcessTextChannel;
import io.flutter.embedding.engine.systemchannels.RestorationChannel;
import io.flutter.embedding.engine.systemchannels.SettingsChannel;
import io.flutter.embedding.engine.systemchannels.SpellCheckChannel;
import io.flutter.embedding.engine.systemchannels.SystemChannel;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import io.flutter.plugin.localization.LocalizationPlugin;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.plugin.text.ProcessTextPlugin;
import io.flutter.util.ViewUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterEngine implements ViewUtils.DisplayUpdater {
    private static final String TAG = "FlutterEngine";

    @n0
    private final AccessibilityChannel accessibilityChannel;

    @n0
    private final BackGestureChannel backGestureChannel;

    @n0
    private final DartExecutor dartExecutor;

    @n0
    private final DeferredComponentChannel deferredComponentChannel;

    @n0
    private final EngineLifecycleListener engineLifecycleListener;

    @n0
    private final Set<EngineLifecycleListener> engineLifecycleListeners;

    @n0
    private final FlutterJNI flutterJNI;

    @n0
    private final LifecycleChannel lifecycleChannel;

    @n0
    private final LocalizationChannel localizationChannel;

    @n0
    private final LocalizationPlugin localizationPlugin;

    @n0
    private final MouseCursorChannel mouseCursorChannel;

    @n0
    private final NavigationChannel navigationChannel;

    @n0
    private final PlatformChannel platformChannel;

    @n0
    private final PlatformViewsController platformViewsController;

    @n0
    private final FlutterEngineConnectionRegistry pluginRegistry;

    @n0
    private final ProcessTextChannel processTextChannel;

    @n0
    private final FlutterRenderer renderer;

    @n0
    private final RestorationChannel restorationChannel;

    @n0
    private final SettingsChannel settingsChannel;

    @n0
    private final SpellCheckChannel spellCheckChannel;

    @n0
    private final SystemChannel systemChannel;

    @n0
    private final TextInputChannel textInputChannel;

    public interface EngineLifecycleListener {
        void onEngineWillDestroy();

        void onPreEngineRestart();
    }

    public FlutterEngine(@n0 Context context) {
        this(context, null);
    }

    public FlutterEngine(@n0 Context context, @p0 FlutterLoader flutterLoader, @n0 FlutterJNI flutterJNI) {
        this(context, flutterLoader, flutterJNI, null, true);
    }

    public FlutterEngine(@n0 Context context, @p0 FlutterLoader flutterLoader, @n0 FlutterJNI flutterJNI, @n0 PlatformViewsController platformViewsController, @p0 String[] strArr, boolean z10) {
        this(context, flutterLoader, flutterJNI, platformViewsController, strArr, z10, false);
    }

    public FlutterEngine(@n0 Context context, @p0 FlutterLoader flutterLoader, @n0 FlutterJNI flutterJNI, @n0 PlatformViewsController platformViewsController, @p0 String[] strArr, boolean z10, boolean z11) {
        this(context, flutterLoader, flutterJNI, platformViewsController, strArr, z10, z11, null);
    }

    @j1(otherwise = 3)
    public FlutterEngine(@n0 Context context, @p0 FlutterLoader flutterLoader, @n0 FlutterJNI flutterJNI, @n0 PlatformViewsController platformViewsController, @p0 String[] strArr, boolean z10, boolean z11, @p0 FlutterEngineGroup flutterEngineGroup) {
        AssetManager assets;
        this.engineLifecycleListeners = new HashSet();
        this.engineLifecycleListener = new EngineLifecycleListener() { // from class: io.flutter.embedding.engine.FlutterEngine.1
            @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
            public void onEngineWillDestroy() {
            }

            @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
            public void onPreEngineRestart() {
                Log.v(FlutterEngine.TAG, "onPreEngineRestart()");
                Iterator it = FlutterEngine.this.engineLifecycleListeners.iterator();
                while (it.hasNext()) {
                    ((EngineLifecycleListener) it.next()).onPreEngineRestart();
                }
                FlutterEngine.this.platformViewsController.onPreEngineRestart();
                FlutterEngine.this.restorationChannel.clearData();
            }
        };
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        FlutterInjector flutterInjectorInstance = FlutterInjector.instance();
        flutterJNI = flutterJNI == null ? flutterInjectorInstance.getFlutterJNIFactory().provideFlutterJNI() : flutterJNI;
        this.flutterJNI = flutterJNI;
        DartExecutor dartExecutor = new DartExecutor(flutterJNI, assets);
        this.dartExecutor = dartExecutor;
        dartExecutor.onAttachedToJNI();
        DeferredComponentManager deferredComponentManager = FlutterInjector.instance().deferredComponentManager();
        this.accessibilityChannel = new AccessibilityChannel(dartExecutor, flutterJNI);
        DeferredComponentChannel deferredComponentChannel = new DeferredComponentChannel(dartExecutor);
        this.deferredComponentChannel = deferredComponentChannel;
        this.lifecycleChannel = new LifecycleChannel(dartExecutor);
        LocalizationChannel localizationChannel = new LocalizationChannel(dartExecutor);
        this.localizationChannel = localizationChannel;
        this.mouseCursorChannel = new MouseCursorChannel(dartExecutor);
        this.navigationChannel = new NavigationChannel(dartExecutor);
        this.backGestureChannel = new BackGestureChannel(dartExecutor);
        this.platformChannel = new PlatformChannel(dartExecutor);
        this.processTextChannel = new ProcessTextChannel(dartExecutor, context.getPackageManager());
        this.restorationChannel = new RestorationChannel(dartExecutor, z11);
        this.settingsChannel = new SettingsChannel(dartExecutor);
        this.spellCheckChannel = new SpellCheckChannel(dartExecutor);
        this.systemChannel = new SystemChannel(dartExecutor);
        this.textInputChannel = new TextInputChannel(dartExecutor);
        if (deferredComponentManager != null) {
            deferredComponentManager.setDeferredComponentChannel(deferredComponentChannel);
        }
        LocalizationPlugin localizationPlugin = new LocalizationPlugin(context, localizationChannel);
        this.localizationPlugin = localizationPlugin;
        flutterLoader = flutterLoader == null ? flutterInjectorInstance.flutterLoader() : flutterLoader;
        if (!flutterJNI.isAttached()) {
            flutterLoader.startInitialization(context.getApplicationContext());
            flutterLoader.ensureInitializationComplete(context, strArr);
        }
        flutterJNI.addEngineLifecycleListener(this.engineLifecycleListener);
        flutterJNI.setPlatformViewsController(platformViewsController);
        flutterJNI.setLocalizationPlugin(localizationPlugin);
        flutterJNI.setDeferredComponentManager(flutterInjectorInstance.deferredComponentManager());
        if (!flutterJNI.isAttached()) {
            attachToJni();
        }
        this.renderer = new FlutterRenderer(flutterJNI);
        this.platformViewsController = platformViewsController;
        platformViewsController.onAttachedToJNI();
        FlutterEngineConnectionRegistry flutterEngineConnectionRegistry = new FlutterEngineConnectionRegistry(context.getApplicationContext(), this, flutterLoader, flutterEngineGroup);
        this.pluginRegistry = flutterEngineConnectionRegistry;
        localizationPlugin.sendLocalesToFlutter(context.getResources().getConfiguration());
        if (z10 && flutterLoader.automaticallyRegisterPlugins()) {
            GeneratedPluginRegister.registerGeneratedPlugins(this);
        }
        ViewUtils.calculateMaximumDisplayMetrics(context, this);
        flutterEngineConnectionRegistry.add(new ProcessTextPlugin(getProcessTextChannel()));
    }

    public FlutterEngine(@n0 Context context, @p0 FlutterLoader flutterLoader, @n0 FlutterJNI flutterJNI, @p0 String[] strArr, boolean z10) {
        this(context, flutterLoader, flutterJNI, new PlatformViewsController(), strArr, z10);
    }

    public FlutterEngine(@n0 Context context, @p0 String[] strArr) {
        this(context, null, null, strArr, true);
    }

    public FlutterEngine(@n0 Context context, @p0 String[] strArr, boolean z10) {
        this(context, null, null, strArr, z10);
    }

    public FlutterEngine(@n0 Context context, @p0 String[] strArr, boolean z10, boolean z11) {
        this(context, null, null, new PlatformViewsController(), strArr, z10, z11);
    }

    private void attachToJni() {
        Log.v(TAG, "Attaching to JNI.");
        this.flutterJNI.attachToNative();
        if (!isAttachedToJni()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    private boolean isAttachedToJni() {
        return this.flutterJNI.isAttached();
    }

    public void addEngineLifecycleListener(@n0 EngineLifecycleListener engineLifecycleListener) {
        this.engineLifecycleListeners.add(engineLifecycleListener);
    }

    public void destroy() {
        Log.v(TAG, "Destroying.");
        Iterator<EngineLifecycleListener> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onEngineWillDestroy();
        }
        this.pluginRegistry.destroy();
        this.platformViewsController.onDetachedFromJNI();
        this.dartExecutor.onDetachedFromJNI();
        this.flutterJNI.removeEngineLifecycleListener(this.engineLifecycleListener);
        this.flutterJNI.setDeferredComponentManager(null);
        this.flutterJNI.detachFromNativeAndReleaseResources();
        if (FlutterInjector.instance().deferredComponentManager() != null) {
            FlutterInjector.instance().deferredComponentManager().destroy();
            this.deferredComponentChannel.setDeferredComponentManager(null);
        }
    }

    @n0
    public AccessibilityChannel getAccessibilityChannel() {
        return this.accessibilityChannel;
    }

    @n0
    public ActivityControlSurface getActivityControlSurface() {
        return this.pluginRegistry;
    }

    @n0
    public BackGestureChannel getBackGestureChannel() {
        return this.backGestureChannel;
    }

    @n0
    public BroadcastReceiverControlSurface getBroadcastReceiverControlSurface() {
        return this.pluginRegistry;
    }

    @n0
    public ContentProviderControlSurface getContentProviderControlSurface() {
        return this.pluginRegistry;
    }

    @n0
    public DartExecutor getDartExecutor() {
        return this.dartExecutor;
    }

    @n0
    public DeferredComponentChannel getDeferredComponentChannel() {
        return this.deferredComponentChannel;
    }

    @n0
    public LifecycleChannel getLifecycleChannel() {
        return this.lifecycleChannel;
    }

    @n0
    public LocalizationChannel getLocalizationChannel() {
        return this.localizationChannel;
    }

    @n0
    public LocalizationPlugin getLocalizationPlugin() {
        return this.localizationPlugin;
    }

    @n0
    public MouseCursorChannel getMouseCursorChannel() {
        return this.mouseCursorChannel;
    }

    @n0
    public NavigationChannel getNavigationChannel() {
        return this.navigationChannel;
    }

    @n0
    public PlatformChannel getPlatformChannel() {
        return this.platformChannel;
    }

    @n0
    public PlatformViewsController getPlatformViewsController() {
        return this.platformViewsController;
    }

    @n0
    public PluginRegistry getPlugins() {
        return this.pluginRegistry;
    }

    @n0
    public ProcessTextChannel getProcessTextChannel() {
        return this.processTextChannel;
    }

    @n0
    public FlutterRenderer getRenderer() {
        return this.renderer;
    }

    @n0
    public RestorationChannel getRestorationChannel() {
        return this.restorationChannel;
    }

    @n0
    public ServiceControlSurface getServiceControlSurface() {
        return this.pluginRegistry;
    }

    @n0
    public SettingsChannel getSettingsChannel() {
        return this.settingsChannel;
    }

    @n0
    public SpellCheckChannel getSpellCheckChannel() {
        return this.spellCheckChannel;
    }

    @n0
    public SystemChannel getSystemChannel() {
        return this.systemChannel;
    }

    @n0
    public TextInputChannel getTextInputChannel() {
        return this.textInputChannel;
    }

    public void removeEngineLifecycleListener(@n0 EngineLifecycleListener engineLifecycleListener) {
        this.engineLifecycleListeners.remove(engineLifecycleListener);
    }

    @n0
    FlutterEngine spawn(@n0 Context context, @n0 DartExecutor.DartEntrypoint dartEntrypoint, @p0 String str, @p0 List<String> list, @p0 PlatformViewsController platformViewsController, boolean z10, boolean z11) {
        if (isAttachedToJni()) {
            return new FlutterEngine(context, null, this.flutterJNI.spawn(dartEntrypoint.dartEntrypointFunctionName, dartEntrypoint.dartEntrypointLibrary, str, list), platformViewsController, null, z10, z11);
        }
        throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }

    @Override // io.flutter.util.ViewUtils.DisplayUpdater
    public void updateDisplayMetrics(float f10, float f11, float f12) {
        this.flutterJNI.updateDisplayMetrics(0, f10, f11, f12);
    }
}
