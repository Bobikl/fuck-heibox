package com.max.xiaoheihe.okflutter.executors;

import android.content.Context;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.max.xiaoheihe.okflutter.pigeon.IHeyboxProtocol;
import com.tekartik.sqflite.b;
import com.umeng.analytics.pro.d;
import kotlin.Metadata;

/* JADX INFO: compiled from: ProtocolExecutor.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/max/xiaoheihe/okflutter/executors/ProtocolExecutor;", "", b.f98590i, "Lcom/max/xiaoheihe/okflutter/pigeon/IHeyboxProtocol$ProtocolResponse;", d.R, "Landroid/content/Context;", SwitchDetailActivity.P, "", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface ProtocolExecutor {
    @dl.d
    IHeyboxProtocol.ProtocolResponse execute(@dl.d Context context, @dl.d String protocol);
}
