package org.aspectj.internal.lang.reflect;

import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.StringTokenizer;

/* JADX INFO: compiled from: StringToType.java */
/* JADX INFO: loaded from: classes5.dex */
public class q {

    /* JADX INFO: compiled from: StringToType.java */
    public class a implements ParameterizedType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Type[] f137660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Class f137661c;

        a(Type[] typeArr, Class cls) {
            this.f137660b = typeArr;
            this.f137661c = cls;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return this.f137660b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f137661c.getEnclosingClass();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f137661c;
        }
    }

    public static Type[] a(String str, Class cls) throws ClassNotFoundException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, Constants.ACCEPT_TIME_SEPARATOR_SP);
        Type[] typeArr = new Type[stringTokenizer.countTokens()];
        int i10 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            typeArr[i10] = c(stringTokenizer.nextToken().trim(), cls);
            i10++;
        }
        return typeArr;
    }

    private static Type b(String str, Class cls) throws ClassNotFoundException {
        int iIndexOf = str.indexOf(60);
        return new a(a(str.substring(iIndexOf + 1, str.lastIndexOf(62)), cls), Class.forName(str.substring(0, iIndexOf), false, cls.getClassLoader()));
    }

    public static Type c(String str, Class cls) throws ClassNotFoundException {
        try {
            return !str.contains("<") ? zj.d.a(Class.forName(str, false, cls.getClassLoader())) : b(str, cls);
        } catch (ClassNotFoundException unused) {
            for (TypeVariable typeVariable : cls.getTypeParameters()) {
                if (typeVariable.getName().equals(str)) {
                    return typeVariable;
                }
            }
            throw new ClassNotFoundException(str);
        }
    }
}
