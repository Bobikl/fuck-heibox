package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintAttribute {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f19238i = "TransitionLayout";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f19239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f19240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AttributeType f19241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f19243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f19244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f19245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f19246h;

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
        static final /* synthetic */ int[] f19247a;

        static {
            int[] iArr = new int[AttributeType.values().length];
            f19247a = iArr;
            try {
                iArr[AttributeType.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19247a[AttributeType.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19247a[AttributeType.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19247a[AttributeType.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19247a[AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19247a[AttributeType.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19247a[AttributeType.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19247a[AttributeType.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.f19239a = false;
        this.f19240b = constraintAttribute.f19240b;
        this.f19241c = constraintAttribute.f19241c;
        q(obj);
    }

    public ConstraintAttribute(String str, AttributeType attributeType) {
        this.f19239a = false;
        this.f19240b = str;
        this.f19241c = attributeType;
    }

    public ConstraintAttribute(String str, AttributeType attributeType, Object obj, boolean z10) {
        this.f19240b = str;
        this.f19241c = attributeType;
        this.f19239a = z10;
        q(obj);
    }

    private static int b(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static HashMap<String, ConstraintAttribute> d(HashMap<String, ConstraintAttribute> map, View view) {
        HashMap<String, ConstraintAttribute> map2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            ConstraintAttribute constraintAttribute = map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
                }
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

    public static void j(Context context, XmlPullParser xmlPullParser, HashMap<String, ConstraintAttribute> map) {
        AttributeType attributeType;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.f19439z);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        AttributeType attributeType2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == R.styleable.CustomAttribute_attributeName) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == R.styleable.CustomAttribute_methodName) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == R.styleable.CustomAttribute_customBoolean) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                attributeType2 = AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == R.styleable.CustomAttribute_customColorValue) {
                    attributeType = AttributeType.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == R.styleable.CustomAttribute_customColorDrawableValue) {
                    attributeType = AttributeType.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == R.styleable.CustomAttribute_customPixelDimension) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == R.styleable.CustomAttribute_customDimension) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == R.styleable.CustomAttribute_customFloatValue) {
                    attributeType = AttributeType.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == R.styleable.CustomAttribute_customIntegerValue) {
                    attributeType = AttributeType.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == R.styleable.CustomAttribute_customStringValue) {
                    attributeType = AttributeType.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == R.styleable.CustomAttribute_customReference) {
                    attributeType = AttributeType.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                attributeType2 = attributeType;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            map.put(string, new ConstraintAttribute(string, attributeType2, objValueOf2, z10));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void k(View view, HashMap<String, ConstraintAttribute> map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            ConstraintAttribute constraintAttribute = map.get(str);
            String str2 = constraintAttribute.f19239a ? str : "set" + str;
            try {
                switch (a.f19247a[constraintAttribute.f19241c.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f19242d));
                        break;
                    case 2:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.f19245g));
                        break;
                    case 3:
                        cls.getMethod(str2, CharSequence.class).invoke(view, constraintAttribute.f19244f);
                        break;
                    case 4:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f19246h));
                        break;
                    case 5:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.f19246h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f19242d));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f19243e));
                        break;
                    case 8:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f19243e));
                        break;
                }
            } catch (IllegalAccessException e10) {
                Log.e(f19238i, " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                Log.e(f19238i, e11.getMessage());
                Log.e(f19238i, " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(str2);
                Log.e(f19238i, sb2.toString());
            } catch (InvocationTargetException e12) {
                Log.e(f19238i, " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e12.printStackTrace();
            }
        }
    }

    public void a(View view) {
        String str;
        Class<?> cls = view.getClass();
        String str2 = this.f19240b;
        if (this.f19239a) {
            str = str2;
        } else {
            str = "set" + str2;
        }
        try {
            switch (a.f19247a[this.f19241c.ordinal()]) {
                case 1:
                case 6:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(this.f19242d));
                    break;
                case 2:
                    cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(this.f19245g));
                    break;
                case 3:
                    cls.getMethod(str, CharSequence.class).invoke(view, this.f19244f);
                    break;
                case 4:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(this.f19246h));
                    break;
                case 5:
                    Method method = cls.getMethod(str, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.f19246h);
                    method.invoke(view, colorDrawable);
                    break;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(this.f19243e));
                    break;
                case 8:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(this.f19243e));
                    break;
                default:
                    break;
            }
        } catch (IllegalAccessException e10) {
            Log.e(f19238i, " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            e10.printStackTrace();
        } catch (NoSuchMethodException e11) {
            Log.e(f19238i, e11.getMessage());
            Log.e(f19238i, " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" must have a method ");
            sb2.append(str);
            Log.e(f19238i, sb2.toString());
        } catch (InvocationTargetException e12) {
            Log.e(f19238i, " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            e12.printStackTrace();
        }
    }

    public boolean c(ConstraintAttribute constraintAttribute) {
        AttributeType attributeType;
        if (constraintAttribute == null || (attributeType = this.f19241c) != constraintAttribute.f19241c) {
            return false;
        }
        switch (a.f19247a[attributeType.ordinal()]) {
            case 1:
            case 6:
                return this.f19242d == constraintAttribute.f19242d;
            case 2:
                return this.f19245g == constraintAttribute.f19245g;
            case 3:
                return this.f19242d == constraintAttribute.f19242d;
            case 4:
            case 5:
                return this.f19246h == constraintAttribute.f19246h;
            case 7:
                return this.f19243e == constraintAttribute.f19243e;
            case 8:
                return this.f19243e == constraintAttribute.f19243e;
            default:
                return false;
        }
    }

    public AttributeType e() {
        return this.f19241c;
    }

    public float f() {
        switch (a.f19247a[this.f19241c.ordinal()]) {
            case 2:
                return this.f19245g ? 1.0f : 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.f19242d;
            case 7:
                return this.f19243e;
            case 8:
                return this.f19243e;
            default:
                return Float.NaN;
        }
    }

    public void g(float[] fArr) {
        switch (a.f19247a[this.f19241c.ordinal()]) {
            case 2:
                fArr[0] = this.f19245g ? 1.0f : 0.0f;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i10 = this.f19246h;
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
                fArr[0] = this.f19242d;
                return;
            case 7:
                fArr[0] = this.f19243e;
                return;
            case 8:
                fArr[0] = this.f19243e;
                return;
            default:
                return;
        }
    }

    public boolean h() {
        int i10 = a.f19247a[this.f19241c.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3) ? false : true;
    }

    public int i() {
        int i10 = a.f19247a[this.f19241c.ordinal()];
        return (i10 == 4 || i10 == 5) ? 4 : 1;
    }

    public void l(int i10) {
        this.f19246h = i10;
    }

    public void m(float f10) {
        this.f19243e = f10;
    }

    public void n(int i10) {
        this.f19242d = i10;
    }

    public void o(View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + this.f19240b;
        try {
            switch (a.f19247a[this.f19241c.ordinal()]) {
                case 2:
                    Method method = cls.getMethod(str, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    objArr[0] = Boolean.valueOf(fArr[0] > 0.5f);
                    method.invoke(view, objArr);
                    return;
                case 3:
                    throw new RuntimeException("unable to interpolate strings " + this.f19240b);
                case 4:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (b((int) (fArr[3] * 255.0f)) << 24) | (b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    Method method2 = cls.getMethod(str, Drawable.class);
                    int iB = (b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (b((int) (fArr[3] * 255.0f)) << 24) | (b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iB);
                    method2.invoke(view, colorDrawable);
                    return;
                case 6:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 8:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e10) {
            Log.e(f19238i, "cannot access method " + str + " on View \"" + androidx.constraintlayout.motion.widget.c.k(view) + "\"");
            e10.printStackTrace();
        } catch (NoSuchMethodException e11) {
            Log.e(f19238i, "no method " + str + " on View \"" + androidx.constraintlayout.motion.widget.c.k(view) + "\"");
            e11.printStackTrace();
        } catch (InvocationTargetException e12) {
            e12.printStackTrace();
        }
    }

    public void p(String str) {
        this.f19244f = str;
    }

    public void q(Object obj) {
        switch (a.f19247a[this.f19241c.ordinal()]) {
            case 1:
            case 6:
                this.f19242d = ((Integer) obj).intValue();
                break;
            case 2:
                this.f19245g = ((Boolean) obj).booleanValue();
                break;
            case 3:
                this.f19244f = (String) obj;
                break;
            case 4:
            case 5:
                this.f19246h = ((Integer) obj).intValue();
                break;
            case 7:
                this.f19243e = ((Float) obj).floatValue();
                break;
            case 8:
                this.f19243e = ((Float) obj).floatValue();
                break;
        }
    }

    public void r(float[] fArr) {
        switch (a.f19247a[this.f19241c.ordinal()]) {
            case 1:
            case 6:
                this.f19242d = (int) fArr[0];
                return;
            case 2:
                this.f19245g = ((double) fArr[0]) > 0.5d;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int iHSVToColor = Color.HSVToColor(fArr);
                this.f19246h = iHSVToColor;
                this.f19246h = (b((int) (fArr[3] * 255.0f)) << 24) | (iHSVToColor & 16777215);
                return;
            case 7:
                this.f19243e = fArr[0];
                return;
            case 8:
                this.f19243e = fArr[0];
                return;
            default:
                return;
        }
    }
}
