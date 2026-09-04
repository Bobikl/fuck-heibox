package android.app;

import android.annotation.NonNull;
import android.graphics.drawable.Icon;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RemoteAction implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ RemoteAction(@NonNull Icon icon, @NonNull CharSequence charSequence, @NonNull CharSequence charSequence2, @NonNull PendingIntent pendingIntent) {
    }

    @NonNull
    public native /* synthetic */ PendingIntent getActionIntent();

    @NonNull
    public native /* synthetic */ CharSequence getContentDescription();

    @NonNull
    public native /* synthetic */ Icon getIcon();

    @NonNull
    public native /* synthetic */ CharSequence getTitle();

    public native /* synthetic */ boolean isEnabled();

    public native /* synthetic */ void setEnabled(boolean z10);
}
