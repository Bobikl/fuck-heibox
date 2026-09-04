package com.efs.sdk.pa;

import android.content.Context;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.pa.config.ConfigManager;
import com.efs.sdk.pa.config.IEfsReporter;
import com.efs.sdk.pa.config.PackageLevel;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class PAFactory {
    private static final long DEFAULT_TIME_OUT_TIME = 2000;
    private static final long INVALID_TIME_OUT_TIME = 0;
    private static final long MAX_TIME_OUT_TIME = 4000;
    private static final String TAG = "pafactory";
    static final ThreadLocal<PA> sThreadLocal = new ThreadLocal<>();
    private ConfigManager mConfigManager;
    private Context mContext;
    private HashMap<String, String> mExtend;
    private IPaClient mPaClient;
    private EfsReporter mReporter;
    private IEfsReporter mReporterFactory;
    private String mSerial;
    private String mSver;
    private long mTimeOutTime;
    private PATraceListener mTraceListener;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private PackageLevel f42750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IEfsReporter f42751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f42752c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Context f42753d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f42754e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private HashMap<String, String> f42755f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f42756g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f42757h = 2000;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private PATraceListener f42758i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private IPaClient f42759j;

        public Builder(Context context, IEfsReporter iEfsReporter) {
            if (context == null) {
                throw new RuntimeException("context Should Not null");
            }
            if (iEfsReporter == null) {
                throw new RuntimeException("reporter Should Not Empty");
            }
            this.f42751b = iEfsReporter;
            this.f42753d = context;
        }

        public PAFactory build() {
            if (this.f42750a != null) {
                return new PAFactory(this.f42753d, this.f42750a, this.f42751b, this.f42752c, this.f42754e, this.f42755f, this.f42756g, this.f42757h, this.f42758i, this.f42759j);
            }
            throw new RuntimeException(String.format("%s Should Not Null", ""));
        }

        public Builder extendLogInfo(HashMap<String, String> map) {
            this.f42755f = map;
            return this;
        }

        public Builder isNewInstall(boolean z10) {
            this.f42752c = z10;
            return this;
        }

        public Builder packageLevel(PackageLevel packageLevel) {
            this.f42750a = packageLevel;
            return this;
        }

        public Builder serial(String str) {
            this.f42754e = str;
            return this;
        }

        public Builder setPaClient(IPaClient iPaClient) {
            this.f42759j = iPaClient;
            return this;
        }

        public Builder sver(String str) {
            this.f42756g = str;
            return this;
        }

        public Builder timeoutTime(long j10) {
            if (j10 <= 0) {
                Log.w(PAFactory.TAG, "Timeout time is invalid, and the default value 2s will be used");
                this.f42757h = 2000L;
            } else {
                if (j10 > PAFactory.MAX_TIME_OUT_TIME) {
                    Log.w(PAFactory.TAG, "Timeout time over 4s is not recommended, and the default value 2s will be used");
                    this.f42757h = 2000L;
                    return this;
                }
                this.f42757h = j10;
            }
            return this;
        }

        public Builder traceListener(PATraceListener pATraceListener) {
            this.f42758i = pATraceListener;
            return this;
        }
    }

    private PAFactory(Context context, PackageLevel packageLevel, IEfsReporter iEfsReporter, boolean z10, String str, HashMap<String, String> map, String str2, long j10, PATraceListener pATraceListener, IPaClient iPaClient) {
        this.mReporterFactory = iEfsReporter;
        this.mSerial = str;
        this.mExtend = map;
        this.mSver = str2;
        this.mContext = context;
        this.mTraceListener = pATraceListener;
        this.mPaClient = iPaClient;
        this.mTimeOutTime = j10;
        this.mConfigManager = new ConfigManager(context, packageLevel, iEfsReporter, z10);
    }

    public ConfigManager getConfigManager() {
        return this.mConfigManager;
    }

    public Context getContext() {
        return this.mContext;
    }

    public HashMap<String, String> getExtend() {
        return this.mExtend;
    }

    public IPaClient getPaClient() {
        return this.mPaClient;
    }

    public synchronized PA getPaInstance() {
        PA cVar;
        ThreadLocal<PA> threadLocal = sThreadLocal;
        cVar = threadLocal.get();
        if (cVar == null) {
            cVar = new com.efs.sdk.pa.a.c(this.mConfigManager.enableTracer());
            cVar.registerPAANRListener(this.mContext, new a(this), this.mTimeOutTime);
            threadLocal.set(cVar);
        }
        return cVar;
    }

    public EfsReporter getReporter() {
        if (this.mReporter == null) {
            IEfsReporter iEfsReporter = this.mReporterFactory;
            this.mReporter = iEfsReporter != null ? iEfsReporter.getReporter() : null;
        }
        return this.mReporter;
    }

    public String getSerial() {
        return this.mSerial;
    }

    public String getSver() {
        return this.mSver;
    }

    public PATraceListener getTraceListener() {
        return this.mTraceListener;
    }
}
