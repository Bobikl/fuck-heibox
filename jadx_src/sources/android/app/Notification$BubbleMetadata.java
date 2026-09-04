package android.app;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.graphics.drawable.Icon;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Notification$BubbleMetadata implements Parcelable {

    public final /* synthetic */ class Builder {
        static {
            throw new NoClassDefFoundError();
        }

        @Deprecated
        public /* synthetic */ Builder() {
        }

        public /* synthetic */ Builder(@NonNull PendingIntent pendingIntent, @NonNull Icon icon) {
        }

        public /* synthetic */ Builder(@NonNull String str) {
        }

        @NonNull
        public native /* synthetic */ Notification$BubbleMetadata build();

        @NonNull
        public native /* synthetic */ Builder setAutoExpandBubble(boolean z10);

        @NonNull
        public native /* synthetic */ Builder setDeleteIntent(@Nullable PendingIntent pendingIntent);

        @NonNull
        public native /* synthetic */ Builder setDesiredHeight(int i10);

        @NonNull
        public native /* synthetic */ Builder setDesiredHeightResId(int i10);

        @NonNull
        public native /* synthetic */ Builder setIcon(@NonNull Icon icon);

        @NonNull
        public native /* synthetic */ Builder setIntent(@NonNull PendingIntent pendingIntent);

        @NonNull
        public native /* synthetic */ Builder setSuppressNotification(boolean z10);
    }

    static {
        throw new NoClassDefFoundError();
    }

    public native /* synthetic */ boolean getAutoExpandBubble();

    @Nullable
    public native /* synthetic */ PendingIntent getDeleteIntent();

    public native /* synthetic */ int getDesiredHeight();

    public native /* synthetic */ int getDesiredHeightResId();

    @Nullable
    public native /* synthetic */ Icon getIcon();

    @Nullable
    public native /* synthetic */ PendingIntent getIntent();

    public native /* synthetic */ boolean isNotificationSuppressed();
}
