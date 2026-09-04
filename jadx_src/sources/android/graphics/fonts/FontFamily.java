package android.graphics.fonts;

import android.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class FontFamily {

    public final /* synthetic */ class Builder {
        static {
            throw new NoClassDefFoundError();
        }

        public /* synthetic */ Builder(@NonNull Font font) {
        }

        @NonNull
        public native /* synthetic */ Builder addFont(@NonNull Font font);

        @NonNull
        public native /* synthetic */ FontFamily build();
    }

    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public native /* synthetic */ Font getFont(int i10);

    public native /* synthetic */ int getSize();
}
