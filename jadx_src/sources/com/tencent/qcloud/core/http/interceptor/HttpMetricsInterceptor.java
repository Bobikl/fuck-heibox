package com.tencent.qcloud.core.http.interceptor;

import com.tencent.qcloud.core.http.HttpTask;
import com.tencent.qcloud.core.http.HttpTaskMetrics;
import com.tencent.qcloud.core.logger.QCloudLogger;
import com.tencent.qcloud.core.task.TaskManager;
import java.io.IOException;
import java.net.Socket;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.i;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.u;

/* JADX INFO: loaded from: classes4.dex */
public class HttpMetricsInterceptor implements u {
    @Override // okhttp3.u
    public c0 intercept(u.a aVar) throws IOException {
        a0 a0VarRequest = aVar.request();
        try {
            if (aVar instanceof RealInterceptorChain) {
                i iVarConnection = aVar.connection();
                if (iVarConnection instanceof RealConnection) {
                    Socket socket = ((RealConnection) iVarConnection).socket();
                    HttpTaskMetrics httpTaskMetricsMetrics = ((HttpTask) TaskManager.getInstance().get((String) a0VarRequest.o())).metrics();
                    if (httpTaskMetricsMetrics != null) {
                        httpTaskMetricsMetrics.recordConnectAddress(socket.getInetAddress());
                    }
                }
            }
        } catch (Exception e10) {
            QCloudLogger.d("HttpMetricsInterceptor", e10.getMessage(), new Object[0]);
        }
        return aVar.proceed(a0VarRequest);
    }
}
