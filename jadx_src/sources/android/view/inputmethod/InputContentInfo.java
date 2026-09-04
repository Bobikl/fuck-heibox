package android.view.inputmethod;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class InputContentInfo implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ InputContentInfo(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
    }

    @NonNull
    public native /* synthetic */ Uri getContentUri();

    @NonNull
    public native /* synthetic */ ClipDescription getDescription();

    @Nullable
    public native /* synthetic */ Uri getLinkUri();

    public native /* synthetic */ void releasePermission();

    public native /* synthetic */ void requestPermission();
}
