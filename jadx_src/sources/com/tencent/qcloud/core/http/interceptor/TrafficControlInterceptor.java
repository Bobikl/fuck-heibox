package com.tencent.qcloud.core.http.interceptor;

import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.http.HttpTask;
import com.tencent.qcloud.core.http.HttpUtil;
import com.tencent.qcloud.core.http.QCloudHttpClient;
import com.tencent.qcloud.core.logger.QCloudLogger;
import com.tencent.qcloud.core.task.TaskManager;
import java.io.IOException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.u;

/* JADX INFO: loaded from: classes4.dex */
public class TrafficControlInterceptor implements u {
    private TrafficStrategy uploadTrafficStrategy = new ModerateTrafficStrategy("UploadStrategy-", 2);
    private TrafficStrategy downloadTrafficStrategy = new AggressiveTrafficStrategy("DownloadStrategy-", 3);

    public static class AggressiveTrafficStrategy extends TrafficStrategy {
        AggressiveTrafficStrategy(String str, int i10) {
            super(str, i10, i10);
        }
    }

    public static class ModerateTrafficStrategy extends TrafficStrategy {
        ModerateTrafficStrategy(String str, int i10) {
            super(str, 1, i10);
        }
    }

    public static class ResizableSemaphore extends Semaphore {
        ResizableSemaphore(int i10, boolean z10) {
            super(i10, z10);
        }

        @Override // java.util.concurrent.Semaphore
        protected void reducePermits(int i10) {
            super.reducePermits(i10);
        }
    }

    public static abstract class TrafficStrategy {
        static final long BOOST_MODE_DURATION = TimeUnit.SECONDS.toNanos(3);
        static final int SINGLE_THREAD_SAFE_SPEED = 100;
        private long boostModeExhaustedTime;
        private AtomicInteger concurrent;
        private ResizableSemaphore controller;
        private final int maxConcurrent;
        private final String name;

        TrafficStrategy(String str, int i10, int i11) {
            this.name = str;
            this.maxConcurrent = i11;
            this.controller = new ResizableSemaphore(i10, true);
            this.concurrent = new AtomicInteger(i10);
            QCloudLogger.d(QCloudHttpClient.HTTP_LOG_TAG, str + " init concurrent is " + i10, new Object[0]);
        }

        private synchronized void adjustConcurrent(int i10, boolean z10) {
            int i11 = i10 - this.concurrent.get();
            if (i11 != 0) {
                this.concurrent.set(i10);
                if (i11 <= 0) {
                    this.controller.reducePermits(i11 * (-1));
                    if (z10) {
                        this.controller.release();
                    }
                } else if (z10) {
                    this.controller.release(i11 + 1);
                }
                QCloudLogger.i(QCloudHttpClient.HTTP_LOG_TAG, this.name + "set concurrent to " + i10, new Object[0]);
            } else if (z10) {
                this.controller.release();
            }
        }

        void reportException(a0 a0Var, IOException iOException) {
            this.controller.release();
        }

        void reportSpeed(a0 a0Var, double d10) {
            if (d10 <= 0.0d) {
                this.controller.release();
                return;
            }
            QCloudLogger.d(QCloudHttpClient.HTTP_LOG_TAG, this.name + " %s streaming speed is %1.3f KBps", a0Var, Double.valueOf(d10));
            int i10 = this.concurrent.get();
            if (d10 > 240.0d && i10 < this.maxConcurrent) {
                this.boostModeExhaustedTime = System.nanoTime() + BOOST_MODE_DURATION;
                adjustConcurrent(i10 + 1, true);
                return;
            }
            if (d10 > 120.0d && this.boostModeExhaustedTime > 0) {
                this.boostModeExhaustedTime = System.nanoTime() + BOOST_MODE_DURATION;
                this.controller.release();
            } else if (d10 <= 0.0d || i10 <= 1 || d10 >= 70.0d) {
                this.controller.release();
            } else {
                adjustConcurrent(i10 - 1, true);
            }
        }

        void reportTimeOut(a0 a0Var) {
            adjustConcurrent(1, true);
        }

        void waitForPermit() {
            try {
                if (this.concurrent.get() > 1 && System.nanoTime() > this.boostModeExhaustedTime) {
                    adjustConcurrent(1, false);
                }
                this.controller.acquire();
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }
    }

    private double getAverageStreamingSpeed(HttpTask httpTask, long j10) {
        if (j10 == 0) {
            return 0.0d;
        }
        return (httpTask.getTransferBodySize() / 1024.0d) / (j10 / 1000.0d);
    }

    private TrafficStrategy getSuitableStrategy(HttpTask httpTask) {
        if (!httpTask.isEnableTraffic()) {
            return null;
        }
        if (httpTask.isDownloadTask()) {
            return this.downloadTrafficStrategy;
        }
        if (httpTask.isUploadTask()) {
            return this.uploadTrafficStrategy;
        }
        return null;
    }

    private c0 processRequest(u.a aVar, a0 a0Var) throws IOException {
        return aVar.proceed(a0Var);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    @Override // okhttp3.u
    public c0 intercept(u.a aVar) throws IOException {
        IOException iOException;
        a0 a0VarRequest = aVar.request();
        HttpTask httpTask = (HttpTask) TaskManager.getInstance().get((String) a0VarRequest.o());
        TrafficStrategy suitableStrategy = getSuitableStrategy(httpTask);
        if (suitableStrategy != null) {
            suitableStrategy.waitForPermit();
        }
        QCloudLogger.i(QCloudHttpClient.HTTP_LOG_TAG, " %s begin to execute", a0VarRequest);
        try {
            long jNanoTime = System.nanoTime();
            c0 c0VarProcessRequest = processRequest(aVar, a0VarRequest);
            if (httpTask.isDownloadTask()) {
                httpTask.convertResponse(c0VarProcessRequest);
            }
            if (suitableStrategy != null) {
                if (c0VarProcessRequest.c1()) {
                    suitableStrategy.reportSpeed(a0VarRequest, getAverageStreamingSpeed(httpTask, TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime)));
                } else {
                    suitableStrategy.reportException(a0VarRequest, null);
                }
            }
            return c0VarProcessRequest;
        } catch (QCloudClientException e10) {
            if (e10.getCause() instanceof IOException) {
                e = (IOException) e10.getCause();
            } else {
                iOException = new IOException(e10);
                e = iOException;
            }
            if (suitableStrategy != null) {
                if (HttpUtil.isNetworkTimeoutError(e)) {
                    suitableStrategy.reportTimeOut(a0VarRequest);
                } else {
                    suitableStrategy.reportException(a0VarRequest, e);
                }
            }
            throw e;
        } catch (QCloudServiceException e11) {
            if (e11.getCause() instanceof IOException) {
                e = (IOException) e11.getCause();
            } else {
                iOException = new IOException(e11);
                e = iOException;
            }
            if (suitableStrategy != null) {
                if (HttpUtil.isNetworkTimeoutError(e)) {
                    suitableStrategy.reportTimeOut(a0VarRequest);
                } else {
                    suitableStrategy.reportException(a0VarRequest, e);
                }
            }
            throw e;
        } catch (IOException e12) {
            e = e12;
            if (suitableStrategy != null) {
                if (HttpUtil.isNetworkTimeoutError(e)) {
                    suitableStrategy.reportTimeOut(a0VarRequest);
                } else {
                    suitableStrategy.reportException(a0VarRequest, e);
                }
            }
            throw e;
        }
    }
}
