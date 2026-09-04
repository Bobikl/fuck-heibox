package cn.fly.verify.common.callback;

import cn.fly.verify.common.exception.VerifyException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public abstract class OperationCallback<T> {
    private AtomicBoolean canceled;

    public boolean isCanceled() {
        AtomicBoolean atomicBoolean = this.canceled;
        return atomicBoolean != null && atomicBoolean.get();
    }

    public abstract void onComplete(T t10);

    public abstract void onFailure(VerifyException verifyException);

    public void setCanceled(boolean z10) {
        this.canceled = new AtomicBoolean(z10);
    }
}
