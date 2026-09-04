package android.app;

import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class NotificationChannel implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ NotificationChannel(String str, CharSequence charSequence, int i10) {
    }

    public native /* synthetic */ boolean canBypassDnd();

    public native /* synthetic */ boolean canShowBadge();

    public native /* synthetic */ void enableLights(boolean z10);

    public native /* synthetic */ void enableVibration(boolean z10);

    public native /* synthetic */ AudioAttributes getAudioAttributes();

    public native /* synthetic */ String getDescription();

    public native /* synthetic */ String getGroup();

    public native /* synthetic */ String getId();

    public native /* synthetic */ int getImportance();

    public native /* synthetic */ int getLightColor();

    public native /* synthetic */ int getLockscreenVisibility();

    public native /* synthetic */ CharSequence getName();

    public native /* synthetic */ Uri getSound();

    public native /* synthetic */ long[] getVibrationPattern();

    public native /* synthetic */ void setBypassDnd(boolean z10);

    public native /* synthetic */ void setDescription(String str);

    public native /* synthetic */ void setGroup(String str);

    public native /* synthetic */ void setImportance(int i10);

    public native /* synthetic */ void setLightColor(int i10);

    public native /* synthetic */ void setLockscreenVisibility(int i10);

    public native /* synthetic */ void setShowBadge(boolean z10);

    public native /* synthetic */ void setSound(Uri uri, AudioAttributes audioAttributes);

    public native /* synthetic */ void setVibrationPattern(long[] jArr);

    public native /* synthetic */ boolean shouldShowLights();

    public native /* synthetic */ boolean shouldVibrate();
}
