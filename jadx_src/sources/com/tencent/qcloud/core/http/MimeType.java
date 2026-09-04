package com.tencent.qcloud.core.http;

import com.max.mediaselector.lib.config.f;
import com.tencent.cos.xml.common.COSRequestHeaderKey;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class MimeType {
    private static final Map<String, String> mimeTypes;

    static {
        HashMap map = new HashMap();
        mimeTypes = map;
        map.put("bin", COSRequestHeaderKey.APPLICATION_OCTET_STREAM);
        map.put("bmp", "image/bmp");
        map.put("cgm", "image/cgm");
        map.put("djv", "image/vnd.djvu");
        map.put("djvu", "image/vnd.djvu");
        map.put("gif", "image/gif");
        map.put("ico", "image/x-icon");
        map.put("ief", "image/ief");
        map.put("jp2", "image/jp2");
        map.put("jpe", "image/jpeg");
        map.put("jpeg", "image/jpeg");
        map.put("jpg", "image/jpeg");
        map.put("mac", "image/x-macpaint");
        map.put("pbm", "image/x-portable-bitmap");
        map.put("pct", "image/pict");
        map.put("pgm", "image/x-portable-graymap");
        map.put("pic", "image/pict");
        map.put("pict", "image/pict");
        map.put("png", f.D);
        map.put("pnm", "image/x-portable-anymap");
        map.put("pnt", "image/x-macpaint");
        map.put("pntg", "image/x-macpaint");
        map.put("ppm", "image/x-portable-pixmap");
        map.put("qti", "image/x-quicktime");
        map.put("qtif", "image/x-quicktime");
        map.put("ras", "image/x-cmu-raster");
        map.put("rgb", "image/x-rgb");
        map.put("svg", "image/svg+xml");
        map.put("tif", "image/tiff");
        map.put("tiff", "image/tiff");
        map.put("wbmp", "image/vnd.wap.wbmp");
        map.put("xbm", "image/x-xbitmap");
        map.put("xpm", "image/x-xpixmap");
        map.put("xwd", "image/x-xwindowdump");
    }

    public static String getTypeByFileName(String str) {
        if (str == null) {
            return null;
        }
        String strSubstring = str.lastIndexOf(".") != -1 ? str.substring(str.lastIndexOf(".") + 1, str.length()) : "";
        Map<String, String> map = mimeTypes;
        String str2 = map.get(strSubstring.toLowerCase());
        return str2 == null ? map.get("bin") : str2;
    }
}
