package com.max.network.config;

import dl.e;

/* JADX INFO: compiled from: InvalidConfigGroupException.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class InvalidConfigGroupException extends Exception {
    public InvalidConfigGroupException(@e String str) {
        super("不存在名为" + str + "的配置项");
    }
}
