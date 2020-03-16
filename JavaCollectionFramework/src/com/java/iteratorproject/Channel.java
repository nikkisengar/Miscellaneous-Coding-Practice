package com.java.iteratorproject;


// Pojo class
public class Channel {

	private double frequency;
	private ChannelTypeEnum TYPE;
	
	public Channel(double frequency, ChannelTypeEnum TYPE) {
		this.frequency=frequency;
		this.TYPE=TYPE;
	}

	public double getFrequency() {
		return frequency;
	}

	public ChannelTypeEnum getTYPE() {
		return TYPE;
	}

	@Override
	public String toString() {
		return "Channel [frequency=" + frequency + ", TYPE=" + TYPE + "]";
	}
}
