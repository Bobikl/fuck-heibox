package cn.fly.verify;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class ey implements eu {
    ey() {
    }

    @Override // cn.fly.verify.eu
    public <T> T a(Class cls, Object obj, String str, Class[] clsArr, Object[] objArr) throws Throwable {
        Method method = (Method) Class.class.getDeclaredMethod(ba.a("017VglChkQhnIheif fl-h,fejeYhkj'fmfe"), String.class, Class[].class).invoke(cls, str, clsArr);
        method.setAccessible(true);
        return (T) method.invoke(obj, objArr);
    }

    @Override // cn.fly.verify.eu
    public <T> T a(String str) throws Throwable {
        return (T) Class.class.getDeclaredMethod(ba.a("011ghJhiggKg_hk)kfgeh"), new Class[0]).invoke((Class) Class.class.getDeclaredMethod(ba.a("007%ghfmflgiVf$fh.h"), String.class).invoke(null, str), new Object[0]);
    }

    @Override // cn.fly.verify.eu
    public <T> T a(String str, Object obj, String str2, Class[] clsArr, Object[] objArr) throws Throwable {
        return (T) a((Class) Class.class.getDeclaredMethod(ba.a("007!ghfmflgiXfAfhVh"), String.class).invoke(null, str), obj, str2, clsArr, objArr);
    }

    @Override // cn.fly.verify.eu
    public <T> T a(String str, String str2, Object obj) throws Throwable {
        Field field = (Field) Class.class.getDeclaredMethod(ba.a("016IglOhkFhnJheif8flAh feiefk,hi7fe"), String.class).invoke((Class) Class.class.getDeclaredMethod(ba.a("007CghfmflgiGf]fh%h"), String.class).invoke(null, str), str2);
        field.setAccessible(true);
        return (T) field.get(obj);
    }

    @Override // cn.fly.verify.eu
    public <T> T a(String str, Class[] clsArr, Object[] objArr) throws Throwable {
        if (clsArr == null || clsArr.length == 0 || objArr == null || objArr.length == 0) {
            return (T) a(str);
        }
        Constructor constructor = (Constructor) Class.class.getDeclaredMethod(ba.a("022VglLhk?hnQheifAflRh_fegffmBg8hk^k9flfiBekMfmfl"), Class[].class).invoke((Class) Class.class.getDeclaredMethod(ba.a("007RghfmflgiPf*fhEh"), String.class).invoke(null, str), clsArr);
        constructor.setAccessible(true);
        return (T) constructor.newInstance(objArr);
    }
}
