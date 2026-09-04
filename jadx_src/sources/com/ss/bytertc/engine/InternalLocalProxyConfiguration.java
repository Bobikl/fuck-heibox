package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.type.LocalProxyConfiguration;
import com.ss.bytertc.engine.type.LocalProxyType;

/* JADX INFO: loaded from: classes4.dex */
public class InternalLocalProxyConfiguration {
    public String localProxyIp;
    public String localProxyPassword;
    public int localProxyPort;
    public InternalLocalProxyType localProxyType;
    public String localProxyUsername;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.InternalLocalProxyConfiguration$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$type$LocalProxyType;

        static {
            int[] iArr = new int[LocalProxyType.values().length];
            $SwitchMap$com$ss$bytertc$engine$type$LocalProxyType = iArr;
            try {
                iArr[LocalProxyType.SOCKS5.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$LocalProxyType[LocalProxyType.HTTP_TUNNEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum InternalLocalProxyType {
        SOCKS5(1),
        HTTP_TUNNEL(2);

        private int value;

        InternalLocalProxyType(int i10) {
            this.value = i10;
        }

        @CalledByNative("InternalLocalProxyType")
        public int getIntValue() {
            return this.value;
        }
    }

    public InternalLocalProxyConfiguration(LocalProxyConfiguration localProxyConfiguration) {
        this.localProxyType = ConvertEnumValue(localProxyConfiguration.localProxyType);
        this.localProxyIp = localProxyConfiguration.localProxyIp;
        this.localProxyPort = localProxyConfiguration.localProxyPort;
        this.localProxyUsername = localProxyConfiguration.localProxyUsername;
        this.localProxyPassword = localProxyConfiguration.localProxyPassword;
    }

    private InternalLocalProxyType ConvertEnumValue(LocalProxyType localProxyType) {
        InternalLocalProxyType internalLocalProxyType = InternalLocalProxyType.SOCKS5;
        int i10 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$type$LocalProxyType[localProxyType.ordinal()];
        return (i10 == 1 || i10 != 2) ? internalLocalProxyType : InternalLocalProxyType.HTTP_TUNNEL;
    }

    @CalledByNative
    public String getLocalProxyIp() {
        return this.localProxyIp;
    }

    @CalledByNative
    public String getLocalProxyPassword() {
        return this.localProxyPassword;
    }

    @CalledByNative
    int getLocalProxyPort() {
        return this.localProxyPort;
    }

    @CalledByNative
    InternalLocalProxyType getLocalProxyType() {
        return this.localProxyType;
    }

    @CalledByNative
    public String getLocalProxyUsername() {
        return this.localProxyUsername;
    }
}
