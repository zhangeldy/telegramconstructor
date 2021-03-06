package pro.nextbit.telegramconstructor;

import org.telegram.telegrambots.api.objects.Message;
import pro.nextbit.telegramconstructor.database.DataRec;

public class GlobalParam {

    private String inputText;
    private DataRec queryData;
    private long chatId = -1;
    private Message message = null;

    public GlobalParam() {
        this.queryData = new DataRec();
        this.chatId = -1;
    }

    public String getInputText() {
        return inputText;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    public DataRec getQueryData() {
        return queryData;
    }

    public void setQueryData(DataRec queryData) {
        this.queryData = queryData;
    }

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
