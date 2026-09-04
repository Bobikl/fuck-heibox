package com.max.xiaoheihe.okflutter.executors;

import android.content.Context;
import com.max.xiaoheihe.okflutter.pigeon.IHybridMessage;
import com.umeng.analytics.pro.d;
import dl.e;
import kotlin.Metadata;

/* JADX INFO: compiled from: MessageHandler.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/max/xiaoheihe/okflutter/executors/MessageHandler;", "", "Landroid/content/Context;", d.R, "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$HybridMessageInfo;", "messageInfo", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$NullableResult;", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$HybridMessageResponse;", "result", "Lkotlin/b2;", "handle", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1})
public interface MessageHandler {
    void handle(@dl.d Context context, @e IHybridMessage.HybridMessageInfo hybridMessageInfo, @e IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse> nullableResult);
}
