package com.tencent.qcloud.core.auth;

import com.tencent.qcloud.core.common.QCloudAuthenticationException;
import com.tencent.qcloud.core.common.QCloudClientException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BasicLifecycleCredentialProvider implements QCloudCredentialProvider {
    private volatile QCloudLifecycleCredentials credentials;
    private ReentrantLock lock = new ReentrantLock();

    private synchronized QCloudLifecycleCredentials safeGetCredentials() {
        return this.credentials;
    }

    private synchronized void safeSetCredentials(QCloudLifecycleCredentials qCloudLifecycleCredentials) {
        this.credentials = qCloudLifecycleCredentials;
    }

    protected abstract QCloudLifecycleCredentials fetchNewCredentials() throws QCloudClientException;

    @Override // com.tencent.qcloud.core.auth.QCloudCredentialProvider
    public QCloudCredentials getCredentials() throws QCloudClientException {
        QCloudLifecycleCredentials qCloudLifecycleCredentialsSafeGetCredentials = safeGetCredentials();
        if (qCloudLifecycleCredentialsSafeGetCredentials != null && qCloudLifecycleCredentialsSafeGetCredentials.isValid()) {
            return qCloudLifecycleCredentialsSafeGetCredentials;
        }
        refresh();
        return safeGetCredentials();
    }

    @Override // com.tencent.qcloud.core.auth.QCloudCredentialProvider
    public void refresh() throws QCloudClientException {
        try {
            try {
                boolean zTryLock = this.lock.tryLock(20L, TimeUnit.SECONDS);
                if (!zTryLock) {
                    throw new QCloudClientException(new QCloudAuthenticationException("lock timeout, no credential for sign"));
                }
                QCloudLifecycleCredentials qCloudLifecycleCredentialsSafeGetCredentials = safeGetCredentials();
                if (qCloudLifecycleCredentialsSafeGetCredentials == null || !qCloudLifecycleCredentialsSafeGetCredentials.isValid()) {
                    safeSetCredentials(null);
                    try {
                        safeSetCredentials(fetchNewCredentials());
                    } catch (Exception e10) {
                        if (e10 instanceof QCloudClientException) {
                            throw e10;
                        }
                        throw new QCloudClientException("fetch credentials error happens: " + e10.getMessage(), new QCloudAuthenticationException(e10.getMessage()));
                    }
                }
                if (zTryLock) {
                    this.lock.unlock();
                }
            } catch (InterruptedException e11) {
                throw new QCloudClientException("interrupt when try to get credential", new QCloudAuthenticationException(e11.getMessage()));
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                this.lock.unlock();
            }
            throw th2;
        }
    }
}
