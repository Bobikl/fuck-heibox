package cn.fly.verify;

import android.content.pm.PackageInfo;
import android.location.Location;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.ServiceState;
import android.telephony.SubscriptionInfo;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class aw {
    public int getActiveSubscriptionInfoCount() {
        return -1;
    }

    public List<SubscriptionInfo> getActiveSubscriptionInfoList() {
        return null;
    }

    public String getAdvertisingId() {
        return null;
    }

    public List<CellInfo> getAllCellInfo() {
        return null;
    }

    public String getAndroidId() {
        return null;
    }

    public String getCellIpv4() {
        return null;
    }

    public String getCellIpv6() {
        return null;
    }

    public CellLocation getCellLocation() {
        return null;
    }

    public WifiInfo getConnectionInfo() {
        return null;
    }

    public String getIpAddress() {
        return null;
    }

    public Location getLocation() {
        return null;
    }

    public List<NeighboringCellInfo> getNeighboringCellInfo() {
        return null;
    }

    @Deprecated
    public int getNetworkType() {
        return -1;
    }

    public String getOaid() {
        return null;
    }

    public List<PackageInfo> getPackageInfos() {
        return null;
    }

    @Deprecated
    public ServiceState getServiceState() {
        return null;
    }

    public String getSimOperator() {
        return null;
    }

    public String getSimOperatorName() {
        return null;
    }

    public List<ScanResult> getWifiScanResults() {
        return null;
    }

    public boolean isAdvertisingIdEnable() {
        return true;
    }

    public boolean isAndroidIdEnable() {
        return true;
    }

    public boolean isAppListDataEnable() {
        return true;
    }

    public boolean isCellLocationDataEnable() {
        return true;
    }

    public boolean isConfigEnable() {
        return true;
    }

    public boolean isDREnable() {
        return true;
    }

    public boolean isIpAddressEnable() {
        return true;
    }

    public boolean isLocationDataEnable() {
        return true;
    }

    public boolean isOaidEnable() {
        return true;
    }

    public boolean isPhoneStateDataEnable() {
        return true;
    }

    public boolean isSocietyPlatformDataEnable() {
        return true;
    }

    public boolean isWifiDataEnable() {
        return true;
    }
}
