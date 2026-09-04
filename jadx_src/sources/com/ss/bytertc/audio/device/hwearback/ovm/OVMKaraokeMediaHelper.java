package com.ss.bytertc.audio.device.hwearback.ovm;

import android.content.Context;
import com.bytedance.realx.base.RXLogging;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class OVMKaraokeMediaHelper {
    private static final String TAG = "OVMKaraokeMediaHelper";
    private Object helper;
    private Map<String, Method> methodCache = new ConcurrentHashMap();

    private OVMKaraokeMediaHelper(Object obj) {
        this.helper = obj;
    }

    public static OVMKaraokeMediaHelper create(Context context) {
        try {
            return new OVMKaraokeMediaHelper(Class.forName("com.itgsa.opensdk.mediaunit.KaraokeMediaHelper").getConstructor(Context.class).newInstance(context));
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    private Method getMethod(String str, Class<?>... clsArr) {
        Method method = this.methodCache.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method method2 = this.helper.getClass().getMethod(str, clsArr);
            this.methodCache.put(str, method2);
            return method2;
        } catch (Throwable th2) {
            RXLogging.e(TAG, "Can not get method: " + str, th2);
            return null;
        }
    }

    public void closeKTVDevice() {
        try {
            Method method = getMethod("closeKTVDevice", new Class[0]);
            if (method != null) {
                method.invoke(this.helper, new Object[0]);
            }
        } catch (Throwable th2) {
            RXLogging.e(TAG, "closeKTVDevice operate not allowed", th2);
        }
    }

    public String getKaraokeSupportParameters() {
        try {
            Method method = getMethod("getKaraokeSupportParameters", new Class[0]);
            return method != null ? (String) method.invoke(this.helper, new Object[0]) : "";
        } catch (Throwable th2) {
            RXLogging.e(TAG, "getKaraokeSupportParameters operate not allowed", th2);
            return "";
        }
    }

    public int getListenRecordSame() {
        try {
            Method method = getMethod("getListenRecordSame", new Class[0]);
            if (method != null) {
                return ((Integer) method.invoke(this.helper, new Object[0])).intValue();
            }
        } catch (Throwable th2) {
            RXLogging.e(TAG, "getListenRecordSame operate not allowed", th2);
        }
        return 0;
    }

    public int getMicVolParam() {
        try {
            Method method = getMethod("getMicVolParam", new Class[0]);
            if (method != null) {
                return ((Integer) method.invoke(this.helper, new Object[0])).intValue();
            }
        } catch (Throwable th2) {
            RXLogging.e(TAG, "getMicVolParam operate not allowed", th2);
        }
        return 0;
    }

    public int getPlayFeedbackParam() {
        try {
            Method method = getMethod("getPlayFeedbackParam", new Class[0]);
            if (method != null) {
                return ((Integer) method.invoke(this.helper, new Object[0])).intValue();
            }
        } catch (Throwable th2) {
            RXLogging.e(TAG, "getPlayFeedbackParam operate not allowed", th2);
        }
        return 0;
    }

    public int getVersion() {
        try {
            Method method = getMethod("getVersion", new Class[0]);
            if (method != null) {
                return ((Integer) method.invoke(this.helper, new Object[0])).intValue();
            }
            return -1;
        } catch (Throwable th2) {
            RXLogging.e(TAG, "getPlayFeedbackParam operate not allowed", th2);
            return -1;
        }
    }

    public boolean isAppSupportKaraoke(String str) {
        try {
            Method method = getMethod("isAppSupportKaraoke", String.class);
            if (method != null) {
                return ((Boolean) method.invoke(this.helper, str)).booleanValue();
            }
        } catch (Throwable th2) {
            RXLogging.e(TAG, "isAppSupportKaraoke operate not allowed", th2);
        }
        return false;
    }

    public boolean isDeviceSupportKaraoke() {
        try {
            Method method = getMethod("isDeviceSupportKaraoke", new Class[0]);
            if (method != null) {
                return ((Boolean) method.invoke(this.helper, new Object[0])).booleanValue();
            }
        } catch (Throwable th2) {
            RXLogging.e(TAG, "isDeviceSupportKaraoke operate not allowed", th2);
        }
        return false;
    }

    public void openKTVDevice() {
        try {
            Method method = getMethod("openKTVDevice", new Class[0]);
            if (method != null) {
                method.invoke(this.helper, new Object[0]);
            }
        } catch (Throwable th2) {
            RXLogging.e(TAG, "openKTVDevice operate not allowed", th2);
        }
    }

    public void setEqualizerType(int i10) {
        try {
            Method method = getMethod("setEqualizerType", Integer.TYPE);
            if (method != null) {
                method.invoke(this.helper, Integer.valueOf(i10));
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
            RXLogging.e(TAG, "setEqualizerType operate not allowed", th2);
        }
    }

    public void setListenRecordSame(int i10) {
        try {
            Method method = getMethod("setListenRecordSame", Integer.TYPE);
            if (method != null) {
                method.invoke(this.helper, Integer.valueOf(i10));
            }
        } catch (Throwable th2) {
            RXLogging.e(TAG, "setListenRecordSame operate not allowed", th2);
        }
    }

    public void setMicVolParam(int i10) {
        try {
            Method method = getMethod("setMicVolParam", Integer.TYPE);
            if (method != null) {
                method.invoke(this.helper, Integer.valueOf(i10));
            }
        } catch (Throwable th2) {
            RXLogging.e(TAG, "setMicVolParam operate not allowed", th2);
        }
    }

    public void setMixerSoundType(int i10) {
        try {
            Method method = getMethod("setMixerSoundType", Integer.TYPE);
            if (method != null) {
                method.invoke(this.helper, Integer.valueOf(i10));
            }
        } catch (Throwable th2) {
            RXLogging.e(TAG, "setMixerSoundType operate not allowed", th2);
        }
    }

    public void setPlayFeedbackParam(int i10) {
        try {
            Method method = getMethod("setPlayFeedbackParam", Integer.TYPE);
            if (method != null) {
                method.invoke(this.helper, Integer.valueOf(i10));
            }
        } catch (Throwable th2) {
            RXLogging.e(TAG, "setPlayFeedbackParam operate not allowed", th2);
        }
    }
}
