package com.ss.bytertc.audio.device.webrtc;

import android.os.Build;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import com.ss.bytertc.audio.device.base.ManufacturerChecker;
import com.ss.bytertc.audio.device.hwearback.HardwareEarbackPackageChecker;
import com.ss.bytertc.audio.device.hwearback.HwEarback;
import com.ss.bytertc.audio.device.hwearback.IHardWareEarback;
import com.ss.bytertc.audio.device.hwearback.VivoEarback;
import com.ss.bytertc.audio.device.hwearback.XMEarback;
import com.ss.bytertc.audio.device.hwearback.ovm.OVMEarback;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes10.dex */
public class WebRtcAudioEarBack {
    private WebRtcAudioManager audioManager;
    IHardWareEarback hardWareEarback;

    public WebRtcAudioEarBack(WebRtcAudioManager webRtcAudioManager) {
        this.audioManager = webRtcAudioManager;
    }

    private IHardWareEarback createHWEarback() {
        try {
            Method method = HardwareEarbackPackageChecker.class.getMethod("isHwEarbackPackageSupported", new Class[0]);
            if (method != null && ((Boolean) method.invoke(null, new Object[0])).booleanValue()) {
                return (IHardWareEarback) HwEarback.class.getConstructor(WebRtcAudioEarBack.class).newInstance(this);
            }
            return null;
        } catch (Throwable th2) {
            th2.printStackTrace();
            RXLogging.e("WebRtcAudioEarBack", "HW hardware earmonitor is not support", th2);
            return null;
        }
    }

    public void ByteAudioEarBackEffect(int i10) {
        IHardWareEarback iHardWareEarback = this.hardWareEarback;
        if (iHardWareEarback != null) {
            iHardWareEarback.setEffect(i10);
        }
    }

    public int ByteAudioEarBackEnable(boolean z10) {
        IHardWareEarback iHardWareEarback = this.hardWareEarback;
        if (iHardWareEarback != null) {
            return z10 ? iHardWareEarback.open() : iHardWareEarback.close();
        }
        return -1;
    }

    public void ByteAudioEarBackEqualizer(int i10) {
        IHardWareEarback iHardWareEarback = this.hardWareEarback;
        if (iHardWareEarback != null) {
            iHardWareEarback.setEqualizer(i10);
        }
    }

    public int ByteAudioEarBackGetLatency() {
        IHardWareEarback iHardWareEarback = this.hardWareEarback;
        if (iHardWareEarback != null) {
            return iHardWareEarback.getLatency();
        }
        return -1;
    }

    public void ByteAudioEarBackInit() {
        if (this.hardWareEarback == null) {
            ManufacturerChecker.Type manufacturerType = ManufacturerChecker.getManufacturerType(Build.BRAND);
            if (manufacturerType == ManufacturerChecker.Type.HW || manufacturerType == ManufacturerChecker.Type.HR) {
                this.hardWareEarback = createHWEarback();
            }
            if (Build.VERSION.SDK_INT >= 33 && (manufacturerType == ManufacturerChecker.Type.OP || manufacturerType == ManufacturerChecker.Type.XM || manufacturerType == ManufacturerChecker.Type.RM)) {
                this.hardWareEarback = new OVMEarback(ContextUtils.getApplicationContext(), this);
            } else if (manufacturerType == ManufacturerChecker.Type.VO) {
                this.hardWareEarback = new VivoEarback(this);
            } else if (manufacturerType == ManufacturerChecker.Type.XM) {
                this.hardWareEarback = new XMEarback(this);
            }
        }
        IHardWareEarback iHardWareEarback = this.hardWareEarback;
        if (iHardWareEarback != null) {
            iHardWareEarback.init();
        } else {
            onHardwareEarbackSupported(false);
        }
    }

    public void ByteAudioEarBackRelease() {
        IHardWareEarback iHardWareEarback = this.hardWareEarback;
        if (iHardWareEarback != null) {
            iHardWareEarback.release();
            onHardwareEarbackReleased(true);
        }
    }

    public int ByteAudioEarBackSetVolume(int i10) {
        IHardWareEarback iHardWareEarback = this.hardWareEarback;
        if (iHardWareEarback != null) {
            return iHardWareEarback.setVolume(i10);
        }
        return -1;
    }

    public boolean ByteAudioEarBackSupport() {
        IHardWareEarback iHardWareEarback = this.hardWareEarback;
        if (iHardWareEarback != null) {
            return iHardWareEarback.isSupport();
        }
        return false;
    }

    public void onEvent(int i10, int i11) {
        IHardWareEarback iHardWareEarback = this.hardWareEarback;
        if (iHardWareEarback != null) {
            iHardWareEarback.onEvent(i10, i11);
        }
    }

    public void onHardwareEarbackReleased(boolean z10) {
        WebRtcAudioManager webRtcAudioManager = this.audioManager;
        if (webRtcAudioManager != null) {
            webRtcAudioManager.onHardwareEarbackReleased(z10);
        }
    }

    public void onHardwareEarbackSupportParamsGet(String str) {
        WebRtcAudioManager webRtcAudioManager = this.audioManager;
        if (webRtcAudioManager != null) {
            if (str == null) {
                str = "";
            }
            webRtcAudioManager.onHardwareEarbackSupportParamsGet(str);
        }
    }

    public void onHardwareEarbackSupported(boolean z10) {
        WebRtcAudioManager webRtcAudioManager = this.audioManager;
        if (webRtcAudioManager != null) {
            webRtcAudioManager.onHardwareEarbackSupported(z10);
        }
    }
}
