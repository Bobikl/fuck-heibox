package android.os;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.system.ErrnoException;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SharedMemory implements Parcelable, Closeable {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public static native /* synthetic */ SharedMemory create(@Nullable String str, int i10) throws ErrnoException;

    @NonNull
    public native /* synthetic */ ByteBuffer mapReadWrite() throws ErrnoException;
}
