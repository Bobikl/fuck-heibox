package anetwork.channel.cache;

import anet.channel.util.HttpHelper;
import com.xiaomi.mipush.sdk.Constants;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TimeZone f30162a = TimeZone.getTimeZone("GMT");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f30163b = new ThreadLocal<>();

    private static long a(String str) {
        if (str.length() == 0) {
            return 0L;
        }
        try {
            ParsePosition parsePosition = new ParsePosition(0);
            Date date = d().parse(str, parsePosition);
            if (parsePosition.getIndex() == str.length()) {
                return date.getTime();
            }
        } catch (Exception unused) {
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:0x0077  */
    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    /* JADX WARN: Code duplicated, block: B:44:0x009a  */
    /* JADX WARN: Code duplicated, block: B:47:0x009f A[ADDED_TO_REGION] */
    public static Cache.Entry b(Map<String, List<String>> map) {
        long j10;
        String singleHeaderFieldByKey;
        long jA;
        String singleHeaderFieldByKey2;
        long jA2;
        String singleHeaderFieldByKey3;
        long jA3;
        long j11;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String singleHeaderFieldByKey4 = HttpHelper.getSingleHeaderFieldByKey(map, "Cache-Control");
        boolean z10 = true;
        if (singleHeaderFieldByKey4 != null) {
            j10 = 0;
            for (String str : singleHeaderFieldByKey4.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                String strTrim = str.trim();
                if (strTrim.equals("no-store")) {
                    return null;
                }
                if (!strTrim.equals("no-cache")) {
                    if (strTrim.startsWith("max-age=")) {
                        try {
                            j10 = Long.parseLong(strTrim.substring(8));
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, "Date");
            if (singleHeaderFieldByKey != null) {
                jA = a(singleHeaderFieldByKey);
            } else {
                jA = 0;
            }
            singleHeaderFieldByKey2 = HttpHelper.getSingleHeaderFieldByKey(map, "Expires");
            if (singleHeaderFieldByKey2 != null) {
                jA2 = a(singleHeaderFieldByKey2);
            } else {
                jA2 = 0;
            }
            singleHeaderFieldByKey3 = HttpHelper.getSingleHeaderFieldByKey(map, "Last-Modified");
            if (singleHeaderFieldByKey3 != null) {
                jA3 = a(singleHeaderFieldByKey3);
            } else {
                jA3 = 0;
            }
            String singleHeaderFieldByKey5 = HttpHelper.getSingleHeaderFieldByKey(map, "ETag");
            if (z10) {
                if (jA > 0 || jA2 < jA) {
                    j11 = jA3;
                    if (j11 <= 0) {
                        jCurrentTimeMillis = 0;
                    }
                } else {
                    jCurrentTimeMillis += jA2 - jA;
                }
                if (jCurrentTimeMillis != 0 && singleHeaderFieldByKey5 == null) {
                    return null;
                }
                Cache.Entry entry = new Cache.Entry();
                entry.f30150c = singleHeaderFieldByKey5;
                entry.f30153f = jCurrentTimeMillis;
                entry.f30151d = jA;
                entry.f30152e = j11;
                entry.f30154g = map;
                return entry;
            }
            jCurrentTimeMillis += j10 * 1000;
            j11 = jA3;
            if (jCurrentTimeMillis != 0) {
            }
            Cache.Entry entry2 = new Cache.Entry();
            entry2.f30150c = singleHeaderFieldByKey5;
            entry2.f30153f = jCurrentTimeMillis;
            entry2.f30151d = jA;
            entry2.f30152e = j11;
            entry2.f30154g = map;
            return entry2;
        }
        z10 = false;
        j10 = 0;
        singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, "Date");
        if (singleHeaderFieldByKey != null) {
            jA = a(singleHeaderFieldByKey);
        } else {
            jA = 0;
        }
        singleHeaderFieldByKey2 = HttpHelper.getSingleHeaderFieldByKey(map, "Expires");
        if (singleHeaderFieldByKey2 != null) {
            jA2 = a(singleHeaderFieldByKey2);
        } else {
            jA2 = 0;
        }
        singleHeaderFieldByKey3 = HttpHelper.getSingleHeaderFieldByKey(map, "Last-Modified");
        if (singleHeaderFieldByKey3 != null) {
            jA3 = a(singleHeaderFieldByKey3);
        } else {
            jA3 = 0;
        }
        String singleHeaderFieldByKey6 = HttpHelper.getSingleHeaderFieldByKey(map, "ETag");
        if (z10) {
            if (jA > 0) {
            }
            j11 = jA3;
            if (j11 <= 0) {
                jCurrentTimeMillis = 0;
            }
            if (jCurrentTimeMillis != 0) {
            }
            Cache.Entry entry3 = new Cache.Entry();
            entry3.f30150c = singleHeaderFieldByKey6;
            entry3.f30153f = jCurrentTimeMillis;
            entry3.f30151d = jA;
            entry3.f30152e = j11;
            entry3.f30154g = map;
            return entry3;
        }
        jCurrentTimeMillis += j10 * 1000;
        j11 = jA3;
        if (jCurrentTimeMillis != 0) {
        }
        Cache.Entry entry4 = new Cache.Entry();
        entry4.f30150c = singleHeaderFieldByKey6;
        entry4.f30153f = jCurrentTimeMillis;
        entry4.f30151d = jA;
        entry4.f30152e = j11;
        entry4.f30154g = map;
        return entry4;
    }

    public static String c(long j10) {
        return d().format(new Date(j10));
    }

    private static SimpleDateFormat d() {
        ThreadLocal<SimpleDateFormat> threadLocal = f30163b;
        SimpleDateFormat simpleDateFormat = threadLocal.get();
        if (simpleDateFormat != null) {
            return simpleDateFormat;
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat2.setTimeZone(f30162a);
        threadLocal.set(simpleDateFormat2);
        return simpleDateFormat2;
    }
}
