package com.lzy.okgo.request.base;

import com.lzy.okgo.model.HttpParams;
import java.io.File;
import java.util.List;
import okhttp3.b0;
import okhttp3.v;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: HasBody.java */
/* JADX INFO: loaded from: classes6.dex */
public interface a<R> {
    R a(b0 b0Var);

    R b(String str, File file);

    R c(boolean z10);

    R d(String str, File file, String str2);

    R e(JSONArray jSONArray);

    R f(JSONObject jSONObject);

    R g(String str, List<File> list);

    R h(String str, List<HttpParams.FileWrapper> list);

    R i(String str);

    R j(byte[] bArr);

    R k(byte[] bArr, v vVar);

    R l(String str, File file, String str2, v vVar);

    R m(File file);

    R n(boolean z10);

    R o(String str, v vVar);

    R p(File file, v vVar);

    R q(String str);
}
