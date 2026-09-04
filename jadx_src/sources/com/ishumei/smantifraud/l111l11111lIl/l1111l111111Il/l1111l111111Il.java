package com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes6.dex */
public abstract class l1111l111111Il implements com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l.l1111l111111Il {
    private final ReadWriteLock l11l1111I11l = new ReentrantReadWriteLock(true);

    l1111l111111Il() {
    }

    protected abstract String l1111l111111Il();

    protected abstract void l1111l111111Il(String str);

    @Override // com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l.l1111l111111Il
    public final String l111l11111lIl() {
        try {
            if (!this.l11l1111I11l.readLock().tryLock(50L, TimeUnit.MILLISECONDS)) {
                return "";
            }
            try {
                return l1111l111111Il();
            } finally {
                this.l11l1111I11l.readLock().unlock();
            }
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l.l1111l111111Il
    public void l111l11111lIl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.l11l1111I11l.writeLock().lock();
            l1111l111111Il(str);
        } catch (Exception unused) {
        } finally {
            this.l11l1111I11l.writeLock().unlock();
        }
    }
}
