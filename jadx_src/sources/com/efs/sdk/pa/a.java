package com.efs.sdk.pa;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements PAANRListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PAFactory f42760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PATraceListener f42761b;

    public a(PAFactory pAFactory) {
        this.f42760a = pAFactory;
        this.f42761b = pAFactory.getTraceListener();
        boolean zEnableTracer = pAFactory.getConfigManager().enableTracer();
        PATraceListener pATraceListener = this.f42761b;
        if (pATraceListener != null) {
            pATraceListener.onCheck(zEnableTracer);
        }
    }

    @Override // com.efs.sdk.pa.PAANRListener
    public final void anrStack(String str) {
        if (str == null || str.length() <= 200) {
            return;
        }
        c.a(this.f42760a, "patrace", str);
        PATraceListener pATraceListener = this.f42761b;
        if (pATraceListener != null) {
            pATraceListener.onAnrTrace();
        }
    }

    @Override // com.efs.sdk.pa.PAANRListener
    public final void unexcept(Object obj) {
        PATraceListener pATraceListener = this.f42761b;
        if (pATraceListener != null) {
            pATraceListener.onUnexcept(obj);
        }
    }
}
