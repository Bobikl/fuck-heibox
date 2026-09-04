package com.max.xiaoheihe.bean;

import android.text.TextUtils;
import androidx.annotation.p0;
import bb.c;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ob.b;

/* JADX INFO: loaded from: classes3.dex */
public class WebProtocolObj implements Serializable {
    public static final String HTTP_METHOD_GET = "GET";
    public static final String HTTP_METHOD_POST = "POST";
    public static final String HTTP_METHOD_RAW = "RAW";
    public static final String HTTP_METHOD_RAW_GET = "RAW_GET";
    public static final String HTTP_METHOD_RAW_POST = "RAW_POST";
    public static final int ORIENTATION_LAND_LEFT = 1;
    public static final int ORIENTATION_LAND_RIGHT = 2;
    public static final int ORIENTATION_PORTRAIT = 0;
    public static final String PROTOCOL_TYPE_OPEN_ADDRESS_LIST = "openAddressList";
    public static final String PROTOCOL_TYPE_OPEN_PURCHASE_VIEW = "openPurchaseView";
    public static final String PROTOCOL_TYPE_SET_TENCENT_CAPTCHA_SIZE = "setTencentCaptchaSize";
    public static final String PROTOCOL_TYPE_STEAM_CALLBACK = "SteamCallback";
    public static final String PROTOCOL_TYPE_TENCENT_CAPTCHA_CALLBACK = "tencentCaptchaCallback";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 3746684261938771050L;
    private boolean full_screen;
    private HashMap<String, String> headers;
    private Map<String, String> kvPair;
    private boolean network;
    private int orientation;
    private String protocol_type;
    private HashMap<String, String> query;
    private StatusBarCfgObj status_bar;
    private WebCfgObj webview;

    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    public Map<String, String> getKvPair() {
        return this.kvPair;
    }

    public String getMini_program_id() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.TN, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : getParam("mini_program_id");
    }

    public int getOrientation() {
        return this.orientation;
    }

    public String getParam(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.m.SN, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strValueOf = valueOf(str);
        if (!TextUtils.isEmpty(strValueOf)) {
            return strValueOf;
        }
        HashMap<String, String> params = getParams();
        return params != null ? params.get(str) : "";
    }

    public HashMap<String, String> getParams() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.VN, new Class[0], HashMap.class);
        if (patchProxyResultProxy.isSupported) {
            return (HashMap) patchProxyResultProxy.result;
        }
        try {
            if (com.max.hbcommon.utils.c.u(valueOf("params"))) {
                return null;
            }
            return (HashMap) new Gson().fromJson(valueOf("params"), new TypeToken<HashMap<String, String>>() { // from class: com.max.xiaoheihe.bean.WebProtocolObj.1
            }.getType());
        } catch (Exception unused) {
            return null;
        }
    }

    public String getProtocol_type() {
        return this.protocol_type;
    }

    public HashMap<String, String> getQuery() {
        return this.query;
    }

    public StatusBarCfgObj getStatus_bar() {
        return this.status_bar;
    }

    public WebCfgObj getWebview() {
        return this.webview;
    }

    public boolean isFull_screen() {
        return this.full_screen;
    }

    public boolean isMiniProgram() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.UN, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return "1".equals(valueOf(b.f132259k)) || (getParams() != null && "1".equals(getParams().get(b.f132259k)));
    }

    public boolean isNetwork() {
        return this.network;
    }

    @p0
    public <T> List<T> listOf(String str, Class<T> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, cls}, this, changeQuickRedirect, false, c.m.RN, new Class[]{String.class, Class.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = null;
        if (this.kvPair != null) {
            Gson gsonB = com.max.hbcommon.network.b.g().b();
            String str2 = this.kvPair.get(str);
            if (str2 != null && str2.startsWith(Constants.ARRAY_TYPE) && str2.endsWith("]")) {
                arrayList = new ArrayList();
                JsonReader jsonReader = new JsonReader(new StringReader(str2));
                jsonReader.setLenient(true);
                Iterator<JsonElement> it = new JsonParser().parse(jsonReader).getAsJsonArray().iterator();
                while (it.hasNext()) {
                    arrayList.add(gsonB.fromJson(it.next(), (Class) cls));
                }
            }
        }
        return arrayList;
    }

    @p0
    public <T> T objectOf(String str, Class<T> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, cls}, this, changeQuickRedirect, false, c.m.QN, new Class[]{String.class, Class.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        try {
            if (this.kvPair != null) {
                return (T) com.max.hbcommon.network.b.g().b().fromJson(this.kvPair.get(str), (Class) cls);
            }
            return null;
        } catch (Throwable th2) {
            g.G("WebProtocolObj objectOf error: " + th2.getMessage());
            return null;
        }
    }

    public void setFull_screen(boolean z10) {
        this.full_screen = z10;
    }

    public void setHeaders(HashMap<String, String> map) {
        this.headers = map;
    }

    public void setKvPair(Map<String, String> map) {
        this.kvPair = map;
    }

    public void setNetwork(boolean z10) {
        this.network = z10;
    }

    public void setOrientation(int i10) {
        this.orientation = i10;
    }

    public void setProtocol_type(String str) {
        this.protocol_type = str;
    }

    public void setQuery(HashMap<String, String> map) {
        this.query = map;
    }

    public void setStatus_bar(StatusBarCfgObj statusBarCfgObj) {
        this.status_bar = statusBarCfgObj;
    }

    public void setValue(String str, String str2) {
        Map<String, String> map;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, c.m.PN, new Class[]{String.class, String.class}, Void.TYPE).isSupported || (map = this.kvPair) == null) {
            return;
        }
        map.put(str, str2);
    }

    public void setWebview(WebCfgObj webCfgObj) {
        this.webview = webCfgObj;
    }

    @p0
    public String valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.m.ON, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Map<String, String> map = this.kvPair;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
