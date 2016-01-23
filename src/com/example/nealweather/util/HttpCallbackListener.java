package com.example.nealweather.util;

public interface HttpCallbackListener {
	void onFinish(String response);

	void onError(Exception e);
}
