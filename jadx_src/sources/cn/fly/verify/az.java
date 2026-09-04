package cn.fly.verify;

import android.content.pm.PackageInfo;
import android.location.Location;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.ServiceState;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class az {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile az f35806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile aw f35807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f35808c = new a();

    public class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f35810b = false;

        public a() {
        }

        public boolean a() {
            return this.f35810b;
        }
    }

    private az() {
    }

    public static az a() {
        if (f35806a == null) {
            synchronized (az.class) {
                if (f35806a == null) {
                    f35806a = new az();
                }
            }
        }
        return f35806a;
    }

    public void a(aw awVar) {
        this.f35807b = awVar;
    }

    public a b() {
        return this.f35808c;
    }

    public boolean c() {
        if (this.f35807b == null) {
            return true;
        }
        try {
            return this.f35807b.isLocationDataEnable();
        } catch (Throwable th2) {
            es.a().a(th2);
            return true;
        }
    }

    public boolean d() {
        if (this.f35807b == null) {
            return true;
        }
        try {
            return this.f35807b.isOaidEnable();
        } catch (Throwable th2) {
            es.a().a(th2);
            return true;
        }
    }

    public boolean e() {
        if (this.f35807b == null) {
            return true;
        }
        try {
            return this.f35807b.isWifiDataEnable();
        } catch (Throwable th2) {
            es.a().a(th2);
            return true;
        }
    }

    public boolean f() {
        if (this.f35807b == null) {
            return true;
        }
        try {
            return this.f35807b.isCellLocationDataEnable();
        } catch (Throwable th2) {
            es.a().a(th2);
            return true;
        }
    }

    public boolean g() {
        if (this.f35807b == null) {
            return true;
        }
        try {
            return this.f35807b.isAppListDataEnable();
        } catch (Throwable th2) {
            es.a().a(th2);
            return true;
        }
    }

    public boolean h() {
        if (this.f35807b == null) {
            return true;
        }
        try {
            return this.f35807b.isIpAddressEnable();
        } catch (Throwable th2) {
            es.a().a(th2);
            return true;
        }
    }

    public boolean i() {
        if (this.f35807b == null) {
            return true;
        }
        try {
            return this.f35807b.isPhoneStateDataEnable();
        } catch (Throwable th2) {
            es.a().a(th2);
            return true;
        }
    }

    public boolean j() {
        if (this.f35807b == null) {
            return true;
        }
        try {
            return this.f35807b.isConfigEnable();
        } catch (Throwable th2) {
            es.a().a(th2);
            return true;
        }
    }

    public boolean k() {
        if (this.f35807b == null) {
            return true;
        }
        try {
            return this.f35807b.isDREnable();
        } catch (Throwable th2) {
            es.a().a(th2);
            return true;
        }
    }

    public Location l() {
        if (this.f35807b == null) {
            return null;
        }
        try {
            return this.f35807b.getLocation();
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }

    public String m() {
        if (this.f35807b == null) {
            return null;
        }
        try {
            this.f35808c.f35810b = true;
            return this.f35807b.getOaid();
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }

    public WifiInfo n() {
        if (this.f35807b == null) {
            return null;
        }
        try {
            return this.f35807b.getConnectionInfo();
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }

    public List<ScanResult> o() {
        if (this.f35807b == null) {
            return null;
        }
        try {
            return this.f35807b.getWifiScanResults();
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }

    public CellLocation p() {
        if (this.f35807b == null) {
            return null;
        }
        try {
            return this.f35807b.getCellLocation();
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }

    public List<CellInfo> q() {
        if (this.f35807b == null) {
            return null;
        }
        try {
            return this.f35807b.getAllCellInfo();
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }

    public List<NeighboringCellInfo> r() {
        if (this.f35807b == null) {
            return null;
        }
        try {
            return this.f35807b.getNeighboringCellInfo();
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }

    public List<PackageInfo> s() {
        if (this.f35807b == null) {
            return null;
        }
        try {
            return this.f35807b.getPackageInfos();
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }

    public String t() {
        if (this.f35807b == null) {
            return null;
        }
        try {
            return this.f35807b.getIpAddress();
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }

    public String u() {
        if (this.f35807b == null) {
            return null;
        }
        try {
            return this.f35807b.getSimOperatorName();
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }

    public String v() {
        if (this.f35807b == null) {
            return null;
        }
        try {
            return this.f35807b.getSimOperator();
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }

    public int w() {
        if (this.f35807b == null) {
            return -1;
        }
        try {
            return this.f35807b.getNetworkType();
        } catch (Throwable th2) {
            es.a().a(th2);
            return -1;
        }
    }

    public ServiceState x() {
        if (this.f35807b == null) {
            return null;
        }
        try {
            return this.f35807b.getServiceState();
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }
}
