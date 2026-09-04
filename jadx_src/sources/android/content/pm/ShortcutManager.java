package android.content.pm;

import android.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class ShortcutManager {
    static {
        throw new NoClassDefFoundError();
    }

    public native /* synthetic */ boolean addDynamicShortcuts(@NonNull List<ShortcutInfo> list);

    public native /* synthetic */ void disableShortcuts(@NonNull List<String> list, CharSequence charSequence);

    public native /* synthetic */ void enableShortcuts(@NonNull List<String> list);

    @NonNull
    public native /* synthetic */ List<ShortcutInfo> getDynamicShortcuts();

    public native /* synthetic */ int getIconMaxHeight();

    public native /* synthetic */ int getIconMaxWidth();

    @NonNull
    public native /* synthetic */ List<ShortcutInfo> getManifestShortcuts();

    public native /* synthetic */ int getMaxShortcutCountPerActivity();

    @NonNull
    public native /* synthetic */ List<ShortcutInfo> getPinnedShortcuts();

    public native /* synthetic */ boolean isRateLimitingActive();

    public native /* synthetic */ void removeAllDynamicShortcuts();

    public native /* synthetic */ void removeDynamicShortcuts(@NonNull List<String> list);

    public native /* synthetic */ void reportShortcutUsed(String str);

    public native /* synthetic */ boolean setDynamicShortcuts(@NonNull List<ShortcutInfo> list);

    public native /* synthetic */ boolean updateShortcuts(@NonNull List<ShortcutInfo> list);
}
