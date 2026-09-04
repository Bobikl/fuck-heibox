package cn.fly.verify;

import android.os.Parcelable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class dh implements dm<dh> {
    @Override // cn.fly.verify.dm
    public boolean a(dh dhVar, Class<dh> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        if (objArr == null) {
            return false;
        }
        if (eh.b("002i_eh").equals(str)) {
            if (objArr.length == 2) {
                gt.a().a((String) objArr[0], (String) objArr[1]);
            } else if (objArr.length == 3) {
                gt.a().a((String) objArr[0], (String) objArr[1], ((Long) objArr[2]).longValue());
            }
        } else if ("pbl".equals(str)) {
            if (objArr.length == 2) {
                gt.a().a((String) objArr[0], (Boolean) objArr[1]);
            } else if (objArr.length == 3) {
                gt.a().a((String) objArr[0], (Boolean) objArr[1], ((Long) objArr[2]).longValue());
            }
        } else if (eh.b("002if").equals(str)) {
            if (objArr.length == 2) {
                gt.a().a((String) objArr[0], (Long) objArr[1]);
            } else if (objArr.length == 3) {
                gt.a().a((String) objArr[0], (Long) objArr[1], ((Long) objArr[2]).longValue());
            }
        } else if ("pin".equals(str)) {
            if (objArr.length == 2) {
                gt.a().a((String) objArr[0], (Integer) objArr[1]);
            } else if (objArr.length == 3) {
                gt.a().a((String) objArr[0], (Integer) objArr[1], ((Long) objArr[2]).longValue());
            }
        } else if ("pdou".equals(str)) {
            if (objArr.length == 2) {
                gt.a().a((String) objArr[0], (Double) objArr[1]);
            } else if (objArr.length == 3) {
                gt.a().a((String) objArr[0], (Double) objArr[1], ((Long) objArr[2]).longValue());
            }
        } else if ("pparm".equals(str)) {
            if (objArr.length == 2) {
                gt.a().a((String) objArr[0], (Map) objArr[1]);
            } else if (objArr.length == 3) {
                gt.a().a((String) objArr[0], (Map) objArr[1], ((Long) objArr[2]).longValue());
            }
        } else if ("ppar".equals(str)) {
            if (objArr.length == 2) {
                gt.a().a((String) objArr[0], (Parcelable) objArr[1]);
            } else if (objArr.length == 3) {
                gt.a().a((String) objArr[0], (Parcelable) objArr[1], ((Long) objArr[2]).longValue());
            }
        } else if ("pparl".equals(str)) {
            if (objArr.length == 2) {
                gt.a().a((String) objArr[0], (List) objArr[1]);
            } else if (objArr.length == 3) {
                gt.a().a((String) objArr[0], (List) objArr[1], ((Long) objArr[2]).longValue());
            }
        } else if ("ppararr".equals(str)) {
            if (objArr.length == 2) {
                gt.a().a((String) objArr[0], (Parcelable[]) objArr[1]);
            } else if (objArr.length == 3) {
                gt.a().a((String) objArr[0], (Parcelable[]) objArr[1], ((Long) objArr[2]).longValue());
            }
        } else if ("p".equals(str)) {
            if (objArr.length == 2) {
                gt.a().a((String) objArr[0], objArr[1]);
            } else if (objArr.length == 3) {
                gt.a().a((String) objArr[0], objArr[1], ((Long) objArr[2]).longValue());
            }
        } else if ("g".equals(str)) {
            try {
                if (objArr.length == 1) {
                    objArr2[0] = gt.a().g((String) objArr[0]);
                } else if (objArr.length == 2) {
                    objArr2[0] = gt.a().b((String) objArr[0], objArr[1]);
                }
            } catch (Throwable th2) {
                thArr[0] = th2;
            }
        } else if ("gs".equals(str)) {
            try {
                if (objArr.length == 1) {
                    objArr2[0] = gt.a().a((String) objArr[0]);
                } else if (objArr.length == 2) {
                    objArr2[0] = gt.a().b((String) objArr[0], (String) objArr[1]);
                }
            } catch (Throwable th3) {
                thArr[0] = th3;
            }
        } else if ("gbl".equals(str)) {
            try {
                if (objArr.length == 1) {
                    objArr2[0] = Boolean.valueOf(gt.a().b((String) objArr[0]));
                } else if (objArr.length == 2) {
                    objArr2[0] = Boolean.valueOf(gt.a().a((String) objArr[0], ((Boolean) objArr[1]).booleanValue()));
                }
            } catch (Throwable th4) {
                thArr[0] = th4;
            }
        } else if ("gl".equals(str)) {
            try {
                if (objArr.length == 1) {
                    objArr2[0] = Long.valueOf(gt.a().d((String) objArr[0]));
                } else if (objArr.length == 2) {
                    objArr2[0] = Long.valueOf(gt.a().a((String) objArr[0], ((Long) objArr[1]).longValue()));
                }
            } catch (Throwable th5) {
                thArr[0] = th5;
            }
        } else if ("gin".equals(str)) {
            try {
                if (objArr.length == 1) {
                    objArr2[0] = Integer.valueOf(gt.a().e((String) objArr[0]));
                } else if (objArr.length == 2) {
                    objArr2[0] = Integer.valueOf(gt.a().a((String) objArr[0], ((Integer) objArr[1]).intValue()));
                }
            } catch (Throwable th6) {
                thArr[0] = th6;
            }
        } else if ("gdou".equals(str)) {
            try {
                if (objArr.length == 1) {
                    objArr2[0] = Double.valueOf(gt.a().f((String) objArr[0]));
                } else if (objArr.length == 2) {
                    objArr2[0] = Double.valueOf(gt.a().a((String) objArr[0], ((Double) objArr[1]).doubleValue()));
                }
            } catch (Throwable th7) {
                thArr[0] = th7;
            }
        } else if ("gpar".equals(str)) {
            try {
                if (objArr.length == 2) {
                    objArr2[0] = gt.a().a((String) objArr[0], (Class) objArr[1]);
                } else if (objArr.length == 3) {
                    objArr2[0] = gt.a().a((String) objArr[0], (Class<Parcelable>) objArr[1], (Parcelable) objArr[2]);
                }
            } catch (Throwable th8) {
                thArr[0] = th8;
            }
        } else if ("gparm".equals(str)) {
            try {
                if (objArr.length == 2) {
                    objArr2[0] = gt.a().b((String) objArr[0], (Class) objArr[1]);
                } else if (objArr.length == 3) {
                    objArr2[0] = gt.a().a((String) objArr[0], (Class) objArr[1], (Map) objArr[2]);
                }
            } catch (Throwable th9) {
                thArr[0] = th9;
            }
        } else if ("gparl".equals(str)) {
            try {
                if (objArr.length == 2) {
                    objArr2[0] = gt.a().c((String) objArr[0], (Class) objArr[1]);
                } else if (objArr.length == 3) {
                    objArr2[0] = gt.a().a((String) objArr[0], (Class) objArr[1], (List) objArr[2]);
                }
            } catch (Throwable th10) {
                thArr[0] = th10;
            }
        } else if ("gpararr".equals(str)) {
            try {
                if (objArr.length == 2) {
                    objArr2[0] = gt.a().d((String) objArr[0], (Class) objArr[1]);
                } else if (objArr.length == 3) {
                    objArr2[0] = gt.a().a((String) objArr[0], (Class) objArr[1], (Parcelable[]) objArr[2]);
                }
            } catch (Throwable th11) {
                thArr[0] = th11;
            }
        } else if ("rv".equals(str) && objArr.length == 1) {
            gt.a().h((String) objArr[0]);
        } else {
            thArr[0] = new IllegalArgumentException("wrp");
        }
        return true;
    }
}
