package com.umeng.socialize.net.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.cos.xml.common.COSRequestHeaderKey;
import com.umeng.socialize.Config;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class UClient {
    private static final String END = "\r\n";
    private static final String TAG = "UClient";

    public static class ResponseObj {
        public int httpResponseCode;
        public JSONObject jsonObject;

        protected ResponseObj() {
        }
    }

    private void addBodyParams(URequest uRequest, OutputStream outputStream, String str) throws IOException {
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        Map<String, Object> bodyPair = uRequest.getBodyPair();
        for (String str2 : bodyPair.keySet()) {
            if (bodyPair.get(str2) != null) {
                addFormField(sb2, str2, bodyPair.get(str2).toString(), str);
            }
        }
        if (sb2.length() > 0) {
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.write(sb2.toString().getBytes());
            outputStream = dataOutputStream;
            z10 = true;
        } else {
            z10 = false;
        }
        Map<String, URequest.FilePair> filePair = uRequest.getFilePair();
        if (filePair != null && filePair.size() > 0) {
            Iterator<String> it = filePair.keySet().iterator();
            while (it.hasNext()) {
                URequest.FilePair filePair2 = filePair.get(it.next());
                byte[] bArr = filePair2.mBinaryData;
                if (bArr != null && bArr.length >= 1) {
                    addFilePart(filePair2.mFileName, bArr, str, outputStream);
                    z10 = true;
                }
            }
        }
        if (z10) {
            finishWrite(outputStream, str);
        }
    }

    private void addFilePart(String str, byte[] bArr, String str2, OutputStream outputStream) throws IOException {
        outputStream.write(("--" + str2 + "\r\nContent-Disposition: form-data; name=\"pic\"; filename=\"" + str + "\"\r\nContent-Type: " + COSRequestHeaderKey.APPLICATION_OCTET_STREAM + "\r\nContent-Transfer-Encoding: binary\r\n\r\n").getBytes());
        outputStream.write(bArr);
        outputStream.write("\r\n".getBytes());
    }

    private void addFormField(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append("--");
        sb2.append(str3);
        sb2.append("\r\n");
        sb2.append("Content-Disposition: form-data; name=\"");
        sb2.append(str);
        sb2.append("\"");
        sb2.append("\r\n");
        sb2.append("Content-Type: text/plain; charset=");
        sb2.append("UTF-8");
        sb2.append("\r\n");
        sb2.append("\r\n");
        sb2.append(str2);
        sb2.append("\r\n");
    }

    private JSONObject decryptData(URequest uRequest, String str) {
        try {
            return new JSONObject(uRequest.getDecryptString(str));
        } catch (Throwable th2) {
            SLog.error(UmengText.NET.CREATE, th2);
            return null;
        }
    }

    private void finishWrite(OutputStream outputStream, String str) throws IOException {
        outputStream.write("\r\n".getBytes());
        outputStream.write(("--" + str + "--").getBytes());
        outputStream.write("\r\n".getBytes());
        outputStream.flush();
        outputStream.close();
    }

    private ResponseObj httpGetRequest(URequest uRequest) {
        HttpURLConnection httpURLConnectionOpenUrlConnection;
        InputStream inputStream;
        try {
            httpURLConnectionOpenUrlConnection = openUrlConnection(uRequest);
            if (httpURLConnectionOpenUrlConnection == null) {
                closeQuietly(null);
                if (httpURLConnectionOpenUrlConnection != null) {
                    httpURLConnectionOpenUrlConnection.disconnect();
                }
                return null;
            }
            try {
                int responseCode = httpURLConnectionOpenUrlConnection.getResponseCode();
                ResponseObj responseObj = new ResponseObj();
                responseObj.httpResponseCode = responseCode;
                if (responseCode != 200) {
                    closeQuietly(null);
                    httpURLConnectionOpenUrlConnection.disconnect();
                    return null;
                }
                inputStream = httpURLConnectionOpenUrlConnection.getInputStream();
                try {
                    responseObj.jsonObject = parseResult(uRequest, httpURLConnectionOpenUrlConnection.getRequestMethod(), httpURLConnectionOpenUrlConnection.getContentEncoding(), inputStream);
                    SLog.debug(UmengText.NET.JSONRESULT);
                    closeQuietly(inputStream);
                    httpURLConnectionOpenUrlConnection.disconnect();
                    return responseObj;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
            }
            try {
                SLog.error(UmengText.NET.PARSEERROR, th);
                return null;
            } finally {
                closeQuietly(inputStream);
                if (httpURLConnectionOpenUrlConnection != null) {
                    httpURLConnectionOpenUrlConnection.disconnect();
                }
            }
        } catch (Throwable th4) {
            th = th4;
            httpURLConnectionOpenUrlConnection = null;
            inputStream = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Closeable, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.umeng.socialize.net.utils.UClient] */
    private ResponseObj httpPostRequest(URequest uRequest) {
        InputStream inputStream;
        HttpURLConnection httpURLConnectionOpenUrlConnection;
        String string = uRequest.toJson() == null ? "" : uRequest.toJson().toString();
        ?? string2 = UUID.randomUUID().toString();
        try {
            httpURLConnectionOpenUrlConnection = openUrlConnection(uRequest);
            if (httpURLConnectionOpenUrlConnection == null) {
                closeQuietly(null);
                closeQuietly(null);
                if (httpURLConnectionOpenUrlConnection != null) {
                    httpURLConnectionOpenUrlConnection.disconnect();
                }
                return null;
            }
            try {
                Map<String, Object> bodyPair = uRequest.getBodyPair();
                try {
                    if (uRequest.mMimeType != null) {
                        String str = (String) bodyPair.get("data");
                        httpURLConnectionOpenUrlConnection.setRequestProperty("Content-Type", uRequest.mMimeType.toString());
                        OutputStream outputStream = httpURLConnectionOpenUrlConnection.getOutputStream();
                        string2 = outputStream;
                        if (!TextUtils.isEmpty(str)) {
                            outputStream.write(str.getBytes());
                            string2 = outputStream;
                        }
                    } else if (uRequest.postStyle == URequest.PostStyle.APPLICATION) {
                        httpURLConnectionOpenUrlConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                        Uri.Builder builder = new Uri.Builder();
                        for (String str2 : bodyPair.keySet()) {
                            try {
                                builder.appendQueryParameter(str2, bodyPair.get(str2).toString());
                            } catch (Throwable th2) {
                                SLog.error(th2);
                            }
                        }
                        String encodedQuery = builder.build().getEncodedQuery();
                        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnectionOpenUrlConnection.getOutputStream());
                        string2 = dataOutputStream;
                        if (!TextUtils.isEmpty(encodedQuery)) {
                            dataOutputStream.write(encodedQuery.getBytes());
                            string2 = dataOutputStream;
                        }
                    } else if ((bodyPair == null || bodyPair.size() <= 0) && uRequest.postStyle != URequest.PostStyle.MULTIPART) {
                        httpURLConnectionOpenUrlConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                        Uri.Builder builder2 = new Uri.Builder();
                        builder2.appendQueryParameter("content", string);
                        String encodedQuery2 = builder2.build().getEncodedQuery();
                        DataOutputStream dataOutputStream2 = new DataOutputStream(httpURLConnectionOpenUrlConnection.getOutputStream());
                        string2 = dataOutputStream2;
                        if (!TextUtils.isEmpty(encodedQuery2)) {
                            dataOutputStream2.write(encodedQuery2.getBytes());
                            string2 = dataOutputStream2;
                        }
                    } else {
                        httpURLConnectionOpenUrlConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + string2);
                        OutputStream outputStream2 = httpURLConnectionOpenUrlConnection.getOutputStream();
                        try {
                            addBodyParams(uRequest, outputStream2, string2);
                            string2 = outputStream2;
                        } catch (Throwable th3) {
                            th = th3;
                            string2 = outputStream2;
                            inputStream = null;
                        }
                    }
                    string2.flush();
                    int responseCode = httpURLConnectionOpenUrlConnection.getResponseCode();
                    ResponseObj responseObj = new ResponseObj();
                    responseObj.httpResponseCode = responseCode;
                    if (responseCode != 200) {
                        closeQuietly(null);
                        closeQuietly(string2);
                        httpURLConnectionOpenUrlConnection.disconnect();
                        return null;
                    }
                    inputStream = httpURLConnectionOpenUrlConnection.getInputStream();
                    try {
                        String contentEncoding = httpURLConnectionOpenUrlConnection.getContentEncoding();
                        String strConvertStreamToString = convertStreamToString(wrapStream(contentEncoding, inputStream));
                        if (!strConvertStreamToString.startsWith("success") && !strConvertStreamToString.startsWith("fail")) {
                            JSONObject result = parseResult(uRequest, httpURLConnectionOpenUrlConnection.getRequestMethod(), contentEncoding, inputStream);
                            SLog.debug(UmengText.NET.POSTJSON + result);
                            responseObj.jsonObject = result;
                            closeQuietly(inputStream);
                            closeQuietly(string2);
                            httpURLConnectionOpenUrlConnection.disconnect();
                            return responseObj;
                        }
                        responseObj.jsonObject = new JSONObject("{\"result\":\"" + strConvertStreamToString + "\"}");
                        closeQuietly(inputStream);
                        closeQuietly(string2);
                        httpURLConnectionOpenUrlConnection.disconnect();
                        return responseObj;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
                inputStream = null;
            } catch (Throwable th6) {
                th = th6;
                inputStream = null;
                string2 = 0;
            }
            try {
                SLog.error(UmengText.NET.PARSEERROR, th);
                return null;
            } finally {
                closeQuietly(inputStream);
                closeQuietly(string2);
                if (httpURLConnectionOpenUrlConnection != null) {
                    httpURLConnectionOpenUrlConnection.disconnect();
                }
            }
        } catch (Throwable th7) {
            th = th7;
            inputStream = null;
            string2 = 0;
            httpURLConnectionOpenUrlConnection = null;
        }
    }

    private HttpURLConnection openUrlConnection(URequest uRequest) throws IOException {
        String strTrim = uRequest.getHttpMethod().trim();
        String getUrl = URequest.GET.equals(strTrim) ? uRequest.toGetUrl() : URequest.POST.equals(strTrim) ? uRequest.mBaseUrl : null;
        if (TextUtils.isEmpty(getUrl)) {
            return null;
        }
        URL url = new URL(getUrl);
        HttpURLConnection httpURLConnection = "https".equals(url.getProtocol()) ? (HttpsURLConnection) url.openConnection() : (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(Config.connectionTimeOut);
        httpURLConnection.setReadTimeout(Config.readSocketTimeOut);
        httpURLConnection.setRequestMethod(strTrim);
        if (URequest.GET.equals(strTrim)) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            Map<String, String> map = uRequest.mHeaders;
            if (map != null && map.size() > 0) {
                for (String str : uRequest.mHeaders.keySet()) {
                    httpURLConnection.setRequestProperty(str, uRequest.mHeaders.get(str));
                }
            }
        } else if (URequest.POST.equals(strTrim)) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
        }
        return httpURLConnection;
    }

    private void verifyMethod(String str) {
        if (TextUtils.isEmpty(str) || URequest.GET.equals(str.trim()) == URequest.POST.equals(str.trim())) {
            throw new RuntimeException(UmengText.netMethodError(str));
        }
    }

    protected void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th2) {
                SLog.error(UmengText.NET.CLOSE, th2);
            }
        }
    }

    protected String convertStreamToString(InputStream inputStream) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader, 512);
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    closeQuietly(inputStreamReader);
                    closeQuietly(bufferedReader);
                    return sb2.toString();
                }
                sb2.append(line + "\n");
            } catch (Throwable th2) {
                try {
                    SLog.error(UmengText.NET.TOOL, th2);
                    return null;
                } finally {
                    closeQuietly(inputStreamReader);
                    closeQuietly(bufferedReader);
                }
            }
        }
    }

    protected <T extends UResponse> T createResponse(ResponseObj responseObj, Class<T> cls) {
        if (responseObj == null) {
            return null;
        }
        try {
            return cls.getConstructor(Integer.class, JSONObject.class).newInstance(Integer.valueOf(responseObj.httpResponseCode), responseObj.jsonObject);
        } catch (Throwable th2) {
            SLog.error(UmengText.NET.CREATE, th2);
            return null;
        }
    }

    public <T extends UResponse> T execute(URequest uRequest, Class<T> cls) {
        ResponseObj responseObjHttpPostRequest;
        uRequest.onPrepareRequest();
        String strTrim = uRequest.getHttpMethod().trim();
        verifyMethod(strTrim);
        if (URequest.GET.equals(strTrim)) {
            responseObjHttpPostRequest = httpGetRequest(uRequest);
        } else {
            responseObjHttpPostRequest = URequest.POST.equals(strTrim) ? httpPostRequest(uRequest) : null;
        }
        return (T) createResponse(responseObjHttpPostRequest, cls);
    }

    protected JSONObject parseResult(URequest uRequest, String str, String str2, InputStream inputStream) {
        InputStream inputStreamWrapStream;
        try {
            inputStreamWrapStream = wrapStream(str2, inputStream);
            try {
                String strConvertStreamToString = convertStreamToString(inputStreamWrapStream);
                if ("POST".equals(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(strConvertStreamToString);
                        closeQuietly(inputStreamWrapStream);
                        return jSONObject;
                    } catch (Throwable th2) {
                        SLog.error(UmengText.NET.PARSEERROR, th2);
                        JSONObject jSONObjectDecryptData = decryptData(uRequest, strConvertStreamToString);
                        closeQuietly(inputStreamWrapStream);
                        return jSONObjectDecryptData;
                    }
                }
                if ("GET".equals(str)) {
                    if (TextUtils.isEmpty(strConvertStreamToString)) {
                        closeQuietly(inputStreamWrapStream);
                        return null;
                    }
                    JSONObject jSONObjectDecryptData2 = decryptData(uRequest, strConvertStreamToString);
                    closeQuietly(inputStreamWrapStream);
                    return jSONObjectDecryptData2;
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    SLog.error(UmengText.NET.PARSEERROR, th);
                } finally {
                    closeQuietly(inputStreamWrapStream);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            inputStreamWrapStream = null;
        }
        return null;
    }

    protected InputStream wrapStream(String str, InputStream inputStream) throws IOException {
        if (str == null || "identity".equalsIgnoreCase(str)) {
            return inputStream;
        }
        if ("gzip".equalsIgnoreCase(str)) {
            return new GZIPInputStream(inputStream);
        }
        if ("deflate".equalsIgnoreCase(str)) {
            return new InflaterInputStream(inputStream, new Inflater(false), 512);
        }
        throw new RuntimeException("unsupported content-encoding: " + str);
    }
}
