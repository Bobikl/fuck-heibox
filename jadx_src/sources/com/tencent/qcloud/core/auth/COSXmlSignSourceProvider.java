package com.tencent.qcloud.core.auth;

import android.text.TextUtils;
import com.alipay.zoloz.android.phone.mrpc.core.f;
import com.google.android.exoplayer2.source.rtsp.k0;
import com.tencent.cos.xml.crypto.Headers;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.http.HttpConfiguration;
import com.tencent.qcloud.core.http.HttpRequest;
import com.tencent.qcloud.core.util.QCloudHttpUtils;
import com.tencent.qcloud.core.util.QCloudStringUtils;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import kotlin.text.y;
import n5.a;

/* JADX INFO: loaded from: classes4.dex */
public class COSXmlSignSourceProvider implements QCloudSignSourceProvider {
    private Map<String, List<String>> headerPairs;
    private String signTime;
    private final List<String> needToSignHeaders = Arrays.asList(f.f39676y, f.f39673v, f.f39663p, f.f39659n, "content-md5", "content-type", "expect", f.f39675x, "host", "if-match", "if-modified-since", "if-none-match", "if-unmodified-since", "origin", k0.f48802q, "response-cache-control", "response-content-disposition", "response-content-encoding", "response-content-language", "response-content-type", "response-expires", f.f39657m, "versionid");
    private Set<String> headerKeysRequiredToSign = new HashSet();
    private Set<String> parametersRequiredToSign = new HashSet();
    private Set<String> headerKeysSigned = new HashSet();
    private Set<String> parametersSigned = new HashSet();

    private String headersStringForKeys(Map<String, List<String>> map, Set<String> set, Set<String> set2) {
        StringBuilder sb2 = new StringBuilder();
        LinkedList<String> linkedList = new LinkedList();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            linkedList.add(QCloudHttpUtils.urlEncodeString(it.next()).toLowerCase());
        }
        Collections.sort(linkedList, new Comparator<String>() { // from class: com.tencent.qcloud.core.auth.COSXmlSignSourceProvider.2
            @Override // java.util.Comparator
            public int compare(String str, String str2) {
                return str.compareTo(str2);
            }
        });
        Set<String> setKeySet = map.keySet();
        HashMap map2 = new HashMap();
        for (String str : setKeySet) {
            map2.put(str.toLowerCase(), str);
        }
        boolean z10 = true;
        for (String str2 : linkedList) {
            List<String> list = map.get(map2.get(str2));
            if (list != null) {
                for (String str3 : list) {
                    if (!z10) {
                        sb2.append(y.f128595d);
                    }
                    z10 = false;
                    set2.add(str2.toLowerCase());
                    sb2.append(str2.toLowerCase());
                    sb2.append(a.f132013h);
                    if (!TextUtils.isEmpty(str3)) {
                        sb2.append(QCloudHttpUtils.urlEncodeString(str3));
                    }
                }
            }
        }
        return sb2.toString();
    }

    private String queryStringForKeys(URL url, Set<String> set, Set<String> set2) {
        StringBuilder sb2 = new StringBuilder();
        LinkedList<String> linkedList = new LinkedList();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().toLowerCase());
        }
        Collections.sort(linkedList, new Comparator<String>() { // from class: com.tencent.qcloud.core.auth.COSXmlSignSourceProvider.1
            @Override // java.util.Comparator
            public int compare(String str, String str2) {
                return str.compareTo(str2);
            }
        });
        Map<String, List<String>> decodedQueryPair = QCloudHttpUtils.getDecodedQueryPair(url);
        Set<String> setKeySet = decodedQueryPair.keySet();
        HashMap map = new HashMap();
        for (String str : setKeySet) {
            map.put(str.toLowerCase(), str);
        }
        boolean z10 = true;
        for (String str2 : linkedList) {
            List<String> list = decodedQueryPair.get(map.get(str2));
            if (list != null) {
                for (String str3 : list) {
                    if (!z10) {
                        sb2.append(y.f128595d);
                    }
                    z10 = false;
                    set2.add(str2.toLowerCase());
                    sb2.append(str2.toLowerCase());
                    sb2.append(a.f132013h);
                    if (!TextUtils.isEmpty(str3)) {
                        sb2.append(QCloudHttpUtils.urlEncodeString(str3));
                    }
                }
            }
        }
        return sb2.toString();
    }

    private String sortAndJoinSemicolon(Set<String> set) {
        if (set == null) {
            return "";
        }
        TreeSet<String> treeSet = new TreeSet(set);
        StringBuilder sb2 = new StringBuilder();
        for (String str : treeSet) {
            if (!QCloudStringUtils.isEmpty(sb2.toString())) {
                sb2.append(";");
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    private Set<String> toLowerCase(Set<String> set) {
        if (set == null || set.size() <= 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if (str != null) {
                hashSet.add(str.toLowerCase());
            }
        }
        return hashSet;
    }

    String getRealHeaderList() {
        return sortAndJoinSemicolon(this.headerKeysSigned);
    }

    String getRealParameterList() {
        return sortAndJoinSemicolon(this.parametersSigned);
    }

    public void header(String str) {
        this.headerKeysRequiredToSign.add(str);
    }

    public void headers(Set<String> set) {
        if (set != null) {
            this.headerKeysRequiredToSign.addAll(set);
        }
    }

    @Override // com.tencent.qcloud.core.auth.QCloudSignSourceProvider
    public <T> void onSignRequestSuccess(HttpRequest<T> httpRequest, QCloudCredentials qCloudCredentials, String str) {
    }

    public void parameter(String str) {
        this.parametersRequiredToSign.add(str);
    }

    public void parameters(Set<String> set) {
        if (set != null) {
            this.parametersRequiredToSign.addAll(set);
        }
    }

    public void setHeaderPairsForSign(Map<String, List<String>> map) {
        this.headerPairs = map;
    }

    void setSignTime(String str) {
        this.signTime = str;
    }

    @Override // com.tencent.qcloud.core.auth.QCloudSignSourceProvider
    public <T> String source(HttpRequest<T> httpRequest) throws QCloudClientException {
        String strContentType;
        if (httpRequest == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        hashSet.add("Content-Type");
        hashSet.add("Content-Length");
        for (String str : httpRequest.headers().keySet()) {
            String lowerCase = str.toLowerCase();
            if (this.needToSignHeaders.contains(lowerCase) || lowerCase.startsWith(Headers.COS_PREFIX)) {
                hashSet.add(str);
            }
        }
        if (httpRequest.getNoSignHeaders() != null) {
            Iterator<String> it = httpRequest.getNoSignHeaders().iterator();
            while (it.hasNext()) {
                hashSet.remove(it.next());
            }
        }
        if (this.headerKeysRequiredToSign.size() < 1) {
            this.headerKeysRequiredToSign.addAll(hashSet);
        }
        if (this.parametersRequiredToSign.size() < 1) {
            Map<String, List<String>> queryPair = QCloudHttpUtils.getQueryPair(httpRequest.url());
            Iterator<String> it2 = httpRequest.getNoSignHeaders().iterator();
            while (it2.hasNext()) {
                queryPair.remove(QCloudHttpUtils.urlDecodeString(it2.next()));
            }
            this.parametersRequiredToSign.addAll(queryPair.keySet());
        }
        if (this.headerKeysRequiredToSign.size() > 0) {
            Set<String> lowerCase2 = toLowerCase(this.headerKeysRequiredToSign);
            if (lowerCase2 != null && lowerCase2.contains("Content-Type".toLowerCase()) && httpRequest.getRequestBody() != null && !httpRequest.headers().containsKey("Content-Type") && (strContentType = httpRequest.contentType()) != null) {
                httpRequest.addHeader("Content-Type", strContentType);
            }
            if (lowerCase2 != null && lowerCase2.contains("Content-Length".toLowerCase()) && httpRequest.getRequestBody() != null) {
                try {
                    long jContentLength = httpRequest.contentLength();
                    if (jContentLength != -1) {
                        httpRequest.addHeader("Content-Length", Long.toString(jContentLength));
                        httpRequest.removeHeader("Transfer-Encoding");
                    } else {
                        httpRequest.addHeader("Transfer-Encoding", "chunked");
                        httpRequest.removeHeader("Content-Length");
                    }
                } catch (IOException e10) {
                    throw new QCloudClientException("read content length fails", e10);
                }
            }
            if (lowerCase2 != null && lowerCase2.contains("Date".toLowerCase())) {
                httpRequest.addHeader("Date", HttpConfiguration.getGMTDate(new Date()));
            }
        }
        StringBuilder sb2 = new StringBuilder(httpRequest.method().toLowerCase());
        sb2.append("\n");
        sb2.append(QCloudHttpUtils.urlDecodeString(httpRequest.url().getPath()));
        sb2.append("\n");
        sb2.append(queryStringForKeys(httpRequest.url(), this.parametersRequiredToSign, this.parametersSigned));
        sb2.append("\n");
        Map<String, List<String>> mapHeaders = this.headerPairs;
        if (mapHeaders == null) {
            mapHeaders = httpRequest.headers();
        }
        this.headerPairs = mapHeaders;
        sb2.append(mapHeaders != null ? headersStringForKeys(mapHeaders, this.headerKeysRequiredToSign, this.headerKeysSigned) : "");
        sb2.append("\n");
        return AuthConstants.SHA1 + "\n" + this.signTime + "\n" + Utils.encodeHexString(Utils.sha1(sb2.toString())) + "\n";
    }
}
