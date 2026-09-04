package android.view;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ContentInfo implements Parcelable {

    public final /* synthetic */ class Builder {
        static {
            throw new NoClassDefFoundError();
        }

        public /* synthetic */ Builder(@NonNull ClipData clipData, int i10) {
        }

        public /* synthetic */ Builder(@NonNull ContentInfo contentInfo) {
        }

        @NonNull
        public native /* synthetic */ ContentInfo build();

        @NonNull
        public native /* synthetic */ Builder setClip(@NonNull ClipData clipData);

        @NonNull
        public native /* synthetic */ Builder setExtras(@Nullable Bundle bundle);

        @NonNull
        public native /* synthetic */ Builder setFlags(int i10);

        @NonNull
        public native /* synthetic */ Builder setLinkUri(@Nullable Uri uri);

        @NonNull
        public native /* synthetic */ Builder setSource(int i10);
    }

    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public native /* synthetic */ ClipData getClip();

    @Nullable
    public native /* synthetic */ Bundle getExtras();

    public native /* synthetic */ int getFlags();

    @Nullable
    public native /* synthetic */ Uri getLinkUri();

    public native /* synthetic */ int getSource();
}
