package com.tencent.qcloud.core.logger;

import android.util.Log;
import com.max.hbutils.utils.w;
import com.meituan.robust.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class FileLogItem {
    private String msg;
    private int priority;
    private String tag;
    private String threadName;
    private Throwable throwable;
    private long timestamp = System.currentTimeMillis();
    private long threadId = Thread.currentThread().getId();

    public FileLogItem(String str, int i10, String str2, Throwable th2) {
        this.threadName = null;
        this.priority = i10;
        this.tag = str;
        this.msg = str2;
        this.throwable = th2;
        this.threadName = Thread.currentThread().getName();
    }

    private static String getPriorityString(int i10) {
        if (i10 == 2) {
            return "VERBOSE";
        }
        if (i10 == 3) {
            return "DEBUG";
        }
        if (i10 == 4) {
            return "INFO";
        }
        if (i10 != 5) {
            return i10 != 6 ? "UNKNOWN" : "ERROR";
        }
        return "WARN";
    }

    private static String timeUtils(long j10, String str) {
        Date date = new Date(j10);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        return new SimpleDateFormat(str, Locale.CHINA).format(gregorianCalendar.getTime());
    }

    public long getLength() {
        String str = this.msg;
        return (str != null ? str.length() : 0) + 40;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getPriorityString(this.priority));
        sb2.append("/");
        sb2.append(timeUtils(this.timestamp, w.f73604k));
        sb2.append(Constants.ARRAY_TYPE);
        sb2.append(this.threadName);
        sb2.append(" ");
        sb2.append(this.threadId);
        sb2.append("]");
        sb2.append(Constants.ARRAY_TYPE);
        sb2.append(this.tag);
        sb2.append("]");
        sb2.append(Constants.ARRAY_TYPE);
        sb2.append(this.msg);
        sb2.append("]");
        if (this.throwable != null) {
            sb2.append(" * Exception :\n");
            sb2.append(Log.getStackTraceString(this.throwable));
        }
        sb2.append("\n");
        return sb2.toString();
    }
}
