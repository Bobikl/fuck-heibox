package com.efs.sdk.base.http;

import androidx.annotation.n0;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface IHttpUtil {
    @n0
    HttpResponse get(String str, Map<String, String> map);

    @n0
    HttpResponse post(String str, Map<String, String> map, File file);

    @n0
    HttpResponse post(String str, Map<String, String> map, byte[] bArr);

    @n0
    HttpResponse postAsFile(String str, Map<String, String> map, byte[] bArr);
}
