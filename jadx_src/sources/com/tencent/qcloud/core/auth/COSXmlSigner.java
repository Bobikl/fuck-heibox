package com.tencent.qcloud.core.auth;

import com.huawei.hms.framework.common.ContainerUtils;
import com.tencent.qcloud.core.common.QCloudAuthenticationException;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.http.QCloudHttpRequest;
import java.net.URL;

/* JADX INFO: loaded from: classes4.dex */
public class COSXmlSigner implements QCloudSigner {
    static final String COS_SESSION_TOKEN = "x-cos-security-token";

    private void addAuthInHeader(QCloudHttpRequest qCloudHttpRequest, QCloudCredentials qCloudCredentials, String str) {
        qCloudHttpRequest.removeHeader("Authorization");
        qCloudHttpRequest.addHeader("Authorization", str);
        if (qCloudCredentials instanceof SessionQCloudCredentials) {
            String sessionTokenKey = getSessionTokenKey();
            qCloudHttpRequest.removeHeader(sessionTokenKey);
            qCloudHttpRequest.addHeader(sessionTokenKey, ((SessionQCloudCredentials) qCloudCredentials).getToken());
        }
    }

    private void addAuthInPara(QCloudHttpRequest qCloudHttpRequest, QCloudCredentials qCloudCredentials, String str) {
        String strConcat;
        URL url = qCloudHttpRequest.url();
        if (qCloudCredentials instanceof SessionQCloudCredentials) {
            str = str.concat("&token").concat(ContainerUtils.KEY_VALUE_DELIMITER).concat(((SessionQCloudCredentials) qCloudCredentials).getToken());
        }
        String query = url.getQuery();
        String string = url.toString();
        int iIndexOf = string.indexOf(63);
        if (iIndexOf < 0) {
            strConcat = string.concat("?").concat(str);
        } else {
            int length = iIndexOf + query.length() + 1;
            strConcat = string.substring(0, length).concat("&").concat(str).concat(string.substring(length));
        }
        qCloudHttpRequest.setUrl(strConcat);
    }

    private String signature(String str, String str2) {
        byte[] bArrHmacSha1 = Utils.hmacSha1(str, str2);
        return bArrHmacSha1 != null ? new String(Utils.encodeHex(bArrHmacSha1)) : "";
    }

    protected String getSessionTokenKey() {
        return "x-cos-security-token";
    }

    @Override // com.tencent.qcloud.core.auth.QCloudSigner
    public void sign(QCloudHttpRequest qCloudHttpRequest, QCloudCredentials qCloudCredentials) throws QCloudClientException {
        if (qCloudCredentials == null) {
            throw new QCloudClientException(new QCloudAuthenticationException("Credentials is null."));
        }
        COSXmlSignSourceProvider cOSXmlSignSourceProvider = (COSXmlSignSourceProvider) qCloudHttpRequest.getSignProvider();
        if (cOSXmlSignSourceProvider == null) {
            throw new QCloudClientException(new QCloudAuthenticationException("No sign provider for cos xml signer."));
        }
        StringBuilder sb2 = new StringBuilder();
        QCloudLifecycleCredentials qCloudLifecycleCredentials = (QCloudLifecycleCredentials) qCloudCredentials;
        String keyTime = qCloudHttpRequest.getKeyTime();
        if (keyTime == null) {
            keyTime = qCloudLifecycleCredentials.getKeyTime();
        }
        cOSXmlSignSourceProvider.setSignTime(keyTime);
        String strSignature = signature(cOSXmlSignSourceProvider.source(qCloudHttpRequest), qCloudLifecycleCredentials.getSignKey());
        sb2.append(AuthConstants.Q_SIGN_ALGORITHM);
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(AuthConstants.SHA1);
        sb2.append("&");
        sb2.append(AuthConstants.Q_AK);
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(qCloudCredentials.getSecretId());
        sb2.append("&");
        sb2.append(AuthConstants.Q_SIGN_TIME);
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(keyTime);
        sb2.append("&");
        sb2.append(AuthConstants.Q_KEY_TIME);
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(qCloudLifecycleCredentials.getKeyTime());
        sb2.append("&");
        sb2.append(AuthConstants.Q_HEADER_LIST);
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(cOSXmlSignSourceProvider.getRealHeaderList().toLowerCase());
        sb2.append("&");
        sb2.append(AuthConstants.Q_URL_PARAM_LIST);
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(cOSXmlSignSourceProvider.getRealParameterList().toLowerCase());
        sb2.append("&");
        sb2.append(AuthConstants.Q_SIGNATURE);
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(strSignature);
        String string = sb2.toString();
        if (qCloudHttpRequest.isSignInUrl()) {
            addAuthInPara(qCloudHttpRequest, qCloudCredentials, string);
        } else {
            addAuthInHeader(qCloudHttpRequest, qCloudCredentials, string);
        }
        cOSXmlSignSourceProvider.onSignRequestSuccess(qCloudHttpRequest, qCloudCredentials, string);
    }
}
