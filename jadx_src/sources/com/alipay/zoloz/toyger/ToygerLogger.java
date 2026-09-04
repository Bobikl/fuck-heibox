package com.alipay.zoloz.toyger;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ToygerLogger {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private int LOG_LEVEL = 2;

    public int d(String str, String str2) {
        if (this.LOG_LEVEL <= 3) {
            return debug(str, str2);
        }
        return -1;
    }

    public int d(String str, String str2, Throwable th2) {
        if (this.LOG_LEVEL > 3) {
            return -1;
        }
        return debug(str, str2 + '\n' + getStackTraceString(th2));
    }

    public int d(String str, Throwable th2) {
        if (this.LOG_LEVEL <= 3) {
            return debug(str, getStackTraceString(th2));
        }
        return -1;
    }

    public abstract int debug(String str, String str2);

    public int e(String str, String str2) {
        if (this.LOG_LEVEL <= 6) {
            return error(str, str2);
        }
        return -1;
    }

    public int e(String str, String str2, Throwable th2) {
        if (this.LOG_LEVEL > 6) {
            return -1;
        }
        return error(str, str2 + '\n' + getStackTraceString(th2));
    }

    public int e(String str, Throwable th2) {
        if (this.LOG_LEVEL <= 6) {
            return error(str, getStackTraceString(th2));
        }
        return -1;
    }

    public abstract int error(String str, String str2);

    protected abstract String getStackTraceString(Throwable th2);

    public int i(String str, String str2) {
        if (this.LOG_LEVEL <= 4) {
            return info(str, str2);
        }
        return -1;
    }

    public int i(String str, String str2, Throwable th2) {
        if (this.LOG_LEVEL > 4) {
            return -1;
        }
        return info(str, str2 + '\n' + getStackTraceString(th2));
    }

    public int i(String str, Throwable th2) {
        if (this.LOG_LEVEL <= 4) {
            return info(str, getStackTraceString(th2));
        }
        return -1;
    }

    public abstract int info(String str, String str2);

    public void setLogLevel(int i10) {
        if (i10 < 2 || i10 > 7) {
            throw new RuntimeException("The level value should between [2 , 7]");
        }
        this.LOG_LEVEL = i10;
    }

    public int v(String str, String str2) {
        if (this.LOG_LEVEL <= 2) {
            return verbose(str, str2);
        }
        return -1;
    }

    public int v(String str, String str2, Throwable th2) {
        if (this.LOG_LEVEL > 2) {
            return -1;
        }
        return verbose(str, str2 + '\n' + getStackTraceString(th2));
    }

    public int v(String str, Throwable th2) {
        if (this.LOG_LEVEL <= 2) {
            return verbose(str, getStackTraceString(th2));
        }
        return -1;
    }

    public abstract int verbose(String str, String str2);

    public int w(String str, String str2) {
        if (this.LOG_LEVEL <= 5) {
            return warn(str, str2);
        }
        return -1;
    }

    public int w(String str, String str2, Throwable th2) {
        if (this.LOG_LEVEL > 5) {
            return -1;
        }
        return warn(str, str2 + '\n' + getStackTraceString(th2));
    }

    public int w(String str, Throwable th2) {
        if (this.LOG_LEVEL <= 5) {
            return warn(str, getStackTraceString(th2));
        }
        return -1;
    }

    public abstract int warn(String str, String str2);
}
