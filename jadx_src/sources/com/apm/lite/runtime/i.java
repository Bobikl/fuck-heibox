package com.apm.lite.runtime;

import android.content.Context;
import com.apm.lite.ICommonParams;
import com.apm.lite.MonitorCrash;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class i {

    public static final class a implements ICommonParams {
        a() {
        }

        @Override // com.apm.lite.ICommonParams
        public Map<String, Object> getCommonParams() {
            return new HashMap();
        }

        @Override // com.apm.lite.ICommonParams
        public String getDeviceId() {
            MonitorCrash monitorCrash = (MonitorCrash) com.apm.lite.d.b();
            return monitorCrash != null ? monitorCrash.config().getDeviceId() : "";
        }

        @Override // com.apm.lite.ICommonParams
        public List<String> getPatchInfo() {
            return null;
        }

        @Override // com.apm.lite.ICommonParams
        public Map<String, Integer> getPluginInfo() {
            return null;
        }

        @Override // com.apm.lite.ICommonParams
        public String getSessionId() {
            return null;
        }

        @Override // com.apm.lite.ICommonParams
        public long getUserId() {
            return 0L;
        }
    }

    public static d a(Context context) {
        return new d(context, new a());
    }
}
