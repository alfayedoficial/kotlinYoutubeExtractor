package com.maxrave.jsevaluator;

import android.os.Handler;

import com.maxrave.jsevaluator.interfaces.HandlerWrapperInterface;

public class HandlerWrapper implements HandlerWrapperInterface {
	private final Handler mHandler;

	public HandlerWrapper() {
		mHandler = new Handler();
	}

	@Override
	public void post(Runnable r) {
		mHandler.post(r);
	}
}
