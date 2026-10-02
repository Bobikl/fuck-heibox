package dev.heybox.hook;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.function.Consumer;

/** 仅在设置页存在时观察生命周期；最后一个窗口关闭即注销。 */
final class HostSettingsDialogs implements Application.ActivityLifecycleCallbacks {
    private final DialogSessions<Activity, HostSettingsDialog> sessions;

    HostSettingsDialogs(Application application, SharedPreferences preferences,
                        SafePreferences safePreferences, Consumer<String> diagnostic) {
        sessions = new DialogSessions<>(new DialogSessions.Host<>() {
            public boolean usable(Activity owner) {
                return !owner.isFinishing() && !owner.isDestroyed();
            }
            public HostSettingsDialog create(Activity owner, Runnable dismissed) {
                HostSettingsDialog dialog = new HostSettingsDialog(
                        owner, preferences, safePreferences);
                dialog.setOnDismissListener(ignored -> dismissed.run());
                return dialog;
            }
            public void show(HostSettingsDialog dialog) { dialog.show(); }
            public void dismiss(HostSettingsDialog dialog) {
                try {
                    dialog.dismiss();
                } catch (RuntimeException exception) {
                    diagnostic.accept("SETTINGS_DISMISS_ERROR "
                            + exception.getClass().getSimpleName());
                }
            }
            public void observe() {
                application.registerActivityLifecycleCallbacks(HostSettingsDialogs.this);
            }
            public void stopObserving() {
                application.unregisterActivityLifecycleCallbacks(HostSettingsDialogs.this);
            }
        });
    }

    void open(Activity owner) { sessions.open(owner); }
    @Override public void onActivityDestroyed(Activity activity) { sessions.destroyed(activity); }
    @Override public void onActivityCreated(Activity activity, Bundle state) { }
    @Override public void onActivityStarted(Activity activity) { }
    @Override public void onActivityResumed(Activity activity) { }
    @Override public void onActivityPaused(Activity activity) { }
    @Override public void onActivityStopped(Activity activity) { }
    @Override public void onActivitySaveInstanceState(Activity activity, Bundle state) { }
}
