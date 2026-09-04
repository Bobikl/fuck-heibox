package com.tencent.qcloud.core.auth;

import com.tencent.qcloud.core.common.QCloudAuthenticationException;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.http.HttpRequest;
import com.tencent.qcloud.core.http.HttpResult;
import com.tencent.qcloud.core.http.QCloudHttpClient;
import com.umeng.analytics.AnalyticsConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class SessionCredentialProvider extends BasicLifecycleCredentialProvider {
    private HttpRequest<String> httpRequest;
    private HttpRequest.Builder<String> requestBuilder;
    private StsVersion stsVersion;

    public enum StsVersion {
        VERSION_2,
        VERSION_3
    }

    public SessionCredentialProvider() {
        this.stsVersion = StsVersion.VERSION_2;
    }

    public SessionCredentialProvider(HttpRequest.Builder<String> builder) {
        this(builder, StsVersion.VERSION_2);
    }

    public SessionCredentialProvider(HttpRequest.Builder<String> builder, StsVersion stsVersion) {
        StsVersion stsVersion2 = StsVersion.VERSION_2;
        this.requestBuilder = builder;
        this.stsVersion = stsVersion;
    }

    public SessionCredentialProvider(HttpRequest<String> httpRequest) {
        this(httpRequest, StsVersion.VERSION_2);
    }

    public SessionCredentialProvider(HttpRequest<String> httpRequest, StsVersion stsVersion) {
        StsVersion stsVersion2 = StsVersion.VERSION_2;
        this.httpRequest = httpRequest;
        this.stsVersion = stsVersion;
    }

    static SessionQCloudCredentials parseStandardSTS3JsonResponse(String str) throws QCloudClientException {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("Response");
                if (jSONObjectOptJSONObject != null) {
                    jSONObject = jSONObjectOptJSONObject;
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("Credentials");
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("Error");
                if (jSONObjectOptJSONObject2 != null) {
                    return new SessionQCloudCredentials(jSONObjectOptJSONObject2.optString("TmpSecretId"), jSONObjectOptJSONObject2.optString("TmpSecretKey"), jSONObjectOptJSONObject2.optString("Token"), jSONObject.optLong("ExpiredTime"));
                }
                if (jSONObjectOptJSONObject3 != null) {
                    throw new QCloudClientException(new QCloudAuthenticationException("get credentials error : " + jSONObject.toString()));
                }
            } catch (JSONException e10) {
                throw new QCloudClientException("parse sts3.0 session json fails", new QCloudAuthenticationException(e10.getMessage()));
            }
        }
        throw new QCloudClientException(new QCloudAuthenticationException("fetch credential response content is null"));
    }

    static SessionQCloudCredentials parseStandardSTSJsonResponse(String str) throws QCloudClientException {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                if (jSONObjectOptJSONObject != null) {
                    jSONObject = jSONObjectOptJSONObject;
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("credentials");
                int iOptInt = jSONObject.optInt("code", -1);
                if (jSONObjectOptJSONObject2 != null) {
                    long jOptLong = jSONObject.optLong("expiredTime");
                    long jOptLong2 = jSONObject.optLong(AnalyticsConfig.RTD_START_TIME);
                    String strOptString = jSONObjectOptJSONObject2.optString("sessionToken");
                    String strOptString2 = jSONObjectOptJSONObject2.optString("tmpSecretId");
                    String strOptString3 = jSONObjectOptJSONObject2.optString("tmpSecretKey");
                    return jOptLong2 > 0 ? new SessionQCloudCredentials(strOptString2, strOptString3, strOptString, jOptLong2, jOptLong) : new SessionQCloudCredentials(strOptString2, strOptString3, strOptString, jOptLong);
                }
                if (iOptInt > 0) {
                    throw new QCloudClientException(new QCloudAuthenticationException("get credentials error : " + jSONObject.toString()));
                }
            } catch (JSONException e10) {
                throw new QCloudClientException("parse sts2.0 session json fails", new QCloudAuthenticationException(e10.getMessage()));
            }
        }
        throw new QCloudClientException(new QCloudAuthenticationException("fetch credential response content is null"));
    }

    protected HttpRequest<String> buildRequest(HttpRequest.Builder<String> builder) {
        return builder.build();
    }

    protected HttpRequest<String> buildRequest(HttpRequest<String> httpRequest) {
        return httpRequest;
    }

    @Override // com.tencent.qcloud.core.auth.BasicLifecycleCredentialProvider
    protected QCloudLifecycleCredentials fetchNewCredentials() throws QCloudClientException {
        HttpRequest<String> httpRequestBuildRequest;
        HttpRequest<String> httpRequest = this.httpRequest;
        if (httpRequest != null) {
            httpRequestBuildRequest = buildRequest(httpRequest);
        } else {
            HttpRequest.Builder<String> builder = this.requestBuilder;
            httpRequestBuildRequest = builder != null ? buildRequest(builder) : null;
        }
        if (httpRequestBuildRequest == null) {
            throw new QCloudClientException(new QCloudAuthenticationException("please pass http request object for fetching"));
        }
        try {
            HttpResult httpResultExecuteNow = QCloudHttpClient.getDefault().resolveRequest(httpRequestBuildRequest).executeNow();
            if (httpResultExecuteNow.isSuccessful()) {
                return parseServerResponse((String) httpResultExecuteNow.content());
            }
            throw new QCloudClientException("fetch new credentials error ", new QCloudAuthenticationException(httpResultExecuteNow.asException().getMessage()));
        } catch (QCloudServiceException e10) {
            throw new QCloudClientException("fetch new credentials error ", new QCloudAuthenticationException(e10.getMessage()));
        }
    }

    protected SessionQCloudCredentials parseServerResponse(String str) throws QCloudClientException {
        return this.stsVersion == StsVersion.VERSION_2 ? parseStandardSTSJsonResponse(str) : parseStandardSTS3JsonResponse(str);
    }
}
