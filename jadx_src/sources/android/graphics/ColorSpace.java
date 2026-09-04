package android.graphics;

import android.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class ColorSpace {

    public final /* synthetic */ class Named extends Enum {
        static {
            throw new NoClassDefFoundError();
        }
    }

    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public static native /* synthetic */ ColorSpace get(@NonNull Named named);

    public native /* synthetic */ boolean equals(Object obj);

    public abstract /* synthetic */ boolean isWideGamut();
}
