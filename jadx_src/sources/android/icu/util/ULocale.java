package android.icu.util;

import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ULocale implements Serializable, Comparable {
    static {
        throw new NoClassDefFoundError();
    }

    public static native /* synthetic */ ULocale addLikelySubtags(ULocale uLocale);

    public static native /* synthetic */ ULocale forLocale(Locale locale);

    public native /* synthetic */ String getScript();
}
