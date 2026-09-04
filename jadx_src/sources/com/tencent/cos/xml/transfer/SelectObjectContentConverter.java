package com.tencent.cos.xml.transfer;

import android.text.TextUtils;
import com.tencent.cos.xml.listener.SelectObjectContentListener;
import com.tencent.cos.xml.model.object.SelectObjectContentResult;
import com.tencent.cos.xml.model.tag.eventstreaming.Message;
import com.tencent.cos.xml.model.tag.eventstreaming.MessageDecoder;
import com.tencent.cos.xml.model.tag.eventstreaming.SelectObjectContentEvent;
import com.tencent.cos.xml.model.tag.eventstreaming.SelectObjectContentEventUnmarshaller;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.http.HttpResponse;
import com.tencent.qcloud.core.http.ResponseBodyConverter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SelectObjectContentConverter<T> extends ResponseBodyConverter<T> {
    private SelectObjectContentListener contentListener;
    private String localPath;
    private MessageDecoder messageDecoder = new MessageDecoder();
    private SelectObjectContentResult selectObjectContentResult;

    public SelectObjectContentConverter(SelectObjectContentResult selectObjectContentResult, String str) {
        this.selectObjectContentResult = selectObjectContentResult;
        this.localPath = str;
    }

    private void closeFileOutputStream(FileOutputStream fileOutputStream) throws QCloudClientException {
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException e10) {
                e10.printStackTrace();
                throw new QCloudClientException(e10);
            }
        }
    }

    private FileOutputStream newFileOutputStream(String str) throws QCloudClientException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        try {
            if (file.createNewFile()) {
                return new FileOutputStream(file);
            }
            return null;
        } catch (IOException e10) {
            e10.printStackTrace();
            throw new QCloudClientException(e10);
        }
    }

    @Override // com.tencent.qcloud.core.http.ResponseBodyConverter
    public T convert(HttpResponse<T> httpResponse) throws QCloudServiceException, QCloudClientException {
        HttpResponse.checkResponseSuccessful(httpResponse);
        InputStream inputStreamByteStream = httpResponse.byteStream();
        byte[] bArr = new byte[256];
        FileOutputStream fileOutputStreamNewFileOutputStream = newFileOutputStream(this.localPath);
        while (true) {
            try {
                int i10 = inputStreamByteStream.read(bArr);
                if (i10 <= 0) {
                    closeFileOutputStream(fileOutputStreamNewFileOutputStream);
                    return (T) this.selectObjectContentResult;
                }
                List<Message> listFeed = this.messageDecoder.feed(bArr, 0, i10);
                if (fileOutputStreamNewFileOutputStream != null) {
                    fileOutputStreamNewFileOutputStream.write(bArr, 0, i10);
                }
                Iterator<Message> it = listFeed.iterator();
                while (it.hasNext()) {
                    SelectObjectContentEvent selectObjectContentEventUnmarshalMessage = SelectObjectContentEventUnmarshaller.unmarshalMessage(it.next());
                    SelectObjectContentListener selectObjectContentListener = this.contentListener;
                    if (selectObjectContentListener != null) {
                        selectObjectContentListener.onProcess(selectObjectContentEventUnmarshalMessage);
                    }
                }
            } catch (IOException e10) {
                e10.printStackTrace();
                throw new QCloudClientException(e10);
            }
        }
    }

    public void setContentListener(SelectObjectContentListener selectObjectContentListener) {
        this.contentListener = selectObjectContentListener;
    }
}
