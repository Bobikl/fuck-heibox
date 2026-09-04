package com.tencent.cos.xml.model.tag.eventstreaming;

import android.util.Xml;
import androidx.core.app.o0;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SelectObjectContentEventUnmarshaller {

    public static class ContinuationEventUnmarshaller extends SelectObjectContentEventUnmarshaller {
        @Override // com.tencent.cos.xml.model.tag.eventstreaming.SelectObjectContentEventUnmarshaller
        public SelectObjectContentEvent.ContinuationEvent unmarshal(Message message) {
            return new SelectObjectContentEvent.ContinuationEvent();
        }
    }

    public static class EndEventUnmarshaller extends SelectObjectContentEventUnmarshaller {
        @Override // com.tencent.cos.xml.model.tag.eventstreaming.SelectObjectContentEventUnmarshaller
        public SelectObjectContentEvent.EndEvent unmarshal(Message message) {
            return new SelectObjectContentEvent.EndEvent();
        }
    }

    public static class ProgressEventUnmarshaller extends SelectObjectContentEventUnmarshaller {
        @Override // com.tencent.cos.xml.model.tag.eventstreaming.SelectObjectContentEventUnmarshaller
        public SelectObjectContentEvent.ProgressEvent unmarshal(Message message) throws Exception {
            return new SelectObjectContentEvent.ProgressEvent().withDetails(SelectObjectContentEventUnmarshaller.parsePayloadProgress(message));
        }
    }

    public static class RecordsEventUnmarshaller extends SelectObjectContentEventUnmarshaller {
        @Override // com.tencent.cos.xml.model.tag.eventstreaming.SelectObjectContentEventUnmarshaller
        public SelectObjectContentEvent.RecordsEvent unmarshal(Message message) {
            return new SelectObjectContentEvent.RecordsEvent().withPayload(ByteBuffer.wrap(message.getPayload()));
        }
    }

    public static class StatsEventUnmarshaller extends SelectObjectContentEventUnmarshaller {
        @Override // com.tencent.cos.xml.model.tag.eventstreaming.SelectObjectContentEventUnmarshaller
        public SelectObjectContentEvent.StatsEvent unmarshal(Message message) throws Exception {
            return new SelectObjectContentEvent.StatsEvent().withDetails(SelectObjectContentEventUnmarshaller.parsePayloadStats(message));
        }
    }

    public static class UnknownEventUnmarshaller extends SelectObjectContentEventUnmarshaller {
        @Override // com.tencent.cos.xml.model.tag.eventstreaming.SelectObjectContentEventUnmarshaller
        public SelectObjectContentEvent unmarshal(Message message) {
            return new SelectObjectContentEvent();
        }
    }

    public static SelectObjectContentEventUnmarshaller forEventType(String str) {
        if ("Records".equals(str)) {
            return new RecordsEventUnmarshaller();
        }
        if ("Stats".equals(str)) {
            return new StatsEventUnmarshaller();
        }
        if ("Progress".equals(str)) {
            return new ProgressEventUnmarshaller();
        }
        if ("Cont".equals(str)) {
            return new ContinuationEventUnmarshaller();
        }
        return "End".equals(str) ? new EndEventUnmarshaller() : new UnknownEventUnmarshaller();
    }

    private static String getStringHeader(Message message, String str) throws CosXmlServiceException {
        HeaderValue headerValue = message.getHeaders().get(str);
        if (headerValue == null) {
            throw new CosXmlServiceException("Unexpected lack of '" + str + "' header from service.");
        }
        if (headerValue.getType() == HeaderType.STRING) {
            return headerValue.getString();
        }
        throw new CosXmlServiceException("Unexpected non-string '" + str + "' header: " + headerValue.getType());
    }

    private static long[] parsePayloadBytesProgress(Message message) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(message.getPayload()), "UTF-8");
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
            if (eventType == 2) {
                String name = xmlPullParserNewPullParser.getName();
                if (name.equalsIgnoreCase("BytesScanned")) {
                    xmlPullParserNewPullParser.next();
                    j10 = Long.parseLong(xmlPullParserNewPullParser.getText());
                } else if (name.equalsIgnoreCase("BytesProcessed")) {
                    xmlPullParserNewPullParser.next();
                    j11 = Long.parseLong(xmlPullParserNewPullParser.getText());
                } else if (name.equalsIgnoreCase("BytesReturned")) {
                    xmlPullParserNewPullParser.next();
                    j12 = Long.parseLong(xmlPullParserNewPullParser.getText());
                }
            }
        }
        return new long[]{j10, j11, j12};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Progress parsePayloadProgress(Message message) throws XmlPullParserException, IOException {
        long[] payloadBytesProgress = parsePayloadBytesProgress(message);
        return new Progress(Long.valueOf(payloadBytesProgress[0]), Long.valueOf(payloadBytesProgress[1]), Long.valueOf(payloadBytesProgress[2]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Stats parsePayloadStats(Message message) throws XmlPullParserException, IOException {
        long[] payloadBytesProgress = parsePayloadBytesProgress(message);
        return new Stats(Long.valueOf(payloadBytesProgress[0]), Long.valueOf(payloadBytesProgress[1]), Long.valueOf(payloadBytesProgress[2]));
    }

    private static CosXmlServiceException unmarshalErrorMessage(Message message) throws CosXmlServiceException {
        String stringHeader = getStringHeader(message, ":error-code");
        String stringHeader2 = getStringHeader(message, ":error-message");
        SelectObjectContentEventException selectObjectContentEventException = new SelectObjectContentEventException("S3 returned an error: " + stringHeader2 + " (" + stringHeader + ")");
        selectObjectContentEventException.setErrorCode(stringHeader);
        selectObjectContentEventException.setErrorMessage(stringHeader2);
        return new CosXmlServiceException("Select object content error event", selectObjectContentEventException);
    }

    private static SelectObjectContentEvent unmarshalEventMessage(Message message) throws CosXmlServiceException {
        String stringHeader = getStringHeader(message, ":event-type");
        try {
            return forEventType(stringHeader).unmarshal(message);
        } catch (Exception e10) {
            throw new CosXmlServiceException("Failed to read response event of type " + stringHeader, e10);
        }
    }

    public static SelectObjectContentEvent unmarshalMessage(Message message) throws CosXmlServiceException {
        String stringHeader = getStringHeader(message, ":message-type");
        if ("error".equals(stringHeader)) {
            throw unmarshalErrorMessage(message);
        }
        if (o0.I0.equals(stringHeader)) {
            return unmarshalEventMessage(message);
        }
        throw new CosXmlServiceException("Service returned unknown message type: " + stringHeader);
    }

    public abstract SelectObjectContentEvent unmarshal(Message message) throws Exception;
}
