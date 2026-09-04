package android.icu.text;

import android.icu.util.TimeZone;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class DateFormat extends UFormat {
    static {
        throw new NoClassDefFoundError();
    }

    public static final native /* synthetic */ DateFormat getInstanceForSkeleton(String str, Locale locale);

    public final native /* synthetic */ String format(Date date);

    public native /* synthetic */ void setContext(DisplayContext displayContext);

    public native /* synthetic */ void setTimeZone(TimeZone timeZone);
}
