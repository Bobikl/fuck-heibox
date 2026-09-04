package com.tencent.qcloud.core.http.interceptor;

import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.http.HttpConfiguration;
import com.tencent.qcloud.core.http.HttpTask;
import com.tencent.qcloud.core.http.QCloudHttpClient;
import com.tencent.qcloud.core.logger.QCloudLogger;
import com.tencent.qcloud.core.task.RetryStrategy;
import com.tencent.qcloud.core.task.TaskManager;
import com.tencent.qcloud.core.util.QCloudUtils;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.Protocol;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.u;
import okio.BufferedSource;
import qb.a;

/* JADX INFO: loaded from: classes4.dex */
public class RetryInterceptor implements u {
    private static final int MIN_CLOCK_SKEWED_OFFSET = 600;
    private static final int NETWORK_DETECT_RETRY_DELAY = 3000;
    private static volatile Map<String, HostReliable> hostReliables = new HashMap();
    private RetryStrategy.WeightAndReliableAddition additionComputer = new RetryStrategy.WeightAndReliableAddition();
    private RetryStrategy retryStrategy;

    public static class HostReliable {
        private static final int defaultReliable = 2;
        private final String host;
        private final int maxReliable;
        private final int minReliable;
        private int reliable;
        private final long resetPeriod;

        private HostReliable(String str) {
            this.maxReliable = 4;
            this.minReliable = 0;
            this.resetPeriod = 300000L;
            this.host = str;
            this.reliable = 2;
            new Timer(str + "reliable").schedule(new TimerTask() { // from class: com.tencent.qcloud.core.http.interceptor.RetryInterceptor.HostReliable.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                }
            }, 300000L, 300000L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void decreaseReliable() {
            int i10 = this.reliable;
            if (i10 > 0) {
                this.reliable = i10 - 1;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized int getReliable() {
            return this.reliable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void increaseReliable() {
            int i10 = this.reliable;
            if (i10 < 4) {
                this.reliable = i10 + 1;
            }
        }

        private synchronized void resetReliable() {
            this.reliable = 2;
        }

        private synchronized void zeroReliable() {
            this.reliable = 0;
        }
    }

    public RetryInterceptor(RetryStrategy retryStrategy) {
        this.retryStrategy = retryStrategy;
    }

    private void decreaseHostAccess(String str) {
        HostReliable hostReliable = hostReliables.get(str);
        if (hostReliable != null) {
            hostReliable.decreaseReliable();
        } else {
            hostReliables.put(str, new HostReliable(str));
        }
    }

    private c0 executeTaskOnce(u.a aVar, a0 a0Var, HttpTask httpTask) throws IOException {
        try {
            if (httpTask.isCanceled()) {
                throw new IOException("CANCELED");
            }
            return processSingleRequest(aVar, a0Var);
        } catch (ProtocolException e10) {
            if (e10.getMessage() != null && e10.getMessage().contains("HTTP 204 had non-zero Content-Length: ")) {
                return new c0.a().E(a0Var).y(e10.toString()).g(204).B(Protocol.HTTP_1_1).c();
            }
            e10.printStackTrace();
            throw e10;
        } catch (IOException e11) {
            e11.printStackTrace();
            throw e11;
        }
    }

    private int getHostReliable(String str) {
        HostReliable hostReliable = hostReliables.get(str);
        if (hostReliable != null) {
            return hostReliable.getReliable();
        }
        return 2;
    }

    private void increaseHostReliable(String str) {
        HostReliable hostReliable = hostReliables.get(str);
        if (hostReliable != null) {
            hostReliable.increaseReliable();
        } else {
            hostReliables.put(str, new HostReliable(str));
        }
    }

    private boolean isRecoverable(IOException iOException) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            return iOException instanceof SocketTimeoutException;
        }
        return (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private boolean isUserCancelled(IOException iOException) {
        return (iOException == null || iOException.getMessage() == null || !iOException.getMessage().toLowerCase().equals(a.f138642e)) ? false : true;
    }

    private boolean shouldRetry(a0 a0Var, c0 c0Var, int i10, int i11, long j10, IOException iOException, int i12) {
        if (isUserCancelled(iOException)) {
            return false;
        }
        int hostReliable = getHostReliable(a0Var.q().getHost());
        int retryAddition = this.additionComputer.getRetryAddition(i11, hostReliable);
        QCloudLogger.i(QCloudHttpClient.HTTP_LOG_TAG, String.format(Locale.ENGLISH, "attempts = %d, weight = %d, reliable = %d, addition = %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(hostReliable), Integer.valueOf(retryAddition)), new Object[0]);
        if (!this.retryStrategy.shouldRetry(i10, System.nanoTime() - j10, retryAddition) || !this.retryStrategy.getQCloudHttpRetryHandler().shouldRetry(a0Var, c0Var, iOException)) {
            return false;
        }
        if (iOException == null || !isRecoverable(iOException)) {
            return i12 == 500 || i12 == 502 || i12 == 503 || i12 == 504;
        }
        return true;
    }

    String getClockSkewError(c0 c0Var, int i10) {
        if (c0Var == null || i10 != 403) {
            return null;
        }
        if (c0Var.getRequest().m().toUpperCase().equals("HEAD")) {
            return QCloudServiceException.ERR0R_REQUEST_IS_EXPIRED;
        }
        d0 d0VarQ = c0Var.q();
        if (d0VarQ == null) {
            return null;
        }
        try {
            BufferedSource source = d0VarQ.getSource();
            source.request(Long.MAX_VALUE);
            String string = source.getBufferField().clone().readString(Charset.forName("UTF-8"));
            Pattern patternCompile = Pattern.compile("<Code>(RequestTimeTooSkewed|AccessDenied)</Code>");
            Pattern patternCompile2 = Pattern.compile("<Message>Request has expired</Message>");
            Matcher matcher = patternCompile.matcher(string);
            Matcher matcher2 = patternCompile2.matcher(string);
            if (!matcher.find()) {
                return null;
            }
            String strGroup = matcher.group(1);
            if (QCloudServiceException.ERR0R_REQUEST_TIME_TOO_SKEWED.equals(strGroup)) {
                return QCloudServiceException.ERR0R_REQUEST_TIME_TOO_SKEWED;
            }
            if ("AccessDenied".equals(strGroup) && matcher2.find()) {
                return QCloudServiceException.ERR0R_REQUEST_IS_EXPIRED;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // okhttp3.u
    public c0 intercept(u.a aVar) throws IOException {
        a0 a0VarRequest = aVar.request();
        return processRequest(aVar, a0VarRequest, (HttpTask) TaskManager.getInstance().get((String) a0VarRequest.o()));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0114 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    c0 processRequest(u.a aVar, a0 a0Var, HttpTask httpTask) throws IOException {
        IOException e10;
        int i10;
        int iX;
        c0 c0Var;
        String str;
        String clockSkewError;
        int i11;
        c0 c0Var2;
        String strC;
        if (httpTask == null || httpTask.isCanceled()) {
            throw new IOException("CANCELED");
        }
        long jNanoTime = System.nanoTime();
        IOException iOException = null;
        c0 c0VarExecuteTaskOnce = null;
        int i12 = 0;
        while (true) {
            long nextDelay = this.retryStrategy.getNextDelay(i12);
            if (nextDelay > 0) {
                try {
                    TimeUnit.MILLISECONDS.sleep(nextDelay);
                } catch (InterruptedException unused) {
                }
            }
            if (QCloudUtils.isNetworkConnected()) {
                QCloudLogger.i(QCloudHttpClient.HTTP_LOG_TAG, "%s start to execute, attempts is %d", a0Var, Integer.valueOf(i12));
                i10 = i12 + 1;
                c0VarExecuteTaskOnce = executeTaskOnce(aVar, a0Var, httpTask);
                iX = c0VarExecuteTaskOnce.x();
                c0Var = c0VarExecuteTaskOnce;
                e10 = iOException;
                if (c0Var != null) {
                    strC = c0Var.C("Date");
                } else {
                    str = iOException;
                }
                if (e10 == null) {
                    str = strC;
                    str = strC;
                    clockSkewError = getClockSkewError(c0Var, iX);
                    if (clockSkewError != null) {
                        QCloudLogger.i(QCloudHttpClient.HTTP_LOG_TAG, "%s failed for %s", a0Var, clockSkewError);
                        if (str == 0) {
                        }
                        c0Var2 = c0Var;
                        c0VarExecuteTaskOnce = c0Var2;
                    } else {
                        i11 = iX;
                        c0Var2 = c0Var;
                        if (shouldRetry(a0Var, c0Var, i10, httpTask.getWeight(), jNanoTime, e10, i11)) {
                        }
                        QCloudLogger.i(QCloudHttpClient.HTTP_LOG_TAG, "%s ends for %s, code is %d", a0Var, e10, Integer.valueOf(i11));
                        c0VarExecuteTaskOnce = c0Var2;
                    }
                } else {
                    str = strC;
                    str = strC;
                    clockSkewError = getClockSkewError(c0Var, iX);
                    if (clockSkewError != null) {
                        QCloudLogger.i(QCloudHttpClient.HTTP_LOG_TAG, "%s failed for %s", a0Var, clockSkewError);
                        if (str == 0) {
                        }
                        c0Var2 = c0Var;
                        c0VarExecuteTaskOnce = c0Var2;
                    } else {
                        i11 = iX;
                        c0Var2 = c0Var;
                        if (shouldRetry(a0Var, c0Var, i10, httpTask.getWeight(), jNanoTime, e10, i11)) {
                        }
                        QCloudLogger.i(QCloudHttpClient.HTTP_LOG_TAG, "%s ends for %s, code is %d", a0Var, e10, Integer.valueOf(i11));
                        c0VarExecuteTaskOnce = c0Var2;
                    }
                }
            } else {
                try {
                    TimeUnit.MILLISECONDS.sleep(3000L);
                } catch (InterruptedException e11) {
                    e11.printStackTrace();
                }
                if (QCloudUtils.isNetworkConnected()) {
                    QCloudLogger.i(QCloudHttpClient.HTTP_LOG_TAG, "%s start to execute, attempts is %d", a0Var, Integer.valueOf(i12));
                    i10 = i12 + 1;
                    try {
                        c0VarExecuteTaskOnce = executeTaskOnce(aVar, a0Var, httpTask);
                        iX = c0VarExecuteTaskOnce.x();
                        c0Var = c0VarExecuteTaskOnce;
                        e10 = iOException;
                    } catch (IOException e12) {
                        e10 = e12;
                        iX = -1;
                        c0Var = c0VarExecuteTaskOnce;
                    }
                    if (c0Var != null) {
                        strC = c0Var.C("Date");
                    } else {
                        str = iOException;
                    }
                    if (e10 == null || !c0Var.c1()) {
                        str = strC;
                        str = strC;
                        clockSkewError = getClockSkewError(c0Var, iX);
                        if (clockSkewError != null) {
                            QCloudLogger.i(QCloudHttpClient.HTTP_LOG_TAG, "%s failed for %s", a0Var, clockSkewError);
                            if (str == 0 && HttpConfiguration.calculateGlobalTimeOffset(str, new Date()) > 2) {
                                e10 = new IOException(new QCloudServiceException("client clock skewed").setErrorCode(clockSkewError));
                                c0VarExecuteTaskOnce = c0Var;
                            }
                        } else {
                            i11 = iX;
                            c0Var2 = c0Var;
                            if (shouldRetry(a0Var, c0Var, i10, httpTask.getWeight(), jNanoTime, e10, i11) || httpTask.isCanceled()) {
                                QCloudLogger.i(QCloudHttpClient.HTTP_LOG_TAG, "%s ends for %s, code is %d", a0Var, e10, Integer.valueOf(i11));
                                c0VarExecuteTaskOnce = c0Var2;
                            } else {
                                QCloudLogger.i(QCloudHttpClient.HTTP_LOG_TAG, "%s failed for %s, code is %d", a0Var, e10, Integer.valueOf(i11));
                                this.retryStrategy.onTaskEnd(false, e10);
                                i12 = i10;
                                c0VarExecuteTaskOnce = c0Var2;
                                iOException = null;
                            }
                        }
                    } else {
                        if (str != 0) {
                            str = strC;
                            HttpConfiguration.calculateGlobalTimeOffset(str, new Date(), 600);
                        }
                        str = strC;
                        increaseHostReliable(a0Var.q().getHost());
                        this.retryStrategy.onTaskEnd(true, iOException);
                    }
                    c0Var2 = c0Var;
                    c0VarExecuteTaskOnce = c0Var2;
                } else {
                    e10 = new IOException(new QCloudClientException("NetworkNotConnected"));
                }
            }
            if (e10 == null) {
                return c0VarExecuteTaskOnce;
            }
            decreaseHostAccess(a0Var.q().getHost());
            this.retryStrategy.onTaskEnd(false, e10);
            throw e10;
        }
    }

    c0 processSingleRequest(u.a aVar, a0 a0Var) throws IOException {
        return aVar.proceed(a0Var);
    }
}
