package com.huawei.hms.mlsdk.common;

import android.util.SparseArray;
import com.huawei.hms.mlsdk.common.internal.client.event.MonitorEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MLAnalyzer<T> {
    private List<AnalyzerMonitor> monitors = new ArrayList();
    private final Object syncAnalyzer = new Object();
    private MLTransactor<T> transactor;

    public interface MLTransactor<T> {
        void destroy();

        void transactResult(Result<T> result);
    }

    public static class Result<T> {
        private SparseArray<T> analyseList;
        private MLFrame.Property frameProperty;
        private boolean isAnalyzerAvailable;

        public Result(SparseArray<T> sparseArray, MLFrame.Property property, boolean z10) {
            this.analyseList = sparseArray;
            this.frameProperty = property;
            this.isAnalyzerAvailable = z10;
        }

        public SparseArray<T> getAnalyseList() {
            return this.analyseList;
        }

        public MLFrame.Property getFrameProperty() {
            return this.frameProperty;
        }

        public boolean isAnalyzerAvaliable() {
            return this.isAnalyzerAvailable;
        }
    }

    public abstract SparseArray<T> analyseFrame(MLFrame mLFrame);

    public void destroy() {
        synchronized (this.syncAnalyzer) {
            MLTransactor<T> mLTransactor = this.transactor;
            if (mLTransactor != null) {
                mLTransactor.destroy();
                this.transactor = null;
            }
        }
    }

    protected MLFrame.Property.Ext getFramePropertyExt(MLFrame mLFrame) {
        if (mLFrame == null || mLFrame.acquireProperty() == null) {
            return null;
        }
        return mLFrame.acquireProperty().getExt();
    }

    public boolean hasMonitorRegistered() {
        return !this.monitors.isEmpty();
    }

    public boolean isAvailable() {
        return true;
    }

    public void obtainPicture(MLFrame mLFrame) {
        synchronized (this.syncAnalyzer) {
            if (this.transactor == null) {
                throw new IllegalStateException("Transactor must be specified first to receive detection results.");
            }
            MLFrame.Property property = new MLFrame.Property(mLFrame.acquireProperty());
            property.resetWidthAndHeight();
            this.transactor.transactResult(new Result<>(analyseFrame(mLFrame), property, isAvailable()));
        }
    }

    public void postMonitorEvent(MonitorEvent monitorEvent) {
        for (AnalyzerMonitor analyzerMonitor : this.monitors) {
            if (analyzerMonitor != null) {
                analyzerMonitor.receive(monitorEvent);
            }
        }
    }

    public void registerMonitor(AnalyzerMonitor analyzerMonitor) {
        this.monitors.add(analyzerMonitor);
    }

    public void setTransactor(MLTransactor<T> mLTransactor) {
        synchronized (this.syncAnalyzer) {
            this.transactor = mLTransactor;
        }
    }

    public boolean traceItem(int i10) {
        return true;
    }

    public void unregisterMonitor(AnalyzerMonitor analyzerMonitor) {
        this.monitors.remove(analyzerMonitor);
    }
}
