package android.content.pm;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.os.UserHandle;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ShortcutInfo implements Parcelable {

    public /* synthetic */ class Builder {
        static {
            throw new NoClassDefFoundError();
        }

        public /* synthetic */ Builder(Context context, String str) {
        }

        @NonNull
        public native /* synthetic */ ShortcutInfo build();

        @NonNull
        public native /* synthetic */ Builder setActivity(@NonNull ComponentName componentName);

        @NonNull
        public native /* synthetic */ Builder setCategories(Set<String> set);

        @NonNull
        public native /* synthetic */ Builder setDisabledMessage(@NonNull CharSequence charSequence);

        @NonNull
        public native /* synthetic */ Builder setExcludedFromSurfaces(int i10);

        @NonNull
        public native /* synthetic */ Builder setExtras(@NonNull PersistableBundle persistableBundle);

        @NonNull
        public native /* synthetic */ Builder setIcon(Icon icon);

        @NonNull
        public native /* synthetic */ Builder setIntents(@NonNull Intent[] intentArr);

        @NonNull
        public native /* synthetic */ Builder setLongLabel(@NonNull CharSequence charSequence);

        @NonNull
        public native /* synthetic */ Builder setRank(int i10);

        @NonNull
        public native /* synthetic */ Builder setShortLabel(@NonNull CharSequence charSequence);
    }

    static {
        throw new NoClassDefFoundError();
    }

    @Nullable
    public native /* synthetic */ ComponentName getActivity();

    @Nullable
    public native /* synthetic */ Set<String> getCategories();

    @Nullable
    public native /* synthetic */ CharSequence getDisabledMessage();

    @Nullable
    public native /* synthetic */ PersistableBundle getExtras();

    @NonNull
    public native /* synthetic */ String getId();

    @Nullable
    public native /* synthetic */ Intent[] getIntents();

    public native /* synthetic */ long getLastChangedTimestamp();

    @Nullable
    public native /* synthetic */ CharSequence getLongLabel();

    @NonNull
    public native /* synthetic */ String getPackage();

    public native /* synthetic */ int getRank();

    @Nullable
    public native /* synthetic */ CharSequence getShortLabel();

    public native /* synthetic */ UserHandle getUserHandle();

    public native /* synthetic */ boolean hasKeyFieldsOnly();

    public native /* synthetic */ boolean isDeclaredInManifest();

    public native /* synthetic */ boolean isDynamic();

    public native /* synthetic */ boolean isEnabled();

    public native /* synthetic */ boolean isImmutable();

    public native /* synthetic */ boolean isPinned();
}
