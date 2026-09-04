package kotlin.reflect;

import java.util.List;
import java.util.Map;
import kotlin.u0;

/* JADX INFO: compiled from: KCallable.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface c<R> extends b {

    /* JADX INFO: compiled from: KCallable.kt */
    public static final class a {
        @sh.g
        public static /* synthetic */ void a() {
        }

        @u0(version = "1.1")
        public static /* synthetic */ void b() {
        }

        @u0(version = "1.1")
        public static /* synthetic */ void c() {
        }

        @u0(version = "1.1")
        public static /* synthetic */ void d() {
        }

        @u0(version = "1.1")
        public static /* synthetic */ void e() {
        }

        @u0(version = "1.1")
        public static /* synthetic */ void f() {
        }

        @u0(version = "1.3")
        public static /* synthetic */ void g() {
        }
    }

    R call(@dl.d Object... objArr);

    R callBy(@dl.d Map<KParameter, ? extends Object> map);

    @dl.d
    String getName();

    @dl.d
    List<KParameter> getParameters();

    @dl.d
    r getReturnType();

    @dl.d
    List<s> getTypeParameters();

    @dl.e
    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
