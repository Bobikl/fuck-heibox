package android.content.res.loader;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class ResourcesProvider implements AutoCloseable, Closeable {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public static native /* synthetic */ ResourcesProvider loadFromTable(@NonNull ParcelFileDescriptor parcelFileDescriptor, @Nullable AssetsProvider assetsProvider) throws IOException;
}
