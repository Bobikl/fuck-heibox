package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.e0;
import androidx.core.view.j1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class CustomAttribute {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f17394i = "TransitionLayout";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f17395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f17396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AttributeType f17397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f17398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f17399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f17400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f17401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f17402h;

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17403a;

        static {
            int[] iArr = new int[AttributeType.values().length];
            f17403a = iArr;
            try {
                iArr[AttributeType.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17403a[AttributeType.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17403a[AttributeType.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17403a[AttributeType.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17403a[AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17403a[AttributeType.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17403a[AttributeType.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17403a[AttributeType.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public CustomAttribute(CustomAttribute customAttribute, Object obj) {
        this.f17395a = false;
        this.f17396b = customAttribute.f17396b;
        this.f17397c = customAttribute.f17397c;
        q(obj);
    }

    public CustomAttribute(String str, AttributeType attributeType) {
        this.f17395a = false;
        this.f17396b = str;
        this.f17397c = attributeType;
    }

    public CustomAttribute(String str, AttributeType attributeType, Object obj, boolean z10) {
        this.f17396b = str;
        this.f17397c = attributeType;
        this.f17395a = z10;
        q(obj);
    }

    private static int b(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static HashMap<String, CustomAttribute> d(HashMap<String, CustomAttribute> map, Object obj) {
        HashMap<String, CustomAttribute> map2 = new HashMap<>();
        Class<?> cls = obj.getClass();
        for (String str : map.keySet()) {
            try {
                map2.put(str, new CustomAttribute(map.get(str), cls.getMethod("getMap" + str, new Class[0]).invoke(obj, new Object[0])));
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                e11.printStackTrace();
            } catch (InvocationTargetException e12) {
                e12.printStackTrace();
            }
        }
        return map2;
    }

    public static int h(float f10, float f11, float f12) {
        float f13 = f10 * 6.0f;
        int i10 = (int) f13;
        float f14 = f13 - i10;
        float f15 = f12 * 255.0f;
        int i11 = (int) (((1.0f - f11) * f15) + 0.5f);
        int i12 = (int) (((1.0f - (f14 * f11)) * f15) + 0.5f);
        int i13 = (int) (((1.0f - ((1.0f - f14) * f11)) * f15) + 0.5f);
        int i14 = (int) (f15 + 0.5f);
        if (i10 == 0) {
            return ((i14 << 16) + (i13 << 8) + i11) | j1.f21601t;
        }
        if (i10 == 1) {
            return ((i12 << 16) + (i14 << 8) + i11) | j1.f21601t;
        }
        if (i10 == 2) {
            return ((i11 << 16) + (i14 << 8) + i13) | j1.f21601t;
        }
        if (i10 == 3) {
            return ((i11 << 16) + (i12 << 8) + i14) | j1.f21601t;
        }
        if (i10 == 4) {
            return ((i13 << 16) + (i11 << 8) + i14) | j1.f21601t;
        }
        if (i10 != 5) {
            return 0;
        }
        return ((i14 << 16) + (i11 << 8) + i12) | j1.f21601t;
    }

    public static void k(Object obj, HashMap<String, CustomAttribute> map) {
        Class<?> cls = obj.getClass();
        for (String str : map.keySet()) {
            CustomAttribute customAttribute = map.get(str);
            String str2 = customAttribute.f17395a ? str : "set" + str;
            try {
                switch (a.f17403a[customAttribute.f17397c.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(obj, Integer.valueOf(customAttribute.f17398d));
                        break;
                    case 2:
                        cls.getMethod(str2, Boolean.TYPE).invoke(obj, Boolean.valueOf(customAttribute.f17401g));
                        break;
                    case 3:
                        cls.getMethod(str2, CharSequence.class).invoke(obj, customAttribute.f17400f);
                        break;
                    case 4:
                        cls.getMethod(str2, Integer.TYPE).invoke(obj, Integer.valueOf(customAttribute.f17402h));
                        break;
                    case 6:
                        cls.getMethod(str2, Integer.TYPE).invoke(obj, Integer.valueOf(customAttribute.f17398d));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(obj, Float.valueOf(customAttribute.f17399e));
                        break;
                    case 8:
                        cls.getMethod(str2, Float.TYPE).invoke(obj, Float.valueOf(customAttribute.f17399e));
                        break;
                }
            } catch (IllegalAccessException e10) {
                e0.f(f17394i, " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                e0.f(f17394i, e11.getMessage());
                e0.f(f17394i, " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(str2);
                e0.f(f17394i, sb2.toString());
            } catch (InvocationTargetException e12) {
                e0.f(f17394i, " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e12.printStackTrace();
            }
        }
    }

    public void a(Object obj) {
        String str;
        Class<?> cls = obj.getClass();
        String str2 = this.f17396b;
        if (this.f17395a) {
            str = str2;
        } else {
            str = "set" + str2;
        }
        try {
            switch (a.f17403a[this.f17397c.ordinal()]) {
                case 1:
                case 6:
                    cls.getMethod(str, Integer.TYPE).invoke(obj, Integer.valueOf(this.f17398d));
                    break;
                case 2:
                    cls.getMethod(str, Boolean.TYPE).invoke(obj, Boolean.valueOf(this.f17401g));
                    break;
                case 3:
                    cls.getMethod(str, CharSequence.class).invoke(obj, this.f17400f);
                    break;
                case 4:
                    cls.getMethod(str, Integer.TYPE).invoke(obj, Integer.valueOf(this.f17402h));
                    break;
                case 5:
                default:
                    break;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(obj, Float.valueOf(this.f17399e));
                    break;
                case 8:
                    cls.getMethod(str, Float.TYPE).invoke(obj, Float.valueOf(this.f17399e));
                    break;
            }
        } catch (IllegalAccessException e10) {
            e0.f(f17394i, " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            e10.printStackTrace();
        } catch (NoSuchMethodException e11) {
            e0.f(f17394i, e11.getMessage());
            e0.f(f17394i, " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" must have a method ");
            sb2.append(str);
            e0.f(f17394i, sb2.toString());
        } catch (InvocationTargetException e12) {
            e0.f(f17394i, " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            e12.printStackTrace();
        }
    }

    public boolean c(CustomAttribute customAttribute) {
        AttributeType attributeType;
        if (customAttribute == null || (attributeType = this.f17397c) != customAttribute.f17397c) {
            return false;
        }
        switch (a.f17403a[attributeType.ordinal()]) {
            case 1:
            case 6:
                return this.f17398d == customAttribute.f17398d;
            case 2:
                return this.f17401g == customAttribute.f17401g;
            case 3:
                return this.f17398d == customAttribute.f17398d;
            case 4:
            case 5:
                return this.f17402h == customAttribute.f17402h;
            case 7:
                return this.f17399e == customAttribute.f17399e;
            case 8:
                return this.f17399e == customAttribute.f17399e;
            default:
                return false;
        }
    }

    public AttributeType e() {
        return this.f17397c;
    }

    public float f() {
        switch (a.f17403a[this.f17397c.ordinal()]) {
            case 2:
                return this.f17401g ? 1.0f : 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.f17398d;
            case 7:
                return this.f17399e;
            case 8:
                return this.f17399e;
            default:
                return Float.NaN;
        }
    }

    public void g(float[] fArr) {
        switch (a.f17403a[this.f17397c.ordinal()]) {
            case 2:
                fArr[0] = this.f17401g ? 1.0f : 0.0f;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i10 = this.f17402h;
                int i11 = (i10 >> 24) & 255;
                float fPow = (float) Math.pow(((i10 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i10 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i10 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i11 / 255.0f;
                return;
            case 6:
                fArr[0] = this.f17398d;
                return;
            case 7:
                fArr[0] = this.f17399e;
                return;
            case 8:
                fArr[0] = this.f17399e;
                return;
            default:
                return;
        }
    }

    public boolean i() {
        int i10 = a.f17403a[this.f17397c.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3) ? false : true;
    }

    public int j() {
        int i10 = a.f17403a[this.f17397c.ordinal()];
        return (i10 == 4 || i10 == 5) ? 4 : 1;
    }

    public void l(int i10) {
        this.f17402h = i10;
    }

    public void m(float f10) {
        this.f17399e = f10;
    }

    public void n(int i10) {
        this.f17398d = i10;
    }

    public void o(Object obj, float[] fArr) {
        Class<?> cls = obj.getClass();
        String str = "set" + this.f17396b;
        try {
            int i10 = a.f17403a[this.f17397c.ordinal()];
            boolean z10 = true;
            if (i10 == 2) {
                Method method = cls.getMethod(str, Boolean.TYPE);
                Object[] objArr = new Object[1];
                if (fArr[0] <= 0.5f) {
                    z10 = false;
                }
                objArr[0] = Boolean.valueOf(z10);
                method.invoke(obj, objArr);
                return;
            }
            if (i10 == 3) {
                throw new RuntimeException("unable to interpolate strings " + this.f17396b);
            }
            if (i10 == 4) {
                cls.getMethod(str, Integer.TYPE).invoke(obj, Integer.valueOf((b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | (b((int) (fArr[3] * 255.0f)) << 24) | (b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                return;
            }
            if (i10 == 6) {
                cls.getMethod(str, Integer.TYPE).invoke(obj, Integer.valueOf((int) fArr[0]));
            } else if (i10 == 7) {
                cls.getMethod(str, Float.TYPE).invoke(obj, Float.valueOf(fArr[0]));
            } else {
                if (i10 != 8) {
                    return;
                }
                cls.getMethod(str, Float.TYPE).invoke(obj, Float.valueOf(fArr[0]));
            }
        } catch (IllegalAccessException e10) {
            e0.f(f17394i, "cannot access method " + str + " on View \"" + obj.getClass().getName() + "\"");
            e10.printStackTrace();
        } catch (NoSuchMethodException e11) {
            e0.f(f17394i, "no method " + str + " on View \"" + obj.getClass().getName() + "\"");
            e11.printStackTrace();
        } catch (InvocationTargetException e12) {
            e12.printStackTrace();
        }
    }

    public void p(String str) {
        this.f17400f = str;
    }

    public void q(Object obj) {
        switch (a.f17403a[this.f17397c.ordinal()]) {
            case 1:
            case 6:
                this.f17398d = ((Integer) obj).intValue();
                break;
            case 2:
                this.f17401g = ((Boolean) obj).booleanValue();
                break;
            case 3:
                this.f17400f = (String) obj;
                break;
            case 4:
            case 5:
                this.f17402h = ((Integer) obj).intValue();
                break;
            case 7:
                this.f17399e = ((Float) obj).floatValue();
                break;
            case 8:
                this.f17399e = ((Float) obj).floatValue();
                break;
        }
    }

    public void r(float[] fArr) {
        switch (a.f17403a[this.f17397c.ordinal()]) {
            case 1:
            case 6:
                this.f17398d = (int) fArr[0];
                return;
            case 2:
                this.f17401g = ((double) fArr[0]) > 0.5d;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int iH = h(fArr[0], fArr[1], fArr[2]);
                this.f17402h = iH;
                this.f17402h = (b((int) (fArr[3] * 255.0f)) << 24) | (iH & 16777215);
                return;
            case 7:
                this.f17399e = fArr[0];
                return;
            case 8:
                this.f17399e = fArr[0];
                return;
            default:
                return;
        }
    }
}
