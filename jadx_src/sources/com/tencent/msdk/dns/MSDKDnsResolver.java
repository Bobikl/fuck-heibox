package com.tencent.msdk.dns;

import android.content.Context;
import androidx.annotation.p0;
import com.tencent.msdk.dns.base.executor.DnsExecutors;
import com.tencent.msdk.dns.base.jni.Jni;
import com.tencent.msdk.dns.base.log.ILogNode;
import com.tencent.msdk.dns.core.IpSet;
import f.c;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class MSDKDnsResolver {
    public static final String AES_HTTP_CHANNEL = "AesHttp";
    public static final String DES_HTTP_CHANNEL = "DesHttp";
    public static final String HTTPS_CHANNEL = "Https";
    private static HttpDnsResponseObserver sHttpDnsResponseObserver;
    private static volatile MSDKDnsResolver sInstance;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f100938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f100939b;

        public a(String str, String str2) {
            this.f100938a = str;
            this.f100939b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            String addrByNameNormal = MSDKDnsResolver.this.getAddrByNameNormal(this.f100938a);
            if (MSDKDnsResolver.sHttpDnsResponseObserver != null) {
                MSDKDnsResolver.sHttpDnsResponseObserver.onHttpDnsResponse(this.f100939b, this.f100938a, addrByNameNormal);
                return;
            }
            String str = this.f100939b;
            int i10 = d.a.f108124a;
            try {
                Jni.sendToUnity(str);
            } catch (Throwable unused) {
                f.b.g("sendToUnity failed", new Object[0]);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f100941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f100942b;

        public b(String str, String str2) {
            this.f100941a = str;
            this.f100942b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpSet addrsByNameNormal = MSDKDnsResolver.this.getAddrsByNameNormal(this.f100941a);
            if (MSDKDnsResolver.sHttpDnsResponseObserver != null) {
                MSDKDnsResolver.sHttpDnsResponseObserver.onHttpDnsResponse(this.f100942b, this.f100941a, addrsByNameNormal);
                return;
            }
            String str = this.f100942b;
            int i10 = d.a.f108124a;
            try {
                Jni.sendToUnity(str);
            } catch (Throwable unused) {
                f.b.g("sendToUnity failed", new Object[0]);
            }
        }
    }

    private String getAddrByNameEnableExpired(String str) {
        return b.a.c(DnsService.getAddrsByNamesEnableExpired(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getAddrByNameNormal(String str) {
        return getAddrByName(str, true);
    }

    private IpSet getAddrsByName(String str, boolean z10) {
        f.b.f("MSDKDnsResolver.getAddrsByName() called.", new Object[0]);
        IpSet ipSet = IpSet.EMPTY;
        try {
            return DnsService.getAddrsByName(str, z10);
        } catch (Exception e10) {
            f.b.e("exception: %s", e10);
            return ipSet;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IpSet getAddrsByNameNormal(String str) {
        return getAddrsByName(str, true);
    }

    public static MSDKDnsResolver getInstance() {
        if (sInstance == null) {
            synchronized (MSDKDnsResolver.class) {
                if (sInstance == null) {
                    sInstance = new MSDKDnsResolver();
                }
            }
        }
        return sInstance;
    }

    private void setUseExpiredIpEnable(boolean z10) {
        DnsService.setUseExpiredIpEnable(z10);
    }

    public boolean WGSetDnsOpenId(String str) {
        f.b.f("MSDKDnsResolver.WGSetDnsOpenId() called.", new Object[0]);
        try {
            DnsService.setUserId(str);
            return true;
        } catch (Exception e10) {
            f.b.a(5, e10, "WGSetDnsOpenId failed", new Object[0]);
            return false;
        }
    }

    public void addLogNode(ILogNode iLogNode) {
        int i10 = f.b.f118732a;
        synchronized (c.class) {
            List<ILogNode> list = c.f118733a;
            if (iLogNode != null) {
                list.add(iLogNode);
            }
        }
    }

    public void clearHostCache() {
        clearHostCache(null);
    }

    public void clearHostCache(@p0 String str) {
        l.a.C1196a.f130818a.b(str);
    }

    public void enablePersistentCache(boolean z10) {
        DnsService.enablePersistentCache(z10);
        f.b.b("MSDKDnsResolver.enablePersistentCache(%s) called", Boolean.toString(z10));
    }

    public String getAddrByName(String str) {
        return !DnsService.getDnsConfig().useExpiredIpEnable ? getAddrByNameNormal(str) : getAddrByNameEnableExpired(str);
    }

    public String getAddrByName(String str, boolean z10) {
        f.b.f("MSDKDnsResolver.getAddrByName() called.", new Object[0]);
        IpSet addrsByName = IpSet.EMPTY;
        try {
            addrsByName = DnsService.getAddrsByName(str, z10);
        } catch (Exception e10) {
            f.b.e("exception: %s", e10);
        }
        return b.a.c(addrsByName);
    }

    public void getAddrByNameAsync(String str, String str2) {
        if (!DnsService.getDnsConfig().useExpiredIpEnable) {
            DnsExecutors.f100946c.execute(new a(str, str2));
            return;
        }
        try {
            throw new IllegalAccessException("getAddrByNameAsync cannot be used when useExpiredIpEnable is set to true.");
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        }
    }

    public IpSet getAddrsByName(String str) {
        return !DnsService.getDnsConfig().useExpiredIpEnable ? getAddrsByNameNormal(str) : DnsService.getAddrsByNamesEnableExpired(str);
    }

    public void getAddrsByNameAsync(String str, String str2) {
        if (!DnsService.getDnsConfig().useExpiredIpEnable) {
            DnsExecutors.f100946c.execute(new b(str, str2));
            return;
        }
        try {
            throw new IllegalAccessException("getAddrsByNameAsync cannot be used when useExpiredIpEnable is set to true.");
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        }
    }

    public String getDnsDetail(String str) {
        f.b.f("MSDKDnsResolver.getDnsDetail() called.", new Object[0]);
        try {
            return DnsService.getDnsDetail(str);
        } catch (Exception e10) {
            f.b.f("getDnsDetail exception:" + e10, new Object[0]);
            return "";
        }
    }

    public int getNetworkStack() {
        f.b.f("MSDKDnsResolver.getNetworkStack() called.", new Object[0]);
        return b.a.t();
    }

    public void init(Context context, DnsConfig dnsConfig) {
        DnsService.init(context, dnsConfig);
        f.b.b("MSDKDnsResolver.init() called, ver:%s, channel:%s", "4.9.0a", dnsConfig.channel);
    }

    public void init(Context context, String str, String str2, String str3, String str4, boolean z10, int i10) {
        init(context, str, str2, str3, str4, z10, i10, DES_HTTP_CHANNEL, false);
    }

    public void init(Context context, String str, String str2, String str3, String str4, boolean z10, int i10, String str5, String str6, boolean z11) {
        DnsConfig.Builder builderTimeoutMills = new DnsConfig.Builder().logLevel(z10 ? 2 : 5).appId(str).timeoutMills(i10);
        if (str4 != null) {
            builderTimeoutMills.dnsIp(str4);
        }
        if (str2 != null) {
            builderTimeoutMills.dnsId(str2);
        }
        if (str3 != null) {
            builderTimeoutMills.dnsKey(str3);
        }
        builderTimeoutMills.enableReport(z11);
        if (HTTPS_CHANNEL.equals(str5) && str6 != null) {
            builderTimeoutMills.token(str6);
            builderTimeoutMills.https();
        } else if (AES_HTTP_CHANNEL.equals(str5)) {
            builderTimeoutMills.aesHttp();
        } else {
            builderTimeoutMills.desHttp();
        }
        DnsService.init(context, builderTimeoutMills.build());
        f.b.b("MSDKDnsResolver.init() called, ver:%s, channel:%s", "4.9.0a", str5);
    }

    public void init(Context context, String str, String str2, String str3, String str4, boolean z10, int i10, String str5, boolean z11) {
        DnsConfig.Builder builderTimeoutMills = new DnsConfig.Builder().logLevel(z10 ? 2 : 5).appId(str).timeoutMills(i10);
        if (str4 != null) {
            builderTimeoutMills.dnsIp(str4);
        }
        if (str2 != null) {
            builderTimeoutMills.dnsId(str2);
        }
        if (str3 != null) {
            builderTimeoutMills.dnsKey(str3);
        }
        if (str3 != null) {
            builderTimeoutMills.dnsKey(str3);
        }
        builderTimeoutMills.enableReport(z11);
        if (AES_HTTP_CHANNEL.equals(str5)) {
            builderTimeoutMills.aesHttp();
        } else {
            builderTimeoutMills.desHttp();
        }
        DnsService.init(context, builderTimeoutMills.build());
        f.b.b("MSDKDnsResolver.init() called, ver:%s, channel:%s", "4.9.0a", str5);
    }

    public void init(Context context, String str, String str2, String str3, String str4, boolean z10, int i10, boolean z11) {
        init(context, str, str2, str3, str4, z10, i10, DES_HTTP_CHANNEL, z11);
    }

    public void init(Context context, String str, String str2, boolean z10, int i10) {
        try {
            init(context, str, null, null, str2, z10, i10);
        } catch (Exception e10) {
            f.b.e("exception: %s", e10);
        }
    }

    public void setHttpDnsResponseObserver(HttpDnsResponseObserver httpDnsResponseObserver) {
        sHttpDnsResponseObserver = httpDnsResponseObserver;
    }
}
