package com.tencent.cos.xml.transfer;

import androidx.annotation.p0;
import com.tencent.cos.xml.BeaconService;
import com.tencent.cos.xml.CosXmlSimpleService;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlProgressListener;
import com.tencent.cos.xml.listener.CosXmlResultListener;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.qcloud.core.http.HttpTaskMetrics;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public abstract class COSXMLTask {
    private static final String TAG = "COSXMLTask";
    protected static TaskStateMonitor monitor = TaskStateMonitor.getInstance();
    protected String bucket;
    protected String cosPath;
    protected CosXmlProgressListener cosXmlProgressListener;
    protected CosXmlResultListener cosXmlResultListener;
    protected CosXmlSimpleService cosXmlService;
    protected Map<String, List<String>> headers;
    protected CosXmlProgressListener internalProgressListener;
    protected TransferStateListener internalStateListener;
    protected Exception mException;
    protected CosXmlResult mResult;
    protected OnGetHttpTaskMetrics onGetHttpTaskMetrics;
    protected OnSignatureListener onSignatureListener;
    protected Map<String, String> queries;
    protected String region;
    protected TransferStateListener transferStateListener;
    protected Timer waitTimeoutTimer;
    protected boolean isNeedMd5 = true;
    volatile TransferState taskState = TransferState.WAITING;
    protected AtomicBoolean IS_EXIT = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.tencent.cos.xml.transfer.COSXMLTask$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$cos$xml$transfer$TransferState;

        static {
            int[] iArr = new int[TransferState.values().length];
            $SwitchMap$com$tencent$cos$xml$transfer$TransferState = iArr;
            try {
                iArr[TransferState.WAITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$transfer$TransferState[TransferState.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$transfer$TransferState[TransferState.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$transfer$TransferState[TransferState.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$transfer$TransferState[TransferState.PAUSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$transfer$TransferState[TransferState.CANCELED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$transfer$TransferState[TransferState.RESUMED_WAITING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$transfer$TransferState[TransferState.CONSTRAINED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public class COSXMLMetrics extends HttpTaskMetrics {
        String requestName;

        COSXMLMetrics(String str) {
            this.requestName = str;
        }

        @Override // com.tencent.qcloud.core.http.HttpTaskMetrics
        public void onDataReady() {
            super.onDataReady();
            OnGetHttpTaskMetrics onGetHttpTaskMetrics = COSXMLTask.this.onGetHttpTaskMetrics;
            if (onGetHttpTaskMetrics != null) {
                onGetHttpTaskMetrics.onGetHttpMetrics(this.requestName, this);
            }
        }
    }

    public interface OnGetHttpTaskMetrics {
        void onGetHttpMetrics(String str, HttpTaskMetrics httpTaskMetrics);
    }

    @Deprecated
    public interface OnSignatureListener {
        String onGetSign(CosXmlRequest cosXmlRequest);
    }

    private void dispatchStateChange(TransferState transferState) {
        TransferStateListener transferStateListener = this.transferStateListener;
        if (transferStateListener != null) {
            transferStateListener.onStateChanged(transferState);
        }
        TransferStateListener transferStateListener2 = this.internalStateListener;
        if (transferStateListener2 != null) {
            transferStateListener2.onStateChanged(transferState);
        }
    }

    protected abstract CosXmlRequest buildCOSXMLTaskRequest();

    protected abstract CosXmlResult buildCOSXMLTaskResult(CosXmlResult cosXmlResult);

    public void cancel() {
        if (this.IS_EXIT.get()) {
            return;
        }
        this.IS_EXIT.set(true);
        monitor.sendStateMessage(this, TransferState.CANCELED, new CosXmlClientException(ClientErrorCode.USER_CANCELLED.getCode(), "canceled by user"), null, 2);
    }

    public void clearResultAndException() {
        this.mException = null;
        this.mResult = null;
    }

    void constraintSatisfied() {
        monitor.sendStateMessage(this, TransferState.RESUMED_WAITING, null, null, 5);
    }

    void constraintUnSatisfied() {
        monitor.sendStateMessage(this, TransferState.CONSTRAINED, null, null, 5);
    }

    protected abstract void encounterError(@p0 CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException);

    public Exception getException() {
        return this.mException;
    }

    protected void getHttpMetrics(CosXmlRequest cosXmlRequest, String str) {
        cosXmlRequest.attachMetrics(new COSXMLMetrics(str));
    }

    public CosXmlResult getResult() {
        return this.mResult;
    }

    public TransferState getTaskState() {
        return this.taskState;
    }

    protected void internalCancel() {
    }

    protected void internalCompleted() {
    }

    protected void internalFailed() {
    }

    protected void internalPause() {
    }

    protected void internalResume() {
    }

    public void pause() {
        if (this.IS_EXIT.get()) {
            return;
        }
        this.IS_EXIT.set(true);
        monitor.sendStateMessage(this, TransferState.PAUSED, null, null, 2);
    }

    public void resume() {
        monitor.sendStateMessage(this, TransferState.RESUMED_WAITING, null, null, 2);
    }

    public void setCosXmlProgressListener(CosXmlProgressListener cosXmlProgressListener) {
        this.cosXmlProgressListener = cosXmlProgressListener;
    }

    public void setCosXmlResultListener(CosXmlResultListener cosXmlResultListener) {
        this.cosXmlResultListener = cosXmlResultListener;
        monitor.sendStateMessage(this, null, this.mException, this.mResult, 4);
    }

    protected void setCosXmlService(CosXmlSimpleService cosXmlSimpleService) {
        this.cosXmlService = cosXmlSimpleService;
    }

    void setInternalProgressListener(CosXmlProgressListener cosXmlProgressListener) {
        this.internalProgressListener = cosXmlProgressListener;
    }

    void setInternalStateListener(TransferStateListener transferStateListener) {
        this.internalStateListener = transferStateListener;
    }

    public void setOnGetHttpTaskMetrics(OnGetHttpTaskMetrics onGetHttpTaskMetrics) {
        this.onGetHttpTaskMetrics = onGetHttpTaskMetrics;
    }

    public void setOnSignatureListener(OnSignatureListener onSignatureListener) {
        this.onSignatureListener = onSignatureListener;
    }

    public void setTransferStateListener(TransferStateListener transferStateListener) {
        this.transferStateListener = transferStateListener;
        monitor.sendStateMessage(this, this.taskState, null, null, 4);
    }

    public void startTimeoutTimer(long j10) {
        Timer timer = new Timer();
        this.waitTimeoutTimer = timer;
        timer.schedule(new TimerTask() { // from class: com.tencent.cos.xml.transfer.COSXMLTask.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (COSXMLTask.this.taskState == TransferState.WAITING || COSXMLTask.this.taskState == TransferState.RESUMED_WAITING) {
                    COSXMLTask.this.encounterError(null, new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), "Task waiting timeout."), null);
                }
            }
        }, j10);
    }

    protected synchronized void updateState(TransferState transferState, Exception exc, CosXmlResult cosXmlResult, boolean z10) {
        try {
            if (z10) {
                if (exc != null) {
                    CosXmlResultListener cosXmlResultListener = this.cosXmlResultListener;
                    if (cosXmlResultListener != null) {
                        if (exc instanceof CosXmlClientException) {
                            cosXmlResultListener.onFail(buildCOSXMLTaskRequest(), (CosXmlClientException) exc, null);
                        } else {
                            cosXmlResultListener.onFail(buildCOSXMLTaskRequest(), null, (CosXmlServiceException) exc);
                        }
                    }
                } else if (cosXmlResult != null) {
                    CosXmlResultListener cosXmlResultListener2 = this.cosXmlResultListener;
                    if (cosXmlResultListener2 != null) {
                        cosXmlResultListener2.onSuccess(buildCOSXMLTaskRequest(), cosXmlResult);
                    }
                } else if (transferState != null) {
                    dispatchStateChange(this.taskState);
                }
                return;
            }
            switch (AnonymousClass2.$SwitchMap$com$tencent$cos$xml$transfer$TransferState[transferState.ordinal()]) {
                case 1:
                    if (this.taskState == TransferState.RESUMED_WAITING) {
                        this.taskState = TransferState.WAITING;
                        dispatchStateChange(this.taskState);
                    }
                    return;
                case 2:
                    if (this.taskState == TransferState.WAITING) {
                        this.taskState = TransferState.IN_PROGRESS;
                        dispatchStateChange(this.taskState);
                    }
                    return;
                case 3:
                    if (this.taskState == TransferState.IN_PROGRESS) {
                        this.taskState = TransferState.COMPLETED;
                        this.mResult = buildCOSXMLTaskResult(cosXmlResult);
                        CosXmlResultListener cosXmlResultListener3 = this.cosXmlResultListener;
                        if (cosXmlResultListener3 != null) {
                            cosXmlResultListener3.onSuccess(buildCOSXMLTaskRequest(), this.mResult);
                        }
                        dispatchStateChange(this.taskState);
                        internalCompleted();
                    }
                    return;
                case 4:
                    if (this.taskState == TransferState.WAITING || this.taskState == TransferState.IN_PROGRESS) {
                        this.taskState = TransferState.FAILED;
                        this.mException = exc;
                        CosXmlResultListener cosXmlResultListener4 = this.cosXmlResultListener;
                        if (cosXmlResultListener4 != null) {
                            if (exc instanceof CosXmlClientException) {
                                cosXmlResultListener4.onFail(buildCOSXMLTaskRequest(), (CosXmlClientException) exc, null);
                            } else {
                                cosXmlResultListener4.onFail(buildCOSXMLTaskRequest(), null, (CosXmlServiceException) exc);
                            }
                        }
                        dispatchStateChange(this.taskState);
                        internalFailed();
                    }
                    return;
                case 5:
                    if (this.taskState == TransferState.WAITING || this.taskState == TransferState.IN_PROGRESS) {
                        this.taskState = TransferState.PAUSED;
                        dispatchStateChange(this.taskState);
                        internalPause();
                    }
                    return;
                case 6:
                    TransferState transferState2 = this.taskState;
                    TransferState transferState3 = TransferState.CANCELED;
                    if (transferState2 != transferState3 && this.taskState != TransferState.COMPLETED) {
                        this.taskState = transferState3;
                        dispatchStateChange(this.taskState);
                        this.mException = exc;
                        CosXmlResultListener cosXmlResultListener5 = this.cosXmlResultListener;
                        if (cosXmlResultListener5 != null) {
                            cosXmlResultListener5.onFail(buildCOSXMLTaskRequest(), (CosXmlClientException) exc, null);
                        }
                        internalCancel();
                    }
                    return;
                case 7:
                    if (this.taskState == TransferState.PAUSED || this.taskState == TransferState.FAILED || this.taskState == TransferState.CONSTRAINED) {
                        this.taskState = TransferState.RESUMED_WAITING;
                        dispatchStateChange(this.taskState);
                        internalResume();
                    }
                    return;
                case 8:
                    if (this.taskState == TransferState.WAITING || this.taskState == TransferState.RESUMED_WAITING || this.taskState == TransferState.IN_PROGRESS) {
                        this.taskState = TransferState.CONSTRAINED;
                        dispatchStateChange(this.taskState);
                        internalPause();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("invalid state: " + transferState);
                    BeaconService.getInstance().reportError(TAG, illegalStateException);
                    throw illegalStateException;
                default:
                    IllegalStateException illegalStateException2 = new IllegalStateException("invalid state: " + transferState);
                    BeaconService.getInstance().reportError(TAG, illegalStateException2);
                    throw illegalStateException2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
