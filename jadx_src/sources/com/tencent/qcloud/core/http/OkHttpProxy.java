package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudServiceException;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.util.List;
import okhttp3.c0;
import okhttp3.e;
import okhttp3.internal.Util;
import okhttp3.z;

/* JADX INFO: loaded from: classes4.dex */
public class OkHttpProxy<T> extends NetworkProxy<T> {
    private Field eventListenerFiled;
    private e httpCall;
    private z okHttpClient;

    public OkHttpProxy(z zVar) {
        this.okHttpClient = zVar;
    }

    private boolean isCosResponse(c0 c0Var) {
        return c0Var != null && "tencent-cos".equalsIgnoreCase(c0Var.C("Server"));
    }

    private void recordDns(String str, CallMetricsListener callMetricsListener) {
        List<InetAddress> listDumpDns;
        if (callMetricsListener == null || (listDumpDns = callMetricsListener.dumpDns()) == null) {
            return;
        }
        ConnectionRepository.getInstance().insertDnsRecordCache(str, listDumpDns);
    }

    @Override // com.tencent.qcloud.core.http.NetworkProxy
    public void cancel() {
        e eVar = this.httpCall;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // com.tencent.qcloud.core.http.NetworkProxy
    protected HttpResult<T> convertResponse(HttpRequest<T> httpRequest, c0 c0Var) throws QCloudServiceException, QCloudClientException {
        HttpResponse<T> httpResponse = new HttpResponse<>(httpRequest, c0Var);
        ResponseBodyConverter<T> responseBodyConverter = httpRequest.getResponseBodyConverter();
        if (responseBodyConverter instanceof ProgressBody) {
            ((ProgressBody) responseBodyConverter).setProgressListener(this.mProgressListener);
        }
        return new HttpResult<>(httpResponse, responseBodyConverter.convert(httpResponse));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x0099  */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0096: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:41:0x0096 */
    @Override // com.tencent.qcloud.core.http.NetworkProxy
    protected HttpResult<T> executeHttpRequest(HttpRequest<T> httpRequest) throws Throwable {
        c0 c0VarExecute;
        Closeable closeable;
        QCloudClientException qCloudClientException;
        QCloudServiceException qCloudServiceException;
        QCloudServiceException qCloudServiceException2;
        HttpResult<T> httpResultConvertResponse;
        CallMetricsListener callMetricsListener;
        Closeable closeable2 = null;
        qCloudClientException = null;
        QCloudClientException qCloudClientException2 = null;
        try {
            try {
                httpRequest.setOkHttpRequestTag(this.identifier);
                e eVarA = this.okHttpClient.a(httpRequest.buildRealRequest());
                this.httpCall = eVarA;
                if (this.eventListenerFiled == null) {
                    try {
                        Field declaredField = eVarA.getClass().getDeclaredField("eventListener");
                        this.eventListenerFiled = declaredField;
                        declaredField.setAccessible(true);
                        callMetricsListener = (CallMetricsListener) this.eventListenerFiled.get(this.httpCall);
                    } catch (ClassCastException | IllegalAccessException | NoSuchFieldException unused) {
                        callMetricsListener = null;
                    }
                } else {
                    callMetricsListener = null;
                }
                c0VarExecute = this.httpCall.execute();
                if (callMetricsListener != null) {
                    try {
                        callMetricsListener.dumpMetrics(this.metrics);
                    } catch (IOException e10) {
                        e = e10;
                        if (e.getCause() instanceof QCloudClientException) {
                            qCloudClientException = (QCloudClientException) e.getCause();
                        } else {
                            if (e.getCause() instanceof QCloudServiceException) {
                                qCloudServiceException = (QCloudServiceException) e.getCause();
                                qCloudClientException = null;
                            } else {
                                qCloudClientException = new QCloudClientException(e);
                            }
                            if (c0VarExecute != null) {
                                Util.closeQuietly(c0VarExecute);
                            }
                            qCloudClientException2 = qCloudClientException;
                            qCloudServiceException2 = qCloudServiceException;
                            httpResultConvertResponse = null;
                        }
                        qCloudServiceException = null;
                        if (c0VarExecute != null) {
                            Util.closeQuietly(c0VarExecute);
                        }
                        qCloudClientException2 = qCloudClientException;
                        qCloudServiceException2 = qCloudServiceException;
                        httpResultConvertResponse = null;
                    }
                }
                if (c0VarExecute != null) {
                    httpResultConvertResponse = convertResponse(httpRequest, c0VarExecute);
                    qCloudServiceException2 = null;
                } else {
                    qCloudServiceException2 = new QCloudServiceException("http response is null");
                    httpResultConvertResponse = null;
                }
                if (c0VarExecute != null) {
                    Util.closeQuietly(c0VarExecute);
                }
            } catch (Throwable th2) {
                th = th2;
                closeable2 = closeable;
                if (closeable2 != null) {
                    Util.closeQuietly(closeable2);
                }
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            c0VarExecute = null;
        } catch (Throwable th3) {
            th = th3;
            if (closeable2 != null) {
                Util.closeQuietly(closeable2);
            }
            throw th;
        }
        if (qCloudClientException2 != null) {
            throw qCloudClientException2;
        }
        if (qCloudServiceException2 == null) {
            return httpResultConvertResponse;
        }
        throw qCloudServiceException2;
    }
}
