package com.ss.bytertc.base.utils;

import androidx.annotation.w0;
import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes10.dex */
public final class WlanMonitor {

    public static class ConnectionInfo {
        private String ifName;
        private int noise;
        private int rssi;
        private int rxRate;
        private int txRate;

        public ConnectionInfo(String str, int i10, int i11, int i12, int i13) {
            this.ifName = str;
            this.rssi = i10;
            this.noise = i11;
            this.txRate = i12;
            this.rxRate = i13;
        }

        @CalledByNative("ConnectionInfo")
        public String getIfName() {
            return this.ifName;
        }

        @CalledByNative("ConnectionInfo")
        public int getNoise() {
            return this.noise;
        }

        @CalledByNative("ConnectionInfo")
        public int getRssi() {
            return this.rssi;
        }

        @CalledByNative("ConnectionInfo")
        public int getRxRate() {
            return this.rxRate;
        }

        @CalledByNative("ConnectionInfo")
        public int getTxRate() {
            return this.txRate;
        }
    }

    public static class InterfaceInfo {
        private int channelWidth;
        private int channleNum;
        private int frequency;
        private String ifName;
        private int phyMode;
        private boolean state;

        public InterfaceInfo(String str, boolean z10, int i10, int i11, int i12, int i13) {
            this.ifName = str;
            this.state = z10;
            this.frequency = i10;
            this.phyMode = i11;
            this.channleNum = i12;
            this.channelWidth = i13;
        }

        @CalledByNative("InterfaceInfo")
        public int getChannelWidth() {
            return this.channelWidth;
        }

        @CalledByNative("InterfaceInfo")
        public int getChannleNum() {
            return this.channleNum;
        }

        @CalledByNative("InterfaceInfo")
        public int getFrequency() {
            return this.frequency;
        }

        @CalledByNative("InterfaceInfo")
        public String getIfName() {
            return this.ifName;
        }

        @CalledByNative("InterfaceInfo")
        public int getPhyMode() {
            return this.phyMode;
        }

        @CalledByNative("InterfaceInfo")
        public boolean getState() {
            return this.state;
        }
    }

    public static class ScanResultInfo {
        private int channelWidth;
        private int channleNum;
        private int frequency;
        private int noise;
        private int rssi;

        public ScanResultInfo(int i10, int i11, int i12, int i13, int i14) {
            this.frequency = i10;
            this.channleNum = i11;
            this.channelWidth = i12;
            this.rssi = i13;
            this.noise = i14;
        }

        @CalledByNative("ScanResultInfo")
        public int getChannelWidth() {
            return this.channelWidth;
        }

        @CalledByNative("ScanResultInfo")
        public int getChannleNum() {
            return this.channleNum;
        }

        @CalledByNative("ScanResultInfo")
        public int getFrequency() {
            return this.frequency;
        }

        @CalledByNative("ScanResultInfo")
        public int getNoise() {
            return this.noise;
        }

        @CalledByNative("ScanResultInfo")
        public int getRssi() {
            return this.rssi;
        }
    }

    @CalledByNative
    @w0(api = 29)
    public static ConnectionInfo[] getConnectionInfos() {
        return null;
    }

    @CalledByNative
    @w0(api = 21)
    public static int getFrequency() {
        return 0;
    }

    @CalledByNative
    @w0(api = 30)
    public static InterfaceInfo[] getInterfaceInfos() {
        return null;
    }

    @CalledByNative
    @w0(api = 31)
    public static ScanResultInfo[] getScanResultInfos() {
        return null;
    }

    @CalledByNative
    public static int getSignalQuality() {
        return 0;
    }
}
