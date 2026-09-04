package nj;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.z2;

/* JADX INFO: compiled from: DispatchUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {
    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    public static final void a(Object obj) throws BuildException {
        c cVar;
        try {
            try {
                String str = null;
                if (obj instanceof c) {
                    cVar = (c) obj;
                } else if (obj instanceof z2) {
                    Object objR2 = ((z2) obj).r2();
                    if ((objR2 instanceof c) && (objR2 instanceof u2)) {
                        cVar = (c) objR2;
                    } else {
                        cVar = null;
                    }
                } else {
                    cVar = null;
                }
                if (cVar == null) {
                    Method method = obj.getClass().getMethod(com.tekartik.sqflite.b.f98590i, new Class[0]);
                    if (method != null) {
                        method.invoke(obj, new Object[0]);
                        if (obj instanceof z2) {
                            ((z2) obj).A2(null);
                            return;
                        }
                        return;
                    }
                    throw new BuildException("No public " + com.tekartik.sqflite.b.f98590i + "() in " + obj.getClass());
                }
                try {
                    String strQ = cVar.q();
                    if (strQ == null || strQ.trim().isEmpty()) {
                        throw new BuildException("Action Parameter Name must not be empty for Dispatchable Task.");
                    }
                    String str2 = "get" + strQ.trim().substring(0, 1).toUpperCase();
                    try {
                        if (strQ.length() > 1) {
                            str2 = str2 + strQ.substring(1);
                        }
                        Method method2 = cVar.getClass().getMethod(str2, new Class[0]);
                        if (method2 != null) {
                            Object objInvoke = method2.invoke(cVar, null);
                            if (objInvoke == null) {
                                throw new BuildException("Dispatchable Task attribute '" + strQ.trim() + "' not set or value is empty.");
                            }
                            String strTrim = objInvoke.toString().trim();
                            if (strTrim.isEmpty()) {
                                throw new BuildException("Dispatchable Task attribute '" + strQ.trim() + "' not set or value is empty.");
                            }
                            Method method3 = cVar.getClass().getMethod(strTrim, new Class[0]);
                            if (method3 != null) {
                                method3.invoke(cVar, null);
                                if (obj instanceof z2) {
                                    ((z2) obj).A2(null);
                                    return;
                                }
                                return;
                            }
                            throw new BuildException("No public " + strTrim + "() in " + cVar.getClass());
                        }
                    } catch (NoSuchMethodException unused) {
                        str = str2;
                        throw new BuildException("No public " + str + "() in " + obj.getClass());
                    }
                } catch (NoSuchMethodException unused2) {
                }
            } catch (NoSuchMethodException e10) {
                e = e10;
                throw new BuildException(e);
            }
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new BuildException(e);
        } catch (InvocationTargetException e12) {
            Throwable targetException = e12.getTargetException();
            if (!(targetException instanceof BuildException)) {
                throw new BuildException(targetException);
            }
            throw ((BuildException) targetException);
        }
    }
}
