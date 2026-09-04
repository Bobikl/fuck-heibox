package com.tencent.qcloud.core.auth;

import com.tencent.qcloud.core.common.QCloudAuthenticationException;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.http.HttpConstants;
import com.tencent.qcloud.core.http.HttpRequest;
import com.tencent.qcloud.core.http.HttpResult;
import com.tencent.qcloud.core.http.QCloudHttpClient;
import com.tencent.qcloud.core.http.RequestBodySerializer;

/* JADX INFO: loaded from: classes4.dex */
public class STSScopeLimitCredentialProvider extends BasicScopeLimitCredentialProvider {
    private HttpRequest.Builder<String> requestBuilder;

    public STSScopeLimitCredentialProvider(HttpRequest.Builder<String> builder) {
        this.requestBuilder = builder;
    }

    protected HttpRequest<String> buildRequest(HttpRequest.Builder<String> builder) {
        return builder.build();
    }

    @Override // com.tencent.qcloud.core.auth.BasicScopeLimitCredentialProvider
    public SessionQCloudCredentials fetchNewCredentials(STSCredentialScope[] sTSCredentialScopeArr) throws QCloudClientException {
        this.requestBuilder.body(RequestBodySerializer.string(HttpConstants.ContentType.JSON, STSCredentialScope.jsonify(sTSCredentialScopeArr))).method("POST");
        try {
            HttpResult httpResultExecuteNow = QCloudHttpClient.getDefault().resolveRequest(buildRequest(this.requestBuilder)).executeNow();
            if (httpResultExecuteNow.isSuccessful()) {
                return parseServerResponse((String) httpResultExecuteNow.content());
            }
            throw new QCloudClientException("fetch new credentials error ", new QCloudAuthenticationException(httpResultExecuteNow.asException().getMessage()));
        } catch (QCloudServiceException e10) {
            throw new QCloudClientException("fetch new credentials error ", new QCloudAuthenticationException(e10.getMessage()));
        }
    }

    protected SessionQCloudCredentials parseServerResponse(String str) throws QCloudClientException {
        return SessionCredentialProvider.parseStandardSTSJsonResponse(str);
    }
}
