package com.tencent.open.utils;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, i> f101174a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f101175b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f101176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f101177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f101178e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f101179f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f101180g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f101181h = true;

    private i(Context context, String str) {
        this.f101176c = null;
        this.f101177d = null;
        this.f101176c = context.getApplicationContext();
        this.f101177d = str;
        a();
        b();
    }

    public static i a(Context context, String str) {
        i iVar;
        synchronized (f101174a) {
            SLog.v("openSDK_LOG.OpenConfig", "getInstance begin");
            if (str != null) {
                f101175b = str;
            }
            if (str == null && (str = f101175b) == null) {
                str = "0";
            }
            iVar = f101174a.get(str);
            if (iVar == null) {
                iVar = new i(context, str);
                f101174a.put(str, iVar);
            }
            SLog.v("openSDK_LOG.OpenConfig", "getInstance end");
        }
        return iVar;
    }

    private void a() {
        try {
            this.f101178e = new JSONObject(c("com.tencent.open.config.json"));
        } catch (JSONException unused) {
            this.f101178e = new JSONObject();
        }
    }

    private void a(String str, String str2) {
        try {
            if (this.f101177d != null) {
                str = str + "." + this.f101177d;
            }
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f101176c.openFileOutput(str, 0), Charset.forName("UTF-8"));
            outputStreamWriter.write(str2);
            outputStreamWriter.flush();
            outputStreamWriter.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        d("cgi back, do update");
        this.f101178e = jSONObject;
        a("com.tencent.open.config.json", jSONObject.toString());
        this.f101179f = SystemClock.elapsedRealtime();
    }

    private void b() {
        if (this.f101180g != 0) {
            d("update thread is running, return");
            return;
        }
        this.f101180g = 1;
        final HashMap map = new HashMap();
        map.put("appid", this.f101177d);
        map.put("status_os", Build.VERSION.RELEASE);
        map.put("status_machine", f.a().c(g.a()));
        map.put("status_version", Build.VERSION.SDK);
        map.put(SocializeProtocolConstants.PROTOCOL_KEY_VERSION, Constants.SDK_VERSION);
        map.put("sdkp", ak.av);
        l.a(new Runnable() { // from class: com.tencent.open.utils.i.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.tencent.open.a.g gVarA = com.tencent.open.a.f.a().a("https://cgi.connect.qq.com/qqconnectopen/openapi/policy_conf", map);
                    String strA = gVarA.a();
                    SLog.i("openSDK_LOG.OpenConfig", "update: get config statusCode " + gVarA.d());
                    i.this.a(m.d(strA));
                } catch (Exception e10) {
                    SLog.e("openSDK_LOG.OpenConfig", "get config error ", e10);
                }
                i.this.f101180g = 0;
            }
        });
    }

    private String c(String str) {
        InputStream inputStreamOpen;
        BufferedReader bufferedReader;
        StringBuffer stringBuffer;
        String str2;
        String string = "";
        try {
            try {
                if (this.f101177d != null) {
                    str2 = str + "." + this.f101177d;
                } else {
                    str2 = str;
                }
                inputStreamOpen = this.f101176c.openFileInput(str2);
                while (true) {
                    try {
                        try {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                stringBuffer.append(line);
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                        } catch (IOException e11) {
                            e11.printStackTrace();
                            inputStreamOpen.close();
                            bufferedReader.close();
                        }
                    } catch (Throwable th2) {
                        try {
                            inputStreamOpen.close();
                            bufferedReader.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                        throw th2;
                    }
                }
            } catch (IOException e13) {
                e13.printStackTrace();
                return "";
            }
        } catch (FileNotFoundException unused) {
            inputStreamOpen = this.f101176c.getAssets().open(str);
        }
        bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charset.forName("UTF-8")));
        stringBuffer = new StringBuffer();
        string = stringBuffer.toString();
        inputStreamOpen.close();
        bufferedReader.close();
        return string;
    }

    private void c() {
        int iOptInt = this.f101178e.optInt("Common_frequency");
        if (iOptInt == 0) {
            iOptInt = 1;
        }
        if (SystemClock.elapsedRealtime() - this.f101179f >= iOptInt * 3600000) {
            b();
        }
    }

    private void d(String str) {
        if (this.f101181h) {
            SLog.v("openSDK_LOG.OpenConfig", str + "; appid: " + this.f101177d);
        }
    }

    public int a(String str) {
        d("get " + str);
        c();
        return this.f101178e.optInt(str);
    }

    public boolean b(String str) {
        d("get " + str);
        c();
        Object objOpt = this.f101178e.opt(str);
        if (objOpt == null) {
            return false;
        }
        if (objOpt instanceof Integer) {
            return !objOpt.equals(0);
        }
        if (objOpt instanceof Boolean) {
            return ((Boolean) objOpt).booleanValue();
        }
        return false;
    }
}
