package android.graphics;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.graphics.drawable.Drawable;
import android.util.Size;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ImageDecoder implements AutoCloseable {

    public /* synthetic */ class ImageInfo {
        static {
            throw new NoClassDefFoundError();
        }

        @Nullable
        public native /* synthetic */ ColorSpace getColorSpace();

        @NonNull
        public native /* synthetic */ Size getSize();
    }

    public /* synthetic */ interface OnHeaderDecodedListener {
        static {
            throw new NoClassDefFoundError();
        }
    }

    public /* synthetic */ interface OnPartialImageListener {
        static {
            throw new NoClassDefFoundError();
        }
    }

    public /* synthetic */ class Source {
        static {
            throw new NoClassDefFoundError();
        }
    }

    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public static native /* synthetic */ Source createSource(@NonNull ByteBuffer byteBuffer);

    @NonNull
    public static native /* synthetic */ Bitmap decodeBitmap(@NonNull Source source, @NonNull OnHeaderDecodedListener onHeaderDecodedListener) throws IOException;

    @NonNull
    public static native /* synthetic */ Drawable decodeDrawable(@NonNull Source source, @NonNull OnHeaderDecodedListener onHeaderDecodedListener) throws IOException;

    public native /* synthetic */ void setAllocator(int i10);

    public native /* synthetic */ void setMemorySizePolicy(int i10);

    public native /* synthetic */ void setOnPartialImageListener(@Nullable OnPartialImageListener onPartialImageListener);

    public native /* synthetic */ void setTargetColorSpace(ColorSpace colorSpace);

    public native /* synthetic */ void setTargetSize(int i10, int i11);
}
