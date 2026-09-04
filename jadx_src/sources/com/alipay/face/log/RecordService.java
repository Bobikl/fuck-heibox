package com.alipay.face.log;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.fintech.log.HttpUploader;
import com.huawei.hms.framework.common.ContainerUtils;
import com.umeng.analytics.pro.ak;
import com.xiaomi.mipush.sdk.Constants;
import d4.c;
import d4.d;
import d4.e;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class RecordService {
    private static final int MAX_RECORD_COUNT = 10;
    private static RecordService s_instance = new RecordService();
    private Context ctx;
    private String netType;
    private String osVersion;
    private String phoneLanguage;
    private String phoneType;
    private List<RecordBase> records = new ArrayList();
    private String screenMetrix;
    private String sessionId;
    private String zimId;

    public interface ZimUploadLogCallback {
        void onFail(List<String> list);

        void onSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x0089 A[Catch: Exception -> 0x0085, all -> 0x00a1, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0009, B:10:0x002a, B:12:0x0035, B:14:0x0040, B:23:0x0063, B:45:0x008c, B:26:0x006b, B:49:0x0091, B:53:0x0099, B:56:0x00a0, B:55:0x009d, B:40:0x0081, B:44:0x0089), top: B:60:0x0003, inners: #5 }] */
    public void cacheLogs(List<String> list) {
        FileWriter fileWriter;
        synchronized (RecordService.class) {
            if (this.ctx == null) {
                return;
            }
            String str = this.ctx.getFilesDir().getAbsolutePath() + RecordConst.LOG_FILE_NAME;
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (file.exists() && file.length() > 1048576) {
                    file.delete();
                }
            }
            BufferedWriter bufferedWriter = null;
            try {
                fileWriter = new FileWriter(str, true);
                try {
                    try {
                        BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter);
                        try {
                            Iterator<String> it = list.iterator();
                            while (it.hasNext()) {
                                bufferedWriter2.write(it.next());
                            }
                            try {
                                bufferedWriter2.close();
                                fileWriter.close();
                            } catch (Exception e10) {
                                e = e10;
                                e.printStackTrace();
                            }
                        } catch (Exception e11) {
                            e = e11;
                            bufferedWriter = bufferedWriter2;
                            e.printStackTrace();
                            if (bufferedWriter != null) {
                                try {
                                    bufferedWriter.close();
                                    if (fileWriter != null) {
                                        fileWriter.close();
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    e.printStackTrace();
                                }
                            } else if (fileWriter != null) {
                                fileWriter.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedWriter = bufferedWriter2;
                            if (bufferedWriter != null) {
                                try {
                                    bufferedWriter.close();
                                } catch (Exception e13) {
                                    e13.printStackTrace();
                                    throw th;
                                }
                            }
                            if (fileWriter != null) {
                                fileWriter.close();
                            }
                            throw th;
                        }
                    } catch (Exception e14) {
                        e = e14;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e15) {
                e = e15;
                fileWriter = null;
            } catch (Throwable th4) {
                th = th4;
                fileWriter = null;
            }
        }
    }

    public static RecordService getInstance() {
        return s_instance;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0075 A[Catch: Exception -> 0x0078, TRY_LEAVE, TryCatch #3 {Exception -> 0x0078, blocks: (B:37:0x0070, B:39:0x0075), top: B:46:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private List<String> readCacheLogs() throws Throwable {
        BufferedReader bufferedReader;
        FileReader fileReader;
        Exception e10;
        ArrayList arrayList = new ArrayList();
        if (this.ctx == null) {
            return arrayList;
        }
        String str = this.ctx.getFilesDir().getAbsolutePath() + RecordConst.LOG_FILE_NAME;
        File file = new File(str);
        if (!file.exists()) {
            return arrayList;
        }
        FileReader fileReader2 = null;
        try {
            try {
                fileReader = new FileReader(str);
                try {
                    bufferedReader = new BufferedReader(fileReader);
                    while (true) {
                        try {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                arrayList.add(line);
                            } catch (Exception e11) {
                                e10 = e11;
                                e10.printStackTrace();
                                if (fileReader != null) {
                                    fileReader.close();
                                }
                                if (bufferedReader != null) {
                                }
                                file.delete();
                                return arrayList;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileReader2 = fileReader;
                            if (fileReader2 != null) {
                                try {
                                    fileReader2.close();
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                } catch (Exception unused) {
                                    file.delete();
                                    throw th;
                                }
                            } else if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            file.delete();
                            throw th;
                        }
                    }
                    fileReader.close();
                } catch (Exception e12) {
                    e10 = e12;
                    bufferedReader = null;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = null;
                    fileReader2 = fileReader;
                    if (fileReader2 != null) {
                        fileReader2.close();
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                    } else if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    file.delete();
                    throw th;
                }
            } catch (Exception unused2) {
            }
        } catch (Exception e13) {
            fileReader = null;
            e10 = e13;
            bufferedReader = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            if (fileReader2 != null) {
                fileReader2.close();
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } else if (bufferedReader != null) {
                bufferedReader.close();
            }
            file.delete();
            throw th;
        }
        bufferedReader.close();
        file.delete();
        return arrayList;
    }

    private void recordEventEx(RecordLevel recordLevel, String str, String... strArr) {
        EventRecord eventRecord = new EventRecord();
        eventRecord.setLogLevel("1");
        eventRecord.setActionName(str);
        eventRecord.setSessionId(this.sessionId);
        eventRecord.setPhoneType(this.phoneType);
        eventRecord.setOsVersion(this.osVersion);
        eventRecord.setNetType(this.netType);
        eventRecord.setLanguage(this.phoneLanguage);
        eventRecord.setScreenMetrix(this.screenMetrix);
        eventRecord.setExtParam1(this.zimId);
        eventRecord.setExtParma2("0");
        eventRecord.setExtParam3("0");
        HashMap map = new HashMap();
        if (strArr != null && strArr.length % 2 == 0) {
            JSONObject jSONObject = new JSONObject();
            for (int i10 = 0; i10 < strArr.length - 1; i10 += 2) {
                jSONObject.put(strArr[i10], (Object) strArr[i10 + 1]);
            }
            map.put("extParam", c.b(jSONObject.toJSONString()));
        }
        map.put("logType", "BI_C_V1");
        map.put("publicParam", "JTdCJTdE");
        map.put("zimId", this.zimId);
        map.put("uiVersion", "992");
        map.put("uploadLog", "true");
        map.put("productName", "faceverfy");
        map.put("logPlanId", "ALIYUN_FACE_LOGPLAN_V1");
        map.put("logModelVersion", "V1.0");
        map.put(ak.f104429al, "NONE");
        map.put("bistoken", "1234");
        map.put("bioType", "facedetect");
        map.put("keepUploadPage", "1");
        map.put("sceneId", "AliyunID+Aliyun+certify+face");
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            sb2.append(str2);
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(str3);
            sb2.append("^");
        }
        String string = sb2.toString();
        if (string.endsWith("^")) {
            string = string.substring(0, string.length() - 1);
        }
        eventRecord.setExtParam4(string);
        this.records.add(eventRecord);
        tryUpload(false, null);
    }

    private void tryUpload(boolean z10, final ZIMCrashCallback zIMCrashCallback) {
        if (this.records.size() >= 10 || z10) {
            ArrayList arrayList = new ArrayList();
            Iterator<RecordBase> it = this.records.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
            this.records.clear();
            arrayList.addAll(readCacheLogs());
            if (arrayList.size() <= 0) {
                return;
            }
            zimUploadLog(this.ctx, arrayList, new ZimUploadLogCallback() { // from class: com.alipay.face.log.RecordService.2
                @Override // com.alipay.face.log.RecordService.ZimUploadLogCallback
                public void onFail(List<String> list) {
                    RecordService.this.cacheLogs(list);
                    ZIMCrashCallback zIMCrashCallback2 = zIMCrashCallback;
                    if (zIMCrashCallback2 != null) {
                        zIMCrashCallback2.onError();
                    }
                }

                @Override // com.alipay.face.log.RecordService.ZimUploadLogCallback
                public void onSuccess() {
                    ZIMCrashCallback zIMCrashCallback2 = zIMCrashCallback;
                    if (zIMCrashCallback2 != null) {
                        zIMCrashCallback2.onSuccess();
                    }
                }
            });
        }
    }

    public static void zimUploadLog(final Context context, final List<String> list, ZimUploadLogCallback zimUploadLogCallback) {
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.alipay.face.log.RecordService.1
            @Override // java.lang.Runnable
            public void run() {
                new HttpUploader(context).upload("FintechFaceVerify", "", e.h(list, ""));
            }
        });
    }

    public void flush() {
        synchronized (RecordService.class) {
            tryUpload(true, null);
        }
    }

    public void init(Context context, String str) {
        this.ctx = context;
        this.zimId = str;
        this.sessionId = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
        this.phoneType = Build.FINGERPRINT;
        this.osVersion = String.valueOf(Build.VERSION.SDK_INT);
        this.netType = d.c(context) + "|" + d.d(context);
        this.phoneLanguage = d.b();
        this.screenMetrix = d.a(context);
    }

    public void recordEvent(RecordLevel recordLevel, String str, String... strArr) {
        synchronized (RecordService.class) {
            recordEventEx(recordLevel, str, strArr);
        }
    }

    public void reportCrash(ZIMCrashCallback zIMCrashCallback) {
        synchronized (RecordService.class) {
            tryUpload(true, zIMCrashCallback);
        }
    }
}
