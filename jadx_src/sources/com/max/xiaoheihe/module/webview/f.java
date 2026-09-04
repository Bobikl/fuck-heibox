package com.max.xiaoheihe.module.webview;

import android.webkit.WebResourceResponse;
import java.io.ByteArrayInputStream;

/* JADX INFO: compiled from: RedirectRes.java */
/* JADX INFO: loaded from: classes12.dex */
public class f extends WebResourceResponse {
    public f(String str) {
        super("text/html", "utf-8", new ByteArrayInputStream(("<script>location.href = '" + str + "'</script>").getBytes()));
    }
}
