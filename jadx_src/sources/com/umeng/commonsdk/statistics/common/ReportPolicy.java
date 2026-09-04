package com.umeng.commonsdk.statistics.common;

import android.content.Context;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMModuleRegister;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.Defcon;

/* JADX INFO: loaded from: classes4.dex */
public class ReportPolicy {
    public static final int BATCH_AT_LAUNCH = 1;
    static final int BATCH_AT_TERMINATE = 2;
    public static final int BATCH_BY_INTERVAL = 6;
    public static final int DAILY = 4;
    static final int IMMEDIATE = 3;
    public static final int QUASI_REALTIME_POLICY = 11;
    public static final int REALTIME = 0;
    public static final int SMART_POLICY = 8;
    public static final int WIFIONLY = 5;

    public static class DebugPolicy extends ReportStrategy {
        private final long ReportInterval = 15000;
        private StatTracer mTracer;

        public DebugPolicy(StatTracer statTracer) {
            this.mTracer = statTracer;
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean z10) {
            return System.currentTimeMillis() - UMEnvelopeBuild.getLastSuccessfulBuildTime(UMModuleRegister.getAppContext()) >= 15000;
        }
    }

    public static class DefconPolicy extends ReportStrategy {
        private Defcon defcon;
        private StatTracer tracer;

        public DefconPolicy(StatTracer statTracer, Defcon defcon) {
            this.tracer = statTracer;
            this.defcon = defcon;
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean isValid() {
            return this.defcon.isOpen();
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean z10) {
            return System.currentTimeMillis() - UMEnvelopeBuild.getLastSuccessfulBuildTime(UMModuleRegister.getAppContext()) >= this.defcon.getReqInterval();
        }

        public boolean shouldSendMessageByInstant() {
            return System.currentTimeMillis() - UMEnvelopeBuild.getLastInstantBuildTime(UMModuleRegister.getAppContext()) >= this.defcon.getReqInterval();
        }
    }

    public static class LatentPolicy extends ReportStrategy {
        private long latency;
        private long start;

        public LatentPolicy(int i10) {
            this.start = 0L;
            this.latency = i10;
            this.start = System.currentTimeMillis();
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean isValid() {
            return System.currentTimeMillis() - this.start < this.latency;
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean z10) {
            return System.currentTimeMillis() - this.start >= this.latency;
        }
    }

    public static class ReportAtLaunch extends ReportStrategy {
        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean z10) {
            return z10;
        }
    }

    public static class ReportByInterval extends ReportStrategy {
        private static long MAX_REPORT_INTERVAL = 86400000;
        private static long MIN_REPORT_INTERVAL = 90000;
        private long mReportInterval;
        private StatTracer mTracer;

        public ReportByInterval(StatTracer statTracer, long j10) {
            this.mTracer = statTracer;
            setReportInterval(j10);
        }

        public static boolean isValidValue(int i10) {
            return ((long) i10) >= MIN_REPORT_INTERVAL;
        }

        public long getReportInterval() {
            return this.mReportInterval;
        }

        public void setReportInterval(long j10) {
            long j11 = MIN_REPORT_INTERVAL;
            if (j10 < j11 || j10 > MAX_REPORT_INTERVAL) {
                this.mReportInterval = j11;
            } else {
                this.mReportInterval = j10;
            }
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean z10) {
            return z10 || System.currentTimeMillis() - UMEnvelopeBuild.getLastSuccessfulBuildTime(UMModuleRegister.getAppContext()) >= this.mReportInterval;
        }
    }

    public static class ReportDaily extends ReportStrategy {
        private long HOURS_DAY = 86400000;
        private StatTracer mTracer;

        public ReportDaily(StatTracer statTracer) {
            this.mTracer = statTracer;
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean z10) {
            return System.currentTimeMillis() - UMEnvelopeBuild.getLastSuccessfulBuildTime(UMModuleRegister.getAppContext()) >= this.HOURS_DAY;
        }
    }

    public static class ReportQuasiRealtime extends ReportStrategy {
        private static long DEFAULT_REPORT_INTERVAL = 15000;
        private static long MAX_REPORT_INTERVAL = 90000;
        private static long MIN_REPORT_INTERVAL = 3000;
        private long mReportInterval;

        public long getReportInterval() {
            return this.mReportInterval;
        }

        public void setReportInterval(long j10) {
            if (j10 < MIN_REPORT_INTERVAL || j10 > MAX_REPORT_INTERVAL) {
                this.mReportInterval = DEFAULT_REPORT_INTERVAL;
            } else {
                this.mReportInterval = j10;
            }
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean z10) {
            return true;
        }
    }

    public static class ReportRealtime extends ReportStrategy {
        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean z10) {
            return true;
        }
    }

    public static class ReportStrategy {
        public boolean isValid() {
            return true;
        }

        public boolean shouldSendMessage(boolean z10) {
            return true;
        }
    }

    public static class ReportWifiOnly extends ReportStrategy {
        private Context mContext;

        public ReportWifiOnly(Context context) {
            this.mContext = context;
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean z10) {
            return DeviceConfig.isWiFiAvailable(this.mContext);
        }
    }

    public static class SmartPolicy extends ReportStrategy {
        private final long ReportInterval = 10800000;
        private StatTracer mTracer;

        public SmartPolicy(StatTracer statTracer) {
            this.mTracer = statTracer;
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean z10) {
            return System.currentTimeMillis() - UMEnvelopeBuild.getLastSuccessfulBuildTime(UMModuleRegister.getAppContext()) >= 10800000;
        }
    }

    public static boolean isValid(int i10) {
        if (i10 != 8 && i10 != 11) {
            switch (i10) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
