package android.os;

import android.annotation.NonNull;
import android.annotation.Nullable;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class LocaleList implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ LocaleList(@NonNull Locale... localeArr) {
    }

    @NonNull
    public static native /* synthetic */ LocaleList forLanguageTags(@Nullable String str);

    @NonNull
    public static native /* synthetic */ LocaleList getAdjustedDefault();

    @NonNull
    public static native /* synthetic */ LocaleList getDefault();

    public static native /* synthetic */ boolean matchesLanguageAndScript(@NonNull Locale locale, @NonNull Locale locale2);

    public native /* synthetic */ boolean equals(@Nullable Object obj);

    public native /* synthetic */ Locale get(int i10);

    @Nullable
    public native /* synthetic */ Locale getFirstMatch(String[] strArr);

    public native /* synthetic */ int hashCode();

    public native /* synthetic */ int indexOf(Locale locale);

    public native /* synthetic */ boolean isEmpty();

    public native /* synthetic */ int size();

    @NonNull
    public native /* synthetic */ String toLanguageTags();

    public native /* synthetic */ String toString();
}
