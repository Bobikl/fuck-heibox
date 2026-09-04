package android.view.autofill;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AutofillValue implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }

    public static native /* synthetic */ AutofillValue forText(@Nullable CharSequence charSequence);

    @NonNull
    public native /* synthetic */ CharSequence getTextValue();

    public native /* synthetic */ boolean isDate();

    public native /* synthetic */ boolean isList();

    public native /* synthetic */ boolean isText();

    public native /* synthetic */ boolean isToggle();
}
