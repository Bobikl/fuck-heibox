package io.flutter.embedding.engine;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.lifecycle.Lifecycle;
import io.flutter.Log;
import io.flutter.embedding.android.ExclusiveAppComponent;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.PluginRegistry;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityControlSurface;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverAware;
import io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface;
import io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverPluginBinding;
import io.flutter.embedding.engine.plugins.contentprovider.ContentProviderAware;
import io.flutter.embedding.engine.plugins.contentprovider.ContentProviderControlSurface;
import io.flutter.embedding.engine.plugins.contentprovider.ContentProviderPluginBinding;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import io.flutter.embedding.engine.plugins.service.ServiceAware;
import io.flutter.embedding.engine.plugins.service.ServiceControlSurface;
import io.flutter.embedding.engine.plugins.service.ServicePluginBinding;
import io.flutter.util.TraceSection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterEngineConnectionRegistry implements PluginRegistry, ActivityControlSurface, ServiceControlSurface, BroadcastReceiverControlSurface, ContentProviderControlSurface {
    private static final String TAG = "FlutterEngineCxnRegstry";

    @p0
    private FlutterEngineActivityPluginBinding activityPluginBinding;

    @p0
    private BroadcastReceiver broadcastReceiver;

    @p0
    private FlutterEngineBroadcastReceiverPluginBinding broadcastReceiverPluginBinding;

    @p0
    private ContentProvider contentProvider;

    @p0
    private FlutterEngineContentProviderPluginBinding contentProviderPluginBinding;

    @p0
    private ExclusiveAppComponent<Activity> exclusiveActivity;

    @n0
    private final FlutterEngine flutterEngine;

    @n0
    private final FlutterPlugin.FlutterPluginBinding pluginBinding;

    @p0
    private Service service;

    @p0
    private FlutterEngineServicePluginBinding servicePluginBinding;

    @n0
    private final Map<Class<? extends FlutterPlugin>, FlutterPlugin> plugins = new HashMap();

    @n0
    private final Map<Class<? extends FlutterPlugin>, ActivityAware> activityAwarePlugins = new HashMap();
    private boolean isWaitingForActivityReattachment = false;

    @n0
    private final Map<Class<? extends FlutterPlugin>, ServiceAware> serviceAwarePlugins = new HashMap();

    @n0
    private final Map<Class<? extends FlutterPlugin>, BroadcastReceiverAware> broadcastReceiverAwarePlugins = new HashMap();

    @n0
    private final Map<Class<? extends FlutterPlugin>, ContentProviderAware> contentProviderAwarePlugins = new HashMap();

    public static class DefaultFlutterAssets implements FlutterPlugin.FlutterAssets {
        final FlutterLoader flutterLoader;

        private DefaultFlutterAssets(@n0 FlutterLoader flutterLoader) {
            this.flutterLoader = flutterLoader;
        }

        @Override // io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets
        public String getAssetFilePathByName(@n0 String str) {
            return this.flutterLoader.getLookupKeyForAsset(str);
        }

        @Override // io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets
        public String getAssetFilePathByName(@n0 String str, @n0 String str2) {
            return this.flutterLoader.getLookupKeyForAsset(str, str2);
        }

        @Override // io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets
        public String getAssetFilePathBySubpath(@n0 String str) {
            return this.flutterLoader.getLookupKeyForAsset(str);
        }

        @Override // io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets
        public String getAssetFilePathBySubpath(@n0 String str, @n0 String str2) {
            return this.flutterLoader.getLookupKeyForAsset(str, str2);
        }
    }

    public static class FlutterEngineActivityPluginBinding implements ActivityPluginBinding {

        @n0
        private final Activity activity;

        @n0
        private final HiddenLifecycleReference hiddenLifecycleReference;

        @n0
        private final Set<io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener> onRequestPermissionsResultListeners = new HashSet();

        @n0
        private final Set<io.flutter.plugin.common.PluginRegistry.ActivityResultListener> onActivityResultListeners = new HashSet();

        @n0
        private final Set<io.flutter.plugin.common.PluginRegistry.NewIntentListener> onNewIntentListeners = new HashSet();

        @n0
        private final Set<io.flutter.plugin.common.PluginRegistry.UserLeaveHintListener> onUserLeaveHintListeners = new HashSet();

        @n0
        private final Set<io.flutter.plugin.common.PluginRegistry.WindowFocusChangedListener> onWindowFocusChangedListeners = new HashSet();

        @n0
        private final Set<ActivityPluginBinding.OnSaveInstanceStateListener> onSaveInstanceStateListeners = new HashSet();

        public FlutterEngineActivityPluginBinding(@n0 Activity activity, @n0 Lifecycle lifecycle) {
            this.activity = activity;
            this.hiddenLifecycleReference = new HiddenLifecycleReference(lifecycle);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void addActivityResultListener(@n0 io.flutter.plugin.common.PluginRegistry.ActivityResultListener activityResultListener) {
            this.onActivityResultListeners.add(activityResultListener);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void addOnNewIntentListener(@n0 io.flutter.plugin.common.PluginRegistry.NewIntentListener newIntentListener) {
            this.onNewIntentListeners.add(newIntentListener);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void addOnSaveStateListener(@n0 ActivityPluginBinding.OnSaveInstanceStateListener onSaveInstanceStateListener) {
            this.onSaveInstanceStateListeners.add(onSaveInstanceStateListener);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void addOnUserLeaveHintListener(@n0 io.flutter.plugin.common.PluginRegistry.UserLeaveHintListener userLeaveHintListener) {
            this.onUserLeaveHintListeners.add(userLeaveHintListener);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void addOnWindowFocusChangedListener(@n0 io.flutter.plugin.common.PluginRegistry.WindowFocusChangedListener windowFocusChangedListener) {
            this.onWindowFocusChangedListeners.add(windowFocusChangedListener);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void addRequestPermissionsResultListener(@n0 io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener) {
            this.onRequestPermissionsResultListeners.add(requestPermissionsResultListener);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        @n0
        public Activity getActivity() {
            return this.activity;
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        @n0
        public Object getLifecycle() {
            return this.hiddenLifecycleReference;
        }

        boolean onActivityResult(int i10, int i11, @p0 Intent intent) {
            Iterator it = new HashSet(this.onActivityResultListeners).iterator();
            while (true) {
                boolean z10 = false;
                while (it.hasNext()) {
                    if (((io.flutter.plugin.common.PluginRegistry.ActivityResultListener) it.next()).onActivityResult(i10, i11, intent) || z10) {
                        z10 = true;
                    }
                }
                return z10;
            }
        }

        void onNewIntent(@p0 Intent intent) {
            Iterator<io.flutter.plugin.common.PluginRegistry.NewIntentListener> it = this.onNewIntentListeners.iterator();
            while (it.hasNext()) {
                it.next().onNewIntent(intent);
            }
        }

        boolean onRequestPermissionsResult(int i10, @n0 String[] strArr, @n0 int[] iArr) {
            Iterator<io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener> it = this.onRequestPermissionsResultListeners.iterator();
            while (true) {
                boolean z10 = false;
                while (it.hasNext()) {
                    if (it.next().onRequestPermissionsResult(i10, strArr, iArr) || z10) {
                        z10 = true;
                    }
                }
                return z10;
            }
        }

        void onRestoreInstanceState(@p0 Bundle bundle) {
            Iterator<ActivityPluginBinding.OnSaveInstanceStateListener> it = this.onSaveInstanceStateListeners.iterator();
            while (it.hasNext()) {
                it.next().onRestoreInstanceState(bundle);
            }
        }

        void onSaveInstanceState(@n0 Bundle bundle) {
            Iterator<ActivityPluginBinding.OnSaveInstanceStateListener> it = this.onSaveInstanceStateListeners.iterator();
            while (it.hasNext()) {
                it.next().onSaveInstanceState(bundle);
            }
        }

        void onUserLeaveHint() {
            Iterator<io.flutter.plugin.common.PluginRegistry.UserLeaveHintListener> it = this.onUserLeaveHintListeners.iterator();
            while (it.hasNext()) {
                it.next().onUserLeaveHint();
            }
        }

        void onWindowFocusChanged(boolean z10) {
            Iterator<io.flutter.plugin.common.PluginRegistry.WindowFocusChangedListener> it = this.onWindowFocusChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().onWindowFocusChanged(z10);
            }
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void removeActivityResultListener(@n0 io.flutter.plugin.common.PluginRegistry.ActivityResultListener activityResultListener) {
            this.onActivityResultListeners.remove(activityResultListener);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void removeOnNewIntentListener(@n0 io.flutter.plugin.common.PluginRegistry.NewIntentListener newIntentListener) {
            this.onNewIntentListeners.remove(newIntentListener);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void removeOnSaveStateListener(@n0 ActivityPluginBinding.OnSaveInstanceStateListener onSaveInstanceStateListener) {
            this.onSaveInstanceStateListeners.remove(onSaveInstanceStateListener);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void removeOnUserLeaveHintListener(@n0 io.flutter.plugin.common.PluginRegistry.UserLeaveHintListener userLeaveHintListener) {
            this.onUserLeaveHintListeners.remove(userLeaveHintListener);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void removeOnWindowFocusChangedListener(@n0 io.flutter.plugin.common.PluginRegistry.WindowFocusChangedListener windowFocusChangedListener) {
            this.onWindowFocusChangedListeners.remove(windowFocusChangedListener);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void removeRequestPermissionsResultListener(@n0 io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener) {
            this.onRequestPermissionsResultListeners.remove(requestPermissionsResultListener);
        }
    }

    public static class FlutterEngineBroadcastReceiverPluginBinding implements BroadcastReceiverPluginBinding {

        @n0
        private final BroadcastReceiver broadcastReceiver;

        FlutterEngineBroadcastReceiverPluginBinding(@n0 BroadcastReceiver broadcastReceiver) {
            this.broadcastReceiver = broadcastReceiver;
        }

        @Override // io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverPluginBinding
        @n0
        public BroadcastReceiver getBroadcastReceiver() {
            return this.broadcastReceiver;
        }
    }

    public static class FlutterEngineContentProviderPluginBinding implements ContentProviderPluginBinding {

        @n0
        private final ContentProvider contentProvider;

        FlutterEngineContentProviderPluginBinding(@n0 ContentProvider contentProvider) {
            this.contentProvider = contentProvider;
        }

        @Override // io.flutter.embedding.engine.plugins.contentprovider.ContentProviderPluginBinding
        @n0
        public ContentProvider getContentProvider() {
            return this.contentProvider;
        }
    }

    public static class FlutterEngineServicePluginBinding implements ServicePluginBinding {

        @p0
        private final HiddenLifecycleReference hiddenLifecycleReference;

        @n0
        private final Set<ServiceAware.OnModeChangeListener> onModeChangeListeners = new HashSet();

        @n0
        private final Service service;

        FlutterEngineServicePluginBinding(@n0 Service service, @p0 Lifecycle lifecycle) {
            this.service = service;
            this.hiddenLifecycleReference = lifecycle != null ? new HiddenLifecycleReference(lifecycle) : null;
        }

        @Override // io.flutter.embedding.engine.plugins.service.ServicePluginBinding
        public void addOnModeChangeListener(@n0 ServiceAware.OnModeChangeListener onModeChangeListener) {
            this.onModeChangeListeners.add(onModeChangeListener);
        }

        @Override // io.flutter.embedding.engine.plugins.service.ServicePluginBinding
        @p0
        public Object getLifecycle() {
            return this.hiddenLifecycleReference;
        }

        @Override // io.flutter.embedding.engine.plugins.service.ServicePluginBinding
        @n0
        public Service getService() {
            return this.service;
        }

        void onMoveToBackground() {
            Iterator<ServiceAware.OnModeChangeListener> it = this.onModeChangeListeners.iterator();
            while (it.hasNext()) {
                it.next().onMoveToBackground();
            }
        }

        void onMoveToForeground() {
            Iterator<ServiceAware.OnModeChangeListener> it = this.onModeChangeListeners.iterator();
            while (it.hasNext()) {
                it.next().onMoveToForeground();
            }
        }

        @Override // io.flutter.embedding.engine.plugins.service.ServicePluginBinding
        public void removeOnModeChangeListener(@n0 ServiceAware.OnModeChangeListener onModeChangeListener) {
            this.onModeChangeListeners.remove(onModeChangeListener);
        }
    }

    FlutterEngineConnectionRegistry(@n0 Context context, @n0 FlutterEngine flutterEngine, @n0 FlutterLoader flutterLoader, @p0 FlutterEngineGroup flutterEngineGroup) {
        this.flutterEngine = flutterEngine;
        this.pluginBinding = new FlutterPlugin.FlutterPluginBinding(context, flutterEngine, flutterEngine.getDartExecutor(), flutterEngine.getRenderer(), flutterEngine.getPlatformViewsController().getRegistry(), new DefaultFlutterAssets(flutterLoader), flutterEngineGroup);
    }

    private void attachToActivityInternal(@n0 Activity activity, @n0 Lifecycle lifecycle) {
        this.activityPluginBinding = new FlutterEngineActivityPluginBinding(activity, lifecycle);
        this.flutterEngine.getPlatformViewsController().setSoftwareRendering(activity.getIntent() != null ? activity.getIntent().getBooleanExtra(FlutterShellArgs.ARG_KEY_ENABLE_SOFTWARE_RENDERING, false) : false);
        this.flutterEngine.getPlatformViewsController().attach(activity, this.flutterEngine.getRenderer(), this.flutterEngine.getDartExecutor());
        for (ActivityAware activityAware : this.activityAwarePlugins.values()) {
            if (this.isWaitingForActivityReattachment) {
                activityAware.onReattachedToActivityForConfigChanges(this.activityPluginBinding);
            } else {
                activityAware.onAttachedToActivity(this.activityPluginBinding);
            }
        }
        this.isWaitingForActivityReattachment = false;
    }

    private Activity attachedActivity() {
        ExclusiveAppComponent<Activity> exclusiveAppComponent = this.exclusiveActivity;
        if (exclusiveAppComponent != null) {
            return exclusiveAppComponent.getAppComponent();
        }
        return null;
    }

    private void detachFromActivityInternal() {
        this.flutterEngine.getPlatformViewsController().detach();
        this.exclusiveActivity = null;
        this.activityPluginBinding = null;
    }

    private void detachFromAppComponent() {
        if (isAttachedToActivity()) {
            detachFromActivity();
            return;
        }
        if (isAttachedToService()) {
            detachFromService();
        } else if (isAttachedToBroadcastReceiver()) {
            detachFromBroadcastReceiver();
        } else if (isAttachedToContentProvider()) {
            detachFromContentProvider();
        }
    }

    private boolean isAttachedToActivity() {
        return this.exclusiveActivity != null;
    }

    private boolean isAttachedToBroadcastReceiver() {
        return this.broadcastReceiver != null;
    }

    private boolean isAttachedToContentProvider() {
        return this.contentProvider != null;
    }

    private boolean isAttachedToService() {
        return this.service != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.embedding.engine.plugins.PluginRegistry
    public void add(@n0 FlutterPlugin flutterPlugin) {
        TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#add " + flutterPlugin.getClass().getSimpleName());
        try {
            if (has(flutterPlugin.getClass())) {
                Log.w(TAG, "Attempted to register plugin (" + flutterPlugin + ") but it was already registered with this FlutterEngine (" + this.flutterEngine + ").");
                if (traceSectionScoped != null) {
                    traceSectionScoped.close();
                    return;
                }
                return;
            }
            Log.v(TAG, "Adding plugin: " + flutterPlugin);
            this.plugins.put((Class<? extends FlutterPlugin>) flutterPlugin.getClass(), flutterPlugin);
            flutterPlugin.onAttachedToEngine(this.pluginBinding);
            if (flutterPlugin instanceof ActivityAware) {
                ActivityAware activityAware = (ActivityAware) flutterPlugin;
                this.activityAwarePlugins.put((Class<? extends FlutterPlugin>) flutterPlugin.getClass(), activityAware);
                if (isAttachedToActivity()) {
                    activityAware.onAttachedToActivity(this.activityPluginBinding);
                }
            }
            if (flutterPlugin instanceof ServiceAware) {
                ServiceAware serviceAware = (ServiceAware) flutterPlugin;
                this.serviceAwarePlugins.put((Class<? extends FlutterPlugin>) flutterPlugin.getClass(), serviceAware);
                if (isAttachedToService()) {
                    serviceAware.onAttachedToService(this.servicePluginBinding);
                }
            }
            if (flutterPlugin instanceof BroadcastReceiverAware) {
                BroadcastReceiverAware broadcastReceiverAware = (BroadcastReceiverAware) flutterPlugin;
                this.broadcastReceiverAwarePlugins.put((Class<? extends FlutterPlugin>) flutterPlugin.getClass(), broadcastReceiverAware);
                if (isAttachedToBroadcastReceiver()) {
                    broadcastReceiverAware.onAttachedToBroadcastReceiver(this.broadcastReceiverPluginBinding);
                }
            }
            if (flutterPlugin instanceof ContentProviderAware) {
                ContentProviderAware contentProviderAware = (ContentProviderAware) flutterPlugin;
                this.contentProviderAwarePlugins.put((Class<? extends FlutterPlugin>) flutterPlugin.getClass(), contentProviderAware);
                if (isAttachedToContentProvider()) {
                    contentProviderAware.onAttachedToContentProvider(this.contentProviderPluginBinding);
                }
            }
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

    @Override // io.flutter.embedding.engine.plugins.PluginRegistry
    public void add(@n0 Set<FlutterPlugin> set) {
        Iterator<FlutterPlugin> it = set.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public void attachToActivity(@n0 ExclusiveAppComponent<Activity> exclusiveAppComponent, @n0 Lifecycle lifecycle) {
        TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            ExclusiveAppComponent<Activity> exclusiveAppComponent2 = this.exclusiveActivity;
            if (exclusiveAppComponent2 != null) {
                exclusiveAppComponent2.detachFromFlutterEngine();
            }
            detachFromAppComponent();
            this.exclusiveActivity = exclusiveAppComponent;
            attachToActivityInternal(exclusiveAppComponent.getAppComponent(), lifecycle);
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

    @Override // io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface
    public void attachToBroadcastReceiver(@n0 BroadcastReceiver broadcastReceiver, @n0 Lifecycle lifecycle) {
        TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#attachToBroadcastReceiver");
        try {
            detachFromAppComponent();
            this.broadcastReceiver = broadcastReceiver;
            this.broadcastReceiverPluginBinding = new FlutterEngineBroadcastReceiverPluginBinding(broadcastReceiver);
            Iterator<BroadcastReceiverAware> it = this.broadcastReceiverAwarePlugins.values().iterator();
            while (it.hasNext()) {
                it.next().onAttachedToBroadcastReceiver(this.broadcastReceiverPluginBinding);
            }
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

    @Override // io.flutter.embedding.engine.plugins.contentprovider.ContentProviderControlSurface
    public void attachToContentProvider(@n0 ContentProvider contentProvider, @n0 Lifecycle lifecycle) {
        TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#attachToContentProvider");
        try {
            detachFromAppComponent();
            this.contentProvider = contentProvider;
            this.contentProviderPluginBinding = new FlutterEngineContentProviderPluginBinding(contentProvider);
            Iterator<ContentProviderAware> it = this.contentProviderAwarePlugins.values().iterator();
            while (it.hasNext()) {
                it.next().onAttachedToContentProvider(this.contentProviderPluginBinding);
            }
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

    @Override // io.flutter.embedding.engine.plugins.service.ServiceControlSurface
    public void attachToService(@n0 Service service, @p0 Lifecycle lifecycle, boolean z10) {
        TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#attachToService");
        try {
            detachFromAppComponent();
            this.service = service;
            this.servicePluginBinding = new FlutterEngineServicePluginBinding(service, lifecycle);
            Iterator<ServiceAware> it = this.serviceAwarePlugins.values().iterator();
            while (it.hasNext()) {
                it.next().onAttachedToService(this.servicePluginBinding);
            }
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

    public void destroy() {
        Log.v(TAG, "Destroying.");
        detachFromAppComponent();
        removeAll();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public void detachFromActivity() {
        if (!isAttachedToActivity()) {
            Log.e(TAG, "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator<ActivityAware> it = this.activityAwarePlugins.values().iterator();
            while (it.hasNext()) {
                it.next().onDetachedFromActivity();
            }
            detachFromActivityInternal();
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

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public void detachFromActivityForConfigChanges() {
        if (!isAttachedToActivity()) {
            Log.e(TAG, "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
        try {
            this.isWaitingForActivityReattachment = true;
            Iterator<ActivityAware> it = this.activityAwarePlugins.values().iterator();
            while (it.hasNext()) {
                it.next().onDetachedFromActivityForConfigChanges();
            }
            detachFromActivityInternal();
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

    @Override // io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface
    public void detachFromBroadcastReceiver() {
        if (!isAttachedToBroadcastReceiver()) {
            Log.e(TAG, "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
            return;
        }
        TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
        try {
            Iterator<BroadcastReceiverAware> it = this.broadcastReceiverAwarePlugins.values().iterator();
            while (it.hasNext()) {
                it.next().onDetachedFromBroadcastReceiver();
            }
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

    @Override // io.flutter.embedding.engine.plugins.contentprovider.ContentProviderControlSurface
    public void detachFromContentProvider() {
        if (!isAttachedToContentProvider()) {
            Log.e(TAG, "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
            return;
        }
        TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#detachFromContentProvider");
        try {
            Iterator<ContentProviderAware> it = this.contentProviderAwarePlugins.values().iterator();
            while (it.hasNext()) {
                it.next().onDetachedFromContentProvider();
            }
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

    @Override // io.flutter.embedding.engine.plugins.service.ServiceControlSurface
    public void detachFromService() {
        if (!isAttachedToService()) {
            Log.e(TAG, "Attempted to detach plugins from a Service when no Service was attached.");
            return;
        }
        TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#detachFromService");
        try {
            Iterator<ServiceAware> it = this.serviceAwarePlugins.values().iterator();
            while (it.hasNext()) {
                it.next().onDetachedFromService();
            }
            this.service = null;
            this.servicePluginBinding = null;
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

    @Override // io.flutter.embedding.engine.plugins.PluginRegistry
    public FlutterPlugin get(@n0 Class<? extends FlutterPlugin> cls) {
        return this.plugins.get(cls);
    }

    @Override // io.flutter.embedding.engine.plugins.PluginRegistry
    public boolean has(@n0 Class<? extends FlutterPlugin> cls) {
        return this.plugins.containsKey(cls);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public boolean onActivityResult(int i10, int i11, @p0 Intent intent) {
        if (!isAttachedToActivity()) {
            Log.e(TAG, "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
        TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#onActivityResult");
        try {
            boolean zOnActivityResult = this.activityPluginBinding.onActivityResult(i10, i11, intent);
            if (traceSectionScoped != null) {
                traceSectionScoped.close();
            }
            return zOnActivityResult;
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

    @Override // io.flutter.embedding.engine.plugins.service.ServiceControlSurface
    public void onMoveToBackground() {
        if (isAttachedToService()) {
            TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#onMoveToBackground");
            try {
                this.servicePluginBinding.onMoveToBackground();
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

    @Override // io.flutter.embedding.engine.plugins.service.ServiceControlSurface
    public void onMoveToForeground() {
        if (isAttachedToService()) {
            TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#onMoveToForeground");
            try {
                this.servicePluginBinding.onMoveToForeground();
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

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public void onNewIntent(@n0 Intent intent) {
        if (!isAttachedToActivity()) {
            Log.e(TAG, "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            return;
        }
        TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#onNewIntent");
        try {
            this.activityPluginBinding.onNewIntent(intent);
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

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public boolean onRequestPermissionsResult(int i10, @n0 String[] strArr, @n0 int[] iArr) {
        if (!isAttachedToActivity()) {
            Log.e(TAG, "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
        TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
        try {
            boolean zOnRequestPermissionsResult = this.activityPluginBinding.onRequestPermissionsResult(i10, strArr, iArr);
            if (traceSectionScoped != null) {
                traceSectionScoped.close();
            }
            return zOnRequestPermissionsResult;
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

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public void onRestoreInstanceState(@p0 Bundle bundle) {
        if (!isAttachedToActivity()) {
            Log.e(TAG, "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            return;
        }
        TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#onRestoreInstanceState");
        try {
            this.activityPluginBinding.onRestoreInstanceState(bundle);
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

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public void onSaveInstanceState(@n0 Bundle bundle) {
        if (!isAttachedToActivity()) {
            Log.e(TAG, "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            return;
        }
        TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#onSaveInstanceState");
        try {
            this.activityPluginBinding.onSaveInstanceState(bundle);
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

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public void onUserLeaveHint() {
        if (!isAttachedToActivity()) {
            Log.e(TAG, "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
            return;
        }
        TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#onUserLeaveHint");
        try {
            this.activityPluginBinding.onUserLeaveHint();
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

    @Override // io.flutter.embedding.engine.plugins.PluginRegistry
    public void remove(@n0 Class<? extends FlutterPlugin> cls) {
        FlutterPlugin flutterPlugin = this.plugins.get(cls);
        if (flutterPlugin == null) {
            return;
        }
        TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#remove " + cls.getSimpleName());
        try {
            if (flutterPlugin instanceof ActivityAware) {
                if (isAttachedToActivity()) {
                    ((ActivityAware) flutterPlugin).onDetachedFromActivity();
                }
                this.activityAwarePlugins.remove(cls);
            }
            if (flutterPlugin instanceof ServiceAware) {
                if (isAttachedToService()) {
                    ((ServiceAware) flutterPlugin).onDetachedFromService();
                }
                this.serviceAwarePlugins.remove(cls);
            }
            if (flutterPlugin instanceof BroadcastReceiverAware) {
                if (isAttachedToBroadcastReceiver()) {
                    ((BroadcastReceiverAware) flutterPlugin).onDetachedFromBroadcastReceiver();
                }
                this.broadcastReceiverAwarePlugins.remove(cls);
            }
            if (flutterPlugin instanceof ContentProviderAware) {
                if (isAttachedToContentProvider()) {
                    ((ContentProviderAware) flutterPlugin).onDetachedFromContentProvider();
                }
                this.contentProviderAwarePlugins.remove(cls);
            }
            flutterPlugin.onDetachedFromEngine(this.pluginBinding);
            this.plugins.remove(cls);
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

    @Override // io.flutter.embedding.engine.plugins.PluginRegistry
    public void remove(@n0 Set<Class<? extends FlutterPlugin>> set) {
        Iterator<Class<? extends FlutterPlugin>> it = set.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // io.flutter.embedding.engine.plugins.PluginRegistry
    public void removeAll() {
        remove(new HashSet(this.plugins.keySet()));
        this.plugins.clear();
    }
}
