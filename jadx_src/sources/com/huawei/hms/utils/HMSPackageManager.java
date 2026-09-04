package com.huawei.hms.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidException;
import android.util.Pair;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.support.log.HMSLog;
import com.xiaomi.mipush.sdk.Constants;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class HMSPackageManager {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static HMSPackageManager f62758n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Object f62759o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Object f62760p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Object f62761q = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f62762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PackageManagerHelper f62763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f62764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f62765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f62766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f62767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f62768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f62769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f62770i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f62771j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f62772k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f62773l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f62774m;

    public static class PackagePriorityInfo implements Comparable<PackagePriorityInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f62775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f62776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f62777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f62778d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f62779e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Long f62780f;

        public PackagePriorityInfo(String str, String str2, String str3, String str4, String str5, long j10) {
            this.f62775a = str;
            this.f62776b = str2;
            this.f62777c = str3;
            this.f62778d = str4;
            this.f62779e = str5;
            this.f62780f = Long.valueOf(j10);
        }

        @Override // java.lang.Comparable
        public int compareTo(PackagePriorityInfo packagePriorityInfo) {
            return TextUtils.equals(this.f62779e, packagePriorityInfo.f62779e) ? this.f62780f.compareTo(packagePriorityInfo.f62780f) : this.f62779e.compareTo(packagePriorityInfo.f62779e);
        }
    }

    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.i("HMSPackageManager", "enter asyncOnceCheckMDMState");
            try {
                List<ResolveInfo> listQueryIntentServices = HMSPackageManager.this.f62762a.getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), 128);
                if (listQueryIntentServices == null || listQueryIntentServices.size() == 0) {
                    return;
                }
                Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
                while (it.hasNext()) {
                    if ("com.huawei.hwid".equals(it.next().serviceInfo.applicationInfo.packageName)) {
                        HMSPackageManager.this.c();
                    }
                }
                HMSLog.i("HMSPackageManager", "quit asyncOnceCheckMDMState");
            } catch (Exception e10) {
                HMSLog.e("HMSPackageManager", "asyncOnceCheckMDMState query hms action failed. " + e10.getMessage());
            }
        }
    }

    private HMSPackageManager(Context context) {
        this.f62762a = context;
        this.f62763b = new PackageManagerHelper(context);
    }

    private static String a(int i10) {
        if (i10 == 1) {
            return "SPOOFED";
        }
        if (i10 == 2) {
            return "SUCCESS";
        }
        if (i10 == 3) {
            return "UNCHECKED";
        }
        HMSLog.e("HMSPackageManager", "invalid checkMDM state: " + i10);
        return "";
    }

    private String a(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return bundle.getString(str);
        }
        HMSLog.e("HMSPackageManager", "no " + str + " in metaData");
        return null;
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iIndexOf = str.indexOf("priority=");
        if (iIndexOf == -1) {
            HMSLog.e("HMSPackageManager", "get indexOfIdentifier -1");
            return null;
        }
        int iIndexOf2 = str.indexOf(Constants.ACCEPT_TIME_SEPARATOR_SP, iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.length();
        }
        return str.substring(iIndexOf, iIndexOf2);
    }

    private void a() {
        new Thread(new a(), "Thread-asyncOnceCheckMDMState").start();
    }

    private boolean a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            HMSLog.e("HMSPackageManager", "args is invalid");
            return false;
        }
        List<X509Certificate> listB = com.huawei.hms.device.a.b(str3);
        if (listB.size() == 0) {
            HMSLog.e("HMSPackageManager", "certChain is empty");
            return false;
        }
        if (!com.huawei.hms.device.a.a(com.huawei.hms.device.a.a(this.f62762a), listB)) {
            HMSLog.e("HMSPackageManager", "failed to verify cert chain");
            return false;
        }
        X509Certificate x509Certificate = listB.get(listB.size() - 1);
        if (!com.huawei.hms.device.a.a(x509Certificate, "Huawei CBG HMS")) {
            HMSLog.e("HMSPackageManager", "CN is invalid");
            return false;
        }
        if (!com.huawei.hms.device.a.b(x509Certificate, "Huawei CBG Cloud Security Signer")) {
            HMSLog.e("HMSPackageManager", "OU is invalid");
            return false;
        }
        if (com.huawei.hms.device.a.a(x509Certificate, str, str2)) {
            return true;
        }
        HMSLog.e("HMSPackageManager", "signature is invalid: " + str);
        return false;
    }

    private void b(String str) {
        String strA = a(str);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        this.f62770i = strA.substring(9);
    }

    private boolean b() {
        String hmsPath = ReadApkFileUtil.getHmsPath(this.f62762a);
        if (hmsPath == null) {
            HMSLog.i("HMSPackageManager", "hmsPath is null!");
            return false;
        }
        if (!ReadApkFileUtil.isCertFound(hmsPath)) {
            HMSLog.i("HMSPackageManager", "NO huawer.cer in HMS!");
            return false;
        }
        if (!ReadApkFileUtil.checkSignature()) {
            HMSLog.i("HMSPackageManager", "checkSignature fail!");
            return false;
        }
        if (ReadApkFileUtil.verifyApkHash(hmsPath)) {
            return true;
        }
        HMSLog.i("HMSPackageManager", "verifyApkHash fail!");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c() {
        synchronized (f62761q) {
            HMSLog.i("HMSPackageManager", "enter checkHmsIsSpoof");
            if (!(this.f62772k == 3 || this.f62773l != this.f62763b.getPackageFirstInstallTime("com.huawei.hwid"))) {
                HMSLog.i("HMSPackageManager", "quit checkHmsIsSpoof cached state: " + a(this.f62772k));
                return this.f62772k;
            }
            this.f62772k = b() ? 2 : 1;
            this.f62773l = this.f62763b.getPackageFirstInstallTime("com.huawei.hwid");
            HMSLog.i("HMSPackageManager", "quit checkHmsIsSpoof state: " + a(this.f62772k));
            return this.f62772k;
        }
    }

    private void d() {
        synchronized (f62760p) {
            this.f62767f = null;
            this.f62768g = null;
            this.f62769h = null;
            this.f62770i = null;
            this.f62771j = 0;
        }
    }

    private void e() {
        synchronized (f62760p) {
            this.f62764c = null;
            this.f62765d = null;
            this.f62766e = 0;
        }
    }

    private Pair<String, String> f() {
        try {
            List<ResolveInfo> listQueryIntentServices = this.f62762a.getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), 128);
            if (listQueryIntentServices == null || listQueryIntentServices.size() == 0) {
                HMSLog.e("HMSPackageManager", "query hms action, resolveInfoList is null or empty.");
                return null;
            }
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                String str = resolveInfo.serviceInfo.applicationInfo.packageName;
                String packageSignature = this.f62763b.getPackageSignature(str);
                if ("com.huawei.hwid".equals(str) && this.f62763b.getPackageVersionCode(str) < 30000000) {
                    return new Pair<>(str, packageSignature);
                }
                Bundle bundle = resolveInfo.serviceInfo.metaData;
                if (bundle == null) {
                    HMSLog.e("HMSPackageManager", "skip package " + str + " for metadata is null");
                } else if (!bundle.containsKey("hms_app_signer")) {
                    HMSLog.e("HMSPackageManager", "skip package " + str + " for no signer");
                } else if (bundle.containsKey("hms_app_cert_chain")) {
                    if (a(str + "&" + packageSignature, bundle.getString("hms_app_signer"), bundle.getString("hms_app_cert_chain"))) {
                        return new Pair<>(str, packageSignature);
                    }
                    HMSLog.e("HMSPackageManager", "checkSigner failed");
                } else {
                    HMSLog.e("HMSPackageManager", "skip package " + str + " for no cert chain");
                }
            }
            return null;
        } catch (Exception e10) {
            HMSLog.e("HMSPackageManager", "getHmsPackageName query hms action failed. " + e10.getMessage());
            return null;
        }
    }

    private Pair<String, String> g() {
        Pair<String, String> pairF = f();
        if (pairF != null) {
            HMSLog.i("HMSPackageManager", "aidlService pkgName: " + ((String) pairF.first));
            this.f62769h = "com.huawei.hms.core.aidlservice";
            this.f62770i = null;
            return pairF;
        }
        ArrayList<PackagePriorityInfo> arrayListH = h();
        if (arrayListH == null) {
            HMSLog.e("HMSPackageManager", "PackagePriorityInfo list is null");
            return null;
        }
        for (PackagePriorityInfo packagePriorityInfo : arrayListH) {
            String str = packagePriorityInfo.f62775a;
            String str2 = packagePriorityInfo.f62776b;
            String str3 = packagePriorityInfo.f62777c;
            String str4 = packagePriorityInfo.f62778d;
            String packageSignature = this.f62763b.getPackageSignature(str);
            if (a(str + "&" + packageSignature + "&" + str2, str3, str4)) {
                HMSLog.i("HMSPackageManager", "result: " + str + ", " + str2 + ", " + packagePriorityInfo.f62780f);
                this.f62769h = PackageConstants.GENERAL_SERVICES_ACTION;
                b(str2);
                return new Pair<>(str, packageSignature);
            }
        }
        return null;
    }

    public static HMSPackageManager getInstance(Context context) {
        synchronized (f62759o) {
            if (f62758n == null) {
                if (context.getApplicationContext() != null) {
                    f62758n = new HMSPackageManager(context.getApplicationContext());
                } else {
                    f62758n = new HMSPackageManager(context);
                }
                f62758n.j();
                f62758n.a();
            }
        }
        return f62758n;
    }

    private ArrayList<PackagePriorityInfo> h() {
        try {
            List<ResolveInfo> listQueryIntentServices = this.f62762a.getPackageManager().queryIntentServices(new Intent(PackageConstants.GENERAL_SERVICES_ACTION), 128);
            if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                HMSLog.e("HMSPackageManager", "query aglite action, resolveInfoList is null or empty");
                return null;
            }
            ArrayList<PackagePriorityInfo> arrayList = new ArrayList<>();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                String str = resolveInfo.serviceInfo.applicationInfo.packageName;
                long packageFirstInstallTime = this.f62763b.getPackageFirstInstallTime(str);
                Bundle bundle = resolveInfo.serviceInfo.metaData;
                if (bundle == null) {
                    HMSLog.e("HMSPackageManager", "package " + str + " get metaData is null");
                } else {
                    String strA = a(bundle, "hms_app_checker_config");
                    String strA2 = a(strA);
                    if (TextUtils.isEmpty(strA2)) {
                        HMSLog.i("HMSPackageManager", "get priority fail. hmsCheckerCfg: " + strA);
                    } else {
                        String strA3 = a(bundle, "hms_app_signer_v2");
                        if (TextUtils.isEmpty(strA3)) {
                            HMSLog.i("HMSPackageManager", "get signerV2 fail.");
                        } else {
                            String strA4 = a(bundle, "hms_app_cert_chain");
                            if (TextUtils.isEmpty(strA4)) {
                                HMSLog.i("HMSPackageManager", "get certChain fail.");
                            } else {
                                HMSLog.i("HMSPackageManager", "add: " + str + ", " + strA + ", " + packageFirstInstallTime);
                                arrayList.add(new PackagePriorityInfo(str, strA, strA3, strA4, strA2, packageFirstInstallTime));
                            }
                        }
                    }
                }
            }
            Collections.sort(arrayList);
            return arrayList;
        } catch (Exception e10) {
            HMSLog.e("HMSPackageManager", "query aglite action failed. " + e10.getMessage());
            return null;
        }
    }

    private void i() {
        synchronized (f62760p) {
            Pair<String, String> pairF = f();
            if (pairF == null) {
                HMSLog.e("HMSPackageManager", "<initHmsPackageInfo> Failed to find HMS apk");
                e();
                return;
            }
            this.f62764c = (String) pairF.first;
            this.f62765d = (String) pairF.second;
            this.f62766e = this.f62763b.getPackageVersionCode(getHMSPackageName());
            HMSLog.i("HMSPackageManager", "<initHmsPackageInfo> Succeed to find HMS apk: " + this.f62764c + " version: " + this.f62766e);
        }
    }

    private void j() {
        synchronized (f62760p) {
            Pair<String, String> pairG = g();
            if (pairG == null) {
                HMSLog.e("HMSPackageManager", "<initHmsPackageInfoForMultiService> Failed to find HMS apk");
                d();
                return;
            }
            this.f62767f = (String) pairG.first;
            this.f62768g = (String) pairG.second;
            this.f62771j = this.f62763b.getPackageVersionCode(getHMSPackageNameForMultiService());
            HMSLog.i("HMSPackageManager", "<initHmsPackageInfoForMultiService> Succeed to find HMS apk: " + this.f62767f + " version: " + this.f62771j);
        }
    }

    private boolean k() {
        Bundle bundle;
        PackageManager packageManager = this.f62762a.getPackageManager();
        if (packageManager == null) {
            HMSLog.e("HMSPackageManager", "In isMinApkVersionEffective, Failed to get 'PackageManager' instance.");
            return true;
        }
        try {
            if (!TextUtils.isEmpty(this.f62769h) && (this.f62769h.equals(PackageConstants.GENERAL_SERVICES_ACTION) || this.f62769h.equals(PackageConstants.INTERNAL_SERVICES_ACTION))) {
                HMSLog.i("HMSPackageManager", "action = " + this.f62769h + " exist");
                return false;
            }
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(getHMSPackageName(), 128).applicationInfo;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("com.huawei.hms.kit.api_level:hmscore") && (getHmsVersionCode() >= 50000000 || getHmsVersionCode() <= 19999999)) {
                HMSLog.i("HMSPackageManager", "MinApkVersion is disabled.");
                return false;
            }
            return true;
        } catch (AndroidException unused) {
            HMSLog.e("HMSPackageManager", "In isMinApkVersionEffective, Failed to read meta data for HMSCore API level.");
        } catch (RuntimeException e10) {
            HMSLog.e("HMSPackageManager", "In isMinApkVersionEffective, Failed to read meta data for HMSCore API level.", e10);
        }
    }

    public String getHMSFingerprint() {
        String str = this.f62765d;
        return str == null ? "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05" : str;
    }

    public String getHMSPackageName() {
        HMSLog.i("HMSPackageManager", "Enter getHMSPackageName");
        refresh();
        String str = this.f62764c;
        if (str != null) {
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.f62763b.getPackageStates(str))) {
                HMSLog.i("HMSPackageManager", "The package name is not installed and needs to be refreshed again");
                i();
            }
            String str2 = this.f62764c;
            if (str2 != null) {
                return str2;
            }
        }
        if (!PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.f62763b.getPackageStates("com.huawei.hwid"))) {
            "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05".equalsIgnoreCase(this.f62763b.getPackageSignature("com.huawei.hwid"));
        }
        return "com.huawei.hwid";
    }

    public String getHMSPackageNameForMultiService() {
        HMSLog.i("HMSPackageManager", "Enter getHMSPackageNameForMultiService");
        refreshForMultiService();
        String str = this.f62767f;
        if (str == null) {
            return "com.huawei.hwid";
        }
        if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.f62763b.getPackageStates(str))) {
            HMSLog.i("HMSPackageManager", "The package name is not installed and needs to be refreshed again");
            j();
        }
        String str2 = this.f62767f;
        return str2 != null ? str2 : "com.huawei.hwid";
    }

    public PackageManagerHelper.PackageStates getHMSPackageStates() {
        synchronized (f62759o) {
            refresh();
            PackageManagerHelper.PackageStates packageStates = this.f62763b.getPackageStates(this.f62764c);
            PackageManagerHelper.PackageStates packageStates2 = PackageManagerHelper.PackageStates.NOT_INSTALLED;
            if (packageStates == packageStates2) {
                e();
                return packageStates2;
            }
            boolean z10 = false;
            if ("com.huawei.hwid".equals(this.f62764c) && c() == 1) {
                return PackageManagerHelper.PackageStates.SPOOF;
            }
            if (packageStates == PackageManagerHelper.PackageStates.ENABLED && !this.f62765d.equals(this.f62763b.getPackageSignature(this.f62764c))) {
                z10 = true;
            }
            return z10 ? packageStates2 : packageStates;
        }
    }

    public PackageManagerHelper.PackageStates getHMSPackageStatesForMultiService() {
        synchronized (f62759o) {
            refreshForMultiService();
            PackageManagerHelper.PackageStates packageStates = this.f62763b.getPackageStates(this.f62767f);
            PackageManagerHelper.PackageStates packageStates2 = PackageManagerHelper.PackageStates.NOT_INSTALLED;
            if (packageStates == packageStates2) {
                d();
                return packageStates2;
            }
            boolean z10 = false;
            if ("com.huawei.hwid".equals(this.f62767f) && c() == 1) {
                return PackageManagerHelper.PackageStates.SPOOF;
            }
            if (packageStates == PackageManagerHelper.PackageStates.ENABLED && !this.f62768g.equals(this.f62763b.getPackageSignature(this.f62767f))) {
                z10 = true;
            }
            return z10 ? packageStates2 : packageStates;
        }
    }

    public int getHmsMultiServiceVersion() {
        return this.f62763b.getPackageVersionCode(getHMSPackageNameForMultiService());
    }

    public int getHmsVersionCode() {
        return this.f62763b.getPackageVersionCode(getHMSPackageName());
    }

    public String getInnerServiceAction() {
        return PackageConstants.INTERNAL_SERVICES_ACTION;
    }

    public String getServiceAction() {
        return !TextUtils.isEmpty(this.f62769h) ? this.f62769h : "com.huawei.hms.core.aidlservice";
    }

    public boolean hmsVerHigherThan(int i10) {
        if (this.f62766e >= i10 || !k()) {
            return true;
        }
        int packageVersionCode = this.f62763b.getPackageVersionCode(getHMSPackageName());
        this.f62766e = packageVersionCode;
        return packageVersionCode >= i10;
    }

    public boolean isApkNeedUpdate(int i10) {
        int hmsVersionCode = getHmsVersionCode();
        HMSLog.i("HMSPackageManager", "current versionCode:" + hmsVersionCode + ", target version requirements: " + i10);
        return hmsVersionCode < i10;
    }

    public boolean isApkUpdateNecessary(int i10) {
        int hmsVersionCode = getHmsVersionCode();
        HMSLog.i("HMSPackageManager", "current versionCode:" + hmsVersionCode + ", minimum version requirements: " + i10);
        return k() && hmsVersionCode < i10;
    }

    public boolean isUseOldCertificate() {
        return this.f62774m;
    }

    public void refresh() {
        if (TextUtils.isEmpty(this.f62764c) || TextUtils.isEmpty(this.f62765d)) {
            i();
        }
    }

    public void refreshForMultiService() {
        if (TextUtils.isEmpty(this.f62767f) || TextUtils.isEmpty(this.f62768g)) {
            j();
        }
    }

    public void resetMultiServiceState() {
        d();
    }

    public void setUseOldCertificate(boolean z10) {
        this.f62774m = z10;
    }
}
