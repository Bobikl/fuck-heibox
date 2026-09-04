package com.efs.sdk.base.core.config;

import android.content.Context;
import android.text.TextUtils;
import com.efs.sdk.base.core.a.a;
import com.efs.sdk.base.core.util.d;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.efs.sdk.base.protocol.file.section.KVSection;
import com.igexin.sdk.PushConsts;
import com.taobao.accs.common.Constants;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.umeng.umcrash.UMCrash;
import h5.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class GlobalInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Object> f42478a = new ConcurrentHashMap();

    final void a(String str, Object obj) {
        if (obj != null) {
            this.f42478a.put(str, obj);
        }
    }

    final Object b(String str, Object obj) {
        Object obj2 = this.f42478a.get(str);
        return (obj2 != null || this.f42478a.containsKey(str)) ? obj2 : obj;
    }

    public Map<String, Object> getGlobalInfoMap() {
        HashMap map = new HashMap(this.f42478a);
        a.a();
        map.put("ctime", Long.valueOf(a.b() / 1000));
        a.a();
        map.put("w_tm", Long.valueOf(a.b() / 1000));
        return map;
    }

    public List<AbsSection> getGlobalSectionList(String str) {
        ArrayList arrayList = new ArrayList();
        KVSection kVSection = new KVSection("global_head");
        KVSection kVSectionPut = kVSection.put("type", str).put("appid", this.f42478a.get("appid")).put("wid", this.f42478a.get("wid")).put(PushConsts.KEY_SERVICE_PIT, this.f42478a.get(PushConsts.KEY_SERVICE_PIT)).put("pkg", this.f42478a.get("pkg")).put("ver", this.f42478a.get("ver")).put("vcode", this.f42478a.get("vcode")).put("ps", this.f42478a.get("ps")).put("stime", this.f42478a.get("stime"));
        a.a();
        KVSection kVSectionPut2 = kVSectionPut.put("ctime", Long.valueOf(a.b() / 1000));
        a.a();
        kVSectionPut2.put("w_tm", Long.valueOf(a.b() / 1000)).put("sdk_ver", this.f42478a.get("sdk_ver"));
        String strValueOf = String.valueOf(b("uid", ""));
        if (!TextUtils.isEmpty(strValueOf)) {
            kVSection.put("uid", strValueOf);
        }
        arrayList.add(kVSection);
        KVSection kVSection2 = new KVSection("device_info");
        kVSection2.put("lang", this.f42478a.get("lang")).put("brand", this.f42478a.get("brand")).put(Constants.KEY_MODEL, this.f42478a.get(Constants.KEY_MODEL)).put("build_model", this.f42478a.get("build_model")).put("rom", this.f42478a.get("rom")).put("sdk", this.f42478a.get("sdk")).put("dsp_h", this.f42478a.get("dsp_h")).put("dsp_w", this.f42478a.get("dsp_w")).put("tzone", this.f42478a.get("tzone")).put(b.f119111k, this.f42478a.get(b.f119111k)).put(SocializeProtocolConstants.PROTOCOL_KEY_FR, this.f42478a.get(SocializeProtocolConstants.PROTOCOL_KEY_FR));
        try {
            if (this.f42478a.containsKey(UMCrash.KEY_HEADER_ACCESS)) {
                kVSection2.put(UMCrash.KEY_HEADER_ACCESS, this.f42478a.get(UMCrash.KEY_HEADER_ACCESS));
            }
            if (this.f42478a.containsKey(UMCrash.KEY_HEADER_ACCESS_SUBTYPE)) {
                kVSection2.put(UMCrash.KEY_HEADER_ACCESS_SUBTYPE, this.f42478a.get(UMCrash.KEY_HEADER_ACCESS_SUBTYPE));
            }
            if (this.f42478a.containsKey(UMCrash.KEY_HEADER_NETWORK_TYPE)) {
                kVSection2.put(UMCrash.KEY_HEADER_NETWORK_TYPE, this.f42478a.get(UMCrash.KEY_HEADER_NETWORK_TYPE));
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        arrayList.add(kVSection2);
        return arrayList;
    }

    public String getUUID(Context context) {
        String strValueOf = String.valueOf(b("wid", ""));
        if (!TextUtils.isEmpty(strValueOf)) {
            return strValueOf;
        }
        String strA = d.a(context);
        a("wid", strA);
        return strA;
    }
}
