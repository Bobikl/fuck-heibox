package com.umeng.socialize.net.utils;

import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.umeng.socialize.Config;
import com.umeng.socialize.utils.ContextUtil;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes4.dex */
public class SocializeNetUtils {
    private static final String TAG = "SocializeNetUtils";

    public static String convertStreamToString(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                try {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb2.append(line + "/n");
                    } catch (IOException e10) {
                        SLog.error(UmengText.NET.TOOL, e10);
                        inputStream.close();
                    }
                } catch (Throwable th2) {
                    try {
                        inputStream.close();
                    } catch (IOException e11) {
                        SLog.error(UmengText.NET.TOOL, e11);
                    }
                    throw th2;
                }
            } catch (IOException e12) {
                SLog.error(UmengText.NET.TOOL, e12);
            }
        }
        inputStream.close();
        return sb2.toString();
    }

    public static Bundle decodeUrl(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            for (String str2 : str.split("&")) {
                String[] strArrSplit = str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
                try {
                    bundle.putString(URLDecoder.decode(strArrSplit[0], "UTF-8"), URLDecoder.decode(strArrSplit[1], "UTF-8"));
                } catch (UnsupportedEncodingException e10) {
                    SLog.error(UmengText.NET.TOOL, e10);
                }
            }
        }
        return bundle;
    }

    /* JADX INFO: Removed unreachable split cross block B:108:0x0105 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.ByteArrayOutputStream] */
    public static byte[] getNetData(String str) throws Throwable {
        ?? byteArrayOutputStream;
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setConnectTimeout(Config.connectionTimeOut);
                httpURLConnection.setReadTimeout(Config.readSocketTimeOut);
                if (httpURLConnection.getResponseCode() == 301) {
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (!headerField.equals(str)) {
                        return getNetData(headerField);
                    }
                    SLog.E(UmengText.NET.NET_AGAIN_ERROR);
                    return null;
                }
                inputStream = httpURLConnection.getInputStream();
                try {
                    try {
                        SLog.I(UmengText.IMAGE.IMAGEURL + str);
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i10 = inputStream.read(bArr);
                            if (i10 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i10);
                            th = th;
                            inputStream2 = inputStream;
                            try {
                                try {
                                    if (inputStream2 != null) {
                                        try {
                                            inputStream2.close();
                                            byteArrayOutputStream = byteArrayOutputStream;
                                            if (byteArrayOutputStream != 0) {
                                                byteArrayOutputStream.close();
                                                byteArrayOutputStream = byteArrayOutputStream;
                                            }
                                        } catch (IOException e10) {
                                            SLog.error(UmengText.NET.TOOL, e10);
                                            byteArrayOutputStream = byteArrayOutputStream;
                                            if (byteArrayOutputStream != 0) {
                                                byteArrayOutputStream.close();
                                                byteArrayOutputStream = byteArrayOutputStream;
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
                                    if (byteArrayOutputStream != 0) {
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (IOException e11) {
                                            SLog.error(UmengText.NET.CLOSE, e11);
                                        }
                                    }
                                    throw th2;
                                }
                            } catch (IOException e12) {
                                SLog.error(UmengText.NET.CLOSE, e12);
                                byteArrayOutputStream = e12;
                            }
                            throw th;
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            try {
                                try {
                                    inputStream.close();
                                    byteArrayOutputStream.close();
                                } catch (IOException e13) {
                                    SLog.error(UmengText.NET.CLOSE, e13);
                                }
                            } catch (IOException e14) {
                                SLog.error(UmengText.NET.TOOL, e14);
                                byteArrayOutputStream.close();
                            }
                            return byteArray;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e15) {
                                SLog.error(UmengText.NET.CLOSE, e15);
                            }
                            throw th3;
                        }
                    } catch (Exception e16) {
                        e = e16;
                        SLog.error(UmengText.NET.IMAGEDOWN, e);
                        try {
                            try {
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                        if (byteArrayOutputStream != 0) {
                                            byteArrayOutputStream.close();
                                        }
                                    } catch (IOException e17) {
                                        SLog.error(UmengText.NET.TOOL, e17);
                                        if (byteArrayOutputStream != 0) {
                                            byteArrayOutputStream.close();
                                        }
                                        return null;
                                    }
                                }
                            } catch (IOException e18) {
                                byteArrayOutputStream = UmengText.NET.CLOSE;
                                SLog.error(byteArrayOutputStream, e18);
                            }
                            return null;
                        } catch (Throwable th4) {
                            if (byteArrayOutputStream != 0) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (IOException e19) {
                                    SLog.error(UmengText.NET.CLOSE, e19);
                                }
                            }
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    inputStream2 = inputStream;
                }
            } catch (Exception e20) {
                e = e20;
                inputStream = null;
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Exception e21) {
            e = e21;
            byteArrayOutputStream = 0;
            inputStream = null;
        } catch (Throwable th7) {
            th = th7;
            byteArrayOutputStream = 0;
        }
    }

    public static boolean isConSpeCharacters(String str) {
        return str.replaceAll("[一-龥]*[a-z]*[A-Z]*\\d*-*_*\\s*", "").length() != 0;
    }

    public static boolean isSelfAppkey(String str) {
        return str.equals("5126ff896c738f2bfa000438") && !ContextUtil.getPackageName().equals("com.umeng.soexample");
    }

    public static Bundle parseUri(String str) {
        try {
            return decodeUrl(new URI(str).getQuery());
        } catch (Exception e10) {
            SLog.error(UmengText.NET.TOOL, e10);
            return new Bundle();
        }
    }

    public static Bundle parseUrl(String str) {
        try {
            URL url = new URL(str);
            Bundle bundleDecodeUrl = decodeUrl(url.getQuery());
            bundleDecodeUrl.putAll(decodeUrl(url.getRef()));
            return bundleDecodeUrl;
        } catch (MalformedURLException e10) {
            SLog.error(UmengText.NET.TOOL, e10);
            return new Bundle();
        }
    }

    public static String request(String str) {
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            if (uRLConnectionOpenConnection == null) {
                return "";
            }
            uRLConnectionOpenConnection.connect();
            InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
            return inputStream == null ? "" : convertStreamToString(inputStream);
        } catch (Exception e10) {
            SLog.error(UmengText.NET.TOOL, e10);
            return "";
        }
    }

    public static boolean startWithHttp(String str) {
        return str.startsWith("http://") || str.startsWith("https://");
    }
}
