package com.tencent.cos.xml;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.crypto.Headers;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlResultListener;
import com.tencent.cos.xml.listener.CosXmlResultSimpleListener;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.bucket.ListMultiUploadsRequest;
import com.tencent.cos.xml.model.bucket.ListMultiUploadsResult;
import com.tencent.cos.xml.model.object.AbortMultiUploadRequest;
import com.tencent.cos.xml.model.object.AbortMultiUploadResult;
import com.tencent.cos.xml.model.object.AppendObjectRequest;
import com.tencent.cos.xml.model.object.CompleteMultiUploadRequest;
import com.tencent.cos.xml.model.object.CompleteMultiUploadResult;
import com.tencent.cos.xml.model.object.CopyObjectRequest;
import com.tencent.cos.xml.model.object.CopyObjectResult;
import com.tencent.cos.xml.model.object.DeleteObjectRequest;
import com.tencent.cos.xml.model.object.DeleteObjectResult;
import com.tencent.cos.xml.model.object.GetObjectBytesRequest;
import com.tencent.cos.xml.model.object.GetObjectBytesResult;
import com.tencent.cos.xml.model.object.GetObjectRequest;
import com.tencent.cos.xml.model.object.GetObjectResult;
import com.tencent.cos.xml.model.object.HeadObjectRequest;
import com.tencent.cos.xml.model.object.HeadObjectResult;
import com.tencent.cos.xml.model.object.InitMultipartUploadRequest;
import com.tencent.cos.xml.model.object.InitMultipartUploadResult;
import com.tencent.cos.xml.model.object.ListPartsRequest;
import com.tencent.cos.xml.model.object.ListPartsResult;
import com.tencent.cos.xml.model.object.PostObjectRequest;
import com.tencent.cos.xml.model.object.PostObjectResult;
import com.tencent.cos.xml.model.object.PreBuildConnectionRequest;
import com.tencent.cos.xml.model.object.PreBuildConnectionResult;
import com.tencent.cos.xml.model.object.PutObjectRequest;
import com.tencent.cos.xml.model.object.PutObjectResult;
import com.tencent.cos.xml.model.object.UploadPartCopyRequest;
import com.tencent.cos.xml.model.object.UploadPartCopyResult;
import com.tencent.cos.xml.model.object.UploadPartRequest;
import com.tencent.cos.xml.model.object.UploadPartResult;
import com.tencent.cos.xml.model.object.UploadRequest;
import com.tencent.cos.xml.transfer.ResponseBytesConverter;
import com.tencent.cos.xml.transfer.ResponseFileBodySerializer;
import com.tencent.cos.xml.transfer.ResponseXmlS3BodySerializer;
import com.tencent.cos.xml.utils.StringUtils;
import com.tencent.cos.xml.utils.URLEncodeUtils;
import com.tencent.qcloud.core.auth.QCloudCredentialProvider;
import com.tencent.qcloud.core.auth.QCloudLifecycleCredentials;
import com.tencent.qcloud.core.auth.QCloudSelfSigner;
import com.tencent.qcloud.core.auth.QCloudSigner;
import com.tencent.qcloud.core.auth.SignerFactory;
import com.tencent.qcloud.core.auth.StaticCredentialProvider;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudResultListener;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.http.HttpResult;
import com.tencent.qcloud.core.http.HttpTask;
import com.tencent.qcloud.core.http.HttpTaskMetrics;
import com.tencent.qcloud.core.http.NetworkClient;
import com.tencent.qcloud.core.http.OkHttpClientImpl;
import com.tencent.qcloud.core.http.QCloudHttpClient;
import com.tencent.qcloud.core.http.QCloudHttpRequest;
import com.tencent.qcloud.core.http.QCloudHttpRetryHandler;
import com.tencent.qcloud.core.http.ResponseBodyConverter;
import com.tencent.qcloud.core.logger.FileLogAdapter;
import com.tencent.qcloud.core.logger.QCloudLogger;
import com.tencent.qcloud.core.task.QCloudTask;
import com.tencent.qcloud.core.task.RetryStrategy;
import com.tencent.qcloud.core.task.TaskExecutors;
import com.tencent.qcloud.core.util.ContextHolder;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class CosXmlSimpleService implements SimpleCosXml {
    private static final String TAG = "CosXmlSimpleService";
    public static String appCachePath;
    protected static volatile QCloudHttpClient client;
    protected CosXmlServiceConfig config;
    protected QCloudCredentialProvider credentialProvider;
    private String requestDomain;
    private QCloudSelfSigner selfSigner;
    protected String signerType;
    protected String tag;

    public CosXmlSimpleService(Context context, CosXmlServiceConfig cosXmlServiceConfig) {
        this.tag = "CosXml";
        this.signerType = "CosXmlSigner";
        if (cosXmlServiceConfig.isDebuggable()) {
            FileLogAdapter fileLogAdapter = FileLogAdapter.getInstance(context, "QLog");
            LogServerProxy.init(context, fileLogAdapter);
            QCloudLogger.addAdapter(fileLogAdapter);
        }
        BeaconService.init(context.getApplicationContext(), cosXmlServiceConfig);
        appCachePath = context.getApplicationContext().getFilesDir().getPath();
        if (client == null) {
            synchronized (CosXmlSimpleService.class) {
                if (client == null) {
                    QCloudHttpClient.Builder builder = new QCloudHttpClient.Builder();
                    init(builder, cosXmlServiceConfig);
                    client = builder.build();
                }
            }
        }
        this.config = cosXmlServiceConfig;
        client.addVerifiedHost("*." + cosXmlServiceConfig.getEndpointSuffix());
        client.addVerifiedHost("*." + cosXmlServiceConfig.getEndpointSuffix(cosXmlServiceConfig.getRegion(), true));
        client.setDebuggable(cosXmlServiceConfig.isDebuggable());
        ContextHolder.setContext(context);
    }

    public CosXmlSimpleService(Context context, CosXmlServiceConfig cosXmlServiceConfig, QCloudCredentialProvider qCloudCredentialProvider) {
        this(context, cosXmlServiceConfig);
        this.credentialProvider = qCloudCredentialProvider;
    }

    public CosXmlSimpleService(Context context, CosXmlServiceConfig cosXmlServiceConfig, QCloudSelfSigner qCloudSelfSigner) {
        this(context, cosXmlServiceConfig);
        this.selfSigner = qCloudSelfSigner;
    }

    public CosXmlSimpleService(Context context, CosXmlServiceConfig cosXmlServiceConfig, QCloudSigner qCloudSigner) {
        this(context, cosXmlServiceConfig);
        this.credentialProvider = new StaticCredentialProvider(null);
        this.signerType = "UserCosXmlSigner";
        SignerFactory.registerSigner("UserCosXmlSigner", qCloudSigner);
    }

    private void init(QCloudHttpClient.Builder builder, CosXmlServiceConfig cosXmlServiceConfig) {
        builder.setConnectionTimeout(cosXmlServiceConfig.getConnectionTimeout()).setSocketTimeout(cosXmlServiceConfig.getSocketTimeout());
        RetryStrategy retryStrategy = cosXmlServiceConfig.getRetryStrategy();
        if (retryStrategy != null) {
            builder.setRetryStrategy(retryStrategy);
        }
        QCloudHttpRetryHandler qCloudHttpRetryHandler = cosXmlServiceConfig.getQCloudHttpRetryHandler();
        if (qCloudHttpRetryHandler != null) {
            builder.setQCloudHttpRetryHandler(qCloudHttpRetryHandler);
        }
        builder.enableDebugLog(cosXmlServiceConfig.isDebuggable());
        if (cosXmlServiceConfig.isEnableQuic()) {
            try {
                builder.setNetworkClient((NetworkClient) Class.forName("com.tencent.qcloud.quic.QuicClientImpl").newInstance());
            } catch (Exception e10) {
                IllegalStateException illegalStateException = new IllegalStateException(e10.getMessage(), e10);
                BeaconService.getInstance().reportError(TAG, illegalStateException);
                throw illegalStateException;
            }
        } else {
            builder.setNetworkClient(new OkHttpClientImpl());
        }
        builder.dnsCache(cosXmlServiceConfig.isDnsCache());
        builder.addPrefetchHost(cosXmlServiceConfig.getEndpointSuffix());
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public AbortMultiUploadResult abortMultiUpload(AbortMultiUploadRequest abortMultiUploadRequest) throws CosXmlServiceException, CosXmlClientException {
        return (AbortMultiUploadResult) execute(abortMultiUploadRequest, new AbortMultiUploadResult());
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public void abortMultiUploadAsync(AbortMultiUploadRequest abortMultiUploadRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(abortMultiUploadRequest, new AbortMultiUploadResult(), cosXmlResultListener);
    }

    public void addCustomerDNS(String str, String[] strArr) throws CosXmlClientException {
        try {
            client.addDnsRecord(str, strArr);
        } catch (UnknownHostException e10) {
            throw new CosXmlClientException(ClientErrorCode.POOR_NETWORK.getCode(), e10);
        }
    }

    @Deprecated
    public void addVerifiedHost(String str) {
        client.addVerifiedHost(str);
    }

    protected <T1 extends CosXmlRequest, T2 extends CosXmlResult> QCloudHttpRequest buildHttpRequest(T1 t10, T2 t11) throws CosXmlClientException {
        QCloudHttpRequest.Builder<T2> builderTag = new QCloudHttpRequest.Builder().method(t10.getMethod()).userAgent(this.config.getUserAgent()).tag((Object) this.tag);
        builderTag.addNoSignHeaderKeys(this.config.getNoSignHeaders());
        builderTag.addNoSignHeaderKeys(t10.getNoSignHeaders());
        builderTag.addNoSignParamKeys(t10.getNoSignParams());
        String requestURL = t10.getRequestURL();
        String requestHost = getRequestHost(t10);
        if (requestURL != null) {
            try {
                builderTag.url(new URL(requestURL));
            } catch (MalformedURLException e10) {
                throw new CosXmlClientException(ClientErrorCode.BAD_REQUEST.getCode(), e10);
            }
        } else {
            t10.checkParameters();
            builderTag.scheme(this.config.getProtocol()).host(requestHost).path(t10.getPath(this.config));
            if (this.config.getPort() != -1) {
                builderTag.port(this.config.getPort());
            }
            builderTag.query(t10.getQueryString());
            if (t10.getQueryEncodedString() != null) {
                builderTag.encodedQuery(t10.getQueryEncodedString());
            }
        }
        if (t10 instanceof CopyObjectRequest) {
            CopyObjectRequest copyObjectRequest = (CopyObjectRequest) t10;
            copyObjectRequest.setCopySource(copyObjectRequest.getCopySource(), this.config);
        }
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(this.config.getCommonHeaders().keySet());
        hashSet.addAll(t10.getRequestHeaders().keySet());
        HashMap map = new HashMap();
        for (String str : hashSet) {
            List<String> list = t10.getRequestHeaders().get(str);
            if (list == null) {
                list = this.config.getCommonHeaders().get(str);
            }
            if (list != null) {
                map.put(str, list);
            }
        }
        if (!map.containsKey("Host")) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(requestHost);
            map.put("Host", linkedList);
        }
        if (t10.headersHasUnsafeNonAscii()) {
            builderTag.addHeadersUnsafeNonAscii(map);
        } else {
            builderTag.addHeaders(map);
        }
        if (t10.isNeedMD5()) {
            builderTag.contentMD5();
        }
        builderTag.setKeyTime(t10.getKeyTime());
        if (this.credentialProvider == null) {
            builderTag.signer(null, null);
        } else {
            builderTag.signer(this.signerType, t10.getSignSourceProvider());
        }
        QCloudSelfSigner qCloudSelfSigner = this.selfSigner;
        if (qCloudSelfSigner != null) {
            builderTag.selfSigner(qCloudSelfSigner);
        }
        builderTag.credentialScope(t10.getSTSCredentialScope(this.config));
        if (t10.getRequestBody() != null) {
            builderTag.body(t10.getRequestBody());
        }
        if (t10 instanceof GetObjectRequest) {
            GetObjectRequest getObjectRequest = (GetObjectRequest) t10;
            if (!TextUtils.isEmpty(getObjectRequest.getDownloadPath())) {
                builderTag.converter((ResponseBodyConverter<T2>) new ResponseFileBodySerializer((GetObjectResult) t11, getObjectRequest.getDownloadPath(), getObjectRequest.getFileOffset()));
            } else if (getObjectRequest.getFileContentUri() != null) {
                builderTag.converter((ResponseBodyConverter<T2>) new ResponseFileBodySerializer((GetObjectResult) t11, getObjectRequest.getFileContentUri(), ContextHolder.getAppContext().getContentResolver(), getObjectRequest.getFileOffset()));
            }
        } else if (t10 instanceof GetObjectBytesRequest) {
            builderTag.converter((ResponseBodyConverter<T2>) new ResponseBytesConverter((GetObjectBytesResult) t11));
        } else if (!buildHttpRequestBodyConverter(t10, t11, builderTag)) {
            builderTag.converter((ResponseBodyConverter<T2>) new ResponseXmlS3BodySerializer(t11));
        }
        builderTag.signInUrl(t10.isSignInUrl() || this.config.isSignInUrl());
        return builderTag.build();
    }

    protected <T1 extends CosXmlRequest, T2 extends CosXmlResult> boolean buildHttpRequestBodyConverter(T1 t10, T2 t11, QCloudHttpRequest.Builder<T2> builder) {
        return false;
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public void cancel(CosXmlRequest cosXmlRequest) {
        if (cosXmlRequest == null || cosXmlRequest.getHttpTask() == null) {
            return;
        }
        cosXmlRequest.getHttpTask().cancel();
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public void cancelAll() {
        Iterator<HttpTask> it = client.getTasksByTag(this.tag).iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public CompleteMultiUploadResult completeMultiUpload(CompleteMultiUploadRequest completeMultiUploadRequest) throws CosXmlServiceException, CosXmlClientException {
        CompleteMultiUploadResult completeMultiUploadResult = new CompleteMultiUploadResult();
        completeMultiUploadResult.accessUrl = getAccessUrl(completeMultiUploadRequest);
        return (CompleteMultiUploadResult) execute(completeMultiUploadRequest, completeMultiUploadResult);
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public void completeMultiUploadAsync(CompleteMultiUploadRequest completeMultiUploadRequest, CosXmlResultListener cosXmlResultListener) {
        CompleteMultiUploadResult completeMultiUploadResult = new CompleteMultiUploadResult();
        completeMultiUploadResult.accessUrl = getAccessUrl(completeMultiUploadRequest);
        schedule(completeMultiUploadRequest, completeMultiUploadResult, cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public CopyObjectResult copyObject(CopyObjectRequest copyObjectRequest) throws CosXmlServiceException, CosXmlClientException {
        return (CopyObjectResult) execute(copyObjectRequest, new CopyObjectResult());
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public UploadPartCopyResult copyObject(UploadPartCopyRequest uploadPartCopyRequest) throws CosXmlServiceException, CosXmlClientException {
        return (UploadPartCopyResult) execute(uploadPartCopyRequest, new UploadPartCopyResult());
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public void copyObjectAsync(CopyObjectRequest copyObjectRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(copyObjectRequest, new CopyObjectResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public void copyObjectAsync(UploadPartCopyRequest uploadPartCopyRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(uploadPartCopyRequest, new UploadPartCopyResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public DeleteObjectResult deleteObject(DeleteObjectRequest deleteObjectRequest) throws CosXmlServiceException, CosXmlClientException {
        return (DeleteObjectResult) execute(deleteObjectRequest, new DeleteObjectResult());
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public void deleteObjectAsync(DeleteObjectRequest deleteObjectRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(deleteObjectRequest, new DeleteObjectResult(), cosXmlResultListener);
    }

    protected <T1 extends CosXmlRequest, T2 extends CosXmlResult> T2 execute(T1 t10, T2 t11) throws CosXmlServiceException, CosXmlClientException {
        try {
            if (t10.getMetrics() == null) {
                t10.attachMetrics(new HttpTaskMetrics());
            }
            HttpTask httpTaskResolveRequest = client.resolveRequest(buildHttpRequest(t10, t11), this.credentialProvider);
            httpTaskResolveRequest.setTransferThreadControl(this.config.isTransferThreadControl());
            t10.setTask(httpTaskResolveRequest);
            if (t10 instanceof AppendObjectRequest) {
                httpTaskResolveRequest.addProgressListener(((AppendObjectRequest) t10).getProgressListener());
            } else if (t10 instanceof PutObjectRequest) {
                httpTaskResolveRequest.addProgressListener(((PutObjectRequest) t10).getProgressListener());
            } else if (t10 instanceof UploadPartRequest) {
                httpTaskResolveRequest.addProgressListener(((UploadPartRequest) t10).getProgressListener());
            } else if (t10 instanceof GetObjectRequest) {
                httpTaskResolveRequest.addProgressListener(((GetObjectRequest) t10).getProgressListener());
            } else if (t10 instanceof PostObjectRequest) {
                httpTaskResolveRequest.addProgressListener(((PostObjectRequest) t10).getProgressListener());
            }
            HttpResult httpResultExecuteNow = httpTaskResolveRequest.executeNow();
            BeaconService.getInstance().reportRequestSuccess(t10);
            if (httpResultExecuteNow != null) {
                return (T2) httpResultExecuteNow.content();
            }
            return null;
        } catch (QCloudClientException e10) {
            throw BeaconService.getInstance().reportRequestClientException(t10, e10);
        } catch (QCloudServiceException e11) {
            throw BeaconService.getInstance().reportRequestServiceException(t10, e11);
        }
    }

    public String getAccessUrl(CosXmlRequest cosXmlRequest) {
        String strCosPathEncode;
        String requestURL = cosXmlRequest.getRequestURL();
        if (requestURL != null) {
            int iIndexOf = requestURL.indexOf("?");
            return iIndexOf > 0 ? requestURL.substring(0, iIndexOf) : requestURL;
        }
        String requestHost = null;
        try {
            requestHost = getRequestHost(cosXmlRequest);
        } catch (CosXmlClientException e10) {
            BeaconService.getInstance().reportError(TAG, e10);
            e10.printStackTrace();
        }
        try {
            strCosPathEncode = URLEncodeUtils.cosPathEncode(cosXmlRequest.getPath(this.config));
        } catch (CosXmlClientException e11) {
            BeaconService.getInstance().reportError(TAG, e11);
            e11.printStackTrace();
            strCosPathEncode = "/";
        }
        return this.config.getProtocol() + HttpConstant.SCHEME_SPLIT + requestHost + strCosPathEncode;
    }

    @Deprecated
    public String getAppid() {
        return this.config.getAppid();
    }

    public CosXmlServiceConfig getConfig() {
        return this.config;
    }

    public QCloudCredentialProvider getCredentialProvider() {
        return this.credentialProvider;
    }

    public File[] getLogFiles(int i10) {
        FileLogAdapter fileLogAdapter;
        LogServerProxy logServerProxy = LogServerProxy.getInstance();
        if (logServerProxy == null || (fileLogAdapter = logServerProxy.getFileLogAdapter()) == null) {
            return null;
        }
        return fileLogAdapter.getLogFilesDesc(i10);
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public GetObjectResult getObject(GetObjectRequest getObjectRequest) throws CosXmlServiceException, CosXmlClientException {
        return (GetObjectResult) execute(getObjectRequest, new GetObjectResult());
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public byte[] getObject(String str, String str2) throws CosXmlServiceException, CosXmlClientException {
        GetObjectBytesResult getObjectBytesResult = (GetObjectBytesResult) execute(new GetObjectBytesRequest(str, str2), new GetObjectBytesResult());
        return getObjectBytesResult != null ? getObjectBytesResult.data : new byte[0];
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public void getObjectAsync(GetObjectRequest getObjectRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getObjectRequest, new GetObjectResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public String getObjectUrl(String str, String str2, String str3) {
        PutObjectRequest putObjectRequest = new PutObjectRequest(str, str3, "");
        putObjectRequest.setRegion(str2);
        return getAccessUrl(putObjectRequest);
    }

    public String getPresignedURL(CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        try {
            QCloudLifecycleCredentials qCloudLifecycleCredentials = (QCloudLifecycleCredentials) this.credentialProvider.getCredentials();
            QCloudSigner signer = SignerFactory.getSigner(this.signerType);
            QCloudHttpRequest qCloudHttpRequestBuildHttpRequest = buildHttpRequest(cosXmlRequest, null);
            signer.sign(qCloudHttpRequestBuildHttpRequest, qCloudLifecycleCredentials);
            String strHeader = qCloudHttpRequestBuildHttpRequest.header("Authorization");
            String strHeader2 = qCloudHttpRequestBuildHttpRequest.header(Headers.SECURITY_TOKEN);
            if (!TextUtils.isEmpty(strHeader2)) {
                strHeader = strHeader + "&x-cos-security-token=" + strHeader2;
            }
            String accessUrl = getAccessUrl(cosXmlRequest);
            String strFlat = StringUtils.flat(cosXmlRequest.getQueryString());
            if (TextUtils.isEmpty(strFlat)) {
                return accessUrl + "?" + strHeader;
            }
            return accessUrl + "?" + strFlat + "&" + strHeader;
        } catch (QCloudClientException e10) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_CREDENTIALS.getCode(), e10);
        }
    }

    @Deprecated
    public String getRegion() {
        return this.config.getRegion();
    }

    @Deprecated
    public String getRegion(CosXmlRequest cosXmlRequest) {
        return cosXmlRequest.getRegion() == null ? this.config.getRegion() : cosXmlRequest.getRegion();
    }

    protected String getRequestHost(CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        return !TextUtils.isEmpty(this.requestDomain) ? this.requestDomain : cosXmlRequest.getRequestHost(this.config);
    }

    protected String getRequestHostHeader(CosXmlRequest cosXmlRequest) {
        return String.format(Locale.ENGLISH, "%s.cos.%s.myqcloud.com", this.config.getBucket(cosXmlRequest.getBucket()), !TextUtils.isEmpty(cosXmlRequest.getRegion()) ? cosXmlRequest.getRegion() : this.config.getRegion());
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public HeadObjectResult headObject(HeadObjectRequest headObjectRequest) throws CosXmlServiceException, CosXmlClientException {
        return (HeadObjectResult) execute(headObjectRequest, new HeadObjectResult());
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public void headObjectAsync(HeadObjectRequest headObjectRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(headObjectRequest, new HeadObjectResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public InitMultipartUploadResult initMultipartUpload(InitMultipartUploadRequest initMultipartUploadRequest) throws CosXmlServiceException, CosXmlClientException {
        return (InitMultipartUploadResult) execute(initMultipartUploadRequest, new InitMultipartUploadResult());
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public void initMultipartUploadAsync(InitMultipartUploadRequest initMultipartUploadRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(initMultipartUploadRequest, new InitMultipartUploadResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public ListMultiUploadsResult listMultiUploads(ListMultiUploadsRequest listMultiUploadsRequest) throws CosXmlServiceException, CosXmlClientException {
        return (ListMultiUploadsResult) execute(listMultiUploadsRequest, new ListMultiUploadsResult());
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public void listMultiUploadsAsync(ListMultiUploadsRequest listMultiUploadsRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(listMultiUploadsRequest, new ListMultiUploadsResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public ListPartsResult listParts(ListPartsRequest listPartsRequest) throws CosXmlServiceException, CosXmlClientException {
        return (ListPartsResult) execute(listPartsRequest, new ListPartsResult());
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public void listPartsAsync(ListPartsRequest listPartsRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(listPartsRequest, new ListPartsResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public PostObjectResult postObject(PostObjectRequest postObjectRequest) throws CosXmlServiceException, CosXmlClientException {
        return (PostObjectResult) execute(postObjectRequest, new PostObjectResult());
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public void postObjectAsync(PostObjectRequest postObjectRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(postObjectRequest, new PostObjectResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public boolean preBuildConnection(String str) {
        try {
            execute(new PreBuildConnectionRequest(str), new PreBuildConnectionResult());
            return true;
        } catch (CosXmlClientException unused) {
            return false;
        } catch (CosXmlServiceException e10) {
            return e10.getStatusCode() != 404;
        }
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public void preBuildConnectionAsync(String str, final CosXmlResultSimpleListener cosXmlResultSimpleListener) {
        schedule(new PreBuildConnectionRequest(str), new PreBuildConnectionResult(), new CosXmlResultListener() { // from class: com.tencent.cos.xml.CosXmlSimpleService.3
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                if (cosXmlServiceException == null || cosXmlServiceException.getStatusCode() == 404) {
                    cosXmlResultSimpleListener.onFail(cosXmlClientException, cosXmlServiceException);
                } else {
                    cosXmlResultSimpleListener.onSuccess();
                }
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                cosXmlResultSimpleListener.onSuccess();
            }
        });
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public PutObjectResult putObject(PutObjectRequest putObjectRequest) throws CosXmlServiceException, CosXmlClientException {
        PutObjectResult putObjectResult = new PutObjectResult();
        putObjectResult.accessUrl = getAccessUrl(putObjectRequest);
        return (PutObjectResult) execute(putObjectRequest, putObjectResult);
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public void putObjectAsync(PutObjectRequest putObjectRequest, CosXmlResultListener cosXmlResultListener) {
        PutObjectResult putObjectResult = new PutObjectResult();
        putObjectResult.accessUrl = getAccessUrl(putObjectRequest);
        schedule(putObjectRequest, putObjectResult, cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public void release() {
        cancelAll();
    }

    protected <T1 extends CosXmlRequest, T2 extends CosXmlResult> void schedule(final T1 t10, T2 t11, final CosXmlResultListener cosXmlResultListener) {
        Object obj = new QCloudResultListener<HttpResult<T2>>() { // from class: com.tencent.cos.xml.CosXmlSimpleService.1
            @Override // com.tencent.qcloud.core.common.QCloudResultListener
            public void onFailure(QCloudClientException qCloudClientException, QCloudServiceException qCloudServiceException) {
                if (qCloudClientException != null) {
                    cosXmlResultListener.onFail(t10, BeaconService.getInstance().reportRequestClientException(t10, qCloudClientException), null);
                } else if (qCloudServiceException != null) {
                    cosXmlResultListener.onFail(t10, null, BeaconService.getInstance().reportRequestServiceException(t10, qCloudServiceException));
                }
            }

            @Override // com.tencent.qcloud.core.common.QCloudResultListener
            public void onSuccess(HttpResult<T2> httpResult) {
                BeaconService.getInstance().reportRequestSuccess(t10);
                cosXmlResultListener.onSuccess(t10, (CosXmlResult) httpResult.content());
            }
        };
        try {
            if (t10.getMetrics() == null) {
                t10.attachMetrics(new HttpTaskMetrics());
            }
            HttpTask httpTaskResolveRequest = client.resolveRequest(buildHttpRequest(t10, t11), this.credentialProvider);
            httpTaskResolveRequest.setTransferThreadControl(this.config.isTransferThreadControl());
            t10.setTask(httpTaskResolveRequest);
            if (t10 instanceof AppendObjectRequest) {
                httpTaskResolveRequest.addProgressListener(((AppendObjectRequest) t10).getProgressListener());
            } else if (t10 instanceof PutObjectRequest) {
                httpTaskResolveRequest.addProgressListener(((PutObjectRequest) t10).getProgressListener());
            } else if (t10 instanceof UploadPartRequest) {
                httpTaskResolveRequest.addProgressListener(((UploadPartRequest) t10).getProgressListener());
                httpTaskResolveRequest.setOnRequestWeightListener(new QCloudTask.OnRequestWeightListener() { // from class: com.tencent.cos.xml.CosXmlSimpleService.2
                    @Override // com.tencent.qcloud.core.task.QCloudTask.OnRequestWeightListener
                    public int onWeight() {
                        return t10.getWeight();
                    }
                });
            } else if (t10 instanceof GetObjectRequest) {
                httpTaskResolveRequest.addProgressListener(((GetObjectRequest) t10).getProgressListener());
            } else if (t10 instanceof PostObjectRequest) {
                httpTaskResolveRequest.addProgressListener(((PostObjectRequest) t10).getProgressListener());
            }
            Executor executor = this.config.getExecutor();
            Executor observeExecutor = this.config.getObserveExecutor();
            if (observeExecutor != null) {
                httpTaskResolveRequest.observeOn(observeExecutor);
            }
            httpTaskResolveRequest.addResultListener(obj);
            if (executor != null) {
                httpTaskResolveRequest.scheduleOn(executor);
            } else if (t10 instanceof UploadRequest) {
                httpTaskResolveRequest.scheduleOn(TaskExecutors.UPLOAD_EXECUTOR, t10.getPriority());
            } else {
                httpTaskResolveRequest.schedule();
            }
        } catch (QCloudClientException e10) {
            cosXmlResultListener.onFail(t10, BeaconService.getInstance().reportRequestClientException(t10, e10), null);
        }
    }

    public void setDomain(String str) {
        this.requestDomain = str;
    }

    public void setNetworkClient(CosXmlServiceConfig cosXmlServiceConfig) {
        synchronized (CosXmlSimpleService.class) {
            QCloudHttpClient.Builder builder = new QCloudHttpClient.Builder();
            init(builder, cosXmlServiceConfig);
            client.setNetworkClientType(builder);
        }
        this.config = cosXmlServiceConfig;
        client.addVerifiedHost("*." + cosXmlServiceConfig.getEndpointSuffix());
        client.addVerifiedHost("*." + cosXmlServiceConfig.getEndpointSuffix(cosXmlServiceConfig.getRegion(), true));
        client.setDebuggable(cosXmlServiceConfig.isDebuggable());
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public UploadPartResult uploadPart(UploadPartRequest uploadPartRequest) throws CosXmlServiceException, CosXmlClientException {
        return (UploadPartResult) execute(uploadPartRequest, new UploadPartResult());
    }

    @Override // com.tencent.cos.xml.SimpleCosXml
    public void uploadPartAsync(UploadPartRequest uploadPartRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(uploadPartRequest, new UploadPartResult(), cosXmlResultListener);
    }
}
