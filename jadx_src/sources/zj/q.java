package zj;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: compiled from: InterTypeMethodDeclaration.java */
/* JADX INFO: loaded from: classes5.dex */
public interface q extends o {
    Type b();

    c<?>[] c();

    c<?>[] e();

    Type[] f();

    String getName();

    c<?> getReturnType();

    TypeVariable<Method>[] getTypeParameters();
}
