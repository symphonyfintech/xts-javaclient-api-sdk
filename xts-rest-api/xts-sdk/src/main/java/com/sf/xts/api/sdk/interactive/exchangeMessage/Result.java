package com.sf.xts.api.sdk.interactive.exchangeMessage;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Result {

    @SerializedName("messageList"	)
    @Expose
    private List<MessageList> messageList;

	/**
	 * it return messageList
	 * @return List of MessageList
	 */
	public List<MessageList> getMessageList() {
		return messageList;
	}

	/**
	 * it set messageList
	 * @param messageList List of MessageList
	 */
	public void setMessageList(List<MessageList> messageList) {
		this.messageList = messageList;
	}

	@Override
	public String toString() {
		return "Result [messageList=" + messageList + "]";
	}
}
