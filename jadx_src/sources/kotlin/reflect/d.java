package kotlin.reflect;

import java.util.Collection;
import java.util.List;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: KClass.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface d<T> extends h, b, g {

    /* JADX INFO: compiled from: KClass.kt */
    public static final class a {
        @u0(version = "1.3")
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

        @u0(version = "1.1")
        public static /* synthetic */ void g() {
        }

        @u0(version = "1.1")
        public static /* synthetic */ void h() {
        }

        @u0(version = "1.4")
        public static /* synthetic */ void i() {
        }

        @u0(version = "1.1")
        public static /* synthetic */ void j() {
        }

        @u0(version = "1.1")
        public static /* synthetic */ void k() {
        }

        @u0(version = "1.1")
        public static /* synthetic */ void l() {
        }

        @u0(version = s0.f136928s)
        public static /* synthetic */ void m() {
        }
    }

    @dl.e
    String A();

    @dl.d
    Collection<d<?>> C();

    @dl.e
    T D();

    boolean E();

    @dl.e
    String F();

    boolean equals(@dl.e Object obj);

    @dl.d
    List<s> getTypeParameters();

    @dl.e
    KVisibility getVisibility();

    @dl.d
    Collection<i<T>> h();

    int hashCode();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    @dl.d
    List<r> l();

    boolean m();

    @dl.d
    List<d<? extends T>> s();

    boolean t();

    @u0(version = "1.1")
    boolean u(@dl.e Object obj);

    @Override // kotlin.reflect.h
    @dl.d
    Collection<c<?>> v();

    boolean x();

    boolean y();

    boolean z();
}
