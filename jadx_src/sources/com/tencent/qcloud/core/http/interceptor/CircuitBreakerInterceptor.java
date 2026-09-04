package com.tencent.qcloud.core.http.interceptor;

import com.tencent.qcloud.core.http.HttpRequest;
import com.tencent.qcloud.core.http.HttpTask;
import com.tencent.qcloud.core.http.QCloudHttpClient;
import com.tencent.qcloud.core.logger.QCloudLogger;
import com.tencent.qcloud.core.task.TaskManager;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.u;

/* JADX INFO: loaded from: classes4.dex */
public class CircuitBreakerInterceptor implements u {
    private static final int THRESHOLD_STATE_SWITCH_FOR_CONTINUOUS_FAIL = 5;
    private static final int THRESHOLD_STATE_SWITCH_FOR_CONTINUOUS_SUCCESS = 2;
    private static final long TIMEOUT_FOR_OPEN_STATE = 10000;
    private static final long TIMEOUT_FOR_RESET_ALL = 60000;
    private long entryOpenStateTimestamp;
    private long recentErrorTimestamp;
    private AtomicInteger failedCount = new AtomicInteger(0);
    private AtomicInteger successCount = new AtomicInteger(0);
    private State state = State.CLOSED;
    private FootprintWriter footprintWriter = new FootprintWriter();

    public static class FootprintWriter {
        private Set<String> tasks;

        private FootprintWriter() {
            this.tasks = new HashSet();
        }

        String getResourceId(HttpTask httpTask) {
            HttpRequest httpRequestRequest = httpTask.request();
            return httpRequestRequest.method() + httpRequestRequest.url().getHost() + "/" + httpRequestRequest.url().getPath();
        }

        boolean noRecords(HttpTask httpTask) {
            return !this.tasks.contains(getResourceId(httpTask));
        }

        void remember(HttpTask httpTask) {
            this.tasks.add(getResourceId(httpTask));
        }
    }

    public enum State {
        OPEN,
        CLOSED,
        HALF_OPENED
    }

    @Override // okhttp3.u
    public c0 intercept(u.a aVar) throws IOException {
        State state;
        boolean zNoRecords;
        a0 a0VarRequest = aVar.request();
        HttpTask httpTask = (HttpTask) TaskManager.getInstance().get((String) a0VarRequest.o());
        synchronized (CircuitBreakerInterceptor.class) {
            State state2 = this.state;
            state = State.OPEN;
            if (state2 == state && TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.entryOpenStateTimestamp) > 10000) {
                this.state = State.HALF_OPENED;
            }
            if (this.recentErrorTimestamp > 0 && TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.recentErrorTimestamp) > 60000) {
                this.state = State.CLOSED;
                this.successCount.set(0);
                this.failedCount.set(0);
                this.recentErrorTimestamp = 0L;
            }
            zNoRecords = this.footprintWriter.noRecords(httpTask);
            if (zNoRecords) {
                this.footprintWriter.remember(httpTask);
            }
        }
        if (this.state == state && ((httpTask.isDownloadTask() || httpTask.isUploadTask()) && !zNoRecords)) {
            QCloudLogger.i(QCloudHttpClient.HTTP_LOG_TAG, "CircuitBreaker deny %s", a0VarRequest);
            throw new CircuitBreakerDeniedException("too many continuous errors.");
        }
        try {
            c0 c0VarProceed = aVar.proceed(a0VarRequest);
            synchronized (CircuitBreakerInterceptor.class) {
                State state3 = this.state;
                State state4 = State.HALF_OPENED;
                if (state3 != state4 || this.successCount.incrementAndGet() < 2) {
                    State state5 = this.state;
                    if (state5 == state) {
                        QCloudLogger.i(QCloudHttpClient.HTTP_LOG_TAG, "CircuitBreaker is HALF_OPENED.", new Object[0]);
                        this.state = state4;
                        this.successCount.set(1);
                    } else if (state5 == State.CLOSED) {
                        int i10 = this.failedCount.get();
                        if (i10 > 0) {
                            this.failedCount.set(Math.max(i10 - 2, 0));
                        }
                        QCloudLogger.i(QCloudHttpClient.HTTP_LOG_TAG, "CircuitBreaker get success", new Object[0]);
                    }
                } else {
                    QCloudLogger.i(QCloudHttpClient.HTTP_LOG_TAG, "CircuitBreaker is CLOSED.", new Object[0]);
                    this.state = State.CLOSED;
                    this.failedCount.set(0);
                }
            }
            return c0VarProceed;
        } catch (IOException e10) {
            synchronized (CircuitBreakerInterceptor.class) {
                this.recentErrorTimestamp = System.nanoTime();
                if (this.state == State.CLOSED && this.failedCount.incrementAndGet() >= 5) {
                    QCloudLogger.i(QCloudHttpClient.HTTP_LOG_TAG, "CircuitBreaker is OPEN.", new Object[0]);
                    this.state = State.OPEN;
                    this.entryOpenStateTimestamp = System.nanoTime();
                } else if (this.state == State.HALF_OPENED) {
                    QCloudLogger.i(QCloudHttpClient.HTTP_LOG_TAG, "CircuitBreaker is OPEN.", new Object[0]);
                    this.state = State.OPEN;
                    this.entryOpenStateTimestamp = System.nanoTime();
                } else {
                    QCloudLogger.i(QCloudHttpClient.HTTP_LOG_TAG, "CircuitBreaker get fail: %d", Integer.valueOf(this.failedCount.get()));
                }
                throw e10;
            }
        }
    }
}
