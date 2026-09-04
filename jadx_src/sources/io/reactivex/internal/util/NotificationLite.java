package io.reactivex.internal.util;

import io.reactivex.g0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public enum NotificationLite {
    COMPLETE;

    public static final class DisposableNotification implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.disposables.b f123861b;

        DisposableNotification(io.reactivex.disposables.b bVar) {
            this.f123861b = bVar;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.f123861b + "]";
        }
    }

    public static final class ErrorNotification implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f123862b;

        ErrorNotification(Throwable th2) {
            this.f123862b = th2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ErrorNotification) {
                return io.reactivex.internal.functions.a.c(this.f123862b, ((ErrorNotification) obj).f123862b);
            }
            return false;
        }

        public int hashCode() {
            return this.f123862b.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f123862b + "]";
        }
    }

    public static final class SubscriptionNotification implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.e f123863b;

        SubscriptionNotification(org.reactivestreams.e eVar) {
            this.f123863b = eVar;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.f123863b + "]";
        }
    }

    public static <T> boolean accept(Object obj, g0<? super T> g0Var) {
        if (obj == COMPLETE) {
            g0Var.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            g0Var.onError(((ErrorNotification) obj).f123862b);
            return true;
        }
        g0Var.onNext(obj);
        return false;
    }

    public static <T> boolean accept(Object obj, org.reactivestreams.d<? super T> dVar) {
        if (obj == COMPLETE) {
            dVar.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            dVar.onError(((ErrorNotification) obj).f123862b);
            return true;
        }
        dVar.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, g0<? super T> g0Var) {
        if (obj == COMPLETE) {
            g0Var.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            g0Var.onError(((ErrorNotification) obj).f123862b);
            return true;
        }
        if (obj instanceof DisposableNotification) {
            g0Var.onSubscribe(((DisposableNotification) obj).f123861b);
            return false;
        }
        g0Var.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, org.reactivestreams.d<? super T> dVar) {
        if (obj == COMPLETE) {
            dVar.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            dVar.onError(((ErrorNotification) obj).f123862b);
            return true;
        }
        if (obj instanceof SubscriptionNotification) {
            dVar.onSubscribe(((SubscriptionNotification) obj).f123863b);
            return false;
        }
        dVar.onNext(obj);
        return false;
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(io.reactivex.disposables.b bVar) {
        return new DisposableNotification(bVar);
    }

    public static Object error(Throwable th2) {
        return new ErrorNotification(th2);
    }

    public static io.reactivex.disposables.b getDisposable(Object obj) {
        return ((DisposableNotification) obj).f123861b;
    }

    public static Throwable getError(Object obj) {
        return ((ErrorNotification) obj).f123862b;
    }

    public static org.reactivestreams.e getSubscription(Object obj) {
        return ((SubscriptionNotification) obj).f123863b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof DisposableNotification;
    }

    public static boolean isError(Object obj) {
        return obj instanceof ErrorNotification;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof SubscriptionNotification;
    }

    public static <T> Object next(T t10) {
        return t10;
    }

    public static Object subscription(org.reactivestreams.e eVar) {
        return new SubscriptionNotification(eVar);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }
}
