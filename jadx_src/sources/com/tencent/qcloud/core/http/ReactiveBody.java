package com.tencent.qcloud.core.http;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public interface ReactiveBody {
    <T> void end(HttpResult<T> httpResult) throws IOException;

    void prepare() throws IOException;
}
