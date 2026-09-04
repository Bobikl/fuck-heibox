package android.app;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class NotificationChannelGroup implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ NotificationChannelGroup(String str, CharSequence charSequence) {
    }

    public native /* synthetic */ List<NotificationChannel> getChannels();

    public native /* synthetic */ String getId();

    public native /* synthetic */ CharSequence getName();
}
