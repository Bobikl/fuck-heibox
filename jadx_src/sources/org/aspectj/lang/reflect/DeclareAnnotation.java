package org.aspectj.lang.reflect;

import java.lang.annotation.Annotation;
import zj.a0;
import zj.c;
import zj.y;

/* JADX INFO: loaded from: classes5.dex */
public interface DeclareAnnotation {

    public enum Kind {
        Field,
        Method,
        Constructor,
        Type
    }

    c<?> a();

    Kind b();

    Annotation c();

    a0 e();

    String f();

    y g();
}
