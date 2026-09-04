package com.max.xiaoheihe.okflutter;

import androidx.annotation.n0;
import com.meituan.robust.ChangeQuickRedirect;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;

/* JADX INFO: loaded from: classes13.dex */
public class MyTextInputChannel extends TextInputChannel {
    public static ChangeQuickRedirect changeQuickRedirect;

    public MyTextInputChannel(@n0 DartExecutor dartExecutor) {
        super(dartExecutor);
    }

    public void onConnectionClosed(int i10) {
    }
}
