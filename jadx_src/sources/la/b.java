package la;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.lzy.okgo.model.HttpHeaders;
import com.lzy.okgo.model.HttpParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.q;
import okhttp3.s;
import okhttp3.v;
import okhttp3.w;

/* JADX INFO: compiled from: HttpUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static a0.a a(a0.a aVar, HttpHeaders httpHeaders) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, httpHeaders}, null, changeQuickRedirect, true, bb.c.b.Va, new Class[]{a0.a.class, HttpHeaders.class}, a0.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a0.a) patchProxyResultProxy.result;
        }
        if (httpHeaders.f64759b.isEmpty()) {
            return aVar;
        }
        s.a aVar2 = new s.a();
        try {
            for (Map.Entry<String, String> entry : httpHeaders.f64759b.entrySet()) {
                aVar2.b(entry.getKey(), entry.getValue());
            }
        } catch (Exception e10) {
            d.i(e10);
        }
        aVar.o(aVar2.i());
        return aVar;
    }

    public static <T> T b(T t10, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{t10, str}, null, changeQuickRedirect, true, bb.c.b.f30562cb, new Class[]{Object.class, String.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static String c(String str, Map<String, List<String>> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, map}, null, changeQuickRedirect, true, bb.c.b.Ua, new Class[]{String.class, Map.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            if (str.indexOf(38) > 0 || str.indexOf(63) > 0) {
                sb2.append("&");
            } else {
                sb2.append("?");
            }
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    String strEncode = URLEncoder.encode(it.next(), "UTF-8");
                    sb2.append(entry.getKey());
                    sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb2.append(strEncode);
                    sb2.append("&");
                }
            }
            sb2.deleteCharAt(sb2.length() - 1);
            return sb2.toString();
        } catch (UnsupportedEncodingException e10) {
            d.i(e10);
            return str;
        }
    }

    public static boolean d(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.f30516ab, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        File file = new File(str);
        if (!file.exists()) {
            return true;
        }
        if (!file.isFile()) {
            return false;
        }
        boolean zDelete = file.delete();
        d.e("deleteFile:" + zDelete + " path:" + str);
        return zDelete;
    }

    public static b0 e(HttpParams httpParams, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{httpParams, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.b.Wa, new Class[]{HttpParams.class, Boolean.TYPE}, b0.class);
        if (patchProxyResultProxy.isSupported) {
            return (b0) patchProxyResultProxy.result;
        }
        if (httpParams.f64766c.isEmpty() && !z10) {
            q.a aVar = new q.a();
            for (String str : httpParams.f64765b.keySet()) {
                Iterator<String> it = httpParams.f64765b.get(str).iterator();
                while (it.hasNext()) {
                    aVar.b(str, it.next());
                }
            }
            return aVar.c();
        }
        w.a aVarG = new w.a().g(w.f132688j);
        if (!httpParams.f64765b.isEmpty()) {
            for (Map.Entry<String, List<String>> entry : httpParams.f64765b.entrySet()) {
                Iterator<String> it2 = entry.getValue().iterator();
                while (it2.hasNext()) {
                    aVarG.a(entry.getKey(), it2.next());
                }
            }
        }
        for (Map.Entry<String, List<HttpParams.FileWrapper>> entry2 : httpParams.f64766c.entrySet()) {
            for (HttpParams.FileWrapper fileWrapper : entry2.getValue()) {
                aVarG.b(entry2.getKey(), fileWrapper.f64768c, b0.create(fileWrapper.f64769d, fileWrapper.f64767b));
            }
        }
        return aVarG.f();
    }

    private static String f(c0 c0Var) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{c0Var}, null, changeQuickRedirect, true, bb.c.b.Ya, new Class[]{c0.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strC = c0Var.C("Content-Disposition");
        if (strC == null) {
            return null;
        }
        String strReplaceAll = strC.replaceAll("\"", "");
        int iIndexOf = strReplaceAll.indexOf("filename=");
        if (iIndexOf != -1) {
            return strReplaceAll.substring(iIndexOf + 9, strReplaceAll.length());
        }
        int iIndexOf2 = strReplaceAll.indexOf("filename*=");
        if (iIndexOf2 == -1) {
            return null;
        }
        String strSubstring = strReplaceAll.substring(iIndexOf2 + 10, strReplaceAll.length());
        return strSubstring.startsWith("UTF-8''") ? strSubstring.substring(7, strSubstring.length()) : strSubstring;
    }

    public static String g(c0 c0Var, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{c0Var, str}, null, changeQuickRedirect, true, bb.c.b.Xa, new Class[]{c0.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strF = f(c0Var);
        if (TextUtils.isEmpty(strF)) {
            strF = h(str);
        }
        if (TextUtils.isEmpty(strF)) {
            strF = "unknownfile_" + System.currentTimeMillis();
        }
        try {
            return URLDecoder.decode(strF, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            d.i(e10);
            return strF;
        }
    }

    private static String h(String str) {
        int iIndexOf;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.Za, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String[] strArrSplit = str.split("/");
        for (String str2 : strArrSplit) {
            if (str2.contains("?") && (iIndexOf = str2.indexOf("?")) != -1) {
                return str2.substring(0, iIndexOf);
            }
        }
        if (strArrSplit.length > 0) {
            return strArrSplit[strArrSplit.length - 1];
        }
        return null;
    }

    public static v i(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.f30539bb, new Class[]{String.class}, v.class);
        if (patchProxyResultProxy.isSupported) {
            return (v) patchProxyResultProxy.result;
        }
        String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(str.replace("#", ""));
        return contentTypeFor == null ? HttpParams.f64763f : v.j(contentTypeFor);
    }

    public static void j(Runnable runnable) {
        if (PatchProxy.proxy(new Object[]{runnable}, null, changeQuickRedirect, true, bb.c.b.f30586db, new Class[]{Runnable.class}, Void.TYPE).isSupported) {
            return;
        }
        com.lzy.okgo.b.p().o().post(runnable);
    }
}
