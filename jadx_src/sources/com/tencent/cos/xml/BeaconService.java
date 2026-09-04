package com.tencent.cos.xml;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.p0;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.tencent.beacon.core.info.BeaconPubParams;
import com.tencent.beacon.event.open.BeaconReport;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.object.CopyObjectRequest;
import com.tencent.cos.xml.model.object.GetObjectRequest;
import com.tencent.cos.xml.model.object.ObjectRequest;
import com.tencent.cos.xml.model.object.PutObjectRequest;
import com.tencent.cos.xml.transfer.TransferTaskMetrics;
import com.tencent.qcloud.core.common.QCloudAuthenticationException;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.http.ConnectionRepository;
import com.tencent.qcloud.core.http.HttpRequest;
import com.tencent.qcloud.core.http.HttpTask;
import com.tencent.qcloud.core.http.HttpTaskMetrics;
import com.tencent.qcloud.core.track.TrackService;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.security.cert.CertificateException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import org.android.agoo.common.AgooConstants;
import qb.a;
import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public class BeaconService {
    private static final String APP_KEY = "0AND0VEVB24UBGDU";
    private static final String EVENT_CODE_BASE_SERVICE = "base_service";
    private static final String EVENT_CODE_COPY = "cos_copy";
    private static final String EVENT_CODE_DOWNLOAD = "cos_download";
    private static final String EVENT_CODE_ERROR = "cos_error";
    private static final String EVENT_CODE_UPLOAD = "cos_upload";
    private static final String EVENT_PARAMS_CLIENT = "Client";
    private static final String EVENT_PARAMS_FAILURE = "Failure";
    public static final String EVENT_PARAMS_NODE_GET = "GetObjectRequest";
    public static final String EVENT_PARAMS_NODE_HEAD = "HeadObjectRequest";
    private static final String EVENT_PARAMS_SERVER = "Server";
    private static final String EVENT_PARAMS_SUCCESS = "Success";
    private static final boolean IS_DEBUG = false;
    private static final String TAG = "BeaconProxy";
    private static BeaconService instance;
    private Context applicationContext;
    private CosXmlServiceConfig config;

    public static class PoorNetworkCode {
        private static final int ConnectException = 200034;
        private static final int HttpRetryException = 200035;
        private static final int NoRouteToHostException = 200036;
        private static final int SSLHandshakeException = 200037;
        private static final int SocketTimeoutException = 200033;
        private static final int UnknownHostException = 200032;

        private PoorNetworkCode() {
        }
    }

    public static class ReturnClientException {
        private final CosXmlClientException exception;
        private final Map<String, String> params;

        public ReturnClientException(CosXmlClientException cosXmlClientException, Map<String, String> map) {
            this.exception = cosXmlClientException;
            this.params = map;
        }
    }

    public static class ReturnServiceException {
        private final CosXmlServiceException exception;
        private final Map<String, String> params;

        public ReturnServiceException(CosXmlServiceException cosXmlServiceException, Map<String, String> map) {
            this.exception = cosXmlServiceException;
            this.params = map;
        }
    }

    private BeaconService(Context context, CosXmlServiceConfig cosXmlServiceConfig) {
        this.applicationContext = context;
        this.config = cosXmlServiceConfig;
    }

    private CosXmlClientException convertClientException(QCloudClientException qCloudClientException) {
        if (!TextUtils.isEmpty(qCloudClientException.getMessage()) && qCloudClientException.getMessage().contains("NetworkNotConnected")) {
            return new CosXmlClientException(ClientErrorCode.NETWORK_NOT_CONNECTED.getCode(), qCloudClientException);
        }
        if (qCloudClientException instanceof CosXmlClientException) {
            return qCloudClientException.getCause() instanceof IOException ? new CosXmlClientException(subdivisionIOException(qCloudClientException.getCause()), qCloudClientException) : (CosXmlClientException) qCloudClientException;
        }
        Throwable cause = qCloudClientException.getCause();
        if (cause instanceof IllegalArgumentException) {
            return new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), qCloudClientException);
        }
        if (cause instanceof QCloudAuthenticationException) {
            return new CosXmlClientException(ClientErrorCode.INVALID_CREDENTIALS.getCode(), qCloudClientException);
        }
        return cause instanceof IOException ? new CosXmlClientException(subdivisionIOException(cause), qCloudClientException) : new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), qCloudClientException);
    }

    private CosXmlServiceException convertServerException(QCloudServiceException qCloudServiceException) {
        return qCloudServiceException instanceof CosXmlServiceException ? (CosXmlServiceException) qCloudServiceException : new CosXmlServiceException(qCloudServiceException);
    }

    private String cosDownloadName(boolean z10) {
        return z10 ? "COSDownloadTask-CSE" : "COSDownloadTask";
    }

    private String cosUploadName(boolean z10) {
        return z10 ? "COSUploadTask-CSE" : "COSUploadTask";
    }

    private Map<String, String> createTransferExtra(String str, CosXmlRequest cosXmlRequest) {
        HashMap map = new HashMap();
        map.put("name", str);
        map.put("error_node", cosXmlRequest != null ? cosXmlRequest.getClass().getSimpleName() : "null");
        return map;
    }

    private CopyObjectRequest emptyCopyObjectRequestWithMetrics(HttpTaskMetrics httpTaskMetrics) {
        CopyObjectRequest copyObjectRequest = new CopyObjectRequest("", "", null);
        copyObjectRequest.attachMetrics(httpTaskMetrics);
        return copyObjectRequest;
    }

    private GetObjectRequest emptyGetObjectRequestWithMetrics(HttpTaskMetrics httpTaskMetrics) {
        GetObjectRequest getObjectRequest = new GetObjectRequest("", "", "");
        getObjectRequest.attachMetrics(httpTaskMetrics);
        return getObjectRequest;
    }

    private PutObjectRequest emptyPutObjectRequestWithMetrics(HttpTaskMetrics httpTaskMetrics) {
        PutObjectRequest putObjectRequest = new PutObjectRequest("", "", "");
        putObjectRequest.attachMetrics(httpTaskMetrics);
        return putObjectRequest;
    }

    private String flatDns(@p0 InetAddress inetAddress, @p0 List<InetAddress> list) {
        return (inetAddress == null || inetAddress.getHostAddress() == null) ? flatInetAddressList(list) : String.format("{%s}", inetAddress.getHostAddress());
    }

    private String flatInetAddressList(@p0 List<InetAddress> list) {
        if (list == null) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Iterator<InetAddress> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            sb2.append(it.next().getHostAddress());
            i10++;
            if (i10 == list.size()) {
                sb2.append(g.f141884d);
            } else {
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
        return sb2.toString();
    }

    private Map<String, String> getBaseServiceParams(CosXmlRequest cosXmlRequest, long j10, boolean z10) {
        Map<String, String> commonParams = getCommonParams();
        commonParams.put("result", z10 ? EVENT_PARAMS_SUCCESS : EVENT_PARAMS_FAILURE);
        commonParams.put("took_time", String.valueOf(j10));
        commonParams.put("name", cosXmlRequest.getClass().getSimpleName());
        commonParams.put("region", TextUtils.isEmpty(cosXmlRequest.getRegion()) ? this.config.getRegion() : cosXmlRequest.getRegion());
        commonParams.put("accelerate", cosXmlRequest.isSupportAccelerate() ? "Y" : "N");
        if (!z10) {
            HttpTaskMetrics metrics = cosXmlRequest.getMetrics();
            if (metrics != null) {
                commonParams.put("http_dns", String.valueOf(metrics.dnsLookupTookTime()));
                commonParams.put("http_connect", String.valueOf(metrics.connectTookTime()));
                commonParams.put("http_secure_connect", String.valueOf(metrics.secureConnectTookTime()));
                commonParams.put("http_md5", String.valueOf(metrics.calculateMD5STookTime()));
                commonParams.put("http_sign", String.valueOf(metrics.signRequestTookTime()));
                commonParams.put("http_read_header", String.valueOf(metrics.readResponseHeaderTookTime()));
                commonParams.put("http_read_body", String.valueOf(metrics.readResponseBodyTookTime()));
                commonParams.put("http_write_header", String.valueOf(metrics.writeRequestHeaderTookTime()));
                commonParams.put("http_write_body", String.valueOf(metrics.writeRequestBodyTookTime()));
                commonParams.put("http_full", String.valueOf(metrics.fullTaskTookTime()));
            }
            String requestHost = cosXmlRequest.getRequestHost(this.config);
            if (requestHost != null) {
                commonParams.put("host", requestHost);
                try {
                    commonParams.put("ips", flatInetAddressList(ConnectionRepository.getInstance().getDnsRecord(requestHost)));
                } catch (UnknownHostException e10) {
                    e10.printStackTrace();
                }
            }
        }
        return commonParams;
    }

    private ReturnClientException getClientExceptionParams(QCloudClientException qCloudClientException) {
        HashMap map = new HashMap();
        CosXmlClientException cosXmlClientExceptionConvertClientException = convertClientException(qCloudClientException);
        String simpleName = (cosXmlClientExceptionConvertClientException.getCause() == null ? cosXmlClientExceptionConvertClientException.getClass() : cosXmlClientExceptionConvertClientException.getCause().getClass()).getSimpleName();
        String message = cosXmlClientExceptionConvertClientException.getCause() == null ? cosXmlClientExceptionConvertClientException.getMessage() : cosXmlClientExceptionConvertClientException.getCause().getMessage();
        map.put("error_name", simpleName);
        map.put(PushMessageHelper.ERROR_MESSAGE, message);
        map.put("error_code", String.valueOf(cosXmlClientExceptionConvertClientException.errorCode));
        map.put(PushMessageHelper.ERROR_TYPE, EVENT_PARAMS_CLIENT);
        return new ReturnClientException(cosXmlClientExceptionConvertClientException, map);
    }

    private Map<String, String> getCommonParams() {
        if (!isIncludeBeacon()) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        BeaconPubParams commonParams = BeaconReport.getInstance().getCommonParams(this.applicationContext);
        map.put("boundle_id", commonParams.getBoundleId());
        map.put("network_type", commonParams.getNetworkType());
        map.put("cossdk_version", BuildConfig.VERSION_NAME);
        map.put("cossdk_version_code", String.valueOf(50709));
        return map;
    }

    private String getConnectIp(@p0 InetSocketAddress inetSocketAddress) {
        return (inetSocketAddress == null || inetSocketAddress.getAddress() == null) ? "" : inetSocketAddress.getAddress().getHostAddress();
    }

    private Map<String, String> getDownloadParams(String str, boolean z10) {
        Map<String, String> commonParams = getCommonParams();
        commonParams.put("result", z10 ? EVENT_PARAMS_SUCCESS : EVENT_PARAMS_FAILURE);
        commonParams.put("region", str);
        return commonParams;
    }

    public static BeaconService getInstance() {
        return instance;
    }

    private ReturnServiceException getServiceExceptionParams(QCloudServiceException qCloudServiceException) {
        HashMap map = new HashMap();
        CosXmlServiceException cosXmlServiceExceptionConvertServerException = convertServerException(qCloudServiceException);
        map.put("error_request_id", cosXmlServiceExceptionConvertServerException.getRequestId());
        map.put(PushMessageHelper.ERROR_MESSAGE, cosXmlServiceExceptionConvertServerException.getErrorMessage());
        map.put("error_code", cosXmlServiceExceptionConvertServerException.getErrorCode());
        map.put("error_status_code", String.valueOf(cosXmlServiceExceptionConvertServerException.getStatusCode()));
        map.put("error_service_name", cosXmlServiceExceptionConvertServerException.getServiceName());
        map.put(PushMessageHelper.ERROR_TYPE, "Server");
        return new ReturnServiceException(cosXmlServiceExceptionConvertServerException, map);
    }

    private Map<String, String> getUploadParams(String str, boolean z10) {
        Map<String, String> commonParams = getCommonParams();
        commonParams.put("result", z10 ? EVENT_PARAMS_SUCCESS : EVENT_PARAMS_FAILURE);
        commonParams.put("region", str);
        return commonParams;
    }

    public static void init(Context context, CosXmlServiceConfig cosXmlServiceConfig) {
        synchronized (BeaconService.class) {
            if (instance == null) {
                instance = new BeaconService(context, cosXmlServiceConfig);
                TrackService.init(context, APP_KEY, false);
            }
        }
    }

    private boolean isCopyTaskRequest(CosXmlRequest cosXmlRequest) {
        String simpleName = cosXmlRequest.getClass().getSimpleName();
        return "UploadPartCopyRequest".equals(simpleName) || "CopyObjectRequest".equals(simpleName);
    }

    private boolean isDownloadTaskRequest(CosXmlRequest cosXmlRequest) {
        String simpleName = cosXmlRequest.getClass().getSimpleName();
        return EVENT_PARAMS_NODE_HEAD.equals(simpleName) || EVENT_PARAMS_NODE_GET.equals(simpleName);
    }

    private static boolean isIncludeBeacon() {
        return true;
    }

    private boolean isReport(CosXmlClientException cosXmlClientException) {
        return !(cosXmlClientException.getMessage() != null && cosXmlClientException.getMessage().toLowerCase().contains(a.f138642e));
    }

    private boolean isReport(CosXmlServiceException cosXmlServiceException) {
        return true;
    }

    private boolean isReport(CosXmlRequest cosXmlRequest) {
        return true;
    }

    private boolean isUploadTaskRequest(CosXmlRequest cosXmlRequest) {
        String simpleName = cosXmlRequest.getClass().getSimpleName();
        return "PutObjectRequest".equals(simpleName) || "InitMultipartUploadRequest".equals(simpleName) || "ListPartsRequest".equals(simpleName) || "UploadPartRequest".equals(simpleName) || "CompleteMultiUploadRequest".equals(simpleName) || "AbortMultiUploadRequest".equals(simpleName);
    }

    private Map<String, String> parseClientExceptionParams(CosXmlClientException cosXmlClientException) {
        HashMap map = new HashMap();
        map.put(PushMessageHelper.ERROR_MESSAGE, cosXmlClientException.getMessage());
        map.put("error_code", String.valueOf(cosXmlClientException.errorCode));
        map.put(PushMessageHelper.ERROR_TYPE, EVENT_PARAMS_CLIENT);
        return map;
    }

    private Map<String, String> parseDnsParams(CosXmlRequest cosXmlRequest) {
        HashMap map = new HashMap();
        String host = parseHost(cosXmlRequest);
        if (TextUtils.isEmpty(host)) {
            return map;
        }
        HttpTaskMetrics metrics = cosXmlRequest.getMetrics();
        List<InetAddress> dnsRecord = null;
        try {
            dnsRecord = ConnectionRepository.getInstance().getDnsRecord(host);
        } catch (UnknownHostException e10) {
            e10.printStackTrace();
        }
        map.put("ips", flatDns(metrics.getConnectAddress(), dnsRecord));
        return map;
    }

    private String parseEventCode(CosXmlRequest cosXmlRequest) {
        if (isUploadTaskRequest(cosXmlRequest)) {
            return EVENT_CODE_UPLOAD;
        }
        return isDownloadTaskRequest(cosXmlRequest) ? EVENT_CODE_DOWNLOAD : EVENT_CODE_BASE_SERVICE;
    }

    @p0
    private String parseHost(CosXmlRequest cosXmlRequest) {
        HttpRequest httpRequestRequest;
        HttpTask httpTask = cosXmlRequest.getHttpTask();
        String strHost = (httpTask == null || (httpRequestRequest = httpTask.request()) == null) ? null : httpRequestRequest.host();
        return (strHost != null || cosXmlRequest.getMetrics() == null) ? strHost : cosXmlRequest.getMetrics().getDomainName();
    }

    private Map<String, String> parsePerfParams(@p0 HttpTaskMetrics httpTaskMetrics) {
        HashMap map = new HashMap();
        if (httpTaskMetrics == null) {
            return map;
        }
        map.put("took_time", String.valueOf(httpTaskMetrics.httpTaskFullTime()));
        map.put("http_dns", String.valueOf(httpTaskMetrics.dnsLookupTookTime()));
        map.put("http_connect", String.valueOf(httpTaskMetrics.connectTookTime()));
        map.put("http_secure_connect", String.valueOf(httpTaskMetrics.secureConnectTookTime()));
        map.put("http_md5", String.valueOf(httpTaskMetrics.calculateMD5STookTime()));
        map.put("http_sign", String.valueOf(httpTaskMetrics.signRequestTookTime()));
        map.put("http_read_header", String.valueOf(httpTaskMetrics.readResponseHeaderTookTime()));
        map.put("http_read_body", String.valueOf(httpTaskMetrics.readResponseBodyTookTime()));
        map.put("http_write_header", String.valueOf(httpTaskMetrics.writeRequestHeaderTookTime()));
        map.put("http_write_body", String.valueOf(httpTaskMetrics.writeRequestBodyTookTime()));
        map.put("http_full", String.valueOf(httpTaskMetrics.fullTaskTookTime()));
        map.put(UiKitSpanObj.TYPE_SIZE, String.valueOf(httpTaskMetrics.requestBodyByteCount() + httpTaskMetrics.responseBodyByteCount()));
        return map;
    }

    private Map<String, String> parseServiceExceptionParams(CosXmlServiceException cosXmlServiceException) {
        HashMap map = new HashMap();
        map.put(PushMessageHelper.ERROR_MESSAGE, cosXmlServiceException.getErrorMessage());
        map.put("error_code", cosXmlServiceException.getErrorCode());
        map.put("request_id", cosXmlServiceException.getRequestId());
        map.put(PushMessageHelper.ERROR_TYPE, "Server");
        return map;
    }

    private Map<String, String> parseSimplePerfParams(@p0 TransferTaskMetrics transferTaskMetrics) {
        HashMap map = new HashMap();
        if (transferTaskMetrics == null) {
            return map;
        }
        map.put("transfer_size", String.valueOf(transferTaskMetrics.getSize()));
        map.put("ip", transferTaskMetrics.getConnectAddress() != null ? transferTaskMetrics.getConnectAddress().getHostAddress() : "");
        map.put("took_time", String.valueOf(transferTaskMetrics.getTookTime()));
        map.put("wait_took_time", String.valueOf(transferTaskMetrics.getWaitTookTime()));
        map.put("first_progress_took_time", String.valueOf(transferTaskMetrics.getFirstProgressTookTime()));
        return map;
    }

    private Map<String, String> parseSimplePerfParams(@p0 HttpTaskMetrics httpTaskMetrics) {
        HashMap map = new HashMap();
        if (httpTaskMetrics == null) {
            return map;
        }
        map.put("took_time", String.valueOf(httpTaskMetrics.httpTaskFullTime()));
        map.put(UiKitSpanObj.TYPE_SIZE, String.valueOf(httpTaskMetrics.requestBodyByteCount() + httpTaskMetrics.responseBodyByteCount()));
        return map;
    }

    private Map<String, String> parseUrlParams(CosXmlRequest cosXmlRequest) {
        HashMap map = new HashMap();
        String host = parseHost(cosXmlRequest);
        if (TextUtils.isEmpty(host)) {
            return map;
        }
        map.put("host", host);
        try {
            Matcher matcher = Pattern.compile(".*\\.cos\\.(.*)\\.myqcloud.com").matcher(host);
            if (matcher.find()) {
                map.put("region", matcher.group(1));
            }
        } catch (Exception unused) {
        }
        if (cosXmlRequest instanceof ObjectRequest) {
            ObjectRequest objectRequest = (ObjectRequest) cosXmlRequest;
            if (!TextUtils.isEmpty(objectRequest.getCosPath())) {
                map.put("request_path", objectRequest.getCosPath());
            }
        }
        return map;
    }

    private void report(String str, Map<String, String> map) {
        if (isIncludeBeacon()) {
            TrackService.getInstance().track(APP_KEY, str, map);
        }
    }

    private CosXmlClientException reportClientException(String str, CosXmlRequest cosXmlRequest, QCloudClientException qCloudClientException, @p0 Map<String, String> map) {
        ReturnClientException clientExceptionParams = getClientExceptionParams(qCloudClientException);
        if (isReport(clientExceptionParams.exception) && isReport(cosXmlRequest)) {
            HttpTaskMetrics metrics = cosXmlRequest.getMetrics();
            Map<String, String> urlParams = parseUrlParams(cosXmlRequest);
            urlParams.putAll(getCommonParams());
            urlParams.putAll(clientExceptionParams.params);
            urlParams.putAll(parsePerfParams(metrics));
            urlParams.putAll(parseDnsParams(cosXmlRequest));
            if (map == null || !map.containsKey("name")) {
                urlParams.put("name", cosXmlRequest.getClass().getSimpleName());
            }
            urlParams.put("result", EVENT_PARAMS_FAILURE);
            if (map != null) {
                urlParams.putAll(map);
            }
            report(str, urlParams);
        }
        return clientExceptionParams.exception;
    }

    private void reportRequestSuccess(String str, CosXmlRequest cosXmlRequest, @p0 Map<String, String> map) {
        if (isReport(cosXmlRequest)) {
            HttpTaskMetrics metrics = cosXmlRequest.getMetrics();
            Map<String, String> urlParams = parseUrlParams(cosXmlRequest);
            urlParams.putAll(getCommonParams());
            urlParams.putAll(parseSimplePerfParams(metrics));
            if (map == null || !map.containsKey("name")) {
                urlParams.put("name", cosXmlRequest.getClass().getSimpleName());
            }
            urlParams.put("result", EVENT_PARAMS_SUCCESS);
            if (map != null) {
                urlParams.putAll(map);
            }
            report(str, urlParams);
        }
    }

    private CosXmlServiceException reportServiceException(String str, CosXmlRequest cosXmlRequest, QCloudServiceException qCloudServiceException, @p0 Map<String, String> map) {
        ReturnServiceException serviceExceptionParams = getServiceExceptionParams(qCloudServiceException);
        if (cosXmlRequest instanceof ObjectRequest) {
            ((ObjectRequest) cosXmlRequest).getCosPath();
        }
        if (isReport(serviceExceptionParams.exception) && isReport(cosXmlRequest)) {
            Map<String, String> urlParams = parseUrlParams(cosXmlRequest);
            urlParams.putAll(getCommonParams());
            urlParams.putAll(serviceExceptionParams.params);
            urlParams.putAll(parsePerfParams(cosXmlRequest.getMetrics()));
            urlParams.putAll(parseDnsParams(cosXmlRequest));
            if (map == null || !map.containsKey("name")) {
                urlParams.put("name", cosXmlRequest.getClass().getSimpleName());
            }
            urlParams.put("result", EVENT_PARAMS_FAILURE);
            if (map != null) {
                urlParams.putAll(map);
            }
            report(str, urlParams);
        }
        return serviceExceptionParams.exception;
    }

    private void reportTransferTask(CosXmlRequest cosXmlRequest, TransferTaskMetrics transferTaskMetrics, boolean z10, boolean z11, @p0 Map<String, String> map) {
        Map<String, String> urlParams = parseUrlParams(cosXmlRequest);
        urlParams.put("name", cosXmlRequest.getClass().getSimpleName());
        urlParams.putAll(getCommonParams());
        urlParams.putAll(parseSimplePerfParams(transferTaskMetrics));
        urlParams.put(AgooConstants.MESSAGE_ENCRYPTED, String.valueOf(z10));
        urlParams.put("result", z11 ? EVENT_PARAMS_SUCCESS : EVENT_PARAMS_FAILURE);
        if (map != null) {
            urlParams.putAll(map);
        }
        report("cos_transfer", urlParams);
    }

    private int subdivisionIOException(Throwable th2) {
        if (th2 instanceof FileNotFoundException) {
            return ClientErrorCode.SINK_SOURCE_NOT_FOUND.getCode();
        }
        if (th2 instanceof UnknownHostException) {
            return 200032;
        }
        if (th2 instanceof SocketTimeoutException) {
            return 200033;
        }
        if (th2 instanceof ConnectException) {
            return 200034;
        }
        if (th2 instanceof HttpRetryException) {
            return 200035;
        }
        if (th2 instanceof NoRouteToHostException) {
            return 200036;
        }
        if (!(th2 instanceof SSLHandshakeException) || (th2.getCause() instanceof CertificateException)) {
            return ClientErrorCode.IO_ERROR.getCode();
        }
        return 200037;
    }

    public void reportCOSDownloadTaskClientException(CosXmlRequest cosXmlRequest, QCloudClientException qCloudClientException, boolean z10) {
        reportClientException(EVENT_CODE_DOWNLOAD, cosXmlRequest, qCloudClientException, createTransferExtra(cosDownloadName(z10), cosXmlRequest));
    }

    public void reportCOSDownloadTaskServiceException(CosXmlRequest cosXmlRequest, QCloudServiceException qCloudServiceException, boolean z10) {
        reportServiceException(EVENT_CODE_DOWNLOAD, cosXmlRequest, qCloudServiceException, createTransferExtra(cosDownloadName(z10), cosXmlRequest));
    }

    public void reportCOSDownloadTaskSuccess(CosXmlRequest cosXmlRequest, boolean z10) {
        reportRequestSuccess(EVENT_CODE_DOWNLOAD, cosXmlRequest, Collections.singletonMap("name", cosDownloadName(z10)));
    }

    public void reportCOSUploadTaskClientException(CosXmlRequest cosXmlRequest, QCloudClientException qCloudClientException, boolean z10) {
        reportClientException(EVENT_CODE_UPLOAD, cosXmlRequest, qCloudClientException, createTransferExtra(cosUploadName(z10), cosXmlRequest));
    }

    public void reportCOSUploadTaskServiceException(CosXmlRequest cosXmlRequest, QCloudServiceException qCloudServiceException, boolean z10) {
        reportServiceException(EVENT_CODE_UPLOAD, cosXmlRequest, qCloudServiceException, createTransferExtra(cosUploadName(z10), cosXmlRequest));
    }

    public void reportCOSUploadTaskSuccess(CosXmlRequest cosXmlRequest, boolean z10) {
        reportRequestSuccess(EVENT_CODE_UPLOAD, cosXmlRequest, Collections.singletonMap("name", cosUploadName(z10)));
    }

    public void reportCopyTaskClientException(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException) {
        reportClientException(EVENT_CODE_COPY, cosXmlRequest, cosXmlClientException, createTransferExtra("CopyTask", cosXmlRequest));
    }

    public void reportCopyTaskServiceException(CosXmlRequest cosXmlRequest, CosXmlServiceException cosXmlServiceException) {
        reportServiceException(EVENT_CODE_COPY, cosXmlRequest, cosXmlServiceException, createTransferExtra("CopyTask", cosXmlRequest));
    }

    public void reportCopyTaskSuccess(CosXmlRequest cosXmlRequest) {
        reportRequestSuccess(EVENT_CODE_COPY, cosXmlRequest, Collections.singletonMap("name", "CopyTask"));
    }

    public void reportDownloadTaskClientException(CosXmlRequest cosXmlRequest, QCloudClientException qCloudClientException) {
        reportClientException(EVENT_CODE_DOWNLOAD, cosXmlRequest, qCloudClientException, createTransferExtra("DownloadTask", cosXmlRequest));
    }

    public void reportDownloadTaskServiceException(CosXmlRequest cosXmlRequest, QCloudServiceException qCloudServiceException) {
        reportServiceException(EVENT_CODE_DOWNLOAD, cosXmlRequest, qCloudServiceException, createTransferExtra("DownloadTask", cosXmlRequest));
    }

    public void reportDownloadTaskSuccess(CosXmlRequest cosXmlRequest) {
        reportRequestSuccess(EVENT_CODE_DOWNLOAD, cosXmlRequest, Collections.singletonMap("name", "DownloadTask"));
    }

    public void reportError(String str, Exception exc) {
        Map<String, String> commonParams = getCommonParams();
        commonParams.put("source", str);
        commonParams.put("name", exc.getClass().getSimpleName());
        commonParams.put("message", exc.getMessage());
        report(EVENT_CODE_ERROR, commonParams);
    }

    public CosXmlClientException reportRequestClientException(CosXmlRequest cosXmlRequest, QCloudClientException qCloudClientException) {
        return reportClientException(parseEventCode(cosXmlRequest), cosXmlRequest, qCloudClientException, null);
    }

    public CosXmlServiceException reportRequestServiceException(CosXmlRequest cosXmlRequest, QCloudServiceException qCloudServiceException) {
        return reportServiceException(parseEventCode(cosXmlRequest), cosXmlRequest, qCloudServiceException, null);
    }

    public void reportRequestSuccess(CosXmlRequest cosXmlRequest) {
        reportRequestSuccess(parseEventCode(cosXmlRequest), cosXmlRequest, null);
    }

    public void reportTransferClientException(CosXmlRequest cosXmlRequest, TransferTaskMetrics transferTaskMetrics, CosXmlClientException cosXmlClientException, boolean z10) {
        if (isReport(cosXmlClientException) && isReport(cosXmlRequest)) {
            reportTransferTask(cosXmlRequest, transferTaskMetrics, z10, false, parseClientExceptionParams(cosXmlClientException));
        }
    }

    public void reportTransferServiceException(CosXmlRequest cosXmlRequest, TransferTaskMetrics transferTaskMetrics, CosXmlServiceException cosXmlServiceException, boolean z10) {
        if (isReport(cosXmlServiceException) && isReport(cosXmlRequest)) {
            reportTransferTask(cosXmlRequest, transferTaskMetrics, z10, false, parseServiceExceptionParams(cosXmlServiceException));
        }
    }

    public void reportTransferSuccess(CosXmlRequest cosXmlRequest, TransferTaskMetrics transferTaskMetrics, boolean z10) {
        if (isReport(cosXmlRequest)) {
            reportTransferTask(cosXmlRequest, transferTaskMetrics, z10, true, null);
        }
    }

    public void reportUploadTaskClientException(CosXmlRequest cosXmlRequest, QCloudClientException qCloudClientException) {
        reportClientException(EVENT_CODE_UPLOAD, cosXmlRequest, qCloudClientException, createTransferExtra("UploadTask", cosXmlRequest));
    }

    public void reportUploadTaskServiceException(CosXmlRequest cosXmlRequest, QCloudServiceException qCloudServiceException) {
        reportServiceException(EVENT_CODE_UPLOAD, cosXmlRequest, qCloudServiceException, createTransferExtra("UploadTask", cosXmlRequest));
    }

    public void reportUploadTaskSuccess(CosXmlRequest cosXmlRequest) {
        reportRequestSuccess(EVENT_CODE_UPLOAD, cosXmlRequest, Collections.singletonMap("name", "UploadTask"));
    }
}
