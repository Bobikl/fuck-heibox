package com.tencent.cos.xml.utils;

import android.text.TextUtils;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.qcloud.core.util.IOUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes4.dex */
public class URLEncodeUtils {
    public static String cosPathEncode(String str) throws CosXmlClientException {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            String[] strArrSplit = str.split("/", -1);
            int length = strArrSplit.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (i10 == 0 && "".equals(strArrSplit[i10])) {
                    sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
                } else {
                    if (length > 1 && i10 == length - 1 && "".equals(strArrSplit[i10])) {
                        break;
                    }
                    if (!"".equals(strArrSplit[i10])) {
                        String[] strArrSplit2 = strArrSplit[i10].split(" ", -1);
                        int length2 = strArrSplit2.length;
                        for (int i11 = 0; i11 < length2; i11++) {
                            if (i11 == 0 && "".equals(strArrSplit2[i11])) {
                                sb2.append("%20");
                            } else {
                                if (length2 > 1 && i11 == length2 - 1 && "".equals(strArrSplit2[i11])) {
                                    break;
                                }
                                sb2.append(URLEncoder.encode(strArrSplit2[i11], "utf-8"));
                                if (i11 != length2 - 1) {
                                    sb2.append("%20");
                                }
                            }
                        }
                    }
                    if (i10 != length - 1) {
                        sb2.append("/");
                    }
                }
            }
            return sb2.toString();
        } catch (UnsupportedEncodingException e10) {
            throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), e10);
        }
    }
}
