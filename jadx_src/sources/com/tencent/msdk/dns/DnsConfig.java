package com.tencent.msdk.dns;

import android.text.TextUtils;
import com.tencent.msdk.dns.base.executor.DnsExecutors;
import com.tencent.msdk.dns.base.log.ILogNode;
import com.tencent.msdk.dns.base.report.IReporter;
import com.tencent.msdk.dns.core.rank.IpRankItem;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import r.e;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsConfig {
    public final String appId;
    public final boolean blockFirst;
    public boolean cachedIpEnable;
    public final String channel;
    public final int customNetStack;
    public boolean enableDomainServer;
    public boolean enablePersistentCache;
    public boolean enableReport;
    public final DnsExecutors.ExecutorSupplier executorSupplier;

    @Deprecated
    public final boolean initBuiltInReporters;
    public final Set<IpRankItem> ipRankItems;
    public final int logLevel;
    public final List<ILogNode> logNodes;
    public final ILookedUpListener lookedUpListener;
    public final e lookupExtra;
    public final Set<String> persistentCacheDomains;
    public final Set<String> preLookupDomains;
    public final Set<b> protectedDomains;
    public final List<IReporter> reporters;
    public String routeIp;
    public final int timeoutMills;
    public boolean useExpiredIpEnable;
    public String userId;

    public static final class Builder {
        private static final int DEFAULT_MAX_NUM_OF_IP_RANK_ITEMS = 10;
        private static final int DEFAULT_MAX_NUM_OF_PRE_LOOKUP_DOMAINS = 10;
        private int mLogLevel = 5;
        private String mAppId = "";
        private String mUserId = "";

        @Deprecated
        private boolean mInitBuiltInReporters = false;

        @Deprecated
        private String mDnsIp = "";
        private String mDnsId = "";
        private String mDnsKey = "";
        private String mToken = "";
        private int mTimeoutMills = 2000;
        private int mMaxNumOfPreLookupDomains = 10;
        private int mMaxNumOfIpRankItems = 10;
        private Set<b> mProtectedDomains = null;
        private Set<String> mPreLookupDomains = null;
        private Set<String> mPersistentCacheDomains = null;
        private Set<IpRankItem> mIpRankItems = null;
        private boolean mEnablePersistentCache = true;
        private String mChannel = MSDKDnsResolver.DES_HTTP_CHANNEL;
        private boolean mEnableReport = false;
        private boolean mBlockFirst = false;
        private int mCustomNetStack = 0;
        private DnsExecutors.ExecutorSupplier mExecutorSupplier = null;
        private ILookedUpListener mLookedUpListener = null;
        private List<ILogNode> mLogNodes = null;
        private List<IReporter> mReporters = null;
        private boolean mUseExpiredIpEnable = false;
        private boolean mCachedIpEnable = false;
        private String mRouteIp = "";

        public Builder aesHttp() {
            this.mChannel = MSDKDnsResolver.AES_HTTP_CHANNEL;
            return this;
        }

        public Builder appId(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("appId".concat(" can not be empty"));
            }
            this.mAppId = str;
            return this;
        }

        public Builder blockFirst() {
            this.mBlockFirst = true;
            return this;
        }

        public DnsConfig build() {
            if (TextUtils.isEmpty(this.mDnsId)) {
                throw new IllegalArgumentException("dnsId".concat(" can not be empty"));
            }
            if (this.mChannel != MSDKDnsResolver.HTTPS_CHANNEL && TextUtils.isEmpty(this.mDnsKey)) {
                throw new IllegalArgumentException("dnsKey".concat(" can not be empty"));
            }
            if (this.mChannel == MSDKDnsResolver.HTTPS_CHANNEL && TextUtils.isEmpty(this.mToken)) {
                throw new IllegalArgumentException("token".concat(" can not be empty"));
            }
            return new DnsConfig(this.mLogLevel, this.mAppId, this.mUserId, this.mInitBuiltInReporters, this.mDnsId, this.mDnsKey, this.mToken, this.mTimeoutMills, this.mProtectedDomains, this.mPreLookupDomains, this.mEnablePersistentCache, this.mPersistentCacheDomains, this.mIpRankItems, this.mChannel, this.mEnableReport, this.mBlockFirst, this.mCustomNetStack, this.mExecutorSupplier, this.mLookedUpListener, this.mLogNodes, this.mReporters, this.mUseExpiredIpEnable, this.mCachedIpEnable, this.mRouteIp);
        }

        public Builder channel(String str) {
            str.equals(MSDKDnsResolver.HTTPS_CHANNEL);
            this.mChannel = str;
            return this;
        }

        public Builder desHttp() {
            this.mChannel = MSDKDnsResolver.DES_HTTP_CHANNEL;
            return this;
        }

        public Builder dnsId(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("dnsId".concat(" can not be empty"));
            }
            this.mDnsId = str;
            return this;
        }

        @Deprecated
        public Builder dnsIp(String str) {
            return this;
        }

        public Builder dnsKey(String str) {
            if (this.mChannel != MSDKDnsResolver.HTTPS_CHANNEL && TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("dnsKey".concat(" can not be empty"));
            }
            this.mDnsKey = str;
            return this;
        }

        public Builder enablePersistentCache(boolean z10) {
            this.mEnablePersistentCache = z10;
            return this;
        }

        @Deprecated
        public Builder enableReport(boolean z10) {
            return this;
        }

        public Builder executorSupplier(DnsExecutors.ExecutorSupplier executorSupplier) {
            if (executorSupplier == null) {
                throw new IllegalArgumentException("executorSupplier".concat(" can not be null"));
            }
            this.mExecutorSupplier = executorSupplier;
            return this;
        }

        public Builder https() {
            this.mChannel = MSDKDnsResolver.HTTPS_CHANNEL;
            return this;
        }

        @Deprecated
        public Builder initBuiltInReporters() {
            this.mInitBuiltInReporters = true;
            return this;
        }

        public Builder ipRankItems(List<IpRankItem> list) {
            if (list.size() > this.mMaxNumOfIpRankItems) {
                this.mIpRankItems = new HashSet(list.subList(0, this.mMaxNumOfIpRankItems));
            } else {
                this.mIpRankItems = new HashSet(list);
            }
            return this;
        }

        public Builder logLevel(int i10) {
            this.mLogLevel = i10;
            return this;
        }

        public synchronized Builder logNode(ILogNode iLogNode) {
            try {
                if (iLogNode == null) {
                    throw new IllegalArgumentException("logNode".concat(" can not be null"));
                }
                if (this.mLogNodes == null) {
                    this.mLogNodes = new ArrayList();
                }
                this.mLogNodes.add(iLogNode);
            } catch (Throwable th2) {
                throw th2;
            }
            return this;
        }

        public Builder lookedUpListener(ILookedUpListener iLookedUpListener) {
            if (iLookedUpListener == null) {
                throw new IllegalArgumentException("lookedUpListener".concat(" can not be null"));
            }
            this.mLookedUpListener = iLookedUpListener;
            return this;
        }

        public Builder maxNumOfPreLookupDomains(int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("maxNumOfPreLookupDomains".concat(" can not less than 0"));
            }
            this.mMaxNumOfPreLookupDomains = i10;
            return this;
        }

        public Builder nonBlockFirst() {
            this.mBlockFirst = false;
            return this;
        }

        @Deprecated
        public Builder notInitBuiltInReporters() {
            this.mInitBuiltInReporters = false;
            return this;
        }

        public synchronized Builder persistentCacheDomains(String... strArr) {
            if (b.a.q(strArr)) {
                throw new IllegalArgumentException("domains".concat(" can not be empty"));
            }
            if (this.mPersistentCacheDomains == null) {
                this.mPersistentCacheDomains = b.a.j(strArr.length);
            }
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    String strTrim = str.trim();
                    if (!TextUtils.isEmpty(strTrim)) {
                        this.mPersistentCacheDomains.add(strTrim);
                    }
                }
                throw new IllegalArgumentException("domain".concat(" can not be empty"));
            }
            return this;
        }

        public synchronized Builder preLookupDomains(String... strArr) {
            boolean z10;
            if (b.a.q(strArr)) {
                throw new IllegalArgumentException("domains".concat(" can not be empty"));
            }
            if (this.mPreLookupDomains == null) {
                this.mPreLookupDomains = b.a.j(strArr.length);
            }
            int size = this.mPreLookupDomains.size();
            if (this.mProtectedDomains == null) {
                for (String str : strArr) {
                    if (!TextUtils.isEmpty(str)) {
                        String strTrim = str.trim();
                        if (!TextUtils.isEmpty(strTrim)) {
                            this.mPreLookupDomains.add(strTrim);
                            size++;
                            if (this.mMaxNumOfPreLookupDomains <= size) {
                                break;
                            }
                        }
                    }
                    throw new IllegalArgumentException("domain".concat(" can not be empty"));
                }
            }
            for (String str2 : strArr) {
                if (!TextUtils.isEmpty(str2)) {
                    String strTrim2 = str2.trim();
                    if (!TextUtils.isEmpty(strTrim2)) {
                        Iterator<b> it = this.mProtectedDomains.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z10 = false;
                                break;
                            }
                            if (it.next().a(strTrim2)) {
                                z10 = true;
                                break;
                            }
                        }
                        if (z10) {
                            this.mPreLookupDomains.add(strTrim2);
                            size++;
                        }
                        if (this.mMaxNumOfPreLookupDomains <= size) {
                            break;
                        }
                    }
                }
                throw new IllegalArgumentException("domain".concat(" can not be empty"));
            }
            return this;
        }

        public synchronized Builder protectedDomains(String... strArr) {
            boolean z10;
            if (b.a.q(strArr)) {
                throw new IllegalArgumentException("domains".concat(" can not be empty"));
            }
            if (this.mProtectedDomains == null) {
                this.mProtectedDomains = b.a.j(strArr.length);
            }
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    String strTrim = str.trim();
                    if (!TextUtils.isEmpty(strTrim)) {
                        this.mProtectedDomains.add(new b(strTrim));
                    }
                }
                throw new IllegalArgumentException("domain".concat(" can not be empty"));
            }
            Set<String> set = this.mPreLookupDomains;
            if (set != null) {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    Iterator<b> it2 = this.mProtectedDomains.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z10 = false;
                            break;
                        }
                        if (it2.next().a(next)) {
                            z10 = true;
                            break;
                        }
                    }
                    if (!z10) {
                        it.remove();
                    }
                }
            }
            return this;
        }

        public synchronized Builder reporter(IReporter iReporter) {
            try {
                if (iReporter == null) {
                    throw new IllegalArgumentException("reporter".concat(" can not be null"));
                }
                if (this.mReporters == null) {
                    this.mReporters = new ArrayList();
                }
                this.mReporters.add(iReporter);
            } catch (Throwable th2) {
                throw th2;
            }
            return this;
        }

        public Builder routeIp(String str) {
            this.mRouteIp = str;
            return this;
        }

        public Builder setCachedIpEnable(boolean z10) {
            this.mCachedIpEnable = z10;
            return this;
        }

        public Builder setCustomNetStack(int i10) {
            this.mCustomNetStack = i10;
            return this;
        }

        public Builder setUseExpiredIpEnable(boolean z10) {
            this.mUseExpiredIpEnable = z10;
            return this;
        }

        public Builder timeoutMills(int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("timeoutMills".concat(" can not less than 0"));
            }
            this.mTimeoutMills = i10;
            return this;
        }

        public Builder token(String str) {
            if (this.mChannel == MSDKDnsResolver.HTTPS_CHANNEL && TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("token".concat(" can not be empty"));
            }
            this.mToken = str;
            return this;
        }

        public Builder userId(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("userId".concat(" can not be empty"));
            }
            this.mUserId = str;
            return this;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f100931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100932b;

        public b(String str) {
            int iLastIndexOf = str.lastIndexOf("*.");
            if (-1 == iLastIndexOf) {
                this.f100932b = str;
                this.f100931a = false;
            } else {
                this.f100932b = str.substring(iLastIndexOf + 2);
                this.f100931a = true;
            }
        }

        public boolean a(String str) {
            return this.f100931a ? str.endsWith(this.f100932b) : this.f100932b.equals(str);
        }

        public String toString() {
            return "WildcardDomain{mIsWildcard=" + this.f100931a + ", mNakedDomain='" + this.f100932b + "'}";
        }
    }

    private DnsConfig(int i10, String str, String str2, boolean z10, String str3, String str4, String str5, int i11, Set<b> set, Set<String> set2, boolean z11, Set<String> set3, Set<IpRankItem> set4, String str6, boolean z12, boolean z13, int i12, DnsExecutors.ExecutorSupplier executorSupplier, ILookedUpListener iLookedUpListener, List<ILogNode> list, List<IReporter> list2, boolean z14, boolean z15, String str7) {
        this.enableDomainServer = false;
        this.logLevel = i10;
        this.appId = str;
        this.userId = str2;
        this.initBuiltInReporters = z10;
        this.ipRankItems = set4;
        this.lookupExtra = new e(str3, str4, str5);
        this.timeoutMills = i11;
        this.protectedDomains = set;
        this.preLookupDomains = set2;
        this.enablePersistentCache = z11;
        this.persistentCacheDomains = set3;
        this.channel = str6;
        this.enableReport = z12;
        this.blockFirst = z13;
        this.customNetStack = i12;
        this.executorSupplier = executorSupplier;
        this.lookedUpListener = iLookedUpListener;
        this.logNodes = list;
        this.reporters = list2;
        this.useExpiredIpEnable = z14;
        this.cachedIpEnable = z15;
        this.routeIp = str7;
    }

    public boolean needProtect(String str) {
        if (!TextUtils.isEmpty(str)) {
            String strTrim = str.trim();
            if (!TextUtils.isEmpty(strTrim)) {
                Set<b> set = this.protectedDomains;
                if (set == null) {
                    return true;
                }
                Iterator<b> it = set.iterator();
                while (it.hasNext()) {
                    if (it.next().a(strTrim)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public String toString() {
        return "DnsConfig{logLevel=" + this.logLevel + ", appId='" + this.appId + "', userId='" + this.userId + "', lookupExtra=" + this.lookupExtra + ", timeoutMills=" + this.timeoutMills + ", protectedDomains=" + b.a.g(this.protectedDomains) + ", preLookupDomains=" + b.a.g(this.preLookupDomains) + ", enablePersistentCache=" + this.enablePersistentCache + ", persistentCacheDomains=" + b.a.g(this.persistentCacheDomains) + ", IpRankItems=" + b.a.g(this.ipRankItems) + ", channel='" + this.channel + "', enableReport='" + this.enableReport + "', blockFirst=" + this.blockFirst + ", customNetStack=" + this.customNetStack + ", executorSupplier=" + this.executorSupplier + ", lookedUpListener=" + this.lookedUpListener + ", logNodes=" + b.a.g(this.logNodes) + ", reporters=" + b.a.g(this.reporters) + ", useExpiredIpEnable=" + this.useExpiredIpEnable + ", cachedIpEnable=" + this.cachedIpEnable + ", enableDomainServer=" + this.enableDomainServer + ", routeIp=" + this.routeIp + '}';
    }
}
