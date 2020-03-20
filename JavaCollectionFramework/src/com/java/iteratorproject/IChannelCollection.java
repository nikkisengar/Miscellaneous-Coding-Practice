package com.java.iteratorproject;

public interface IChannelCollection {
	
	public void addChannel(Channel c);
	
	public void removeChannel(Channel c);
	
	public IChannelIterator iterator(ChannelTypeEnum type);
}
