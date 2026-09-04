package io.flutter.embedding.engine;

import android.content.Context;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.plugin.platform.PlatformViewsController;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterEngineGroup {

    @j1
    final List<FlutterEngine> activeEngines;

    public static class Options {

        @n0
        private Context context;

        @p0
        private DartExecutor.DartEntrypoint dartEntrypoint;

        @p0
        private List<String> dartEntrypointArgs;

        @p0
        private String initialRoute;

        @n0
        private PlatformViewsController platformViewsController;
        private boolean automaticallyRegisterPlugins = true;
        private boolean waitForRestorationData = false;

        public Options(@n0 Context context) {
            this.context = context;
        }

        public boolean getAutomaticallyRegisterPlugins() {
            return this.automaticallyRegisterPlugins;
        }

        public Context getContext() {
            return this.context;
        }

        public DartExecutor.DartEntrypoint getDartEntrypoint() {
            return this.dartEntrypoint;
        }

        public List<String> getDartEntrypointArgs() {
            return this.dartEntrypointArgs;
        }

        public String getInitialRoute() {
            return this.initialRoute;
        }

        public PlatformViewsController getPlatformViewsController() {
            return this.platformViewsController;
        }

        public boolean getWaitForRestorationData() {
            return this.waitForRestorationData;
        }

        public Options setAutomaticallyRegisterPlugins(boolean z10) {
            this.automaticallyRegisterPlugins = z10;
            return this;
        }

        public Options setDartEntrypoint(DartExecutor.DartEntrypoint dartEntrypoint) {
            this.dartEntrypoint = dartEntrypoint;
            return this;
        }

        public Options setDartEntrypointArgs(List<String> list) {
            this.dartEntrypointArgs = list;
            return this;
        }

        public Options setInitialRoute(String str) {
            this.initialRoute = str;
            return this;
        }

        public Options setPlatformViewsController(@n0 PlatformViewsController platformViewsController) {
            this.platformViewsController = platformViewsController;
            return this;
        }

        public Options setWaitForRestorationData(boolean z10) {
            this.waitForRestorationData = z10;
            return this;
        }
    }

    public FlutterEngineGroup(@n0 Context context) {
        this(context, null);
    }

    public FlutterEngineGroup(@n0 Context context, @p0 String[] strArr) {
        this.activeEngines = new ArrayList();
        FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
        if (flutterLoader.initialized()) {
            return;
        }
        flutterLoader.startInitialization(context.getApplicationContext());
        flutterLoader.ensureInitializationComplete(context.getApplicationContext(), strArr);
    }

    public FlutterEngine createAndRunDefaultEngine(@n0 Context context) {
        return createAndRunEngine(context, null);
    }

    public FlutterEngine createAndRunEngine(@n0 Context context, @p0 DartExecutor.DartEntrypoint dartEntrypoint) {
        return createAndRunEngine(context, dartEntrypoint, null);
    }

    public FlutterEngine createAndRunEngine(@n0 Context context, @p0 DartExecutor.DartEntrypoint dartEntrypoint, @p0 String str) {
        return createAndRunEngine(new Options(context).setDartEntrypoint(dartEntrypoint).setInitialRoute(str));
    }

    public FlutterEngine createAndRunEngine(@n0 Options options) {
        final FlutterEngine flutterEngineSpawn;
        Context context = options.getContext();
        DartExecutor.DartEntrypoint dartEntrypoint = options.getDartEntrypoint();
        String initialRoute = options.getInitialRoute();
        List<String> dartEntrypointArgs = options.getDartEntrypointArgs();
        PlatformViewsController platformViewsController = options.getPlatformViewsController();
        if (platformViewsController == null) {
            platformViewsController = new PlatformViewsController();
        }
        PlatformViewsController platformViewsController2 = platformViewsController;
        boolean automaticallyRegisterPlugins = options.getAutomaticallyRegisterPlugins();
        boolean waitForRestorationData = options.getWaitForRestorationData();
        DartExecutor.DartEntrypoint dartEntrypointCreateDefault = dartEntrypoint == null ? DartExecutor.DartEntrypoint.createDefault() : dartEntrypoint;
        if (this.activeEngines.size() == 0) {
            flutterEngineSpawn = createEngine(context, platformViewsController2, automaticallyRegisterPlugins, waitForRestorationData);
            if (initialRoute != null) {
                flutterEngineSpawn.getNavigationChannel().setInitialRoute(initialRoute);
            }
            flutterEngineSpawn.getDartExecutor().executeDartEntrypoint(dartEntrypointCreateDefault, dartEntrypointArgs);
        } else {
            flutterEngineSpawn = this.activeEngines.get(0).spawn(context, dartEntrypointCreateDefault, initialRoute, dartEntrypointArgs, platformViewsController2, automaticallyRegisterPlugins, waitForRestorationData);
        }
        this.activeEngines.add(flutterEngineSpawn);
        flutterEngineSpawn.addEngineLifecycleListener(new FlutterEngine.EngineLifecycleListener() { // from class: io.flutter.embedding.engine.FlutterEngineGroup.1
            @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
            public void onEngineWillDestroy() {
                FlutterEngineGroup.this.activeEngines.remove(flutterEngineSpawn);
            }

            @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
            public void onPreEngineRestart() {
            }
        });
        return flutterEngineSpawn;
    }

    @j1
    FlutterEngine createEngine(Context context, @n0 PlatformViewsController platformViewsController, boolean z10, boolean z11) {
        return new FlutterEngine(context, null, null, platformViewsController, null, z10, z11, this);
    }
}
