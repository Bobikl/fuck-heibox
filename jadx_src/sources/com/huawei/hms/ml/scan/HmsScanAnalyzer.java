package com.huawei.hms.ml.scan;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.hms.hmsscankit.ScanUtil;
import com.huawei.hms.mlsdk.common.MLAnalyzer;
import com.huawei.hms.mlsdk.common.MLFrame;
import com.huawei.hms.scankit.p.o4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public class HmsScanAnalyzer extends MLAnalyzer<HmsScan> {
    private static final String TAG = "HmsScanAnalyzer";
    private Context mContext;
    private HmsScanAnalyzerOptions mlVisionScanDetectorOptions;

    public static class Creator {
        private Context mContext;
        private HmsScanAnalyzerOptions mOptions;

        public Creator() {
            this.mContext = AGConnectInstance.getInstance().getContext();
        }

        public Creator(Context context) {
            this.mContext = context;
        }

        public HmsScanAnalyzer create() {
            Context context = this.mContext;
            HmsScanAnalyzerOptions hmsScanAnalyzerOptionsCreate = this.mOptions;
            if (hmsScanAnalyzerOptionsCreate == null) {
                hmsScanAnalyzerOptionsCreate = new HmsScanAnalyzerOptions.Creator().setHmsScanTypes(0, new int[0]).create();
            }
            return new HmsScanAnalyzer(context, hmsScanAnalyzerOptionsCreate);
        }

        public Creator setHmsScanTypes(int i10, int... iArr) {
            this.mOptions = new HmsScanAnalyzerOptions.Creator().setHmsScanTypes(i10, iArr).create();
            return this;
        }

        public Creator setHmsScanTypes(HmsScanAnalyzerOptions hmsScanAnalyzerOptions) {
            if (hmsScanAnalyzerOptions == null) {
                this.mOptions = new HmsScanAnalyzerOptions.Creator().setHmsScanTypes(0, new int[0]).create();
            } else {
                this.mOptions = hmsScanAnalyzerOptions;
            }
            return this;
        }
    }

    public HmsScanAnalyzer() {
        if (AGConnectInstance.getInstance() != null) {
            this.mContext = AGConnectInstance.getInstance().getContext();
        } else {
            o4.e(TAG, "AGConnectInstanceImpl contect is null");
        }
    }

    private HmsScanAnalyzer(Context context, HmsScanAnalyzerOptions hmsScanAnalyzerOptions) {
        this.mContext = context;
        this.mlVisionScanDetectorOptions = hmsScanAnalyzerOptions;
    }

    public HmsScanAnalyzer(HmsScanAnalyzerOptions hmsScanAnalyzerOptions) {
        this.mContext = AGConnectInstance.getInstance().getContext();
        this.mlVisionScanDetectorOptions = hmsScanAnalyzerOptions;
    }

    @Override // com.huawei.hms.mlsdk.common.MLAnalyzer
    public SparseArray<HmsScan> analyseFrame(MLFrame mLFrame) {
        o4.b("scankit mul", "start analyseFrame");
        if (mLFrame == null) {
            return new SparseArray<>();
        }
        HmsScan[] hmsScanArrDetectForHmsDector = ScanUtil.detectForHmsDector(this.mContext, mLFrame, this.mlVisionScanDetectorOptions);
        o4.b("scankit mul", "analyseFrame end");
        SparseArray<HmsScan> sparseArray = new SparseArray<>();
        for (HmsScan hmsScan : hmsScanArrDetectForHmsDector) {
            if (hmsScan != null && !TextUtils.isEmpty(hmsScan.originalValue)) {
                sparseArray.append(hmsScan.originalValue.hashCode(), hmsScan);
            }
        }
        return sparseArray;
    }

    public Task<List<HmsScan>> analyzInAsyn(final MLFrame mLFrame) {
        return Tasks.callInBackground(new Callable<List<HmsScan>>() { // from class: com.huawei.hms.ml.scan.HmsScanAnalyzer.1
            @Override // java.util.concurrent.Callable
            public List<HmsScan> call() throws Exception {
                if (mLFrame == null) {
                    return null;
                }
                HmsScan[] hmsScanArrDetectForHmsDector = ScanUtil.detectForHmsDector(HmsScanAnalyzer.this.mContext, mLFrame, HmsScanAnalyzer.this.mlVisionScanDetectorOptions);
                ArrayList arrayList = new ArrayList();
                for (HmsScan hmsScan : hmsScanArrDetectForHmsDector) {
                    if (hmsScan != null && !TextUtils.isEmpty(hmsScan.originalValue)) {
                        arrayList.add(hmsScan);
                    }
                }
                return arrayList;
            }
        });
    }

    public void destory() throws IOException {
        super.destroy();
    }

    @Override // com.huawei.hms.mlsdk.common.MLAnalyzer
    public boolean isAvailable() {
        return ScanUtil.isScanAvailable(this.mContext);
    }
}
