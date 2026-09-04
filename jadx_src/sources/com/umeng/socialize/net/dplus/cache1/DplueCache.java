package com.umeng.socialize.net.dplus.cache1;

import android.text.TextUtils;
import com.umeng.socialize.utils.ContextUtil;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class DplueCache {
    private static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        return (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("content")) == null) ? new JSONObject() : jSONObjectOptJSONObject.optJSONObject("share");
    }

    private static boolean a(String str, File file) throws Throwable {
        BufferedWriter bufferedWriter = null;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(ContextUtil.getContext().openFileOutput(file.getName(), 0)));
                try {
                    bufferedWriter2.write(str);
                    try {
                        bufferedWriter2.close();
                    } catch (Exception e10) {
                        SLog.error(UmengText.CACHE.CLOSE, e10);
                    }
                    return true;
                } catch (Exception e11) {
                    e = e11;
                    bufferedWriter = bufferedWriter2;
                    SLog.error(UmengText.CACHE.CACHEFILE, e);
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (Exception e12) {
                            SLog.error(UmengText.CACHE.CLOSE, e12);
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (Exception e13) {
                            SLog.error(UmengText.CACHE.CLOSE, e13);
                        }
                    }
                    throw th;
                }
            } catch (Exception e14) {
                e = e14;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static boolean deleteFile(File file) {
        return file.delete();
    }

    public static String getFileName() {
        return "dpluscache";
    }

    public static File getFilePath(String str) {
        if (ContextUtil.getContext() == null) {
            return null;
        }
        String packageName = ContextUtil.getContext().getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append("data");
        sb2.append(str2);
        sb2.append("data");
        sb2.append(str2);
        sb2.append(packageName);
        sb2.append(str2);
        sb2.append("files");
        sb2.append(str2);
        sb2.append(str);
        String string = sb2.toString();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        File file = new File(string);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static String readFile(File file) throws Throwable {
        Throwable th2;
        BufferedReader bufferedReader;
        Exception e10;
        if (!file.exists()) {
            return "";
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(ContextUtil.getContext().openFileInput(file.getName())));
            while (true) {
                try {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb2.append(line);
                    } catch (Exception e11) {
                        e10 = e11;
                        SLog.error(UmengText.CACHE.CACHEFILE, e10);
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception e12) {
                                SLog.error(UmengText.CACHE.CACHEFILE, e12);
                            }
                        }
                        return "";
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                }
                th2 = th3;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception e13) {
                        SLog.error(UmengText.CACHE.CACHEFILE, e13);
                    }
                }
                throw th2;
            }
            String string = sb2.toString();
            try {
                bufferedReader.close();
            } catch (Exception e14) {
                SLog.error(UmengText.CACHE.CACHEFILE, e14);
            }
            return string;
        } catch (Exception e15) {
            e10 = e15;
            bufferedReader = null;
        } catch (Throwable th4) {
            th2 = th4;
            bufferedReader = null;
        }
    }

    public static boolean save(JSONObject jSONObject, File file) throws Throwable {
        if (!file.exists()) {
            file.createNewFile();
            return a(jSONObject.toString(), file);
        }
        return a(readFile(file) + Constants.ACCEPT_TIME_SEPARATOR_SP + jSONObject, file);
    }
}
