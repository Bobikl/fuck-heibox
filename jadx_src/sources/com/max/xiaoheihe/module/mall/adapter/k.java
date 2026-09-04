package com.max.xiaoheihe.module.mall.adapter;

import android.content.Context;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallProductAdapterV2.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class k implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f89984d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final String f89985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f89986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f89987c;

    public k(@dl.d Context context) {
        f0.p(context, "context");
        String string = context.getString(R.string.new_lowest_in_history);
        f0.o(string, "context.getString(R.string.new_lowest_in_history)");
        this.f89985a = string;
        this.f89986b = R.color.emerald_green;
    }

    @Override // com.max.xiaoheihe.module.mall.adapter.c
    public boolean a() {
        return this.f89987c;
    }

    @Override // com.max.xiaoheihe.module.mall.adapter.c
    public int b() {
        return this.f89986b;
    }

    @Override // com.max.xiaoheihe.module.mall.adapter.c
    @dl.d
    public String getText() {
        return this.f89985a;
    }
}
