package com.tencent.qcloud.core.http;

import bolts.e;
import com.tencent.qcloud.core.auth.QCloudCredentialProvider;
import com.tencent.qcloud.core.auth.QCloudSelfSigner;
import com.tencent.qcloud.core.auth.QCloudSigner;
import com.tencent.qcloud.core.auth.ScopeLimitCredentialProvider;
import com.tencent.qcloud.core.common.QCloudAuthenticationException;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudDigistListener;
import com.tencent.qcloud.core.common.QCloudProgressListener;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.task.QCloudTask;
import com.tencent.qcloud.core.task.TaskExecutors;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.b0;
import okhttp3.c0;
import okio.Buffer;

/* JADX INFO: loaded from: classes4.dex */
public final class HttpTask<T> extends QCloudTask<HttpResult<T>> {
    private static AtomicInteger increments = new AtomicInteger(1);
    protected final QCloudCredentialProvider credentialProvider;
    protected final HttpRequest<T> httpRequest;
    protected HttpResult<T> httpResult;
    private QCloudProgressListener mProgressListener;
    protected HttpTaskMetrics metrics;
    private NetworkProxy<T> networkProxy;

    HttpTask(HttpRequest<T> httpRequest, QCloudCredentialProvider qCloudCredentialProvider, NetworkClient networkClient) {
        super("HttpTask-" + httpRequest.tag() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + increments.getAndIncrement(), httpRequest.tag());
        this.mProgressListener = new QCloudProgressListener() { // from class: com.tencent.qcloud.core.http.HttpTask.1
            @Override // com.tencent.qcloud.core.common.QCloudProgressListener
            public void onProgress(long j10, long j11) {
                HttpTask.this.onProgress(j10, j11);
            }
        };
        this.httpRequest = httpRequest;
        this.credentialProvider = qCloudCredentialProvider;
        NetworkProxy<T> networkProxy = networkClient.getNetworkProxy();
        this.networkProxy = networkProxy;
        networkProxy.identifier = getIdentifier();
        this.networkProxy.mProgressListener = this.mProgressListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void calculateContentMD5() throws QCloudClientException {
        b0 requestBody = this.httpRequest.getRequestBody();
        if (requestBody == 0) {
            throw new QCloudClientException(new IllegalArgumentException("get md5 canceled, request body is null."));
        }
        if (requestBody instanceof QCloudDigistListener) {
            try {
                if (this.httpRequest.getRequestBody() instanceof MultipartStreamRequestBody) {
                    ((MultipartStreamRequestBody) this.httpRequest.getRequestBody()).addMd5();
                } else {
                    this.httpRequest.addHeader("Content-MD5", ((QCloudDigistListener) requestBody).onGetMd5());
                }
                return;
            } catch (IOException e10) {
                throw new QCloudClientException("calculate md5 error: " + e10.getMessage(), e10);
            }
        }
        Buffer buffer = new Buffer();
        try {
            requestBody.writeTo(buffer);
            this.httpRequest.addHeader("Content-MD5", buffer.md5().base64());
            buffer.close();
        } catch (IOException e11) {
            throw new QCloudClientException("calculate md5 error" + e11.getMessage(), e11);
        }
    }

    private boolean isClockSkewedError(QCloudServiceException qCloudServiceException) {
        return QCloudServiceException.ERR0R_REQUEST_IS_EXPIRED.equals(qCloudServiceException.getErrorCode()) || QCloudServiceException.ERR0R_REQUEST_TIME_TOO_SKEWED.equals(qCloudServiceException.getErrorCode());
    }

    private boolean isCompleteMultipartRequest(HttpRequest httpRequest) {
        Set<String> setKeySet = httpRequest.queries.keySet();
        return setKeySet != null && setKeySet.size() == 1 && setKeySet.contains("uploadId");
    }

    private void signRequest(QCloudSigner qCloudSigner, QCloudHttpRequest qCloudHttpRequest) throws QCloudClientException {
        QCloudCredentialProvider qCloudCredentialProvider = this.credentialProvider;
        if (qCloudCredentialProvider == null) {
            throw new QCloudClientException(new QCloudAuthenticationException("no credentials provider"));
        }
        qCloudSigner.sign(qCloudHttpRequest, qCloudCredentialProvider instanceof ScopeLimitCredentialProvider ? ((ScopeLimitCredentialProvider) qCloudCredentialProvider).getCredentials(qCloudHttpRequest.getCredentialScope()) : qCloudCredentialProvider.getCredentials());
    }

    public HttpTask<T> attachMetric(HttpTaskMetrics httpTaskMetrics) {
        this.metrics = httpTaskMetrics;
        return this;
    }

    @Override // com.tencent.qcloud.core.task.QCloudTask
    public void cancel() {
        this.networkProxy.cancel();
        super.cancel();
    }

    public void convertResponse(c0 c0Var) throws QCloudServiceException, QCloudClientException {
        this.httpResult = this.networkProxy.convertResponse(this.httpRequest, c0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.qcloud.core.task.QCloudTask
    public HttpResult<T> execute() throws QCloudServiceException, QCloudClientException {
        HttpResult<T> httpResult;
        if (this.metrics == null) {
            this.metrics = new HttpTaskMetrics();
        }
        NetworkProxy<T> networkProxy = this.networkProxy;
        HttpTaskMetrics httpTaskMetrics = this.metrics;
        networkProxy.metrics = httpTaskMetrics;
        httpTaskMetrics.onTaskStart();
        if (this.httpRequest.shouldCalculateContentMD5()) {
            this.metrics.onCalculateMD5Start();
            calculateContentMD5();
            this.metrics.onCalculateMD5End();
        }
        if (this.httpRequest.getRequestBody() instanceof ReactiveBody) {
            try {
                ((ReactiveBody) this.httpRequest.getRequestBody()).prepare();
            } catch (IOException e10) {
                throw new QCloudClientException(e10);
            }
        }
        QCloudSigner qCloudSigner = this.httpRequest.getQCloudSigner();
        if (qCloudSigner != null) {
            this.metrics.onSignRequestStart();
            signRequest(qCloudSigner, (QCloudHttpRequest) this.httpRequest);
            this.metrics.onSignRequestEnd();
        }
        QCloudSelfSigner qCloudSelfSigner = this.httpRequest.getQCloudSelfSigner();
        if (qCloudSelfSigner != null) {
            this.metrics.onSignRequestStart();
            qCloudSelfSigner.sign((QCloudHttpRequest) this.httpRequest);
            this.metrics.onSignRequestEnd();
        }
        if (this.httpRequest.getRequestBody() instanceof ProgressBody) {
            ((ProgressBody) this.httpRequest.getRequestBody()).setProgressListener(this.mProgressListener);
        }
        try {
            try {
                this.metrics.onHttpTaskStart();
                this.httpResult = this.networkProxy.executeHttpRequest(this.httpRequest);
                this.metrics.onHttpTaskEnd();
                httpResult = this.httpResult;
                if (this.httpRequest.getRequestBody() instanceof ReactiveBody) {
                    try {
                        ((ReactiveBody) this.httpRequest.getRequestBody()).end(this.httpResult);
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
                if (this.httpRequest.getRequestBody() instanceof StreamingRequestBody) {
                    ((StreamingRequestBody) this.httpRequest.getRequestBody()).release();
                }
            } catch (QCloudServiceException e12) {
                if (!isClockSkewedError(e12)) {
                    throw e12;
                }
                if (qCloudSigner != null) {
                    this.metrics.onSignRequestStart();
                    signRequest(qCloudSigner, (QCloudHttpRequest) this.httpRequest);
                    this.metrics.onSignRequestEnd();
                }
                this.metrics.onHttpTaskStart();
                this.httpResult = this.networkProxy.executeHttpRequest(this.httpRequest);
                this.metrics.onHttpTaskEnd();
                httpResult = this.httpResult;
                if (this.httpRequest.getRequestBody() instanceof ReactiveBody) {
                    try {
                        ((ReactiveBody) this.httpRequest.getRequestBody()).end(this.httpResult);
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                }
                if (this.httpRequest.getRequestBody() instanceof StreamingRequestBody) {
                }
            }
            this.metrics.onTaskEnd();
            return httpResult;
        } catch (Throwable th2) {
            if (this.httpRequest.getRequestBody() instanceof ReactiveBody) {
                try {
                    ((ReactiveBody) this.httpRequest.getRequestBody()).end(this.httpResult);
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
            }
            if (this.httpRequest.getRequestBody() instanceof StreamingRequestBody) {
                ((StreamingRequestBody) this.httpRequest.getRequestBody()).release();
            }
            this.metrics.onTaskEnd();
            throw th2;
        }
    }

    public double getAverageStreamingSpeed(long j10) {
        ProgressBody progressBody;
        if (this.httpRequest.getRequestBody() instanceof ProgressBody) {
            progressBody = (ProgressBody) this.httpRequest.getRequestBody();
        } else {
            progressBody = this.httpRequest.getResponseBodyConverter() instanceof ProgressBody ? (ProgressBody) this.httpRequest.getResponseBodyConverter() : null;
        }
        if (progressBody != null) {
            return (progressBody.getBytesTransferred() / 1024.0d) / (j10 / 1000.0d);
        }
        return 0.0d;
    }

    @Override // com.tencent.qcloud.core.task.QCloudTask
    public HttpResult<T> getResult() {
        return this.httpResult;
    }

    public long getTransferBodySize() {
        ProgressBody progressBody;
        if (this.httpRequest.getRequestBody() instanceof ProgressBody) {
            progressBody = (ProgressBody) this.httpRequest.getRequestBody();
        } else {
            progressBody = this.httpRequest.getResponseBodyConverter() instanceof ProgressBody ? (ProgressBody) this.httpRequest.getResponseBodyConverter() : null;
        }
        if (progressBody != null) {
            return progressBody.getBytesTransferred();
        }
        return 0L;
    }

    public boolean isDownloadTask() {
        return this.httpRequest.getResponseBodyConverter() instanceof ProgressBody;
    }

    public boolean isSuccessful() {
        HttpResult<T> httpResult = this.httpResult;
        return httpResult != null && httpResult.isSuccessful();
    }

    public boolean isUploadTask() {
        if (this.httpRequest.getRequestBody() instanceof StreamingRequestBody) {
            return ((StreamingRequestBody) this.httpRequest.getRequestBody()).isLargeData();
        }
        return false;
    }

    public HttpTaskMetrics metrics() {
        return this.metrics;
    }

    public HttpRequest<T> request() {
        return this.httpRequest;
    }

    public HttpTask<T> schedule() {
        schedule(2);
        return this;
    }

    public HttpTask<T> schedule(int i10) {
        if (this.httpRequest.getRequestBody() instanceof ProgressBody) {
            scheduleOn(TaskExecutors.UPLOAD_EXECUTOR, i10);
        } else if (this.httpRequest.getResponseBodyConverter() instanceof ProgressBody) {
            scheduleOn(TaskExecutors.DOWNLOAD_EXECUTOR, i10);
        } else {
            scheduleOn(TaskExecutors.COMMAND_EXECUTOR, i10);
        }
        return this;
    }

    public HttpTask<T> scheduleOn(Executor executor) {
        scheduleOn(executor, 2);
        return this;
    }

    public HttpTask<T> scheduleOn(Executor executor, int i10) {
        scheduleOn(executor, new e(), i10);
        return this;
    }
}
