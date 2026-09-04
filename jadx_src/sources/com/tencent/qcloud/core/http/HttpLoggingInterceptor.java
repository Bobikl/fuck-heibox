package com.tencent.qcloud.core.http;

import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import okhttp3.Protocol;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.i;
import okhttp3.internal.platform.Platform;
import okhttp3.u;

/* JADX INFO: loaded from: classes4.dex */
public final class HttpLoggingInterceptor implements u {
    private static final Charset UTF8 = Charset.forName("UTF-8");
    private volatile Level level;
    private final Logger logger;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface Logger {
        public static final Logger DEFAULT = new Logger() { // from class: com.tencent.qcloud.core.http.HttpLoggingInterceptor.Logger.1
            @Override // com.tencent.qcloud.core.http.HttpLoggingInterceptor.Logger
            public void logException(Exception exc, String str) {
                Platform.get().log(4, str, (Throwable) null);
            }

            @Override // com.tencent.qcloud.core.http.HttpLoggingInterceptor.Logger
            public void logRequest(String str) {
                Platform.get().log(4, str, (Throwable) null);
            }

            @Override // com.tencent.qcloud.core.http.HttpLoggingInterceptor.Logger
            public void logResponse(c0 c0Var, String str) {
                Platform.get().log(4, str, (Throwable) null);
            }
        };

        void logException(Exception exc, String str);

        void logRequest(String str);

        void logResponse(c0 c0Var, String str);
    }

    public HttpLoggingInterceptor() {
        this(Logger.DEFAULT);
    }

    public HttpLoggingInterceptor(Logger logger) {
        this.level = Level.NONE;
        this.logger = logger;
    }

    public Level getLevel() {
        return this.level;
    }

    @Override // okhttp3.u
    public c0 intercept(u.a aVar) throws Exception {
        Level level = this.level;
        a0 a0VarRequest = aVar.request();
        if (level == Level.NONE) {
            return aVar.proceed(a0VarRequest);
        }
        i iVarConnection = aVar.connection();
        OkHttpLoggingUtils.logRequest(a0VarRequest, iVarConnection != null ? iVarConnection.protocol() : Protocol.HTTP_1_1, level, this.logger);
        long jNanoTime = System.nanoTime();
        try {
            c0 c0VarProceed = aVar.proceed(a0VarRequest);
            OkHttpLoggingUtils.logResponse(c0VarProceed, TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime), level, this.logger);
            return c0VarProceed;
        } catch (Exception e10) {
            this.logger.logException(e10, "<-- HTTP FAILED: " + e10);
            throw e10;
        }
    }

    public HttpLoggingInterceptor setLevel(Level level) {
        if (level == null) {
            throw new NullPointerException("level == null. Use Level.NONE instead.");
        }
        this.level = level;
        return this;
    }
}
