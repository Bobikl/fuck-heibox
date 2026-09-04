package com.efs.sdk.pa;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.protocol.file.EfsTextFile;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.efs.sdk.base.protocol.file.section.KVSection;
import com.efs.sdk.base.protocol.file.section.TextSection;
import com.umeng.umcrash.UMCrash;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static String a(Context context) {
        Class<?> cls;
        Method method;
        if (context == null) {
            return null;
        }
        try {
            cls = Class.forName("com.umeng.commonsdk.statistics.common.DeviceConfig");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            method = cls.getMethod("getSid", Context.class);
        } catch (NoSuchMethodException unused2) {
            method = null;
        }
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, context);
            if (objInvoke != null) {
                return objInvoke.toString();
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    public static synchronized void a(PAFactory pAFactory, String str, String str2) {
        EfsTextFile efsTextFile = new EfsTextFile(str);
        KVSection kVSectionCreateAndAddKVSection = efsTextFile.createAndAddKVSection("custom_info");
        kVSectionCreateAndAddKVSection.put("bserial", pAFactory.getSerial());
        kVSectionCreateAndAddKVSection.put("bsver", pAFactory.getSver());
        HashMap<String, String> extend = pAFactory.getExtend();
        if (extend != null && !extend.isEmpty()) {
            for (Map.Entry<String, String> entry : extend.entrySet()) {
                kVSectionCreateAndAddKVSection.put(entry.getKey(), entry.getValue());
            }
        }
        kVSectionCreateAndAddKVSection.put("crver", "2.1.157.umeng");
        String strA = a(pAFactory.getContext());
        if (!TextUtils.isEmpty(strA)) {
            kVSectionCreateAndAddKVSection.put(UMCrash.KEY_CALLBACK_SESSION_ID, strA);
        }
        if (!TextUtils.isEmpty(str2)) {
            if (pAFactory.getPaClient() != null && !TextUtils.isEmpty(pAFactory.getPaClient().onGetCallbackInfo())) {
                kVSectionCreateAndAddKVSection.put("um_user_string", pAFactory.getPaClient().onGetCallbackInfo());
            }
            TextSection textSectionCreateAndAddTextSection = efsTextFile.createAndAddTextSection("stack");
            textSectionCreateAndAddTextSection.setBody(str2);
            textSectionCreateAndAddTextSection.setSep(AbsSection.SEP_LINE_BREAK);
        }
        EfsReporter reporter = pAFactory.getReporter();
        if (reporter != null) {
            reporter.send(efsTextFile);
        }
        pAFactory.getConfigManager().increaseUploadSmoothLogCnt();
        Log.d("fred_xx", "reportPaWpkStats: stack: ".concat(String.valueOf(str2)));
    }
}
