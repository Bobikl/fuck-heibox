package com.tencent.thumbplayer.tcmedia.utils;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes4.dex */
public class m extends ReentrantReadWriteLock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Condition f103166a = writeLock().newCondition();
}
