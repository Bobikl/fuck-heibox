package com.jd.jdcache.entity;

import android.webkit.WebResourceResponse;
import androidx.annotation.Keep;
import com.jd.jdcache.util.JDCacheLog;
import com.max.mediaselector.lib.config.h;
import com.max.xiaoheihe.bean.bbs.LinkDraftObj;
import com.max.xiaoheihe.bean.game.GameObj;
import dl.d;
import dl.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: JDCacheLocalResp.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nJDCacheLocalResp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDCacheLocalResp.kt\ncom/jd/jdcache/entity/JDCacheLocalRespKt\n+ 2 JDCacheLog.kt\ncom/jd/jdcache/util/JDCacheLogKt\n+ 3 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,219:1\n9#2,4:220\n9#2,4:226\n9#2,4:230\n32#3,2:224\n*S KotlinDebug\n*F\n+ 1 JDCacheLocalResp.kt\ncom/jd/jdcache/entity/JDCacheLocalRespKt\n*L\n157#1:220,4\n191#1:226,4\n215#1:230,4\n183#1:224,2\n*E\n"})
public final class JDCacheLocalRespKt {
    public static /* synthetic */ WebResourceResponse a(JDCacheLocalResp jDCacheLocalResp, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return createResponse(jDCacheLocalResp, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00de  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:66:0x0106  */
    /* JADX WARN: Code duplicated, block: B:67:0x010c  */
    /* JADX WARN: Code duplicated, block: B:69:0x010f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0117  */
    /* JADX WARN: Code duplicated, block: B:73:0x011f  */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x00c4, please report this as an issue */
    @Keep
    @e
    public static final WebResourceResponse createResponse(@d JDCacheLocalResp jDCacheLocalResp, @e String str) {
        String strL2;
        InputStream fileStream;
        JDCacheLog jDCacheLog;
        String filename;
        boolean z10;
        File file;
        f0.p(jDCacheLocalResp, "<this>");
        Map<String, String> map = jDCacheLocalResp.header;
        String str2 = map != null ? map.get("Content-Type") : null;
        boolean z11 = false;
        if (!(str2 == null || u.V1(str2))) {
            List listU4 = StringsKt__StringsKt.U4(str2, new String[]{";"}, false, 0, 6, null);
            if (!(listU4 == null || listU4.isEmpty()) && listU4.size() > 1) {
                str2 = (String) listU4.get(0);
                strL2 = StringsKt__StringsKt.W2((CharSequence) listU4.get(1), "charset=", false, 2, null) ? u.l2(StringsKt__StringsKt.F5((String) listU4.get(1)).toString(), "charset=", "", false, 4, null) : null;
            }
            fileStream = jDCacheLocalResp.getFileStream();
            if (fileStream == null) {
                if (jDCacheLocalResp.getFilename() != null) {
                    filename = null;
                } else if (str != null) {
                    filename = str + File.separator + jDCacheLocalResp.getFilename();
                    if (filename == null) {
                        filename = jDCacheLocalResp.getFilename();
                    }
                } else {
                    filename = jDCacheLocalResp.getFilename();
                }
                if (filename != null || u.V1(filename)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    file = new File(filename);
                    if (file.exists() && file.isFile()) {
                        z11 = true;
                    }
                }
                if (z11) {
                    fileStream = new FileInputStream(filename);
                } else {
                    fileStream = null;
                }
            }
            if (fileStream == null) {
                WebResourceResponse webResourceResponse = new WebResourceResponse(str2, strL2, fileStream);
                webResourceResponse.setResponseHeaders(jDCacheLocalResp.header);
                return webResourceResponse;
            }
            jDCacheLog = JDCacheLog.INSTANCE;
            if (jDCacheLog.getCanLog()) {
                jDCacheLog.e("JDCacheLocalResp", "Error in creating response from JDCacheLocalResp, filePath or inputStream cannot be null.");
            }
            return null;
        }
        String type = jDCacheLocalResp.getType();
        switch (type.hashCode()) {
            case -907685685:
                if (!type.equals(GameObj.FILTER_HEAD_SCRIPT)) {
                    str2 = "text/html";
                } else {
                    str2 = "text/txt";
                }
                break;
            case 3213227:
                type.equals(LinkDraftObj.DRAFT_TYPE_HTML);
                str2 = "text/html";
                break;
            case 100313435:
                if (!type.equals("image")) {
                    str2 = "text/html";
                } else {
                    str2 = h.f75165f;
                }
                break;
            case 158213710:
                if (!type.equals("stylesheet")) {
                    str2 = "text/html";
                } else {
                    str2 = "text/css";
                }
                break;
            default:
                str2 = "text/html";
                break;
        }
        fileStream = jDCacheLocalResp.getFileStream();
        if (fileStream == null) {
            if (jDCacheLocalResp.getFilename() != null) {
                filename = null;
            } else if (str != null) {
                filename = str + File.separator + jDCacheLocalResp.getFilename();
                if (filename == null) {
                    filename = jDCacheLocalResp.getFilename();
                }
            } else {
                filename = jDCacheLocalResp.getFilename();
            }
            if (filename != null) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (!z10) {
                file = new File(filename);
                if (file.exists()) {
                    z11 = true;
                }
            }
            if (z11) {
                fileStream = new FileInputStream(filename);
            } else {
                fileStream = null;
            }
        }
        if (fileStream == null) {
            WebResourceResponse webResourceResponse2 = new WebResourceResponse(str2, strL2, fileStream);
            webResourceResponse2.setResponseHeaders(jDCacheLocalResp.header);
            return webResourceResponse2;
        }
        jDCacheLog = JDCacheLog.INSTANCE;
        if (jDCacheLog.getCanLog()) {
            jDCacheLog.e("JDCacheLocalResp", "Error in creating response from JDCacheLocalResp, filePath or inputStream cannot be null.");
        }
        return null;
    }

    @Keep
    @e
    public static final List<JDCacheLocalResp> jsonArrayParse(@e String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() > 0) {
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JDCacheLocalResp jDCacheLocalRespJsonParse = jsonParse(jSONArray.get(i10).toString());
                    if (jDCacheLocalRespJsonParse != null) {
                        arrayList.add(jDCacheLocalRespJsonParse);
                    }
                }
            }
            return arrayList;
        } catch (JSONException e10) {
            JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
            if (jDCacheLog.getCanLog()) {
                jDCacheLog.e("JDCacheLocalResp", e10);
            }
            return null;
        }
    }

    @Keep
    @e
    public static final JDCacheLocalResp jsonParse(@e String str) {
        HashMap map;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("url");
            f0.o(string, "getString(...)");
            String string2 = jSONObject.getString("type");
            f0.o(string2, "getString(...)");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
            if (jSONObjectOptJSONObject != null) {
                HashMap map2 = new HashMap();
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                f0.o(itKeys, "keys(...)");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String string3 = jSONObjectOptJSONObject.getString(next);
                    f0.o(string3, "getString(...)");
                    map2.put(next, string3);
                }
                map = map2;
            } else {
                map = null;
            }
            return new JDCacheLocalResp(string, string2, map, jSONObject.getString("filename"), null, false, 48, null);
        } catch (JSONException e10) {
            JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
            if (jDCacheLog.getCanLog()) {
                jDCacheLog.e("JDCacheLocalResp", e10);
            }
            return null;
        }
    }
}
