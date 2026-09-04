package com.xiaomi.mipush.sdk;

import com.xiaomi.push.service.module.PushChannelRegion;

/* JADX INFO: loaded from: classes4.dex */
public class PushConfiguration {
    private boolean mGeoEnable;
    private boolean mOpenCOSPush;
    private boolean mOpenFCMPush;
    private boolean mOpenFTOSPush;
    private boolean mOpenHmsPush;
    private PushChannelRegion mRegion;

    public static class PushConfigurationBuilder {
        private boolean mGeoEnable;
        private boolean mOpenCOSPush;
        private boolean mOpenFCMPush;
        private boolean mOpenFTOSPush;
        private boolean mOpenHmsPush;
        private PushChannelRegion mRegion;

        public PushConfiguration build() {
            return new PushConfiguration(this);
        }

        public PushConfigurationBuilder openCOSPush(boolean z10) {
            this.mOpenCOSPush = z10;
            return this;
        }

        public PushConfigurationBuilder openFCMPush(boolean z10) {
            this.mOpenFCMPush = z10;
            return this;
        }

        public PushConfigurationBuilder openFTOSPush(boolean z10) {
            this.mOpenFTOSPush = z10;
            return this;
        }

        public PushConfigurationBuilder openHmsPush(boolean z10) {
            this.mOpenHmsPush = z10;
            return this;
        }

        public PushConfigurationBuilder region(PushChannelRegion pushChannelRegion) {
            this.mRegion = pushChannelRegion;
            return this;
        }
    }

    public PushConfiguration() {
        this.mRegion = PushChannelRegion.China;
        this.mOpenHmsPush = false;
        this.mOpenFCMPush = false;
        this.mOpenCOSPush = false;
        this.mOpenFTOSPush = false;
    }

    private PushConfiguration(PushConfigurationBuilder pushConfigurationBuilder) {
        this.mRegion = pushConfigurationBuilder.mRegion == null ? PushChannelRegion.China : pushConfigurationBuilder.mRegion;
        this.mOpenHmsPush = pushConfigurationBuilder.mOpenHmsPush;
        this.mOpenFCMPush = pushConfigurationBuilder.mOpenFCMPush;
        this.mOpenCOSPush = pushConfigurationBuilder.mOpenCOSPush;
        this.mOpenFTOSPush = pushConfigurationBuilder.mOpenFTOSPush;
    }

    public boolean getOpenCOSPush() {
        return this.mOpenCOSPush;
    }

    public boolean getOpenFCMPush() {
        return this.mOpenFCMPush;
    }

    public boolean getOpenFTOSPush() {
        return this.mOpenFTOSPush;
    }

    public boolean getOpenHmsPush() {
        return this.mOpenHmsPush;
    }

    public PushChannelRegion getRegion() {
        return this.mRegion;
    }

    public void setOpenCOSPush(boolean z10) {
        this.mOpenCOSPush = z10;
    }

    public void setOpenFCMPush(boolean z10) {
        this.mOpenFCMPush = z10;
    }

    public void setOpenFTOSPush(boolean z10) {
        this.mOpenFTOSPush = z10;
    }

    public void setOpenHmsPush(boolean z10) {
        this.mOpenHmsPush = z10;
    }

    public void setRegion(PushChannelRegion pushChannelRegion) {
        this.mRegion = pushChannelRegion;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("PushConfiguration{");
        stringBuffer.append("Region:");
        PushChannelRegion pushChannelRegion = this.mRegion;
        if (pushChannelRegion == null) {
            stringBuffer.append("null");
        } else {
            stringBuffer.append(pushChannelRegion.name());
        }
        stringBuffer.append(",mOpenHmsPush:" + this.mOpenHmsPush);
        stringBuffer.append(",mOpenFCMPush:" + this.mOpenFCMPush);
        stringBuffer.append(",mOpenCOSPush:" + this.mOpenCOSPush);
        stringBuffer.append(",mOpenFTOSPush:" + this.mOpenFTOSPush);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
