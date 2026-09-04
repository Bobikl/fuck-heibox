package com.taobao.aranger.utils;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.taobao.aranger.ARanger;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.exception.IPCException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class SerializeUtils {
    private static final HashMap<String, Parcelable.Creator<?>> sCreatorMap = new HashMap<>();

    private SerializeUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static Object decode(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        Object fromParcel = readFromParcel(parcelObtain);
        parcelObtain.recycle();
        return fromParcel;
    }

    private static byte[] encode(Object obj) {
        Parcel parcelObtain = Parcel.obtain();
        writeToParcel(parcelObtain, obj);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    private static Object[] readArray(Parcel parcel) {
        int i10 = parcel.readInt();
        if (i10 < 0) {
            return null;
        }
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = readFromParcel(parcel);
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Object readFromParcel(Parcel parcel) {
        Parcelable.Creator<?> creator;
        int i10 = parcel.readInt();
        CharSequence[] charSequenceArr = null;
        switch (i10) {
            case -1:
                return null;
            case 0:
                return parcel.readString();
            case 1:
                return Integer.valueOf(parcel.readInt());
            case 2:
                return parcel.readHashMap(ARanger.class.getClassLoader());
            case 3:
                return parcel.readBundle(ARanger.class.getClassLoader());
            case 4:
                return parcel.readParcelable(ARanger.class.getClassLoader());
            case 5:
                return Short.valueOf((short) parcel.readInt());
            case 6:
                return Long.valueOf(parcel.readLong());
            case 7:
                return Float.valueOf(parcel.readFloat());
            case 8:
                return Double.valueOf(parcel.readDouble());
            case 9:
                return Boolean.valueOf(parcel.readInt() == 1);
            case 10:
                return TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            case 11:
                return parcel.readArrayList(ARanger.class.getClassLoader());
            case 12:
                return parcel.readSparseArray(ARanger.class.getClassLoader());
            case 13:
                return parcel.createByteArray();
            case 14:
                return parcel.createStringArray();
            case 15:
                return parcel.readStrongBinder();
            case 16:
                String string = parcel.readString();
                int i11 = parcel.readInt();
                try {
                    Class<?> classType = TypeCenter.getInstance().getClassType(string);
                    HashMap<String, Parcelable.Creator<?>> map = sCreatorMap;
                    synchronized (map) {
                        creator = map.get(classType.getName());
                        if (creator == null) {
                            try {
                                try {
                                    creator = (Parcelable.Creator) classType.getField("CREATOR").get(null);
                                    if (creator == null) {
                                        throw new BadParcelableException("Parcelable protocol requires a non-null Parcelable.Creator object called CREATOR on class " + classType.getName());
                                    }
                                    map.put(classType.getName(), creator);
                                } catch (NoSuchFieldException unused) {
                                    throw new BadParcelableException("Parcelable protocol requires a Parcelable.Creator object called CREATOR on class " + classType.getName());
                                }
                            } catch (IllegalAccessException unused2) {
                                throw new BadParcelableException("IllegalAccessException when unmarshalling: " + classType.getName());
                            }
                        }
                    }
                    Object[] objArrNewArray = creator.newArray(i11);
                    for (int i12 = 0; i12 < i11; i12++) {
                        objArrNewArray[i12] = creator.createFromParcel(parcel);
                    }
                    return objArrNewArray;
                } catch (IPCException e10) {
                    throw new RuntimeException(e10);
                }
            case 17:
                return readArray(parcel);
            case 18:
                return parcel.createIntArray();
            case 19:
                return parcel.createLongArray();
            case 20:
                return Byte.valueOf(parcel.readByte());
            case 21:
                try {
                    return new ObjectInputStream(new ByteArrayInputStream(parcel.createByteArray())) { // from class: com.taobao.aranger.utils.SerializeUtils.1
                        @Override // java.io.ObjectInputStream
                        protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
                            Class<?> cls = Class.forName(objectStreamClass.getName(), false, ARanger.class.getClassLoader());
                            return cls != null ? cls : super.resolveClass(objectStreamClass);
                        }
                    }.readObject();
                } catch (IOException unused3) {
                    throw new RuntimeException("Parcelable encountered IOException reading a Serializable object)");
                } catch (ClassNotFoundException unused4) {
                    throw new RuntimeException("Parcelable encountered ClassNotFoundException reading a Serializable object)");
                }
            case 22:
                return parcel.readSparseBooleanArray();
            case 23:
                return parcel.createBooleanArray();
            case 24:
                int i13 = parcel.readInt();
                if (i13 >= 0) {
                    charSequenceArr = new CharSequence[i13];
                    for (int i14 = 0; i14 < i13; i14++) {
                        charSequenceArr[i14] = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                    }
                }
                return charSequenceArr;
            case 25:
            case 26:
            case 27:
            default:
                switch (i10) {
                    case 25:
                        return parcel.readPersistableBundle(ARanger.class.getClassLoader());
                    case 26:
                        return parcel.readSize();
                    case 27:
                        return parcel.readSizeF();
                    default:
                        throw new RuntimeException("Parcel " + parcel + ": Unmarshalling unknown type code " + i10 + " at offset " + (parcel.dataPosition() - 4));
                }
            case 28:
                return parcel.createDoubleArray();
            case 29:
                return ParameterWrapper.CREATOR.createFromParcel(parcel);
            case 30:
                int i15 = parcel.readInt();
                ParameterWrapper[] parameterWrapperArr = new ParameterWrapper[i15];
                for (int i16 = 0; i16 < i15; i16++) {
                    parameterWrapperArr[i16] = ParameterWrapper.CREATOR.createFromParcel(parcel);
                }
                return parameterWrapperArr;
        }
    }

    public static Object readFromParcel(ClassLoader classLoader, Parcel parcel) {
        return parcel.readInt() == 0 ? readFromParcel(parcel) : decode(SharedMemory.getDataFromFileDescriptor(parcel.readParcelable(classLoader)));
    }

    private static void writeArray(Parcel parcel, Object[] objArr) {
        if (objArr == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(objArr.length);
        for (Object obj : objArr) {
            writeToParcel(parcel, obj);
        }
    }

    public static long writeToParcel(Parcel parcel, Object obj, int i10, boolean z10) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        writeToParcel(parcel, obj);
        long jDataSize = parcel.dataSize();
        if (z10 && jDataSize > Constants.MAX_SIZE) {
            parcel.setDataSize(iDataPosition);
            parcel.setDataPosition(iDataPosition);
            parcel.writeInt(1);
            parcel.writeParcelable(SharedMemory.getFileDescriptorFromData(encode(obj)), i10);
        }
        return jDataSize;
    }

    private static void writeToParcel(Parcel parcel, Object obj) {
        if (obj instanceof ParameterWrapper) {
            parcel.writeInt(29);
            ((ParameterWrapper) obj).writeToParcel(parcel, 0);
        } else if (obj instanceof ParameterWrapper[]) {
            ParameterWrapper[] parameterWrapperArr = (ParameterWrapper[]) obj;
            parcel.writeInt(30);
            parcel.writeInt(parameterWrapperArr.length);
            for (ParameterWrapper parameterWrapper : parameterWrapperArr) {
                parameterWrapper.writeToParcel(parcel, 0);
            }
        } else if (obj == null) {
            parcel.writeInt(-1);
        } else if (obj instanceof String) {
            parcel.writeInt(0);
            parcel.writeString((String) obj);
        } else if (obj instanceof Integer) {
            parcel.writeInt(1);
            parcel.writeInt(((Integer) obj).intValue());
        } else if (obj instanceof Map) {
            parcel.writeInt(2);
            parcel.writeMap((Map) obj);
        } else if (obj instanceof Bundle) {
            parcel.writeInt(3);
            parcel.writeBundle((Bundle) obj);
        } else if (obj instanceof Parcelable) {
            parcel.writeInt(4);
            parcel.writeParcelable((Parcelable) obj, 0);
        } else if (obj instanceof Short) {
            parcel.writeInt(5);
            parcel.writeInt(((Short) obj).intValue());
        } else if (obj instanceof Long) {
            parcel.writeInt(6);
            parcel.writeLong(((Long) obj).longValue());
        } else if (obj instanceof Float) {
            parcel.writeInt(7);
            parcel.writeFloat(((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            parcel.writeInt(8);
            parcel.writeDouble(((Double) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            parcel.writeInt(9);
            parcel.writeInt(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof CharSequence) {
            parcel.writeInt(10);
            TextUtils.writeToParcel((CharSequence) obj, parcel, 0);
        } else if (obj instanceof List) {
            parcel.writeInt(11);
            parcel.writeList((List) obj);
        } else if (obj instanceof SparseArray) {
            parcel.writeInt(12);
            parcel.writeSparseArray((SparseArray) obj);
        } else if (obj instanceof boolean[]) {
            parcel.writeInt(23);
            parcel.writeBooleanArray((boolean[]) obj);
        } else if (obj instanceof byte[]) {
            parcel.writeInt(13);
            parcel.writeByteArray((byte[]) obj);
        } else if (obj instanceof String[]) {
            parcel.writeInt(14);
            parcel.writeStringArray((String[]) obj);
        } else if (obj instanceof CharSequence[]) {
            parcel.writeInt(24);
        } else if (obj instanceof IBinder) {
            parcel.writeInt(15);
            parcel.writeStrongBinder((IBinder) obj);
        } else if (obj instanceof Parcelable[]) {
            parcel.writeInt(16);
            parcel.writeString(obj.getClass().getComponentType().getName());
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            parcel.writeInt(parcelableArr.length);
            for (Parcelable parcelable : parcelableArr) {
                parcelable.writeToParcel(parcel, 0);
            }
        } else if (obj instanceof int[]) {
            parcel.writeInt(18);
            parcel.writeIntArray((int[]) obj);
        } else if (obj instanceof long[]) {
            parcel.writeInt(19);
            parcel.writeLongArray((long[]) obj);
        } else if (obj instanceof Byte) {
            parcel.writeInt(20);
            parcel.writeInt(((Byte) obj).byteValue());
        } else if (obj instanceof double[]) {
            parcel.writeInt(28);
            parcel.writeDoubleArray((double[]) obj);
        } else {
            Class<?> cls = obj.getClass();
            if (cls.isArray() && cls.getComponentType() == Object.class) {
                parcel.writeInt(17);
                writeArray(parcel, (Object[]) obj);
            } else {
                if (!(obj instanceof Serializable)) {
                    throw new RuntimeException("Parcel: unable to marshal value " + obj);
                }
                parcel.writeInt(21);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    new ObjectOutputStream(byteArrayOutputStream).writeObject(obj);
                    parcel.writeByteArray(byteArrayOutputStream.toByteArray());
                } catch (IOException unused) {
                    throw new RuntimeException("Parcelable encountered IOException writing serializable object");
                }
            }
        }
        if (obj instanceof Size) {
            parcel.writeInt(26);
            parcel.writeSize((Size) obj);
        } else if (obj instanceof SizeF) {
            parcel.writeInt(27);
            parcel.writeSizeF((SizeF) obj);
        } else if (obj instanceof PersistableBundle) {
            parcel.writeInt(25);
            parcel.writePersistableBundle((PersistableBundle) obj);
        }
    }
}
