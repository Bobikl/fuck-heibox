package io.flutter.embedding.android;

import com.google.android.play.core.splitcompat.SplitCompatApplication;
import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.deferredcomponents.PlayStoreDeferredComponentManager;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterPlayStoreSplitApplication extends SplitCompatApplication {
    @Override // android.app.Application
    @androidx.annotation.i
    public void onCreate() {
        super.onCreate();
        FlutterInjector.setInstance(new FlutterInjector.Builder().setDeferredComponentManager(new PlayStoreDeferredComponentManager(this, null)).build());
    }
}
