package cn.fly.verify;

/* JADX INFO: loaded from: classes6.dex */
public class dc implements dm<dc> {
    @Override // cn.fly.verify.dm
    public boolean a(dc dcVar, Class<dc> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        if ("andOperation".equals(str) && objArr.length == 2) {
            Object obj13 = objArr[0];
            if (obj13 != null && (obj13 instanceof Integer) && (obj12 = objArr[1]) != null && (obj12 instanceof Integer)) {
                objArr2[0] = Integer.valueOf(((Integer) obj13).intValue() & ((Integer) objArr[1]).intValue());
            } else if (obj13 != null && (obj13 instanceof Long) && (obj11 = objArr[1]) != null && (obj11 instanceof Long)) {
                objArr2[0] = Long.valueOf(((Long) obj13).longValue() & ((Long) objArr[1]).longValue());
            }
        } else if ("orOperation".equals(str) && objArr.length == 2) {
            Object obj14 = objArr[0];
            if (obj14 != null && (obj14 instanceof Integer) && (obj10 = objArr[1]) != null && (obj10 instanceof Integer)) {
                objArr2[0] = Integer.valueOf(((Integer) obj14).intValue() | ((Integer) objArr[1]).intValue());
            } else if (obj14 != null && (obj14 instanceof Long) && (obj9 = objArr[1]) != null && (obj9 instanceof Long)) {
                objArr2[0] = Long.valueOf(((Long) obj14).longValue() | ((Long) objArr[1]).longValue());
            }
        } else if ("rMoveOperation".equals(str) && objArr.length == 2) {
            Object obj15 = objArr[0];
            if (obj15 != null && (obj15 instanceof Integer) && (obj8 = objArr[1]) != null && (obj8 instanceof Integer)) {
                objArr2[0] = Integer.valueOf(((Integer) obj15).intValue() >> ((Integer) objArr[1]).intValue());
            } else if (obj15 != null && (obj15 instanceof Long) && (obj7 = objArr[1]) != null && (obj7 instanceof Long)) {
                objArr2[0] = Long.valueOf(((Long) obj15).longValue() >> ((int) ((Long) objArr[1]).longValue()));
            }
        } else if ("rrrMoveOperation".equals(str) && objArr.length == 2) {
            Object obj16 = objArr[0];
            if (obj16 != null && (obj16 instanceof Integer) && (obj6 = objArr[1]) != null && (obj6 instanceof Integer)) {
                objArr2[0] = Integer.valueOf(((Integer) obj16).intValue() >>> ((Integer) objArr[1]).intValue());
            } else if (obj16 != null && (obj16 instanceof Long) && (obj5 = objArr[1]) != null && (obj5 instanceof Long)) {
                objArr2[0] = Long.valueOf(((Long) obj16).longValue() >>> ((int) ((Long) objArr[1]).longValue()));
            }
        } else if ("lMoveOperation".equals(str) && objArr.length == 2) {
            Object obj17 = objArr[0];
            if (obj17 != null && (obj17 instanceof Integer) && (obj4 = objArr[1]) != null && (obj4 instanceof Integer)) {
                objArr2[0] = Integer.valueOf(((Integer) obj17).intValue() << ((Integer) objArr[1]).intValue());
            } else if (obj17 != null && (obj17 instanceof Long) && (obj3 = objArr[1]) != null && (obj3 instanceof Long)) {
                objArr2[0] = Long.valueOf(((Long) obj17).longValue() << ((int) ((Long) objArr[1]).longValue()));
            }
        } else if ("xOperation".equals(str) && objArr.length == 1) {
            Object obj18 = objArr[0];
            if (obj18 != null && (obj18 instanceof Integer)) {
                objArr2[0] = Integer.valueOf(~((Integer) obj18).intValue());
            } else if (obj18 != null && (obj18 instanceof Long)) {
                objArr2[0] = Long.valueOf(~((Long) obj18).longValue());
            }
        } else {
            if (!"xorOperation".equals(str) || objArr.length != 2) {
                return false;
            }
            Object obj19 = objArr[0];
            if (obj19 != null && (obj19 instanceof Integer) && (obj2 = objArr[1]) != null && (obj2 instanceof Integer)) {
                objArr2[0] = Integer.valueOf(((Integer) obj19).intValue() ^ ((Integer) objArr[1]).intValue());
            } else if (obj19 != null && (obj19 instanceof Long) && (obj = objArr[1]) != null && (obj instanceof Long)) {
                objArr2[0] = Long.valueOf(((Long) obj19).longValue() ^ ((Long) objArr[1]).longValue());
            }
        }
        return true;
    }
}
