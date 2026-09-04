package com.tencent.cos.xml.transfer;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.p0;
import bolts.e;
import bolts.h;
import bolts.i;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.common.Range;
import com.tencent.cos.xml.crypto.COSDirect;
import com.tencent.cos.xml.crypto.Headers;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlProgressListener;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.object.GetObjectRequest;
import com.tencent.cos.xml.model.object.GetObjectResult;
import com.tencent.cos.xml.model.object.HeadObjectRequest;
import com.tencent.cos.xml.model.object.HeadObjectResult;
import com.tencent.cos.xml.utils.DigestUtils;
import com.tencent.cos.xml.utils.FileUtils;
import com.tencent.qcloud.core.http.HttpTaskMetrics;
import com.tencent.qcloud.core.util.ContextHolder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class COSDownloadTask extends COSTransferTask {
    private static final int DOWNLOAD_CONCURRENT = 3;
    private static final String TAG = "QCloudDownload";
    private static ThreadPoolExecutor downloadTaskExecutor = new ThreadPoolExecutor(3, 3, 5, TimeUnit.SECONDS, new LinkedBlockingQueue(Integer.MAX_VALUE), new COSTransferTask.TaskThreadFactory("QCloudDownload-", 8));
    private volatile GetObjectRequest mGetObjectRequest;
    private SimpleDownloadTask simpleDownloadTask;

    public static class DownloadRecord {

        @p0
        String crc64ecma;
        List<DownloadedBlock> downloadedBlocks;
        String eTag;
        String lastModified;
        long remoteEnd;
        long remoteStart;

        public DownloadRecord(String str, String str2, String str3, long j10, long j11, List<DownloadedBlock> list) {
            this.lastModified = str;
            this.eTag = str2;
            this.crc64ecma = str3;
            this.downloadedBlocks = list;
            this.remoteStart = j10;
            this.remoteEnd = j11;
        }

        public static String flatJson(DownloadRecord downloadRecord) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("lastModified", downloadRecord.lastModified);
            jSONObject.put("eTag", downloadRecord.eTag);
            jSONObject.put("crc64ecma", downloadRecord.crc64ecma);
            jSONObject.put("remoteStart", downloadRecord.remoteStart);
            jSONObject.put("remoteEnd", downloadRecord.remoteEnd);
            JSONArray jSONArray = new JSONArray();
            for (DownloadedBlock downloadedBlock : downloadRecord.downloadedBlocks) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("from", downloadedBlock.from);
                jSONObject2.put("to", downloadedBlock.to);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("downloadedBlocks", jSONArray);
            return jSONObject.toString();
        }

        public static DownloadRecord toJson(String str) throws JSONException {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("lastModified");
            String string2 = jSONObject.getString("eTag");
            String strOptString = jSONObject.optString("crc64ecma");
            String string3 = jSONObject.getString("remoteStart");
            String string4 = jSONObject.getString("remoteEnd");
            JSONArray jSONArray = jSONObject.getJSONArray("downloadedBlocks");
            LinkedList linkedList = new LinkedList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject2 = (JSONObject) jSONArray.get(i10);
                linkedList.add(new DownloadedBlock(Long.parseLong(jSONObject2.getString("from")), Long.parseLong(jSONObject2.getString("to"))));
            }
            return new DownloadRecord(string, string2, strOptString, Long.parseLong(string3), Long.parseLong(string4), linkedList);
        }
    }

    public static class DownloadedBlock {
        long from;
        long to;

        public DownloadedBlock(long j10, long j11) {
            this.from = j10;
            this.to = j11;
        }
    }

    public static class SimpleDownloadTask implements Runnable {
        private String bucket;
        private COSDirect cosDirect;
        private String crc64ecma;
        private String eTag;
        private volatile GetObjectRequest getObjectRequest;
        private volatile HeadObjectRequest headObjectRequest;
        private String key;
        private String lastModified;
        private TransferTaskMetrics mTransferMetrics;
        private e mTransferTaskCts;
        private String region;
        private SharedPreferences sharedPreferences;
        private String taskId;
        private long remoteStart = 0;
        private long remoteEnd = -1;
        private i<GetObjectResult> tcs = new i<>();

        public SimpleDownloadTask(COSDirect cOSDirect, GetObjectRequest getObjectRequest, e eVar) {
            this.cosDirect = cOSDirect;
            this.getObjectRequest = getObjectRequest;
            this.mTransferTaskCts = eVar;
        }

        private void checkCRC64(@p0 String str, File file, long j10, long j11) throws CosXmlClientException {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                long crc64 = DigestUtils.getCRC64(new FileInputStream(file), j10, j11);
                long bigIntFromString = DigestUtils.getBigIntFromString(str);
                if (crc64 == bigIntFromString) {
                    COSTransferTask.loggerInfo(COSDownloadTask.TAG, this.taskId, "check offset=%d, size=%d, crc64=%s success", Long.valueOf(j10), Long.valueOf(j11), str);
                    return;
                }
                throw CosXmlClientException.internalException("verify CRC64 failed, local crc64: " + crc64 + ", remote crc64: " + bigIntFromString);
            } catch (FileNotFoundException e10) {
                throw CosXmlClientException.internalException("verify CRC64 failed: " + e10.getMessage());
            }
        }

        private void checkMd5(@p0 String str, File file) throws Throwable {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String md5 = DigestUtils.getMD5(file.getAbsolutePath());
            String strReplaceAll = str.replaceAll("\"", "");
            if (md5.equals(strReplaceAll)) {
                COSTransferTask.loggerInfo(COSDownloadTask.TAG, this.taskId, "check md5=%s success", strReplaceAll);
                return;
            }
            throw CosXmlClientException.internalException("verify MD5 failed, local MD5: " + md5 + ", remote MD5: " + strReplaceAll);
        }

        private void checking() throws CosXmlServiceException, CosXmlClientException {
            Range range = this.getObjectRequest.getRange();
            if (range != null) {
                this.remoteStart = range.getStart();
                this.remoteEnd = range.getEnd();
            } else {
                this.remoteStart = 0L;
                this.remoteEnd = -1L;
            }
            Context appContext = ContextHolder.getAppContext();
            if (appContext == null) {
                throw CosXmlClientException.internalException("context is null");
            }
            this.sharedPreferences = appContext.getSharedPreferences(COSDownloadTask.TAG, 0);
            this.headObjectRequest = new HeadObjectRequest(this.bucket, this.key);
            HttpTaskMetrics httpTaskMetrics = new HttpTaskMetrics();
            this.headObjectRequest.attachMetrics(httpTaskMetrics);
            this.headObjectRequest.setRegion(this.region);
            this.headObjectRequest.setRequestHeaders(getHeadHeaders(this.getObjectRequest));
            HeadObjectResult headObjectResultHeadObject = this.cosDirect.headObject(this.headObjectRequest);
            this.mTransferMetrics.connectAddress = httpTaskMetrics.getConnectAddress();
            this.lastModified = headObjectResultHeadObject.getHeader("Last-Modified");
            this.eTag = headObjectResultHeadObject.getHeader("ETag");
            this.crc64ecma = headObjectResultHeadObject.getHeader(Headers.COS_HASH_CRC64_ECMA);
            COSTransferTask.loggerInfo(COSDownloadTask.TAG, this.taskId, "start download to %s", this.getObjectRequest.getDownloadPath());
            COSTransferTask.loggerInfo(COSDownloadTask.TAG, this.taskId, "checkout remoteStart=%d, remoteEnd=%d, crc64ecma=%s", Long.valueOf(this.remoteStart), Long.valueOf(this.remoteEnd), this.crc64ecma);
        }

        private void checkoutManualCanceled() throws CosXmlClientException {
            if (this.mTransferTaskCts.g()) {
                throw CosXmlClientException.manualCancelException();
            }
        }

        private GetObjectResult download() throws CosXmlServiceException, CosXmlClientException {
            try {
                this.sharedPreferences.edit().putString(this.key, DownloadRecord.flatJson(new DownloadRecord(this.lastModified, this.eTag, this.crc64ecma, this.remoteStart, this.remoteEnd, new LinkedList()))).apply();
            } catch (JSONException e10) {
                COSTransferTask.loggerWarn(COSDownloadTask.TAG, this.taskId, "save DownloadRecord failed: %s", e10.getMessage());
            }
            Range range = this.getObjectRequest.getRange();
            String str = this.taskId;
            Object[] objArr = new Object[3];
            objArr[0] = Long.valueOf(range != null ? range.getStart() : 0L);
            objArr[1] = Long.valueOf(range != null ? range.getEnd() : -1L);
            objArr[2] = Long.valueOf(this.getObjectRequest.getFileOffset());
            COSTransferTask.loggerInfo(COSDownloadTask.TAG, str, "start download [%d,%d] with fileOffset=%d", objArr);
            GetObjectResult object = this.cosDirect.getObject(this.getObjectRequest);
            this.sharedPreferences.edit().remove(this.key).apply();
            COSTransferTask.loggerInfo(COSDownloadTask.TAG, this.taskId, "download complete", new Object[0]);
            return object;
        }

        private Map<String, List<String>> getHeadHeaders(GetObjectRequest getObjectRequest) {
            Map<String, List<String>> requestHeaders = getObjectRequest.getRequestHeaders();
            return requestHeaders == null ? new HashMap() : new HashMap(requestHeaders);
        }

        @p0
        private boolean hasDownloadPart() throws CosXmlClientException {
            String str;
            String str2;
            String str3;
            String string = this.sharedPreferences.getString(this.key, "");
            if (TextUtils.isEmpty(string)) {
                COSTransferTask.loggerInfo(COSDownloadTask.TAG, this.taskId, "not find DownloadRecord", new Object[0]);
                return false;
            }
            COSTransferTask.loggerInfo(COSDownloadTask.TAG, this.taskId, "find DownloadRecord: %s", string);
            try {
                DownloadRecord json = DownloadRecord.toJson(string);
                String str4 = json.lastModified;
                if (str4 != null && str4.equals(this.lastModified) && (str = json.eTag) != null && str.equals(this.eTag) && (((str2 = json.crc64ecma) == null || (str3 = this.crc64ecma) == null || str2.equals(str3)) && json.remoteStart == this.remoteStart && json.remoteEnd == this.remoteEnd)) {
                    return true;
                }
                COSTransferTask.loggerWarn(COSDownloadTask.TAG, this.taskId, "verify DownloadRecord failed: lastModified:%s, eTag:%s, crc64ecma:%s, remoteStart:%d, remoteEnd:%d", this.lastModified, this.eTag, this.crc64ecma, Long.valueOf(this.remoteStart), Long.valueOf(this.remoteEnd));
                return false;
            } catch (JSONException e10) {
                COSTransferTask.loggerInfo(COSDownloadTask.TAG, this.taskId, "parse DownloadRecord failed: %s", e10.getMessage());
                return false;
            }
        }

        private boolean isRangeDownload() {
            return (this.remoteStart == 0 && this.remoteEnd == -1) ? false : true;
        }

        private void prepareDownloadContext(boolean z10) {
            File file = new File(this.getObjectRequest.getDownloadPath());
            if (!z10) {
                FileUtils.deleteFileIfExist(file.getAbsolutePath());
                return;
            }
            long length = file.length();
            this.getObjectRequest.setFileOffset(length);
            this.getObjectRequest.setRange(this.remoteStart + length, this.remoteEnd);
            COSTransferTask.loggerInfo(COSDownloadTask.TAG, this.taskId, "has download part %d", Long.valueOf(length));
        }

        private void verifyContent(GetObjectResult getObjectResult) throws Throwable {
            String header = getObjectResult.getHeader(Headers.COS_HASH_CRC64_ECMA);
            String header2 = getObjectResult.getHeader(Headers.UNENCRYPTED_CONTENT_MD5);
            File file = new File(this.getObjectRequest.getDownloadPath());
            this.mTransferMetrics.size = file.length() - this.getObjectRequest.getFileOffset();
            if (isRangeDownload()) {
                checkCRC64(header, file, this.getObjectRequest.getFileOffset(), file.length() - this.getObjectRequest.getFileOffset());
            } else if (this.cosDirect.isTransferSecurely()) {
                checkMd5(header2, file);
            } else {
                checkCRC64(header, file, 0L, -1L);
            }
        }

        public void cancel() {
            if (this.headObjectRequest != null) {
                this.cosDirect.cancel(this.headObjectRequest);
            }
            if (this.getObjectRequest != null) {
                this.cosDirect.cancel(this.getObjectRequest);
            }
        }

        public h<GetObjectResult> getTask() {
            return this.tcs.a();
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            try {
                checkoutManualCanceled();
                checking();
                checkoutManualCanceled();
                boolean zHasDownloadPart = hasDownloadPart();
                checkoutManualCanceled();
                prepareDownloadContext(zHasDownloadPart && !this.cosDirect.isTransferSecurely());
                checkoutManualCanceled();
                GetObjectResult getObjectResultDownload = download();
                checkoutManualCanceled();
                try {
                    verifyContent(getObjectResultDownload);
                    this.tcs.d(getObjectResultDownload);
                } catch (CosXmlClientException e10) {
                    FileUtils.deleteFileIfExist(this.getObjectRequest.getDownloadPath());
                    throw e10;
                }
            } catch (Exception e11) {
                this.tcs.c(e11);
            }
        }

        public void setTaskId(String str) {
            this.taskId = str;
        }
    }

    public COSDownloadTask(COSDirect cOSDirect, GetObjectRequest getObjectRequest) {
        super(cOSDirect, getObjectRequest);
        this.mGetObjectRequest = getObjectRequest;
    }

    private GetObjectResult multipartDownload() throws CosXmlServiceException, CosXmlClientException {
        return null;
    }

    private GetObjectResult simpleDownload() throws Exception {
        SimpleDownloadTask simpleDownloadTask = new SimpleDownloadTask(this.cosDirect, this.mGetObjectRequest, this.mTransferTaskCts);
        this.simpleDownloadTask = simpleDownloadTask;
        simpleDownloadTask.bucket = this.bucket;
        this.simpleDownloadTask.key = this.key;
        this.simpleDownloadTask.region = this.region;
        this.simpleDownloadTask.taskId = this.taskId;
        this.simpleDownloadTask.mTransferMetrics = this.transferTaskMetrics;
        this.mGetObjectRequest.setProgressListener(new CosXmlProgressListener() { // from class: com.tencent.cos.xml.transfer.COSDownloadTask.1
            @Override // com.tencent.qcloud.core.common.QCloudProgressListener
            public void onProgress(long j10, long j11) {
                long fileOffset = COSDownloadTask.this.mGetObjectRequest.getFileOffset();
                COSDownloadTask.this.onTransferProgressChange(j10 + fileOffset, j11 + fileOffset);
            }
        });
        this.simpleDownloadTask.run();
        h<GetObjectResult> task = this.simpleDownloadTask.getTask();
        if (task.J()) {
            throw task.E();
        }
        if (task.I()) {
            return task.F();
        }
        throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), "simple download complete without result");
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    public void cancel() {
        super.cancel();
        SimpleDownloadTask simpleDownloadTask = this.simpleDownloadTask;
        if (simpleDownloadTask != null) {
            simpleDownloadTask.cancel();
        }
        FileUtils.deleteFileIfExist(this.mGetObjectRequest.getDownloadPath());
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    protected void checking() throws CosXmlClientException {
        super.checking();
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    protected CosXmlResult execute() throws Exception {
        return simpleDownload();
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    protected Executor executor() {
        return downloadTaskExecutor;
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    public void pause() {
        super.pause();
        SimpleDownloadTask simpleDownloadTask = this.simpleDownloadTask;
        if (simpleDownloadTask != null) {
            simpleDownloadTask.cancel();
        }
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    protected String tag() {
        return TAG;
    }
}
