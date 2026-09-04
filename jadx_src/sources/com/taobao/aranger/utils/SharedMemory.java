package com.taobao.aranger.utils;

import android.os.Build;
import android.os.MemoryFile;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.taobao.aranger.constant.Constants;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class SharedMemory {
    private static Method sGetFileDescriptorMethod;

    SharedMemory() {
    }

    static byte[] getDataFromFileDescriptor(Parcelable parcelable) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) parcelable;
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
            FileChannel channel = fileInputStream.getChannel();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1024);
            while (channel.read(byteBufferAllocate) != -1) {
                byteArrayOutputStream.write(byteBufferAllocate.array());
                byteBufferAllocate.clear();
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            fileInputStream.close();
            parcelFileDescriptor.close();
            return byteArray;
        } catch (Exception e10) {
            throw new RuntimeException("big data decode error", e10);
        }
    }

    static Parcelable getFileDescriptorFromData(byte[] bArr) {
        try {
            String string = UUID.randomUUID().toString();
            if (Build.VERSION.SDK_INT <= 26) {
                if (sGetFileDescriptorMethod == null) {
                    sGetFileDescriptorMethod = ReflectUtils.getHideMethod(MemoryFile.class, Constants.GET_FILE_DESCRIPTOR, new Class[0]);
                }
                MemoryFile memoryFile = new MemoryFile(string, bArr.length);
                memoryFile.writeBytes(bArr, 0, 0, bArr.length);
                return ParcelFileDescriptor.dup((FileDescriptor) sGetFileDescriptorMethod.invoke(memoryFile, new Object[0]));
            }
            if (sGetFileDescriptorMethod == null) {
                sGetFileDescriptorMethod = ReflectUtils.getHideMethod(android.os.SharedMemory.class, Constants.GET_FILE_DESCRIPTOR, new Class[0]);
            }
            android.os.SharedMemory sharedMemoryCreate = android.os.SharedMemory.create(string, bArr.length);
            sharedMemoryCreate.mapReadWrite().put(bArr, 0, bArr.length);
            return ParcelFileDescriptor.dup((FileDescriptor) sGetFileDescriptorMethod.invoke(sharedMemoryCreate, new Object[0]));
        } catch (Exception e10) {
            throw new RuntimeException("big data encode error", e10);
        }
    }
}
