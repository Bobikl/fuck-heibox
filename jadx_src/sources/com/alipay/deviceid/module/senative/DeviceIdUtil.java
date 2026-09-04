package com.alipay.deviceid.module.senative;

import android.content.Context;
import com.alipay.deviceid.module.x.bt;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceIdUtil {
    private static DeviceIdUtil _instance = null;
    private static boolean isLoad = false;
    private static final String mVersion = "1.0";
    private Context mContext = null;
    private int netType = -1;

    static {
        try {
            System.loadLibrary("deviceid_1.0");
            isLoad = true;
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private DeviceIdUtil() {
    }

    public static synchronized DeviceIdUtil getInstance(Context context) {
        if (_instance == null) {
            DeviceIdUtil deviceIdUtil = new DeviceIdUtil();
            _instance = deviceIdUtil;
            deviceIdUtil.loadSo(context);
            _instance.mContext = context;
        }
        return _instance;
    }

    private native String getMappedIpAddressNative(String str, String str2, int i10);

    private String getPhoneIp() {
        String str;
        String string;
        String str2 = null;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            str = null;
            while (networkInterfaces.hasMoreElements()) {
                try {
                    NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                    String name = networkInterfaceNextElement.getName();
                    if (name != null && networkInterfaceNextElement.isUp() && !name.startsWith("ppp") && !name.startsWith("p2p") && !name.startsWith("lo")) {
                        Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                        while (inetAddresses.hasMoreElements()) {
                            InetAddress inetAddressNextElement = inetAddresses.nextElement();
                            if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address) && (string = inetAddressNextElement.getHostAddress().toString()) != null && string.length() > 0) {
                                if (name.startsWith("rmnet")) {
                                    str = string;
                                } else if (name.startsWith("wlan")) {
                                    str2 = string;
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            str = null;
        }
        if (str2 != null && str2.length() > 0) {
            this.netType = 2;
            return str2;
        }
        if (str == null || str.length() <= 0) {
            return "";
        }
        this.netType = 1;
        return str;
    }

    private native int init(Object obj);

    private void loadSo(Context context) {
        if (isLoad) {
            return;
        }
        bt btVar = new bt(context);
        bt.f38323a = "1.0";
        btVar.a("deviceid");
    }

    public native String getErrorCode();

    public String getRealIpAddress(String str, int i10) {
        try {
            String phoneIp = getPhoneIp();
            if (str != null && str.length() != 0) {
                if (phoneIp != null && phoneIp.length() > 0 && this.netType == 1) {
                    return getMappedIpAddressNative(phoneIp, str, i10);
                }
                if (phoneIp != null && phoneIp.length() > 0 && this.netType == 2) {
                    return getMappedIpAddressNative("0.0.0.0", str, i10);
                }
                return "";
            }
            return "";
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public native int getVersion();

    public int initialize() {
        try {
            return init(this.mContext);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return 0;
        }
    }

    public byte[] packageDevideData(byte[] bArr) {
        try {
            return zipAndEncryptData(this.mContext, bArr);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return new byte[0];
        }
    }

    public native byte[] zipAndEncryptData(Object obj, byte[] bArr);
}
