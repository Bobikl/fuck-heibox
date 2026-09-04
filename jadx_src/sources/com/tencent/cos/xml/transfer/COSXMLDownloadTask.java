package com.tencent.cos.xml.transfer;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.p0;
import com.huawei.hms.framework.common.ContainerUtils;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.tencent.cos.xml.BeaconService;
import com.tencent.cos.xml.CosXmlSimpleService;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlProgressListener;
import com.tencent.cos.xml.listener.CosXmlResultListener;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.object.GetObjectRequest;
import com.tencent.cos.xml.model.object.HeadObjectRequest;
import com.tencent.cos.xml.utils.COSUtils;
import com.tencent.cos.xml.utils.DigestUtils;
import com.tencent.cos.xml.utils.FileUtils;
import com.tencent.qcloud.core.common.QCloudTaskStateListener;
import com.tencent.qcloud.core.logger.QCloudLogger;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.List;
import java.util.Map;
import lg.a;

/* JADX INFO: loaded from: classes4.dex */
public final class COSXMLDownloadTask extends COSXMLTask {
    private static final String TAG = COSXMLUploadTask.class.getSimpleName();
    private long downloadComplete;
    private String eTag;
    private long fileOffset;
    private GetObjectRequest getObjectRequest;
    private long hasWriteDataLen;
    private HeadObjectRequest headObjectRequest;
    private String localSaveDirPath;
    private String localSaveFileName;
    private long rangeEnd;
    private long rangeStart;
    private SharedPreferences sharedPreferences;
    private long startTime;

    public static class COSXMLDownloadTaskRequest extends GetObjectRequest {
        protected COSXMLDownloadTaskRequest(String str, String str2, String str3, String str4, String str5, Map<String, List<String>> map, Map<String, String> map2) {
            super(str2, str3, str4, str5);
            setRegion(str);
            setRequestHeaders(map);
            setQueryParameters(map2);
        }
    }

    public static class COSXMLDownloadTaskResult extends CosXmlResult {
        public String eTag;

        protected COSXMLDownloadTaskResult() {
        }
    }

    COSXMLDownloadTask(Context context, CosXmlSimpleService cosXmlSimpleService, GetObjectRequest getObjectRequest) {
        this(context, cosXmlSimpleService, getObjectRequest.getRegion(), getObjectRequest.getBucket(), getObjectRequest.getPath(cosXmlSimpleService.getConfig()), getObjectRequest.getSavePath(), getObjectRequest.getSaveFileName());
        this.queries = getObjectRequest.getQueryString();
        this.headers = getObjectRequest.getRequestHeaders();
        this.isNeedMd5 = getObjectRequest.isNeedMD5();
        Map<String, List<String>> map = this.headers;
        if (map != null && map.containsKey("Range")) {
            String str = this.headers.get("Range").get(0);
            int iIndexOf = str.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
            int iIndexOf2 = str.indexOf(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            this.rangeStart = Long.valueOf(str.substring(iIndexOf + 1, iIndexOf2)).longValue();
            String strSubstring = str.substring(iIndexOf2 + 1);
            if (!TextUtils.isEmpty(strSubstring)) {
                this.rangeEnd = Long.valueOf(strSubstring).longValue();
            }
        }
        this.fileOffset = getObjectRequest.getFileOffset();
    }

    COSXMLDownloadTask(Context context, CosXmlSimpleService cosXmlSimpleService, String str, String str2, String str3, String str4, String str5) {
        this.rangeStart = 0L;
        this.rangeEnd = -1L;
        this.fileOffset = 0L;
        this.hasWriteDataLen = 0L;
        this.startTime = 0L;
        this.region = str;
        this.bucket = str2;
        this.cosPath = str3;
        this.localSaveDirPath = str4;
        this.localSaveFileName = str5;
        this.cosXmlService = cosXmlSimpleService;
        if (context != null) {
            this.sharedPreferences = context.getSharedPreferences("COSXMLDOWNLOADTASK", 0);
        }
    }

    private void cancelAllRequest() {
        this.cosXmlService.cancel(this.headObjectRequest);
        this.cosXmlService.cancel(this.getObjectRequest);
    }

    private synchronized void clear() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove(getKey()).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getDownloadPath() {
        String str;
        String str2 = this.localSaveDirPath;
        if (str2 == null) {
            return null;
        }
        if (str2.endsWith("/")) {
            str = this.localSaveDirPath;
        } else {
            str = this.localSaveDirPath + "/";
        }
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (this.localSaveFileName != null) {
            return str + this.localSaveFileName;
        }
        String str3 = this.cosPath;
        if (str3 == null) {
            return str;
        }
        int iLastIndexOf = str3.lastIndexOf("/");
        if (iLastIndexOf >= 0) {
            return str + this.cosPath.substring(iLastIndexOf + 1);
        }
        return str + this.cosPath;
    }

    private String getKey() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(ChannelsDetailActivity.f79595e4);
        stringBuffer.append(a.f131412e);
        stringBuffer.append(this.region);
        stringBuffer.append(a.f131412e);
        stringBuffer.append(this.bucket);
        stringBuffer.append(a.f131412e);
        stringBuffer.append(this.cosPath);
        stringBuffer.append(a.f131412e);
        stringBuffer.append(this.rangeStart);
        stringBuffer.append(a.f131412e);
        stringBuffer.append(this.rangeEnd);
        stringBuffer.append(a.f131412e);
        stringBuffer.append(this.fileOffset);
        stringBuffer.append(a.f131412e);
        stringBuffer.append(this.localSaveDirPath);
        stringBuffer.append(a.f131412e);
        stringBuffer.append(this.localSaveFileName);
        stringBuffer.append(a.f131412e);
        stringBuffer.append(this.eTag);
        try {
            return DigestUtils.getSha1(stringBuffer.toString());
        } catch (CosXmlClientException unused) {
            return stringBuffer.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized String hasExisted() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString(getKey(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void realDownload(long j10, long j11, long j12) {
        GetObjectRequest getObjectRequest = new GetObjectRequest(this.bucket, this.cosPath, this.localSaveDirPath, this.localSaveFileName);
        this.getObjectRequest = getObjectRequest;
        getObjectRequest.setRegion(this.region);
        this.getObjectRequest.setFileOffset(j12);
        this.getObjectRequest.setQueryParameters(this.queries);
        this.getObjectRequest.setRequestHeaders(this.headers);
        if (j11 > 0 || j10 > 0) {
            this.getObjectRequest.setRange(j10, j11);
        }
        COSXMLTask.OnSignatureListener onSignatureListener = this.onSignatureListener;
        if (onSignatureListener != null) {
            GetObjectRequest getObjectRequest2 = this.getObjectRequest;
            getObjectRequest2.setSign(onSignatureListener.onGetSign(getObjectRequest2));
        }
        getHttpMetrics(this.getObjectRequest, BeaconService.EVENT_PARAMS_NODE_GET);
        this.getObjectRequest.setProgressListener(new CosXmlProgressListener() { // from class: com.tencent.cos.xml.transfer.COSXMLDownloadTask.1
            @Override // com.tencent.qcloud.core.common.QCloudProgressListener
            public void onProgress(long j13, long j14) {
                COSXMLDownloadTask.this.downloadComplete = j13;
                COSXMLDownloadTask cOSXMLDownloadTask = COSXMLDownloadTask.this;
                CosXmlProgressListener cosXmlProgressListener = cOSXMLDownloadTask.cosXmlProgressListener;
                if (cosXmlProgressListener != null) {
                    cosXmlProgressListener.onProgress(cOSXMLDownloadTask.hasWriteDataLen + j13, COSXMLDownloadTask.this.hasWriteDataLen + j14);
                }
            }
        });
        this.cosXmlService.getObjectAsync(this.getObjectRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSXMLDownloadTask.2
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                Exception exc;
                if (cosXmlRequest != COSXMLDownloadTask.this.getObjectRequest) {
                    return;
                }
                if (cosXmlClientException == null || COSXMLDownloadTask.this.taskState == TransferState.PAUSED || COSXMLDownloadTask.this.taskState == TransferState.CANCELED) {
                    cosXmlClientException = null;
                } else {
                    BeaconService.getInstance().reportDownloadTaskClientException(cosXmlRequest, cosXmlClientException);
                }
                if (cosXmlServiceException == null || COSXMLDownloadTask.this.taskState == TransferState.PAUSED || COSXMLDownloadTask.this.taskState == TransferState.CANCELED) {
                    exc = cosXmlClientException;
                } else {
                    BeaconService.getInstance().reportDownloadTaskServiceException(cosXmlRequest, cosXmlServiceException);
                    exc = cosXmlServiceException;
                }
                if (COSXMLDownloadTask.this.IS_EXIT.get()) {
                    return;
                }
                COSXMLDownloadTask.this.IS_EXIT.set(true);
                COSXMLDownloadTask.this.updateState(TransferState.FAILED, exc, null, false);
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                if (cosXmlRequest != COSXMLDownloadTask.this.getObjectRequest) {
                    return;
                }
                BeaconService.getInstance().reportDownloadTaskSuccess(COSXMLDownloadTask.this.getObjectRequest);
                if (COSXMLDownloadTask.this.IS_EXIT.get()) {
                    return;
                }
                COSXMLDownloadTask.this.IS_EXIT.set(true);
                COSXMLDownloadTask.this.updateState(TransferState.COMPLETED, null, cosXmlResult, false);
            }
        });
    }

    private synchronized String removeIfExist() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences == null) {
            return null;
        }
        String string = sharedPreferences.getString(getKey(), null);
        if (string == null) {
            FileUtils.deleteFileIfExist(getDownloadPath());
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void save(String str) {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(getKey(), str).commit();
        }
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected CosXmlRequest buildCOSXMLTaskRequest() {
        return new COSXMLDownloadTaskRequest(this.region, this.bucket, this.cosPath, this.localSaveDirPath, this.localSaveFileName, this.headers, this.queries);
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected CosXmlResult buildCOSXMLTaskResult(CosXmlResult cosXmlResult) {
        COSXMLDownloadTaskResult cOSXMLDownloadTaskResult = new COSXMLDownloadTaskResult();
        if (cosXmlResult != null) {
            cOSXMLDownloadTaskResult.httpCode = cosXmlResult.httpCode;
            cOSXMLDownloadTaskResult.httpMessage = cosXmlResult.httpMessage;
            cOSXMLDownloadTaskResult.headers = cosXmlResult.headers;
            cOSXMLDownloadTaskResult.eTag = this.eTag;
            cOSXMLDownloadTaskResult.accessUrl = cosXmlResult.accessUrl;
        }
        return cOSXMLDownloadTaskResult;
    }

    protected void download() {
        this.startTime = System.nanoTime();
        run();
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void encounterError(@p0 CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
        if (this.IS_EXIT.get()) {
            return;
        }
        this.IS_EXIT.set(true);
        updateState(TransferState.FAILED, COSUtils.mergeException(cosXmlClientException, cosXmlServiceException), null, false);
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void internalCancel() {
        cancelAllRequest();
        clear();
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void internalCompleted() {
        clear();
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void internalFailed() {
        cancelAllRequest();
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void internalPause() {
        if (this.getObjectRequest != null) {
            BeaconService.getInstance().reportDownloadTaskSuccess(this.getObjectRequest);
        }
        cancelAllRequest();
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void internalResume() {
        this.taskState = TransferState.WAITING;
        this.IS_EXIT.set(false);
        download();
    }

    protected void run() {
        HeadObjectRequest headObjectRequest = new HeadObjectRequest(this.bucket, this.cosPath);
        this.headObjectRequest = headObjectRequest;
        headObjectRequest.setRequestHeaders(this.headers);
        this.headObjectRequest.setQueryParameters(this.queries);
        this.headObjectRequest.setRegion(this.region);
        final String downloadPath = getDownloadPath();
        COSXMLTask.OnSignatureListener onSignatureListener = this.onSignatureListener;
        if (onSignatureListener != null) {
            HeadObjectRequest headObjectRequest2 = this.headObjectRequest;
            headObjectRequest2.setSign(onSignatureListener.onGetSign(headObjectRequest2));
        }
        getHttpMetrics(this.headObjectRequest, BeaconService.EVENT_PARAMS_NODE_HEAD);
        this.headObjectRequest.setTaskStateListener(new QCloudTaskStateListener() { // from class: com.tencent.cos.xml.transfer.COSXMLDownloadTask.3
            @Override // com.tencent.qcloud.core.common.QCloudTaskStateListener
            public void onStateChanged(String str, int i10) {
                if (COSXMLDownloadTask.this.IS_EXIT.get() || i10 == 1) {
                    return;
                }
                COSXMLDownloadTask.this.updateState(TransferState.IN_PROGRESS, null, null, false);
            }
        });
        this.cosXmlService.headObjectAsync(this.headObjectRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSXMLDownloadTask.4
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                Exception exc;
                if (cosXmlRequest != COSXMLDownloadTask.this.headObjectRequest) {
                    return;
                }
                if (COSXMLDownloadTask.this.IS_EXIT.get()) {
                    exc = cosXmlClientException;
                    return;
                }
                if (cosXmlClientException == null) {
                    exc = cosXmlServiceException;
                }
                exc.printStackTrace();
                COSXMLDownloadTask.this.updateState(TransferState.FAILED, exc, null, false);
                QCloudLogger.i(COSXMLDownloadTask.TAG, "head " + COSXMLDownloadTask.this.cosPath + "failed !, exception is " + exc.getMessage(), new Object[0]);
                FileUtils.deleteFileIfExist(downloadPath);
                COSXMLDownloadTask.this.hasWriteDataLen = 0L;
                COSXMLDownloadTask cOSXMLDownloadTask = COSXMLDownloadTask.this;
                cOSXMLDownloadTask.realDownload(cOSXMLDownloadTask.rangeStart, COSXMLDownloadTask.this.rangeEnd, COSXMLDownloadTask.this.fileOffset);
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                if (cosXmlRequest == COSXMLDownloadTask.this.headObjectRequest && !COSXMLDownloadTask.this.IS_EXIT.get()) {
                    List<String> list = cosXmlResult.headers.get("ETag");
                    if (list != null && list.size() > 0) {
                        COSXMLDownloadTask.this.eTag = list.get(0);
                    }
                    String strHasExisted = COSXMLDownloadTask.this.hasExisted();
                    if (strHasExisted != null) {
                        File file = new File(strHasExisted);
                        if (file.exists()) {
                            long length = file.length();
                            List<String> list2 = cosXmlResult.headers.get("Content-Length");
                            if (list2 == null || list2.size() <= 0 || Long.valueOf(list2.get(0)).longValue() != length) {
                                COSXMLDownloadTask cOSXMLDownloadTask = COSXMLDownloadTask.this;
                                cOSXMLDownloadTask.hasWriteDataLen = length - cOSXMLDownloadTask.fileOffset;
                                COSXMLDownloadTask cOSXMLDownloadTask2 = COSXMLDownloadTask.this;
                                cOSXMLDownloadTask2.realDownload(cOSXMLDownloadTask2.rangeStart + COSXMLDownloadTask.this.hasWriteDataLen, COSXMLDownloadTask.this.rangeEnd, COSXMLDownloadTask.this.fileOffset + COSXMLDownloadTask.this.hasWriteDataLen);
                                return;
                            }
                            CosXmlProgressListener cosXmlProgressListener = COSXMLDownloadTask.this.cosXmlProgressListener;
                            if (cosXmlProgressListener != null) {
                                cosXmlProgressListener.onProgress(length, length);
                            }
                            COSXMLDownloadTask.this.IS_EXIT.set(true);
                            COSXMLDownloadTask.this.updateState(TransferState.COMPLETED, null, cosXmlResult, false);
                            return;
                        }
                    }
                    FileUtils.deleteFileIfExist(downloadPath);
                    COSXMLDownloadTask cOSXMLDownloadTask3 = COSXMLDownloadTask.this;
                    cOSXMLDownloadTask3.save(cOSXMLDownloadTask3.getDownloadPath());
                    COSXMLDownloadTask.this.hasWriteDataLen = 0L;
                    COSXMLDownloadTask cOSXMLDownloadTask4 = COSXMLDownloadTask.this;
                    cOSXMLDownloadTask4.realDownload(cOSXMLDownloadTask4.rangeStart, COSXMLDownloadTask.this.rangeEnd, COSXMLDownloadTask.this.fileOffset);
                }
            }
        });
    }
}
