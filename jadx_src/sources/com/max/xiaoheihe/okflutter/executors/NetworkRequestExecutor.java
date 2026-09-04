package com.max.xiaoheihe.okflutter.executors;

import android.content.Context;
import com.max.xiaoheihe.okflutter.pigeon.IHybridNetwork;
import com.tekartik.sqflite.b;
import com.umeng.analytics.pro.d;
import dl.e;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: NetworkRequestExecutor.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0084\u0001\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H&¨\u0006\u0015"}, d2 = {"Lcom/max/xiaoheihe/okflutter/executors/NetworkRequestExecutor;", "", "Landroid/content/Context;", d.R, "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridNetwork$RequestType;", "type", "", "url", "", "params", "forms", "headers", "", "showToast", "useHeyboxHost", "needEncrypt", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridNetwork$Result;", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridNetwork$HybridResponse;", "result", "Lkotlin/b2;", b.f98590i, "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1})
public interface NetworkRequestExecutor {
    void execute(@dl.d Context context, @dl.d IHybridNetwork.RequestType requestType, @dl.d String str, @dl.d Map<String, Object> map, @dl.d Map<String, Object> map2, @dl.d Map<String, Object> map3, boolean z10, boolean z11, boolean z12, @e IHybridNetwork.Result<IHybridNetwork.HybridResponse> result);
}
