package com.huawei.hmf.tasks.a;

import android.app.Activity;
import com.huawei.hmf.tasks.Continuation;
import com.huawei.hmf.tasks.ExecuteResult;
import com.huawei.hmf.tasks.OnCanceledListener;
import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.SuccessContinuation;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskExecutors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class i<TResult> extends Task<TResult> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f60218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f60219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TResult f60220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Exception f60221e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f60217a = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<ExecuteResult<TResult>> f60222f = new ArrayList();

    private Task<TResult> a(ExecuteResult<TResult> executeResult) {
        boolean zIsComplete;
        synchronized (this.f60217a) {
            zIsComplete = isComplete();
            if (!zIsComplete) {
                this.f60222f.add(executeResult);
            }
        }
        if (zIsComplete) {
            executeResult.onComplete(this);
        }
        return this;
    }

    private void b() {
        synchronized (this.f60217a) {
            Iterator<ExecuteResult<TResult>> it = this.f60222f.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onComplete(this);
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
            this.f60222f = null;
        }
    }

    public final void a(Exception exc) {
        synchronized (this.f60217a) {
            if (this.f60218b) {
                return;
            }
            this.f60218b = true;
            this.f60221e = exc;
            this.f60217a.notifyAll();
            b();
        }
    }

    public final void a(TResult tresult) {
        synchronized (this.f60217a) {
            if (this.f60218b) {
                return;
            }
            this.f60218b = true;
            this.f60220d = tresult;
            this.f60217a.notifyAll();
            b();
        }
    }

    public final boolean a() {
        synchronized (this.f60217a) {
            if (this.f60218b) {
                return false;
            }
            this.f60218b = true;
            this.f60219c = true;
            this.f60217a.notifyAll();
            b();
            return true;
        }
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Task<TResult> addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        b bVar = new b(TaskExecutors.uiThread(), onCanceledListener);
        g.a(activity, bVar);
        return a((ExecuteResult) bVar);
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Task<TResult> addOnCanceledListener(OnCanceledListener onCanceledListener) {
        return addOnCanceledListener(TaskExecutors.uiThread(), onCanceledListener);
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Task<TResult> addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        return a((ExecuteResult) new b(executor, onCanceledListener));
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Task<TResult> addOnCompleteListener(Activity activity, OnCompleteListener<TResult> onCompleteListener) {
        d dVar = new d(TaskExecutors.uiThread(), onCompleteListener);
        g.a(activity, dVar);
        return a((ExecuteResult) dVar);
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Task<TResult> addOnCompleteListener(OnCompleteListener<TResult> onCompleteListener) {
        return addOnCompleteListener(TaskExecutors.uiThread(), onCompleteListener);
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Task<TResult> addOnCompleteListener(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        return a((ExecuteResult) new d(executor, onCompleteListener));
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Task<TResult> addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        f fVar = new f(TaskExecutors.uiThread(), onFailureListener);
        g.a(activity, fVar);
        return a((ExecuteResult) fVar);
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Task<TResult> addOnFailureListener(OnFailureListener onFailureListener) {
        return addOnFailureListener(TaskExecutors.uiThread(), onFailureListener);
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Task<TResult> addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        return a((ExecuteResult) new f(executor, onFailureListener));
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Task<TResult> addOnSuccessListener(Activity activity, OnSuccessListener<TResult> onSuccessListener) {
        h hVar = new h(TaskExecutors.uiThread(), onSuccessListener);
        g.a(activity, hVar);
        return a((ExecuteResult) hVar);
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Task<TResult> addOnSuccessListener(OnSuccessListener<TResult> onSuccessListener) {
        return addOnSuccessListener(TaskExecutors.uiThread(), onSuccessListener);
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Task<TResult> addOnSuccessListener(Executor executor, OnSuccessListener<TResult> onSuccessListener) {
        return a((ExecuteResult) new h(executor, onSuccessListener));
    }

    @Override // com.huawei.hmf.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation) {
        return continueWith(TaskExecutors.uiThread(), continuation);
    }

    @Override // com.huawei.hmf.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> continueWith(Executor executor, final Continuation<TResult, TContinuationResult> continuation) {
        final i iVar = new i();
        addOnCompleteListener(executor, new OnCompleteListener<TResult>() { // from class: com.huawei.hmf.tasks.a.i.5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.huawei.hmf.tasks.OnCompleteListener
            public final void onComplete(Task<TResult> task) {
                if (task.isCanceled()) {
                    iVar.a();
                    return;
                }
                try {
                    iVar.a(continuation.then(task));
                } catch (Exception e10) {
                    iVar.a(e10);
                }
            }
        });
        return iVar;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        return continueWithTask(TaskExecutors.uiThread(), continuation);
    }

    @Override // com.huawei.hmf.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Executor executor, final Continuation<TResult, Task<TContinuationResult>> continuation) {
        final i iVar = new i();
        addOnCompleteListener(executor, new OnCompleteListener<TResult>() { // from class: com.huawei.hmf.tasks.a.i.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.huawei.hmf.tasks.OnCompleteListener
            public final void onComplete(Task<TResult> task) {
                try {
                    Task task2 = (Task) continuation.then(task);
                    if (task2 == 0) {
                        iVar.a((Exception) new NullPointerException("Continuation returned null"));
                    } else {
                        task2.addOnCompleteListener(new OnCompleteListener<TContinuationResult>() { // from class: com.huawei.hmf.tasks.a.i.4.1
                            @Override // com.huawei.hmf.tasks.OnCompleteListener
                            public final void onComplete(Task<TContinuationResult> task3) {
                                if (task3.isSuccessful()) {
                                    iVar.a(task3.getResult());
                                } else if (task3.isCanceled()) {
                                    iVar.a();
                                } else {
                                    iVar.a(task3.getException());
                                }
                            }
                        });
                    }
                } catch (Exception e10) {
                    iVar.a(e10);
                }
            }
        });
        return iVar;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Exception getException() {
        Exception exc;
        synchronized (this.f60217a) {
            exc = this.f60221e;
        }
        return exc;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final TResult getResult() {
        TResult tresult;
        synchronized (this.f60217a) {
            if (this.f60221e != null) {
                throw new RuntimeException(this.f60221e);
            }
            tresult = this.f60220d;
        }
        return tresult;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final <E extends Throwable> TResult getResultThrowException(Class<E> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f60217a) {
            if (cls != null) {
                if (cls.isInstance(this.f60221e)) {
                    throw cls.cast(this.f60221e);
                }
            }
            if (this.f60221e != null) {
                throw new RuntimeException(this.f60221e);
            }
            tresult = this.f60220d;
        }
        return tresult;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final boolean isCanceled() {
        return this.f60219c;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final boolean isComplete() {
        boolean z10;
        synchronized (this.f60217a) {
            z10 = this.f60218b;
        }
        return z10;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final boolean isSuccessful() {
        boolean z10;
        synchronized (this.f60217a) {
            z10 = this.f60218b && !isCanceled() && this.f60221e == null;
        }
        return z10;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        return onSuccessTask(TaskExecutors.uiThread(), successContinuation);
    }

    @Override // com.huawei.hmf.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Executor executor, final SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        final i iVar = new i();
        addOnSuccessListener(executor, new OnSuccessListener<TResult>() { // from class: com.huawei.hmf.tasks.a.i.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(TResult tresult) {
                try {
                    Task taskThen = successContinuation.then(tresult);
                    if (taskThen == 0) {
                        iVar.a((Exception) new NullPointerException("SuccessContinuation returned null"));
                    } else {
                        taskThen.addOnCompleteListener(new OnCompleteListener<TContinuationResult>() { // from class: com.huawei.hmf.tasks.a.i.1.1
                            @Override // com.huawei.hmf.tasks.OnCompleteListener
                            public final void onComplete(Task<TContinuationResult> task) {
                                if (task.isSuccessful()) {
                                    iVar.a(task.getResult());
                                } else if (task.isCanceled()) {
                                    iVar.a();
                                } else {
                                    iVar.a(task.getException());
                                }
                            }
                        });
                    }
                } catch (Exception e10) {
                    iVar.a(e10);
                }
            }
        });
        addOnFailureListener(new OnFailureListener() { // from class: com.huawei.hmf.tasks.a.i.2
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                iVar.a(exc);
            }
        });
        addOnCanceledListener(new OnCanceledListener() { // from class: com.huawei.hmf.tasks.a.i.3
            @Override // com.huawei.hmf.tasks.OnCanceledListener
            public final void onCanceled() {
                iVar.a();
            }
        });
        return iVar;
    }
}
